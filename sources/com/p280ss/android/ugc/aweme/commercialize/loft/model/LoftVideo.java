package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideo */
public final class LoftVideo implements Serializable {
    @C6593c(mo15949a = "aweme")
    private Aweme aweme;
    @C6593c(mo15949a = "show_more_button")
    private LoftVideoMore more;
    @C6593c(mo15949a = "title")
    private String title;

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final LoftVideoMore getMore() {
        return this.more;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setMore(LoftVideoMore loftVideoMore) {
        this.more = loftVideoMore;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
