package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.adm */
final /* synthetic */ class C15471adm implements OnClickListener {

    /* renamed from: a */
    private final adj f40045a;

    /* renamed from: b */
    private final String f40046b;

    C15471adm(adj adj, String str) {
        this.f40045a = adj;
        this.f40046b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40045a.mo39216a(this.f40046b, dialogInterface, i);
    }
}
