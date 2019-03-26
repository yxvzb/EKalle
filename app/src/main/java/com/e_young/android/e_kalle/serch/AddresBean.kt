package com.e_young.plugin.assistant_plugin.bean.serch

data class AddresBean(
    val adcode: Int,
    val address: String,
    val category: String,
    val city: String,
    val district: String,
    val id: String,
    val location: Location,
    val province: String,
    val title: String,
    val type: Int
)