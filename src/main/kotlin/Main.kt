import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
suspend fun main() {
    // The runBlocking function blocks the current thread until the execution of the code it contains.
    runBlocking {
        launch { playBeats("x---x---x---x---x", "crash_cymbal.aiff") }
        playBeats("--x--x--x--x", "toms.aiff")
    }
}