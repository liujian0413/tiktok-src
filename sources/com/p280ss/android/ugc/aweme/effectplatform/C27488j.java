package com.p280ss.android.ugc.aweme.effectplatform;

import com.google.common.base.C17454q;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.j */
public final class C27488j implements C43756f {

    /* renamed from: e */
    public static final C27489a f72509e = new C27489a(null);

    /* renamed from: a */
    public final String f72510a;

    /* renamed from: b */
    public final int f72511b;

    /* renamed from: c */
    public final int f72512c;

    /* renamed from: d */
    public final C43756f f72513d;

    /* renamed from: f */
    private final C17454q f72514f;

    /* renamed from: com.ss.android.ugc.aweme.effectplatform.j$a */
    public static final class C27489a {
        private C27489a() {
        }

        public /* synthetic */ C27489a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C27488j m90117a(String str, int i, int i2, C43756f fVar) {
            C7573i.m23587b(str, "panel");
            C7573i.m23587b(fVar, "listener");
            C27488j jVar = new C27488j(str, i, i2, fVar, null);
            return jVar;
        }
    }

    /* renamed from: a */
    public static final C27488j m90114a(String str, int i, int i2, C43756f fVar) {
        return C27489a.m90117a(str, i, i2, fVar);
    }

    /* renamed from: a */
    public final void mo70686a(C43726c cVar) {
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
        C6893q.m21444a("sticker_list_error_rate", 1, new C38510bb().mo96479a("errorCode", Integer.valueOf(i)).mo96481a("errorDesc", str).mo96479a("count", Integer.valueOf(this.f72511b)).mo96479a("cursor", Integer.valueOf(this.f72512c)).mo96481a("panel", this.f72510a).mo96482b());
        C43756f fVar = this.f72513d;
        if (fVar != null) {
            fVar.mo70686a(cVar);
        }
    }

    /* renamed from: a */
    public final void mo70687a(CategoryPageModel categoryPageModel) {
        long a = this.f72514f.mo44941a(TimeUnit.MILLISECONDS);
        C43756f fVar = this.f72513d;
        if (fVar != null) {
            fVar.mo70687a(categoryPageModel);
        }
        C6893q.m21444a("sticker_list_error_rate", 0, new C38510bb().mo96480a("duration", Long.valueOf(a)).mo96479a("count", Integer.valueOf(this.f72511b)).mo96479a("cursor", Integer.valueOf(this.f72512c)).mo96481a("panel", this.f72510a).mo96482b());
    }

    private C27488j(String str, int i, int i2, C43756f fVar) {
        this.f72510a = str;
        this.f72511b = i;
        this.f72512c = i2;
        this.f72513d = fVar;
        C17454q b = C17454q.m58004b();
        C7573i.m23582a((Object) b, "Stopwatch.createStarted()");
        this.f72514f = b;
    }

    public /* synthetic */ C27488j(String str, int i, int i2, C43756f fVar, C7571f fVar2) {
        this(str, i, i2, fVar);
    }
}
