package com.p280ss.android.chooser;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.C6319n;
import java.io.File;

/* renamed from: com.ss.android.chooser.b */
public class C19247b {

    /* renamed from: a */
    public static final String f52118a;

    /* renamed from: e */
    private static C19247b f52119e;

    /* renamed from: b */
    public int f52120b = 3000;

    /* renamed from: c */
    public int f52121c = 600000;

    /* renamed from: d */
    public C19249a f52122d;

    /* renamed from: com.ss.android.chooser.b$a */
    public interface C19249a {
        /* renamed from: a */
        String mo51064a(C19262f fVar);
    }

    /* renamed from: a */
    public static boolean m63092a(int i) {
        return 7 == i || 8 == i;
    }

    /* renamed from: c */
    private static boolean m63095c(int i) {
        return 6 == i;
    }

    /* renamed from: d */
    private static boolean m63096d(int i) {
        return 3 == i || 5 == i;
    }

    /* renamed from: e */
    private static boolean m63097e(int i) {
        return 2 == i || 4 == i;
    }

    private C19247b() {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM));
        sb.append(File.separator);
        sb.append("neihanduanzi");
        f52118a = sb.toString();
    }

    /* renamed from: a */
    public static C19247b m63089a() {
        if (f52119e == null) {
            synchronized (C19247b.class) {
                f52119e = new C19247b();
            }
        }
        return f52119e;
    }

    /* renamed from: b */
    public static int m63093b(int i) {
        if (m63097e(i)) {
            return 1;
        }
        if (m63095c(i)) {
            return 2;
        }
        if (m63096d(i)) {
            return 3;
        }
        if (m63092a(i)) {
            return 4;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        if (r13 != null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r13 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        return r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.chooser.C19262f m63090a(android.content.Context r13, java.lang.String r14) {
        /*
            r0 = 6
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_id"
            r7 = 0
            r3[r7] = r0
            java.lang.String r0 = "_data"
            r8 = 1
            r3[r8] = r0
            java.lang.String r0 = "date_modified"
            r9 = 2
            r3[r9] = r0
            java.lang.String r0 = "mime_type"
            r10 = 3
            r3[r10] = r0
            java.lang.String r0 = "_size"
            r11 = 4
            r3[r11] = r0
            java.lang.String r0 = "_data"
            r12 = 5
            r3[r12] = r0
            java.lang.String r4 = "_data= ?"
            java.lang.String[] r5 = new java.lang.String[r8]
            r5[r7] = r14
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            r0 = 0
            android.content.ContentResolver r1 = r13.getContentResolver()     // Catch:{ Exception -> 0x00a5, all -> 0x009d }
            r6 = 0
            android.database.Cursor r13 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00a5, all -> 0x009d }
            if (r13 == 0) goto L_0x0097
            boolean r1 = r13.moveToFirst()     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            if (r1 == 0) goto L_0x0097
            long r1 = r13.getLong(r7)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.lang.String r3 = r13.getString(r8)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            long r4 = r13.getLong(r9)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.lang.String r6 = r13.getString(r10)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            long r10 = r13.getLong(r11)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            java.lang.String r8 = r13.getString(r12)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            com.ss.android.chooser.f r12 = new com.ss.android.chooser.f     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            r12.<init>(r1)     // Catch:{ Exception -> 0x0095, all -> 0x0093 }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = "gif"
            boolean r0 = r6.contains(r0)     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            if (r0 == 0) goto L_0x0069
            r12.f52151d = r9     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            goto L_0x006b
        L_0x0069:
            r12.f52151d = r7     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
        L_0x006b:
            r12.f52149b = r3     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.f52150c = r4     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.f52153f = r10     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.f52154g = r6     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.f52155h = r8     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            android.util.Pair r14 = com.p280ss.android.chooser.C19255d.m63100a(r14)     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            if (r14 == 0) goto L_0x008f
            java.lang.Object r0 = r14.first     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.f52156i = r0     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            java.lang.Object r14 = r14.second     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
            r12.f52157j = r14     // Catch:{ Exception -> 0x0091, all -> 0x0093 }
        L_0x008f:
            r0 = r12
            goto L_0x0097
        L_0x0091:
            r0 = r12
            goto L_0x00a6
        L_0x0093:
            r14 = move-exception
            goto L_0x009f
        L_0x0095:
            goto L_0x00a6
        L_0x0097:
            if (r13 == 0) goto L_0x00a9
        L_0x0099:
            r13.close()
            goto L_0x00a9
        L_0x009d:
            r14 = move-exception
            r13 = r0
        L_0x009f:
            if (r13 == 0) goto L_0x00a4
            r13.close()
        L_0x00a4:
            throw r14
        L_0x00a5:
            r13 = r0
        L_0x00a6:
            if (r13 == 0) goto L_0x00a9
            goto L_0x0099
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.chooser.C19247b.m63090a(android.content.Context, java.lang.String):com.ss.android.chooser.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0073, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0077, code lost:
        if (r1 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r1 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        return r14;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0073 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.chooser.C19262f m63094b(android.content.Context r15, java.lang.String r16) {
        /*
            r0 = 7
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_id"
            r7 = 0
            r3[r7] = r0
            java.lang.String r0 = "_data"
            r8 = 1
            r3[r8] = r0
            java.lang.String r0 = "date_modified"
            r9 = 2
            r3[r9] = r0
            java.lang.String r0 = "mime_type"
            r10 = 3
            r3[r10] = r0
            java.lang.String r0 = "_size"
            r11 = 4
            r3[r11] = r0
            java.lang.String r0 = "_data"
            r12 = 5
            r3[r12] = r0
            java.lang.String r0 = "duration"
            r13 = 6
            r3[r13] = r0
            java.lang.String r4 = "_data= ?"
            java.lang.String[] r5 = new java.lang.String[r8]
            r5[r7] = r16
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            r14 = 0
            android.content.ContentResolver r1 = r15.getContentResolver()     // Catch:{ Exception -> 0x0085, all -> 0x007d }
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0085, all -> 0x007d }
            if (r1 == 0) goto L_0x0077
            boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            if (r0 == 0) goto L_0x0077
            long r2 = r1.getLong(r7)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            java.lang.String r0 = r1.getString(r8)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            long r4 = r1.getLong(r9)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            java.lang.String r6 = r1.getString(r10)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            long r9 = r1.getLong(r11)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            java.lang.String r7 = r1.getString(r12)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            long r11 = r1.getLong(r13)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            com.ss.android.chooser.f r13 = new com.ss.android.chooser.f     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            r13.<init>(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0073 }
            r13.f52151d = r8     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f52149b = r0     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f52150c = r4     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f52153f = r9     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f52154g = r6     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f52155h = r7     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r13.f52152e = r11     // Catch:{ Exception -> 0x0071, all -> 0x0073 }
            r14 = r13
            goto L_0x0077
        L_0x0071:
            r14 = r13
            goto L_0x0086
        L_0x0073:
            r0 = move-exception
            goto L_0x007f
        L_0x0075:
            goto L_0x0086
        L_0x0077:
            if (r1 == 0) goto L_0x0089
        L_0x0079:
            r1.close()
            goto L_0x0089
        L_0x007d:
            r0 = move-exception
            r1 = r14
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r1.close()
        L_0x0084:
            throw r0
        L_0x0085:
            r1 = r14
        L_0x0086:
            if (r1 == 0) goto L_0x0089
            goto L_0x0079
        L_0x0089:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.chooser.C19247b.m63094b(android.content.Context, java.lang.String):com.ss.android.chooser.f");
    }

    /* renamed from: a */
    public static void m63091a(Context context, String str, Handler handler, int i, int i2) {
        if (context != null && !C6319n.m19593a(str)) {
            C19256e.m63104a().mo51084c();
            Context applicationContext = context.getApplicationContext();
            String[] strArr = {str};
            final int i3 = i2;
            final Context context2 = context;
            final String str2 = str;
            final Handler handler2 = handler;
            C192481 r2 = new MediaScannerConnectionClient(100) {
                public final void onMediaScannerConnected() {
                }

                public final void onScanCompleted(String str, Uri uri) {
                    C19262f fVar;
                    boolean z = true;
                    if (1 != i3) {
                        z = false;
                    }
                    if (z) {
                        fVar = C19247b.m63094b(context2.getApplicationContext(), str2);
                    } else {
                        fVar = C19247b.m63090a(context2.getApplicationContext(), str2);
                    }
                    if (fVar == null) {
                        File file = new File(str2);
                        C19262f fVar2 = new C19262f(-1);
                        fVar2.f52153f = file.length();
                        fVar2.f52149b = str2;
                        fVar2.f52155h = str2;
                        fVar2.f52151d = i3;
                        fVar2.f52150c = System.currentTimeMillis();
                        fVar = fVar2;
                    }
                    if (handler2 != null) {
                        Message obtainMessage = handler2.obtainMessage();
                        obtainMessage.what = 100;
                        obtainMessage.obj = fVar;
                        handler2.sendMessage(obtainMessage);
                    }
                }
            };
            MediaScannerConnection.scanFile(applicationContext, strArr, null, r2);
        }
    }
}
