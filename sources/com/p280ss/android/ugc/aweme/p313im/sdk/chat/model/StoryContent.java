package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.StoryContent */
public final class StoryContent implements Serializable {
    @C6593c(mo15949a = "cover")
    private UrlModel storyCover;
    @C6593c(mo15949a = "item_id")
    private String storyId;
    @C6593c(mo15949a = "sync_aweme")
    private int syncAweme;
    @C6593c(mo15949a = "video_height")
    private int videoHeight;
    @C6593c(mo15949a = "video_width")
    private int videoWidth;

    public final UrlModel getStoryCover() {
        return this.storyCover;
    }

    public final String getStoryId() {
        return this.storyId;
    }

    public final int getSyncAweme() {
        return this.syncAweme;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final void setStoryCover(UrlModel urlModel) {
        this.storyCover = urlModel;
    }

    public final void setStoryId(String str) {
        this.storyId = str;
    }

    public final void setSyncAweme(int i) {
        this.syncAweme = i;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }
}
