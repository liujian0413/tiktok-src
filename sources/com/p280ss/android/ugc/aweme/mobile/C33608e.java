package com.p280ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import com.p280ss.android.ugc.aweme.mobile.C33606d.C33607a;

/* renamed from: com.ss.android.ugc.aweme.mobile.e */
final /* synthetic */ class C33608e implements OnShowListener {

    /* renamed from: a */
    private final C33606d f87725a;

    /* renamed from: b */
    private final Activity f87726b;

    /* renamed from: c */
    private final C33607a f87727c;

    C33608e(C33606d dVar, Activity activity, C33607a aVar) {
        this.f87725a = dVar;
        this.f87726b = activity;
        this.f87727c = aVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f87725a.mo85940a(this.f87726b, this.f87727c, dialogInterface);
    }
}
