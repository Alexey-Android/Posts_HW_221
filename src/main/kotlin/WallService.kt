class WallService {
    private var posts = emptyArray<Post>()
    fun add(post: Post): Post {
        val lastId = posts.lastOrNull()?.id ?: 0
        val nextPost = post.copy(id = lastId.inc())
        posts += nextPost
        println(posts.last())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (i: Int in 0..posts.size) {
            val searchPost = posts[i]
            if (post.id == searchPost.id) {
                val updatedPost = post.copy(
                    id = searchPost.id,
                    ownerId = searchPost.ownerId,
                    date = searchPost.date
                )
                posts[i] = updatedPost
                println(posts.last())
                return true
            }
        }
        return false
    }
}
