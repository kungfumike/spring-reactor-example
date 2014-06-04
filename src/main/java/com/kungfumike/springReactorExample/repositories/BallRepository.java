package com.kungfumike.springReactorExample.repositories;

import com.kungfumike.springReactorExample.models.Ball;
import org.springframework.data.repository.CrudRepository;

/**
 * @author mike
 * @since 6/3/14
 */
public interface BallRepository extends CrudRepository<Ball, Long> {
}
