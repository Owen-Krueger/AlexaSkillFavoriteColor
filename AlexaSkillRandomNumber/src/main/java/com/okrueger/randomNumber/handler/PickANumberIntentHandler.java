/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okrueger.randomNumber.handler;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;
import java.util.Random;

/**
 *
 * @author owk91
 */
public class PickANumberIntentHandler implements RequestHandler{
    
    public boolean canHandle(HandlerInput input){
        return input.matches(intentName("NumberBetweenTen"));
    }
    
    public Optional<Response> handle(HandlerInput input){
        String speechText;
        
        Random rand = new Random();
        int num = rand.nextInt(10) + 1;
        
        speechText = "" + num;
        
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Number 1-10", speechText)
                .build();
    }
}
