package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice */
public class AnnouncementNotice {
    @C6593c(mo15949a = "challenge")
    Challenge challenge;
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "image_url")
    UrlModel imageUrl;
    @C6593c(mo15949a = "object_id")
    String objectId;
    @C6593c(mo15949a = "schema_url")
    String schemaUrl;
    @C6593c(mo15949a = "search")
    Search search;
    @C6593c(mo15949a = "task_id")
    long taskId;
    @C6593c(mo15949a = "title")
    String title;
    @C6593c(mo15949a = "type")
    int type;

    public Challenge getChallenge() {
        return this.challenge;
    }

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

    public Search getSearch() {
        return this.search;
    }

    public long getTaskId() {
        return this.taskId;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
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

    public void setSearch(Search search2) {
        this.search = search2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
