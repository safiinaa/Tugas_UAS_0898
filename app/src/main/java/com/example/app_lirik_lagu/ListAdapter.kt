package com.example.app_lirik_lagu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListAdapter(context: Context, dataArrayList: ArrayList<ListData?>?):
ArrayAdapter<ListData?>(context, R.layout.list_item_lirik, dataArrayList!!){

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        var view = view
        val listData = getItem(position)

        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item_lirik, parent, false)
        }
        val listimage = view!!.findViewById<ImageView>(R.id.listimage)
        val ListName = view!!.findViewById<TextView>(R.id.Listname)
        val listArtis = view!!.findViewById<TextView>(R.id.listArtis)
        val liriklagu = view!!.findViewById<TextView>(R.id.liriklagu)

        listimage.setImageResource (listData!!.image)
        ListName.text = listData.name
        listArtis.text = listData.artis.toString()
        liriklagu.text = listData.lagu.toString()

        return view
    }
}

private fun ImageView.setImageResource(image: String) {
    TODO("Not yet implemented")
}
