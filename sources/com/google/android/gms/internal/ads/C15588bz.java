package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.bz */
public final class C15588bz {

    /* renamed from: a */
    private BlockingQueue<C15600ck> f44208a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    private ExecutorService f44209b;

    /* renamed from: c */
    private LinkedHashMap<String, String> f44210c = new LinkedHashMap<>();

    /* renamed from: d */
    private Map<String, C15594ce> f44211d = new HashMap();

    /* renamed from: e */
    private String f44212e;

    /* renamed from: f */
    private Context f44213f;

    /* renamed from: g */
    private String f44214g;

    /* renamed from: h */
    private AtomicBoolean f44215h;

    /* renamed from: i */
    private File f44216i;

    /* renamed from: a */
    public final void mo41447a(Context context, String str, String str2, Map<String, String> map) {
        this.f44213f = context;
        this.f44214g = str;
        this.f44212e = str2;
        this.f44215h = new AtomicBoolean(false);
        this.f44215h.set(((Boolean) bym.m50299d().mo41272a(C15585bw.f43742P)).booleanValue());
        if (this.f44215h.get()) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                this.f44216i = new File(externalStorageDirectory, "sdk_csi_data.txt");
            }
        }
        for (Entry entry : map.entrySet()) {
            this.f44210c.put((String) entry.getKey(), (String) entry.getValue());
        }
        this.f44209b = C15590ca.m50343a();
        this.f44209b.execute(new C15591cb(this));
        this.f44211d.put("action", C15594ce.f44219b);
        this.f44211d.put("ad_format", C15594ce.f44219b);
        this.f44211d.put("e", C15594ce.f44220c);
    }

    /* renamed from: a */
    public final void mo41448a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f44210c.put("e", TextUtils.join(",", list));
        }
    }

    /* renamed from: a */
    public final boolean mo41449a(C15600ck ckVar) {
        return this.f44208a.offer(ckVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f A[SYNTHETIC, Splitter:B:31:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae A[SYNTHETIC, Splitter:B:36:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0000 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m50336a() {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.BlockingQueue<com.google.android.gms.internal.ads.ck> r0 = r5.f44208a     // Catch:{ InterruptedException -> 0x00c9 }
            java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x00c9 }
            com.google.android.gms.internal.ads.ck r0 = (com.google.android.gms.internal.ads.C15600ck) r0     // Catch:{ InterruptedException -> 0x00c9 }
            java.lang.String r1 = r0.mo41461b()     // Catch:{ InterruptedException -> 0x00c9 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0000
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r2 = r5.f44210c
            java.util.Map r0 = r0.mo41462c()
            java.util.Map r0 = r5.mo41446a(r2, r0)
            java.lang.String r2 = r5.f44212e
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.appendQueryParameter(r4, r3)
            goto L_0x002e
        L_0x004a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            java.lang.String r2 = "&it="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.f44215h
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x00c0
            java.io.File r1 = r5.f44216i
            if (r1 == 0) goto L_0x00b9
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0097 }
            r4 = 1
            r3.<init>(r1, r4)     // Catch:{ IOException -> 0x0097 }
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r3.write(r0)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r0 = 10
            r3.write(r0)     // Catch:{ IOException -> 0x0092, all -> 0x008f }
            r3.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x0000
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.acd.m45780c(r1, r0)
            goto L_0x0000
        L_0x008f:
            r0 = move-exception
            r2 = r3
            goto L_0x00ac
        L_0x0092:
            r0 = move-exception
            r2 = r3
            goto L_0x0098
        L_0x0095:
            r0 = move-exception
            goto L_0x00ac
        L_0x0097:
            r0 = move-exception
        L_0x0098:
            java.lang.String r1 = "CsiReporter: Cannot write to file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.acd.m45780c(r1, r0)     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x0000
            r2.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x0000
        L_0x00a4:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.acd.m45780c(r1, r0)
            goto L_0x0000
        L_0x00ac:
            if (r2 == 0) goto L_0x00b8
            r2.close()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b8
        L_0x00b2:
            r1 = move-exception
            java.lang.String r2 = "CsiReporter: Cannot close file: sdk_csi_data.txt."
            com.google.android.gms.internal.ads.acd.m45780c(r2, r1)
        L_0x00b8:
            throw r0
        L_0x00b9:
            java.lang.String r0 = "CsiReporter: File doesn't exists. Cannot write CSI data to file."
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            goto L_0x0000
        L_0x00c0:
            android.content.Context r1 = r5.f44213f
            java.lang.String r2 = r5.f44214g
            com.google.android.gms.internal.ads.acl.m45528a(r1, r2, r0)
            goto L_0x0000
        L_0x00c9:
            r0 = move-exception
            java.lang.String r1 = "CsiReporter:reporter interrupted"
            com.google.android.gms.internal.ads.acd.m45780c(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15588bz.m50336a():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Map<String, String> mo41446a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, mo41445a(str).mo41451a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final C15594ce mo41445a(String str) {
        C15594ce ceVar = (C15594ce) this.f44211d.get(str);
        if (ceVar != null) {
            return ceVar;
        }
        return C15594ce.f44218a;
    }
}
