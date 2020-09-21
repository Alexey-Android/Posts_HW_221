fun main() {


        val comments = Comment(
            count = 1,
            canPost = false,
            groupsCanPost = false,
            canClose = false,
            canOpen = false,
        )
        val likes = Like(
            count = 0,
            userLikes = false,
            canLike = false,
            canPublish = false,
        )
        val reposts = Repost(
            count = 0,
            userReposted = false,
        )
        val views = View(
            count = 0
        )
        val original = Post(
            id = 1222,
            ownerId = 1,
            fromId = 200,
            createdBy = 3,
            date = 4,
            text = "",
            replyOwnerId = 5,
            replyPostId = 6,
            friendsOnly = false,
            comments = comments,
            copyright = "",
            likes = likes,
            reposts = reposts,
            views = views,
            postType = "",
            SignerIg = 7,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postPonedId = 8
        )

    val service = WallService()
    service.add(original)
    service.update(original)

    }


