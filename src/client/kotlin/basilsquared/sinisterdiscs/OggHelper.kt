package basilsquared.sinisterdiscs


import java.io.File
import java.io.RandomAccessFile
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.math.ceil

object OggHelper {

    fun findSoundFile(root: File, namespace: String, path: String): File {

        val pathh = "../resources/main/assets/$namespace/sounds/records/$path.ogg"



            val f = File(root, pathh)
            return f



    }

    fun getOggDuration(file: File): Float {
        RandomAccessFile(file, "r").use { raf ->
            val headerBuffer = ByteArray(128)
            raf.read(headerBuffer)


            var sampleRate = 44100
            for (i in 0 until 100) {

                if (headerBuffer[i] == 0x01.toByte() && headerBuffer[i+1] == 0x76.toByte()) {
                    sampleRate = ByteBuffer.wrap(headerBuffer, i + 12, 4)
                        .order(ByteOrder.LITTLE_ENDIAN).int
                    break
                }
            }


            val length = raf.length()
            val scanSize = 6000L.coerceAtMost(length)
            val footerBuffer = ByteArray(scanSize.toInt())
            raf.seek(length - scanSize)
            raf.readFully(footerBuffer)

            var lastGranule: Long = 0
            for (i in footerBuffer.indices.reversed()) {

                if (footerBuffer[i] == 0x4F.toByte() && footerBuffer[i+3] == 0x53.toByte()) {
                    lastGranule = ByteBuffer.wrap(footerBuffer, i + 6, 8)
                        .order(ByteOrder.LITTLE_ENDIAN).long
                    break
                }
            }

            if (sampleRate == 0) return 20f
            return ceil(lastGranule.toDouble() / sampleRate.toDouble()).toFloat()
        }
    }
}