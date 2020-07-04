package com.p280ss.android.ugc.aweme.emoji.emojichoose.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources */
public class Resources implements Serializable {
    @C6593c(mo15949a = "display_name")
    private String displayName;
    @C6593c(mo15949a = "icon_url")
    private String iconUrl;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private long f72748id;
    private int optional;
    @C6593c(mo15949a = "resource_url")
    private String resourceUrl;
    private String type;
    @C6593c(mo15949a = "version")
    private String version;

    public String getDisplayName() {
        return this.displayName;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public long getId() {
        return this.f72748id;
    }

    public int getOptional() {
        return this.optional;
    }

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return String.valueOf(this.f72748id).hashCode();
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setId(long j) {
        this.f72748id = j;
    }

    public void setOptional(int i) {
        this.optional = i;
    }

    public void setResourceUrl(String str) {
        this.resourceUrl = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Resources) && this.f72748id == ((Resources) obj).getId()) {
            return true;
        }
        return false;
    }
}
