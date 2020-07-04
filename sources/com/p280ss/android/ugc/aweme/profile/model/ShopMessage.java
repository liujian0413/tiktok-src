package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ShopMessage */
public final class ShopMessage implements Serializable {
    @C6593c(mo15949a = "content")
    private String content = "";
    @C6593c(mo15949a = "created_at")
    private long createdAt;
    @C6593c(mo15949a = "expire_at")
    private long expireAt;
    @C6593c(mo15949a = "message_id")
    private String messageId = "";
    @C6593c(mo15949a = "read")
    private boolean read;
    @C6593c(mo15949a = "type")
    private String type = "";
    @C6593c(mo15949a = "url")
    private String url;

    public final String getContent() {
        return this.content;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getExpireAt() {
        return this.expireAt;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setExpireAt(long j) {
        this.expireAt = j;
    }

    public final void setRead(boolean z) {
        this.read = z;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setContent(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.content = str;
    }

    public final void setMessageId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.messageId = str;
    }

    public final void setType(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.type = str;
    }
}
