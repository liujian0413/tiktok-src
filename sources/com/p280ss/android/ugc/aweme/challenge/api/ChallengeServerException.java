package com.p280ss.android.ugc.aweme.challenge.api;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.ChallengeServerException */
public class ChallengeServerException extends ApiServerException {
    @C6593c(mo15949a = "challenge")
    Challenge challenge;

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getPrompt() {
        return this.mPrompt;
    }

    public ChallengeServerException(int i) {
        super(i);
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public ChallengeServerException setErrorMsg(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public ChallengeServerException setPrompt(String str) {
        this.mPrompt = str;
        return this;
    }
}
