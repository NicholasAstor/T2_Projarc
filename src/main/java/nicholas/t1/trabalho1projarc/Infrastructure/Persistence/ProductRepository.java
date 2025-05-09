package nicholas.t1.trabalho1projarc.Infrastructure.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
  
} 
