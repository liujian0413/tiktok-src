package com.p280ss.android.ugc.aweme.tools.music.lrc;

import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.tools.music.p1674c.C42447f;
import com.p280ss.android.ugc.aweme.utils.C42954ax;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.b */
public class C42452b {

    /* renamed from: c */
    private static C42452b f110353c;

    /* renamed from: a */
    public final int f110354a = 10;

    /* renamed from: b */
    public final int f110355b = 11;

    /* renamed from: d */
    private C6600e f110356d;

    /* renamed from: e */
    private C42954ax f110357e;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.b$a */
    class C42458a {

        /* renamed from: a */
        public int f110371a;

        /* renamed from: b */
        public List<C42450a> f110372b;

        C42458a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.b$b */
    public interface C42459b {
        /* renamed from: a */
        void mo103910a(String str, List<C42450a> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.lrc.b$c */
    public interface C42460c {
        /* renamed from: a */
        void mo103869a(int i, String str, JSONArray jSONArray);
    }

    /* renamed from: b */
    public static File m134913b() {
        return m134911a("lrc");
    }

    /* renamed from: a */
    public static C42452b m134910a() {
        if (f110353c == null) {
            synchronized (C42452b.class) {
                if (f110353c == null) {
                    f110353c = new C42452b();
                }
            }
        }
        return f110353c;
    }

    private C42452b() {
        try {
            this.f110357e = C42954ax.m136348a(m134913b(), 1, 1, 3145728);
            this.f110356d = C42447f.m134903a();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    private static File m134911a(String str) {
        File file = new File(C7276d.m22800a(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: a */
    public static JSONArray m134912a(List<C42450a> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        while (i < list.size()) {
            C42450a aVar = (C42450a) list.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", aVar.f110351b);
                jSONObject.put("timeId", String.valueOf(aVar.f110350a));
                jSONArray.put(jSONObject);
                i++;
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    private List<C42450a> m134914b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i != 11) {
            return (List) this.f110356d.mo15975a(str, new C6597a<ArrayList<C42450a>>() {
            }.type);
        }
        C42450a aVar = new C42450a(0.0f, str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023 A[SYNTHETIC, Splitter:B:17:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002a A[SYNTHETIC, Splitter:B:25:0x002a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.tools.music.lrc.C42450a> mo103956a(java.lang.String r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            com.ss.android.ugc.aweme.utils.ax r1 = r2.f110357e     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            com.ss.android.ugc.aweme.utils.ax$c r3 = r1.mo104646a(r3)     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            if (r3 == 0) goto L_0x001f
            r1 = 0
            java.io.InputStream r3 = r3.mo104668a(r1)     // Catch:{ IOException -> 0x0027, all -> 0x0020 }
            java.lang.String r1 = com.p280ss.android.ugc.aweme.utils.C42973bg.m136424a(r3, r0)     // Catch:{ IOException -> 0x0028, all -> 0x001c }
            java.util.List r4 = r2.m134914b(r1, r4)     // Catch:{ IOException -> 0x0028, all -> 0x001c }
            if (r3 == 0) goto L_0x001b
            r3.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return r4
        L_0x001c:
            r4 = move-exception
            r0 = r3
            goto L_0x0021
        L_0x001f:
            return r0
        L_0x0020:
            r4 = move-exception
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            throw r4
        L_0x0027:
            r3 = r0
        L_0x0028:
            if (r3 == 0) goto L_0x002d
            r3.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.music.lrc.C42452b.mo103956a(java.lang.String, int):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c A[SYNTHETIC, Splitter:B:21:0x003c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.p280ss.android.ugc.aweme.tools.music.lrc.C42450a> mo103957a(java.lang.String r3, int r4, java.lang.String r5) {
        /*
            r2 = this;
            r0 = 0
            java.lang.String r3 = com.p280ss.android.ugc.aweme.tools.music.p1674c.C42442c.C42443a.m134900a(r3)     // Catch:{ Exception -> 0x0039 }
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x000c
            return r0
        L_0x000c:
            java.util.List r4 = r2.m134914b(r3, r4)     // Catch:{ Exception -> 0x0039 }
            com.ss.android.ugc.aweme.utils.ax r1 = r2.f110357e     // Catch:{ Exception -> 0x0037 }
            com.ss.android.ugc.aweme.utils.ax$a r5 = r1.mo104649b(r5)     // Catch:{ Exception -> 0x0037 }
            if (r5 == 0) goto L_0x0031
            r1 = 0
            java.io.OutputStream r1 = r5.mo104657a(r1)     // Catch:{ Exception -> 0x0037 }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x002f }
            r1.write(r3)     // Catch:{ Exception -> 0x002f }
            r1.flush()     // Catch:{ Exception -> 0x002f }
            r1.close()     // Catch:{ Exception -> 0x002f }
            r5.mo104658a()     // Catch:{ Exception -> 0x002f }
            r0 = r1
            goto L_0x0031
        L_0x002f:
            r0 = r1
            goto L_0x003a
        L_0x0031:
            com.ss.android.ugc.aweme.utils.ax r3 = r2.f110357e     // Catch:{ Exception -> 0x0037 }
            r3.mo104654d()     // Catch:{ Exception -> 0x0037 }
            goto L_0x003f
        L_0x0037:
            goto L_0x003a
        L_0x0039:
            r4 = r0
        L_0x003a:
            if (r0 == 0) goto L_0x003f
            r0.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.music.lrc.C42452b.mo103957a(java.lang.String, int, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final void mo103958a(final String str, final int i, C42459b bVar) {
        if (!TextUtils.isEmpty(str)) {
            final SoftReference softReference = new SoftReference(bVar);
            C1592h.m7853a((Callable<TResult>) new Callable<List<C42450a>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public List<C42450a> call() throws Exception {
                    String a = C6306c.m19561a(str);
                    List<C42450a> a2 = C42452b.this.mo103956a(a, i);
                    if (!C6307b.m19566a((Collection<T>) a2)) {
                        return a2;
                    }
                    List<C42450a> a3 = C42452b.this.mo103957a(str, i, a);
                    if (!C6307b.m19566a((Collection<T>) a3)) {
                        return a3;
                    }
                    return null;
                }
            }).mo6880b(new C1591g<List<C42450a>, C1592h<Void>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C1592h then(C1592h<List<C42450a>> hVar) throws Exception {
                    if (!(softReference == null || softReference.get() == null)) {
                        ((C42459b) softReference.get()).mo103910a(str, (List) hVar.mo6890e());
                    }
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo103959a(final String str, final int i, C42460c cVar) {
        if (!TextUtils.isEmpty(str)) {
            final SoftReference softReference = new SoftReference(cVar);
            C1592h.m7853a((Callable<TResult>) new Callable<C42458a>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C42458a call() throws Exception {
                    C42458a aVar = new C42458a();
                    String a = C6306c.m19561a(str);
                    List<C42450a> a2 = C42452b.this.mo103956a(a, i);
                    if (!C6307b.m19566a((Collection<T>) a2)) {
                        aVar.f110371a = 1;
                        aVar.f110372b = a2;
                        return aVar;
                    }
                    List<C42450a> a3 = C42452b.this.mo103957a(str, i, a);
                    if (C6307b.m19566a((Collection<T>) a3)) {
                        return null;
                    }
                    aVar.f110371a = 2;
                    aVar.f110372b = a3;
                    return aVar;
                }
            }).mo6880b(new C1591g<C42458a, C1592h<Void>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C1592h then(C1592h<C42458a> hVar) throws Exception {
                    if (!(softReference == null || softReference.get() == null)) {
                        ((C42460c) softReference.get()).mo103869a(((C42458a) hVar.mo6890e()).f110371a, str, C42452b.m134912a(((C42458a) hVar.mo6890e()).f110372b));
                    }
                    return null;
                }
            }, C1592h.f5958b);
        }
    }
}
