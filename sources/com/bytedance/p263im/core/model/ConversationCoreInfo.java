package com.bytedance.p263im.core.model;

import com.bytedance.p263im.core.internal.utils.C11401b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.im.core.model.ConversationCoreInfo */
public class ConversationCoreInfo implements Serializable {
    private String conversationId;
    private String desc;
    private Map<String, String> ext;
    private String icon;
    private String name;
    private String notice;
    private long owner;
    private String secOwner;
    private long version;

    public String getConversationId() {
        return this.conversationId;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getNotice() {
        return this.notice;
    }

    public long getOwner() {
        return this.owner;
    }

    public String getSecOwner() {
        return this.secOwner;
    }

    public long getVersion() {
        return this.version;
    }

    public String getExtStr() {
        return C11401b.m33573a(this.ext);
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

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setOwner(long j) {
        this.owner = j;
    }

    public void setSecOwner(String str) {
        this.secOwner = str;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public void setExtStr(String str) {
        this.ext = C11401b.m33577a(str);
    }
}
