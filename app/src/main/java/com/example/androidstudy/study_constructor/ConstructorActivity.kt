package com.example.androidstudy.study_constructor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.androidstudy.R

class ConstructorActivity : AppCompatActivity() {

    val TAG="로그"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constructor)

        var myFriend1=MyFriend() //객체생성

       //ctrl+d : 한 줄 복사
        Log.d(TAG,"ConstuctorActivity - MyFriend : ${myFriend1.name}")
        Log.d(TAG,"ConstuctorActivity - MyFriend : ${myFriend1.age}")

        //매개변수가 들어가는 생성자
        var myFriend2=MyFriendParans("김철수",110,"부산")

        Log.d(TAG,"ConstuctorActivity - MyFriend : ${myFriend2.name}")
        Log.d(TAG,"ConstuctorActivity - MyFriend : ${myFriend2.age}")

        //추가 생성자 사용(pet 매개변수는 필수가 아님)
        var myFriend3=MyFriendParans("김철수",110,"부산", true)

//좀 더 유연하게 객체 생성하기(매개변수가 복잡할 때)-디자인 패턴 빌더 패턴
    }
}