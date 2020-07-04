package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FloatingCardInfo */
public class FloatingCardInfo implements Serializable {
    static final long serialVersionUID = 42;
    @C6593c(mo15949a = "button_bg")
    public UrlModel buttonBackground;
    @C6593c(mo15949a = "button_desc")
    public String buttonDesc;
    @C6593c(mo15949a = "description")
    public String description;
    @C6593c(mo15949a = "icons")
    public List<UrlModel> icons;
    @C6593c(mo15949a = "schema")
    public String schema;
    @C6593c(mo15949a = "schema_desc")
    public String schemaDesc;
    @C6593c(mo15949a = "title")
    public String title;

    public UrlModel getButtonBackground() {
        return this.buttonBackground;
    }

    public String getButtonDesc() {
        return this.buttonDesc;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getIcons() {
        return this.icons;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSchemaDesc() {
        return this.schemaDesc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButtonBackground(UrlModel urlModel) {
        this.buttonBackground = urlModel;
    }

    public void setButtonDesc(String str) {
        this.buttonDesc = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcons(List<UrlModel> list) {
        this.icons = list;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSchemaDesc(String str) {
        this.schemaDesc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
