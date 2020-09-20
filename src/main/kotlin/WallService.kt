class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        //posts += post
        //val (id) = posts.last()
        val nextPost = post.copy(id = post.id + 1)
        posts += nextPost
        println(posts.last())
        return posts.last()

    }

    fun update(post: Post): Boolean {
        TODO()
    }


}
