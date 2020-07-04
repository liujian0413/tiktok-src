package com.bytedance.p263im.core.internal.p590db;

/* renamed from: com.bytedance.im.core.internal.db.a */
enum C11320a {
    COLUMN_UUID("uuid", "TEXT NOT NULL"),
    COLUMN_LOCAL_URI("local_uri", "TEXT"),
    COLUMN_REMOTE_URI("remote_uri", "TEXT"),
    COLUMN_SIZE("size", "BIGINT"),
    COLUMN_TYPE("type", "TEXT"),
    COLUMN_HASH("hash", "TEXT"),
    COLUMN_INDEX("position", "INTEGER"),
    COLUMN_STATUS("status", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_DISPLAY_TYPE("display_type", "TEXT"),
    COLUMN_MIME_TYPE("mime_type", "TEXT");
    

    /* renamed from: l */
    public String f30665l;

    /* renamed from: m */
    public String f30666m;

    private C11320a(String str, String str2) {
        this.f30665l = str;
        this.f30666m = str2;
    }
}
