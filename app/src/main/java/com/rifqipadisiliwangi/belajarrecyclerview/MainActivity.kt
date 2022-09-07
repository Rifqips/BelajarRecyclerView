package com.rifqipadisiliwangi.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myStudent = arrayListOf(
            MyStudent("Padi","111111",R.drawable.ic_launcher_foreground),
            MyStudent("Padiii","111111",R.drawable.ic_launcher_foreground),
            MyStudent("Padiiii","111111",R.drawable.ic_launcher_foreground),
            MyStudent("Padiiiii","111111",R.drawable.ic_launcher_foreground),
            MyStudent("Padiiiiii","111111",R.drawable.ic_launcher_foreground),
        )

        var adapterStudent = StudentAdapter(myStudent)
        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_data_student)

        recyclerView.layoutManager = lm
        recyclerView.adapter = adapterStudent
    }
}