package co.edu.uniajc.Test;
import java.util.List;

import javax.faces.model.SelectItem;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.edu.uniajc.model.Banco;
import co.edu.uniajc.service.BancoService;

public class BancoServiceTest {

	private List<Banco> ListBanco;

	@Autowired
	private BancoService bancoService;

	private List<SelectItem> SelectItemListBanco;

	@Test
	public void test() {

		//		this.SelectItemListBanco = new ArrayList<SelectItem>();
		//		
		//		Session session = HibernateUtil.getSessionFactory().openSession();
		//		
		//		bancoService = new BancoServiceImpl(session);
		//		bancoService.starSession(session);
		//		ListBanco = null;
		//		ListBanco = bancoService.listaBanco();
		//		bancoService.closeSession();
		//		
		//		SelectItemListBanco.clear();
		//		
		//		for (Banco banco : ListBanco) {
		//
		//			SelectItem selectItem = new SelectItem(1, "Prueba" , "Prueba");
		//			this.SelectItemListBanco.add(selectItem);
		//
		//		}
		//		
		//		System.out.print(SelectItemListBanco);
		//
		//	}
	}
}
