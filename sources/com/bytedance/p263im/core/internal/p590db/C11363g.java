package com.bytedance.p263im.core.internal.p590db;

import com.p280ss.android.ugc.aweme.app.C22689a;

/* renamed from: com.bytedance.im.core.internal.db.g */
enum C11363g {
    COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
    COLUMN_SORT_ORDER("sort_order", "INTEGER"),
    COLUMN_ROLE("role", "INTEGER"),
    COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
    COLUMN_ALIAS("alias", "TEXT"),
    COLUMN_SEC_UID(C22689a.f60407a, "TEXT");
    

    /* renamed from: g */
    public String f30788g;

    /* renamed from: h */
    public String f30789h;

    private C11363g(String str, String str2) {
        this.f30788g = str;
        this.f30789h = str2;
    }
}
