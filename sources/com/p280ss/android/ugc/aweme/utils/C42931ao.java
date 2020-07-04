package com.p280ss.android.ugc.aweme.utils;

import android.os.Process;
import bolts.C1591g;
import bolts.C1592h;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.utils.ao */
public final class C42931ao {

    /* renamed from: a */
    public static C42934a f111462a;

    /* renamed from: b */
    public static Integer f111463b;

    /* renamed from: com.ss.android.ugc.aweme.utils.ao$a */
    public static class C42934a {

        /* renamed from: a */
        public double f111465a;

        /* renamed from: b */
        public double f111466b;
    }

    /* renamed from: a */
    public static Integer m136282a() {
        return f111463b;
    }

    /* renamed from: b */
    public static C42934a m136285b() {
        RandomAccessFile randomAccessFile;
        double d;
        RandomAccessFile randomAccessFile2;
        C42934a aVar = new C42934a();
        RandomAccessFile randomAccessFile3 = null;
        try {
            String valueOf = String.valueOf(Process.myPid());
            randomAccessFile = new RandomAccessFile("/proc/stat", "r");
            try {
                String[] split = randomAccessFile.readLine().split(" ");
                d = 0.0d;
                for (int i = 2; i < split.length; i++) {
                    d += Double.parseDouble(split[i]);
                }
                StringBuilder sb = new StringBuilder("/proc/");
                sb.append(valueOf);
                sb.append("/stat");
                randomAccessFile2 = new RandomAccessFile(sb.toString(), "r");
            } catch (Throwable th) {
                th = th;
                m136283a((Closeable) randomAccessFile);
                m136283a((Closeable) randomAccessFile3);
                throw th;
            }
            try {
                String[] split2 = randomAccessFile2.readLine().split(" ");
                double parseDouble = Double.parseDouble(split2[13]);
                double parseDouble2 = Double.parseDouble(split2[14]);
                aVar.f111465a = parseDouble + parseDouble2 + Double.parseDouble(split2[15]) + Double.parseDouble(split2[16]);
                aVar.f111466b = d;
                m136283a((Closeable) randomAccessFile);
                m136283a((Closeable) randomAccessFile2);
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile3 = randomAccessFile2;
                m136283a((Closeable) randomAccessFile);
                m136283a((Closeable) randomAccessFile3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            m136283a((Closeable) randomAccessFile);
            m136283a((Closeable) randomAccessFile3);
            throw th;
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m136283a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m136284a(final boolean z) {
        C1592h.m7853a((Callable<TResult>) new Callable<C42934a>() {
            /* renamed from: a */
            private static C42934a m136287a() throws Exception {
                return C42931ao.m136285b();
            }

            public final /* synthetic */ Object call() throws Exception {
                return m136287a();
            }
        }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<C42934a, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<C42934a> hVar) throws Exception {
                if (hVar.mo6890e() != null) {
                    if (!(!z || C42931ao.f111462a == null || ((C42934a) hVar.mo6890e()).f111466b == C42931ao.f111462a.f111466b)) {
                        C42931ao.f111463b = Integer.valueOf((int) (((((C42934a) hVar.mo6890e()).f111465a - C42931ao.f111462a.f111465a) * 100.0d) / (((C42934a) hVar.mo6890e()).f111466b - C42931ao.f111462a.f111466b)));
                    }
                    C42931ao.f111462a = (C42934a) hVar.mo6890e();
                }
                return null;
            }
        }, C1592h.f5958b);
    }
}
