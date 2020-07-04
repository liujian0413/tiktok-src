package com.p280ss.android.ugc.aweme.sticker.data;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp */
public class BaseTrackTimeStamp implements Serializable {
    public static final int FULL_TRACK = -1;
    @C6593c(mo15949a = "p")
    private int pts = -1;

    public int getPts() {
        return this.pts;
    }

    public BaseTrackTimeStamp() {
    }

    public boolean isFullTrack() {
        if (-1 == this.pts) {
            return true;
        }
        return false;
    }

    public void setPts(int i) {
        this.pts = i;
    }

    public BaseTrackTimeStamp(int i) {
        this.pts = i;
    }
}
