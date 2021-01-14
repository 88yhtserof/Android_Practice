package com.example.androidstudy.study_constructor

class MyFriendParans (var name:String?,
                      var age:Int?,
                      private var address:String?){

    var pet:Boolean?=null

    //첫번째 호출
    //시작될 때, 객체가 메모리에 올라갈 때 호출됨
    init {
        this.name="익명" //외부에서 어떤 값을 주더라도 "익명"으로 설정
    }

    //두번째 호출
    //추가 생성자: 기존에 있던 것에 추가로 받기
    //추가된 부분을 제외하고 기존에 있던 매개변수는 반환해야한다.
    constructor(name:String?,
                age:Int?,
                address:String?,
                pet:Boolean?) : this(name,age, address){
        this.pet=pet
    }
}