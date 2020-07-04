package com.p280ss.android.ugc.aweme.p313im.sdk.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.LivePushMessage */
public final class LivePushMessage implements Serializable {
    @C6593c(mo15949a = "anchor_id")
    private long anchorId;
    @C6593c(mo15949a = "anchor_type")
    private int anchorType;
    @C6593c(mo15949a = "avatar")
    private UrlModel avatar;
    @C6593c(mo15949a = "log_pb")
    private String logPb = "";
    @C6593c(mo15949a = "nickname")
    private String nickname = "";
    @C6593c(mo15949a = "request_id")
    private String requestId = "";
    @C6593c(mo15949a = "room_id")
    private long roomId;
    @C6593c(mo15949a = "schema")
    private String schema = "";
    @C6593c(mo15949a = "text")
    private String text = "";

    public final long getAnchorId() {
        return this.anchorId;
    }

    public final int getAnchorType() {
        return this.anchorType;
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final String getLogPb() {
        return this.logPb;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getText() {
        return this.text;
    }

    public final void setAnchorId(long j) {
        this.anchorId = j;
    }

    public final void setAnchorType(int i) {
        this.anchorType = i;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setLogPb(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.logPb = str;
    }

    public final void setNickname(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.nickname = str;
    }

    public final void setRequestId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.requestId = str;
    }

    public final void setSchema(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.schema = str;
    }

    public final void setText(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.text = str;
    }
}
