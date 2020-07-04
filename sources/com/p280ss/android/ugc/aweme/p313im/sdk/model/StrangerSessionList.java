package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.StrangerSessionList */
public class StrangerSessionList {
    @C6593c(mo15949a = "has_more")
    boolean hasMore;
    @C6593c(mo15949a = "session_list")
    List<StrangerMsgSession> lastMsg;
    @C6593c(mo15949a = "status_code")
    int statusCode;

    public List<StrangerMsgSession> getLastMsg() {
        return this.lastMsg;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLastMsg(List<StrangerMsgSession> list) {
        this.lastMsg = list;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }
}
