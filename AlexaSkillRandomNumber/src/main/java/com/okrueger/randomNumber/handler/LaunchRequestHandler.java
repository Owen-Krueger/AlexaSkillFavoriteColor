/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okrueger.randomNumber.handler;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.requestType;
/**
 *
 * @author owk91
 */
public class LaunchRequestHandler implements RequestHandler{
    
public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }
public Optional<Response> handle(HandlerInput input) {
        String speechText;
        speechText = "Do you want a dice roll, a coin flip or a random number?";
        
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Dice Roll, Coin flip, or Random Number", speechText)
                .build();
    }
}
