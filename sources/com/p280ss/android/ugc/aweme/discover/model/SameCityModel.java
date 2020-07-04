package com.p280ss.android.ugc.aweme.discover.model;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SameCityModel */
public class SameCityModel {
    public static String sImageUrl;
    public boolean isHaveBanner;
    public UrlModel mCover;

    public static SameCityModel getModel() {
        SameCityModel sameCityModel = new SameCityModel();
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(sImageUrl);
        arrayList.add(sImageUrl);
        arrayList.add(sImageUrl);
        urlModel.setUrlList(arrayList);
        sameCityModel.mCover = urlModel;
        return sameCityModel;
    }
}
