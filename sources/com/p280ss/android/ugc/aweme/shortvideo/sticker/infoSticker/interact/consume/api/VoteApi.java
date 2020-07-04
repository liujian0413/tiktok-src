package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteResponse;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi */
public interface VoteApi {

    /* renamed from: a */
    public static final C40713a f105847a = C40713a.f105848a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi$a */
    public static final class C40713a {

        /* renamed from: a */
        static final /* synthetic */ C40713a f105848a = new C40713a();

        /* renamed from: b */
        private static final IRetrofitService f105849b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

        private C40713a() {
        }

        /* renamed from: a */
        public static VoteApi m130173a() {
            Object create = f105849b.createNewRetrofit(Api.f60502b).create(VoteApi.class);
            C7573i.m23582a(create, "retrofitService.createNe…eate(VoteApi::class.java)");
            return (VoteApi) create;
        }
    }

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/vote/option/")
    C7492s<VoteResponse> vote(@C7727c(mo20417a = "vote_id") long j, @C7727c(mo20417a = "option_id") long j2);
}
