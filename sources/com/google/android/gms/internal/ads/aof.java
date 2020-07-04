package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

final class aof implements C15742hq<ami> {

    /* renamed from: a */
    private final /* synthetic */ aoe f40863a;

    aof(aoe aoe) {
        this.f40863a = aoe;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f40863a) {
                        if (this.f40863a.f40860x != parseInt) {
                            this.f40863a.f40860x = parseInt;
                            this.f40863a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    acd.m45780c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
