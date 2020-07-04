package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27029ba;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchHistory */
public class SearchHistory {
    @C6593c(mo15949a = "keyword")
    public String keyword;
    @C6593c(mo15949a = "int")
    public int type;

    public SearchHistory() {
    }

    public int hashCode() {
        if (this.keyword != null) {
            return this.keyword.hashCode();
        }
        return 0;
    }

    public SearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public static int toHistoryType(int i) {
        if (i == C27029ba.f71321c) {
            return 16;
        }
        if (i == C27029ba.f71323e) {
            return 17;
        }
        if (i == C27029ba.f71324f) {
            return 18;
        }
        if (i == C27029ba.f71320b) {
            return 19;
        }
        if (i == C27029ba.f71319a) {
            return 20;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchHistory searchHistory = (SearchHistory) obj;
        if (this.keyword != null) {
            return this.keyword.equals(searchHistory.keyword);
        }
        if (searchHistory.keyword == null) {
            return true;
        }
        return false;
    }

    public SearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
