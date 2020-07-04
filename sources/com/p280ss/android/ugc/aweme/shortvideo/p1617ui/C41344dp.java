package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dp */
final /* synthetic */ class C41344dp implements Callable {

    /* renamed from: a */
    private final Map f107611a;

    /* renamed from: b */
    private final String f107612b;

    /* renamed from: c */
    private final C1606i f107613c;

    /* renamed from: d */
    private final C41653c f107614d;

    /* renamed from: e */
    private final Context f107615e;

    C41344dp(Map map, String str, C1606i iVar, C41653c cVar, Context context) {
        this.f107611a = map;
        this.f107612b = str;
        this.f107613c = iVar;
        this.f107614d = cVar;
        this.f107615e = context;
    }

    public final Object call() {
        return VideoRecordPermissionActivity.m131758a(this.f107611a, this.f107612b, this.f107613c, this.f107614d, this.f107615e);
    }
}
