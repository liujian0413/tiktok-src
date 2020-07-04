package com.bytedance.lighten.loader;

import com.bytedance.lighten.core.C12124e;
import com.bytedance.lighten.core.C12130k;
import com.bytedance.lighten.core.p612c.C12114l;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13683ai.C13684a;
import com.facebook.imagepipeline.p724k.C13700an;
import com.facebook.imagepipeline.p724k.C13736c;
import com.facebook.imagepipeline.p724k.C13738e;
import com.facebook.imagepipeline.p724k.C13748k;
import com.facebook.imagepipeline.p724k.C13767t;
import com.optimize.statistics.C18620c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.lighten.loader.o */
final class C12163o extends C13736c<C12165a> {

    /* renamed from: a */
    private C12130k f32397a;

    /* renamed from: b */
    private String f32398b;

    /* renamed from: com.bytedance.lighten.loader.o$a */
    public static class C12165a extends C13767t {

        /* renamed from: a */
        public C12124e f32401a;

        public C12165a(C13748k<C13647e> kVar, C13700an anVar) {
            super(kVar, anVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("use fetcher: ");
        sb.append(this.f32398b);
        return sb.toString();
    }

    public C12163o(C12130k kVar) {
        this.f32397a = kVar;
    }

    public final /* synthetic */ C13767t createFetchState(C13748k kVar, C13700an anVar) {
        return m35402a(kVar, anVar);
    }

    public final /* synthetic */ Map getExtraMap(C13767t tVar, int i) {
        return m35405b((C12165a) tVar, i);
    }

    public final /* synthetic */ void onFetchCompletion(C13767t tVar, int i) {
        m35403a((C12165a) tVar, i);
    }

    /* renamed from: a */
    private static C12165a m35402a(C13748k<C13647e> kVar, C13700an anVar) {
        C12165a aVar = new C12165a(kVar, anVar);
        aVar.f32401a = new C12124e();
        return aVar;
    }

    /* renamed from: a */
    private static void m35403a(C12165a aVar, int i) {
        if (aVar.f32401a.f32212j != null) {
            aVar.f32401a.f32212j.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void fetch(C12165a aVar, C13684a aVar2) {
        if (aVar != null) {
            C12161m mVar = new C12161m(aVar2);
            aVar.f32401a.f32210h = aVar.mo33371c();
            aVar.f32401a.f32211i = new C12162n(aVar.f36544e);
            aVar.f32401a.f32208f = aVar.mo33369a();
            aVar.f32401a.f32214l = aVar.mo33372d();
            C18620c a = C12179r.m35426a();
            if (a != null) {
                aVar.f32401a.f32213k = a.f50312b;
            }
            final C12114l a2 = this.f32397a.mo29820a();
            this.f32398b = a2.getClass().getName();
            a2.mo29814a(aVar.f32401a, mVar);
            aVar.f36544e.mo33334a(new C13738e() {
                /* renamed from: a */
                public final void mo29896a() {
                    a2.mo29813a();
                }
            });
            a2.mo29815b(aVar.f32401a, mVar);
        }
    }

    /* renamed from: b */
    private static Map<String, String> m35405b(C12165a aVar, int i) {
        String str;
        HashMap hashMap = new HashMap(5);
        if (aVar.f32401a.f32204b == 0 || aVar.f32401a.f32203a == 0) {
            hashMap.put("queue_time", Long.toString(-1));
        } else {
            hashMap.put("queue_time", Long.toString(aVar.f32401a.f32204b - aVar.f32401a.f32203a));
        }
        if (aVar.f32401a.f32206d == 0 || aVar.f32401a.f32204b == 0) {
            hashMap.put("fetch_time", Long.toString(-1));
        } else {
            hashMap.put("fetch_time", Long.toString(aVar.f32401a.f32206d - aVar.f32401a.f32204b));
        }
        if (aVar.f32401a.f32206d == 0 || aVar.f32401a.f32203a == 0) {
            hashMap.put("total_time", Long.toString(-1));
        } else {
            hashMap.put("total_time", Long.toString(aVar.f32401a.f32206d - aVar.f32401a.f32203a));
        }
        hashMap.put("image_size", Integer.toString(i));
        String str2 = "hit_cdn_cache";
        if (aVar.f32401a.f32209g) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        hashMap.put("content_length", Long.toString(aVar.f32401a.f32215m));
        return hashMap;
    }
}
