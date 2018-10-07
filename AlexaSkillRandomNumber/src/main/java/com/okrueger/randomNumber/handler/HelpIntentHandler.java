/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okrueger.randomNumber.handler;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import static com.amazon.ask.request.Predicates.intentName;
import com.amazon.ask.model.Response;

/**
 *
 * @author owk91
 */
public class HelpIntentHandler implements RequestHandler{
    
public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

public Optional<Response> handle(HandlerInput input) {
        String speechText = "Ask me to flip a coin, roll a dice or pick a random number!";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Random Number", speechText)
                .withReprompt(speechText)
                .build();
    }
}
