package com.NSLB.project.ui.main;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class UserReview extends BoardAppcompat {

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_review);
    }*/

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        return databaseReference.child("user-posts")
                .child(getUid());
    }
}
