package com.p280ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord */
public class HotSearchGuideWord {
    @C6593c(mo15949a = "breathe_times")
    public int breatheTimes;
    @C6593c(mo15949a = "word")
    public String displayWord;
    @C6593c(mo15949a = "search_word")
    public String searchWord;
    @C6593c(mo15949a = "type")
    public int type;

    public boolean isNormalWord() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public String getSearchWord() {
        if (TextUtils.isEmpty(this.searchWord)) {
            return this.displayWord;
        }
        return this.searchWord;
    }

    public boolean isAd() {
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("displayWord: ");
        sb.append(this.displayWord);
        sb.append(", searchWord: ");
        sb.append(this.searchWord);
        sb.append(", type: ");
        sb.append(this.type);
        return sb.toString();
    }
}
