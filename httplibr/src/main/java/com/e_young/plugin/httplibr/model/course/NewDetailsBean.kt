package com.e_young.plugin.content.bean


//data class NewDetailsBean(
//    val data: NewDetailsData,
//    val message: String,
//    val status: String
//)
//
//data class NewDetailsData(
//    val subscribe: Boolean,
//    val relationCourse: List<RelationCourse>,
//    val detail: NewDetailsDataDetail,
//    val relationNews: List<RelationNew>
//)
//
//data class NewDetailsDataDetail(
//    val editorName: String,
//    val fristCategoryId: Int,
//    val introduces: String,
//    val secondCategory: String,
//    val author: String,
//    val fristCategory: String,
//    val photo: String,
//    val converUrl: String,
//    val editor_id: Int,
//    val title: String,
//    val content: String,
//    val url: String,
//    val createTime: Long,
//    val name: String,
//    val shareUrl: String,
//    val id: Int,
//    val subNum: Int,
//    val secondCategoryId: Int
//)
//
//data class RelationCourse(
//    val courseName: String,
//    val coverPicUrl: String,
//    val id: Int,
//    val hospitalName: String,
//    val userName: String,
//    val createDt: Long,
//    val duties: String
//)
//
//data class RelationNew(
//    val coverUrl: String,
//    val readNum: Int,
//    val abstractContent: String,
//    val id: Int,
//    val source: String,
//    val title: String,
//    val logoUrl: String
//)
//================================

data class NewDetailsBean(
    val data: NewDetailsData,
    val message: String,
    val status: String
)

data class NewDetailsData(
    val subscribe: Boolean,
    val relationCourse: List<RelationCourse>,
    val detail: NewDetailsDataDetail,
    val relationNews: List<RelationNew>
)

data class RelationCourse(
    val courseName: String,
    val coverPicUrl: String,
    val id: Int,
    val hospitalName: String,
    val userName: String,
    val createDt: Long,
    val duties: String
)

data class NewDetailsDataDetail(
    val editorName: String,
    val fristCategoryId: Int,
    val introduces: String,
    val secondCategory: String,
    val author: String,
    val fristCategory: String,
    val photo: String,
    val converUrl: String,
    val editor_id: Int,
    val title: String,
    val content: String,
    val url: String,
    val createTime: String,
    val name: String,
    val shareUrl: String,
    val id: Int,
    val subNum: Int,
    val secondCategoryId: Int
)

data class RelationNew(
    val coverUrl: String,
    val readNum: Int,
    val abstractContent: String,
    val id: Int,
    val source: String,
    val title: String,
    val logoUrl: String
)
