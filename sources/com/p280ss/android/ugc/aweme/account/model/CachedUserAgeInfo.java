package com.p280ss.android.ugc.aweme.account.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.account.model.CachedUserAgeInfo */
public final class CachedUserAgeInfo implements Serializable {
    private String birthday;
    private int userMode;

    public final String getBirthday() {
        return this.birthday;
    }

    public final int getUserMode() {
        return this.userMode;
    }

    public final void setBirthday(String str) {
        this.birthday = str;
    }

    public final void setUserMode(int i) {
        this.userMode = i;
    }

    public CachedUserAgeInfo(String str, int i) {
        this.birthday = str;
        this.userMode = i;
    }
}
