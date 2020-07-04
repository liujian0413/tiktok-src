package com.facebook.network.connectionclass;

import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

/* renamed from: com.facebook.network.connectionclass.f */
final class C14152f {

    /* renamed from: a */
    public static C14152f f37396a;

    /* renamed from: b */
    private static final ThreadLocal<byte[]> f37397b = new ThreadLocal<byte[]>() {
        /* renamed from: a */
        private static byte[] m41771a() {
            return new byte[512];
        }

        public final /* synthetic */ Object initialValue() {
            return m41771a();
        }
    };

    /* renamed from: c */
    private static long f37398c = -1;

    /* renamed from: d */
    private static C14151e f37399d = new C14151e();

    /* renamed from: e */
    private static C14142a f37400e = new C14142a();

    /* renamed from: f */
    private String f37401f;

    /* renamed from: a */
    public static synchronized C14152f m41769a() {
        C14152f fVar;
        synchronized (C14152f.class) {
            if (f37396a == null) {
                f37396a = new C14152f("/proc/net/xt_qtaguid/stats");
            }
            fVar = f37396a;
        }
        return fVar;
    }

    private C14152f(String str) {
        this.f37401f = str;
    }

    /* renamed from: a */
    public final long mo33910a(int i) {
        FileInputStream fileInputStream;
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        long j = 0;
        try {
            fileInputStream = new FileInputStream(this.f37401f);
            f37399d.mo33909a(fileInputStream);
            byte[] bArr = (byte[]) f37397b.get();
            f37399d.mo33908a();
            while (true) {
                int a = f37399d.mo33907a(bArr);
                if (a == -1) {
                    break;
                }
                try {
                    f37400e.mo33897a(bArr, a);
                    f37400e.mo33896a(' ');
                    f37400e.mo33899b();
                    if (!f37400e.mo33898a("lo")) {
                        f37400e.mo33899b();
                        if (f37400e.mo33895a() == i) {
                            f37400e.mo33899b();
                            j += (long) f37400e.mo33895a();
                        }
                    }
                } catch (NumberFormatException | NoSuchElementException unused) {
                }
            }
            fileInputStream.close();
            if (f37398c == -1) {
                f37398c = j;
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return -1;
            }
            long j2 = j - f37398c;
            f37398c = j;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return j2;
        } catch (IOException unused2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return -1;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
