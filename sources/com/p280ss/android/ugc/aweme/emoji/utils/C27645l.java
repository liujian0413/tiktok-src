package com.p280ss.android.ugc.aweme.emoji.utils;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.l */
public final class C27645l {
    /* renamed from: a */
    public static UrlModel m90635a(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setHeight(i2);
        urlModel.setWidth(i);
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
