package com.p280ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob */
public final class RecommendWordMob implements Serializable {
    @C6593c(mo15949a = "info")
    private String info;
    @C6593c(mo15949a = "query_id")
    private String queryId;
    @C6593c(mo15949a = "words_source")
    private String wordsSource;

    public final String getInfo() {
        return this.info;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final String getWordsSource() {
        return this.wordsSource;
    }

    public final void setInfo(String str) {
        this.info = str;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setWordsSource(String str) {
        this.wordsSource = str;
    }
}
