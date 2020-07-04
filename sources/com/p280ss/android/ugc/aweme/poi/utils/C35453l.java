package com.p280ss.android.ugc.aweme.poi.utils;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.l */
public final class C35453l {
    /* renamed from: b */
    public static boolean m114518b(String str) {
        return new File(m114519c(str)).exists();
    }

    /* renamed from: a */
    public static UrlModel m114517a(String str) {
        String c = m114519c(str);
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("file://");
        sb.append(c);
        arrayList.add(sb.toString());
        urlModel.setUrlList(arrayList);
        StringBuilder sb2 = new StringBuilder("file://");
        sb2.append(c);
        urlModel.setUri(sb2.toString());
        return urlModel;
    }

    /* renamed from: c */
    private static String m114519c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C6399b.m19921a().getFilesDir().getPath());
        sb.append("/mapthumb/");
        sb.append(str);
        sb.append(".jpg");
        return sb.toString();
    }
}
