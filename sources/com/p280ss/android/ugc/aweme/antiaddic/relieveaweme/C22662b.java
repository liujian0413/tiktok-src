package com.p280ss.android.ugc.aweme.antiaddic.relieveaweme;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.antiaddic.C22554a;
import com.p280ss.android.ugc.aweme.antiaddic.C22562c;
import com.p280ss.android.ugc.aweme.antiaddic.C22572i;
import com.p280ss.android.ugc.aweme.antiaddic.p1010a.C22555a;
import com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAweme;
import com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAwemeApi;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.relieveaweme.b */
public final class C22662b extends C22554a {

    /* renamed from: a */
    private final C22555a f60323a = new C22555a() {
        /* renamed from: a */
        public final C22903bl<Long> mo59195a() {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl<Long> lastGetRelieveAwemeTime = inst.getLastGetRelieveAwemeTime();
            C7573i.m23582a((Object) lastGetRelieveAwemeTime, "SharePrefCache.inst().lastGetRelieveAwemeTime");
            return lastGetRelieveAwemeTime;
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.relieveaweme.b$a */
    public static final class C22664a implements C7498y<TiktokRelieveAweme> {
        C22664a() {
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            m74893a((TiktokRelieveAweme) obj);
        }

        /* renamed from: a */
        private static void m74893a(TiktokRelieveAweme tiktokRelieveAweme) {
            C7573i.m23587b(tiktokRelieveAweme, "t");
            if (!TextUtils.isEmpty(tiktokRelieveAweme.getAwemeId())) {
                C22562c.m74570a().f60109a = true;
                C22562c.m74570a().f60110b = tiktokRelieveAweme.getAwemeId();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo59194a(long j, long j2) {
        if (!C22572i.m74610a() || !C22562c.m74570a().mo59205a(j, j2) || !this.f60323a.mo59197b(j)) {
            return false;
        }
        this.f60323a.mo59196a(j);
        try {
            TiktokRelieveAwemeApi.m74890a(C22562c.m74570a().mo59204a(System.currentTimeMillis()) ^ true ? 1 : 0).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C22664a<Object>());
        } catch (Exception unused) {
        }
        return true;
    }
}
