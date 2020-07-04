package com.p280ss.android.ttvecamera.p917d;

import android.content.Context;
import com.p280ss.android.ttvecamera.p916c.C20586c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.d.d */
public final class C20591d extends C20590c {

    /* renamed from: c */
    private static String f55631c = ((String) C20586c.m68163a("android.os.SystemProperties", "get", (Object[]) new String[]{"ro.mediatek.platform"}));

    /* renamed from: d */
    private static List<String> f55632d = new ArrayList();

    static {
        Collections.addAll(f55632d, new String[]{"MT6571", "MT6595", "MT6795", "MT6572", "MT6752", "MT6582", "MT6735", "MT6592", "MT6753", "MT6589", "MT6755", "MT6735m", "MT6737T", "MT6580", "MT6750", "MT6750S", "MT6737", "MT6739", "MT6570", "MT6761"});
    }

    public C20591d(Context context) {
        super(context);
    }
}
