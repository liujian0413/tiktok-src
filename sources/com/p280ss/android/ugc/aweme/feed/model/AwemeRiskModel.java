package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeRiskModel */
public class AwemeRiskModel implements Serializable {
    @C6593c(mo15949a = "content")
    public String content;
    @C6593c(mo15949a = "risk_sink")
    public boolean riskSink;
    @C6593c(mo15949a = "type")
    public int type;
    @C6593c(mo15949a = "vote")
    public boolean vote;
    public int voteStatus = -1;
    @C6593c(mo15949a = "warn")
    public boolean warn;

    public String getContent() {
        return this.content;
    }

    public int getType() {
        return this.type;
    }

    public int getVoteStatus() {
        return this.voteStatus;
    }

    public boolean isRiskSink() {
        return this.riskSink;
    }

    public boolean isVote() {
        return this.vote;
    }

    public boolean isWarn() {
        return this.warn;
    }

    public void setRiskSink(boolean z) {
        this.riskSink = z;
    }

    public void setVote(boolean z) {
        this.vote = z;
    }

    public void setVoteStatus(int i) {
        this.voteStatus = i;
    }

    public void setWarn(boolean z) {
        this.warn = z;
    }
}
