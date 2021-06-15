package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;
//Integer primary key data tipi.
// entityframeworkrepositorybase yazılmış hali gibi. jpa repository.
public interface ProductDao extends JpaRepository<Product,Integer>{

}
