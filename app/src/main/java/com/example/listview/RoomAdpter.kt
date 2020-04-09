package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ArrayAdapter
import java.text.FieldPosition
import kotlin.coroutines.coroutineContext

class RoomAdpter(context : Context, resId:Int, list:ArrayList<Room>) : ArrayAdapter<Room> (context, resId, list)

val mContext= context
val mList=list
val inf=LayoutInflater.from(mContext)


override fun getView(position: Int, convertView:View?, parent:ViewGroup)
var temp=convertView
if(temRow==null){
    tempRow = int.inflate(R.layout.room_list_item, null)

}

val row=tempRow!!
}


}