package com.baylrock.trainingtasks.coffyshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int coffyOrder = 0;
   private  final int PRICE = 5;
    private TextView cups;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cups = (TextView) findViewById(R.id.coof_num);
    }


    public void inc(View view) {
        cups.setText("" + (++coffyOrder));
    }

    public void dec(View view) {
        cups.setText("" + (--coffyOrder));
    }

    public void setPrice(View view) {
        TextView price = (TextView) findViewById(R.id.price_t);
        price.setText("" + (coffyOrder*PRICE));
    }
}
