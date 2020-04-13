package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listview
import com.example.listview

class RoomAdapter (context: Context, resId: Int, list: ArrayList<Room>): ArrayAdapter<Room>(context, resId, list) {

val mContext : context
val mList= list
val inf=LayoutInflater.from(mContext)


override fun getView(position: Int, convertView : View?, parent: ViewGroup): View {

val tempRow=convertView
if(tempRow==null){
    tempRow = inf.inflate(R.layout.room_list_item, null)

}

val row=tempRow!!
//row 변수를 활용해서

return row

}

}