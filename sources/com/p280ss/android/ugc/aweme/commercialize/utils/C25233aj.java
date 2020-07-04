package com.p280ss.android.ugc.aweme.commercialize.utils;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj */
public final class C25233aj {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aj$a */
    static final class C25234a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7561a f66572a;

        C25234a(C7561a aVar) {
            this.f66572a = aVar;
        }

        public final /* synthetic */ Object call() {
            m82961a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82961a() {
            this.f66572a.invoke();
        }
    }

    /* renamed from: b */
    public static final void m82960b(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "block");
        C1592h.m7853a((Callable<TResult>) new C25235ak<TResult>(aVar));
    }

    /* renamed from: a */
    public static final void m82958a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "block");
        C1592h.m7855a((Callable<TResult>) new C25234a<TResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public static final boolean m82959a(Aweme aweme) {
        C7573i.m23587b(aweme, "$this$isHardAd");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || !awemeRawAd.isHardAd()) {
            return false;
        }
        return true;
    }
}
