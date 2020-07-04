package com.bytedance.android.live.core.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.live.core.setting.j */
final /* synthetic */ class C3336j implements OnClickListener {

    /* renamed from: a */
    private final C33231 f10087a;

    /* renamed from: b */
    private final String[] f10088b;

    /* renamed from: c */
    private final C3338l f10089c;

    /* renamed from: d */
    private final int f10090d;

    C3336j(C33231 r1, String[] strArr, C3338l lVar, int i) {
        this.f10087a = r1;
        this.f10088b = strArr;
        this.f10089c = lVar;
        this.f10090d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f10087a.mo10228a(this.f10088b, this.f10089c, this.f10090d, dialogInterface, i);
    }
}
