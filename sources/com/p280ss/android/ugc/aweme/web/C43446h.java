package com.p280ss.android.ugc.aweme.web;

import android.content.Context;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.web.h */
public final class C43446h {

    /* renamed from: a */
    public static String f112521a = "https://aweme.snssdk.com";

    /* renamed from: b */
    public static String f112522b = "https://www.tiktokv.com";

    /* renamed from: c */
    public static String f112523c = "https://test-aweme.snssdk.com/";

    /* renamed from: d */
    public static String f112524d;

    /* renamed from: e */
    public static String f112525e;

    /* renamed from: f */
    private static boolean f112526f = C6887b.m21436b().mo16909b((Context) AwemeApplication.m21341a(), "is_use_test_host", false);

    static {
        String str;
        String str2;
        if (!C7163a.m22363a() || !f112526f) {
            str = f112521a;
        } else {
            str = f112523c;
        }
        f112524d = str;
        if (!C7163a.m22363a() || !f112526f) {
            str2 = f112522b;
        } else {
            str2 = f112523c;
        }
        f112525e = str2;
    }
}
