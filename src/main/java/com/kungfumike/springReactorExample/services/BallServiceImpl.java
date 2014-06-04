package com.kungfumike.springReactorExample.services;

import com.kungfumike.springReactorExample.models.Ball;
import com.kungfumike.springReactorExample.repositories.BallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mike
 * @since 6/3/14
 */

@Service
public class BallServiceImpl implements BallService {

    @Autowired
    BallRepository ballRepository;

    @Override
    public Ball load(Long id) {
        return this.ballRepository.findOne(id);
    }

    @Override
    public Ball save(Ball ball) {
        this.ballRepository.save(ball);
        return load(ball.getId());
    }

    @Override
    public Ball updateBallState(Ball.BallState state) {
        return null;
    }
}
