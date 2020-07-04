package com.p280ss.android.ugc.aweme.feed.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi */
public final class FeedLiveRoomApi {

    /* renamed from: a */
    private static final RoomApi f74326a;

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedLiveRoomApi$RoomApi */
    public interface RoomApi {
        @C6457h(mo15740a = "webcast/d/topview_room/")
        C12466b<C3477b<Room, Extra>> queryRoomInfo(@C6474y(mo15757a = "uid") long j, @C6474y(mo15757a = "sec_uid") String str);
    }

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        StringBuilder sb = new StringBuilder("https://");
        sb.append(BusinessComponentServiceUtils.getLiveAllService().mo103115c());
        f74326a = (RoomApi) iRetrofitFactory.createBuilder(sb.toString()).mo26430a().mo26435a(RoomApi.class);
    }

    /* renamed from: a */
    public static C12466b<C3477b<Room, Extra>> m92746a(long j, String str) {
        return f74326a.queryRoomInfo(j, str);
    }
}
