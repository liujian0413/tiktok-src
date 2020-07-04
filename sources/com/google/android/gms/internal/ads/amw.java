package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class amw implements C15742hq<ami> {

    /* renamed from: a */
    private final /* synthetic */ amu f40745a;

    amw(amu amu) {
        this.f40745a = amu;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f40745a) {
                        if (this.f40745a.f40703D != parseInt) {
                            this.f40745a.f40703D = parseInt;
                            this.f40745a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    acd.m45780c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
