package com.facebook.webpsupport;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.webpcompat.WebpCompatManager;
import com.taobao.android.dexposed.DexposedBridge;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.facebook.webpsupport.a */
final class C14641a {
    /* renamed from: a */
    static Bitmap m42343a(FileDescriptor fileDescriptor) {
        if (VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeFileDescriptorMethod, null, new Object[]{fileDescriptor, null, null});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Bitmap m42344a(FileDescriptor fileDescriptor, Rect rect, Options options) {
        if (VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeFileDescriptorMethod, null, new Object[]{fileDescriptor, rect, options});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Bitmap m42345a(InputStream inputStream) {
        if (VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeStream(inputStream);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeStreamMethod, null, new Object[]{inputStream, null, null});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Bitmap m42346a(InputStream inputStream, Rect rect, Options options) {
        if (VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeStreamMethod, null, new Object[]{inputStream, rect, options});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Bitmap m42347a(String str) {
        if (VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeFile(str);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeFileMethod, null, new Object[]{str, null});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Bitmap m42348a(String str, Options options) {
        if (VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeFile(str, options);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeFileMethod, null, new Object[]{str, options});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Bitmap m42349a(byte[] bArr, int i, int i2, Options options) {
        if (VERSION.SDK_INT > 17) {
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
        try {
            return (Bitmap) DexposedBridge.invokeOriginalMethod(WebpCompatManager.decodeByteArrayMethod, null, new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), options});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
