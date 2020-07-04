package com.bytedance.p263im.core.internal.queue;

import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.proto.IMCMD;

/* renamed from: com.bytedance.im.core.internal.queue.h */
final class C11395h {
    /* renamed from: a */
    static String m33559a(int i) {
        String str;
        IMCMD fromValue = IMCMD.fromValue(i);
        if (fromValue == null) {
            return "";
        }
        if (fromValue == IMCMD.SEND_MESSAGE) {
            str = "v1/message/send";
        } else if (fromValue == IMCMD.REACTION_MESSAGE) {
            str = "v1/message/reaction";
        } else if (fromValue == IMCMD.SYNC_MESSAGE) {
            str = "v1/message/sync";
        } else if (fromValue == IMCMD.GET_MESSAGES_BY_USER) {
            str = "v1/message/get_by_user";
        } else if (fromValue == IMCMD.REPORT_GET_MESSAGES_CURSOR) {
            str = "v1/message/report_cursor";
        } else if (fromValue == IMCMD.GET_MESSAGES_BY_USER_INIT_V2) {
            str = "v2/message/get_by_user_init";
        } else if (fromValue == IMCMD.CHECK_MESSAGES_BY_USER) {
            str = "v1/message/check_by_user";
        } else if (fromValue == IMCMD.GET_CONVERSATION_LIST) {
            str = "v1/conversation/get_list";
        } else if (fromValue == IMCMD.GET_MESSAGES_BY_CONVERSATION) {
            str = "v1/message/get_by_conversation";
        } else if (fromValue == IMCMD.SEND_ONLINE) {
            str = "v1/account/online";
        } else if (fromValue == IMCMD.SEND_OFFLINE) {
            str = "v1/account/offline";
        } else if (fromValue == IMCMD.MARK_CONVERSATION_DELETE) {
            str = "v1/conversation/delete";
        } else if (fromValue == IMCMD.MARK_CONVERSATION_READ) {
            str = "v1/conversation/mark_read";
        } else if (fromValue == IMCMD.BATCH_MARK_CONVERSATION_READ) {
            str = "v2/conversation/batch_mark_read";
        } else if (fromValue == IMCMD.GET_CONVERSATION_INFO_V2) {
            str = "v2/conversation/get_info";
        } else if (fromValue == IMCMD.CREATE_CONVERSATION_V2) {
            str = "v2/conversation/create";
        } else if (fromValue == IMCMD.GET_CONVERSATION_INFO_LIST_V2) {
            str = "v2/conversation/get_info_list";
        } else if (fromValue == IMCMD.CONVERSATION_PARTICIPANTS_LIST) {
            str = "v1/conversation/participants_list";
        } else if (fromValue == IMCMD.ADD_CONVERSATION_PARTICIPANTS) {
            str = "v1/conversation/add_participants";
        } else if (fromValue == IMCMD.REMOVE_CONVERSATION_PARTICIPANTS) {
            str = "v1/conversation/remove_participants";
        } else if (fromValue == IMCMD.LEAVE_CONVERSATION) {
            str = "v1/conversation/leave";
        } else if (fromValue == IMCMD.MGET_CONVERSATION_PARTICIPANTS) {
            str = "v1/conversation/mget_participants";
        } else if (fromValue == IMCMD.UPDATE_CONVERSATION_PARTICIPANT) {
            str = "v1/conversation/update_participant";
        } else if (fromValue == IMCMD.DELETE_MESSAGE) {
            str = "v1/message/delete";
        } else if (fromValue == IMCMD.RECALL_MESSAGE) {
            str = "v1/message/recall";
        } else if (fromValue == IMCMD.GET_CONVERSATION_CORE_INFO) {
            str = "v1/conversation/get_core_info";
        } else if (fromValue == IMCMD.SET_CONVERSATION_CORE_INFO) {
            str = "v1/conversation/set_core_info";
        } else if (fromValue == IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO) {
            str = "v1/conversation/upsert_core_ext_info";
        } else if (fromValue == IMCMD.GET_CONVERSATION_SETTING_INFO) {
            str = "v1/conversation/get_setting_info";
        } else if (fromValue == IMCMD.SET_CONVERSATION_SETTING_INFO) {
            str = "v1/conversation/set_setting_info";
        } else if (fromValue == IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO) {
            str = "v1/conversation/upsert_settings_ext";
        } else if (fromValue == IMCMD.GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2) {
            str = "v2/conversation/get_by_favorite";
        } else if (fromValue == IMCMD.GET_CONVERSATION_INFO_LIST_BY_TOP_V2) {
            str = "v2/conversation/get_by_top";
        } else if (fromValue == IMCMD.GET_STRANGER_CONVERSATION_LIST) {
            str = "v1/stranger/get_conversation_list";
        } else if (fromValue == IMCMD.GET_STRANGER_MESSAGES_IN_CONVERSATION) {
            str = "v1/stranger/get_messages";
        } else if (fromValue == IMCMD.DELETE_STRANGER_MESSAGE) {
            str = "v1/stranger/delete_message";
        } else if (fromValue == IMCMD.DELETE_STRANGER_CONVERSATION) {
            str = "v1/stranger/delete_conversation";
        } else if (fromValue == IMCMD.DELETE_ALL_STRANGER_CONVERSATIONS) {
            str = "v1/stranger/delete_all_conversations";
        } else if (fromValue == IMCMD.MARK_STRANGER_CONVERSATION_READ) {
            str = "v1/stranger/mark_read_conversation";
        } else if (fromValue == IMCMD.MARK_ALL_STRANGER_CONVERSATIONS_READ) {
            str = "v1/stranger/mark_read_all_conversations";
        } else if (fromValue == IMCMD.SEND_USER_ACTION) {
            str = "v1/client/user_action";
        } else if (fromValue == IMCMD.SEND_INPUT_STATUS) {
            str = "v1/client/input_status";
        } else if (fromValue == IMCMD.DISSOLVE_CONVERSATION) {
            str = "v1/conversation/dissolve";
        } else if (fromValue == IMCMD.SET_MESSAGE_PROPERTY) {
            str = "v1/message/set_property";
        } else if (fromValue == IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3) {
            str = "v3/conversation/get_read_index";
        } else if (fromValue == IMCMD.GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3) {
            str = "v3/conversation/get_min_index";
        } else if (fromValue == IMCMD.MARK_CONVERSATION_READ_V3) {
            str = "v3/conversation/mark_read";
        } else if (fromValue != IMCMD.GET_USER_CONVERSATION_LIST) {
            return "";
        } else {
            str = "v1/conversation/list";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C11198c.m32777a().mo27248b().f30406f);
        sb.append(str);
        return sb.toString();
    }
}
