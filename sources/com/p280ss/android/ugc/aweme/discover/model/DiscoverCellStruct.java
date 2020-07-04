package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverCellStruct */
public final class DiscoverCellStruct {
    @C6593c(mo15949a = "avatar_url")
    public UrlModel avatarUrl;
    @C6593c(mo15949a = "aweme_list")
    public List<? extends Aweme> awemeList;
    @C6593c(mo15949a = "button_name")
    public String buttonName;
    @C6593c(mo15949a = "cell_id")
    public String cellId;
    @C6593c(mo15949a = "cover_url")
    public UrlModel coverUrl;
    @C6593c(mo15949a = "desc")
    public String desc;
    @C6593c(mo15949a = "is_recommend")
    public boolean isRecommend;
    @C6593c(mo15949a = "ref_url")
    public String refUrl;
    @C6593c(mo15949a = "subtype")
    public int subtype;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "type")
    public int type;

    public final boolean isCommerceChallenge() {
        if (this.subtype == 4) {
            return true;
        }
        return false;
    }

    public final String getMobIdKey() {
        int i = this.subtype;
        if (i == 3) {
            return "playlist_tag_id";
        }
        if (i == 8) {
            return "playlist_artist";
        }
        switch (i) {
            case 5:
                return "playlist_music_id";
            case 6:
                return "playlist_uid";
            default:
                return "playlist_id";
        }
    }

    public final String getPlayListType() {
        int i = this.subtype;
        if (i == 8) {
            return "artist";
        }
        switch (i) {
            case 0:
                return "normal_playlist";
            case 1:
                return "sticker";
            case 2:
                return "activity";
            case 3:
            case 4:
                return "challenge";
            case 5:
                return "music";
            default:
                return "user";
        }
    }

    public final String getSubtypeValue() {
        switch (this.subtype) {
            case 0:
                return "normal_playlist";
            case 1:
                return "sticker";
            case 2:
                return "activity";
            case 3:
            case 4:
                return "challenge";
            case 5:
                return "music";
            case 6:
                return "user";
            case 8:
                return "artist";
            default:
                return "unknown_type";
        }
    }
}
