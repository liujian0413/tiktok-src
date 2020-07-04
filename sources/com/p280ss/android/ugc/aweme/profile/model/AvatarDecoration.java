package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.AvatarDecoration */
public class AvatarDecoration implements Serializable, Cloneable {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    public long f94176id;
    @C6593c(mo15949a = "name")
    public String name;
    @C6593c(mo15949a = "source_url")
    public UrlModel sourceUrl;

    public long getId() {
        return this.f94176id;
    }

    public String getName() {
        return this.name;
    }

    public UrlModel getSourceUrl() {
        return this.sourceUrl;
    }
}
