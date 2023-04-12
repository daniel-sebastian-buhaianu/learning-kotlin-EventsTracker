// holds the details of the event entered by the user
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int
)

fun main() {
    
    // test code functionality
    val event = Event(
        "Study Kotlin",
        "Commit to studying Kotlin at least 15 minutes per day",
        "Evening",
        15
    ).toString()
    println(event)
}