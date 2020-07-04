package com.p280ss.android.deviceregister.p290b.p291a.p292a;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.b.a.a.d */
public final class C19309d extends C19301b {

    /* renamed from: h */
    private static volatile Pair<byte[], String> f52213h;

    /* renamed from: i */
    private static volatile Pair<String, byte[]> f52214i;

    /* renamed from: a */
    public volatile Map<String, String> f52215a;

    /* renamed from: b */
    public AtomicBoolean f52216b = new AtomicBoolean(false);

    /* renamed from: d */
    private final String f52217d = Environment.getExternalStorageState();

    /* renamed from: e */
    private final Context f52218e;

    /* renamed from: f */
    private final boolean f52219f;

    /* renamed from: g */
    private String f52220g;

    /* renamed from: com.ss.android.deviceregister.b.a.a.d$a */
    class C19311a implements Runnable {
        public final void run() {
            C19309d.this.f52216b.set(false);
            String str = "";
            try {
                if (C19309d.this.f52215a != null) {
                    str = C19309d.m63315a(C19309d.this.f52215a);
                }
            } catch (Throwable unused) {
            }
            C19309d.this.mo51215d(str);
        }

        private C19311a() {
        }
    }

    /* renamed from: a */
    private String m63314a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52220g);
        sb.append("/device_parameters");
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: b */
    private String m63317b() {
        char[] cArr = new char[21];
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52218e.getString(R.string.bxa));
        sb.append(C6785c.m21010a());
        String sb2 = sb.toString();
        cArr[5] = sb2.charAt(10);
        cArr[11] = sb2.charAt(13);
        cArr[17] = sb2.charAt(11);
        cArr[2] = sb2.charAt(1);
        cArr[18] = sb2.charAt(4);
        cArr[10] = sb2.charAt(12);
        cArr[0] = sb2.charAt(1);
        cArr[6] = sb2.charAt(8);
        cArr[13] = sb2.charAt(5);
        cArr[8] = sb2.charAt(9);
        cArr[1] = sb2.charAt(3);
        cArr[12] = sb2.charAt(13);
        cArr[4] = sb2.charAt(15);
        cArr[14] = sb2.charAt(18);
        cArr[7] = sb2.charAt(17);
        cArr[16] = sb2.charAt(14);
        cArr[3] = sb2.charAt(11);
        cArr[15] = sb2.charAt(13);
        cArr[19] = sb2.charAt(19);
        cArr[9] = sb2.charAt(9);
        cArr[20] = sb2.charAt(7);
        return new String(cArr).substring(2, 18);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo51197a(String str) {
        return m63318e(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String[] mo51201b(String str) {
        String e = m63318e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        return e.split("\n");
    }

    /* renamed from: c */
    public final void mo51202c(String str) {
        if (this.f52215a != null && this.f52215a.containsKey(str)) {
            this.f52215a.remove(str);
        }
        m63320g(str, null);
        super.mo51202c(str);
    }

    /* renamed from: a */
    public static String m63315a(Map<String, String> map) throws JSONException {
        if (map == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject.toString();
    }

    /* renamed from: f */
    private static Map<String, String> m63319f(String str) throws JSONException {
        if (C6319n.m19593a(str)) {
            return new ConcurrentHashMap();
        }
        JSONObject jSONObject = new JSONObject(str);
        Iterator keys = jSONObject.keys();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            concurrentHashMap.put(str2, (String) jSONObject.get(str2));
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    private String m63316a(byte[] bArr) {
        if (f52213h != null && Arrays.equals(bArr, (byte[]) f52213h.first)) {
            return (String) f52213h.second;
        }
        if (f52214i != null && Arrays.equals(bArr, (byte[]) f52214i.second)) {
            return (String) f52214i.first;
        }
        String str = null;
        try {
            str = C6785c.m21012a(bArr, m63317b());
        } catch (Exception unused) {
        }
        if (str != null) {
            f52213h = new Pair<>(bArr, str);
        }
        return str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|(2:16|17)|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0049 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0059 A[SYNTHETIC, Splitter:B:31:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e A[SYNTHETIC, Splitter:B:35:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0065 A[SYNTHETIC, Splitter:B:43:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x006a A[SYNTHETIC, Splitter:B:47:0x006a] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51215d(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "mounted"
            java.lang.String r1 = r5.f52217d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            java.lang.String r2 = r5.f52220g     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            if (r2 != 0) goto L_0x0020
            boolean r1 = r1.mkdirs()     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            if (r1 != 0) goto L_0x0020
            return
        L_0x0020:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            java.lang.String r2 = r5.m63314a()     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            java.lang.String r3 = "rwd"
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x0062, all -> 0x0055 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ Exception -> 0x0063, all -> 0x0053 }
            java.nio.channels.FileLock r1 = r1.lock()     // Catch:{ Exception -> 0x0063, all -> 0x0053 }
            byte[] r6 = r5.m63321g(r6)     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            r3 = 0
            r2.setLength(r3)     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            r2.write(r6)     // Catch:{ Exception -> 0x0051, all -> 0x004e }
            if (r1 == 0) goto L_0x0049
            r1.release()     // Catch:{ Exception -> 0x0049 }
        L_0x0049:
            r2.close()     // Catch:{ Exception -> 0x004d }
            return
        L_0x004d:
            return
        L_0x004e:
            r6 = move-exception
            r0 = r1
            goto L_0x0057
        L_0x0051:
            r0 = r1
            goto L_0x0063
        L_0x0053:
            r6 = move-exception
            goto L_0x0057
        L_0x0055:
            r6 = move-exception
            r2 = r0
        L_0x0057:
            if (r0 == 0) goto L_0x005c
            r0.release()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r6
        L_0x0062:
            r2 = r0
        L_0x0063:
            if (r0 == 0) goto L_0x0068
            r0.release()     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ Exception -> 0x006e }
            goto L_0x006f
        L_0x006e:
            return
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.p290b.p291a.p292a.C19309d.mo51215d(java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:28|(1:30)|(2:32|33)|34|35|36) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:16|17|18|19|(6:20|21|(2:23|(2:26|(6:28|(1:30)|(2:32|33)|34|35|36)(8:38|39|40|(1:42)|(2:44|45)|46|47|48)))|50|(1:52)|(2:54|55))|56|57|88) */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:38|39|40|(1:42)|(2:44|45)|46|47|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00ee, code lost:
        if (r2 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0087 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x00a3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00b7 */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d3 A[SYNTHETIC, Splitter:B:70:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d8 A[SYNTHETIC, Splitter:B:74:0x00d8] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00eb A[SYNTHETIC, Splitter:B:84:0x00eb] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m63318e(java.lang.String r7) {
        /*
            r6 = this;
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r7)
            if (r0 != 0) goto L_0x0013
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52215a
            if (r0 == 0) goto L_0x0013
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52215a
            java.lang.Object r7 = r0.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L_0x0013:
            java.lang.String r0 = "mounted"
            java.lang.String r1 = r6.f52217d
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x001f
            return r1
        L_0x001f:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.lang.String r2 = r6.f52220g     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            if (r0 != 0) goto L_0x0038
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f52215a
            if (r7 != 0) goto L_0x0037
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f52215a = r7
        L_0x0037:
            return r1
        L_0x0038:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.lang.String r2 = r6.m63314a()     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.lang.String r3 = "rwd"
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x00dc, all -> 0x00c4 }
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            boolean r0 = r0.isFile()     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            if (r0 == 0) goto L_0x00a7
            r0 = 2049(0x801, float:2.871E-42)
            byte[] r4 = new byte[r0]     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            r5 = 0
            int r5 = r2.read(r4, r5, r0)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            if (r5 <= 0) goto L_0x00a7
            if (r5 >= r0) goto L_0x00a7
            byte[] r0 = java.util.Arrays.copyOf(r4, r5)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.lang.String r0 = r6.m63316a(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.util.Map r0 = m63319f(r0)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            r6.f52215a = r0     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r7)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            if (r0 == 0) goto L_0x008b
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f52215a
            if (r7 != 0) goto L_0x0082
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f52215a = r7
        L_0x0082:
            if (r3 == 0) goto L_0x0087
            r3.release()     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            r2.close()     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            return r1
        L_0x008b:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52215a     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00be, all -> 0x00bb }
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52215a
            if (r0 != 0) goto L_0x009e
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r6.f52215a = r0
        L_0x009e:
            if (r3 == 0) goto L_0x00a3
            r3.release()     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            r2.close()     // Catch:{ Exception -> 0x00a6 }
        L_0x00a6:
            return r7
        L_0x00a7:
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f52215a
            if (r7 != 0) goto L_0x00b2
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f52215a = r7
        L_0x00b2:
            if (r3 == 0) goto L_0x00b7
            r3.release()     // Catch:{ Exception -> 0x00b7 }
        L_0x00b7:
            r2.close()     // Catch:{ Exception -> 0x00f1 }
            goto L_0x00f1
        L_0x00bb:
            r7 = move-exception
            r1 = r3
            goto L_0x00c6
        L_0x00be:
            goto L_0x00de
        L_0x00c0:
            r7 = move-exception
            goto L_0x00c6
        L_0x00c2:
            r3 = r1
            goto L_0x00de
        L_0x00c4:
            r7 = move-exception
            r2 = r1
        L_0x00c6:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.f52215a
            if (r0 != 0) goto L_0x00d1
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r6.f52215a = r0
        L_0x00d1:
            if (r1 == 0) goto L_0x00d6
            r1.release()     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            if (r2 == 0) goto L_0x00db
            r2.close()     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            throw r7
        L_0x00dc:
            r2 = r1
            r3 = r2
        L_0x00de:
            java.util.Map<java.lang.String, java.lang.String> r7 = r6.f52215a
            if (r7 != 0) goto L_0x00e9
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r6.f52215a = r7
        L_0x00e9:
            if (r3 == 0) goto L_0x00ee
            r3.release()     // Catch:{ Exception -> 0x00ee }
        L_0x00ee:
            if (r2 == 0) goto L_0x00f1
            goto L_0x00b7
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.deviceregister.p290b.p291a.p292a.C19309d.m63318e(java.lang.String):java.lang.String");
    }

    /* renamed from: g */
    private byte[] m63321g(String str) {
        if (f52214i != null && C6319n.m19594a(str, (String) f52214i.first)) {
            return (byte[]) f52214i.second;
        }
        if (f52213h != null && C6319n.m19594a(str, (String) f52213h.second)) {
            return (byte[]) f52213h.first;
        }
        byte[] bArr = null;
        try {
            bArr = C6785c.m21014a(str, m63317b());
        } catch (Exception unused) {
        }
        if (bArr != null) {
            f52214i = new Pair<>(str, bArr);
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51199a(String str, String str2) {
        m63320g(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51200a(String str, String[] strArr) {
        if (strArr != null) {
            mo51199a(str, TextUtils.join("\n", strArr));
        }
    }

    /* renamed from: g */
    private void m63320g(String str, String str2) {
        if (this.f52215a == null) {
            m63318e(null);
            if (this.f52215a == null) {
                this.f52215a = new ConcurrentHashMap();
            }
        }
        if (!C6319n.m19594a((String) this.f52215a.get(str), str2)) {
            if (TextUtils.isEmpty(str2) && this.f52215a.containsKey(str)) {
                this.f52215a.remove(str);
            } else if (!TextUtils.isEmpty(str2)) {
                this.f52215a.put(str, str2);
            }
            if (this.f52219f && this.f52216b.compareAndSet(false, true)) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        C6304f.submitRunnable(new C19311a());
                    }
                }, 1000);
            }
        }
    }

    public C19309d(Context context, boolean z, String str) {
        this.f52220g = str;
        this.f52219f = z;
        this.f52218e = context;
    }
}
