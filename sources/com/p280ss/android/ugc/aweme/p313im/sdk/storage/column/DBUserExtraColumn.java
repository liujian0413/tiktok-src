package com.p280ss.android.ugc.aweme.p313im.sdk.storage.column;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.storage.column.DBUserExtraColumn */
public enum DBUserExtraColumn {
    COLUMN_UID("UID", "TEXT PRIMARY KEY NOT NULL"),
    COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR("IS_DISABLE_SHOW_FOLLOW_BAR", "INTEGER NOT NULL"),
    COLUMN_IS_SAY_HELLO_LOGGER("IS_SAY_HELLO_LOGGER", "INTEGER NOT NULL");
    
    public String key;
    public String type;

    private DBUserExtraColumn(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
