package com.NSLB.project.ui.main.Set;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import com.NSLB.project.R;

public class Version extends AppCompatActivity {
    private TextView version_name,version_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_version);
        PackageInfo pInfo=null;
        try {
            pInfo=getPackageManager().getPackageInfo(
                    this.getPackageName(),0);
        }catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        int versionCode=pInfo.versionCode;
        String versionName=pInfo.versionName;

        version_code=(TextView)findViewById(R.id.version_code);
        version_code.setText("VersionCode:"+Integer.toString(versionCode));

        version_name=(TextView)findViewById(R.id.version_name);
        version_name.setText("VersionName:"+versionName);

    }
}
