import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import java.util.*

class Producer() {
    fun producerSetUp(): KafkaProducer<String, String> {
        val props = Properties()
        props.load(this.javaClass.getResourceAsStream("producer.properties"))
        return KafkaProducer(props)
    }

    fun send(html: String, siteName: String, kafkaProducer: KafkaProducer<String, String>) {
        val producerRecord: ProducerRecord<String, String> = ProducerRecord("html", "html", html)
        kafkaProducer.send(producerRecord)
    }

    fun close(kafkaProducer: KafkaProducer<String, String>) {
        kafkaProducer.close()
    }
}
