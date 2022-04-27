fun main(args: Array<String>) {
    val post1 = Post(id = 1)
    val post2 = Post(id = 2, text = "text")
    WallService.add(post1)
    WallService.update(post2)
}