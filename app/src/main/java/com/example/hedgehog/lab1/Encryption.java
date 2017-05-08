package com.example.hedgehog.lab1;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by hedgehog on 07.05.17.
 */

public class Encryption {

    private String incomingMessage;
    private char[] charsArray;
    private String outgoingMessage;

    public char[] getCharsArray() {
        return charsArray;
    }

    public void setCharsArray(char[] charsArray) {
        this.charsArray = charsArray;
    }

    public String getIncomingMessage() {
        return incomingMessage;
    }

    public String getOutgoingMessage() {
        return outgoingMessage;
    }

    public void setOutgoingMessage(String outgoingMessage) {
        this.outgoingMessage = outgoingMessage;
    }

    public Encryption(String incomingMessage) {
        this.incomingMessage = incomingMessage;
    }

    public void messageToCharArray(String incomingMessage) {
        setCharsArray(incomingMessage.toCharArray());
    }

    public void createEncryptedMessage(char[] chars) {
        String message = "";
        for (char c : chars) {
            if (c == ' ') {
                message += '§';
            } else {
                message += (char) (Character.valueOf(c).charValue() + 1);
            }
        }
        setOutgoingMessage(message);
    }

}
