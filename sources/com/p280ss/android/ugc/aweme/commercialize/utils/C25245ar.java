package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.common.utility.p482io.C9734a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ar */
public final class C25245ar {
    /* renamed from: a */
    public static String m82990a(String str) {
        GZIPOutputStream gZIPOutputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(str.getBytes());
                C9734a.m28682a((Closeable) gZIPOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C9734a.m28682a((Closeable) byteArrayOutputStream);
                return Base64.encodeToString(byteArray, 0);
            } catch (Throwable th) {
                C9734a.m28682a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (IOException | UnsupportedEncodingException unused) {
            return null;
        }
    }
}
