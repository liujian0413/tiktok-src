package com.p280ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiPhoto */
public class PoiPhoto implements Serializable {
    @C6593c(mo15949a = "pic_large")
    public UrlModel picLarge;
    @C6593c(mo15949a = "pic_medium")
    public UrlModel picMedium;
    @C6593c(mo15949a = "tag_list")
    public List<C35124m> poiTagList;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "upload_image_watermark")
    public String uploadImageWaterMark;

    public UrlModel getPicMedium() {
        return this.picMedium;
    }

    public String getLarge() {
        return (String) this.picLarge.getUrlList().get(0);
    }

    public String getMedium() {
        return (String) this.picMedium.getUrlList().get(0);
    }

    public String getTagName() {
        if (C6307b.m19566a((Collection<T>) this.poiTagList)) {
            return "";
        }
        return ((C35124m) this.poiTagList.get(0)).f91880a;
    }

    public int getTagType() {
        if (C6307b.m19566a((Collection<T>) this.poiTagList)) {
            return 0;
        }
        return ((C35124m) this.poiTagList.get(0)).f91881b;
    }
}
