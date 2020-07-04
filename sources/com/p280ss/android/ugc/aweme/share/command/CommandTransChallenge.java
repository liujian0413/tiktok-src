package com.p280ss.android.ugc.aweme.share.command;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.share.command.CommandTransChallenge */
public class CommandTransChallenge implements Serializable {
    @C6593c(mo15949a = "author_name")
    private String authorName;
    @C6593c(mo15949a = "cha_name")
    private String chaName;

    public String getAuthorName() {
        return this.authorName;
    }

    public String getChaName() {
        return this.chaName;
    }

    public void setAuthorName(String str) {
        this.authorName = str;
    }

    public void setChaName(String str) {
        this.chaName = str;
    }
}
