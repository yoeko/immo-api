package api.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import api.dao.CategoryDao;
import api.dao.ICategoryDao;
import api.domain.Category;

@Path("/category")
public class CaterogoryWebService {
	
//	private ICategoryDao dao = new CategoryDao();
	private CategoryDao dao = new CategoryDao();
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Category> getAll() {
		return dao.getAll();
	}

}
