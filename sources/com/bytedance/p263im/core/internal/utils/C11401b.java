package com.bytedance.p263im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.p590db.C11375q;
import com.bytedance.p263im.core.model.C6425b;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.ConversationCoreInfo;
import com.bytedance.p263im.core.model.ConversationSettingInfo;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.model.PropertyMsg;
import com.bytedance.p263im.core.p584a.C11197b;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p586b.C11209d;
import com.bytedance.p263im.core.proto.ConversationInfoV2;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.MessagePropertyContent;
import com.bytedance.p263im.core.proto.MessagePropertyType;
import com.bytedance.p263im.core.proto.Participant;
import com.bytedance.p263im.core.proto.StrangerConversation;
import com.bytedance.p263im.core.proto.SyncContent;
import com.bytedance.p263im.core.proto.SyncStatus;
import com.google.gson.p277b.C6597a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.internal.utils.b */
public final class C11401b {
    /* renamed from: a */
    public static PropertyMsg m33571a(String str, MessageBody messageBody) {
        MessagePropertyContent messagePropertyContent;
        PropertyMsg propertyMsg = new PropertyMsg();
        String str2 = messageBody.content;
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            messagePropertyContent = (MessagePropertyContent) C11403c.f30887a.mo15974a(str2, MessagePropertyContent.class);
        } catch (Exception e) {
            C11209d.m32824a(e);
            messagePropertyContent = null;
        }
        if (messagePropertyContent == null || messagePropertyContent.type == null || messagePropertyContent.type.intValue() != MessagePropertyType.SYNC.getValue()) {
            return null;
        }
        propertyMsg.setPropertyType(messagePropertyContent.type.intValue());
        SyncContent syncContent = messagePropertyContent.sync_content;
        if (syncContent == null || syncContent.status == null || syncContent.status.intValue() != SyncStatus.R_CLICK.getValue()) {
            return null;
        }
        propertyMsg.setPropertyId(syncContent.status.intValue());
        propertyMsg.setTargetUuid(syncContent.target_client_message_id);
        if (syncContent.target_message_id != null) {
            propertyMsg.setTargetServerId(syncContent.target_message_id.longValue());
        }
        if (messagePropertyContent.index_in_message != null) {
            propertyMsg.setIndex(messagePropertyContent.index_in_message.longValue());
            propertyMsg.setOrderIndex(messagePropertyContent.index_in_message.longValue() * 1000);
        }
        if (messageBody.server_message_id != null) {
            propertyMsg.setServerId(messageBody.server_message_id.longValue());
        }
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
        }
        propertyMsg.setUuid(str);
        if (messageBody.create_time != null) {
            propertyMsg.setCreatedTime(messageBody.create_time.longValue());
        }
        if (messageBody.message_type != null) {
            propertyMsg.setMsgType(messageBody.message_type.intValue());
        }
        propertyMsg.setConversationId(messageBody.conversation_id);
        if (messageBody.sender != null) {
            propertyMsg.setSender(messageBody.sender.longValue());
        }
        propertyMsg.setContent(messageBody.content);
        int i = 0;
        propertyMsg.setDeleted(0);
        propertyMsg.setStatus(5);
        if (messageBody.status != null) {
            i = messageBody.status.intValue();
        }
        propertyMsg.setNetStatus(i);
        if (messageBody.version != null) {
            propertyMsg.setVersion(messageBody.version.longValue());
        }
        if (messageBody.ext != null) {
            hashMap = new HashMap(messageBody.ext);
        }
        propertyMsg.setExt(hashMap);
        return propertyMsg;
    }

    /* renamed from: a */
    public static List<Member> m33574a(String str, List<Participant> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Participant participant : list) {
            if (participant.user_id != null) {
                Member member = new Member();
                member.setConversationId(str);
                member.setAlias(participant.alias);
                if (participant.role != null) {
                    member.setRole(participant.role.intValue());
                }
                if (participant.sort_order != null) {
                    member.setSortOrder(participant.sort_order.longValue());
                }
                member.setUid(participant.user_id.longValue());
                member.setSecUid(participant.sec_uid);
                arrayList.add(member);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Member> m33575a(String str, List<Long> list, Map<Long, String> map, long j) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l : list) {
            if (l != null) {
                j++;
                Member member = new Member();
                member.setConversationId(str);
                member.setSortOrder(j);
                member.setUid(l.longValue());
                if (map != null) {
                    member.setSecUid((String) map.get(l));
                }
                arrayList.add(member);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, String> m33577a(String str) {
        try {
            return (Map) C11403c.f30887a.mo15975a(str, new C6597a<Map<String, String>>() {
            }.type);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m33578a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                hashMap.put(str, jSONObject.getString(str));
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static List<Conversation> m33576a(List<StrangerConversation> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StrangerConversation strangerConversation : list) {
            if (C11405e.m33596a(strangerConversation.last_message)) {
                Message a = m33568a(strangerConversation.last_message);
                if (a != null) {
                    Conversation conversation = new Conversation();
                    conversation.setConversationId(strangerConversation.conversation_id);
                    conversation.setConversationShortId(strangerConversation.conversation_short_id.longValue());
                    conversation.setConversationType(C11203a.f30380a);
                    conversation.setMemberCount(2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Long.valueOf(C11198c.m32777a().f30372b.mo27230a()));
                    arrayList2.add(Long.valueOf(C6425b.m20074a(strangerConversation.conversation_id)));
                    conversation.setMemberIds(arrayList2);
                    conversation.setIsMember(true);
                    conversation.setInboxType(0);
                    conversation.setLastMessage(a);
                    conversation.setLastMessageIndex(a.getIndex());
                    conversation.setUnreadCount((long) strangerConversation.unread.intValue());
                    conversation.setHasMore(false);
                    HashMap hashMap = new HashMap();
                    hashMap.put("s:conv_is_stranger", "1");
                    conversation.setLocalExt(hashMap);
                    conversation.setUpdatedTime(a.getCreatedAt());
                    arrayList.add(conversation);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m33572a(Member member) {
        if (member == null) {
            return "";
        }
        try {
            return C11403c.f30887a.mo15979b((Object) member);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m33573a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() > 0) {
                    return C11403c.f30887a.mo15979b((Object) map);
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: b */
    public static Member m33579b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (Member) C11403c.f30887a.mo15974a(str, Member.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static JSONObject m33580b(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || map.isEmpty()) {
            return jSONObject;
        }
        for (String str : map.keySet()) {
            try {
                jSONObject.put(str, map.get(str));
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static Message m33568a(MessageBody messageBody) {
        Map map;
        HashMap hashMap = null;
        if (messageBody == null) {
            return null;
        }
        String str = "";
        if (messageBody.ext != null && messageBody.ext.containsKey("s:client_message_id") && !TextUtils.isEmpty((CharSequence) messageBody.ext.get("s:client_message_id"))) {
            str = (String) messageBody.ext.get("s:client_message_id");
        }
        Message message = new Message();
        message.setMsgId(messageBody.server_message_id.longValue());
        message.setSecSender(messageBody.sec_sender);
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString();
        }
        message.setUuid(str);
        if (messageBody.create_time != null) {
            message.setCreatedAt(messageBody.create_time.longValue());
        }
        message.setMsgType(messageBody.message_type.intValue());
        message.setConversationId(messageBody.conversation_id);
        message.setConversationType(messageBody.conversation_type.intValue());
        message.setSender(messageBody.sender.longValue());
        message.setContent(messageBody.content);
        int i = 0;
        message.setDeleted(0);
        message.setMsgStatus(5);
        if (C11198c.m32777a().mo27248b().f30422v) {
            message = C11400a.m33563b(message);
        }
        message.setConversationShortId(messageBody.conversation_short_id.longValue());
        if (messageBody.index_in_conversation != null) {
            message.setIndex(messageBody.index_in_conversation.longValue());
            message.getLocalExt().remove("s:message_index_is_local");
        }
        message.setOrderIndex(0);
        if (messageBody.status != null) {
            i = messageBody.status.intValue();
        }
        message.setSvrStatus(i);
        if (messageBody.version != null && messageBody.version.longValue() >= message.getVersion()) {
            message.setVersion(messageBody.version.longValue());
            if (messageBody.ext == null) {
                map = null;
            } else {
                map = new HashMap(messageBody.ext);
            }
            message.setExt(map);
            if (messageBody.property_list != null) {
                hashMap = new HashMap(messageBody.property_list);
            }
            message.setPropertyItemListMap(hashMap);
        }
        message.setReadStatus(1);
        C11197b e = C11198c.m32777a().f30372b.mo27238e();
        if (message.getSvrStatus() == 0 && e != null) {
            message.setSvrStatus(e.mo27243a(message));
        }
        return message;
    }

    /* renamed from: a */
    private static Member m33567a(String str, Participant participant) {
        if (participant == null || participant.user_id == null) {
            return null;
        }
        Member member = new Member();
        member.setConversationId(str);
        member.setUid(participant.user_id.longValue());
        member.setSecUid(participant.sec_uid);
        if (participant.role != null) {
            member.setRole(participant.role.intValue());
        }
        member.setAlias(participant.alias);
        if (participant.sort_order != null) {
            member.setSortOrder(participant.sort_order.longValue());
        }
        return member;
    }

    /* renamed from: a */
    public static ConversationSettingInfo m33566a(ConversationSettingInfo conversationSettingInfo, com.bytedance.p263im.core.proto.ConversationSettingInfo conversationSettingInfo2) {
        int i;
        int i2;
        if (conversationSettingInfo == null) {
            conversationSettingInfo = new ConversationSettingInfo();
            conversationSettingInfo.setConversationId(conversationSettingInfo2.conversation_id);
        }
        if (conversationSettingInfo2.setting_version != null && conversationSettingInfo2.setting_version.longValue() >= conversationSettingInfo.getVersion()) {
            int i3 = 0;
            if (conversationSettingInfo2.mute != null) {
                i = conversationSettingInfo2.mute.intValue();
            } else {
                i = 0;
            }
            conversationSettingInfo.setMute(i);
            if (conversationSettingInfo2.stick_on_top != null) {
                i2 = conversationSettingInfo2.stick_on_top.intValue();
            } else {
                i2 = 0;
            }
            conversationSettingInfo.setStickTop(i2);
            conversationSettingInfo.setExt(conversationSettingInfo2.ext);
            if (conversationSettingInfo2.favorite != null) {
                i3 = conversationSettingInfo2.favorite.intValue();
            }
            conversationSettingInfo.setFavor(i3);
            conversationSettingInfo.setVersion(conversationSettingInfo2.setting_version.longValue());
        }
        return conversationSettingInfo;
    }

    /* renamed from: a */
    public static Message m33569a(String str, Message message, MessageBody messageBody) {
        return m33570a(str, message, messageBody, false);
    }

    /* renamed from: a */
    public static ConversationCoreInfo m33565a(String str, ConversationCoreInfo conversationCoreInfo, com.bytedance.p263im.core.proto.ConversationCoreInfo conversationCoreInfo2) {
        long j;
        if (conversationCoreInfo == null) {
            conversationCoreInfo = new ConversationCoreInfo();
            if (conversationCoreInfo2.conversation_id != null) {
                str = conversationCoreInfo2.conversation_id;
            }
            conversationCoreInfo.setConversationId(str);
        }
        if (conversationCoreInfo2.info_version != null && conversationCoreInfo2.info_version.longValue() >= conversationCoreInfo.getVersion()) {
            conversationCoreInfo.setName(conversationCoreInfo2.name);
            conversationCoreInfo.setIcon(conversationCoreInfo2.icon);
            conversationCoreInfo.setDesc(conversationCoreInfo2.desc);
            conversationCoreInfo.setNotice(conversationCoreInfo2.notice);
            conversationCoreInfo.setExt(conversationCoreInfo2.ext);
            conversationCoreInfo.setVersion(conversationCoreInfo2.info_version.longValue());
            if (conversationCoreInfo2.owner != null) {
                j = conversationCoreInfo2.owner.longValue();
            } else {
                j = -1;
            }
            conversationCoreInfo.setOwner(j);
            conversationCoreInfo.setSecOwner(conversationCoreInfo2.sec_owner);
        }
        return conversationCoreInfo;
    }

    /* renamed from: a */
    public static Conversation m33564a(int i, Conversation conversation, ConversationInfoV2 conversationInfoV2, long j) {
        com.bytedance.p263im.core.proto.ConversationCoreInfo conversationCoreInfo = conversationInfoV2.conversation_core_info;
        com.bytedance.p263im.core.proto.ConversationSettingInfo conversationSettingInfo = conversationInfoV2.conversation_setting_info;
        if (conversation == null) {
            conversation = new Conversation();
            conversation.setConversationId(conversationInfoV2.conversation_id);
            if (conversationInfoV2.conversation_type != null) {
                conversation.setConversationType(conversationInfoV2.conversation_type.intValue());
            }
        }
        C11375q.m33429a();
        conversation.setLastMessage(C11375q.m33450h(conversationInfoV2.conversation_id));
        long updatedTime = conversation.getUpdatedTime();
        if (conversation.getLastMessage() != null) {
            j = conversation.getLastMessage().getCreatedAt();
        }
        conversation.setUpdatedTime(Math.max(updatedTime, j));
        conversation.setLastMessageIndex(C11375q.m33429a().mo27397g(conversationInfoV2.conversation_id));
        if (conversationInfoV2.conversation_short_id != null) {
            conversation.setConversationShortId(conversationInfoV2.conversation_short_id.longValue());
        }
        C11369m.m33392a();
        conversation.setMemberIds(C11369m.m33395a(conversationInfoV2.conversation_id));
        if (conversationInfoV2.participants_count != null) {
            conversation.setMemberCount(conversationInfoV2.participants_count.intValue());
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.min_index == null || conversationSettingInfo.min_index.longValue() <= conversation.getMinIndex())) {
            conversation.setMinIndex(conversationSettingInfo.min_index.longValue());
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.read_index == null || conversationSettingInfo.read_index.longValue() <= conversation.getReadIndex())) {
            conversation.setReadIndex(conversationSettingInfo.read_index.longValue());
        }
        if (!(conversationSettingInfo == null || conversationSettingInfo.read_index == null)) {
            C11375q.m33429a();
            conversation.setUnreadCount(C11375q.m33428a(conversationInfoV2.conversation_id, conversation.getReadIndex(), Long.MAX_VALUE, C11198c.m32777a().f30372b.mo27230a()));
        }
        conversation.setInboxType(i);
        if (conversationCoreInfo != null) {
            conversation.setCoreInfo(m33565a(conversationInfoV2.conversation_id, conversation.getCoreInfo(), conversationCoreInfo));
        }
        if (conversationSettingInfo != null) {
            conversation.setSettingInfo(m33566a(conversation.getSettingInfo(), conversationSettingInfo));
        }
        if (!TextUtils.isEmpty(conversationInfoV2.ticket)) {
            conversation.setTicket(conversationInfoV2.ticket);
        }
        if (conversationInfoV2.is_participant != null) {
            conversation.setIsMember(conversationInfoV2.is_participant.booleanValue());
        }
        conversation.setMember(m33567a(conversationInfoV2.conversation_id, conversationInfoV2.user_info));
        Map localExt = conversation.getLocalExt();
        if (localExt != null && localExt.containsKey("s:conv_wait_info")) {
            localExt.remove("s:conv_wait_info");
            conversation.setLocalExt(localExt);
        }
        return conversation;
    }

    /* renamed from: a */
    public static Message m33570a(String str, Message message, MessageBody messageBody, boolean z) {
        Map map;
        long j;
        int i = 0;
        if (message == null) {
            message = new Message();
            if (messageBody.order_in_conversation != null) {
                j = messageBody.order_in_conversation.longValue();
            } else {
                j = 0;
            }
            message.setOrderIndex(j);
            message.setMsgId(messageBody.server_message_id.longValue());
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            message.setUuid(str);
            if (messageBody.create_time != null) {
                message.setCreatedAt(messageBody.create_time.longValue());
            }
            message.setMsgType(messageBody.message_type.intValue());
            message.setConversationId(messageBody.conversation_id);
            message.setConversationType(messageBody.conversation_type.intValue());
            message.setSender(messageBody.sender.longValue());
            message.setSecSender(messageBody.sec_sender);
            message.setContent(messageBody.content);
            message.setDeleted(0);
            message.setMsgStatus(5);
            if (C11198c.m32777a().mo27248b().f30422v) {
                message = C11400a.m33563b(message);
            }
        } else if (C11198c.m32777a().mo27248b().f30421u) {
            message.setMsgStatus(5);
        }
        if (!z && C11198c.m32777a().mo27248b().f30425y && messageBody.create_time != null) {
            message.setCreatedAt(messageBody.create_time.longValue());
        }
        message.setConversationShortId(messageBody.conversation_short_id.longValue());
        if (!z && messageBody.index_in_conversation != null) {
            message.setIndex(messageBody.index_in_conversation.longValue());
            message.getLocalExt().remove("s:message_index_is_local");
        }
        if (!z && messageBody.order_in_conversation != null && (message.getOrderIndex() < 10000 || C11198c.m32777a().mo27248b().f30419s == 1)) {
            message.setOrderIndex(messageBody.order_in_conversation.longValue());
        }
        if (messageBody.status != null) {
            i = messageBody.status.intValue();
        }
        message.setSvrStatus(i);
        if (messageBody.version != null && messageBody.version.longValue() >= message.getVersion()) {
            message.setVersion(messageBody.version.longValue());
            HashMap hashMap = null;
            if (messageBody.ext == null) {
                map = null;
            } else {
                map = new HashMap(messageBody.ext);
            }
            message.setExt(map);
            if (messageBody.property_list != null) {
                hashMap = new HashMap(messageBody.property_list);
            }
            message.setPropertyItemListMap(hashMap);
        }
        message.setReadStatus(true ^ C11405e.m33595a(message) ? 1 : 0);
        C11197b e = C11198c.m32777a().f30372b.mo27238e();
        if (message.getSvrStatus() == 0 && e != null) {
            message.setSvrStatus(e.mo27243a(message));
        }
        return message;
    }
}
