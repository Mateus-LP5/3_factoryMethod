import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceEnviarResultadoTest {

    @Test
    void deveExecutarEnviarResultado() {
        IService service = ServiceFactory.obterService("EnviarResultado");
        assertEquals("Resultado enviado.", service.executar());
    }

    @Test
    void deveFalharEnviarResultado() {
        IService service = ServiceFactory.obterService("EnviarResultado");
        assertEquals("Não foi possível enviar o resultado.", service.cancelar());
    }

}