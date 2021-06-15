package kodlamaio.northwind.business.abstracts;
import java.util.List;

import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	
	Result add(Product product);

}
