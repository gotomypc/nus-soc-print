package com.yeokm1.nussocprintandroid.core;

import android.app.AlertDialog;
import android.content.Context;

import com.yeokm1.nussocprintandroid.R;

/**
 * Created by yeokm1 on 8/12/2014.
 */
public class HelperFunctions {

    public static void showAlert(Context context, String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(context.getString(R.string.misc_ok), null);
        AlertDialog alert = builder.create();
        alert.show();
    }
}
