package com.e_young.plugin.content.bean




//data class Invitation(
//    val data: InvitationData,
//    val message: String,
//    val status: String
//)
//
//data class InvitationData(
//    val subscribe: Boolean,
//    val noteTopic: List<NoteTopic>,
//    val detail: InvitationDetail
//)
//
//data class InvitationDetail(
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
//    val categoryId: String
//)
//
//data class NoteTopic(
//    val id: Int,
//    val categoryName: String
//)
//
////-============


data class Invitation(
    val data: InvitationData,
    val message: String,
    val status: String
)

data class InvitationData(
    val subscribe: Boolean,
    val noteTopic: List<NoteTopic>,
    val detail: InvitationDetail
)

data class InvitationDetail(
    val introduces: String,
    val createTime: String,
    val staticPic: String,
    val name: String,
    val photo: String,
    val converUrl: String,
    val shareUrl: String,
    val id: Int,
    val title: String,
    val subNum: Int,
    val content: String
)

data class NoteTopic(
    val id: Int,
    val categoryName: String
)