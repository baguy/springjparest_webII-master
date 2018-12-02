package com.mayra.springjparestwebII.repository;

/**
 *
 * @author Mayra1600036
 */

import com.mayra.springjparestwebII.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CatRepository extends JpaRepository<Cat, Long>{
    
    
    
}
