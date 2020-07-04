package com.soundcloud.android.crop;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.soundcloud.android.crop.C18741c.C18742a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.soundcloud.android.crop.a */
final class C18735a {

    /* renamed from: com.soundcloud.android.crop.a$a */
    static class C18736a extends C18742a implements Runnable {

        /* renamed from: a */
        public final C18741c f50608a;

        /* renamed from: b */
        public final ProgressDialog f50609b;

        /* renamed from: c */
        private final Runnable f50610c;

        /* renamed from: d */
        private final Handler f50611d;

        /* renamed from: e */
        private final Runnable f50612e = new Runnable() {
            public final void run() {
                C18736a.this.f50608a.mo49229a(C18736a.this);
                if (C18736a.this.f50609b.getWindow() != null) {
                    C18736a.this.f50609b.dismiss();
                }
            }
        };

        public final void run() {
            try {
                this.f50610c.run();
            } finally {
                this.f50611d.post(this.f50612e);
            }
        }

        /* renamed from: b */
        public final void mo49266b(C18741c cVar) {
            this.f50609b.hide();
        }

        /* renamed from: c */
        public final void mo49267c(C18741c cVar) {
            this.f50609b.show();
        }

        /* renamed from: a */
        public final void mo49265a(C18741c cVar) {
            this.f50612e.run();
            this.f50611d.removeCallbacks(this.f50612e);
        }

        public C18736a(C18741c cVar, Runnable runnable, ProgressDialog progressDialog, Handler handler) {
            this.f50608a = cVar;
            this.f50609b = progressDialog;
            this.f50610c = runnable;
            this.f50608a.mo49230b(this);
            this.f50611d = handler;
        }
    }

    /* renamed from: a */
    public static void m61353a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static String m61351a(Context context) throws IOException {
        return File.createTempFile("image", "tmp", context.getCacheDir()).getAbsolutePath();
    }

    /* renamed from: a */
    public static int m61349a(File file) {
        if (file == null) {
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
            if (attributeInt == 3) {
                return NormalGiftView.ALPHA_180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m61354a(File file, File file2) {
        if (file == null || file2 == null) {
            return false;
        }
        try {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            ExifInterface exifInterface2 = new ExifInterface(file2.getAbsolutePath());
            exifInterface2.setAttribute("Orientation", exifInterface.getAttribute("Orientation"));
            exifInterface2.saveAttributes();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static File m61355b(Context context, ContentResolver contentResolver, Uri uri) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        String a;
        FileOutputStream fileOutputStream2 = null;
        if (uri == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(contentResolver.openFileDescriptor(uri, "r").getFileDescriptor());
            try {
                a = m61351a(context);
                fileOutputStream = new FileOutputStream(a);
            } catch (IOException unused) {
                fileOutputStream = null;
                m61353a((Closeable) fileInputStream);
                m61353a((Closeable) fileOutputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                m61353a((Closeable) fileInputStream);
                m61353a((Closeable) fileOutputStream2);
                throw th;
            }
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        File file = new File(a);
                        m61353a((Closeable) fileInputStream);
                        m61353a((Closeable) fileOutputStream);
                        return file;
                    }
                }
            } catch (IOException unused2) {
                m61353a((Closeable) fileInputStream);
                m61353a((Closeable) fileOutputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                m61353a((Closeable) fileInputStream);
                m61353a((Closeable) fileOutputStream2);
                throw th;
            }
        } catch (IOException unused3) {
            fileOutputStream = null;
            fileInputStream = null;
            m61353a((Closeable) fileInputStream);
            m61353a((Closeable) fileOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m61353a((Closeable) fileInputStream);
            m61353a((Closeable) fileOutputStream2);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r1 != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r1 != null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0086 */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File m61350a(android.content.Context r8, android.content.ContentResolver r9, android.net.Uri r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "file"
            java.lang.String r2 = r10.getScheme()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x001a
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r10.getPath()
            r8.<init>(r9)
            return r8
        L_0x001a:
            java.lang.String r1 = "content"
            java.lang.String r2 = r10.getScheme()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0096
            r1 = 2
            java.lang.String[] r4 = new java.lang.String[r1]
            r1 = 0
            java.lang.String r2 = "_data"
            r4[r1] = r2
            r1 = 1
            java.lang.String r2 = "_display_name"
            r4[r1] = r2
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r10
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ IllegalArgumentException -> 0x0086, SecurityException -> 0x007f }
            if (r1 == 0) goto L_0x0079
            boolean r2 = r1.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
            if (r2 == 0) goto L_0x0079
            java.lang.String r2 = r10.toString()     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
            java.lang.String r3 = "content://com.google.android.gallery3d"
            boolean r2 = r2.startsWith(r3)     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
            if (r2 == 0) goto L_0x0057
            java.lang.String r2 = "_display_name"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
            goto L_0x005d
        L_0x0057:
            java.lang.String r2 = "_data"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
        L_0x005d:
            r3 = -1
            if (r2 == r3) goto L_0x0079
            java.lang.String r2 = r1.getString(r2)     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
            if (r3 != 0) goto L_0x0079
            java.io.File r3 = new java.io.File     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0077, SecurityException -> 0x0080, all -> 0x0075 }
            if (r1 == 0) goto L_0x0074
            r1.close()
        L_0x0074:
            return r3
        L_0x0075:
            r8 = move-exception
            goto L_0x0090
        L_0x0077:
            r0 = r1
            goto L_0x0086
        L_0x0079:
            if (r1 == 0) goto L_0x0096
            goto L_0x0082
        L_0x007c:
            r8 = move-exception
            r1 = r0
            goto L_0x0090
        L_0x007f:
            r1 = r0
        L_0x0080:
            if (r1 == 0) goto L_0x0096
        L_0x0082:
            r1.close()
            goto L_0x0096
        L_0x0086:
            java.io.File r8 = m61355b(r8, r9, r10)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x008f
            r0.close()
        L_0x008f:
            return r8
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            r1.close()
        L_0x0095:
            throw r8
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.soundcloud.android.crop.C18735a.m61350a(android.content.Context, android.content.ContentResolver, android.net.Uri):java.io.File");
    }

    /* renamed from: a */
    public static void m61352a(C18741c cVar, String str, String str2, Runnable runnable, Handler handler) {
        new Thread(new C18736a(cVar, runnable, ProgressDialog.show(cVar, null, str2, true, false), handler)).start();
    }
}
