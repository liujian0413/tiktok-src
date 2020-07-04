package com.p280ss.android.ugc.aweme.storage.constants;

/* renamed from: com.ss.android.ugc.aweme.storage.constants.StorageType */
public enum StorageType {
    CACHE("cache"),
    RESOURCE("resource"),
    DRAFT("draft");
    
    private final String type;

    public final String getType() {
        return this.type;
    }

    private StorageType(String str) {
        this.type = str;
    }
}
