package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.udojava.evalex.*;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_calc, btn_dec, btn_clear, btn_bracket_l, btn_bracket_p, btn_koren,
            btn_zeroes, btn_sin, btn_cos, btn_tg, btn_ctg, btn_percent, btn_logarithm, btn_pi, btn_square;
    private  EditText ed1;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_Add = (Button) findViewById(R.id.btn_Add);
        btn_Div = (Button) findViewById(R.id.btn_Div);
        btn_Sub = (Button) findViewById(R.id.btn_Sub);
        btn_Mul = (Button) findViewById(R.id.btn_Mul);
        btn_calc = (Button) findViewById(R.id.btn_calc);
        btn_dec = (Button) findViewById(R.id.btn_dec);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_bracket_l = (Button) findViewById(R.id.btn_bracket_l);
        btn_bracket_p = (Button) findViewById(R.id.btn_bracket_p);
        btn_koren = (Button) findViewById(R.id.btn_koren);
        btn_zeroes = (Button) findViewById(R.id.btn_zeroes);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_tg = (Button) findViewById(R.id.btn_tg);
        btn_ctg = (Button) findViewById(R.id.btn_ctg);
        btn_percent = (Button) findViewById(R.id.btn_percent);
        btn_logarithm = (Button) findViewById(R.id.btn_logarithm);
        btn_pi = (Button) findViewById(R.id.btn_pi);
        btn_square = (Button) findViewById(R.id.btn_square);


        ed1 = (EditText) findViewById(R.id.edText1);


        btn_0.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_calc.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_Add.setOnClickListener(this);
        btn_Div.setOnClickListener(this);
        btn_Sub.setOnClickListener(this);
        btn_Mul.setOnClickListener(this);
        btn_dec.setOnClickListener(this);
        btn_bracket_l.setOnClickListener(this);
        btn_bracket_p.setOnClickListener(this);
        btn_koren.setOnClickListener(this);
        btn_zeroes.setOnClickListener(this);
        btn_sin.setOnClickListener(this);
        btn_cos.setOnClickListener(this);
        btn_tg.setOnClickListener(this);
        btn_ctg.setOnClickListener(this);
        btn_percent.setOnClickListener(this);
        btn_logarithm.setOnClickListener(this);
        btn_pi.setOnClickListener(this);
        btn_square.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_0:
                ed1.setText(ed1.getText() + "0");
                break;
            case R.id.btn_1:
                ed1.setText(ed1.getText() + "1");
                break;
            case R.id.btn_2:
                ed1.setText(ed1.getText() + "2");
                break;
            case R.id.btn_3:
                ed1.setText(ed1.getText() + "3");
                break;
            case R.id.btn_4:
                ed1.setText(ed1.getText() + "4");
                break;
            case R.id.btn_5:
                ed1.setText(ed1.getText() + "5");
                break;
            case R.id.btn_6:
                ed1.setText(ed1.getText() + "6");
                break;
            case R.id.btn_7:
                ed1.setText(ed1.getText() + "7");
                break;
            case R.id.btn_8:
                ed1.setText(ed1.getText() + "8");
                break;
            case R.id.btn_9:
                ed1.setText(ed1.getText() + "9");
                break;
            case R.id.btn_Add:
                ed1.setText(ed1.getText() + "+");
                break;
            case R.id.btn_Sub:
                ed1.setText(ed1.getText() + "-");
                break;
            case R.id.btn_Mul:
                ed1.setText(ed1.getText() + "*");
                break;
            case R.id.btn_Div:
                ed1.setText(ed1.getText() + "/");
                break;
            case R.id.btn_dec:
                ed1.setText(ed1.getText() + ".");
                break;
            case R.id.btn_bracket_l:
                ed1.setText(ed1.getText() + "(");
                break;
            case R.id.btn_bracket_p:
                ed1.setText(ed1.getText() + ")");
                break;
            case R.id.btn_koren:
                ed1.setText(ed1.getText() + "SQRT(");
                break;
            case R.id.btn_zeroes:
                ed1.setText(ed1.getText() + "00");
                break;
            case R.id.btn_sin:
                ed1.setText(ed1.getText() + "SIN(");
                break;
            case R.id.btn_cos:
                ed1.setText(ed1.getText() + "COS(");
                break;
            case R.id.btn_tg:
                ed1.setText(ed1.getText() + "TAN(");
                break;
            case R.id.btn_ctg:
                ed1.setText(ed1.getText() + "COT(");
                break;
            case R.id.btn_percent:
                ed1.setText(ed1.getText() + "/100");
                break;
            case R.id.btn_logarithm:
                ed1.setText(ed1.getText() + "LOG(");
                break;
            case R.id.btn_pi:
                ed1.setText(ed1.getText() + "PI");
                break;
            case R.id.btn_square:
                ed1.setText(ed1.getText() + "^2");
                break;
            case R.id.btn_clear:
                ed1.setText(ed1.getText().toString().substring
                        (0, ed1.getText().toString().length() - 1));
                break;
            case R.id.btn_calc:
                try {
                    if (!ed1.getText().toString().equals("")) {
                        Expression expression = new Expression(ed1.getText().toString());

                        BigDecimal result = expression.eval(false); // 1.333333


                        ed1.setText(result.toString());

                    }
                } catch (ArithmeticException e) {

                    ed1.setText("Illigal expression");

                } catch (Expression.ExpressionException e) {

                    ed1.setText("Expression is not valid");

                } catch (NumberFormatException e) {

                    ed1.setText("Wrong format of expression");

                }


                break;

            }



        }
    }
