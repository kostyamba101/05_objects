object WallService {
    private var posts = emptyArray<Post>()
    private var postId = 0
    private var comments = emptyArray<Comments>()

    fun add(post: Post): Post {
        posts += post.copy(id = postId)
        postId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()){
            if (item.id == post.id) {
                posts[index] = post.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comments, postId: Int): Comments {
        for (post in posts){
            if (post.id == postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Такой пост не найден")
    }

}