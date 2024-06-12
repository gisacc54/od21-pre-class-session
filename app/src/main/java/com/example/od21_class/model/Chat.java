package com.example.od21_class.model;

public class Chat {
    private int senderId;
    private String senderName;
    private String senderMessage;
    private int senderProfile;

    public Chat(int senderId, String senderName, String senderMessage, int senderProfile) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.senderMessage = senderMessage;
        this.senderProfile = senderProfile;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderMessage() {
        return senderMessage;
    }

    public void setSenderMessage(String senderMessage) {
        this.senderMessage = senderMessage;
    }

    public int getSenderProfile() {
        return senderProfile;
    }

    public void setSenderProfile(int senderProfile) {
        this.senderProfile = senderProfile;
    }
}
