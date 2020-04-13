package com.example.listview


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class RoomAdapter(context:Context, resId:Int, list:ArrayList<Room>) : ArrayAdapter<Room>(context, resId, list)  {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

      //XML에 있는 뷰들을 변수로 담기(findViewById)

        val price=row.findViewById<TextView>(R.id.price)
        val addressAndFloor=row.findViewById<TextView>(R.id.addressAndFloor)
        val description=row.findViewById<TextView>(R.id.description)

        //근거 데이터 추출.=> 각 위치에 맞는 데이터를 mList에서 가져오기.

        val data=mList.get(position)

        //가격이 1만 이상? ? "?억 ?"식, 그 이하 "?"

        if(data.price>=10000) {

            price.text = "${data.price / 10000}억 ${String.format("%,d",data.price % 10000)}"
        }
        else {
            price.text= String.format("%,d",data.price)
        }

        //주소와 층수=>"주소, 층수(상황마다 다른값)

        var floorStr=""


        if(data.floor==0){
            floorStr="반지하"
        }
        else if (data.floor > 0){
            floorStr="${data.floor}층"
        }
        else {
            floorStr="지하${data.address}층"
        }

        addressAndFloor.text="${data.address}, ${floorStr}"

        description.text=data.desc


        return row

    }

}