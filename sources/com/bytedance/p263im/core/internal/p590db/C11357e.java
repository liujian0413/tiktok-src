package com.bytedance.p263im.core.internal.p590db;

/* renamed from: com.bytedance.im.core.internal.db.e */
enum C11357e {
    COLUMN_UUID("uuid", "TEXT PRIMARY KEY"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
    COLUMN_IDS_STR("ids_str", "TEXT"),
    COLUMN_SENDER_ID("sender_id", "BIGINT"),
    COLUMN_CREATED_TIME("created_time", "INTEGER");
    

    /* renamed from: f */
    public String f30748f;

    /* renamed from: g */
    public String f30749g;

    private C11357e(String str, String str2) {
        this.f30748f = str;
        this.f30749g = str2;
    }
}
