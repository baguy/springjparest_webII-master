package com.mayra.springjparestwebII.repository;

import com.mayra.springjparestwebII.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mayra1600036
 */
public interface CoffeeRepository extends JpaRepository<Coffee, Long>{
    
}
