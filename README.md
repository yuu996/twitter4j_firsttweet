#twitter4jを使ったツイート方法

## 環境
OS:Windows10

IDE:IntelliJ Ultimate & Community(どちらか一つで大丈夫です)


## 手順
1. Gradleを使用してプロジェクトを作成する
2. build.gradle.ktsに以下の文を追加する

<!-- add build.gradle.kts-------------------------------------------------------------------------------------------------------------------------- -->
dependencies {
    implementation("org.twitter4j:twitter4j-core:4.1.2")
}
<!-- ---------------------------------------------------------------------------------------------------------------------------------------------- -->

※公式ではcompileを使っているが、compileは使えないので、gradle7.6ではimplementationを使う

3. ファイルからキャッシュの破棄を選択し、自動的に再起動する。
4. import twitter4jと打って、途中でtwitter4jがコード補完に出てくることを確認する。


# how to tweet with twitter4j

## Step
1. make project with Gradle
2. add build.gradle.kts in "add build.gradle.kts"
- ※cannot use compile. substitute implementation
3. refresh cache and restart IDE

詳しくはこちらをご覧ください。
Check here for details
https://twitter4j.org/
