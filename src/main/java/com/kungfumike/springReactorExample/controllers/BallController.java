package com.kungfumike.springReactorExample.controllers;

import com.kungfumike.springReactorExample.models.Ball;
import com.kungfumike.springReactorExample.services.BallService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author mike
 * @since 6/3/14
 */

@RestController
public class BallController {

    @Autowired
    BallService ballService;

    private static final Logger logger = LoggerFactory.getLogger(BallController.class);

    @RequestMapping(value = "/ball", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Ball> create(@RequestBody Ball respBall) {
        respBall = ballService.save(respBall);
        return new ResponseEntity<Ball>(respBall, HttpStatus.CREATED);
    }
}
