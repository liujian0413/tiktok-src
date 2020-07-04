package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30865c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1317a.C30853a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7075h;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a */
public final class C30860a {

    /* renamed from: a */
    public static final C30860a f80811a = new C30860a();

    /* renamed from: b */
    private static GiphyGifApi f80812b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a$a */
    static final class C30861a<TTaskResult, TContinuationResult> implements C1591g<C30865c, Void> {

        /* renamed from: a */
        final /* synthetic */ int f80813a;

        /* renamed from: b */
        final /* synthetic */ C30853a f80814b;

        C30861a(int i, C30853a aVar) {
            this.f80813a = i;
            this.f80814b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C30865c> hVar) {
            C30860a.m100532a(this.f80813a, this.f80814b, hVar, false);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a$b */
    static final class C30862b<TTaskResult, TContinuationResult> implements C1591g<C30865c, Void> {

        /* renamed from: a */
        final /* synthetic */ int f80815a;

        /* renamed from: b */
        final /* synthetic */ C30853a f80816b;

        C30862b(int i, C30853a aVar) {
            this.f80815a = i;
            this.f80816b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C30865c> hVar) {
            C30860a.m100532a(this.f80815a, this.f80816b, hVar, true);
            return null;
        }
    }

    private C30860a() {
    }

    static {
        GiphyGifApi giphyGifApi;
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        if (iRetrofitService != null) {
            IRetrofit createNewRetrofit = iRetrofitService.createNewRetrofit(C7075h.f19903b);
            if (createNewRetrofit != null) {
                giphyGifApi = (GiphyGifApi) createNewRetrofit.create(GiphyGifApi.class);
                f80812b = giphyGifApi;
            }
        }
        giphyGifApi = null;
        f80812b = giphyGifApi;
    }

    /* renamed from: a */
    public static final void m100531a(int i, C30853a<C30865c> aVar) {
        C7573i.m23587b(aVar, "giphyGifCallback");
        GiphyGifApi giphyGifApi = f80812b;
        if (giphyGifApi != null) {
            C1592h trendingGiphy = giphyGifApi.getTrendingGiphy(i);
            if (trendingGiphy != null) {
                trendingGiphy.mo6876a((C1591g<TResult, TContinuationResult>) new C30862b<TResult,TContinuationResult>(i, aVar), C1592h.f5958b);
            }
        }
    }

    /* renamed from: a */
    public static final void m100533a(int i, String str, C30853a<C30865c> aVar) {
        C7573i.m23587b(str, "queryKey");
        C7573i.m23587b(aVar, "giphyGifCallback");
        GiphyGifApi giphyGifApi = f80812b;
        if (giphyGifApi != null) {
            C1592h searchingGiphy = giphyGifApi.getSearchingGiphy(i, str);
            if (searchingGiphy != null) {
                searchingGiphy.mo6876a((C1591g<TResult, TContinuationResult>) new C30861a<TResult,TContinuationResult>(i, aVar), C1592h.f5958b);
            }
        }
    }

    /* renamed from: a */
    public static void m100532a(int i, C30853a<C30865c> aVar, C1592h<C30865c> hVar, boolean z) {
        if (hVar == null || !hVar.mo6882b() || hVar.mo6890e() == null) {
            if (hVar == null || hVar.mo6889d() || hVar.mo6890e() == null) {
                aVar.mo80673a();
            }
        } else if (i > 0) {
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "task.result");
            aVar.mo80674a(e);
        } else if (z) {
            Object e2 = hVar.mo6890e();
            C7573i.m23582a(e2, "task.result");
            aVar.mo80676c(e2);
        } else {
            Object e3 = hVar.mo6890e();
            C7573i.m23582a(e3, "task.result");
            aVar.mo80675b(e3);
        }
    }
}
