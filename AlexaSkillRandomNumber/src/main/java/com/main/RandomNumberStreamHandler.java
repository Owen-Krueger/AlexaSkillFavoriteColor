/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.okrueger.randomNumber.handler.CancelandStopIntentHandler;
import com.okrueger.randomNumber.handler.FlipACoin;
import com.okrueger.randomNumber.handler.HelpIntentHandler;
import com.okrueger.randomNumber.handler.LaunchRequestHandler;
import com.okrueger.randomNumber.handler.SessionEndedRequestHandler;

/**
 *
 * @author owk91
 */
public class RandomNumberStreamHandler extends SkillStreamHandler{
    
    private static Skill getSkill(){
        return Skills.standard()
                .addRequestHandlers(new CancelandStopIntentHandler(),
                        new FlipACoin(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("amzn1.ask.skill.a8ac955d-9351-4a2a-8878-1380fe5af351")
                .build();
                
    }
    
    public RandomNumberStreamHandler() {
        super(getSkill());
    }
}
