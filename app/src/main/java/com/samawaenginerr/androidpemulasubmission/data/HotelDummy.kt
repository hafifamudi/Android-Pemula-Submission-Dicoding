package com.samawaenginerr.androidpemulasubmission.data

import com.samawaenginerr.androidpemulasubmission.R
import com.samawaenginerr.androidpemulasubmission.model.Hotel

object HotelDummy {
    private val hotelNames = arrayOf(
        "Hypnos Hotel",
        "Iris Hotel",
        "Azul Hotel",
        "Ebony Hotel",
        "Altheda Hotel",
        "Aurelia Hotel",
        "Citrus Hotel",
        "The Nectarine Hotel",
        "Xanthe Hotel",
        "Saros Hotel",
    )

    private val hotelPrices = arrayOf(
        "$80/night . 5 Guests",
        "$40/night . 2 Guests",
        "$50/night . 3 Guests",
        "$30/night . 5 Guests",
        "$60/night . 2 Guests",
        "$60/night . 7 Guests",
        "$50/night . 5 Guests",
        "$40/night . 6 Guests",
        "$70/night . 4 Guests",
        "$60/night . 3 Guests",
    )

    private val hotelCapacities = arrayOf(
        "5 Guests",
        "3 Guests",
        "2 Guests",
        "5 Guests",
        "1 Guests",
        "2 Guests",
        "5 Guests",
        "5 Guests",
        "6 Guests",
    )

    private val hotelAbouts = arrayOf(
        "Hypnos is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "Iris is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "Azul is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "Ebony is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "Altheda is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "Aurelia is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "Citrus is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "The Nectarine is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "Xanthe is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
        "Saros is actor from California and has beauty\n" +
                "mansion to stay. It has private pool and\n" +
                "rooms with minimalist designed.",
    )

    private val hotelCheckInTimeHotels = arrayOf(
        "start from 10.00",
        "start from 10.00",
        "start from 10.00",
        "start from 10.00",
        "start from 10.00",
        "start from 10.00",
        "start from 10.00",
        "start from 10.00",
        "start from 10.00",
        "start from 10.00",
    )

    private val hotelCheckOutTimeHotels = arrayOf(
        "before 12.00",
        "before 12.00",
        "before 12.00",
        "before 12.00",
        "before 12.00",
        "before 12.00",
        "before 12.00",
        "before 12.00",
        "before 12.00",
        "before 12.00",
    )

    private val hotelImages = intArrayOf(
        R.drawable.hotel_1,
        R.drawable.hotel_2,
        R.drawable.hotel_3,
        R.drawable.hotel_4,
        R.drawable.hotel_5,
        R.drawable.hotel_6,
        R.drawable.hotel_7,
        R.drawable.hotel_8,
        R.drawable.hotel_9,
        R.drawable.hotel_10,
        )

    val listHotel: ArrayList<Hotel>
        get() {
            val list = arrayListOf<Hotel>()
            for (position in hotelNames.indices) {
                val hotel = Hotel()
                hotel.name = hotelNames[position]
                hotel.image = hotelImages[position]
                hotel.price = hotelPrices[position]
                hotel.about = hotelAbouts[position]
                hotel.checkInTime = hotelCheckInTimeHotels[position]
                hotel.checkOutTime = hotelCheckOutTimeHotels[position]
                list.add(hotel)
            }
            return list
        }
}