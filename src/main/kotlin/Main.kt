fun main(args: Array<String>) {
    val post1 = Post(id = 1)
    val post2 = Post(id = 2, text = "text")
    WallService.add(post1)
    WallService.update(post2)

    val attachment1: Attachments = VideoAttachment(Video(1,"video"))
    val attachment2: Attachments = AudioAttachment(Audio(1,"Skrillex"))
    val attachment3: Attachments = AlbumAttachment(Album(1,"Album"))
    val attachment4: Attachments = GraffitiAttachment(Graffiti(1,"http://graffiti.ru"))
    val attachment5: Attachments = PhotoAttachment(Photo(1,1))

    println(attachment1.type)
    println(attachment2.type)
    println(attachment3.type)
    println(attachment4.type)
    println(attachment5.type)
}