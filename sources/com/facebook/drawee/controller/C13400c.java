package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;

/* renamed from: com.facebook.drawee.controller.c */
public class C13400c<INFO> implements C13401d<INFO> {
    private static final C13401d<Object> NO_OP_LISTENER = new C13400c();

    public static <INFO> C13401d<INFO> getNoOpListener() {
        return NO_OP_LISTENER;
    }

    public void onFailure(String str, Throwable th) {
    }

    public void onFinalImageSet(String str, INFO info, Animatable animatable) {
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    public void onIntermediateImageSet(String str, INFO info) {
    }

    public void onRelease(String str) {
    }

    public void onSubmit(String str, Object obj) {
    }
}
