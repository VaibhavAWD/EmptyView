# EmptyView

This is a custom empty view library which contains a image and two text views to display empty image, title and subtitle respectively.

Add Dependency

Add this dependency to the module level `build.gradle` file

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add this dependency to the app level `build.gradle` file

```groovy
dependencies {
        implementation 'com.github.VaibhavAWD:EmptyView:v1.0.0'
}
```

**Example**

```xml
<com.vaibhavdhunde.library.empty_view.EmptyView
    android:id="@+id/empty_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:empty_image="@drawable/ic_empty_notes"
    app:empty_title="No Notes Found"
    app:empty_subtitle="Start adding notes by clicking the button below" />
```

```kotlin
empty_view.setEmptyViewImage(R.drawable.ic_empty_notes)
empty_view.setEmptyViewTitle("No Notes Found")
empty_view.setEmptyViewSubtitle("Start adding notes by clicking the button below")
```

More improvements coming in the future releases.
