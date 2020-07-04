package com.p280ss.android.ugc.aweme.ttuploader.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.model.VideoMediaInfo */
public final class VideoMediaInfo implements Serializable {
    @C6593c(mo15949a = "bitrate")
    private final int bitRate;
    @C6593c(mo15949a = "duration")
    private final float duration;
    @C6593c(mo15949a = "format")
    private final String format = "";
    @C6593c(mo15949a = "height")
    private final int height;
    @C6593c(mo15949a = "md5")
    private final String md5 = "";
    @C6593c(mo15949a = "width")
    private final int width;

    public final int getBitRate() {
        return this.bitRate;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final String getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final int getWidth() {
        return this.width;
    }
}
