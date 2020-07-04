package com.p280ss.android.ugc.aweme.profile.viewmodel;

import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.api.RoomRetrofitApi;
import com.p280ss.android.ugc.aweme.profile.model.RoomResponse;
import p346io.reactivex.C7492s;

/* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.a */
public final class C36805a {

    /* renamed from: a */
    private final RoomRetrofitApi f96552a = ((RoomRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://webcast-hl.amemv.com").create(RoomRetrofitApi.class));

    /* renamed from: a */
    public final C7492s<RoomResponse> mo93202a(long j) {
        return this.f96552a.roomInfo(j, 3);
    }
}
