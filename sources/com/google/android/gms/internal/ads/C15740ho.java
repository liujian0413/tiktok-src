package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ho */
final class C15740ho implements C15742hq<ami> {
    C15740ho() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        View view = (View) ami;
        DisplayMetrics a = acl.m45514a((WindowManager) ami.getContext().getSystemService("window"));
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        ami.mo39809a("locationReady", (Map<String, ?>) hashMap);
        acd.m45783e("GET LOCATION COMPILED");
    }
}
