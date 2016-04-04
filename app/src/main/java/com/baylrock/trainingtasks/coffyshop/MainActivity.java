package com.baylrock.trainingtasks.coffyshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int coffyOrder = 0;
   private  final int BASIC_PRICE = 5;
    private int priceAdds = 0;
    private TextView cups;
   private TextView price;
    private int currentDeposit = 0;

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
        view.setText((currentDeposit= coffyOrder*(BASIC_PRICE+priceAdds))+" $");
    }

    public void maOrder(View view) {
        if (currentDeposit==0) return;
        Toast.makeText(getApplicationContext(),"Give me YOUR " + currentDeposit + " BUCKS NIGA!!!",Toast.LENGTH_SHORT).show();
    }

    public void creamCheck(View view) {
        CheckBox isCream = (CheckBox) view;
        if (isCream.isChecked()) {
           priceAdds = 2;
        } else {
            priceAdds = 0;
        }
        setPrice(price);
    }
}
