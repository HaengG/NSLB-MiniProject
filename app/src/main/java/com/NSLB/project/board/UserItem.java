package com.NSLB.project.board;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class UserItem {
    public String username;
    public String email;

    public UserItem() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public UserItem(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
