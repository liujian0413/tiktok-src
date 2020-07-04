package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchMusic */
public class SearchMusic implements Serializable {
    @C6593c(mo15949a = "card_type")
    private int cardType = 1;
    private boolean hasMobShow;
    @C6593c(mo15949a = "has_more")
    private boolean hasMore;
    @C6593c(mo15949a = "music")
    private Music music;
    @C6593c(mo15949a = "musics")
    private List<? extends Music> musicList;

    public final int getCardType() {
        return this.cardType;
    }

    public final boolean getHasMobShow() {
        return this.hasMobShow;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final Music getMusic() {
        return this.music;
    }

    public final List<Music> getMusicList() {
        return this.musicList;
    }

    public int hashCode() {
        Music music2 = this.music;
        if (music2 != null) {
            return music2.hashCode();
        }
        return 0;
    }

    public final void setCardType(int i) {
        this.cardType = i;
    }

    public final void setHasMobShow(boolean z) {
        this.hasMobShow = z;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMusic(Music music2) {
        this.music = music2;
    }

    public final void setMusicList(List<? extends Music> list) {
        this.musicList = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SearchMusic) && !(!C7573i.m23585a((Object) this.music, (Object) ((SearchMusic) obj).music))) {
            return true;
        }
        return false;
    }

    public final void setRequestId(String str) {
        Music music2 = this.music;
        if (music2 != null) {
            music2.setRequestId(str);
        }
        List<? extends Music> list = this.musicList;
        if (list != null) {
            for (Music requestId : list) {
                requestId.setRequestId(str);
            }
        }
    }
}
