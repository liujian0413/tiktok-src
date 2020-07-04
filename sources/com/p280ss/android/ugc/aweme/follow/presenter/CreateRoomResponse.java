package com.p280ss.android.ugc.aweme.follow.presenter;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.live.RoomBuilding;
import com.p280ss.android.ugc.aweme.live.model.LiveVerifyChecklist;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.CreateRoomResponse */
public class CreateRoomResponse extends BaseResponse implements C6866d {
    public static final int NEGATIVE = 0;
    public static final int POSITIVE = 1;
    @C6593c(mo15949a = "activity")
    public RoomBuilding activity;
    @C6593c(mo15949a = "checklist")
    public LiveVerifyChecklist checklist;
    private String requestId;
    @C6593c(mo15949a = "room")
    public RoomStruct room;

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }
}
