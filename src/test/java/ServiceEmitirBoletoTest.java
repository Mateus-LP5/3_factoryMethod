import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceEmitirBoletoTest {

    @Test
    void deveExecutarEmitirBoleto() {
        IService service = ServiceFactory.obterService("EmitirBoleto");
        assertEquals("Boleto emitido.", service.executar());
    }

    @Test
    void deveFalharEmitirBoleto() {
        IService service = ServiceFactory.obterService("EmitirBoleto");
        assertEquals("Não foi possível emitir o boleto.", service.cancelar());
    }

}