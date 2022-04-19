public class ServiceEnviarResultado implements IService{

    @Override
    public String executar() {
        return "Resultado enviado.";
    }

    @Override
    public String cancelar() {
        return "Não foi possível enviar o resultado.";
    }
}
