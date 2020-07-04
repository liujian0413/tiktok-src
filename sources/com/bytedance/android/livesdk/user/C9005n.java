package com.bytedance.android.livesdk.user;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.user.n */
final /* synthetic */ class C9005n implements OnClickListener {

    /* renamed from: a */
    private final String f24634a;

    /* renamed from: b */
    private final long f24635b;

    /* renamed from: c */
    private final String f24636c;

    /* renamed from: d */
    private final boolean f24637d;

    /* renamed from: e */
    private final String f24638e;

    /* renamed from: f */
    private final String f24639f;

    /* renamed from: g */
    private final OnClickListener f24640g;

    C9005n(String str, long j, String str2, boolean z, String str3, String str4, OnClickListener onClickListener) {
        this.f24634a = str;
        this.f24635b = j;
        this.f24636c = str2;
        this.f24637d = z;
        this.f24638e = str3;
        this.f24639f = str4;
        this.f24640g = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C8998l.m26897a(this.f24634a, this.f24635b, this.f24636c, this.f24637d, this.f24638e, this.f24639f, this.f24640g, dialogInterface, i);
    }
}
