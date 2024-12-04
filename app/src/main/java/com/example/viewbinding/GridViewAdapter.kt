package com.example.viewbinding

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridViewAdapter(
    private val list: List<GridViewModal>,
    private val context: Context
) : BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private lateinit var imgIV: ImageView
    private lateinit var nameTV: TextView

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    @SuppressLint("InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var myView = convertView
        if (layoutInflater == null) layoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        if (myView == null) myView =
            layoutInflater!!.inflate(R.layout.gridview_item, null)

        imgIV = myView!!.findViewById(R.id.imgIV)
        nameTV = myView.findViewById(R.id.nameTV)

        imgIV.setImageResource(list[position].img)
        nameTV.text = list[position].name
        return myView
    }
}