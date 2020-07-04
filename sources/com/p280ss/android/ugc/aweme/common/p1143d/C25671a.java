package com.p280ss.android.ugc.aweme.common.p1143d;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.common.d.a */
public final class C25671a {

    /* renamed from: a */
    private static UrlModel f67610a;

    /* renamed from: a */
    public static UrlModel m84399a() {
        if (f67610a == null) {
            UrlModel urlModel = new UrlModel();
            f67610a = urlModel;
            urlModel.setHeight(720);
            f67610a.setWidth(720);
            ArrayList arrayList = new ArrayList(2);
            if (C6399b.m19945u()) {
                f67610a.setUri("c8510002be9a3a61aad2");
                arrayList.add("https://p1.pstatp.com/obj/c8510002be9a3a61aad2");
                arrayList.add("https://pb3.pstatp.com/obj/c8510002be9a3a61aad2");
            } else {
                f67610a.setUri("tiktok-obj/1613727517271041");
                arrayList.add("http://p16-tiktokcdn-com.akamaized.net/obj/tiktok-obj/1613727517271041");
            }
            f67610a.setUrlList(arrayList);
        }
        return f67610a;
    }

    /* renamed from: a */
    public static boolean m84400a(UrlModel urlModel) {
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUri())) {
            return false;
        }
        if (TextUtils.equals(urlModel.getUri(), "c8510002be9a3a61aad2") || TextUtils.equals(urlModel.getUri(), "tiktok-obj/1613727517271041")) {
            return true;
        }
        return false;
    }
}
