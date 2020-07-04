package com.bytedance.android.livesdk.i18n;

import android.arch.persistence.room.C0160e;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.i18n.p395db.C8325a;
import com.bytedance.android.livesdk.i18n.p395db.C8326b;
import com.bytedance.android.livesdk.i18n.p395db.C8329d;
import com.bytedance.android.livesdk.i18n.p395db.C8330e;
import com.bytedance.android.livesdk.i18n.p395db.I18nDatabase;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import p346io.reactivex.C7329e;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.i18n.c */
final class C8320c {

    /* renamed from: b */
    private static C8330e f22848b;

    /* renamed from: c */
    private static C8326b f22849c;

    /* renamed from: a */
    private String f22850a;

    /* renamed from: d */
    private C8321a f22851d;

    /* renamed from: e */
    private boolean f22852e;

    /* renamed from: f */
    private boolean f22853f;

    /* renamed from: g */
    private long f22854g;

    /* renamed from: h */
    private Map<String, String> f22855h;

    /* renamed from: i */
    private C7321c f22856i;

    /* renamed from: j */
    private C7321c f22857j;

    /* renamed from: com.bytedance.android.livesdk.i18n.c$a */
    interface C8321a {
        /* renamed from: a */
        void mo21484a(String str, C8322b bVar);

        /* renamed from: a */
        void mo21485a(String str, Exception exc);
    }

    /* renamed from: com.bytedance.android.livesdk.i18n.c$b */
    static class C8322b {

        /* renamed from: a */
        String f22858a;

        /* renamed from: b */
        long f22859b;

        /* renamed from: c */
        Map<String, String> f22860c;

        C8322b() {
        }
    }

    /* renamed from: d */
    private void m25393d() {
        if (this.f22854g >= 0) {
            mo21488a(this.f22854g, this.f22855h);
            this.f22854g = -1;
            this.f22855h = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21487a() {
        if (!this.f22852e) {
            this.f22852e = true;
            this.f22856i = C7329e.m22975a((Callable<? extends T>) new C8323d<Object>(this)).mo19152a(C47549a.m148327a()).mo19159b(C7333a.m23044b()).mo19142a((C7326g<? super T>) new C8334e<Object>(this), (C7326g<? super Throwable>) new C8335f<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo21492b() {
        if (this.f22856i != null && !this.f22856i.isDisposed()) {
            this.f22856i.dispose();
        }
        if (this.f22857j != null && !this.f22857j.isDisposed()) {
            this.f22857j.dispose();
        }
        this.f22851d = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ C8322b mo21494c() throws Exception {
        C8325a a = f22849c.mo21498a("locale");
        if (a == null) {
            throw new Exception("locale info not found in db");
        } else if (TextUtils.equals(this.f22850a, a.f22866b)) {
            C8322b bVar = new C8322b();
            bVar.f22858a = this.f22850a;
            C8325a a2 = f22849c.mo21498a(C38347c.f99551f);
            if (a2 != null) {
                bVar.f22859b = Long.valueOf(a2.f22866b).longValue();
                List<C8329d> a3 = f22848b.mo21500a();
                if (!a3.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    for (C8329d dVar : a3) {
                        if (!TextUtils.isEmpty(dVar.f22870a) && !TextUtils.isEmpty(dVar.f22871b)) {
                            hashMap.put(dVar.f22870a, dVar.f22871b);
                        }
                    }
                    bVar.f22860c = hashMap;
                    return bVar;
                }
                StringBuilder sb = new StringBuilder("translations not found for locale: ");
                sb.append(this.f22850a);
                throw new Exception(sb.toString());
            }
            throw new Exception("version info not found in db");
        } else {
            StringBuilder sb2 = new StringBuilder("locale in db is ");
            sb2.append(a.f22866b);
            sb2.append(", but you are request for ");
            sb2.append(this.f22850a);
            throw new Exception(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21490a(Boolean bool) throws Exception {
        this.f22853f = false;
        m25393d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21489a(C8322b bVar) throws Exception {
        this.f22852e = false;
        if (this.f22851d != null) {
            this.f22851d.mo21484a(this.f22850a, bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21491a(Throwable th) throws Exception {
        this.f22853f = false;
        if (this.f22851d != null) {
            new Exception(th);
        }
        m25393d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21493b(Throwable th) throws Exception {
        this.f22852e = false;
        if (this.f22851d != null) {
            this.f22851d.mo21485a(this.f22850a, new Exception(th));
        }
    }

    C8320c(String str, C8321a aVar) {
        this.f22850a = str;
        this.f22851d = aVar;
        if (f22848b == null) {
            I18nDatabase i18nDatabase = (I18nDatabase) C0160e.m441a(C3358ac.m12528e().getApplicationContext(), I18nDatabase.class, "i18n_live").mo322c();
            f22848b = i18nDatabase.mo21496h();
            f22849c = i18nDatabase.mo21497i();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo21486a(Map map, long j) throws Exception {
        Set<Entry> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Entry entry : entrySet) {
            if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                arrayList.add(new C8329d((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        f22848b.mo21502b();
        f22848b.mo21501a(arrayList);
        f22849c.mo21499a(new C8325a("locale", this.f22850a));
        f22849c.mo21499a(new C8325a(C38347c.f99551f, String.valueOf(j)));
        return Boolean.valueOf(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21488a(long j, Map<String, String> map) {
        if (TextUtils.isEmpty(this.f22850a) || map == null || map.isEmpty()) {
            TextUtils.isEmpty(this.f22850a);
        } else if (this.f22853f) {
            this.f22854g = j;
            this.f22855h = map;
        } else {
            this.f22853f = true;
            this.f22857j = C7329e.m22975a((Callable<? extends T>) new C8336g<Object>(this, map, j)).mo19152a(C47549a.m148327a()).mo19159b(C7333a.m23044b()).mo19142a((C7326g<? super T>) new C8337h<Object>(this), (C7326g<? super Throwable>) new C8338i<Object>(this));
        }
    }
}
