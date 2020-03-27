package com.example.myapplication.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class ConnectionUtil {
    public static boolean isConnection(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo actNetworkInfo = connectivityManager.getActiveNetworkInfo();

        return actNetworkInfo !=null && actNetworkInfo.isConnectedOrConnecting();
    }
}
