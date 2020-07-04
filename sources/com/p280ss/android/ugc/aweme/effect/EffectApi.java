package com.p280ss.android.ugc.aweme.effect;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.feed.model.NewStickerItemList;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.effect.EffectApi */
public final class EffectApi {

    /* renamed from: a */
    private static API f72113a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.effect.EffectApi$API */
    public interface API {
        @C7730f(mo20420a = "/aweme/v1/original/effect/list/")
        C1592h<NewStickerItemList> getEffectList(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i);
    }

    /* renamed from: a */
    public static API m89609a() {
        return f72113a;
    }
}
