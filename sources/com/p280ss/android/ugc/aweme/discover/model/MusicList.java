package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.MusicList */
public final class MusicList implements Serializable {
    @C6593c(mo15949a = "is_selected")
    private Boolean isSelected;
    @C6593c(mo15949a = "more_url")
    private String moreUrl;
    @C6593c(mo15949a = "music")
    private List<? extends Music> music;
    @C6593c(mo15949a = "name")
    private String name;

    public final String getMoreUrl() {
        return this.moreUrl;
    }

    public final List<Music> getMusic() {
        return this.music;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean isSelected() {
        return this.isSelected;
    }

    public final void setMoreUrl(String str) {
        this.moreUrl = str;
    }

    public final void setMusic(List<? extends Music> list) {
        this.music = list;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSelected(Boolean bool) {
        this.isSelected = bool;
    }
}
