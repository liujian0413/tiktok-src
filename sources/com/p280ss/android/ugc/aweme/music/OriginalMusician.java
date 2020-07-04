package com.p280ss.android.ugc.aweme.music;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.OriginalMusician */
public class OriginalMusician implements Serializable {
    @C6593c(mo15949a = "digg_count")
    public int diggCount;
    @C6593c(mo15949a = "music_count")
    public int musicCount;
    @C6593c(mo15949a = "music_cover_url")
    public UrlModel musicCoverUrl;
    @C6593c(mo15949a = "music_qrcode_url")
    public UrlModel musicQrcodeUrl;
    @C6593c(mo15949a = "music_used_count")
    public int musicUseCount;

    public int getDiggCount() {
        return this.diggCount;
    }

    public int getMusicCount() {
        return this.musicCount;
    }

    public UrlModel getMusicCoverUrl() {
        return this.musicCoverUrl;
    }

    public UrlModel getMusicQrcodeUrl() {
        return this.musicQrcodeUrl;
    }

    public int getMusicUseCount() {
        return this.musicUseCount;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setMusicCount(int i) {
        this.musicCount = i;
    }

    public void setMusicCoverUrl(UrlModel urlModel) {
        this.musicCoverUrl = urlModel;
    }

    public void setMusicQrcodeUrl(UrlModel urlModel) {
        this.musicQrcodeUrl = urlModel;
    }

    public void setMusicUseCount(int i) {
        this.musicUseCount = i;
    }
}
