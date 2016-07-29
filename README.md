# nougat-boot-animation
<!-- Nougat Boot Animation -->

##Effect

<img   src="https://raw.githubusercontent.com/ybq/nougat-boot-animation/master/art/effect.gif" width="200px" height="200px"/>

## Gradle Dependency

  1. Add the JitPack repository to your build file

	```gradle
	allprojects {
				repositories {
					...
					maven { url "https://jitpack.io" }
				}
	}
	```

  2. Add the dependency

    ```gradle
    dependencies {
        compile 'com.github.ybq:Android-SpinKit:1.0.5'
        compile 'com.github.ybq:nougat-boot-animation:1.0.0'
     }
    ```
   (or download and include the [NougatBoot.java](https://raw.githubusercontent.com/ybq/nougat-boot-animation/master/library/src/main/java/com/github/ybq/nougatbootanimation/NougatBoot.java) in your project)


## Usage
 
```java
ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbar);
Drawable nougatBoot = new NougatBoot();
progressBar.setIndeterminateDrawable(nougatBoot);
```

## Acknowledgements
- [http://codepen.io/stevn/pen/kXyKjQ](http://codepen.io/stevn/pen/kXyKjQ).



