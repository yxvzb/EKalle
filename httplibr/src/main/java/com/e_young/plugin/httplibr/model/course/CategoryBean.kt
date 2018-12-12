package com.e_young.plugin.content.bean



//data class CategoryBean(
//    val data: CategoryData,
//    val message: String,
//    val status: String
//)
//
//data class CategoryData(
//    val subscribe: Boolean,
//    val noteTopic: List<CategoryDataNoteTopic>,
//    val detail: CategoryDetail
//)
//
//data class CategoryDetail(
//    val introduces: String,
//    val createTime: Long,
//    val name: String,
//    val photo: String,
//    val converUrl: String,
//    val id: Int,
//    val media: String,
//    val title: String,
//    val subNum: Int,
//    val content: String,
//    val url: String,
//    val categoryId: Int
//)
//
//data class CategoryDataNoteTopic(
//    val id: Int,
//    val categoryName: String
//)

//================
data class CategoryBean(
    val data: CategoryData,
    val message: String,
    val status: String
)

data class CategoryData(
    val subscribe: Boolean,
    val noteTopic: List<NoteTopic>,
    val detail: CategoryDetail
)

data class CategoryDetail(
    val departmentName: String,
    val introduces: String,
    val photo: String,
    val converUrl: String,
    val hospitalName: String,
    val title: String,
    val content: String,
    val dutyName: String,
    val createTime: String,
    val name: String,
    val shareUrl: String,
    val id: Int,
    val subNum: Int,
    val categoryId: Int
)
