package br.com.estudos

import com.google.protobuf.Any
import com.google.rpc.Code
import com.google.rpc.StatusProto
import io.grpc.Status
import io.grpc.stub.StreamObserver
import org.slf4j.LoggerFactory
import java.lang.Exception
import java.lang.IllegalStateException
import javax.inject.Singleton
import kotlin.random.Random

@Singleton
class FretesGRPCServer: FretesServiceGrpc.FretesServiceImplBase() {

    private val logger = LoggerFactory.getLogger(FretesGRPCServer::class.java)
    override fun calculaFrete(request: CalculaFreteRequest?, responseObserver: StreamObserver<CalculaFreteResponse>?) {
        logger.info("Calculando frete para request.")

        val cep = request?.cep

        if(cep == null || cep.isBlank()){
            val e = Status.INVALID_ARGUMENT
                .withDescription("O cep deve ser informado")
                .asRuntimeException()

            responseObserver?.onError(e)
        }

        if (!cep!!.matches("[0-9]{5}-[0-9]{3}".toRegex())){
            val e = Status.INVALID_ARGUMENT
                .withDescription("O cep deve ser informado")
                .augmentDescription("formato deve seguir o padrao: 99999-999")
                .asRuntimeException()

            responseObserver?.onError(e)
        }

        //simular um erro de verificação de segurança
        if (cep.endsWith("333")){
            val statusProto = com.google.rpc.Status.newBuilder()
                .setCode(Code.PERMISSION_DENIED.number)
                .setMessage("usuario nao pode acessar esse recurso")
                .addDetails(Any.pack(ErrorDetails.newBuilder()
                    .setCode(401)
                    .setMessage("token expirado")
                    .build()))
                .build()

            val e = io.grpc.protobuf.StatusProto.toStatusRuntimeException(statusProto)
            responseObserver?.onError(e)
        }

        var valor = 0.0

        try {
            valor = Random.nextDouble(from = 0.0, until = 150.00)
            if(valor > 100) {throw IllegalStateException("Erro inesperado ao executar lógica de negócio")}
        }catch (e: Exception){
            responseObserver?.onError(Status.INTERNAL
                .withDescription(e.message)
                .withCause(e) // anexado ao status, mas não enviado ao Client
                .asRuntimeException())
        }

        val response = CalculaFreteResponse.newBuilder()
            .setCep(request!!.cep)
            .setValorFrete(valor)
            .build()

        logger.info("Frete calculado: $response")

        responseObserver!!.onNext(response)
        responseObserver.onCompleted()
    }


}