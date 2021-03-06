/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team142.gg.server.services;

import com.team142.gg.server.controller.PostOffice;
import com.team142.gg.server.controller.ServerAdmin;
import com.team142.gg.server.model.Server;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author just1689
 */
@ServerEndpoint("/websocket")
public class Websocket {

    @OnOpen
    public void onOpen(Session session) {
        ServerAdmin.notifyNewConnection(session);
    }

    @OnError
    public void onError(Throwable t) {
        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, "Error at websocket:", t);
    }

    @OnMessage
    public void onMessage(Session session, String message) {
        String id = session.getId();
        PostOffice.handleIncoming(id, message);
    }

    @OnClose
    public void onClose(Session session) {
        ServerAdmin.notifyDisconnection(session);

    }

}
