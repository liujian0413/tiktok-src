package com.bytedance.p509f;

import android.content.Context;
import android.os.Process;
import android.support.p022v4.content.C0683b;
import com.bytedance.p509f.p510a.C10054a;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47973b;
import kotlin.p1884io.C47991m;

/* renamed from: com.bytedance.f.a */
public final class C10052a {

    /* renamed from: a */
    public static final C10052a f27357a = new C10052a();

    /* renamed from: com.bytedance.f.a$a */
    public static final class C10053a {

        /* renamed from: a */
        private final byte[] f27358a = new byte[1048576];

        /* renamed from: a */
        public final C10053a mo24699a() {
            return this;
        }
    }

    private C10052a() {
    }

    /* renamed from: a */
    public static final void m29856a() {
        while (true) {
            new ArrayList().add(new C10053a().mo24699a());
        }
    }

    /* renamed from: b */
    private static List<String> m29860b() {
        try {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/fd");
            return C10054a.m29863a(new File(sb.toString()));
        } catch (Throwable unused) {
            return C7525m.m23461a();
        }
    }

    /* renamed from: a */
    private static boolean m29859a(Context context) {
        if (context != null && C0683b.m2909b(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m29858a(File file, String str) {
        Throwable th;
        Throwable th2;
        C7573i.m23587b(str, "fileName");
        if (file != null) {
            StringBuilder sb = new StringBuilder("/proc/");
            sb.append(Process.myPid());
            sb.append("/maps");
            File file2 = new File(sb.toString());
            StringBuffer stringBuffer = new StringBuffer();
            Closeable fileReader = new FileReader(file2);
            try {
                for (String str2 : C47991m.m148951a((Reader) (FileReader) fileReader)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(10);
                    stringBuffer.append(sb2.toString());
                }
                C47973b.m148917a(fileReader, null);
                Closeable fileWriter = new FileWriter(new File(file, str));
                try {
                    ((FileWriter) fileWriter).write(stringBuffer.toString());
                    C47973b.m148917a(fileWriter, null);
                } catch (Throwable th3) {
                    C47973b.m148917a(fileWriter, th2);
                    throw th3;
                }
            } catch (Throwable th4) {
                C47973b.m148917a(fileReader, th);
                throw th4;
            }
        }
    }

    /* renamed from: a */
    public static final void m29857a(Context context, File file, String str) {
        C7573i.m23587b(str, "fileName");
        System.currentTimeMillis();
        List<String> b = m29860b();
        FileWriter fileWriter = new FileWriter(new File(file, str));
        for (String str2 : b) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(10);
            fileWriter.write(sb.toString());
        }
        fileWriter.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m29861b(android.content.Context r7, java.io.File r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            boolean r7 = m29859a(r7)
            if (r7 != 0) goto L_0x000c
            return
        L_0x000c:
            java.lang.System.currentTimeMillis()
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "/proc/"
            r1.<init>(r2)
            int r2 = android.os.Process.myPid()
            r1.append(r2)
            java.lang.String r2 = "/task"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.io.File[] r0 = r0.listFiles()
            java.lang.String r1 = "taskFile.listFiles()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L_0x0043:
            if (r4 >= r2) goto L_0x0063
            r5 = r0[r4]
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x005a
            java.lang.String r6 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x0060
            r1.add(r5)
        L_0x0060:
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0063:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L_0x006b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "stat"
            r3.<init>(r1, r4)
            java.lang.String r1 = com.bytedance.p509f.p510a.C10055b.m29864a(r3)
            r2.append(r1)
            r1 = 10
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r7.append(r1)
            goto L_0x006b
        L_0x0097:
            java.io.File r0 = new java.io.File
            r0.<init>(r8, r9)
            java.io.FileWriter r8 = new java.io.FileWriter
            r8.<init>(r0)
            java.io.Closeable r8 = (java.io.Closeable) r8
            r9 = 0
            r0 = r8
            java.io.FileWriter r0 = (java.io.FileWriter) r0     // Catch:{ Throwable -> 0x00b4 }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x00b4 }
            r0.write(r7)     // Catch:{ Throwable -> 0x00b4 }
            kotlin.p1884io.C47973b.m148917a(r8, r9)
            return
        L_0x00b2:
            r7 = move-exception
            goto L_0x00b7
        L_0x00b4:
            r7 = move-exception
            r9 = r7
            throw r9     // Catch:{ all -> 0x00b2 }
        L_0x00b7:
            kotlin.p1884io.C47973b.m148917a(r8, r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p509f.C10052a.m29861b(android.content.Context, java.io.File, java.lang.String):void");
    }
}
