package example.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
