package com.bytedance.android.livesdk.feed.tab.p364b;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.bytedance.android.live.core.utils.C3408u;
import com.bytedance.android.livesdk.feed.C6039l;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.feed.C5990g;
import com.bytedance.android.livesdk.feed.services.C6121d;
import com.bytedance.android.livesdk.feed.tab.p235a.C6125b;
import com.bytedance.android.livesdk.feed.tab.p235a.C6126c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p481c.C9721b;
import com.google.gson.C6600e;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.l */
public class C7768l implements C7772o {

    /* renamed from: a */
    private Context f20992a;

    /* renamed from: b */
    private C6126c f20993b;

    /* renamed from: c */
    private List<C5989f> f20994c;

    /* renamed from: d */
    private C6039l<C5989f> f20995d;

    /* renamed from: e */
    private C6600e f20996e;

    /* renamed from: f */
    private Map<Long, C5989f> f20997f = new ConcurrentHashMap();

    /* renamed from: g */
    private C5990g f20998g = null;

    /* renamed from: h */
    private C6125b f20999h;

    /* renamed from: a */
    public final C7492s<List<C5989f>> mo20447a() {
        return C7492s.m23282a((C7495v<T>) new C7770m<T>(this)).mo19304b(C7333a.m23044b());
    }

    /* renamed from: b */
    public final List<C5989f> mo20451b() {
        m23878c();
        return new ArrayList(this.f20994c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m23878c() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.bytedance.android.livesdk.feed.feed.f> r0 = r3.f20994c     // Catch:{ all -> 0x0034 }
            boolean r0 = m23879c(r0)     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0032
            com.bytedance.android.livesdk.feed.tab.b.l$1 r0 = new com.bytedance.android.livesdk.feed.tab.b.l$1     // Catch:{ all -> 0x0034 }
            r0.<init>()     // Catch:{ all -> 0x0034 }
            com.bytedance.android.livesdk.feed.tab.a.b r1 = r3.f20999h     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.mo14780a()     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = ""
            java.lang.Object r0 = r3.m23876a(r0, r1, r2)     // Catch:{ all -> 0x0034 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0034 }
            r3.m23877b(r0)     // Catch:{ all -> 0x0034 }
            java.util.List<com.bytedance.android.livesdk.feed.feed.f> r0 = r3.f20994c     // Catch:{ all -> 0x0034 }
            boolean r0 = m23879c(r0)     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x0030
            com.bytedance.android.livesdk.feed.tab.a.c r0 = r3.f20993b     // Catch:{ all -> 0x0034 }
            java.util.List r0 = r0.mo14782a()     // Catch:{ all -> 0x0034 }
            r3.m23877b(r0)     // Catch:{ all -> 0x0034 }
        L_0x0030:
            monitor-exit(r3)
            return
        L_0x0032:
            monitor-exit(r3)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.p364b.C7768l.m23878c():void");
    }

    /* renamed from: b */
    private synchronized void m23877b(List<C5989f> list) {
        this.f20994c = list;
        m23881e(list);
    }

    /* renamed from: c */
    private static boolean m23879c(List<C5989f> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C5989f mo20446a(long j) {
        m23878c();
        return (C5989f) this.f20997f.get(Long.valueOf(j));
    }

    /* renamed from: d */
    private static boolean m23880d(List<C5989f> list) {
        if (!m23879c(list)) {
            return false;
        }
        for (C5989f fVar : list) {
            if (fVar != null) {
                if (!fVar.mo14646b()) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m23881e(List<C5989f> list) {
        if (!C6311g.m19573a(list)) {
            for (C5989f fVar : list) {
                if (fVar != null) {
                    this.f20997f.put(Long.valueOf(fVar.f17751a), fVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20448a(C47870u uVar) throws Exception {
        m23878c();
        if (m23879c(this.f20994c)) {
            uVar.mo19239a((Object) new ArrayList(this.f20994c));
            uVar.mo19238a();
            return;
        }
        uVar.mo19240a((Throwable) new IllegalStateException("tab list wrong"));
    }

    /* renamed from: a */
    public final boolean mo20449a(C5990g gVar) {
        if (gVar == null) {
            return true;
        }
        if (this.f20998g != null && gVar.now < this.f20998g.now) {
            return true;
        }
        try {
            String b = this.f20996e.mo15979b((Object) gVar);
            Editor edit = C7285c.m22838a(this.f20992a, "ttlive_tabs_cache", 0).edit();
            edit.putString(this.f20999h.mo14781b(), b);
            C9721b.m28656a(edit);
            this.f20998g = gVar;
            return true;
        } catch (JsonIOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo20450a(java.util.List<com.bytedance.android.livesdk.feed.feed.C5989f> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            if (r4 == 0) goto L_0x004b
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x004b
            boolean r1 = m23880d(r4)     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0011
            goto L_0x004b
        L_0x0011:
            com.bytedance.android.livesdk.feed.l<com.bytedance.android.livesdk.feed.feed.f> r1 = r3.f20995d     // Catch:{ all -> 0x0048 }
            java.util.List<com.bytedance.android.livesdk.feed.feed.f> r2 = r3.f20994c     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.mo14694a(r4, r2)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x001d
            monitor-exit(r3)
            return r0
        L_0x001d:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r1.<init>(r4)     // Catch:{ all -> 0x0048 }
            r3.m23877b(r1)     // Catch:{ all -> 0x0048 }
            com.google.gson.e r1 = r3.f20996e     // Catch:{ JsonIOException -> 0x0046 }
            java.lang.String r4 = r1.mo15979b(r4)     // Catch:{ JsonIOException -> 0x0046 }
            android.content.Context r1 = r3.f20992a     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = "ttlive_tabs_cache"
            android.content.SharedPreferences r0 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r1, r2, r0)     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0048 }
            com.bytedance.android.livesdk.feed.tab.a.b r1 = r3.f20999h     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r1.mo14780a()     // Catch:{ all -> 0x0048 }
            r0.putString(r1, r4)     // Catch:{ all -> 0x0048 }
            com.bytedance.common.utility.p481c.C9721b.m28656a(r0)     // Catch:{ all -> 0x0048 }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x0046:
            monitor-exit(r3)
            return r0
        L_0x0048:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L_0x004b:
            monitor-exit(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.p364b.C7768l.mo20450a(java.util.List):boolean");
    }

    /* renamed from: a */
    private <T> T m23876a(C6597a<T> aVar, String str, String str2) {
        String string = C7285c.m22838a(this.f20992a, "ttlive_tabs_cache", 0).getString(str, str2);
        if (C6319n.m19593a(string)) {
            return null;
        }
        try {
            return C3408u.m12668a(string, aVar.type);
        } catch (JsonParseException e) {
            C6312h.m19577a((Throwable) e);
            return null;
        }
    }

    public C7768l(C6125b bVar, C6126c cVar, Context context, C6039l<C5989f> lVar) {
        this.f20999h = bVar;
        this.f20993b = cVar;
        this.f20992a = context;
        this.f20995d = lVar;
        this.f20996e = C6121d.m19069c();
    }
}
