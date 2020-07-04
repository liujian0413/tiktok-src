package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.HotListStruct */
public class HotListStruct implements Serializable {
    @C6593c(mo15949a = "image_url")
    public String imageUrl;
    @C6593c(mo15949a = "schema")
    public String schema;
    @C6593c(mo15949a = "title")
    public String titile;
    @C6593c(mo15949a = "type")
    public int type;

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitile() {
        return this.titile;
    }

    public int getType() {
        return this.type;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitile(String str) {
        this.titile = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
