import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceAgendarExameTest {

    @Test
    void deveExecutarAgendarExame() {
        IService service = ServiceFactory.obterService("AgendarExame");
        assertEquals("Exame agendado.", service.executar());
    }

    @Test
    void deveFalharAgendarExame() {
        IService service = ServiceFactory.obterService("AgendarExame");
        assertEquals("Não foi possível agendar o exame.", service.cancelar());
    }

}