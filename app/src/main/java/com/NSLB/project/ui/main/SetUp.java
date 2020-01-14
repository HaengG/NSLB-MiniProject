package com.NSLB.project.ui.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.NSLB.project.R;
import com.NSLB.project.ui.main.Set.Version;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SetUp extends AppCompatActivity implements View.OnClickListener {
    private Button btn_version;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up);
        btn_version=(Button)findViewById(R.id.btn_version);
        btn_version.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_version:
                Intent intent=new Intent(getApplicationContext(), Version.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
