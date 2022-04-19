import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IService servico = ServiceFactory.obterService("DisponibilizarDesconto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IService servico = ServiceFactory.obterService("MarcarConsulta");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }

}