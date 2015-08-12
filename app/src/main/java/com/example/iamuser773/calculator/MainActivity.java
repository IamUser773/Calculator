package com.example.iamuser773.calculator;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Toolbar toolbar;
    TextView display;
    Button one, two, three, four, five, six, seven, eight, nine, zero, cler, equals, multiplied,
            divided, minus, plus;
    float num1, num2;

    boolean pl = false;
    boolean mu = false;
    boolean dv = false;
    boolean mul = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);


        //จับคู้Id
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        cler = (Button) findViewById(R.id.clear);
        equals = (Button) findViewById(R.id.equals);
        multiplied = (Button) findViewById(R.id.multiplied);
        divided = (Button) findViewById(R.id.divided);
        minus = (Button) findViewById(R.id.minus);
        plus = (Button) findViewById(R.id.plus);

        display = (TextView) findViewById(R.id.display);
        display.setText("");


        //กำหนดevent

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        cler.setOnClickListener(this);
        equals.setOnClickListener(this);
        multiplied.setOnClickListener(this);
        divided.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.one) {
            display.append(one.getText().toString());
        } else if (v.getId() == R.id.two) {
            display.append(two.getText().toString());
        } else if (v.getId() == R.id.three) {
            display.append(three.getText().toString());
        } else if (v.getId() == R.id.four) {
            display.append(four.getText().toString());
        } else if (v.getId() == R.id.five) {
            display.append(five.getText().toString());
        } else if (v.getId() == R.id.six) {
            display.append(six.getText().toString());
        } else if (v.getId() == R.id.seven) {
            display.append(seven.getText().toString());
        } else if (v.getId() == R.id.eight) {
            display.append(eight.getText().toString());
        } else if (v.getId() == R.id.nine) {
            display.append(nine.getText().toString());
        } else if (v.getId() == R.id.zero) {
            display.append(zero.getText().toString());
        } else if (v.getId() == R.id.clear) {
            num1 = 0;
            num2 = 0;
            display.setText("");
        }


        if (v.getId() == R.id.plus) {
            if (display.length() > 0) {
                num1 = Float.parseFloat(display.getText().toString());
                Toast.makeText(this, "num1 = " + num1, Toast.LENGTH_SHORT).show();
                display.setText("");
                pl = true;

            }
        }
        if (v.getId() == R.id.minus) {
            if (display.length() > 0) {
                num1 = Float.parseFloat(display.getText().toString());
                Toast.makeText(this, "num1 = " + num1, Toast.LENGTH_SHORT).show();
                display.setText("");
                mu = true;

            }
        }
        if (v.getId() == R.id.multiplied) {
            if (display.length() > 0) {
                num1 = Float.parseFloat(display.getText().toString());
                Toast.makeText(this, "num1 = " + num1, Toast.LENGTH_SHORT).show();
                display.setText("");
                mul = true;

            }
        }
        if (v.getId() == R.id.divided) {
            if (display.length() > 0) {
                num1 = Float.parseFloat(display.getText().toString());
                Toast.makeText(this, "num1 = " + num1, Toast.LENGTH_SHORT).show();
                display.setText("");
                dv = true;

            }
        }

        if (v.getId() == R.id.equals) {
            if (pl && display.length() != 0) {
                num2 = Float.parseFloat(display.getText().toString());
                double result = num1 + num2;
                display.setText("" + result);
                pl = false;
            } else if (mu && display.length() != 0) {
                num2 = Float.parseFloat(display.getText().toString());
                double result = num1 - num2;
                display.setText("" + result);
                mu = false;
            } else if (mul && display.length() != 0) {
                num2 = Float.parseFloat(display.getText().toString());
                double result = num1 * num2;
                display.setText("" + result);
                mul = false;
            } else if (dv && display.length() != 0) {
                num2 = Float.parseFloat(display.getText().toString());
                double result = num1 / num2;
                display.setText("" + result);
                dv = false;

            }
        }


    }

}










