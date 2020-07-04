package com.p280ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.C6600e;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel */
public class BusinessGoodsPublishModel {
    public String draftId;
    public String title;
    public String videoPath;

    public int hashCode() {
        if (this.videoPath != null) {
            return this.videoPath.hashCode();
        }
        return 0;
    }

    public String toJsonString() {
        return new C6600e().mo15979b((Object) this);
    }

    public static BusinessGoodsPublishModel toObj(String str) {
        return (BusinessGoodsPublishModel) new C6600e().mo15974a(str, BusinessGoodsPublishModel.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.videoPath, ((BusinessGoodsPublishModel) obj).videoPath);
    }

    public BusinessGoodsPublishModel(String str, String str2) {
        this.draftId = str;
        this.title = str2;
    }

    public BusinessGoodsPublishModel(String str, String str2, String str3) {
        this.draftId = str;
        this.title = str2;
        this.videoPath = str3;
    }
}
