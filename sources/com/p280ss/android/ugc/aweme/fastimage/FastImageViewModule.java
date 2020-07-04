package com.p280ss.android.ugc.aweme.fastimage;

import android.app.Activity;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;

/* renamed from: com.ss.android.ugc.aweme.fastimage.FastImageViewModule */
class FastImageViewModule extends ReactContextBaseJavaModule {
    public String getName() {
        return "FastImageView";
    }

    FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void preload(final ReadableArray readableArray) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new Runnable() {
                public final void run() {
                    for (int i = 0; i < readableArray.size(); i++) {
                        C13380c.m39172c().mo33182c(ImageRequest.fromUri(readableArray.getMap(i).getString("uri")), currentActivity.getApplicationContext());
                    }
                }
            });
        }
    }
}
