package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.bytedance.p263im.core.model.Message;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.StrangerMessageList */
public class StrangerMessageList extends BaseResponse {
    @C6593c(mo15949a = "message_list")
    List<StrangerMessage> mDatas;

    public List<StrangerMessage> getmDatas() {
        return this.mDatas;
    }

    public List<Message> toChatMessages() {
        if (this.mDatas == null || this.mDatas.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.mDatas.size());
        for (StrangerMessage chatMessage : this.mDatas) {
            arrayList.add(StrangerMessage.toChatMessage(chatMessage));
        }
        return arrayList;
    }

    public void setmDatas(List<StrangerMessage> list) {
        this.mDatas = list;
    }
}
