package com.facebook.common.p689f;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import java.io.FileDescriptor;

/* renamed from: com.facebook.common.f.b */
public interface C13294b {

    /* renamed from: com.facebook.common.f.b$a */
    public interface C13295a {
        void onWebpErrorLog(String str, String str2);
    }

    Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, Options options);

    void setBitmapCreator(C13293a aVar);

    void setWebpErrorLogger(C13295a aVar);
}
