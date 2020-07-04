package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.VideoTag */
public final class VideoTag implements Serializable {
    @C6593c(mo15949a = "background_color")
    private String backgroundColor;
    @C6593c(mo15949a = "font_color")
    private String fontColor;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private int f70744id;
    @C6593c(mo15949a = "title")
    private String title;

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getFontColor() {
        return this.fontColor;
    }

    public final int getId() {
        return this.f70744id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setFontColor(String str) {
        this.fontColor = str;
    }

    public final void setId(int i) {
        this.f70744id = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
