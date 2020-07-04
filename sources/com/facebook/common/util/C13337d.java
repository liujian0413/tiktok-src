package com.facebook.common.util;

import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.ContactsContract;
import android.provider.MediaStore.Images.Media;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.facebook.common.util.d */
public final class C13337d {

    /* renamed from: a */
    private static final Uri f35252a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    /* renamed from: a */
    public static Uri m39031a(File file) {
        return Uri.fromFile(file);
    }

    /* renamed from: c */
    public static boolean m39035c(Uri uri) {
        return "file".equals(m39043k(uri));
    }

    /* renamed from: d */
    public static boolean m39036d(Uri uri) {
        return C38347c.f99553h.equals(m39043k(uri));
    }

    /* renamed from: g */
    public static boolean m39039g(Uri uri) {
        return "asset".equals(m39043k(uri));
    }

    /* renamed from: h */
    public static boolean m39040h(Uri uri) {
        return "res".equals(m39043k(uri));
    }

    /* renamed from: i */
    public static boolean m39041i(Uri uri) {
        return "android.resource".equals(m39043k(uri));
    }

    /* renamed from: j */
    public static boolean m39042j(Uri uri) {
        return "data".equals(m39043k(uri));
    }

    /* renamed from: k */
    private static String m39043k(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    /* renamed from: a */
    public static Uri m39030a(int i) {
        return new Builder().scheme("res").path(String.valueOf(i)).build();
    }

    /* renamed from: b */
    public static boolean m39034b(Uri uri) {
        String k = m39043k(uri);
        if (WebKitApi.SCHEME_HTTPS.equals(k) || WebKitApi.SCHEME_HTTP.equals(k)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static URL m39033a(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public static boolean m39037e(Uri uri) {
        if (!m39036d(uri) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(f35252a.getPath())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m39038f(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m39032a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            boolean r0 = m39036d(r9)
            r1 = 0
            if (r0 == 0) goto L_0x0038
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x002a
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0028 }
            if (r9 == 0) goto L_0x002a
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x0028 }
            r0 = -1
            if (r9 == r0) goto L_0x002a
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0028 }
            r1 = r9
            goto L_0x002a
        L_0x0028:
            r9 = move-exception
            goto L_0x0032
        L_0x002a:
            if (r8 == 0) goto L_0x0042
            r8.close()
            goto L_0x0042
        L_0x0030:
            r9 = move-exception
            r8 = r1
        L_0x0032:
            if (r8 == 0) goto L_0x0037
            r8.close()
        L_0x0037:
            throw r9
        L_0x0038:
            boolean r8 = m39035c(r9)
            if (r8 == 0) goto L_0x0042
            java.lang.String r1 = r9.getPath()
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.util.C13337d.m39032a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
