package by.beltel.klim.first_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.StringBuilder;

public class MainActivity extends AppCompatActivity {

    private static final String KEY_INDEX_1 = "stringEnter";
    private static final String KEY_INDEX_2 = "action";
    private static final String KEY_INDEX_3 = "longFirst";
    private static final String KEY_INDEX_4 = "lengthText";
    private static final String KEY_INDEX_5 = "t";
    private static final String KEY_INDEX_6 = "tt";
    private Button mButton_1;
    private Button mButton_2;
    private Button mButton_3;
    private Button mButton_4;
    private Button mButton_5;
    private Button mButton_6;
    private Button mButton_7;
    private Button mButton_8;
    private Button mButton_9;
    private Button mButton_0;
    private Button mButton_res;
    private Button mButton_plus;
    private Button mButton_minus;
    private Button mButton_multiply;
    private Button mButton_divide;
    private Button mButton_reset;
    private Button mButton_square;
    private Button mButton_square_root;
    private TextView mDisplayText;
    private TextView mResultText;
    private StringBuilder stringEnter;
    private long longFirst;
    private long longSecond;
    private String action;
    private int lengthText;
    private long t = 0l;
    private double tt = 0.0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        stringEnter = new StringBuilder();
        action = "";
        longFirst = 0l;
        longSecond = 0l;
        lengthText = 0;
        mDisplayText = (TextView)findViewById(R.id.displayText);
        mResultText = (TextView)findViewById(R.id.resultText);

        if ( savedInstanceState != null){
            stringEnter.append(savedInstanceState.getCharArray(KEY_INDEX_1));
            action = new String(savedInstanceState.getCharArray(KEY_INDEX_2));
            longFirst = savedInstanceState.getLong(KEY_INDEX_3);
            lengthText = savedInstanceState.getInt(KEY_INDEX_4);
            t = savedInstanceState.getLong(KEY_INDEX_5);
            tt =savedInstanceState.getDouble(KEY_INDEX_6);
            if (t != 0){

                stringEnter.append(" = " + savedInstanceState.getLong(KEY_INDEX_5));
            }
            if (tt != 0){
                stringEnter.append(" = " + savedInstanceState.getDouble(KEY_INDEX_6));
            }
            mDisplayText.setText(stringEnter);

        }


        mButton_1 = (Button)findViewById(R.id.button_1);
        mButton_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_1.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_2 = (Button)findViewById(R.id.button_2);
        mButton_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_2.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_3 = (Button)findViewById(R.id.button_3);
        mButton_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_3.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_4 = (Button)findViewById(R.id.button_4);
        mButton_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_4.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_5 = (Button)findViewById(R.id.button_5);
        mButton_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_5.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_6 = (Button)findViewById(R.id.button_6);
        mButton_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_6.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_7 = (Button)findViewById(R.id.button_7);
        mButton_7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_7.getText());
                mDisplayText.setText(stringEnter);
            }
        });


        mButton_8 = (Button)findViewById(R.id.button_8);
        mButton_8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_8.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_9 = (Button)findViewById(R.id.button_9);
        mButton_9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_9.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_0 = (Button)findViewById(R.id.button_0);
        mButton_0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                stringEnter.append(mButton_0.getText());
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_res = (Button)findViewById(R.id.button_res);
        mButton_res.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                t = 0l;
              longSecond = Long.parseLong(new String(stringEnter.substring(lengthText, stringEnter.length())));
                switch (action){
                    case "+":
                        t = longFirst + longSecond;
                        mResultText.setText("= " + t);
                        lengthText = 0;
                        break;
                    case "-":
                        t = longFirst - longSecond;
                        mResultText.setText("= " + t);
                        lengthText = 0;
                        break;

                    case "*":
                        t = longFirst * longSecond;
                        mResultText.setText("= " + t);
                        lengthText = 0;
                        break;

                    case "/":
                        tt = (double)longFirst / (double)longSecond;
                        mResultText.setText("= " + tt);
                        lengthText = 0;
                        break;

                }
            }
        });

        mButton_plus = (Button)findViewById(R.id.button_plus);
        mButton_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                longFirst = Long.parseLong(new String(stringEnter));
                action = "+";
                stringEnter.append("+");
                lengthText = stringEnter.length();
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_minus = (Button)findViewById(R.id.button_minus);
        mButton_minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                longFirst = Long.parseLong(new String(stringEnter));
                action = "-";
                stringEnter.append("-");
                lengthText = stringEnter.length();
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_multiply = (Button)findViewById(R.id.button_multiply);
        mButton_multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                longFirst = Long.parseLong(new String(stringEnter));
                action = "*";
                stringEnter.append("*");
                lengthText = stringEnter.length();
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_divide = (Button)findViewById(R.id.button_divide);
        mButton_divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                longFirst = Long.parseLong(new String(stringEnter));
                action = "/";
                stringEnter.append("/");
                lengthText = stringEnter.length();
                mDisplayText.setText(stringEnter);
            }
        });

        mButton_reset = (Button)findViewById(R.id.button_reset);
        mButton_reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
               stringEnter.delete(0, stringEnter.length());
               mDisplayText.setText(stringEnter);
               mResultText.setText(stringEnter);
            }
        });


        mButton_square = (Button)findViewById(R.id.button_square);
        mButton_square.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                longFirst = Long.parseLong(new String(stringEnter));
                double d = Math.pow((double)longFirst, 2);
                mResultText.setText("" + d);
            }
        });


        mButton_square_root = (Button)findViewById(R.id.button_square_root);
        mButton_square_root.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View w){
                longFirst = Long.parseLong(new String(stringEnter));
                double d = Math.sqrt((double)longFirst);
                mResultText.setText("" + d);
            }
        });








    }

    @Override
    public void onSaveInstanceState(Bundle saved){
        super.onSaveInstanceState(saved);
        char[] arrayStringEnter = new char[stringEnter.length()];
        for (int i = 0; i < stringEnter.length(); i++){
            arrayStringEnter[i] = stringEnter.charAt(i);
        }
        saved.putCharArray(KEY_INDEX_1, arrayStringEnter);

        char[] arrayString = new char[action.length()];
        for (int i = 0; i < action.length(); i++){
            arrayString[i] = action.charAt(i);
        }
        saved.putCharArray(KEY_INDEX_2, arrayString);
        saved.putLong(KEY_INDEX_3, longFirst);
        saved.putInt(KEY_INDEX_4, lengthText);
        saved.putLong(KEY_INDEX_5, t);
        saved.putDouble(KEY_INDEX_6, tt);
    }
}
