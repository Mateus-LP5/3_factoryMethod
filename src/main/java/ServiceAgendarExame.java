public class ServiceAgendarExame implements IService{

    @Override
    public String executar() {
        return "Exame agendado.";
    }

    @Override
    public String cancelar() {
        return "Não foi possível agendar o exame.";
    }
}
