package com.p280ss.android.ugc.aweme.miniapp.anchor.response.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.response.model.MediumInfo */
public final class MediumInfo implements Serializable {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private String f87144id;
    @C6593c(mo15949a = "name")
    private String name;
    @C6593c(mo15949a = "play_cnt")
    private Long playCnt = Long.valueOf(0);
    @C6593c(mo15949a = "poster")
    private UrlModel poster;
    @C6593c(mo15949a = "type")
    private Integer type;

    public final String getId() {
        return this.f87144id;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getPlayCnt() {
        return this.playCnt;
    }

    public final UrlModel getPoster() {
        return this.poster;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setId(String str) {
        this.f87144id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPlayCnt(Long l) {
        this.playCnt = l;
    }

    public final void setPoster(UrlModel urlModel) {
        this.poster = urlModel;
    }

    public final void setType(Integer num) {
        this.type = num;
    }
}
