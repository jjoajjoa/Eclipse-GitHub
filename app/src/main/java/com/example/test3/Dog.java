package com.example.test3;

import android.widget.ImageView;

// Animal 붕어빵 틀의 변수, 함수상자를 그대로 물려받아서 쓰겠다
public class Dog extends Animal {

    // Animal(부모) 안에 만들어져있는 함수상자를 재정의
    void run(ImageView outputImage) {
        // 화면에 있는 이미지를 강아지가 달리는 사진으로 바꾸겠다
        outputImage.setImageResource(R.drawable.dog_run);
    }
    
}
