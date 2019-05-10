# CustomLibrary
a customized and commonly used component library.

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Moooq:CustomLibrary:v1.0.1'
	}
  
  ScrollNoticeView 垂直滚动的通告栏;
  ProgressSuccessFailedView 仿支付宝支付动画;
