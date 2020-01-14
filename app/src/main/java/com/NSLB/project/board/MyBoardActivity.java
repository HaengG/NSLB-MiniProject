package com.NSLB.project.board;

import com.NSLB.project.ui.main.BoardAppcompat;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class MyBoardActivity extends BoardAppcompat {

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        return databaseReference.child("user-posts")
                .child(getUid());
    }
}
