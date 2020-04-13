package com.example.listview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

        roomListView.setOnItemClickListener { parent, view, position, id ->
            //몇번줄을 눌렀는지 토스트로 출력
            Toast.makeText(this,"${position}번 줄 클릭",Toast.LENGTH_SHORT)

            roomListView.setOnItemLongClickListener { parent, view, position, id ->

                Toast.makeText(this, "${position}번 줄 오래 클릭", Toast.LENGTH_SHORT).show()

                return@setOnItemLongClickListener  true
        }




        }




    }



}
