package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import java.io.File;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7495v;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.t */
final /* synthetic */ class C4207t implements C7495v {

    /* renamed from: a */
    private final C41997 f12306a;

    /* renamed from: b */
    private final File f12307b;

    /* renamed from: c */
    private final String f12308c;

    C4207t(C41997 r1, File file, String str) {
        this.f12306a = r1;
        this.f12307b = file;
        this.f12308c = str;
    }

    public final void subscribe(C47870u uVar) {
        this.f12306a.mo11738a(this.f12307b, this.f12308c, uVar);
    }
}
