fun main() {
    val drugName: String = Consumer().run()
    val producer = Producer().producerSetUp()
    listOf(
        "https://apteka-april.ru/search/$drugName",
        "https://vitaexpress.ru/search/?q=$drugName"
    ).forEach {
        val html = Parser().run(it)
        val siteName = it.substringAfter("//").substringBefore("/")
        Producer().send(html, siteName, producer)
    }
    Producer().close(producer)
}
