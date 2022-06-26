package com.samawaenginerr.androidpemulasubmission.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.samawaenginerr.androidpemulasubmission.DetailHotelActivity
import com.samawaenginerr.androidpemulasubmission.R
import com.samawaenginerr.androidpemulasubmission.model.Hotel

class HotelAdapter(val listHotel: ArrayList<Hotel>, val mode: String) : RecyclerView.Adapter<HotelAdapter.HotelViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelViewHolder {
        lateinit var view: View

        if (mode == "horizontal") {
            view =  LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_hotel_list, parent, false)
        }

        if (mode == "vertical") {
            view =  LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_hotel_list_tw, parent, false)
        }

        return HotelViewHolder(view)
    }

    override fun onBindViewHolder(holder: HotelViewHolder, position: Int) {
        val hotel = listHotel[position]
        val context = holder.itemView.context

        Glide.with(context)
            .load(hotel.image)
            .into(holder.hotelImage)

        holder.hotelName.text = hotel.name
        holder.hotelPrice.text = hotel.price
        holder.itemView.setOnClickListener {
            val hotelDetail = Intent(context, DetailHotelActivity::class.java)
            hotelDetail.putExtra(DetailHotelActivity.HOTEL_NAME, hotel.name)
            hotelDetail.putExtra(DetailHotelActivity.HOTEL_IMAGE, hotel.image)
            hotelDetail.putExtra(DetailHotelActivity.HOTEL_ABOUT, hotel.about)
            hotelDetail.putExtra(DetailHotelActivity.HOTEL_PRICE, hotel.price)
            hotelDetail.putExtra(DetailHotelActivity.HOTEL_CHECKINTIME, hotel.checkInTime)
            hotelDetail.putExtra(DetailHotelActivity.HOTEL_CHECKOUTIME, hotel.checkOutTime)
            context.startActivity(hotelDetail)
        }
    }

    override fun getItemCount(): Int {
        return listHotel.size
    }

    inner class HotelViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var hotelName: TextView = itemView.findViewById(R.id.hotel_name)
        var hotelPrice: TextView = itemView.findViewById(R.id.hotel_price)
        var hotelImage: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}