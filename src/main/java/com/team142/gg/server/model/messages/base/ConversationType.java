/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team142.gg.server.model.messages.base;

/**
 *
 * @author just1689
 */
public enum ConversationType {

    //FROM THE client app
    P_REQUEST_JOIN_SERVER
    , P_REQUEST_LIST_GAMES
    , P_REQUEST_JOIN_GAME 
    , P_KD
    , P_KU
    
    //From the server to the client
    , S_LIST_OF_GAMES
    , S_CHANGE_VIEW
    , S_SCOREBOARD
    , S_SHARE_MAP
    , S_SHARE_STATIC_THINGS
    , S_SHARE_DYNAMIC_THINGS
    , S_SHARE_TAG
    , S_PLAYER_LEFT
    

}
