package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchChallengeAdData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchChallenge */
public class SearchChallenge implements Serializable {
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "ad_data")
    SearchChallengeAdData adData;
    @C6593c(mo15949a = "items")
    List<Aweme> awemes;
    @C6593c(mo15949a = "challenge_info")
    Challenge challenge;
    @C6593c(mo15949a = "position")
    List<Position> position;
    private String requestId;

    public SearchChallengeAdData getAdData() {
        return this.adData;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean hasAwemeList() {
        if (this.awemes == null || this.awemes.size() <= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.challenge.getCid().hashCode();
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (this.challenge != null) {
            this.challenge.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChallenge)) {
            return false;
        }
        return TextUtils.equals(this.challenge.getCid(), ((SearchChallenge) obj).challenge.getCid());
    }
}
