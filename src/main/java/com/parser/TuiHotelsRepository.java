package com.parser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tadasyan
 */
@Repository()
public interface TuiHotelsRepository extends JpaRepository<TuiHotel, Integer> {

}
