package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val roomList = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomList.add(Room(8000,"서울시 은평구", 4,"연립주택입니다."))
        roomList.add(Room(8000,"서울시 영등포구", 4,"연립주택입니다."))
        roomList.add(Room(8000,"서울시 노량진", 4,"연립주택입니다."))
        roomList.add(Room(8000,"경기도 수원시", 4,"연립주택입니다."))
        roomList.add(Room(8000,"경기도 남양주시", 4,"연립주택입니다."))
    }
}
