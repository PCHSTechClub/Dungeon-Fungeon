package com.blogspot.darokrithia.dungeonfungeon;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Daniel Tabin on 12/10/15.
 */
public class Room {
    int myRow;          //row of the Room
    int myColumn;       //column of the Room
    int roomID;         //ID of the room; used to tell what this room has in it
    int roomState;      //state of the room; used to tell what is happening in the room (Have the monsters been killed yet / dialog).
    boolean isFight;    //Does the room have a fight?
    boolean isShop;     //Does the room have a shop?

    public int getRoomState() {
        return roomState;
    }
    public int getRoomID(){
        return roomID;
    }
    public void setRoomID(int newID){
        roomID = newID;
    }

    Room(){
        roomID = 0;
    }
    Room(int c, int r, int ID){
        myColumn = c;
        myRow = r;
        roomID = ID;
        roomState = 0;
        isFight = false;
        isShop = false;
    }
    Room(int c, int r, int ID, int state){
        myColumn = c;
        myRow = r;
        roomID = ID;
        roomState = state;
        isFight = false;
        isShop = false;
    }
}
