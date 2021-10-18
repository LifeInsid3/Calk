package com.example.calk;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    TextView tx1;
    EditText display;
    double a;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = findViewById(R.id.txt1);
        display = findViewById(R.id.txt2);



        display.setShowSoftInputOnFocus(false);
    }

    private void updateText(String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));
        display.setSelection(cursorPos + strToAdd.length());
    }

    public void bt1(View view) {
        display.setText("");
        tx1.setText("");
    }

    public void bt2(View view) {
        updateText(getResources().getString(R.string.btn2));
    }

    public void bt3(View view) {
        updateText(getResources().getString(R.string.btn3));
    }

    public void bt4(View view) {
        updateText(getResources().getString(R.string.btn4));
    }

    public void bt5(View view) {
        updateText(getResources().getString(R.string.btn5));
    }

    public void bt6(View view) {
        updateText(getResources().getString(R.string.btn6));
    }

    public void bt7(View view) {
        updateText(getResources().getString(R.string.btn7));
    }

    public void bt8(View view) {
        updateText(getResources().getString(R.string.btn8));
    }

    public void bt9(View view) {
        updateText(getResources().getString(R.string.btn9));
    }

    public void bt10(View view) {
        updateText(getResources().getString(R.string.btn10));
    }

    public void bt11(View view) {
        updateText(getResources().getString(R.string.btn11));
    }

    public void bt12(View view) {
        updateText(getResources().getString(R.string.btn12));
    }

    public void bt13(View view) {
        updateText(getResources().getString(R.string.btn13));
    }

    public void bt14(View view) {
        updateText(getResources().getString(R.string.btn14));
    }

    public void bt15(View view) {
        updateText(getResources().getString(R.string.btn15));
    }

    public void bt16(View view) {
        updateText(getResources().getString(R.string.btn16));
    }

    public void bt17(View view) {
        updateText(getResources().getString(R.string.btn17));
    }

    public void bt18(View view) {
        updateText(getResources().getString(R.string.btn18));
    }

    public void bt19(View view) {
       String userExp = display.getText().toString();
       tx1.setText(userExp);
       Expression exp = new Expression(userExp);
       String result = String.valueOf(exp.calculate());
       display.setText(result);
       display.setSelection(result.length());
    }

    public void bt20(View view) {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if (cursorPos != 0 && textLen != 0){
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos-1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos-1);
        }
    }

    public void bt21(View view) {
        updateText(getResources().getString(R.string.btn21));
    }

    public void bt22(View view) {
        updateText(getResources().getString(R.string.btn22));
    }

    public void bt23(View view) {
        updateText(getResources().getString(R.string.btn23));
    }

    public void bt24(View view) {
        updateText(getResources().getString(R.string.btn24));
    }

    public void bt25(View view) {
        updateText(getResources().getString(R.string.btn25));
    }

    public void bt26(View view) { updateText(getResources().getString(R.string.btn26));}

    public void bt27(View view) {
        updateText(getResources().getString(R.string.btn27));
    }

    public void bt28(View view) {
        updateText(getResources().getString(R.string.btn28));
    }
}