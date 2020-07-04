package com.p280ss.android.ugc.aweme.effectplatform;

import com.google.common.base.C17454q;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43769s;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.i */
public final class C27486i implements C43769s {

    /* renamed from: f */
    public static final C27487a f72502f = new C27487a(null);

    /* renamed from: a */
    public final String f72503a;

    /* renamed from: b */
    public final String f72504b;

    /* renamed from: c */
    public final int f72505c;

    /* renamed from: d */
    public final int f72506d;

    /* renamed from: e */
    public final C43769s f72507e;

    /* renamed from: g */
    private final C17454q f72508g;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.i$a */
    public static final class C27487a {
        private C27487a() {
        }

        public /* synthetic */ C27487a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C27486i m90113a(String str, String str2, int i, int i2, C43769s sVar) {
            C7573i.m23587b(str, "panel");
            C7573i.m23587b(str2, POIService.KEY_KEYWORD);
            C7573i.m23587b(sVar, "listener");
            C27486i iVar = new C27486i(str, str2, i, i2, sVar, null);
            return iVar;
        }
    }

    /* renamed from: a */
    public static final C27486i m90110a(String str, String str2, int i, int i2, C43769s sVar) {
        return C27487a.m90113a(str, str2, i, i2, sVar);
    }

    /* renamed from: a */
    public final void mo70694a(C43726c cVar) {
        String str;
        int i;
        if (cVar == null) {
            i = -2;
            str = "unknown error";
        } else {
            i = cVar.f113220a;
            str = cVar.f113221b;
            C7573i.m23582a((Object) str, "e.msg");
        }
        C6893q.m21444a("search_effect_error_rate", 1, new C38510bb().mo96479a("errorCode", Integer.valueOf(i)).mo96481a("errorDesc", str).mo96479a("count", Integer.valueOf(this.f72505c)).mo96479a("cursor", Integer.valueOf(this.f72506d)).mo96481a("panel", this.f72503a).mo96481a(POIService.KEY_KEYWORD, this.f72504b).mo96482b());
        this.f72507e.mo70694a(cVar);
    }

    /* renamed from: a */
    public final void mo70695a(SearchEffectResponse searchEffectResponse) {
        long a = this.f72508g.mo44941a(TimeUnit.MILLISECONDS);
        this.f72507e.mo70695a(searchEffectResponse);
        C6893q.m21444a("search_effect_error_rate", 0, new C38510bb().mo96480a("duration", Long.valueOf(a)).mo96479a("count", Integer.valueOf(this.f72505c)).mo96479a("cursor", Integer.valueOf(this.f72506d)).mo96481a(POIService.KEY_KEYWORD, this.f72504b).mo96481a("panel", this.f72503a).mo96482b());
    }

    private C27486i(String str, String str2, int i, int i2, C43769s sVar) {
        this.f72503a = str;
        this.f72504b = str2;
        this.f72505c = i;
        this.f72506d = i2;
        this.f72507e = sVar;
        C17454q b = C17454q.m58004b();
        C7573i.m23582a((Object) b, "Stopwatch.createStarted()");
        this.f72508g = b;
    }

    public /* synthetic */ C27486i(String str, String str2, int i, int i2, C43769s sVar, C7571f fVar) {
        this(str, str2, i, i2, sVar);
    }
}
