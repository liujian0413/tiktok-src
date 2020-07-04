package com.bytedance.p263im.core.internal.p590db;

import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

/* renamed from: com.bytedance.im.core.internal.db.i */
enum C11365i {
    COLUMN_MSG_ID("property_uuid", "TEXT PRIMARY KEY"),
    COLUMN_SERVER_ID("property_server_id", "BIGINT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_TARGET_MSG_ID("target_msg_uuid", "TEXT NOT NULL"),
    COLUMN_PROPERTY_TYPE("property_type", "INTEGER"),
    COLUMN_MSG_TYPE("msg_type", "INTEGER"),
    COLUMN_INNER_INDEX("index_in_msg", "BIGINT"),
    COLUMN_ORDER_INDEX("order_index", "BIGINT"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_NET_STATUS("net_status", "INTEGER"),
    COLUMN_VERSION(C38347c.f99551f, "INTEGER"),
    COLUMN_DELETED("deleted", "INTEGER"),
    COLUMN_CREATE_TIME("created_time", "INTEGER"),
    COLUMN_SENDER("sender", "BIGINT"),
    COLUMN_CONTENT(C38347c.f99553h, "TEXT"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_LOCAL_INFO("local_info", "TEXT"),
    COLUMN_PRORERTY_ID("property_id", "INTEGER"),
    COLUMN_PRORERTY_NAME("property_name", "TEXT"),
    COLUMN_REACTION_STATUS("reaction_status", "INTEGER");
    

    /* renamed from: u */
    public String f30819u;

    /* renamed from: v */
    public String f30820v;

    private C11365i(String str, String str2) {
        this.f30819u = str;
        this.f30820v = str2;
    }
}