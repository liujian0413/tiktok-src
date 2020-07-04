package com.facebook.imagepipeline.p721h;

import com.facebook.imagepipeline.p724k.C13702ap;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.facebook.imagepipeline.h.c */
public interface C13653c extends C13702ap {
    void onRequestCancellation(String str);

    void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z);

    void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z);

    void onRequestSuccess(ImageRequest imageRequest, String str, boolean z);
}
