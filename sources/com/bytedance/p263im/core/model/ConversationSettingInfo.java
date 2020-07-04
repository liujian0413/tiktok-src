package com.bytedance.p263im.core.model;

import com.bytedance.p263im.core.internal.utils.C11401b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.im.core.model.ConversationSettingInfo */
public class ConversationSettingInfo implements Serializable {
    private String conversationId;
    private Map<String, String> ext;
    private int favor;
    private int mute;
    private int stickTop;
    private long version;

    public String getConversationId() {
        return this.conversationId;
    }

    public int getFavor() {
        return this.favor;
    }

    public int getMute() {
        return this.mute;
    }

    public int getStickTop() {
        return this.stickTop;
    }

    public long getVersion() {
        return this.version;
    }

    public String getExtStr() {
        return C11401b.m33573a(this.ext);
    }

    public boolean isFavor() {
        if (this.favor == 1) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        if (this.mute == 1) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        if (this.stickTop == 1) {
            return true;
        }
        return false;
    }

    public synchronized Map<String, String> getExt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setFavor(int i) {
        this.favor = i;
    }

    public void setMute(int i) {
        this.mute = i;
    }

    public void setStickTop(int i) {
        this.stickTop = i;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void setExtStr(String str) {
        this.ext = C11401b.m33577a(str);
    }
}
