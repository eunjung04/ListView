package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mRoomAdapter:RoomAdapter?=null

    val roomList = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roomList.add(Room(8000,"서울시 은평구", 4,"연립주택입니다."))
        roomList.add(Room(18300,"서울시 영등포구", 4,"연립주택입니다."))
        roomList.add(Room(15000,"서울시 노량진구", 4,"연립주택입니다."))
        roomList.add(Room(14000,"경기도 수원시", 4,"연립주택입니다."))
        roomList.add(Room(17000,"경기도 남양주시", 4,"연립주택입니다."))
        roomList.add(Room(13400,"경기도 화성시", 4,"연립주택입니다."))
        roomList.add(Room(12000,"경기도 안양시", 4,"연립주택입니다."))
        roomList.add(Room(12500,"경기도 구리시", 4,"연립주택입니다."))




        mRoomAdapter= RoomAdapter( this,R.layout.room_list_item, roomList)
        roomListView.adapter=mRoomAdapter


    }



}
