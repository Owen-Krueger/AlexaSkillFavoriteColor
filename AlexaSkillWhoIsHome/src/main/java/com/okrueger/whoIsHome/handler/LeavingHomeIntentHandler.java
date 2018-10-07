/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okrueger.whoIsHome.handler;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;

/**
 *
 * @author owk91
 */
public class LeavingHomeIntentHandler implements RequestHandler{
    
    public boolean canHandle(HandlerInput input){
        return input.matches(intentName("WhoIsHome"));
    }
    
    public Optional<Response> handle(HandlerInput input){
        String speechText;
        
        speechText = "SpeechText";
        
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Who Is Home", speechText)
                .build();
    }
}
