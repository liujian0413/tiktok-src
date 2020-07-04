package com.facebook.bidding.p674a.p681h.p682a;

import com.facebook.ads.AdError;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.facebook.bidding.a.h.a.a */
public class C13221a {

    /* renamed from: g */
    private static final String f35035g = "a";

    /* renamed from: a */
    public int f35036a = AdError.SERVER_ERROR_CODE;

    /* renamed from: b */
    public int f35037b = 8000;

    /* renamed from: c */
    protected String f35038c = "UTF-8";

    /* renamed from: d */
    public Set<String> f35039d;

    /* renamed from: e */
    public Set<String> f35040e;

    /* renamed from: f */
    public Map<String, String> f35041f = new TreeMap();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001a A[SYNTHETIC, Splitter:B:16:0x001a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m38636a(java.net.HttpURLConnection r1, byte[] r2) {
        /*
            java.io.OutputStream r0 = r1.getOutputStream()     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x000c
            r0.write(r2)     // Catch:{ all -> 0x000a }
            goto L_0x000c
        L_0x000a:
            r1 = move-exception
            goto L_0x0018
        L_0x000c:
            int r1 = r1.getResponseCode()     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x0015
            r0.close()     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            return r1
        L_0x0016:
            r1 = move-exception
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x001d
            r0.close()     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bidding.p674a.p681h.p682a.C13221a.m38636a(java.net.HttpURLConnection, byte[]):int");
    }

    /* renamed from: a */
    private C13228h m38637a(C13227g gVar) {
        try {
            return m38638a(gVar.f35048a, gVar.f35049b, gVar.f35050c, gVar.f35051d);
        } catch (C13226f e) {
            m38642a(e);
            return null;
        } catch (Exception e2) {
            m38642a(new C13226f(e2, null));
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:3|4|(1:9)(1:8)|10|(1:15)(1:14)|16|(3:20|21|22)|23|24|(1:27)|28|(1:30)(1:31)|(1:33)|34) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0050 A[Catch:{ Exception -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0055 A[Catch:{ Exception -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0077 A[SYNTHETIC, Splitter:B:49:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x008b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.bidding.p674a.p681h.p682a.C13228h m38638a(java.lang.String r4, com.facebook.bidding.p674a.p681h.p682a.C13223c r5, java.lang.String r6, byte[] r7) {
        /*
            r3 = this;
            r0 = 0
            java.net.HttpURLConnection r4 = m38639a(r4)     // Catch:{ Exception -> 0x0067, all -> 0x0064 }
            r3.m38641a(r4, r5, r6)     // Catch:{ Exception -> 0x0062 }
            r3.m38640a(r4)     // Catch:{ Exception -> 0x0062 }
            r4.connect()     // Catch:{ Exception -> 0x0062 }
            java.util.Set<java.lang.String> r5 = r3.f35040e     // Catch:{ Exception -> 0x0062 }
            r6 = 1
            r1 = 0
            if (r5 == 0) goto L_0x001e
            java.util.Set<java.lang.String> r5 = r3.f35040e     // Catch:{ Exception -> 0x0062 }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x0062 }
            if (r5 != 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            java.util.Set<java.lang.String> r2 = r3.f35039d     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x002c
            java.util.Set<java.lang.String> r2 = r3.f35039d     // Catch:{ Exception -> 0x0062 }
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0062 }
            if (r2 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            boolean r1 = r4 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ Exception -> 0x0062 }
            if (r1 == 0) goto L_0x003f
            if (r5 != 0) goto L_0x0035
            if (r6 == 0) goto L_0x003f
        L_0x0035:
            r5 = r4
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ Exception -> 0x003f }
            java.util.Set<java.lang.String> r6 = r3.f35040e     // Catch:{ Exception -> 0x003f }
            java.util.Set<java.lang.String> r1 = r3.f35039d     // Catch:{ Exception -> 0x003f }
            com.facebook.bidding.p674a.p681h.p682a.C13229i.m38658a(r5, r6, r1)     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            boolean r5 = r4.getDoOutput()     // Catch:{ Exception -> 0x0062 }
            if (r5 == 0) goto L_0x004a
            if (r7 == 0) goto L_0x004a
            m38636a(r4, r7)     // Catch:{ Exception -> 0x0062 }
        L_0x004a:
            boolean r5 = r4.getDoInput()     // Catch:{ Exception -> 0x0062 }
            if (r5 == 0) goto L_0x0055
            com.facebook.bidding.a.h.a.h r5 = r3.m38644b(r4)     // Catch:{ Exception -> 0x0062 }
            goto L_0x005a
        L_0x0055:
            com.facebook.bidding.a.h.a.h r5 = new com.facebook.bidding.a.h.a.h     // Catch:{ Exception -> 0x0062 }
            r5.<init>(r4, r0)     // Catch:{ Exception -> 0x0062 }
        L_0x005a:
            if (r4 == 0) goto L_0x005f
            r4.disconnect()
        L_0x005f:
            return r5
        L_0x0060:
            r5 = move-exception
            goto L_0x0089
        L_0x0062:
            r5 = move-exception
            goto L_0x0069
        L_0x0064:
            r5 = move-exception
            r4 = r0
            goto L_0x0089
        L_0x0067:
            r5 = move-exception
            r4 = r0
        L_0x0069:
            com.facebook.bidding.a.h.a.h r6 = r3.m38645c(r4)     // Catch:{ Exception -> 0x0083, all -> 0x007d }
            int r7 = r6.f35052a     // Catch:{ all -> 0x0060 }
            if (r7 <= 0) goto L_0x0077
            if (r4 == 0) goto L_0x0076
            r4.disconnect()
        L_0x0076:
            return r6
        L_0x0077:
            com.facebook.bidding.a.h.a.f r7 = new com.facebook.bidding.a.h.a.f     // Catch:{ all -> 0x0060 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0060 }
            throw r7     // Catch:{ all -> 0x0060 }
        L_0x007d:
            com.facebook.bidding.a.h.a.f r6 = new com.facebook.bidding.a.h.a.f     // Catch:{ all -> 0x0060 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0060 }
            throw r6     // Catch:{ all -> 0x0060 }
        L_0x0083:
            com.facebook.bidding.a.h.a.f r6 = new com.facebook.bidding.a.h.a.f     // Catch:{ all -> 0x0060 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0060 }
            throw r6     // Catch:{ all -> 0x0060 }
        L_0x0089:
            if (r4 == 0) goto L_0x008e
            r4.disconnect()
        L_0x008e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bidding.p674a.p681h.p682a.C13221a.m38638a(java.lang.String, com.facebook.bidding.a.h.a.c, java.lang.String, byte[]):com.facebook.bidding.a.h.a.h");
    }

    /* renamed from: a */
    private static HttpURLConnection m38639a(String str) {
        try {
            return (HttpURLConnection) new URL(str).openConnection();
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" is not a valid URL");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private void m38640a(HttpURLConnection httpURLConnection) {
        for (String str : this.f35041f.keySet()) {
            C13222b.m38650a(httpURLConnection, str, (String) this.f35041f.get(str));
        }
        C13222b.m38650a(httpURLConnection, "Accept-Charset", this.f35038c);
    }

    /* renamed from: a */
    private void m38641a(HttpURLConnection httpURLConnection, C13223c cVar, String str) {
        httpURLConnection.setConnectTimeout(this.f35036a);
        httpURLConnection.setReadTimeout(this.f35037b);
        httpURLConnection.setRequestMethod(cVar.mo32416c());
        httpURLConnection.setDoOutput(cVar.mo32415b());
        httpURLConnection.setDoInput(cVar.mo32414a());
        if (str != null) {
            C13222b.m38650a(httpURLConnection, "Content-Type", str);
        }
    }

    /* renamed from: a */
    private static boolean m38642a(C13226f fVar) {
        C13228h a = fVar.mo32417a();
        return a != null && a.f35052a > 0;
    }

    /* renamed from: a */
    private static byte[] m38643a(InputStream inputStream) {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001d A[SYNTHETIC, Splitter:B:17:0x001d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.bidding.p674a.p681h.p682a.C13228h m38644b(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.InputStream r1 = com.facebook.bidding.p674a.p681h.p682a.C13222b.m38649a(r4)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x000e
            byte[] r0 = m38643a(r1)     // Catch:{ all -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r4 = move-exception
            goto L_0x001b
        L_0x000e:
            com.facebook.bidding.a.h.a.h r2 = new com.facebook.bidding.a.h.a.h     // Catch:{ all -> 0x000c }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            return r2
        L_0x0019:
            r4 = move-exception
            r1 = r0
        L_0x001b:
            if (r1 == 0) goto L_0x0020
            r1.close()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bidding.p674a.p681h.p682a.C13221a.m38644b(java.net.HttpURLConnection):com.facebook.bidding.a.h.a.h");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001d A[SYNTHETIC, Splitter:B:17:0x001d] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.bidding.p674a.p681h.p682a.C13228h m38645c(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            r0 = 0
            java.io.InputStream r1 = r4.getErrorStream()     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x000e
            byte[] r0 = m38643a(r1)     // Catch:{ all -> 0x000c }
            goto L_0x000e
        L_0x000c:
            r4 = move-exception
            goto L_0x001b
        L_0x000e:
            com.facebook.bidding.a.h.a.h r2 = new com.facebook.bidding.a.h.a.h     // Catch:{ all -> 0x000c }
            r2.<init>(r4, r0)     // Catch:{ all -> 0x000c }
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ Exception -> 0x0018 }
        L_0x0018:
            return r2
        L_0x0019:
            r4 = move-exception
            r1 = r0
        L_0x001b:
            if (r1 == 0) goto L_0x0020
            r1.close()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bidding.p674a.p681h.p682a.C13221a.m38645c(java.net.HttpURLConnection):com.facebook.bidding.a.h.a.h");
    }

    /* renamed from: a */
    public final C13221a mo32411a(String str, String str2) {
        this.f35041f.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C13228h mo32412a(String str, String str2, byte[] bArr) {
        return m38637a((C13227g) new C13225e(str, null, str2, bArr));
    }

    /* renamed from: a */
    public final C13228h mo32413a(String str, Map<String, String> map) {
        return m38637a((C13227g) new C13224d(str, null));
    }
}
