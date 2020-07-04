package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice */
public class UserTextNotice {
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "image_url")
    UrlModel imageUrl;
    @C6593c(mo15949a = "object_id")
    String objectId;
    @C6593c(mo15949a = "schema_url")
    String schemaUrl;
    @C6593c(mo15949a = "sub_type")
    int subType;
    @C6593c(mo15949a = "task_id")
    long taskId;
    @C6593c(mo15949a = "title")
    String title;
    @C6593c(mo15949a = "user_info")
    User user;

    public String getContent() {
        return this.content;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public int getSubType() {
        return this.subType;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setObjectId(String str) {
        this.objectId = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
