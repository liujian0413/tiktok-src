package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.Loft */
public final class Loft implements Serializable {
    @C6593c(mo15949a = "brand_package")
    private LoftAnimationRes animationRes;
    @C6593c(mo15949a = "activity_end_time")
    private Integer endTime = Integer.valueOf(0);
    @C6593c(mo15949a = "second_floor_guide")
    private LoftGuide guide;
    @C6593c(mo15949a = "activity_id")

    /* renamed from: id */
    private String f65588id;
    @C6593c(mo15949a = "status")
    private int status = 0;
    @C6593c(mo15949a = "aweme_list")
    private List<LoftVideo> videoList;

    public final LoftAnimationRes getAnimationRes() {
        return this.animationRes;
    }

    public final Integer getEndTime() {
        return this.endTime;
    }

    public final LoftGuide getGuide() {
        return this.guide;
    }

    public final String getId() {
        return this.f65588id;
    }

    public final int getStatus() {
        return this.status;
    }

    public final List<LoftVideo> getVideoList() {
        return this.videoList;
    }

    public final void setAnimationRes(LoftAnimationRes loftAnimationRes) {
        this.animationRes = loftAnimationRes;
    }

    public final void setEndTime(Integer num) {
        this.endTime = num;
    }

    public final void setGuide(LoftGuide loftGuide) {
        this.guide = loftGuide;
    }

    public final void setId(String str) {
        this.f65588id = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setVideoList(List<LoftVideo> list) {
        this.videoList = list;
    }
}
