# SimpleButtonApp

This is a simple Android App using `Button` and `Toast` to display message. 
When `Button` is clicked its relevent `Toast` for clicked `Button` is displayed.

# Includes

* Implementing `setOnClickListener` for `Button`
* How to use `res/values/style.xml` for UI elements
* How to use `res/values/string.xml` to separate strings from JAVA code

## Implementing `setOnClickListener` for `Button`

- Add a `Button` in layout 
```
<Button
      android:text="@string/btn_text_steamer"
      android:id="@+id/btn_streamer"
      android:layout_below="@+id/main_text"
      android:layout_marginTop="@dimen/element_spacer"
      style="@style/Btn"
      />
```

- Create a `Button` object in 'onCreate' method of Activity with same button id defined in layout xml
````
Button BtnSteamer = (Button)findViewById(R.id.btn_streamer);
````

- Set `setOnClickListener` listener on `Button` object
````
 BtnSteamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // modify
            }
        });
````

## use `res/values/style.xml` for UI elements

- A style resource defines the format and look for a UI. A style can be applied to an individual `View` (from within a layout file) or to an entire `Activity` or application
- Elements:
  * `<resources>` : **Required**. This must be the root node. 
  * `<style>` : Defines a single style. Contains `<item>` elements. 
  * `<item>` : Defines a single property for the style. Must be a child of a `<style>` element.
- Create a `style` that you think would be re-used. In this case it is used for all `Button`s in app
```
<style name="Btn">
        <item name="android:textColor">@color/colorBlack</item>
        <item name="android:textAllCaps">true</item>
        <item name="android:background">@color/colorOrange</item>
        <item name="android:width">@dimen/btn_width</item>
        <item name="android:layout_marginTop">@dimen/btn_margin_top</item>
        <item name="android:layout_centerHorizontal">true</item>
        <item name="android:layout_width">wrap_content</item>
        <item name="android:layout_height">wrap_content</item>
    </style>
```
- Use this style for 'Button' in layout xml
````
<Button
      ....
      style="@style/Btn"
      ....
      />
````
## `res/values/string.xml` to separate strings 
- A string resource provides text strings for your application with optional text styling and formatting. 
- Create strings in `string.xml`
```
<resources>
    ...
    <string name="btn_text_steamer">Spotify Streamer</string>
    ...
</resources>
````
- Using this string in layout 
````
<Button
      .....
      android:text="@string/btn_text_steamer"
      .....     
      />
````
- Using String in Java file 
```
R.string.toast_text_steamer
```
**Note:** return `Integer` resource object 

# Contribution
This guide helps beginners. 
Please feel free to contribute . 
Suggestions are highly appreciated. 
Thank :-)
