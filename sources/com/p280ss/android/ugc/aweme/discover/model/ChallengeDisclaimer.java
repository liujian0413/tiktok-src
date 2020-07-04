package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.utils.C43065do;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer */
public class ChallengeDisclaimer implements Serializable {
    @C6592b(mo15947a = C43065do.class)
    @C6593c(mo15949a = "content")
    public String content;
    @C6593c(mo15949a = "title")
    public String title;

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
