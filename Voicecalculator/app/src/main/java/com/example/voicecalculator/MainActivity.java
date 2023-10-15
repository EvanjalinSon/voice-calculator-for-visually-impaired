package com.example.voicecalculator;

import android.R.color;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    TextView disp, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        disp = (TextView) findViewById(R.id.textView1);
        res = (TextView) findViewById(R.id.textView2);
        Button add = (Button) findViewById(R.id.add);
        Button mul = (Button) findViewById(R.id.mul);
        Button divide = (Button) findViewById(R.id.divide);
        Button sub = (Button) findViewById(R.id.sub);
        Button log = (Button) findViewById(R.id.log);
        Button clear = (Button) findViewById(R.id.clear);
        Button calc = (Button) findViewById(R.id.calculate);
        Button change = (Button) findViewById(R.id.color);

        add.setOnClickListener(this);
        mul.setOnClickListener(this);
        divide.setOnClickListener(this);
        sub.setOnClickListener(this);
        log.setOnClickListener(this);
        clear.setOnClickListener(this);
        calc.setOnClickListener(this);
        change.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        float result = 0, num1, num2;
        Toast var;
        switch (v.getId()) {
            case R.id.add:
                String str =(String) disp.getText();
                num1 = Integer.parseInt(str);
                disp.setText("");
                var = Toast.makeText(MainActivity.this, "Enter other number",
                        Toast.LENGTH_SHORT);
                var.show();
                str=(String) disp.getText();
                num2 = Integer.parseInt(str);
                result = num1 + num2;
                break;

            case R.id.sub:
                num1 = Integer.parseInt((String) disp.getText());
                disp.setText("");
                var = Toast.makeText(MainActivity.this, "Enter other number",
                        Toast.LENGTH_SHORT);
                var.show();
                num2 = Integer.parseInt((String) disp.getText());
                result = num1 - num2;
                break;
            case R.id.mul:
                num1 = Integer.parseInt((String) disp.getText());
                disp.setText("");
                var = Toast.makeText(MainActivity.this, "Enter other number",
                        Toast.LENGTH_SHORT);
                var.show();
                num2 = Integer.parseInt((String) disp.getText());
                result = num1 * num2;
                break;
            case R.id.divide:
                num1 = Integer.parseInt((String) disp.getText());
                disp.setText("");
                var = Toast.makeText(MainActivity.this, "Enter other number",
                        Toast.LENGTH_SHORT);
                var.show();
                num2 = Integer.parseInt((String) disp.getText());
                result = num1 / num2;
                break;
            case R.id.log:
                num1 = Integer.parseInt((String) disp.getText());
                result = (float) Math.log(num1);
                break;
            case R.id.clear:
                disp.setText("");
                res.setText("");
                break;
            case R.id.color:
                int rand = (int) ((Math.random() * 10) % 3);
                Button b1 = (Button) findViewById(R.id.add);
                Button b2 = (Button) findViewById(R.id.mul);
                Button b3 = (Button) findViewById(R.id.divide);
                Button b4 = (Button) findViewById(R.id.sub);
                Button b5 = (Button) findViewById(R.id.log);
                Button b6 = (Button) findViewById(R.id.clear);
                Button b7 = (Button) findViewById(R.id.calculate);
                Button b8 = (Button) findViewById(R.id.color);

                rand =2;
                switch (rand) {
                    case 0:
                        b1.setTextColor(color.holo_blue_bright);
                        b2.setTextColor(color.holo_blue_bright);
                        b3.setTextColor(color.holo_blue_bright);
                        b4.setTextColor(color.holo_blue_bright);
                        b5.setTextColor(color.holo_blue_bright);
                        b6.setTextColor(color.holo_blue_bright);
                        b7.setTextColor(color.holo_blue_bright);
                        b8.setTextColor(color.holo_blue_bright);
                        break;
                    case 1:
                        b1.setTextColor(color.holo_green_dark);
                        b2.setTextColor(color.holo_green_dark);
                        b3.setTextColor(color.holo_green_dark);
                        b4.setTextColor(color.holo_green_dark);
                        b5.setTextColor(color.holo_green_dark);
                        b6.setTextColor(color.holo_green_dark);
                        b7.setTextColor(color.holo_green_dark);
                        b8.setTextColor(color.holo_green_dark);
                        break;
                    case 2:
                        b1.setTextColor(color.holo_red_dark);
                        b2.setTextColor(color.holo_red_dark);
                        b3.setTextColor(color.holo_red_dark);
                        b4.setTextColor(color.holo_red_dark);
                        b5.setTextColor(color.holo_red_dark);
                        b6.setTextColor(color.holo_red_dark);
                        b7.setTextColor(color.holo_red_dark);
                        b8.setTextColor(color.holo_red_dark);
                        break;

                    default:
                        b1.setTextColor(color.black);
                        b2.setTextColor(color.black);
                        b3.setTextColor(color.black);
                        b4.setTextColor(color.black);
                        b5.setTextColor(color.black);
                        b6.setTextColor(color.black);
                        b7.setTextColor(color.black);
                        b8.setTextColor(color.black);
                        break;
                }

                break;
            case R.id.calculate:
                res.setText(Float.toString(result));
                break;
        }
    }

}