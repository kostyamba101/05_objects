fun main(args: Array<String>) {
    val post1 = Post(id = 1)
    val post2 = Post(id = 2, text = "text")
    WallService.add(post1)
    WallService.update(post2)

    val comments = Comments(10, "коммент к посту")

    WallService.createComment(comments, 0)
    println(comments.text)
}