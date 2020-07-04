package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchXiGuaVideo */
public final class SearchXiGuaVideo implements Serializable {
    @C6593c(mo15949a = "position")
    private List<? extends Position> position;
    @C6593c(mo15949a = "video_info")
    private XiGuaVideo video;

    public final List<Position> getPosition() {
        return this.position;
    }

    public final XiGuaVideo getVideo() {
        return this.video;
    }

    public final void setPosition(List<? extends Position> list) {
        this.position = list;
    }

    public final void setVideo(XiGuaVideo xiGuaVideo) {
        this.video = xiGuaVideo;
    }
}
