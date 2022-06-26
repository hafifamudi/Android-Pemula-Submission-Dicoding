package com.samawaenginerr.androidpemulasubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.samawaenginerr.androidpemulasubmission.adapter.HotelAdapter
import com.samawaenginerr.androidpemulasubmission.data.HotelDummy
import com.samawaenginerr.androidpemulasubmission.model.Hotel

class ListHotelActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvHotel: RecyclerView
    private lateinit var rvHotelTwo: RecyclerView

    private lateinit var aboutAuthor: Button
    private var listHotel: ArrayList<Hotel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_hotel)

        aboutAuthor = findViewById(R.id.about_me)
        aboutAuthor.setOnClickListener(this)

        rvHotel = findViewById(R.id.rv_hotels)
        rvHotel.setHasFixedSize(true)

        rvHotelTwo = findViewById(R.id.rv_hotels_two)
        rvHotelTwo.setHasFixedSize(true)

        listHotel.addAll(HotelDummy.listHotel)
        showHotelLists()
    }

    private fun showHotelLists() {
        rvHotel.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val listHotelAdapter = HotelAdapter(listHotel, "horizontal")
        rvHotel.adapter = listHotelAdapter

        rvHotelTwo.layoutManager = LinearLayoutManager(this)
        val listHotelAdapterTwo = HotelAdapter(listHotel, "vertical")
        rvHotelTwo.adapter = listHotelAdapterTwo
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.about_me) {
            val authorProfile = Intent(this@ListHotelActivity, AuthorAboutActivity::class.java)
            startActivity(authorProfile)
        }
    }
}