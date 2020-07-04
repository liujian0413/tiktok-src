package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiCardStruct */
public class PoiCardStruct implements Serializable {
    @C6593c(mo15949a = "is_show")
    public int isShow;
    @C6593c(mo15949a = "url")
    public String url;

    public int getIsShow() {
        return this.isShow;
    }

    public String getUrl() {
        return this.url;
    }

    public com.p280ss.android.ugc.aweme.sticker.data.PoiCardStruct toStickerPoiCard() {
        com.p280ss.android.ugc.aweme.sticker.data.PoiCardStruct poiCardStruct = new com.p280ss.android.ugc.aweme.sticker.data.PoiCardStruct();
        poiCardStruct.setIsShow(Integer.valueOf(this.isShow));
        poiCardStruct.setUrl(this.url);
        return poiCardStruct;
    }

    public void setIsShow(int i) {
        this.isShow = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void fromStickerPoiStruct(com.p280ss.android.ugc.aweme.sticker.data.PoiCardStruct poiCardStruct) {
        int i;
        if (poiCardStruct != null) {
            if (poiCardStruct.getIsShow() != null) {
                i = poiCardStruct.getIsShow().intValue();
            } else {
                i = 0;
            }
            this.isShow = i;
            this.url = poiCardStruct.getUrl();
        }
    }
}
