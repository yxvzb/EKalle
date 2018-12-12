package com.e_young.plugin.httplibr.model.course


data class CourseDetailBean(
        val data: CourseDetailData,
        val message: String,
        val status: String
)

data class CourseDetailData(
        val editorName: Any,
        val isDownload: Int,
        val editorId: Any,
        val livingUrl: String,
        val courseType: Int,
        val appSummary: String,
        val userIntegral: Int,
        val courseAbstract: Any,
        val collectionNum: Int,
        val downloadNeedIntegral: Int,
        val chapters: List<Chapter>,
        val isAllowDownload: Int,
        val liveStartTime: Long,
        val isSignIn: Int,
        val isSignUp: Int,
        val courseName: String,
        val liveEndTime: Long,
        val isBusiness: Int,
        val relationChannel: RelationChannel,
        val id: Int,
        val coverPic: String,
        val lecturerList: List<Lecturer>,
        val categories: List<Category>,
        val waitPic: String,
        val isCollected: Int,
        val shareUrl:String
)

data class Category(
        val categoryLevel: Int,
        val isMain: Int,
        val id: Int,
        val categoryName: String
)

data class Chapter(
        var isLive: Boolean,
        val videoUrl: String,
        val chapterId: Int,
        val chapterName: String,
        val videoTime: Int,
        val courseId: Int
)

data class RelationChannel(
        val summary: String,
        val lecturerIntroduction: String,
        val externalLink: String,
        val videoNum: Int,
        val title: String,
        val categoryName: String,
        val subNum: Int,
        val ifExternalLink: Int,
        val shareUrl: String,
        val id: Int,
        val categoryId: Int,
        val bgUrl: String,
        val subscribe: Boolean
)

data class Lecturer(
        val departmentName: String,
        val summary: String,
        val isMain: Int,
        val isFollowLecturer: String,
        val hospitalName: String,
        val id: Int,
        val userName: String,
        val dutyName: String,
        val headPhoto: String
)