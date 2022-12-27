import twitter4j.Twitter
    fun main(args: Array<String>) {
        val twitter = Twitter.newBuilder()
            .oAuthConsumer("ConsumerKey","ConsumerSecret")
            .oAuthAccessToken("AccessToken", "AccessTokenSecret")
            .build()
        twitter.v1().tweets().updateStatus("Kotlinでtwitter4jを使った初めてのツイート")
    }