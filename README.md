Simple Roboto TextView
======================

A simple Roboto View for your Android App writed in Kotlin

Gradle
------
```
dependencies {
    ...
    compile 'com.gorrotowi.simplerobototextview:simplerobototextview:0.8'
}
```

Maven
-----
```
<dependency>
  <groupId>com.gorrotowi.simplerobototextview</groupId>
  <artifactId>simplerobototextview</artifactId>
  <version>0.8</version>
  <type>pom</type>
</dependency>
```

Usage
-----
```xml
<com.gorrotowi.simplerobototextview.RobotoTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        app:font="regular" />
```

Fonts you can use
-----------------
```
black
blackItalic
bold
boldItalic
italic
light
lightItalic
medium
mediumItalic
regular
thin
thinItalic
condensedBold
condensedBoldItalic
condensedItalic
condensedLight
condensedLightItalic
condensedRegular
```
