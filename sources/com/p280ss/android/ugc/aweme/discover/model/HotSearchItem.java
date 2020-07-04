package com.p280ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchItem */
public final class HotSearchItem extends BaseHotSearchItem implements Serializable {
    public static final Companion Companion = new Companion(null);
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "ad_data")
    private final HotSearchAdData adData;
    @C6593c(mo15949a = "can_extend_detail")
    private final boolean canExtendDetail;
    @C6593c(mo15949a = "challenge_id")
    private String challengeId;
    private boolean hasSentMob;
    @C6593c(mo15949a = "hot_value")
    private long hotValue;
    @C6593c(mo15949a = "group_id")

    /* renamed from: id */
    private String f70740id;
    private boolean isHistory;
    private boolean isTrending;
    private int label;
    private LogPbBean logPb;
    @C6593c(mo15949a = "position")
    private int position;
    @C6593c(mo15949a = "search_word")
    private String realSearchWord;
    @C6593c(mo15949a = "top_aweme_id")
    private String topAwemeId;
    @C6593c(mo15949a = "word_cover")
    private UrlModel urlModel;
    @C6593c(mo15949a = "video_count")
    private int videoCount;
    private String word;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.HotSearchItem$Companion */
    public static final class Companion implements Serializable {
        private Companion() {
        }

        public final HotSearchItem createPlaceHolder() {
            return new HotSearchItem();
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public HotSearchItem() {
    }

    public final HotSearchAdData getAdData() {
        return this.adData;
    }

    public final boolean getCanExtendDetail() {
        return this.canExtendDetail;
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final boolean getHasSentMob() {
        return this.hasSentMob;
    }

    public final long getHotValue() {
        return this.hotValue;
    }

    public final String getId() {
        return this.f70740id;
    }

    public final int getLabel() {
        return this.label;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getRealSearchWord() {
        return this.realSearchWord;
    }

    public final String getTopAwemeId() {
        return this.topAwemeId;
    }

    public final UrlModel getUrlModel() {
        return this.urlModel;
    }

    public final int getVideoCount() {
        return this.videoCount;
    }

    public final String getWord() {
        return this.word;
    }

    public final boolean isHistory() {
        return this.isHistory;
    }

    public final boolean isTrending() {
        return this.isTrending;
    }

    public final boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = this.word;
        if (str == null) {
            return "PLACE_HOLDER";
        }
        return str;
    }

    public final int getType() {
        if (TextUtils.isEmpty(this.challengeId)) {
            return 0;
        }
        return 1;
    }

    public final boolean isPlaceholder() {
        return TextUtils.isEmpty(this.word);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.word != null) {
            String str = this.word;
            if (str == null) {
                C7573i.m23580a();
            }
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        if (this.realSearchWord != null) {
            String str2 = this.realSearchWord;
            if (str2 == null) {
                C7573i.m23580a();
            }
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = (((((i5 + i2) * 31) + this.label) * 31) + Long.valueOf(this.hotValue).hashCode()) * 31;
        if (this.challengeId != null) {
            String str3 = this.challengeId;
            if (str3 == null) {
                C7573i.m23580a();
            }
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (hashCode + i3) * 31;
        if (this.urlModel != null) {
            UrlModel urlModel2 = this.urlModel;
            if (urlModel2 == null) {
                C7573i.m23580a();
            }
            i4 = urlModel2.hashCode();
        }
        return ((i6 + i4) * 31) + this.position;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setHasSentMob(boolean z) {
        this.hasSentMob = z;
    }

    public final void setHistory(boolean z) {
        this.isHistory = z;
    }

    public final void setHotValue(long j) {
        this.hotValue = j;
    }

    public final void setId(String str) {
        this.f70740id = str;
    }

    public final void setIsTrending(boolean z) {
        this.isTrending = z;
    }

    public final void setLabel(int i) {
        this.label = i;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setRealSearchWord(String str) {
        this.realSearchWord = str;
    }

    public final void setTopAwemeId(String str) {
        this.topAwemeId = str;
    }

    public final void setTrending(boolean z) {
        this.isTrending = z;
    }

    public final void setUrlModel(UrlModel urlModel2) {
        this.urlModel = urlModel2;
    }

    public final void setVideoCount(int i) {
        this.videoCount = i;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj == null || (!C7573i.m23585a((Object) getClass(), (Object) obj.getClass()))) {
            return false;
        }
        HotSearchItem hotSearchItem = (HotSearchItem) obj;
        if (this.label != hotSearchItem.label) {
            return false;
        }
        if (this.word != null) {
            z = !C7573i.m23585a((Object) this.word, (Object) hotSearchItem.word);
        } else if (hotSearchItem.word != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        if (this.realSearchWord != null) {
            z2 = !C7573i.m23585a((Object) this.realSearchWord, (Object) hotSearchItem.realSearchWord);
        } else if (hotSearchItem.realSearchWord != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || this.hotValue != hotSearchItem.hotValue) {
            return false;
        }
        if (this.challengeId != null) {
            z3 = !C7573i.m23585a((Object) this.challengeId, (Object) hotSearchItem.challengeId);
        } else if (hotSearchItem.challengeId != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.position != hotSearchItem.position) {
            return false;
        }
        return true;
    }

    public HotSearchItem(String str, String str2, int i, long j) {
        C7573i.m23587b(str, "word");
        C7573i.m23587b(str2, "realSearchWord");
        this.word = str;
        this.realSearchWord = str2;
        this.label = i;
        this.hotValue = j;
    }
}
