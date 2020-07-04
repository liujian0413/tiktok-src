package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicSearchHistory */
public class MusicSearchHistory {
    @C6593c(mo15949a = "keyword")
    public String keyword;
    @C6593c(mo15949a = "int")
    public int type;

    public MusicSearchHistory() {
    }

    public int hashCode() {
        if (this.keyword != null) {
            return this.keyword.hashCode();
        }
        return 0;
    }

    public MusicSearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MusicSearchHistory musicSearchHistory = (MusicSearchHistory) obj;
        if (this.keyword != null) {
            return this.keyword.equals(musicSearchHistory.keyword);
        }
        if (musicSearchHistory.keyword == null) {
            return true;
        }
        return false;
    }

    public MusicSearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
