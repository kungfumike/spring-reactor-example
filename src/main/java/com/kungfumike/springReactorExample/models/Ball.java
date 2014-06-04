package com.kungfumike.springReactorExample.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author mike
 * @since 6/3/14
 */
@Entity
public class Ball implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static enum BallState {ONRACK, ROLLING, RETURNING, STUCK}

    @Column(nullable = false)
    private BallState startingState = BallState.ONRACK;

    public Long getId() {
        return id;
    }

    public BallState getStartingState() {
        return startingState;
    }
}
