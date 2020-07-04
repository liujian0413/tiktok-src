package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi */
public interface VoteDetailApi {

    /* renamed from: a */
    public static final C40714a f105850a = C40714a.f105851a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteDetailApi$a */
    public static final class C40714a {

        /* renamed from: a */
        static final /* synthetic */ C40714a f105851a = new C40714a();

        private C40714a() {
        }

        /* renamed from: a */
        public static VoteDetailApi m130174a() {
            Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(VoteDetailApi.class);
            C7573i.m23582a(create, "ServiceManager.get().get…oteDetailApi::class.java)");
            return (VoteDetailApi) create;
        }
    }

    @C7730f(mo20420a = "/aweme/v1/vote/option/userlist/")
    C7492s<VoteDetailResponse> getVoteDetail(@C7744t(mo20436a = "vote_id") long j, @C7744t(mo20436a = "option_id") long j2, @C7744t(mo20436a = "offset") int i);
}
