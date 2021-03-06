/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team142.gg.server.workers;

import com.team142.gg.server.controller.PostOffice;
import com.team142.gg.server.model.Game;
import com.team142.gg.server.model.messages.outgoing.rendered.MessageShareThingsDynamic;
import com.team142.gg.server.workers.base.AbstractTickerWorker;

/**
 *
 * @author just1689
 */
public class TickerComms extends AbstractTickerWorker {

    public TickerComms(Game game) {
        super(game);
    }

    @Override
    public void doTick() {
        PostOffice.sendPlayersAMessage(getGAME(), getDynamicThingsMessage());

    }

    private MessageShareThingsDynamic getDynamicThingsMessage() {
        return new MessageShareThingsDynamic(getGAME());
    }

}
