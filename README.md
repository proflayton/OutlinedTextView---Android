OutlinedTextView---Android
==========================

An OutlinedTextView in android

#Example
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="130dp"
    android:minHeight="130dp"
    android:paddingTop="5dp"
    android:paddingBottom="5dp"
    android:background="#BBB" >
 <com.brandonlayton.view.OutlinedTextView
        android:id="@+id/outlinedTextView"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:stroke_color="#333"
        app:stroke_width="10"
        android:gravity="center"
        android:text="50%"
        android:textStyle="italic|bold"
        android:textAppearance="?android:attr/textAppearanceSmall"
        android:textColor="#00CC00" />
</LinearLayout>
```
