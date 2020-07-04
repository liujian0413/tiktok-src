package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchInfo */
public final class HotSearchInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 4;
    @C6593c(mo15949a = "challenge_id")
    public String challengeId;
    @C6593c(mo15949a = "group_id")

    /* renamed from: id */
    public String f75160id;
    @C6593c(mo15949a = "label")
    public int label;
    @C6593c(mo15949a = "search_word")
    public String searchWord;
    @C6593c(mo15949a = "sentence")
    public String sentence;
    @C6593c(mo15949a = "value")
    public long value;
    @C6593c(mo15949a = "vb_rank")
    public int videoRank;
    @C6593c(mo15949a = "vb_rank_value")
    public long videoRankVV;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchInfo$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getId() {
        return this.f75160id;
    }

    public final int getLabel() {
        return this.label;
    }

    public final String getSearchWord() {
        return this.searchWord;
    }

    public final String getSentence() {
        return this.sentence;
    }

    public final long getValue() {
        return this.value;
    }

    public final int getVideoRank() {
        return this.videoRank;
    }

    public final long getVideoRankVV() {
        return this.videoRankVV;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setSearchWord(String str) {
        this.searchWord = str;
    }

    public final void setSentence(String str) {
        this.sentence = str;
    }

    public final void setValue(long j) {
        this.value = j;
    }

    public final void setVideoRank(int i) {
        this.videoRank = i;
    }

    public final void setVideoRankVV(long j) {
        this.videoRankVV = j;
    }
}
