package com.bytedance.p263im.core.internal.p590db;

import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

/* renamed from: com.bytedance.im.core.internal.db.f */
enum C11358f {
    COLUMN_MSG_ID("msg_uuid", "TEXT PRIMARY KEY"),
    COLUMN_SERVER_ID("msg_server_id", "BIGINT"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_CONVERSATION_SHORT_ID("conversation_short_id", "BIGINT"),
    COLUMN_CONVERSATION_TYPE("conversation_type", "INTEGER"),
    COLUMN_MSG_TYPE("type", "INTEGER"),
    COLUMN_INNER_INDEX("index_in_conversation", "BIGINT"),
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
    COLUMN_READ_STATUS("read_status", "INTEGER"),
    COLUMN_SEC_SENDER("sec_sender", "TEXT"),
    COLUMN_PROPERTY_LIST("property_list", "TEXT");
    

    /* renamed from: u */
    public String f30771u;

    /* renamed from: v */
    public String f30772v;

    private C11358f(String str, String str2) {
        this.f30771u = str;
        this.f30772v = str2;
    }
}
