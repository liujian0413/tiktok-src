package com.p280ss.android.ugc.iesdownload;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.iesdownload.p1744a.C44842a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44846a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44847b;
import com.p280ss.android.ugc.iesdownload.p1745b.C44848c;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.iesdownload.f */
public final class C44857f {

    /* renamed from: a */
    private Context f115362a;

    /* renamed from: b */
    private OkHttpClient f115363b;

    /* renamed from: c */
    private C44854e f115364c;

    /* renamed from: d */
    private C44842a f115365d;

    /* renamed from: a */
    private void m141548a() {
        if (this.f115365d != null) {
            this.f115365d.mo107282a(this.f115364c);
        }
    }

    /* renamed from: b */
    private void m141551b() {
        new File(this.f115364c.f115343c).delete();
    }

    /* renamed from: a */
    private static void m141549a(OkHttpClient okHttpClient, String str) {
        if (okHttpClient != null && !TextUtils.isEmpty(str)) {
            Iterator it = okHttpClient.dispatcher.queuedCalls().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Call call = (Call) it.next();
                if (str.equals(call.request().tag) && !call.isCanceled()) {
                    call.cancel();
                    break;
                }
            }
            for (Call call2 : okHttpClient.dispatcher.runningCalls()) {
                if (str.equals(call2.request().tag) && !call2.isCanceled()) {
                    call2.cancel();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo107300a(C44854e eVar, C44849d dVar) {
        if (eVar != null) {
            this.f115364c = eVar;
            String str = this.f115364c.f115342b;
            final String a = C44841a.m141511a(eVar.f115343c);
            final File file = new File(a);
            final long length = file.length();
            C44847b bVar = IesDownLoadConfigProvider.getInstance().downloadClient;
            if (bVar != null) {
                HashMap<String, String> hashMap = eVar.f115353m;
                final C44849d dVar2 = dVar;
                final C44854e eVar2 = eVar;
                C448581 r2 = new C44846a() {
                    /* renamed from: a */
                    public final void mo107287a(IOException iOException) {
                        dVar2.mo59411a(C44850c.m141527a().mo107289a(6).mo107290a(iOException.getMessage()));
                    }

                    /* renamed from: a */
                    public final void mo107288a(boolean z, boolean z2, int i, long j, InputStream inputStream) throws IOException {
                        C44857f.this.mo107299a(dVar2, eVar2, a, file, length, z, z2, i, j, inputStream);
                    }
                };
                bVar.mo86738a(str, hashMap, r2);
                return;
            }
            try {
                Builder builder = new Builder();
                builder.url(str).tag(str).addHeader("User-Agent", "IesDownload").addHeader("Connection", "Keep-Alive");
                HashMap<String, String> hashMap2 = eVar.f115353m;
                if (!(hashMap2 == null || hashMap2.size() == 0)) {
                    for (String str2 : hashMap2.keySet()) {
                        String str3 = (String) hashMap2.get(str2);
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                            builder.addHeader(str2, str3);
                        }
                    }
                }
                Call newCall = this.f115363b.newCall(builder.build());
                final C44849d dVar3 = dVar;
                final C44854e eVar3 = eVar;
                C448592 r22 = new Callback() {
                    public final void onFailure(Call call, IOException iOException) {
                        dVar3.mo59411a(C44850c.m141527a().mo107289a(6).mo107290a(iOException.getMessage()));
                    }

                    public final void onResponse(Call call, Response response) throws IOException {
                        long j;
                        Response response2 = response;
                        if (response2.header("Content-Length") != null) {
                            j = Long.valueOf(response2.header("Content-Length")).longValue();
                        } else {
                            j = 0;
                        }
                        C44857f.this.mo107299a(dVar3, eVar3, a, file, length, response.isSuccessful(), response.isRedirect(), response2.code, j, response2.body.byteStream());
                    }
                };
                newCall.enqueue(r22);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo107301a(String str, C44848c cVar) {
        m141549a(this.f115363b, str);
        if (this.f115365d != null) {
            List a = this.f115365d.mo107283a("url", str);
            if (a.size() > 0) {
                C44854e eVar = (C44854e) a.get(0);
                if (eVar.f115343c != null) {
                    this.f115364c = eVar;
                    m141551b();
                } else {
                    return;
                }
            }
            this.f115365d.mo107284b("url", str);
            cVar.mo59419g();
        }
    }

    public C44857f(Context context, OkHttpClient okHttpClient, C44842a aVar) {
        if (context != null) {
            this.f115362a = context;
            this.f115365d = aVar;
        }
        if (okHttpClient != null) {
            this.f115363b = okHttpClient;
        } else {
            this.f115363b = IesDownLoadConfigProvider.getInstance().getOkHttpClient();
        }
    }

    /* renamed from: a */
    private static boolean m141550a(String str, long j, C44849d dVar) {
        if (str.startsWith("/data/data/")) {
            if (C44851d.m141538b() - j < 2097152) {
                dVar.mo59411a(C44850c.m141527a().mo107289a(8));
                return false;
            }
        } else if (C44851d.m141539c() - j < 2097152) {
            dVar.mo59411a(C44850c.m141527a().mo107289a(8));
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:81|82|(2:84|85)|(2:88|89)|90|91|92) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:21|22|(3:23|24|(3:26|(7:28|29|(1:31)|32|33|34|110)(1:109)|107)(1:108))|35|36|37|38|39|(3:40|41|42)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x0136 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x00f7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:90:0x0128 */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fc A[SYNTHETIC, Splitter:B:79:0x00fc] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0120 A[SYNTHETIC, Splitter:B:84:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0125 A[SYNTHETIC, Splitter:B:88:0x0125] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107299a(com.p280ss.android.ugc.iesdownload.p1745b.C44849d r17, com.p280ss.android.ugc.iesdownload.C44854e r18, java.lang.String r19, java.io.File r20, long r21, boolean r23, boolean r24, int r25, long r26, java.io.InputStream r28) {
        /*
            r16 = this;
            r1 = r16
            r8 = r17
            r0 = r18
            r9 = r19
            r10 = r26
            if (r23 != 0) goto L_0x002f
            if (r24 != 0) goto L_0x002f
            com.ss.android.ugc.iesdownload.c r0 = com.p280ss.android.ugc.iesdownload.C44850c.m141527a()
            r2 = 5
            com.ss.android.ugc.iesdownload.c r0 = r0.mo107289a(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "http status code: "
            r2.<init>(r3)
            r3 = r25
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.iesdownload.c r0 = r0.mo107290a(r2)
            r8.mo59411a(r0)
            return
        L_0x002f:
            if (r20 == 0) goto L_0x003a
            boolean r2 = r20.exists()
            if (r2 == 0) goto L_0x003a
            r20.delete()
        L_0x003a:
            boolean r2 = m141550a(r9, r10, r8)
            if (r2 != 0) goto L_0x0041
            return
        L_0x0041:
            com.ss.android.ugc.iesdownload.e r2 = r1.f115364c
            r12 = 1
            r2.f115348h = r12
            com.ss.android.ugc.iesdownload.e r2 = r1.f115364c
            long r3 = java.lang.System.currentTimeMillis()
            r2.f115344d = r3
            com.ss.android.ugc.iesdownload.e r2 = r1.f115364c
            int r2 = r2.f115341a
            r8.mo59407a(r2)
            r2 = 2048(0x800, float:2.87E-42)
            int r3 = r0.f115352l
            if (r3 == 0) goto L_0x005d
            int r2 = r0.f115352l
        L_0x005d:
            byte[] r0 = new byte[r2]
            r2 = 0
            java.io.BufferedInputStream r13 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00e3, all -> 0x00dd }
            r14 = r28
            r13.<init>(r14)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
            java.lang.String r3 = "rwd"
            r6.<init>(r9, r3)     // Catch:{ Exception -> 0x00d5, all -> 0x00d2 }
        L_0x006e:
            int r2 = r13.read(r0)     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            r3 = -1
            if (r2 == r3) goto L_0x0099
            r3 = 0
            r6.write(r0, r3, r2)     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x006e
            long r4 = r20.length()     // Catch:{ Exception -> 0x00cf, all -> 0x00cc }
            r2 = 100
            long r2 = r2 * r4
            long r2 = r2 / r10
            int r2 = (int) r2
            r3 = 100
            if (r2 <= r3) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r3 = r2
        L_0x008f:
            r2 = r17
            r15 = r6
            r6 = r26
            r2.mo59408a(r3, r4, r6)     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            r6 = r15
            goto L_0x006e
        L_0x0099:
            r15 = r6
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            com.ss.android.ugc.iesdownload.e r0 = r1.f115364c     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            r0.f115345e = r2     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            com.ss.android.ugc.iesdownload.e r0 = r1.f115364c     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            r0.f115346f = r10     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            com.ss.android.ugc.iesdownload.e r0 = r1.f115364c     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            r2 = 3
            r0.f115348h = r2     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            r16.m141548a()     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            com.ss.android.ugc.iesdownload.e r0 = r1.f115364c     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            java.lang.String r0 = r0.f115343c     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            com.p280ss.android.ugc.iesdownload.C44841a.m141512a(r9, r0)     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            com.ss.android.ugc.iesdownload.e r0 = r1.f115364c     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            java.lang.String r0 = r0.f115343c     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            r8.mo59412a(r0)     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
            r13.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            r15.close()     // Catch:{ IOException -> 0x00c2 }
        L_0x00c2:
            r28.close()     // Catch:{ Exception -> 0x00c6 }
            return
        L_0x00c6:
            return
        L_0x00c7:
            r0 = move-exception
            goto L_0x011e
        L_0x00ca:
            r0 = move-exception
            goto L_0x00d7
        L_0x00cc:
            r0 = move-exception
            r15 = r6
            goto L_0x011e
        L_0x00cf:
            r0 = move-exception
            r15 = r6
            goto L_0x00d7
        L_0x00d2:
            r0 = move-exception
            r15 = r2
            goto L_0x011e
        L_0x00d5:
            r0 = move-exception
            r15 = r2
        L_0x00d7:
            r2 = r13
            goto L_0x00e7
        L_0x00d9:
            r0 = move-exception
            goto L_0x00e0
        L_0x00db:
            r0 = move-exception
            goto L_0x00e6
        L_0x00dd:
            r0 = move-exception
            r14 = r28
        L_0x00e0:
            r13 = r2
            r15 = r13
            goto L_0x011e
        L_0x00e3:
            r0 = move-exception
            r14 = r28
        L_0x00e6:
            r15 = r2
        L_0x00e7:
            boolean r3 = m141550a(r9, r10, r8)     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            if (r3 != 0) goto L_0x00fc
            if (r2 == 0) goto L_0x00f2
            r2.close()     // Catch:{ IOException -> 0x00f2 }
        L_0x00f2:
            if (r15 == 0) goto L_0x00f7
            r15.close()     // Catch:{ IOException -> 0x00f7 }
        L_0x00f7:
            r28.close()     // Catch:{ Exception -> 0x00fb }
            return
        L_0x00fb:
            return
        L_0x00fc:
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            r3.<init>()     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            r4.<init>(r3, r12)     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20180a(r0, r4)     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            r3.close()     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            com.ss.android.ugc.iesdownload.c r3 = com.p280ss.android.ugc.iesdownload.C44850c.m141527a()     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            com.ss.android.ugc.iesdownload.c r0 = r3.mo107290a(r0)     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            r8.mo59411a(r0)     // Catch:{ Exception -> 0x012c, all -> 0x011c }
            goto L_0x012c
        L_0x011c:
            r0 = move-exception
            r13 = r2
        L_0x011e:
            if (r13 == 0) goto L_0x0123
            r13.close()     // Catch:{ IOException -> 0x0123 }
        L_0x0123:
            if (r15 == 0) goto L_0x0128
            r15.close()     // Catch:{ IOException -> 0x0128 }
        L_0x0128:
            r28.close()     // Catch:{ Exception -> 0x012b }
        L_0x012b:
            throw r0
        L_0x012c:
            if (r2 == 0) goto L_0x0131
            r2.close()     // Catch:{ IOException -> 0x0131 }
        L_0x0131:
            if (r15 == 0) goto L_0x0136
            r15.close()     // Catch:{ IOException -> 0x0136 }
        L_0x0136:
            r28.close()     // Catch:{ Exception -> 0x013a }
            return
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.iesdownload.C44857f.mo107299a(com.ss.android.ugc.iesdownload.b.d, com.ss.android.ugc.iesdownload.e, java.lang.String, java.io.File, long, boolean, boolean, int, long, java.io.InputStream):void");
    }
}
