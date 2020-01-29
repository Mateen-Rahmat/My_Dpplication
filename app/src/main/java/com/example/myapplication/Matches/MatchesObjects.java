package com.example.myapplication.Matches;

public class MatchesObjects {

    private String userId;
    private String Name;
    private String ProfileImageUrl;

    public MatchesObjects (String userId, String Name, String ProfileImageUrl){
        this.userId = userId;
        this.Name = Name;
        this.ProfileImageUrl = ProfileImageUrl;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;

    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProfileImageUrl() {
        return ProfileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        ProfileImageUrl = profileImageUrl;
    }
}
