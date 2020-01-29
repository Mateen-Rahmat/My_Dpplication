package com.example.myapplication.Chats;

public class ChatObjects {

    private String message;
    private boolean currentUser;

    public ChatObjects(String message, boolean currentUser) {

        this.message = message;
        this.currentUser = currentUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(boolean currentUser) {
        this.currentUser = currentUser;
    }

}
