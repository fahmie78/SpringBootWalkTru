package my.com.prasarana.SpringBootWalkTru.repository;

import my.com.prasarana.SpringBootWalkTru.dao.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

}
