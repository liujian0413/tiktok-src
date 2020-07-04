package android.support.p022v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

/* renamed from: android.support.v4.graphics.g */
public final class C0744g {
    /* renamed from: a */
    public static void m3167a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    private static ByteBuffer m3166a(File file) {
        Throwable th;
        Throwable th2;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                th2 = r9;
                th = th4;
            }
            throw th;
            if (th2 != null) {
                try {
                    fileInputStream.close();
                } catch (Throwable th5) {
                    C6497a.m20181a(th2, th5);
                }
            } else {
                fileInputStream.close();
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static File m3163a(Context context) {
        StringBuilder sb = new StringBuilder(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        String sb2 = sb.toString();
        int i = 0;
        while (i < 100) {
            File cacheDir = context.getCacheDir();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(i);
            File file = new File(cacheDir, sb3.toString());
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3169a(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        m3167a((Closeable) fileOutputStream);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException unused) {
                fileOutputStream2 = fileOutputStream;
                m3167a((Closeable) fileOutputStream2);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                return false;
            } catch (Throwable th) {
                th = th;
                m3167a((Closeable) fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException unused2) {
            m3167a((Closeable) fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            m3167a((Closeable) fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: a */
    public static ByteBuffer m3164a(Context context, Resources resources, int i) {
        File a = m3163a(context);
        if (a == null) {
            return null;
        }
        try {
            if (!m3168a(a, resources, i)) {
                return null;
            }
            ByteBuffer a2 = m3166a(a);
            a.delete();
            return a2;
        } finally {
            a.delete();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0052, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        r7 = r10;
        r10 = r9;
        r9 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0013] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m3165a(android.content.Context r8, android.os.CancellationSignal r9, android.net.Uri r10) {
        /*
            android.content.ContentResolver r8 = r8.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r10, r1, r9)     // Catch:{ IOException -> 0x0067 }
            if (r8 != 0) goto L_0x0013
            if (r8 == 0) goto L_0x0012
            r8.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.io.FileDescriptor r10 = r8.getFileDescriptor()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            r9.<init>(r10)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            java.nio.channels.FileChannel r1 = r9.getChannel()     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            long r5 = r1.size()     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            r3 = 0
            java.nio.MappedByteBuffer r10 = r1.map(r2, r3, r5)     // Catch:{ Throwable -> 0x0038, all -> 0x0035 }
            r9.close()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            if (r8 == 0) goto L_0x0034
            r8.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0034:
            return r10
        L_0x0035:
            r10 = move-exception
            r1 = r0
            goto L_0x003e
        L_0x0038:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            r7 = r1
            r1 = r10
            r10 = r7
        L_0x003e:
            if (r1 == 0) goto L_0x0049
            r9.close()     // Catch:{ Throwable -> 0x0044, all -> 0x004d }
            goto L_0x004c
        L_0x0044:
            r9 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r1, r9)     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
            goto L_0x004c
        L_0x0049:
            r9.close()     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x004c:
            throw r10     // Catch:{ Throwable -> 0x0050, all -> 0x004d }
        L_0x004d:
            r9 = move-exception
            r10 = r0
            goto L_0x0056
        L_0x0050:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r10 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0056:
            if (r8 == 0) goto L_0x0066
            if (r10 == 0) goto L_0x0063
            r8.close()     // Catch:{ Throwable -> 0x005e }
            goto L_0x0066
        L_0x005e:
            r8 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r10, r8)     // Catch:{ IOException -> 0x0067 }
            goto L_0x0066
        L_0x0063:
            r8.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0066:
            throw r9     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.graphics.C0744g.m3165a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static boolean m3168a(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean a = m3169a(file, inputStream);
                m3167a((Closeable) inputStream);
                return a;
            } catch (Throwable th) {
                th = th;
                m3167a((Closeable) inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m3167a((Closeable) inputStream);
            throw th;
        }
    }
}
