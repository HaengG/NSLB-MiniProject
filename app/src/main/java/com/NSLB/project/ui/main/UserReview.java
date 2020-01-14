package com.NSLB.project.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.NSLB.project.R;
import com.NSLB.project.board.MyBoardActivity;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class UserReview extends MyBoardActivity {

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
