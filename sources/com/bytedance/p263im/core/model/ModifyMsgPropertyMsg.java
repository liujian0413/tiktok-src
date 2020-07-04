package com.bytedance.p263im.core.model;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.proto.ModifyMessagePropertyStatus;
import com.bytedance.p263im.core.proto.OPERATION_TYPE;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.model.ModifyMsgPropertyMsg */
public class ModifyMsgPropertyMsg implements Serializable, Cloneable {
    public String clientMessageId;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public String idempotentId;
    public String key;
    private ModifyMessagePropertyStatus modifyMsgPropertyStatus;
    private int msgType;
    public OPERATION_TYPE operation;
    public long serverMessageId;
    public String ticket;
    public String value;

    public String getClientMessageId() {
        return this.clientMessageId;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public String getIdempotentId() {
        return this.idempotentId;
    }

    public String getKey() {
        return this.key;
    }

    public ModifyMessagePropertyStatus getModifyMsgPropertyStatus() {
        return this.modifyMsgPropertyStatus;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public OPERATION_TYPE getOperation() {
        return this.operation;
    }

    public long getServerMessageId() {
        return this.serverMessageId;
    }

    public String getTicket() {
        return this.ticket;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return C11403c.f30887a.mo15979b((Object) this);
    }

    public boolean invalid() {
        if (TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.ticket)) {
            return true;
        }
        return false;
    }

    public void setClientMessageId(String str) {
        this.clientMessageId = str;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setIdempotentId(String str) {
        this.idempotentId = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setModifyMsgPropertyStatus(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
        this.modifyMsgPropertyStatus = modifyMessagePropertyStatus;
    }

    public void setMsgType(int i) {
        this.msgType = i;
    }

    public void setOperation(OPERATION_TYPE operation_type) {
        this.operation = operation_type;
    }

    public void setServerMessageId(long j) {
        this.serverMessageId = j;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
