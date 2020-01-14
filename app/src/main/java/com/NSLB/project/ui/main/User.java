package com.NSLB.project.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.NSLB.project.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class User extends Fragment implements View.OnClickListener {
    private ImageButton setup_btn;
    private Button user_comment,user_review;
    private FirebaseAuth mAuth;
    private TextView user_id;
    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container ,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_user , container , false);
        setup_btn=(ImageButton)view.findViewById(R.id.setup_btn);
        user_review=(Button)view.findViewById(R.id.user_review);
        user_review.setOnClickListener(this);
        user_comment=(Button)view.findViewById(R.id.user_comment);
        user_comment.setOnClickListener(this);
        setup_btn.setOnClickListener(this);
        user_id=(TextView)view.findViewById(R.id.user_id);
        mAuth= FirebaseAuth.getInstance();
        final FirebaseUser user=mAuth.getCurrentUser();
        //user_id.setText(user.getEmail());
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setup_btn:
                Intent intent=new Intent(getActivity(), SetUp.class);
                startActivity(intent);
                break;
            case R.id.user_comment:
                Intent intent1=new Intent(getActivity(),UserComment.class);
                startActivity(intent1);
                break;
            case R.id.user_review:
                Intent intent2=new Intent(getActivity(),UserReview.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}