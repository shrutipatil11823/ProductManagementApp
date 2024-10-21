package ProductApp.ProductApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import ProductApp.ProductApp.Entity.Category;
import ProductApp.ProductApp.Entity.Product;
import ProductApp.ProductApp.Repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Page<Category> getAllCategories(int page, int size) {
        return categoryRepository.findAll(PageRequest.of(page, size));
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    public Category updateCategory(Long id, Category category) {
        category.setId(id);
        return categoryRepository.save(category);
    }

    public boolean deleteCategory(Long id) {
    	Optional<Category> category = categoryRepository.findById(id);
 	   
    	 if (category.isPresent()) 
    	 {
    		 categoryRepository.deleteById(id);
             return true;  
         } else {     
             return false;  
         }
   	 
        
    }
}
