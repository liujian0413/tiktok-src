package com.bytedance.p263im.core.model;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.p263im.core.internal.utils.C11401b;
import com.bytedance.p263im.core.internal.utils.C11403c;
import com.bytedance.p263im.core.internal.utils.C11404d;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.proto.PropertyItemList;
import com.google.gson.p277b.C6597a;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.bytedance.im.core.model.Message */
public final class Message implements Serializable, Cloneable, Comparable<Message> {
    public List<Attachment> attachments;
    public String content;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public long createdAt;
    private int deleted;
    private Map<String, String> ext;
    public long index;
    public Map<String, String> localExt;
    private SparseArray<WeakReference<Object>> mKeyedTags;
    private long msgId;
    public int msgStatus;
    public int msgType;
    public long orderIndex;
    private Map<String, PropertyItemList> propertyItemListMap;
    private int readStatus;
    private long rowid;
    public String secSender;
    public long sender;
    private int svrStatus;
    public String uuid;
    private long version;

    /* renamed from: com.bytedance.im.core.model.Message$a */
    public static final class C6416a {

        /* renamed from: a */
        private final Message f18764a = new Message();

        /* renamed from: a */
        public final Message mo15528a() {
            this.f18764a.uuid = UUID.randomUUID().toString();
            this.f18764a.sender = C11198c.m32777a().f30372b.mo27230a();
            this.f18764a.createdAt = System.currentTimeMillis();
            this.f18764a.msgStatus = 0;
            this.f18764a.secSender = C11198c.m32777a().f30372b.mo27241h();
            return this.f18764a;
        }

        /* renamed from: a */
        public final C6416a mo15525a(int i) {
            this.f18764a.msgType = i;
            return this;
        }

        /* renamed from: a */
        public final C6416a mo15527a(String str) {
            this.f18764a.content = str;
            return this;
        }

        /* renamed from: a */
        public final C6416a mo15526a(Conversation conversation) {
            this.f18764a.conversationId = conversation.getConversationId();
            this.f18764a.conversationShortId = conversation.getConversationShortId();
            this.f18764a.conversationType = conversation.getConversationType();
            this.f18764a.orderIndex = conversation.getLastMessageOrderIndex() + 1;
            this.f18764a.index = conversation.getLastMessageIndex() + 1;
            StringBuilder sb = new StringBuilder("Message conversation content=");
            sb.append(this.f18764a.getContent());
            sb.append(", index=");
            sb.append(this.f18764a.index);
            sb.append(", orderIndex=");
            sb.append(this.f18764a.orderIndex);
            C11404d.m33582a(sb.toString());
            this.f18764a.addLocalExt("s:message_index_is_local", "1");
            return this;
        }
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final long getConversationShortId() {
        return this.conversationShortId;
    }

    public final int getConversationType() {
        return this.conversationType;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    public final long getIndex() {
        return this.index;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    public final int getMsgStatus() {
        return this.msgStatus;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public final long getOrderIndex() {
        return this.orderIndex;
    }

    public final Map<String, PropertyItemList> getPropertyItemListMap() {
        return this.propertyItemListMap;
    }

    public final int getReadStatus() {
        return this.readStatus;
    }

    public final long getRowId() {
        return this.rowid;
    }

    public final long getSender() {
        return this.sender;
    }

    public final int getSvrStatus() {
        return this.svrStatus;
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

    public final boolean isDeleted() {
        if (this.deleted == 1) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return C11403c.f30887a.mo15979b((Object) this);
    }

    public final Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final String getSecSender() {
        if (TextUtils.isEmpty(this.secSender)) {
            this.secSender = "";
        }
        return this.secSender;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isSuccessOrNormal() {
        if (this.msgStatus == 2 || this.msgStatus == 5) {
            return true;
        }
        return false;
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

    public final String getPropertyItemListMapString() {
        try {
            if (this.propertyItemListMap == null || this.propertyItemListMap.size() <= 0) {
                return "";
            }
            return C11403c.f30887a.mo15979b((Object) this.propertyItemListMap);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final boolean invalid() {
        if (this.sender <= 0 || TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.uuid)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final boolean isIndexLocal() {
        return "1".equals(getLocalExt().get("s:message_index_is_local"));
    }

    public final boolean isMention() {
        List mentionIds = getMentionIds();
        if (mentionIds == null || !mentionIds.contains(Long.valueOf(C11198c.m32777a().f30372b.mo27230a()))) {
            return false;
        }
        return true;
    }

    public final boolean isSelf() {
        if (C11198c.m32777a().f30372b.mo27230a() == this.sender) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ((((((int) (this.orderIndex ^ (this.orderIndex >>> 32))) * 31) + ((int) (this.msgId ^ (this.msgId >>> 32)))) * 31) + this.msgType) * 31;
        if (this.conversationId != null) {
            i = this.conversationId.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final boolean isRecalled() {
        if ("true".equals(getExt().get("s:is_recalled")) || "true".equals(getExt().get("s:recalled"))) {
            return true;
        }
        return false;
    }

    public final List<Long> getMentionIds() {
        if (this.ext == null || !this.ext.containsKey("s:mentioned_users")) {
            return null;
        }
        String str = (String) this.ext.get("s:mentioned_users");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList();
        for (String parseLong : split) {
            try {
                arrayList.add(Long.valueOf(Long.parseLong(parseLong)));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final void setAttachments(List<Attachment> list) {
        this.attachments = list;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public final void setConversationType(int i) {
        this.conversationType = i;
    }

    public final void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public final void setDeleted(int i) {
        this.deleted = i;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public final void setMsgId(long j) {
        this.msgId = j;
    }

    public final void setMsgStatus(int i) {
        this.msgStatus = i;
    }

    public final void setMsgType(int i) {
        this.msgType = i;
    }

    public final void setPropertyItemListMap(Map<String, PropertyItemList> map) {
        this.propertyItemListMap = map;
    }

    public final void setReadStatus(int i) {
        this.readStatus = i;
    }

    public final void setRowId(long j) {
        this.rowid = j;
    }

    public final void setSender(long j) {
        this.sender = j;
    }

    public final void setSvrStatus(int i) {
        this.svrStatus = i;
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

    public final void setIndex(long j) {
        if (this.index < j) {
            this.index = j;
        }
    }

    public final void setOrderIndex(long j) {
        if (this.orderIndex < j) {
            this.orderIndex = j;
        }
    }

    public final void setSecSender(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.secSender = str;
    }

    public final Object getTag(int i) {
        if (this.mKeyedTags == null || this.mKeyedTags.get(i) == null) {
            return null;
        }
        return ((WeakReference) this.mKeyedTags.get(i)).get();
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

    public final void setPropertyItemListMapByString(String str) {
        try {
            this.propertyItemListMap = (Map) C11403c.f30887a.mo15975a(str, new C6597a<Map<String, PropertyItemList>>() {
            }.type);
        } catch (Throwable unused) {
            this.propertyItemListMap = null;
        }
    }

    public final int compareTo(Message message) {
        if (equals(message)) {
            return 0;
        }
        long orderIndex2 = message.getOrderIndex() - getOrderIndex();
        if (orderIndex2 > 0) {
            return 1;
        }
        if (orderIndex2 < 0) {
            return -1;
        }
        long createdAt2 = message.getCreatedAt() - getCreatedAt();
        if (createdAt2 > 0) {
            return 1;
        }
        if (createdAt2 < 0) {
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
        Message message = (Message) obj;
        if (this.uuid != null) {
            return this.uuid.equals(message.uuid);
        }
        if (message.uuid == null) {
            return true;
        }
        return false;
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

    public final void setTag(int i, Object obj) {
        if (this.mKeyedTags == null) {
            this.mKeyedTags = new SparseArray<>(2);
        }
        this.mKeyedTags.put(i, new WeakReference(obj));
    }
}
