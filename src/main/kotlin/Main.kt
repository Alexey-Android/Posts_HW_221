fun main() {

        val original = Post(
            id = 1,
            ownerId = 1,
            fromId = 200,
            createdBy = 3,
            date = 4,
            text = "originalPost",
            replyOwnerId = 5,
            replyPostId = 6,
            friendsOnly = false,
            comments = Comment(
                count = 1,
                canPost = false,
                groupsCanPost = false,
                canClose = false,
                canOpen = false,
            ),
            copyright = "",
            likes = Like(
                count = 0,
                userLikes = false,
                canLike = false,
                canPublish = false,
            ),
            reposts = Repost(
                count = 0,
                userReposted = false,
            ),
            views = View(
                count = 0
            ),
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

    val updatePost = Post(
        id = 1,
        ownerId = 11,
        fromId = 21,
        createdBy = 31,
        date = 41,
        text = "UpdatePost",
        replyOwnerId = 51,
        replyPostId = 61,
        friendsOnly = false,
        comments = Comment(
            count = 71,
            canPost = false,
            groupsCanPost = false,
            canClose = false,
            canOpen = false,
        ),
        copyright = "",
        likes = Like(
            count = 81,
            userLikes = false,
            canLike = false,
            canPublish = false,
        ),
        reposts = Repost(
            count = 91,
            userReposted = false,
        ),
        views = View(
            count = 101
        ),
        postType = "",
        SignerIg = 102,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        postPonedId = 103
    )

    val service = WallService()
    service.add(original)
    service.update(updatePost)

    }


