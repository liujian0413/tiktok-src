package com.p280ss.android.ugc.aweme.discover.p1185ui.status;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.status.SearchStatusName */
public enum SearchStatusName {
    NEED_LOGIN(1),
    LIMIT(2),
    EMPTY(3),
    SENSITIVE(4);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    private SearchStatusName(int i) {
        this.type = i;
    }
}
