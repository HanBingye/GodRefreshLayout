
## 下拉刷新框架
>如何依赖此项目

~~~java
allprojects {
    repositories {
        ...
	maven { url 'https://www.jitpack.io' }
		}
}

dependencies {
    implementation 'com.github.HanBingye:GodRefreshLayout:Tag'
	}
~~~