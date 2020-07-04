package com.p280ss.android.p294e.p295d;

import android.os.Handler;
import android.os.Looper;
import com.p280ss.android.p294e.p870b.C19539b;
import com.p280ss.android.p294e.p871c.C19542b;
import com.p280ss.android.p294e.p871c.C19543c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.e.d.b */
public final class C19545b {

    /* renamed from: e */
    public static volatile boolean f52866e;

    /* renamed from: a */
    public C6808a f52867a;

    /* renamed from: b */
    public Handler f52868b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public boolean f52869c;

    /* renamed from: d */
    public boolean f52870d;

    /* renamed from: f */
    private long f52871f;

    /* renamed from: com.ss.android.e.d.b$a */
    public interface C6808a {
        /* renamed from: a */
        void mo16620a(List<C19539b> list);
    }

    /* renamed from: com.ss.android.e.d.b$b */
    class C19546b implements Runnable {

        /* renamed from: a */
        List<C19539b> f52872a = new ArrayList();

        /* renamed from: c */
        private void m64417c() {
            C19545b.this.f52868b.post(new Runnable() {
                public final void run() {
                    if (C19545b.this.f52867a != null) {
                        C19545b.this.f52867a.mo16620a(C19546b.this.f52872a);
                    }
                }
            });
        }

        public final void run() {
            if (!C19545b.f52866e) {
                C19545b.f52866e = true;
                m64414a();
                m64416b();
                m64417c();
                C19545b.f52866e = false;
            }
        }

        /* renamed from: b */
        private void m64416b() {
            Collections.sort(this.f52872a, new Comparator<C19539b>() {
                /* renamed from: a */
                private static int m64418a(C19539b bVar, C19539b bVar2) {
                    return (int) (bVar.mo51685h() - bVar2.mo51685h());
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m64418a((C19539b) obj, (C19539b) obj2);
                }
            });
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f52872a);
            int i = 0;
            while (i < this.f52872a.size()) {
                C19539b bVar = (C19539b) this.f52872a.get(i);
                StringBuilder sb = new StringBuilder("weight sort = ");
                sb.append(bVar.mo51685h());
                sb.append(" ");
                sb.append(bVar.f52852e);
                sb.append("://");
                sb.append(bVar.f52851d);
                i++;
                for (int i2 = i; i2 < this.f52872a.size(); i2++) {
                    C19539b bVar2 = (C19539b) this.f52872a.get(i2);
                    if (bVar.f52851d.equals(bVar2.f52851d)) {
                        arrayList.remove(bVar2);
                    }
                }
            }
            this.f52872a.clear();
            this.f52872a.addAll(arrayList);
            if (this.f52872a.size() > 0) {
                C19545b.this.f52869c = true;
            } else {
                C19545b.this.f52869c = false;
            }
            C19545b.this.f52870d = false;
            StringBuilder sb2 = new StringBuilder("speed distinct = ");
            sb2.append(this.f52872a.size());
            sb2.append(" thread = ");
            sb2.append(Thread.currentThread());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0176, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0179, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x017a, code lost:
            r24 = r2;
            r22 = r8;
            r1 = 2147483647L;
            r11 = r0;
            r6 = -1;
            r10 = r17;
            r23 = r9;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01df A[SYNTHETIC, Splitter:B:104:0x01df] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x01e6 A[SYNTHETIC, Splitter:B:108:0x01e6] */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x01ec A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0176 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:28:0x00a1] */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01c6 A[SYNTHETIC, Splitter:B:89:0x01c6] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x01cd A[SYNTHETIC, Splitter:B:93:0x01cd] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01d6  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m64414a() {
            /*
                r27 = this;
                r1 = r27
                r0 = 0
                r2 = 0
            L_0x0004:
                java.util.List<com.ss.android.e.b.b> r0 = r1.f52872a
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x01f2
                java.util.List<com.ss.android.e.b.b> r0 = r1.f52872a
                java.lang.Object r0 = r0.get(r2)
                r13 = r0
                com.ss.android.e.b.b r13 = (com.p280ss.android.p294e.p870b.C19539b) r13
                if (r13 == 0) goto L_0x01ea
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                java.lang.String r0 = "https://"
                r14.append(r0)
                java.lang.String r0 = r13.f52851d
                r14.append(r0)
                java.lang.String r0 = "/ies/speed/"
                r14.append(r0)
                long r3 = java.lang.System.currentTimeMillis()
                r14.append(r3)
                long r15 = java.lang.System.currentTimeMillis()
                r3 = -1
                r4 = -1
                r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
                r10 = 200(0xc8, float:2.8E-43)
                r6 = 0
                java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x019f, all -> 0x0199 }
                java.lang.String r7 = r14.toString()     // Catch:{ Exception -> 0x019f, all -> 0x0199 }
                r0.<init>(r7)     // Catch:{ Exception -> 0x019f, all -> 0x0199 }
                java.net.URLConnection r7 = r0.openConnection()     // Catch:{ Exception -> 0x019f, all -> 0x0199 }
                r8 = r7
                java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x019f, all -> 0x0199 }
                com.ss.android.e.b r7 = com.p280ss.android.p294e.C6806b.m21144a()     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                int r7 = r7.f19404c     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                r8.setConnectTimeout(r7)     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                com.ss.android.e.b r7 = com.p280ss.android.p294e.C6806b.m21144a()     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                int r7 = r7.f19404c     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                r8.setReadTimeout(r7)     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                java.lang.String r7 = "X-SS-No-Cookie"
                java.lang.String r9 = "true"
                com.p280ss.android.p294e.p295d.C19549c.m64420a(r8, r7, r9)     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                int r9 = r8.getResponseCode()     // Catch:{ Exception -> 0x018e, all -> 0x0188 }
                if (r9 != r10) goto L_0x009d
                java.io.InputStream r3 = com.p280ss.android.p294e.p295d.C19549c.m64419a(r8)     // Catch:{ Exception -> 0x008f, all -> 0x0088 }
                java.lang.String r7 = "X-TT-LOGID"
                java.lang.String r7 = r8.getHeaderField(r7)     // Catch:{ Exception -> 0x0081, all -> 0x007d }
                r18 = r3
                r17 = r7
                goto L_0x00a1
            L_0x007d:
                r0 = move-exception
                r18 = r3
                goto L_0x008b
            L_0x0081:
                r0 = move-exception
                r24 = r2
                r18 = r3
                r10 = r6
                goto L_0x0095
            L_0x0088:
                r0 = move-exception
                r18 = r6
            L_0x008b:
                r22 = r8
                goto L_0x01dd
            L_0x008f:
                r0 = move-exception
                r24 = r2
                r10 = r6
                r18 = r10
            L_0x0095:
                r22 = r8
                r23 = r9
                r1 = r11
                r11 = r0
                goto L_0x01ab
            L_0x009d:
                r17 = r6
                r18 = r17
            L_0x00a1:
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0179, all -> 0x0176 }
                r3 = 0
                long r6 = r6 - r15
                if (r9 != r10) goto L_0x0121
                r13.f52854g = r6     // Catch:{ Exception -> 0x0113, all -> 0x0176 }
                r13.mo51681f()     // Catch:{ Exception -> 0x0113, all -> 0x0176 }
                java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0113, all -> 0x0176 }
                r0 = 0
                r19 = 1
                r4 = r13
                r5 = r9
                r20 = r6
                r22 = r8
                r23 = r9
                r8 = r15
                r10 = r17
                r24 = r2
                r1 = r11
                r11 = r0
                r12 = r19
                m64415a(r3, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x010e }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010e }
                java.lang.String r3 = "sort speed time = "
                r0.<init>(r3)     // Catch:{ Exception -> 0x010e }
                r11 = r20
                r0.append(r11)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = " "
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = r13.f52852e     // Catch:{ Exception -> 0x010c }
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = "://"
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = r13.f52851d     // Catch:{ Exception -> 0x010c }
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = "sort weight time = "
                r0.<init>(r3)     // Catch:{ Exception -> 0x010c }
                long r3 = r13.f52853f     // Catch:{ Exception -> 0x010c }
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = " "
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = r13.f52852e     // Catch:{ Exception -> 0x010c }
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = "://"
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                java.lang.String r3 = r13.f52851d     // Catch:{ Exception -> 0x010c }
                r0.append(r3)     // Catch:{ Exception -> 0x010c }
                r20 = r23
                goto L_0x014e
            L_0x010c:
                r0 = move-exception
                goto L_0x0111
            L_0x010e:
                r0 = move-exception
                r11 = r20
            L_0x0111:
                r6 = r11
                goto L_0x011c
            L_0x0113:
                r0 = move-exception
                r24 = r2
                r22 = r8
                r23 = r9
                r1 = r11
                r11 = r6
            L_0x011c:
                r10 = r17
                r11 = r0
                goto L_0x01ac
            L_0x0121:
                r24 = r2
                r22 = r8
                r23 = r9
                r1 = r11
                r11 = r6
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016b }
                java.lang.String r4 = "sort speed error code = "
                r3.<init>(r4)     // Catch:{ Exception -> 0x016b }
                r10 = r23
                r3.append(r10)     // Catch:{ Exception -> 0x0160 }
                r13.f52854g = r1     // Catch:{ Exception -> 0x0160 }
                java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0160 }
                r0 = 0
                r19 = 0
                r4 = r13
                r5 = r10
                r6 = r11
                r8 = r15
                r20 = r10
                r10 = r17
                r25 = r11
                r11 = r0
                r12 = r19
                m64415a(r3, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ Exception -> 0x015e }
            L_0x014e:
                if (r18 == 0) goto L_0x0155
                r18.close()     // Catch:{ IOException -> 0x0154 }
                goto L_0x0155
            L_0x0154:
            L_0x0155:
                if (r22 == 0) goto L_0x015a
                r22.disconnect()     // Catch:{ Exception -> 0x015a }
            L_0x015a:
                r0 = r20
                goto L_0x01d2
            L_0x015e:
                r0 = move-exception
                goto L_0x0165
            L_0x0160:
                r0 = move-exception
                r20 = r10
                r25 = r11
            L_0x0165:
                r11 = r0
                r10 = r17
                r23 = r20
                goto L_0x0173
            L_0x016b:
                r0 = move-exception
                r25 = r11
                r20 = r23
                r11 = r0
                r10 = r17
            L_0x0173:
                r6 = r25
                goto L_0x01ac
            L_0x0176:
                r0 = move-exception
                goto L_0x008b
            L_0x0179:
                r0 = move-exception
                r24 = r2
                r22 = r8
                r20 = r9
                r1 = r11
                r11 = r0
                r6 = r4
                r10 = r17
                r23 = r20
                goto L_0x01ac
            L_0x0188:
                r0 = move-exception
                r22 = r8
                r18 = r6
                goto L_0x01dd
            L_0x018e:
                r0 = move-exception
                r24 = r2
                r22 = r8
                r1 = r11
                r11 = r0
                r10 = r6
                r18 = r10
                goto L_0x01a9
            L_0x0199:
                r0 = move-exception
                r18 = r6
                r22 = r18
                goto L_0x01dd
            L_0x019f:
                r0 = move-exception
                r24 = r2
                r1 = r11
                r11 = r0
                r10 = r6
                r18 = r10
                r22 = r18
            L_0x01a9:
                r23 = -1
            L_0x01ab:
                r6 = r4
            L_0x01ac:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dc }
                java.lang.String r3 = "sort speed error = "
                r0.<init>(r3)     // Catch:{ all -> 0x01dc }
                r0.append(r11)     // Catch:{ all -> 0x01dc }
                r13.f52854g = r1     // Catch:{ all -> 0x01dc }
                java.lang.String r3 = r14.toString()     // Catch:{ all -> 0x01dc }
                r12 = 0
                r4 = r13
                r5 = r23
                r8 = r15
                m64415a(r3, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ all -> 0x01dc }
                if (r18 == 0) goto L_0x01cb
                r18.close()     // Catch:{ IOException -> 0x01ca }
                goto L_0x01cb
            L_0x01ca:
            L_0x01cb:
                if (r22 == 0) goto L_0x01d0
                r22.disconnect()     // Catch:{ Exception -> 0x01d0 }
            L_0x01d0:
                r0 = r23
            L_0x01d2:
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 == r1) goto L_0x01ec
                r0 = 3000(0xbb8, double:1.482E-320)
                java.lang.Thread.sleep(r0)     // Catch:{ Exception -> 0x01ec }
                goto L_0x01ec
            L_0x01dc:
                r0 = move-exception
            L_0x01dd:
                if (r18 == 0) goto L_0x01e4
                r18.close()     // Catch:{ IOException -> 0x01e3 }
                goto L_0x01e4
            L_0x01e3:
            L_0x01e4:
                if (r22 == 0) goto L_0x01e9
                r22.disconnect()     // Catch:{ Exception -> 0x01e9 }
            L_0x01e9:
                throw r0
            L_0x01ea:
                r24 = r2
            L_0x01ec:
                int r2 = r24 + 1
                r1 = r27
                goto L_0x0004
            L_0x01f2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p294e.p295d.C19545b.C19546b.m64414a():void");
        }

        public C19546b(List<C19539b> list) {
            this.f52872a.clear();
            this.f52872a.addAll(list);
        }

        /* renamed from: a */
        private static void m64415a(String str, C19539b bVar, int i, long j, long j2, String str2, Exception exc, boolean z) {
            C19543c cVar = new C19543c(str, bVar, i, j, j2, str2, exc, z);
            C19542b.m64410a(0, cVar);
        }
    }

    public C19545b(C6808a aVar) {
        this.f52867a = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo51688a(java.util.List<com.p280ss.android.p294e.p870b.C19539b> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.p280ss.android.p294e.C6806b.m21151d()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r5)
            return
        L_0x0009:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007d }
            long r2 = r5.f52871f     // Catch:{ all -> 0x007d }
            r4 = 0
            long r0 = r0 - r2
            com.ss.android.e.b r2 = com.p280ss.android.p294e.C6806b.m21144a()     // Catch:{ all -> 0x007d }
            long r2 = r2.f19403b     // Catch:{ all -> 0x007d }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x001f
            boolean r0 = r5.f52869c     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0023
        L_0x001f:
            boolean r0 = r5.f52870d     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x004f
        L_0x0023:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "no need opt sort ,last duration is "
            r6.<init>(r0)     // Catch:{ all -> 0x007d }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007d }
            long r2 = r5.f52871f     // Catch:{ all -> 0x007d }
            r4 = 0
            long r0 = r0 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            long r0 = r0 / r2
            r6.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = " min, frequency is "
            r6.append(r0)     // Catch:{ all -> 0x007d }
            com.ss.android.e.b r0 = com.p280ss.android.p294e.C6806b.m21144a()     // Catch:{ all -> 0x007d }
            long r0 = r0.f19403b     // Catch:{ all -> 0x007d }
            long r0 = r0 / r2
            r6.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = " min"
            r6.append(r0)     // Catch:{ all -> 0x007d }
            monitor-exit(r5)
            return
        L_0x004f:
            r0 = 1
            r5.f52870d = r0     // Catch:{ all -> 0x007d }
            if (r6 == 0) goto L_0x006f
            int r0 = r6.size()     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x005b
            goto L_0x006f
        L_0x005b:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007d }
            r5.f52871f = r0     // Catch:{ all -> 0x007d }
            java.util.concurrent.ExecutorService r0 = com.p280ss.android.p294e.p295d.C19544a.m64411a()     // Catch:{ all -> 0x007d }
            com.ss.android.e.d.b$b r1 = new com.ss.android.e.d.b$b     // Catch:{ all -> 0x007d }
            r1.<init>(r6)     // Catch:{ all -> 0x007d }
            r0.execute(r1)     // Catch:{ all -> 0x007d }
            monitor-exit(r5)
            return
        L_0x006f:
            r0 = 0
            r5.f52870d = r0     // Catch:{ all -> 0x007d }
            com.ss.android.e.d.b$a r0 = r5.f52867a     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x007b
            com.ss.android.e.d.b$a r0 = r5.f52867a     // Catch:{ all -> 0x007d }
            r0.mo16620a(r6)     // Catch:{ all -> 0x007d }
        L_0x007b:
            monitor-exit(r5)
            return
        L_0x007d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p294e.p295d.C19545b.mo51688a(java.util.List):void");
    }
}
