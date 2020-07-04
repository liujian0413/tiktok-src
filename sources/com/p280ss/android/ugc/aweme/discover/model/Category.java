package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.C23268a;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Category */
public class Category extends C23268a implements Serializable {
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "ad_data")
    CategoryListAdInfo adData;
    @C6593c(mo15949a = "category_type")
    private int categoryType;
    @C6593c(mo15949a = "challenge_info")
    private Challenge challenge;
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "aweme_list")
    private List<Aweme> items;
    @C6593c(mo15949a = "music_info")
    private Music music;
    @C6593c(mo15949a = "word_record")
    private Word word;

    public CategoryListAdInfo getAdData() {
        return this.adData;
    }

    public int getCategoryType() {
        return this.categoryType;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<Aweme> getItems() {
        return this.items;
    }

    public Music getMusic() {
        return this.music;
    }

    public Word getWord() {
        return this.word;
    }

    public boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    public boolean isChallenge() {
        if (this.challenge != null) {
            return true;
        }
        return false;
    }

    public boolean isMusic() {
        if (this.music != null) {
            return true;
        }
        return false;
    }

    public UrlModel getClickTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.clickTrackUrlList;
    }

    public String getLogExtra() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.logExtra;
    }

    public UrlModel getTrackUrlList() {
        if (this.adData == null) {
            return null;
        }
        return this.adData.trackUrlList;
    }

    public boolean isChallengeAd() {
        if (!isAd() || this.challenge == null) {
            return false;
        }
        return true;
    }

    public boolean isPicAd() {
        if (!isAd() || this.challenge != null) {
            return false;
        }
        return true;
    }

    public long getCreativeId() {
        if (this.adData == null) {
            return 0;
        }
        return this.adData.getCreativeId().longValue();
    }

    public void setCategoryType(int i) {
        this.categoryType = i;
    }

    public void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setItems(List<Aweme> list) {
        this.items = list;
    }

    public void setMusic(Music music2) {
        this.music = music2;
    }

    public void setWord(Word word2) {
        this.word = word2;
    }
}
