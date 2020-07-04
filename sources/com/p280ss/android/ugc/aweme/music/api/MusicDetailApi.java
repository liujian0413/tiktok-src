package com.p280ss.android.ugc.aweme.music.api;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.model.MusicDetail;

/* renamed from: com.ss.android.ugc.aweme.music.api.MusicDetailApi */
public final class MusicDetailApi {

    /* renamed from: a */
    private static final DetailApi f88113a = ((DetailApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).create(Api.f60502b).mo26435a(DetailApi.class));

    /* renamed from: com.ss.android.ugc.aweme.music.api.MusicDetailApi$DetailApi */
    interface DetailApi {
        @C6457h(mo15740a = "/aweme/v1/music/detail/")
        C18253l<MusicDetail> queryMusic(@C6474y(mo15757a = "music_id") String str, @C6474y(mo15757a = "click_reason") int i);

        @C6457h(mo15740a = "/aweme/v1/music/partner/detail/")
        C18253l<MusicDetail> queryPartnerMusic(@C6474y(mo15757a = "partner_music_id") String str, @C6474y(mo15757a = "partner_name") String str2);
    }

    /* renamed from: a */
    public static MusicDetail m108895a(String str, String str2) throws Exception {
        return (MusicDetail) f88113a.queryPartnerMusic(str, str2).get();
    }

    /* renamed from: a */
    public static MusicDetail m108894a(String str, int i) throws Exception {
        DetailApi detailApi = f88113a;
        if (str != null) {
            str = str.trim();
        }
        return (MusicDetail) detailApi.queryMusic(str, i).get();
    }
}
