package com.p280ss.android.newmedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.FileProvider;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.ss.android.newmedia.d */
public final class C19929d {
    /* renamed from: a */
    public static int m65752a(int i) {
        switch (i) {
            case 12:
                return R.string.dxn;
            case 13:
                return R.string.dxj;
            case 14:
                return R.string.dxm;
            case 15:
                return R.string.dxl;
            case 16:
                return R.string.dxr;
            case 17:
                return R.string.dxi;
            case 19:
                return R.string.dxs;
            default:
                return R.string.dxt;
        }
    }

    /* renamed from: a */
    public static boolean m65759a(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        if (str.toLowerCase().startsWith("http://") || str.toLowerCase().startsWith("https://")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m65758a(Activity activity, Fragment fragment, int i) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            C9738o.m28694a((Context) activity, (int) R.drawable.wt, (int) R.string.ctz);
            return;
        }
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        if (fragment != null) {
            try {
                fragment.startActivityForResult(intent, i);
            } catch (Exception unused) {
                C9738o.m28694a((Context) activity, (int) R.drawable.wt, (int) R.string.ctx);
            }
            return;
        }
        activity.startActivityForResult(intent, i);
    }

    /* renamed from: b */
    public static String m65760b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return m65755a(Long.valueOf(str).longValue());
    }

    /* renamed from: a */
    private static String m65755a(long j) {
        StringBuilder sb = new StringBuilder();
        do {
            long j2 = j % 23;
            j /= 23;
            if (j2 > 9) {
                sb.insert(0, (char) ((int) ((j2 + 97) - 10)));
            } else {
                sb.insert(0, j2);
            }
        } while (j != 0);
        return sb.toString();
    }

    /* renamed from: a */
    public static int m65753a(Context context, Throwable th) {
        int i;
        if (th instanceof ConnectTimeoutException) {
            i = 13;
        } else if (th instanceof SocketTimeoutException) {
            i = 14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    i = 21;
                } else if (th instanceof HttpResponseException) {
                    if (((HttpResponseException) th).getStatusCode() == 503) {
                        i = 19;
                    } else {
                        i = 16;
                    }
                } else if (!(th instanceof IOException)) {
                    i = 18;
                }
            }
            i = 15;
        }
        if (context == null) {
            return i;
        }
        if ((i == 15 || i == 14) && !C19931e.m65761a(context)) {
            return 12;
        }
        return i;
    }

    /* renamed from: a */
    public static Uri m65754a(Context context, File file) {
        if (context == null || VERSION.SDK_INT < 24 || context.getApplicationInfo().targetSdkVersion < 24) {
            return Uri.fromFile(file);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".fileprovider");
        return FileProvider.getUriForFile(context, sb.toString(), file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c4, code lost:
        if (r12 != null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d6, code lost:
        if (r12 != null) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016a, code lost:
        if (r6 != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0178, code lost:
        if (r6 != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01d1 A[SYNTHETIC, Splitter:B:111:0x01d1] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173 A[SYNTHETIC, Splitter:B:76:0x0173] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m65756a(android.content.Context r12, android.net.Uri r13) {
        /*
            r0 = 0
            if (r13 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r13.getScheme()
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r1)
            if (r2 != 0) goto L_0x01db
            java.lang.String r2 = "file"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0018
            goto L_0x01db
        L_0x0018:
            java.lang.String r2 = "http"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0025
            java.lang.String r12 = r13.toString()
            return r12
        L_0x0025:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L_0x013d
            boolean r2 = android.provider.DocumentsContract.isDocumentUri(r12, r13)
            if (r2 == 0) goto L_0x013d
            java.lang.String r2 = "com.android.externalstorage.documents"
            java.lang.String r6 = r13.getAuthority()
            boolean r2 = android.text.TextUtils.equals(r2, r6)
            if (r2 == 0) goto L_0x006e
            java.lang.String r2 = android.provider.DocumentsContract.getDocumentId(r13)
            java.lang.String r6 = ":"
            java.lang.String[] r2 = r2.split(r6)
            r6 = r2[r5]
            java.lang.String r7 = "primary"
            boolean r6 = r7.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x013d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.io.File r13 = android.os.Environment.getExternalStorageDirectory()
            r12.append(r13)
            java.lang.String r13 = "/"
            r12.append(r13)
            r13 = r2[r4]
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            return r12
        L_0x006e:
            java.lang.String r2 = "com.android.providers.downloads.documents"
            java.lang.String r6 = r13.getAuthority()
            boolean r2 = android.text.TextUtils.equals(r2, r6)
            if (r2 == 0) goto L_0x00f8
            java.lang.String r1 = android.provider.DocumentsContract.getDocumentId(r13)
            if (r1 == 0) goto L_0x008e
            java.lang.String r2 = "raw:"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x008e
            r12 = 4
            java.lang.String r12 = r1.substring(r12)
            return r12
        L_0x008e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 >= r3) goto L_0x00a7
            java.lang.String r2 = "content://downloads/public_downloads"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r3 = r1.longValue()
            android.net.Uri r1 = android.content.ContentUris.withAppendedId(r2, r3)
            goto L_0x00a8
        L_0x00a7:
            r1 = r13
        L_0x00a8:
            java.lang.String r1 = m65757a(r12, r1, r0, r0)
            if (r1 != 0) goto L_0x00f7
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x00f7 }
            java.io.File r3 = r12.getCacheDir()     // Catch:{ IOException -> 0x00f7 }
            java.lang.String r4 = "tmp"
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x00f7 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ IOException -> 0x00f7 }
            android.content.ContentResolver r12 = r12.getContentResolver()     // Catch:{ IOException -> 0x00f7 }
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r13, r3)     // Catch:{ IOException -> 0x00f7 }
            if (r12 != 0) goto L_0x00ca
            return r0
        L_0x00ca:
            java.io.FileDescriptor r12 = r12.getFileDescriptor()     // Catch:{ IOException -> 0x00f7 }
            java.io.FileInputStream r13 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f7 }
            r13.<init>(r12)     // Catch:{ IOException -> 0x00f7 }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00f7 }
            r12.<init>(r2)     // Catch:{ IOException -> 0x00f7 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x00f7 }
        L_0x00dc:
            int r3 = r13.read(r0)     // Catch:{ IOException -> 0x00f7 }
            r4 = -1
            if (r3 == r4) goto L_0x00e7
            r12.write(r0, r5, r3)     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00dc
        L_0x00e7:
            r13.close()     // Catch:{ IOException -> 0x00f7 }
            r12.close()     // Catch:{ IOException -> 0x00f7 }
            java.io.File r12 = new java.io.File     // Catch:{ IOException -> 0x00f7 }
            r12.<init>(r2)     // Catch:{ IOException -> 0x00f7 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x00f7 }
            return r12
        L_0x00f7:
            return r1
        L_0x00f8:
            java.lang.String r2 = "com.android.providers.media.documents"
            java.lang.String r6 = r13.getAuthority()
            boolean r2 = android.text.TextUtils.equals(r2, r6)
            if (r2 == 0) goto L_0x013d
            java.lang.String r13 = android.provider.DocumentsContract.getDocumentId(r13)
            java.lang.String r1 = ":"
            java.lang.String[] r13 = r13.split(r1)
            r1 = r13[r5]
            java.lang.String r2 = "image"
            boolean r2 = android.text.TextUtils.equals(r2, r1)
            if (r2 == 0) goto L_0x011b
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto L_0x0130
        L_0x011b:
            java.lang.String r2 = "video"
            boolean r2 = android.text.TextUtils.equals(r2, r1)
            if (r2 == 0) goto L_0x0126
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto L_0x0130
        L_0x0126:
            java.lang.String r2 = "audio"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            if (r1 == 0) goto L_0x0130
            android.net.Uri r0 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        L_0x0130:
            java.lang.String[] r1 = new java.lang.String[r4]
            r13 = r13[r4]
            r1[r5] = r13
            java.lang.String r13 = "_id=?"
            java.lang.String r12 = m65757a(r12, r0, r13, r1)
            return r12
        L_0x013d:
            java.lang.String r2 = "content"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01da
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r2 = "_data"
            r1[r5] = r2
            java.lang.String r2 = ""
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch:{ Exception -> 0x0177, all -> 0x016f }
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r13
            r8 = r1
            android.database.Cursor r6 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0177, all -> 0x016f }
            boolean r0 = r6.moveToFirst()     // Catch:{ Exception -> 0x0178, all -> 0x016d }
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = r6.getString(r5)     // Catch:{ Exception -> 0x0178, all -> 0x016d }
            r2 = r0
        L_0x0165:
            if (r6 == 0) goto L_0x016a
            r6.close()     // Catch:{ Exception -> 0x0178, all -> 0x016d }
        L_0x016a:
            if (r6 == 0) goto L_0x017d
            goto L_0x017a
        L_0x016d:
            r12 = move-exception
            goto L_0x0171
        L_0x016f:
            r12 = move-exception
            r6 = r0
        L_0x0171:
            if (r6 == 0) goto L_0x0176
            r6.close()     // Catch:{ Exception -> 0x0176 }
        L_0x0176:
            throw r12
        L_0x0177:
            r6 = r0
        L_0x0178:
            if (r6 == 0) goto L_0x017d
        L_0x017a:
            r6.close()     // Catch:{ Exception -> 0x017d }
        L_0x017d:
            r0 = r6
            boolean r6 = com.bytedance.common.utility.C6319n.m19593a(r2)
            if (r6 == 0) goto L_0x01d9
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            java.lang.String r9 = "_id= ?"
            java.lang.String r12 = r13.getLastPathSegment()     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            if (r13 < r3) goto L_0x01a8
            boolean r13 = com.bytedance.common.utility.C6319n.m19593a(r12)     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            if (r13 != 0) goto L_0x01a8
            java.lang.String r13 = ":"
            boolean r13 = r12.contains(r13)     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            if (r13 == 0) goto L_0x01a8
            java.lang.String r13 = ":"
            java.lang.String[] r12 = r12.split(r13)     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            r12 = r12[r4]     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
        L_0x01a8:
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            r10[r5] = r12     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            r11 = 0
            r8 = r1
            android.database.Cursor r12 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01d5, all -> 0x01ce }
            boolean r13 = r12.moveToFirst()     // Catch:{ Exception -> 0x01d6, all -> 0x01ca }
            if (r13 == 0) goto L_0x01bf
            java.lang.String r13 = r12.getString(r5)     // Catch:{ Exception -> 0x01d6, all -> 0x01ca }
            r2 = r13
        L_0x01bf:
            if (r12 == 0) goto L_0x01c4
            r12.close()     // Catch:{ Exception -> 0x01d6, all -> 0x01ca }
        L_0x01c4:
            if (r12 == 0) goto L_0x01d9
        L_0x01c6:
            r12.close()     // Catch:{ Exception -> 0x01d9 }
            goto L_0x01d9
        L_0x01ca:
            r13 = move-exception
            r0 = r12
            r12 = r13
            goto L_0x01cf
        L_0x01ce:
            r12 = move-exception
        L_0x01cf:
            if (r0 == 0) goto L_0x01d4
            r0.close()     // Catch:{ Exception -> 0x01d4 }
        L_0x01d4:
            throw r12
        L_0x01d5:
            r12 = r0
        L_0x01d6:
            if (r12 == 0) goto L_0x01d9
            goto L_0x01c6
        L_0x01d9:
            return r2
        L_0x01da:
            return r0
        L_0x01db:
            java.lang.String r12 = r13.getPath()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.C19929d.m65756a(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r7 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r7 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m65757a(android.content.Context r7, android.net.Uri r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r1 = 0
            r3[r1] = r0
            r0 = 0
            android.content.ContentResolver r1 = r7.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x003a, all -> 0x0032 }
            r6 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x003a, all -> 0x0032 }
            if (r7 == 0) goto L_0x002f
            boolean r8 = r7.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x003b, all -> 0x002d }
            if (r8 == 0) goto L_0x002f
            java.lang.String r8 = "_data"
            int r8 = r7.getColumnIndexOrThrow(r8)     // Catch:{ IllegalArgumentException -> 0x003b, all -> 0x002d }
            java.lang.String r8 = r7.getString(r8)     // Catch:{ IllegalArgumentException -> 0x003b, all -> 0x002d }
            if (r7 == 0) goto L_0x002c
            r7.close()
        L_0x002c:
            return r8
        L_0x002d:
            r8 = move-exception
            goto L_0x0034
        L_0x002f:
            if (r7 == 0) goto L_0x0040
            goto L_0x003d
        L_0x0032:
            r8 = move-exception
            r7 = r0
        L_0x0034:
            if (r7 == 0) goto L_0x0039
            r7.close()
        L_0x0039:
            throw r8
        L_0x003a:
            r7 = r0
        L_0x003b:
            if (r7 == 0) goto L_0x0040
        L_0x003d:
            r7.close()
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.C19929d.m65757a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
