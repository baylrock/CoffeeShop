package com.baylrock.trainingtasks.coffyshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int coffyOrder = 0;
   private  final int PRICE = 5;
    private TextView cups;
   private TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cups = (TextView) findViewById(R.id.coof_num);
        price = (TextView) findViewById(R.id.price_t);
    }


    public void inc(View view) {
        cups.setText("" + (++coffyOrder));
        setPrice(price);
    }

    public void dec(View view) {
        if (coffyOrder==0) return;
        cups.setText("" + (--coffyOrder));
        setPrice(price);
    }

    private  void setPrice(TextView view) {
        view.setText((coffyOrder*PRICE)+" $");
    }

    public void maOrder(View view) {
        Toast.makeText(getApplicationContext(),"PROFIT",Toast.LENGTH_SHORT).show();
    }
}
