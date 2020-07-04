package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RoomResponse */
public final class RoomResponse extends BaseResponse {
    @C6593c(mo15949a = "data")
    public final RoomStruct data;

    public RoomResponse() {
        this(null, 1, null);
    }

    public RoomResponse(RoomStruct roomStruct) {
        this.data = roomStruct;
    }

    public /* synthetic */ RoomResponse(RoomStruct roomStruct, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            roomStruct = null;
        }
        this(roomStruct);
    }
}
