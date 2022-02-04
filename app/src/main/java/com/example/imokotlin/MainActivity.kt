package com.example.imokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imokotlin.adapter.ChatAdapter
import com.example.imokotlin.model.Chat

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initVievs()
    }

    private fun initVievs() {
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllChats())
    }

    private fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 1))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 0))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 3))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 2))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 10))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 15))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 18))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 0))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 5))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 4))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 1))
        chats.add(Chat(R.drawable.img_profile,"Diyorbek Shukriddinov", 3))


        return chats
    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }
}