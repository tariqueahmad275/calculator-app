package in.responsenet.tcet_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,
            button8,button9,button10,buttonC,buttonadd,buttonsub,buttonmul,
            buttondiv,buttoneql;

    TextView userNameText;

    EditText editText;

    float valueOne,valueTwo;

    String text_data;

    boolean oppAdd,oppSub,oppMul,oppDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonsub = (Button) findViewById(R.id.buttonsub);
        buttonmul = (Button) findViewById(R.id.buttonmul);
        buttondiv = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttoneql = (Button) findViewById(R.id.buttoneql);

        userNameText = (TextView) findViewById(R.id.userNameText);

        editText = (EditText) findViewById(R.id.editText);

        text_data = getIntent().getExtras().getString("text_data");

        if(text_data.length()>0){
            userNameText.setText(text_data);
        }else{
            text_data = "Please Enter your Name";
            userNameText.setText(text_data);
        }


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }else{
                    valueOne = Float.parseFloat(editText.getText()+"");
                    oppAdd = true;
                    editText.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }else{
                    valueOne = Float.parseFloat(editText.getText()+"");
                    oppSub = true;
                    editText.setText(null);
                }
            }
        });

        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }else{
                    valueOne = Float.parseFloat(editText.getText()+"");
                    oppMul = true;
                    editText.setText(null);
                }
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText==null){
                    editText.setText("");
                }else{
                    valueOne = Float.parseFloat(editText.getText()+"");
                    oppDiv = true;
                    editText.setText(null);
                }
            }
        });

        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(editText.getText()+"");

                if(oppAdd==true){
                    editText.setText(valueOne+valueTwo+"");
                    oppAdd = false;
                }

                if(oppSub==true){
                    editText.setText(valueOne-valueTwo+"");
                    oppSub = false;
                }

                if(oppMul==true){
                    editText.setText(valueOne*valueTwo+"");
                    oppMul = false;
                }

                if(oppDiv==true){
                    editText.setText(valueOne/valueTwo+"");
                    oppDiv = false;
                }
            }
        });

    }
}
