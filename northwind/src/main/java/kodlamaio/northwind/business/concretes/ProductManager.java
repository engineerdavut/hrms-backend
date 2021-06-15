package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.DataResult;
import kodlamaio.northwind.core.utilities.Result;
import kodlamaio.northwind.core.utilities.SuccessDataResult;
import kodlamaio.northwind.core.utilities.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

//Business katmanı servis katmanı olduğunu belirtiyoz.
@Service
public class ProductManager implements ProductService{
	
	private ProductDao productDao;

	@Autowired
	// autowired arkada instenca olması için class oluşturuyor. cünkü jparepository
	//jparepo.. interface. bağımlıllık yaratıyor ama kullanımı fazla. tek instence oluşturuyor. 
	//autofac c# daki hali gibi ama o solide daha uygun.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"data listelendi.");
	}

	@Override
	public Result add(Product product) {
		// TODO Auto-generated method stub
		this.productDao.save(product);
		return new SuccessResult("ürün eklendi");
	}

}
