package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.ao */
final /* synthetic */ class C36516ao implements OnDismissListener {

    /* renamed from: a */
    private final C36492ag f95884a;

    /* renamed from: b */
    private final FollowStatus f95885b;

    /* renamed from: c */
    private final boolean f95886c;

    C36516ao(C36492ag agVar, FollowStatus followStatus, boolean z) {
        this.f95884a = agVar;
        this.f95885b = followStatus;
        this.f95886c = z;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f95884a.mo92696a(this.f95885b, this.f95886c, dialogInterface);
    }
}
