package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.React */
public class React extends BaseResponse implements C6866d, Serializable {
    @C6593c(mo15949a = "origin")
    Aweme origin;
    @C6593c(mo15949a = "can_react_origin")
    boolean originReactable;
    @C6593c(mo15949a = "can_react_current")
    boolean reactable;
    String requestId;

    public Aweme getOrigin() {
        return this.origin;
    }

    public boolean getOriginReactable() {
        return this.originReactable;
    }

    public boolean getReactable() {
        return this.reactable;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setOrigin(Aweme aweme) {
        this.origin = aweme;
    }

    public void setOriginReactable(boolean z) {
        this.originReactable = z;
    }

    public void setReactable(boolean z) {
        this.reactable = z;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public int getReactionPermission(Aweme aweme, Aweme aweme2) {
        if ((this.reactable || C6861a.m21337f().isMe(aweme.getAuthor().getUid())) && (this.originReactable || C6861a.m21337f().isMe(aweme2.getAuthor().getUid()))) {
            return 3;
        }
        if (this.reactable || C6861a.m21337f().isMe(aweme.getAuthor().getUid())) {
            return 2;
        }
        if (this.originReactable || C6861a.m21337f().isMe(aweme2.getAuthor().getUid())) {
            return 1;
        }
        return 0;
    }
}
