package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.ChallengeNotice */
public class ChallengeNotice {
    @C6593c(mo15949a = "challenge")
    Challenge challenge;
    @C6593c(mo15949a = "content")
    String content;
    @C6593c(mo15949a = "schema")
    String schema;
    @C6593c(mo15949a = "title")
    String title;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getContent() {
        return this.content;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
