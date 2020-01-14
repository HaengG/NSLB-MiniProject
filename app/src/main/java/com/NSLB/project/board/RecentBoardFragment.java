package com.NSLB.project.board;

import com.NSLB.project.ui.main.Board;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class RecentBoardFragment extends Board {

    public RecentBoardFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        Query recentPostsQuery = databaseReference.child("posts")
                .limitToFirst(100);
        return recentPostsQuery;
    }
}
