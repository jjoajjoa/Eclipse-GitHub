package com.example.test3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // 화면이 보이는 동안 계속 유지되는 변수상자(붕어빵)
    EditText input1;
    EditText input2;
    EditText input3;

    ImageView outputImage;
    TextView outputText;

    // 강아지나 고양이를 담아둘 변수상자
    Animal animal;

    // 화면이 보이기전에 한번 실행됨
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    // 초기화
    public void init() {
        // 화면에 보이는 것들(자동으로 만들어진 붕어빵) 중에 필요한 거 찾아서 변수상자에 넣기
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        outputImage = findViewById(R.id.outputImage);
        outputText = findViewById(R.id.outputText);
        // 버튼을 눌렸을 때 동작시키기
        // 1.강아지만들기버튼
        Button createDogBtn = findViewById(R.id.createDogBtn);
        createDogBtn.setOnClickListener(v -> {
            animal = new Dog();
        });
        // 2.뛰어버튼
        Button runBtn = findViewById(R.id.runBtn);
        runBtn.setOnClickListener(v -> {
            animal.run(outputImage);
        });
    }

}