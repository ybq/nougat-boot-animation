# nougat-boot-animation
Android 7.0 Nougat Boot Animation 

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

## License
The MIT License (MIT) 

Copyright © 2016 ybq

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


