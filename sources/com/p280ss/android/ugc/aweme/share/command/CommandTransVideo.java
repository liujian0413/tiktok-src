package com.p280ss.android.ugc.aweme.share.command;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.share.command.CommandTransVideo */
public class CommandTransVideo implements Serializable {
    @C6593c(mo15949a = "author_name")
    private String authorName;
    @C6593c(mo15949a = "aweme_id")
    private String awemeId;
    @C6593c(mo15949a = "cover")
    private UrlModel cover;
    @C6593c(mo15949a = "desc")
    private String desc;

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDesc(String str) {
        this.desc = str;
    }
}
