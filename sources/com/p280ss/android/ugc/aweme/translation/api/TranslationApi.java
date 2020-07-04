package com.p280ss.android.ugc.aweme.translation.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42617a;
import com.p280ss.android.ugc.aweme.translation.p1680a.C42620c;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.translation.api.TranslationApi */
public final class TranslationApi {

    /* renamed from: a */
    private static IRetrofitService f110780a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.translation.api.TranslationApi$RealApi */
    public interface RealApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/contents/translation/")
        C18253l<C42617a> getMultiTranslation(@C7727c(mo20417a = "trg_lang") String str, @C7727c(mo20417a = "translation_info") String str2, @C7744t(mo20436a = "scene") int i);

        @C7730f(mo20420a = "/aweme/v1/content/translation/")
        C18253l<C42620c> getTranslation(@C7744t(mo20436a = "content") String str, @C7744t(mo20436a = "src_lang") String str2, @C7744t(mo20436a = "trg_lang") String str3, @C7744t(mo20436a = "group_id") String str4, @C7744t(mo20436a = "scene") int i);
    }

    /* renamed from: a */
    private static RealApi m135415a() {
        return (RealApi) f110780a.createNewRetrofit(C19223b.f51890e).create(RealApi.class);
    }

    /* renamed from: a */
    public static C18253l<C42617a> m135413a(String str, String str2, int i) throws Exception {
        return m135415a().getMultiTranslation(str, str2, 2);
    }

    /* renamed from: a */
    public static C42620c m135414a(String str, String str2, String str3, String str4, int i) throws Exception {
        try {
            return (C42620c) m135415a().getTranslation(str, str2, str3, str4, i).get();
        } catch (ExecutionException e) {
            throw f110780a.propagateCompatibleException(e);
        }
    }
}
