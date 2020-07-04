package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiActivityStruct */
public class PoiActivityStruct implements Serializable {
    @C6593c(mo15949a = "activity_id")
    private String activityId;
    @C6593c(mo15949a = "activity_url")
    private UrlModel activityUrl;
    @C6593c(mo15949a = "description")
    private String description;
    @C6593c(mo15949a = "schema")
    private String schema;
    @C6593c(mo15949a = "title")
    private String title;

    public String getActivityId() {
        return this.activityId;
    }

    public UrlModel getActivityUrl() {
        return this.activityUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setActivityUrl(UrlModel urlModel) {
        this.activityUrl = urlModel;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
