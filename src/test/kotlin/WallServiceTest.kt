import org.junit.Assert.*

class WallServiceTest {

   /* @org.junit.Test
    fun add() {
    }*/

    @org.junit.Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(Post(     id = 1,
            ownerId = 11,
            fromId = 12,
            createdBy = 13,
            date = 14,
            text = "first",
            replyOwnerId = 15,
            replyPostId = 16,
            friendsOnly = false,
            comments = Comment(
                count = 17,
                canPost = false,
                groupsCanPost = false,
                canClose = false,
                canOpen = false,
            ),
            copyright = "",
            likes = Like(
                count = 18,
                userLikes = false,
                canLike = false,
                canPublish = false,
            ),
            reposts = Repost(
                count = 19,
                userReposted = false,
            ),
            views = View(
                count = 20
            ),
            postType = "",
            SignerIg = 21,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postPonedId = 22))

        service.add(Post(     id = 2,
            ownerId = 21,
            fromId = 22,
            createdBy = 23,
            date = 24,
            text = "second",
            replyOwnerId = 25,
            replyPostId = 26,
            friendsOnly = false,
            comments = Comment(
                count = 27,
                canPost = false,
                groupsCanPost = false,
                canClose = false,
                canOpen = false,
            ),
            copyright = "",
            likes = Like(
                count = 28,
                userLikes = false,
                canLike = false,
                canPublish = false,
            ),
            reposts = Repost(
                count = 29,
                userReposted = false,
            ),
            views = View(
                count = 30
            ),
            postType = "",
            SignerIg = 31,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postPonedId = 32))

        service.add(Post(     id = 3,
            ownerId = 31,
            fromId = 32,
            createdBy = 33,
            date = 34,
            text = "third",
            replyOwnerId = 35,
            replyPostId = 36,
            friendsOnly = false,
            comments = Comment(
                count = 37,
                canPost = false,
                groupsCanPost = false,
                canClose = false,
                canOpen = false,
            ),
            copyright = "",
            likes = Like(
                count = 38,
                userLikes = false,
                canLike = false,
                canPublish = false,
            ),
            reposts = Repost(
                count = 39,
                userReposted = false,
            ),
            views = View(
                count = 40
            ),
            postType = "",
            SignerIg = 41,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postPonedId = 42))
        // создаём информацию об обновлении
        val update = Post(     id = 2,
            ownerId = 131,
            fromId = 132,
            createdBy = 133,
            date = 134,
            text = "update",
            replyOwnerId = 135,
            replyPostId = 136,
            friendsOnly = false,
            comments = Comment(
                count = 137,
                canPost = false,
                groupsCanPost = false,
                canClose = false,
                canOpen = false,
            ),
            copyright = "",
            likes = Like(
                count = 138,
                userLikes = false,
                canLike = false,
                canPublish = false,
            ),
            reposts = Repost(
                count = 139,
                userReposted = false,
            ),
            views = View(
                count = 140
            ),
            postType = "",
            SignerIg = 141,
            canPin = false,
            canDelete = false,
            canEdit = false,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            postPonedId = 142)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}
