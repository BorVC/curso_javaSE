package texting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Calendar;
import java.util.Date;
import model.Pedidos;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.PedidosService;

class PedidosServiceTest {
	static PedidosService service = new PedidosService();
	static Calendar calendar = Calendar.getInstance();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calendar.set(2023, 11,30);
		Date f1=calendar.getTime();
		calendar.set(2022,4, 11);
		Date f2=calendar.getTime();
		calendar.set(2022,10,1);
		Date f3=calendar.getTime();		
		service.nuevoPedido(new Pedidos("coca-cola",20,f1));
		service.nuevoPedido(new Pedidos("whisky",1,f2));
		service.nuevoPedido(new Pedidos("patatas fritas",10,f3)); 
	}

	@Test
	void testPedidoReciente() {
		assertEquals("coca-cola",service.pedidoReciente().getProducto());
	}

	@Test
	void testPedidosFechas() {
		calendar.set(2022,0,1);
		Date fechaMin = calendar.getTime();
		calendar.set(2022,11,31);
		Date fechaMax = calendar.getTime();
		assertEquals(0,service.pedidosFechas(fechaMin, fechaMax).size());
	}

}
