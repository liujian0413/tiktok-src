package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;

/* renamed from: com.facebook.drawee.controller.d */
public interface C13401d<INFO> {
    void onFailure(String str, Throwable th);

    void onFinalImageSet(String str, INFO info, Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th);

    void onIntermediateImageSet(String str, INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
