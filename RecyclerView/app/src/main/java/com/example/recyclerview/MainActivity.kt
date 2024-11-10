package com.example.recyclerview

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    lateinit var dataList: ArrayList<Model>
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataList = ArrayList()

        recyclerView = findViewById(R.id.recyclerView)

        setDataInRecyclerView()

    }

    private fun setDataInRecyclerView() {

        dataList.add(Model(R.drawable.fox, "Fox","Fox is an Animal"))
        dataList.add(Model(R.drawable.boy, "Boy","Boy is baby"))
        dataList.add(Model(R.drawable.bird, "Bird", "This is an parrot"))
        dataList.add(Model(R.drawable.girl, "Girl","Girl is an baby"))
        dataList.add(Model(R.drawable.car, "BMW", "BMW, or Bayerische Motoren Werke, is a German luxury car manufacturer that produces a wide range of vehicles including sedans, coupes, convertibles, sports cars, and SUVs"))
        dataList.add(Model(R.drawable.bike, "Bike", "bike is an also vehicle"))
        dataList.add(Model(R.drawable.ballon, "Ballon", "ballon is ballon"))

        recyclerView.adapter = ItemAdapter(dataList,this)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}