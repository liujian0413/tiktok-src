package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.ExternalMusicInfo */
public final class ExternalMusicInfo implements Serializable {
    @C6593c(mo15949a = "external_song_key")
    public String externalSongKey;
    @C6593c(mo15949a = "h5_url")
    public String jumpUrl;
    @C6593c(mo15949a = "partner_name")
    public String partnerName;
    @C6593c(mo15949a = "partner_song_id")
    public String partnerSongId;

    public final String getExternalSongKey() {
        return this.externalSongKey;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerSongId() {
        return this.partnerSongId;
    }

    public final void setExternalSongKey(String str) {
        this.externalSongKey = str;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setPartnerName(String str) {
        this.partnerName = str;
    }

    public final void setPartnerSongId(String str) {
        this.partnerSongId = str;
    }
}
