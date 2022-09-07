package com.rifqipadisiliwangi.belajarrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class StudentAdapter(val myStudent: ArrayList<MyStudent>): RecyclerView.Adapter<StudentAdapter.ViewHolder>(){

//    Ambil ID
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var namaStudent = view.findViewById<TextView>(R.id.tv_nama)
        var nimStudent = view.findViewById<TextView>(R.id.tv_nim)
        var imgStudent = view.findViewById<ImageView>(R.id.img_student)
    }

//    inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.data_studi_and_satu,parent,false)
        return ViewHolder(view)
    }

//    Melakukan penentuan data yang akan ditampilkan ke item(nge binding data)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = myStudent[position].nama
        holder.nimStudent.text = myStudent[position].nim
        holder.imgStudent.setImageResource(myStudent[position].img)

    }

//    Menentukan jumlah data / nge return data
    override fun getItemCount(): Int {
        return myStudent.size
    }
}
