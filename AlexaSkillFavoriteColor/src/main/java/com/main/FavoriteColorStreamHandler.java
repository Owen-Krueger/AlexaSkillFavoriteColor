/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.okrueger.favoriteColor.handler.CancelandStopIntentHandler;
import com.okrueger.favoriteColor.handler.DuluthAlternateParkingIntentHandler;
import com.okrueger.favoriteColor.handler.HelpIntentHandler;
import com.okrueger.favoriteColor.handler.LaunchRequestHandler;
import com.okrueger.favoriteColor.handler.SessionEndedRequestHandler;

/**
 *
 * @author owk91
 */
public class FavoriteColorStreamHandler extends SkillStreamHandler{
    
    private static Skill getSkill(){
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new DuluthAlternateParkingIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("amzn1.ask.skill.b7f86be7-8738-4785-bf2d-6b86c69696e1")
                .build();
                
    }
    
    public FavoriteColorStreamHandler() {
        super(getSkill());
    }
}
