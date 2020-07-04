package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;

/* renamed from: com.twitter.sdk.android.tweetcomposer.h */
final class C46991h {
    /* renamed from: a */
    private static boolean m146912a(Uri uri) {
        return "com.android.providers.media.documents".equalsIgnoreCase(uri.getAuthority());
    }

    /* renamed from: b */
    private static boolean m146913b(Uri uri) {
        return C38347c.f99553h.equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: c */
    private static boolean m146914c(Uri uri) {
        return "file".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: a */
    static String m146910a(File file) {
        String a = m146911a(file.getName());
        if (!TextUtils.isEmpty(a)) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(a);
        }
        return "application/octet-stream";
    }

    /* renamed from: a */
    private static String m146911a(String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        if (lastIndexOf < 0) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    /* renamed from: a */
    static String m146908a(Context context, Uri uri) {
        boolean z;
        if (VERSION.SDK_INT >= 19) {
            z = true;
        } else {
            z = false;
        }
        if (z && m146912a(uri)) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            if (!"image".equals(split[0])) {
                return null;
            }
            return m146909a(context, Media.EXTERNAL_CONTENT_URI, "_id=?", new String[]{split[1]});
        } else if (m146913b(uri)) {
            return m146909a(context, uri, null, null);
        } else {
            if (m146914c(uri)) {
                return uri.getPath();
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m146909a(android.content.Context r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r1 = 0
            r3[r1] = r0
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ all -> 0x0035 }
            r6 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0035 }
            if (r7 == 0) goto L_0x002f
            boolean r8 = r7.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r8 == 0) goto L_0x002f
            java.lang.String r8 = "_data"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x002d }
            java.lang.String r8 = r7.getString(r8)     // Catch:{ all -> 0x002d }
            if (r7 == 0) goto L_0x002c
            r7.close()
        L_0x002c:
            return r8
        L_0x002d:
            r8 = move-exception
            goto L_0x0037
        L_0x002f:
            if (r7 == 0) goto L_0x0034
            r7.close()
        L_0x0034:
            return r0
        L_0x0035:
            r8 = move-exception
            r7 = r0
        L_0x0037:
            if (r7 == 0) goto L_0x003c
            r7.close()
        L_0x003c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.tweetcomposer.C46991h.m146909a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
