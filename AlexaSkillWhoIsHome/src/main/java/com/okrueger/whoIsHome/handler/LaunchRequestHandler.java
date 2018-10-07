/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.okrueger.whoIsHome.handler;

import java.util.Optional;
import java.util.Calendar;
import java.util.TimeZone;

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
        boolean evenSide;
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT-5"));
        
        String parking;
        
        if((calendar.get(Calendar.WEEK_OF_YEAR) % 2) == 0){
            evenSide = true;
        }
        else {
            evenSide = false;
        }
        
        if(calendar.get(Calendar.DAY_OF_WEEK) == 1 && calendar.get(Calendar.HOUR_OF_DAY) < 16){
            evenSide = !evenSide;
        }
        
        if(evenSide){
            parking = "Even Side";
        }
        else {
            parking = "Odd Side";
        }
        speechText = "Park on the " + parking + " today.";
        
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Duluth Parking", speechText)
                .build();
    }
}
