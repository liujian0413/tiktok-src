package com.twitter.sdk.android.core.models;

import com.google.gson.p276a.C6593c;

public class MentionEntity extends C46949f {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public final long f120370id;
    @C6593c(mo15949a = "id_str")
    public final String idStr;
    @C6593c(mo15949a = "name")
    public final String name;
    @C6593c(mo15949a = "screen_name")
    public final String screenName;

    public /* bridge */ /* synthetic */ int getEnd() {
        return super.getEnd();
    }

    public /* bridge */ /* synthetic */ int getStart() {
        return super.getStart();
    }

    public MentionEntity(long j, String str, String str2, String str3, int i, int i2) {
        super(i, i2);
        this.f120370id = j;
        this.idStr = str;
        this.name = str2;
        this.screenName = str3;
    }
}
