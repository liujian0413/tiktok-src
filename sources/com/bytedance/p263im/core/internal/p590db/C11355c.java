package com.bytedance.p263im.core.internal.p590db;

/* renamed from: com.bytedance.im.core.internal.db.c */
enum C11355c {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_NAME("name", "TEXT"),
    COLUMN_DESC("desc", "TEXT"),
    COLUMN_ICON("icon", "TEXT"),
    COLUMN_NOTICE("notice", "TEXT"),
    COLUMN_OWNER_ID("owner_id", "INTEGER DEFAULT -1"),
    COLUMN_SEC_OWNER("sec_owner", "TEXT"),
    COLUMN_EXT("ext", "TEXT");
    

    /* renamed from: j */
    public String f30731j;

    /* renamed from: k */
    public String f30732k;

    private C11355c(String str, String str2) {
        this.f30731j = str;
        this.f30732k = str2;
    }
}
