package com.example.myapplication.Cards;

public class Cards {

    private String userId;
    private String name;
    private String ProfileImageUrl;

    public Cards (String userId, String name, String profileImageUrl){
        this.userId = userId;
        this.name = name;
        this.ProfileImageUrl = profileImageUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImageUrl() {
        return ProfileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.ProfileImageUrl = profileImageUrl;
    }
}
