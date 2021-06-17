package com.sunnyweather.android.ui.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.sunnyweather.android.R
import kotlinx.android.synthetic.main.activity_music_list.*

class MusicList : AppCompatActivity() {
    private val musicList = ArrayList<Music>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_list)
        initMusic()
        val adapter = MusicAdapter(this,R.layout.music_list_item,musicList)
        listView.adapter = adapter
    }
    private fun initMusic() {
        repeat(2) {
            musicList.add(Music("晴天",R.drawable.ic_clear_day))
            musicList.add(Music("晴天",R.drawable.ic_clear_day))
            musicList.add(Music("晴天",R.drawable.ic_clear_day))
            musicList.add(Music("晴天",R.drawable.ic_clear_day))
        }
    }
}