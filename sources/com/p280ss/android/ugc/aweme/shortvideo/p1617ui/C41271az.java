package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.az */
final /* synthetic */ class C41271az implements Runnable {

    /* renamed from: a */
    private final PermissionSettingItem f107520a;

    /* renamed from: b */
    private final Activity f107521b;

    /* renamed from: c */
    private final C23339g f107522c;

    /* renamed from: d */
    private final String f107523d;

    C41271az(PermissionSettingItem permissionSettingItem, Activity activity, C23339g gVar, String str) {
        this.f107520a = permissionSettingItem;
        this.f107521b = activity;
        this.f107522c = gVar;
        this.f107523d = str;
    }

    public final void run() {
        VideoPublishFragment.m131454a(this.f107520a, this.f107521b, this.f107522c, this.f107523d);
    }
}
