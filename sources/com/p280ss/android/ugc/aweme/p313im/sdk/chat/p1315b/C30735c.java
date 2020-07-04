package com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c */
public final class C30735c {

    /* renamed from: a */
    public static final C30735c f80481a = new C30735c();

    private C30735c() {
    }

    /* renamed from: a */
    public static final UrlModel m100130a(UrlModel urlModel, String str) {
        if (urlModel == null) {
            urlModel = new UrlModel();
        }
        if (urlModel.getUrlList() == null) {
            urlModel.setUrlList(new ArrayList());
        }
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            List urlList = urlModel.getUrlList();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(str);
            urlList.add(0, sb.toString());
        }
        if (urlModel.getUrlList().isEmpty()) {
            urlModel.getUrlList().add("error_picture_path");
        }
        return urlModel;
    }
}
