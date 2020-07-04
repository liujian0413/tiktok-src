package com.p280ss.android.ugc.aweme.festival.christmas.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.detail.p1164h.C26066a;
import com.p280ss.android.ugc.aweme.festival.christmas.model.C29138a;
import com.p280ss.android.ugc.aweme.festival.christmas.model.C29139b;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.api.ChristmasApi */
public final class ChristmasApi {

    /* renamed from: a */
    private static API f76886a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(API.class));

    /* renamed from: com.ss.android.ugc.aweme.festival.christmas.api.ChristmasApi$API */
    public interface API {
        @C7730f(mo20420a = "/aweme/v1/activity/unlock/status/")
        C18253l<C29138a> getActivityUnlockStatus(@C7744t(mo20436a = "user_id") String str);

        @C7730f(mo20420a = "/aweme/v1/multi/aweme/detail/")
        C1592h<C26066a> getAwemeDetail(@C7744t(mo20436a = "aweme_ids") String str);

        @C7730f(mo20420a = "/aweme/v1/activity/share/ecard/")
        C1592h<Object> getECardShareStats(@C7744t(mo20436a = "item_id") String str);

        @C7730f(mo20420a = "/aweme/v1/activity/item/share_card/")
        C7492s<Object> getSharePanelStatus(@C7744t(mo20436a = "item_id") String str, @C7744t(mo20436a = "activity_type") int i);

        @C7730f(mo20420a = "/aweme/v1/activity/share/stats/")
        C1592h<Object> getShareStats(@C7744t(mo20436a = "item_id") String str);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/activity/donation/create/")
        C7492s<C29139b> participateFestivalActivity(@C7727c(mo20417a = "item_id") String str, @C7727c(mo20417a = "donation_type") int i, @C7727c(mo20417a = "activity_type") int i2);

        @C7730f(mo20420a = "/aweme/v1/activity/share/record/")
        C1592h<BaseResponse> reportShareEvent(@C7744t(mo20436a = "item_id") String str, @C7744t(mo20436a = "user_id") String str2);
    }

    /* renamed from: a */
    public static API m95577a() {
        return f76886a;
    }
}
