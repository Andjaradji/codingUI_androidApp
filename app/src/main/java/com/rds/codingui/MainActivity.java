package com.rds.codingui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout Coding
        RelativeLayout layoutAndjar = new RelativeLayout(this);
        layoutAndjar.setBackgroundColor(Color.CYAN);

        //Button Coding
        Button tombolMerah = new Button(this);
        tombolMerah.setText("Log In");
        tombolMerah.setBackgroundColor(Color.MAGENTA);

        //Username Textbox
        EditText userName = new EditText(this);

        //Set Id of Widgets
        tombolMerah.setId(1);
        userName.setId(2);

        //Positioning Button Relative to the Layout
        RelativeLayout.LayoutParams koordinatTombol = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        koordinatTombol.addRule(RelativeLayout.CENTER_HORIZONTAL);
        koordinatTombol.addRule(RelativeLayout.CENTER_VERTICAL);

        //Positioning Username Textbox Relative to the Layout
        RelativeLayout.LayoutParams koordinatNama = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        koordinatNama.addRule(RelativeLayout.CENTER_HORIZONTAL);
        koordinatNama.addRule(RelativeLayout.ABOVE,tombolMerah.getId());
        koordinatNama.setMargins(0,0,0,35);

        Resources r = getResources();
        int pixel = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());

        userName.setWidth(pixel);
        
        //Add Widget to Layout
        layoutAndjar.addView(tombolMerah, koordinatTombol);
        layoutAndjar.addView(userName, koordinatNama);

        //Make the Layout as the display view
        setContentView(layoutAndjar);
    }
}
