package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent */
public class BaseContent implements Serializable {
    @C6593c(mo15949a = "ext")
    SystemContent extContent;
    @C6593c(mo15949a = "is_card")
    public boolean isCard;
    private long mSendStartTime;
    protected String msgHint = "";
    @C6593c(mo15949a = "prev_id")
    Long prevId;
    @C6593c(mo15949a = "root_id")
    Long rootId;
    @C6593c(mo15949a = "aweType")
    int type;

    public SharePackage generateSharePackage() {
        return null;
    }

    public int getType() {
        return this.type;
    }

    public boolean isValid() {
        return true;
    }

    public void tryInit() {
    }

    public SystemContent getExtContent() {
        setSystem(this.extContent);
        return this.extContent;
    }

    public String getMsgHint() {
        tryInit();
        return this.msgHint;
    }

    public Long getSendStartTime() {
        return Long.valueOf(this.mSendStartTime);
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setExtContent(SystemContent systemContent) {
        setSystem(systemContent);
        this.extContent = systemContent;
    }

    public void setSendStartTime(Long l) {
        this.mSendStartTime = l.longValue();
    }

    public void setSystem(SystemContent systemContent) {
        if (systemContent != null) {
            systemContent.setType(100);
        }
    }

    public static void wrapForward(BaseContent baseContent, long j) {
        if (baseContent != null && j > 0) {
            baseContent.prevId = Long.valueOf(j);
            if (baseContent.rootId == null || baseContent.rootId.longValue() <= 0) {
                baseContent.rootId = Long.valueOf(j);
            }
        }
    }
}
