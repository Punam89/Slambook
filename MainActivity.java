package com.example.punam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Integer num1,num2;
    boolean add, sub, mul, div ;
    EditText edtnumobj;
    Button btncobj,btn1obj,btn2obj,btn3obj,btn4obj,btn5obj,btn6obj,btn7obj,btn8obj,btn9obj,btn0obj,btnaddobj,btnsubobj ,btnmulobj ,btndivobj,btndotobj,btnequalobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        edtnumobj=findViewById(R.id.edtnum);
        btncobj=findViewById(R.id.btnc);
        btn1obj=findViewById(R.id.btn1);
        btn2obj=findViewById(R.id.btn2);
        btn3obj=findViewById(R.id.btn3);
        btn4obj=findViewById(R.id.btn4);
        btn5obj=findViewById(R.id.btn5);
        btn6obj=findViewById(R.id.btn6);
        btn7obj=findViewById(R.id.btn7);
        btn8obj=findViewById(R.id.btn8);
        btn9obj=findViewById(R.id.btn9);
        btn0obj=findViewById(R.id.btn0);
        btnaddobj=findViewById(R.id.btnadd);
        btnsubobj=findViewById(R.id.btnsub);
        btnmulobj=findViewById(R.id.btnmul);
        btndivobj=findViewById(R.id.btndiv);
        btndotobj=findViewById(R.id.btndot);
        btnequalobj=findViewById(R.id.btnequal);


        btncobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText("");
            }
        });
        btn1obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"1");
            }
        });
        btn2obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"2");
            }
        });
        btn3obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"3");
            }
        });
        btn4obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"4");
            }
        });
        btn5obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"5");
            }
        });
        btn6obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"6");
            }
        });
        btn7obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"7");
            }
        });
        btn8obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               edtnumobj.setText(edtnumobj.getText()+"8");
            }
        });
        btn9obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"9");
            }
        });
        btn0obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+"0");
            }
        });

        btndotobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnumobj.setText(edtnumobj.getText()+".");
            }
        });

        btnaddobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(edtnumobj.getText()+"");
                add=true;
                edtnumobj.setText(null);
            }
        });
        btnsubobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(edtnumobj.getText()+"");
                sub=true;
                edtnumobj.setText(null);
            }
        });
        btnmulobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(edtnumobj.getText()+"");
                mul=true;
                edtnumobj.setText(null);
            }
        });
        btndivobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(edtnumobj.getText()+"");
                div=true;
                edtnumobj.setText(null);
            }
        });

        btnequalobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 =Integer.parseInt(edtnumobj.getText()+"");
                if (add == true){
                    edtnumobj.setText(num1 + num2 +"");
                   add=false;
                }
                if (sub == true){
                    edtnumobj.setText(num1 - num2+"");
                    sub=false;
                }
                if (mul== true){
                    edtnumobj.setText(num1 * num2 +"");
                    add=false;
                }
                if (div == true){
                    edtnumobj.setText(num1 / num2+"");
                    sub=false;
                }
            }
        });
    }
}
