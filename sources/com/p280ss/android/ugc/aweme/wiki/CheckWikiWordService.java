package com.p280ss.android.ugc.aweme.wiki;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.wiki.CheckWikiWordService */
public interface CheckWikiWordService {

    /* renamed from: a */
    public static final C43567a f112815a = C43567a.f112816a;

    /* renamed from: com.ss.android.ugc.aweme.wiki.CheckWikiWordService$a */
    public static final class C43567a {

        /* renamed from: a */
        static final /* synthetic */ C43567a f112816a = new C43567a();

        /* renamed from: b */
        private static final CheckWikiWordService f112817b = ((CheckWikiWordService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(CheckWikiWordService.class));

        private C43567a() {
        }

        /* renamed from: a */
        public static C18253l<CheckWikiWordResult> m138091a(String str, String str2) {
            C7573i.m23587b(str2, POIService.KEY_KEYWORD);
            return f112817b.checkKeyword("mt_wikipedia", str, str2);
        }
    }

    @C7730f(mo20420a = "/aweme/v1/check/antidirt/")
    C18253l<CheckWikiWordResult> checkKeyword(@C7744t(mo20436a = "scene") String str, @C7744t(mo20436a = "lang") String str2, @C7744t(mo20436a = "keyword") String str3);
}
