package com.camino.lockscreenwidget;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by camino on 5/9/15.
 */
public class WidgetConfig extends Activity {

    private static final String TAG = WidgetConfig.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }
}
