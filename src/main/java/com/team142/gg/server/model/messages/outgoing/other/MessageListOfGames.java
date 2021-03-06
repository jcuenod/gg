/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team142.gg.server.model.messages.outgoing.other;

import com.team142.gg.server.model.messages.base.ConversationType;
import com.team142.gg.server.model.messages.base.Message;
import java.util.ArrayList;
import lombok.Getter;

/**
 *
 * @author just1689
 */
public class MessageListOfGames extends Message {

    @Getter
    private final ArrayList<MessageGameSummary> GAMES;

    public MessageListOfGames() {
        this.GAMES = new ArrayList<>();
        setConversation(ConversationType.S_LIST_OF_GAMES.name());
    }

}
