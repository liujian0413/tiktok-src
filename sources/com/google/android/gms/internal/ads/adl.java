package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final /* synthetic */ class adl implements OnClickListener {

    /* renamed from: a */
    private final adj f40041a;

    /* renamed from: b */
    private final int f40042b;

    /* renamed from: c */
    private final int f40043c;

    /* renamed from: d */
    private final int f40044d;

    adl(adj adj, int i, int i2, int i3) {
        this.f40041a = adj;
        this.f40042b = i;
        this.f40043c = i2;
        this.f40044d = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40041a.mo39214a(this.f40042b, this.f40043c, this.f40044d, dialogInterface, i);
    }
}
