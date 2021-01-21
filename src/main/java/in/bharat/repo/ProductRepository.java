package in.bharat.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.bharat.model.Product;
import org.springframework.stereotype.Repository;
/**
 * Bharat patel
 */
@Repository
public interface ProductRepository
	extends JpaRepository<Product, Integer>
{

}
