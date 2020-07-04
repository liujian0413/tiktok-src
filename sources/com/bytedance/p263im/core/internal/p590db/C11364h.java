package com.bytedance.p263im.core.internal.p590db;

/* renamed from: com.bytedance.im.core.internal.db.h */
enum C11364h {
    COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
    COLUMN_MIN_INDEX("min_index", "INTEGER"),
    COLUMN_READ_INDEX("read_index", "INTEGER"),
    COLUMN_READ_ORDER("read_order", "INTEGER");
    

    /* renamed from: f */
    public String f30796f;

    /* renamed from: g */
    public String f30797g;

    private C11364h(String str, String str2) {
        this.f30796f = str;
        this.f30797g = str2;
    }
}
