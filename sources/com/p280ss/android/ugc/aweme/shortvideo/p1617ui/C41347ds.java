package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ds */
final /* synthetic */ class C41347ds implements OnClickListener {

    /* renamed from: a */
    private final Context f107620a;

    /* renamed from: b */
    private final Intent f107621b;

    C41347ds(Context context, Intent intent) {
        this.f107620a = context;
        this.f107621b = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f107620a.startActivity(this.f107621b);
    }
}
