# WeatherChartView
A simple line chart view of weather for android.

![image](https://github.com/kaku2015/WeatherChartView/blob/master/sample/screenshots/show.png)

# Usage
In the layout file, just introduce the custom View.

```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:wcv="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/black">

    <com.kaku.wcv.WeatherChartView
        android:id="@+id/line_char"
        android:layout_width="match_parent"
        android:layout_height="150dp"
        android:layout_centerInParent="true"
        wcv:dayColor="@color/colorAccent"
        wcv:nightColor="@color/colorPrimary"
        wcv:textColor="@android:color/white"
        wcv:textSize="14sp"/>
</RelativeLayout>
```
Dynamic set values of day and night temperature in Activity.

```
WeatherChartView mCharView = (WeatherChartView) findViewById(R.id.line_char);
// set day
mCharView.setTempDay(new int[]{1, 2, 5, 6, -1, -2});
// set night
mCharView.setTempNight(new int[]{-1, -2, 0, -3, -5, -6});
mCharView.invalidate();
```
# Note
Default display 6 days of weather, if there is a need to be able to modify their own.

# License
  ```
   Copyright (c) 2016 Kaku咖枯 <kaku201313@163.com | 3772304@qq.com>

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
