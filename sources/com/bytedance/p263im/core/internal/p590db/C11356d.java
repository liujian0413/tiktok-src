package com.bytedance.p263im.core.internal.p590db;

/* renamed from: com.bytedance.im.core.internal.db.d */
enum C11356d {
    COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
    COLUMN_VERSION("info_version", "BIGINT"),
    COLUMN_STICK_TOP("stick_top", "INTEGER"),
    COLUMN_MUTE("mute", "INTEGER"),
    COLUMN_EXT("ext", "TEXT"),
    COLUMN_FAVORITE("favor", "INTEGER");
    

    /* renamed from: g */
    public String f30740g;

    /* renamed from: h */
    public String f30741h;

    private C11356d(String str, String str2) {
        this.f30740g = str;
        this.f30741h = str2;
    }
}
