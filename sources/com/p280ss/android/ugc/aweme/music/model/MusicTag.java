package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicTag */
public final class MusicTag implements Serializable {
    @C6593c(mo15949a = "tag_color")
    private String tagColor;
    @C6593c(mo15949a = "tag_title")
    private String tagTitle;
    @C6593c(mo15949a = "tag_title_color")
    private String tagTitleColor;

    public final String getTagColor() {
        return this.tagColor;
    }

    public final String getTagTitle() {
        return this.tagTitle;
    }

    public final String getTagTitleColor() {
        return this.tagTitleColor;
    }

    public final void setTagColor(String str) {
        this.tagColor = str;
    }

    public final void setTagTitle(String str) {
        this.tagTitle = str;
    }

    public final void setTagTitleColor(String str) {
        this.tagTitleColor = str;
    }
}
