package com.kungfumike.springReactorExample.services;

import com.kungfumike.springReactorExample.models.Ball;

/**
 * @author mike
 * @since 6/3/14
 */
public interface BallService {

    Ball load(Long id);
    Ball save(Ball ball);
    Ball updateBallState(Ball.BallState state);
}
