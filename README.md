# jetpack-compose_webapi
JetpackComposeを使ってWebAPIを呼び出すサンプルアプリ

# DEMO
![Screenshot_2022-03-31-14-50-30-274](https://user-images.githubusercontent.com/57470883/160985484-d6a94534-9b2a-4554-9ba6-7c803702fc8a.jpeg)
 
# Features
GitHubのアカウント名からアカウント情報を取得することができるアプリ。  
JetpackComposeを用いて、Android公式アーキテクチャのMVVMで実装している。
 
# Requirement
以下のライブラリを使用している。
 
* OkHttp / Retrofit - WebAPI
* Kotlin Serialization - Jsonパーサ
* ViewModel - MVVM
* Compose - 宣言的UI
* Hilt - DI
 
# Installation
開発環境
```
Android Studio Bumblebee | 2021.1.1 Patch 2
Build #AI-211.7628.21.2111.8193401, built on February 17, 2022
Runtime version: 11.0.11+9-b60-7590822 amd64
VM: OpenJDK 64-Bit Server VM by Oracle Corporation
Windows 10 10.0
GC: G1 Young Generation, G1 Old Generation
Memory: 1280M
Cores: 8
Registry: external.system.auto.import.disabled=true
Non-Bundled Plugins: IdeaVIM (1.9.2), co.notime.intellijPlugin.backgroundImagePlus (1.2.1), dev.polek.adbwifi (1.2.4), idea.plugin.protoeditor (2.3.1), net.vektah.codeglance (1.5.4), some.awesome (1.14), wu.seal.tool.jsontokotlin (3.7.2), org.jetbrains.kotlin (211-1.6.10-release-923-AS7442.40), com.developerphil.adbidea (1.6.4)
```
 
# Usage
テキストボックスにGitHubのアカウント名を入力し、「検索」をタップする。
 
# Note
注意点: 開発環境やライブラリのバージョンによってはビルドできない。
