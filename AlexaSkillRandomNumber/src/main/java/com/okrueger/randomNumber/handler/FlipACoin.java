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
public class FlipACoin implements RequestHandler{
    
    public boolean canHandle(HandlerInput input){
        return input.matches(intentName("FlipACoin"));
    }
    
    public Optional<Response> handle(HandlerInput input){
        String speechText;
        
        Random rand = new Random();
        int coin = rand.nextInt(1);
        
        if(coin == 0){
            speechText = "Heads";
        }
        else {
            speechText = "Tails";
        }
        
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Coin Flip", speechText)
                .build();
    }
}
