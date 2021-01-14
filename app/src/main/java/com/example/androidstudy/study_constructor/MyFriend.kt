package com.example.androidstudy.study_constructor

//클래스 이름
class MyFriend {

    //멤버변수
    //이름
    var name: String? =null //이름이 없을 경우도 생각
    //나이
    var age:Int?=null
    //주소
    private var address:String?=null //private 는 해당 클래스 내에서만 접근 가능


    init {
        name = "홍길동"
        age=100
        address="서울"
    }
    //  생성자에서 기본으로 값을 바로 설정 하고자  할때
    //  init 부분에서 안하고 바로 값을 넣을 수도 있다.


}