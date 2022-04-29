class Comments (
    val id: Int? = null,
    val text: String? = null,
    val fromId: Int? = null,
    val date: Int? = null,
    val donut: Donut? = null,
    val replyToUser: Int? = null,
    val replyToComment: Int? = null,
    val attachment: Array<Attachments>? = null,
    val thread: Thread? = null
)
