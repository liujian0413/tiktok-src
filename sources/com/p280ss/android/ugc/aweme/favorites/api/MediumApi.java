package com.p280ss.android.ugc.aweme.favorites.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27698c;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi */
public final class MediumApi {

    /* renamed from: a */
    public static final String f73163a = Api.f60502b;

    /* renamed from: b */
    public static MediumDataApi f73164b = ((MediumDataApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f73163a).create(MediumDataApi.class));

    /* renamed from: c */
    public static final C27734a f73165c = new C27734a(null);

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi$MediumDataApi */
    public interface MediumDataApi {
        @C7730f(mo20420a = "/aweme/v1/anchor/medium/collection/")
        C18253l<C27698c> getMediumList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi$a */
    public static final class C27734a {
        private C27734a() {
        }

        /* renamed from: a */
        private static MediumDataApi m90935a() {
            return MediumApi.f73164b;
        }

        public /* synthetic */ C27734a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final C27698c mo71204a(int i, int i2) {
            Object obj = m90935a().getMediumList(i, i2).get();
            C7573i.m23582a(obj, "sRetrofit.getMediumList(cursor, count).get()");
            return (C27698c) obj;
        }
    }
}
