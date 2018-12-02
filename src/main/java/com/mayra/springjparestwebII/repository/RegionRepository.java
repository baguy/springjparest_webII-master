package com.mayra.springjparestwebII.repository;

import com.mayra.springjparestwebII.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mayra1600036
 */
public interface RegionRepository extends JpaRepository<Region, Long> {

}
