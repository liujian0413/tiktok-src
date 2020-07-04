package com.twitter.sdk.android.core.models;

import com.google.gson.p276a.C6593c;

public class UrlEntity extends C46949f {
    @C6593c(mo15949a = "display_url")
    public final String displayUrl;
    @C6593c(mo15949a = "expanded_url")
    public final String expandedUrl;
    @C6593c(mo15949a = "url")
    public final String url;

    public /* bridge */ /* synthetic */ int getEnd() {
        return super.getEnd();
    }

    public /* bridge */ /* synthetic */ int getStart() {
        return super.getStart();
    }

    public UrlEntity(String str, String str2, String str3, int i, int i2) {
        super(i, i2);
        this.url = str;
        this.expandedUrl = str2;
        this.displayUrl = str3;
    }
}
