package com.example.viewanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    private AppCompatTextView textView;
    private AppCompatButton animate,tadaButton,rotateInButton, zoomInLeftButton;
    private AppCompatEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textViewId);
        animate= findViewById(R.id.animateButtonId);
        tadaButton= findViewById(R.id.tadaButtonId);
        editText= findViewById(R.id.editTextId);
        rotateInButton= findViewById(R.id.RotateInButtonId);
        zoomInLeftButton= findViewById(R.id.ZoomInLeftButtonId);
        zoomInLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.ZoomInLeft).duration(500)
                        .repeat(1)
                        .playOn(editText);
            }
        });

        rotateInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.RotateIn).duration(500)
                        .repeat(1)
                        .playOn(editText);
            }
        });

        tadaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Tada).duration(500)
                        .repeat(1)
                        .playOn(textView);
            }
        });

        animate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.RubberBand).duration(500)
                        .repeat(1)
                        .playOn(textView);
            }
        });
    }
}
