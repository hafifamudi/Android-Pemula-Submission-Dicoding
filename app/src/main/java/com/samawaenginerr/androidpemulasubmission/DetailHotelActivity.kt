package com.samawaenginerr.androidpemulasubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailHotelActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val HOTEL_NAME = "hotel_name"
        const val HOTEL_IMAGE = "hotel_image"
        const val HOTEL_PRICE = "hotel_price"
        const val HOTEL_ABOUT = "hotel_about"
        const val HOTEL_CHECKINTIME = "hotel_checkintime"
        const val HOTEL_CHECKOUTIME = "hotel_checkoutime"
        var HOTEL_NAME_VALUE = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hotel)

        val shareBtn: Button = findViewById(R.id.share_hotel)
        var backButton: Button = findViewById(R.id.back_home)
        shareBtn.setOnClickListener(this)
        backButton.setOnClickListener(this)

        val hotelName: TextView = findViewById(R.id.hotel_name)
        val hotelImage: ImageView = findViewById(R.id.img_item_photo_detail)
        val hotelAbout: TextView = findViewById(R.id.about_place)
        val hotelPrice: TextView = findViewById(R.id.hotel_price)
        val hotelCheckInTime: TextView = findViewById(R.id.hotel_checkin)
        val hotelCheckOutTime: TextView = findViewById(R.id.hotel_checkout)

        val dataName = intent.getStringExtra(HOTEL_NAME)
        val dataImage = intent.getIntExtra(HOTEL_IMAGE, 0)
        val dataAbout = intent.getStringExtra(HOTEL_ABOUT)
        val dataPrice = intent.getStringExtra(HOTEL_PRICE)
        val dataCheckInTime = intent.getStringExtra(HOTEL_CHECKINTIME)
        val dataCheckOutTime = intent.getStringExtra(HOTEL_CHECKOUTIME)

        hotelName.text = dataName
        hotelAbout.text = dataAbout
        hotelPrice.text = dataPrice
        hotelCheckInTime.text = dataCheckInTime
        hotelCheckOutTime.text =dataCheckOutTime
        Glide.with(this)
            .load(dataImage)
            .into(hotelImage)

        // get value of hotel name for share feature
        HOTEL_NAME_VALUE = hotelName.text.toString()
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.share_hotel) {
            val shareHotel = Intent()
            shareHotel.action = Intent.ACTION_SEND
            shareHotel.putExtra(Intent.EXTRA_TEXT, "Check this out. The Coolest Hotel: $HOTEL_NAME_VALUE")
            shareHotel.type = "text/plain"
            startActivity(Intent.createChooser(shareHotel, "Let's Share"))
        }

        if (v?.id == R.id.back_home) {
            val home = Intent(this@DetailHotelActivity, ListHotelActivity::class.java)
            startActivity(home)
        }
    }
}