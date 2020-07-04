package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.profile.p1482c.C35739a;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserAwemeCover */
public class UserAwemeCover implements Serializable {
    @C6592b(mo15947a = C35739a.class)
    @C6593c(mo15949a = "aweme_info")
    String awemeInfo;
    @C6593c(mo15949a = "preview_end")
    int previewEnd;
    @C6593c(mo15949a = "preview_start")
    int previewStart;
    @C6593c(mo15949a = "pull_text")
    String pullText;

    public String getAwemeInfo() {
        return this.awemeInfo;
    }

    public int getPreviewEnd() {
        return this.previewEnd;
    }

    public int getPreviewStart() {
        return this.previewStart;
    }

    public String getPullText() {
        return this.pullText;
    }

    public void setAwemeInfo(String str) {
        this.awemeInfo = str;
    }

    public void setPreviewEnd(int i) {
        this.previewEnd = i;
    }

    public void setPreviewStart(int i) {
        this.previewStart = i;
    }

    public void setPullText(String str) {
        this.pullText = str;
    }
}
