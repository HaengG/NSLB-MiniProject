package com.NSLB.project.Google_Map;


import android.graphics.Color;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Map_Walk
{
    public double PetPark_Latitude[]= {36.138528, 36.140108, 36.142352, 36.140077, 36.145223};
    public double PetPark_Longtitude[]= {128.411402, 128.414855, 128.431644, 128.432550, 128.416205};

    public void showPlace_pet(GoogleMap mMap)
    {

        for(int i=0; i<5; i++)
        {

            LatLng mPostion = new LatLng(PetPark_Latitude[i],PetPark_Longtitude[i]);
            MarkerOptions mMarker = new MarkerOptions()
                    .icon(BitmapDescriptorFactory.defaultMarker(200f))
                    .title("17 : 00 ~ 22 : 00")
                    .snippet("입장 가능 시간")
                    .alpha(0.5f)
                    .position(mPostion);

            CircleOptions cCircle = new CircleOptions().center(mPostion)
                    .radius(100)
                    .strokeWidth(0f)
                    .fillColor(Color.parseColor("#880000ff"));
            mMap.addMarker(mMarker);
            mMap.addCircle(cCircle);
        }
    }

}
