package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.C14627p.C14629a;
import com.facebook.soloader.C14627p.C14630b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.facebook.soloader.e */
public final class C14606e extends C14627p {

    /* renamed from: com.facebook.soloader.e$a */
    final class C14608a extends C14633e {

        /* renamed from: a */
        public final C14610b[] f37738a;

        /* renamed from: b */
        final /* synthetic */ C14606e f37739b;

        /* renamed from: com.facebook.soloader.e$a$a */
        final class C14609a extends C14632d {

            /* renamed from: b */
            private int f37741b;

            /* renamed from: a */
            public final boolean mo36857a() {
                if (this.f37741b < C14608a.this.f37738a.length) {
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            public final C14631c mo36858b() throws IOException {
                C14610b[] bVarArr = C14608a.this.f37738a;
                int i = this.f37741b;
                this.f37741b = i + 1;
                C14610b bVar = bVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(bVar.f37742a);
                try {
                    return new C14631c(bVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }

            private C14609a() {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final C14630b mo36855a() throws IOException {
            return new C14630b(this.f37738a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final C14632d mo36856b() throws IOException {
            return new C14609a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00da, code lost:
            r10.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ed, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f7, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f8, code lost:
            r2 = r0;
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            r10.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0106, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0107, code lost:
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r8, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x010c, code lost:
            r10.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f7 A[ExcHandler: all (r0v11 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:7:0x005c] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0102 A[SYNTHETIC, Splitter:B:57:0x0102] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x010c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C14608a(com.facebook.soloader.C14606e r18, com.facebook.soloader.C14627p r19) throws java.io.IOException {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r1.f37739b = r0
                r17.<init>()
                android.content.Context r0 = r0.f37756f
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "/data/local/tmp/exopackage/"
                r3.<init>(r4)
                java.lang.String r0 = r0.getPackageName()
                r3.append(r0)
                java.lang.String r0 = "/native-libs/"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
                r3.<init>()
                java.lang.String[] r4 = com.facebook.soloader.C14624n.m42302a()
                int r5 = r4.length
                r6 = 0
                r7 = 0
            L_0x0038:
                if (r7 >= r5) goto L_0x0115
                r8 = r4[r7]
                java.io.File r9 = new java.io.File
                r9.<init>(r2, r8)
                boolean r10 = r9.isDirectory()
                if (r10 == 0) goto L_0x0110
                r3.add(r8)
                java.io.File r8 = new java.io.File
                java.lang.String r10 = "metadata.txt"
                r8.<init>(r9, r10)
                boolean r10 = r8.isFile()
                if (r10 == 0) goto L_0x0110
                java.io.FileReader r10 = new java.io.FileReader
                r10.<init>(r8)
                java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
                r11.<init>(r10)     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            L_0x0061:
                java.lang.String r12 = r11.readLine()     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                if (r12 == 0) goto L_0x00d7
                int r13 = r12.length()     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                if (r13 == 0) goto L_0x0061
                r13 = 32
                int r13 = r12.indexOf(r13)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r14 = -1
                if (r13 == r14) goto L_0x00be
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r14.<init>()     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.lang.String r15 = r12.substring(r6, r13)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r14.append(r15)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.lang.String r15 = ".so"
                r14.append(r15)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.lang.String r14 = r14.toString()     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                int r15 = r0.size()     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
            L_0x008f:
                if (r6 >= r15) goto L_0x00a6
                java.lang.Object r16 = r0.get(r6)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r8 = r16
                com.facebook.soloader.e$b r8 = (com.facebook.soloader.C14606e.C14610b) r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.lang.String r8 = r8.f37765c     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                boolean r8 = r8.equals(r14)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                if (r8 == 0) goto L_0x00a3
                r6 = 1
                goto L_0x00a7
            L_0x00a3:
                int r6 = r6 + 1
                goto L_0x008f
            L_0x00a6:
                r6 = 0
            L_0x00a7:
                if (r6 != 0) goto L_0x00bc
                int r13 = r13 + 1
                java.lang.String r6 = r12.substring(r13)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                com.facebook.soloader.e$b r8 = new com.facebook.soloader.e$b     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.io.File r12 = new java.io.File     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r12.<init>(r9, r6)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r8.<init>(r14, r6, r12)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r0.add(r8)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
            L_0x00bc:
                r6 = 0
                goto L_0x0061
            L_0x00be:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.lang.String r3 = "illegal line in exopackage metadata: ["
                r2.<init>(r3)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r2.append(r12)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.lang.String r3 = "]"
                r2.append(r3)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                r0.<init>(r2)     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
                throw r0     // Catch:{ Throwable -> 0x00e2, all -> 0x00de }
            L_0x00d7:
                r11.close()     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
                r10.close()
                goto L_0x0110
            L_0x00de:
                r0 = move-exception
                r2 = r0
                r8 = 0
                goto L_0x00e7
            L_0x00e2:
                r0 = move-exception
                r8 = r0
                throw r8     // Catch:{ all -> 0x00e5 }
            L_0x00e5:
                r0 = move-exception
                r2 = r0
            L_0x00e7:
                if (r8 == 0) goto L_0x00f3
                r11.close()     // Catch:{ Throwable -> 0x00ed, all -> 0x00f7 }
                goto L_0x00f6
            L_0x00ed:
                r0 = move-exception
                r3 = r0
                com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r8, r3)     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
                goto L_0x00f6
            L_0x00f3:
                r11.close()     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            L_0x00f6:
                throw r2     // Catch:{ Throwable -> 0x00fb, all -> 0x00f7 }
            L_0x00f7:
                r0 = move-exception
                r2 = r0
                r8 = 0
                goto L_0x0100
            L_0x00fb:
                r0 = move-exception
                r8 = r0
                throw r8     // Catch:{ all -> 0x00fe }
            L_0x00fe:
                r0 = move-exception
                r2 = r0
            L_0x0100:
                if (r8 == 0) goto L_0x010c
                r10.close()     // Catch:{ Throwable -> 0x0106 }
                goto L_0x010f
            L_0x0106:
                r0 = move-exception
                r3 = r0
                com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r8, r3)
                goto L_0x010f
            L_0x010c:
                r10.close()
            L_0x010f:
                throw r2
            L_0x0110:
                int r7 = r7 + 1
                r6 = 0
                goto L_0x0038
            L_0x0115:
                int r2 = r3.size()
                java.lang.String[] r2 = new java.lang.String[r2]
                java.lang.Object[] r2 = r3.toArray(r2)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r3 = r19
                r3.f37758h = r2
                int r2 = r0.size()
                com.facebook.soloader.e$b[] r2 = new com.facebook.soloader.C14606e.C14610b[r2]
                java.lang.Object[] r0 = r0.toArray(r2)
                com.facebook.soloader.e$b[] r0 = (com.facebook.soloader.C14606e.C14610b[]) r0
                r1.f37738a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.C14606e.C14608a.<init>(com.facebook.soloader.e, com.facebook.soloader.p):void");
        }
    }

    /* renamed from: com.facebook.soloader.e$b */
    static final class C14610b extends C14629a {

        /* renamed from: a */
        final File f37742a;

        C14610b(String str, String str2, File file) {
            super(str, str2);
            this.f37742a = file;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C14633e mo36847a() throws IOException {
        return new C14608a(this, this);
    }

    public C14606e(Context context, String str) {
        super(context, str);
    }
}
