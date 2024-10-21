package ProductApp.ProductApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProductApp.ProductApp.Entity.Category;	

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

