package com.bytedance.p263im.core.model;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.p584a.C11198c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.im.core.model.PropertyMsg */
public final class PropertyMsg implements Serializable, Cloneable, Comparable<PropertyMsg> {
    public String content;
    public String conversationId;
    public long createdTime;
    private int deleted;
    private Map<String, String> ext;
    private long index;
    public Map<String, String> localExt;
    private long msgServerId;
    private int msgType;
    private int netStatus;
    private long orderIndex;
    public int propertyId;
    private String propertyName;
    public int propertyType;
    private int reactionStatus;
    public long sender;
    public int status;
    public long targetServerId;
    public String targetUuid;
    public String uuid;
    private long version;

    public final String getContent() {
        return this.content;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    public final long getIndex() {
        return this.index;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public final int getNetStatus() {
        return this.netStatus;
    }

    public final long getOrderIndex() {
        return this.orderIndex;
    }

    public final int getPropertyId() {
        return this.propertyId;
    }

    public final String getPropertyName() {
        return this.propertyName;
    }

    public final int getPropertyType() {
        return this.propertyType;
    }

    public final int getReactionStatus() {
        return this.reactionStatus;
    }

    public final long getSender() {
        return this.sender;
    }

    public final long getServerId() {
        return this.msgServerId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTargetServerId() {
        return this.targetServerId;
    }

    public final String getTargetUuid() {
        return this.targetUuid;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getExtStr() {
        return C11401b.m33573a(this.ext);
    }

    public final String getLocalExtStr() {
        return C11401b.m33573a(this.localExt);
    }

    public final PropertyMsg clone() {
        try {
            return (PropertyMsg) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final synchronized Map<String, String> getExt() {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        return this.ext;
    }

    public final synchronized Map<String, String> getLocalExt() {
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        return this.localExt;
    }

    public final boolean isSelf() {
        if (C11198c.m32777a().f30372b.mo27230a() == this.sender) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ((((((int) (this.orderIndex ^ (this.orderIndex >>> 32))) * 31) + ((int) (this.msgServerId ^ (this.msgServerId >>> 32)))) * 31) + this.msgType) * 31;
        if (this.conversationId != null) {
            i = this.conversationId.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final boolean invalid() {
        if (this.sender <= 0 || TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.uuid) || TextUtils.isEmpty(this.targetUuid)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PropertyMsg{uuid='");
        sb.append(this.uuid);
        sb.append('\'');
        sb.append(", msgServerId=");
        sb.append(this.msgServerId);
        sb.append(", targetUuid='");
        sb.append(this.targetUuid);
        sb.append('\'');
        sb.append(", targetServerId=");
        sb.append(this.targetServerId);
        sb.append(", conversationId='");
        sb.append(this.conversationId);
        sb.append('\'');
        sb.append(", msgType=");
        sb.append(this.msgType);
        sb.append(", propertyType=");
        sb.append(this.propertyType);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", orderIndex=");
        sb.append(this.orderIndex);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", netStatus=");
        sb.append(this.netStatus);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", deleted=");
        sb.append(this.deleted);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", sender=");
        sb.append(this.sender);
        sb.append(", content='");
        sb.append(this.content);
        sb.append('\'');
        sb.append(", propertyId=");
        sb.append(this.propertyId);
        sb.append(", propertyName='");
        sb.append(this.propertyName);
        sb.append('\'');
        sb.append(", reactionStatus=");
        sb.append(this.reactionStatus);
        sb.append(", ext=");
        sb.append(this.ext);
        sb.append(", localExt=");
        sb.append(this.localExt);
        sb.append('}');
        return sb.toString();
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setCreatedTime(long j) {
        this.createdTime = j;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setIndex(long j) {
        this.index = j;
    }

    public final void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public final void setMsgType(int i) {
        this.msgType = i;
    }

    public final void setNetStatus(int i) {
        this.netStatus = i;
    }

    public final void setOrderIndex(long j) {
        this.orderIndex = j;
    }

    public final void setPropertyId(int i) {
        this.propertyId = i;
    }

    public final void setPropertyName(String str) {
        this.propertyName = str;
    }

    public final void setPropertyType(int i) {
        this.propertyType = i;
    }

    public final void setReactionStatus(int i) {
        this.reactionStatus = i;
    }

    public final void setSender(long j) {
        this.sender = j;
    }

    public final void setServerId(long j) {
        this.msgServerId = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTargetServerId(long j) {
        this.targetServerId = j;
    }

    public final void setTargetUuid(String str) {
        this.targetUuid = str;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final void setVersion(long j) {
        this.version = j;
    }

    public final void setExtStr(String str) {
        this.ext = C11401b.m33577a(str);
    }

    public final void setLocalExtStr(String str) {
        this.localExt = C11401b.m33577a(str);
    }

    public final synchronized void clearLocalExt(String str) {
        if (this.localExt != null) {
            this.localExt.remove(str);
        }
    }

    public final synchronized void putExt(Map<String, String> map) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.putAll(map);
    }

    public final synchronized void putLocalExt(Map<String, String> map) {
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.putAll(map);
    }

    public final int compareTo(PropertyMsg propertyMsg) {
        if (equals(propertyMsg)) {
            return 0;
        }
        long orderIndex2 = propertyMsg.getOrderIndex() - getOrderIndex();
        if (orderIndex2 > 0) {
            return 1;
        }
        if (orderIndex2 < 0) {
            return -1;
        }
        long createdTime2 = propertyMsg.getCreatedTime() - getCreatedTime();
        if (createdTime2 > 0) {
            return 1;
        }
        if (createdTime2 < 0) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PropertyMsg propertyMsg = (PropertyMsg) obj;
        if (!TextUtils.isEmpty(this.uuid)) {
            return this.uuid.equals(propertyMsg.uuid);
        }
        return TextUtils.isEmpty(propertyMsg.uuid);
    }

    public final synchronized void addExt(String str, String str2) {
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(str, str2);
    }

    public final synchronized void addLocalExt(String str, String str2) {
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.put(str, str2);
    }
}
