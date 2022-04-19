public class ServiceEmitirBoleto implements IService{

    @Override
    public String executar() {
        return "Boleto emitido.";
    }

    @Override
    public String cancelar() {
        return "Não foi possível emitir o boleto.";
    }
}
