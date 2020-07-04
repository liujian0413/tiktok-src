package com.p280ss.android.ugc.aweme.notice.api.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.LiveMessage */
public class LiveMessage extends C34308b {
    public static final int LIVE_START = 1;
    @C6593c(mo15949a = "anchor_avatar")
    private UrlModel anchorAvatar;
    @C6593c(mo15949a = "anchor_id")
    private String anchorId;
    @C6593c(mo15949a = "type")
    private int liveMessageType;

    public UrlModel getAnchorAvatar() {
        return this.anchorAvatar;
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public int getLiveMessageType() {
        return this.liveMessageType;
    }

    public LiveMessage() {
        this.msgType = MessageType.LIVE;
    }

    public void setAnchorAvatar(UrlModel urlModel) {
        this.anchorAvatar = urlModel;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setLiveMessageType(int i) {
        this.liveMessageType = i;
    }
}
