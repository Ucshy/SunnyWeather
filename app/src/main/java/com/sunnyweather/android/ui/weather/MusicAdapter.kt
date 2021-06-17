package com.sunnyweather.android.ui.weather

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.sunnyweather.android.R

class MusicAdapter(activity:Activity,val resourceId:Int,data:List<Music>):ArrayAdapter<Music>(activity,resourceId,data) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(resourceId,parent,false)
        val musicImage:ImageView = view.findViewById(R.id.musicImage)
        val musicName:TextView = view.findViewById(R.id.musicName)
        val music = getItem(position)
        if (music!=null){
            musicImage.setImageResource(music.imageId)
            musicName.text = music.name
        }
        return view
    }
}