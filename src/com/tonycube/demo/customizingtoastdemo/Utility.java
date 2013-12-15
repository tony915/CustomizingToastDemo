package com.tonycube.demo.customizingtoastdemo;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Utility {

	public static void showToast(Activity activity, String msg){
		LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast, (ViewGroup) activity.findViewById(R.id.layToast));

        TextView text = (TextView) layout.findViewById(R.id.txtToastMsg);
        text.setText(msg);

        Toast toast = new Toast(activity);
        //Center
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        //Top
        //toast.setGravity(Gravity.TOP, 0, 200);
        //Bottom
        //toast.setGravity(Gravity.BOTTOM, 0, 100);
        
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
	}
}
