package com.e_young.plugin.assistant_plugin.bean.serch

data class MapSerch(
    val count: Int,
    val data: List<AddresBean>,
    val message: String,
    val request_id: String,
    val status: Int
)