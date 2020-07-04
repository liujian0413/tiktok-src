package com.p280ss.android.ugc.aweme.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

/* renamed from: com.ss.android.ugc.aweme.app.x */
final /* synthetic */ class C23064x implements OnClickListener {

    /* renamed from: a */
    private final DeepLinkHandlerActivity f60881a;

    /* renamed from: b */
    private final boolean f60882b;

    /* renamed from: c */
    private final Intent f60883c;

    C23064x(DeepLinkHandlerActivity deepLinkHandlerActivity, boolean z, Intent intent) {
        this.f60881a = deepLinkHandlerActivity;
        this.f60882b = z;
        this.f60883c = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f60881a.mo59399a(this.f60882b, this.f60883c, dialogInterface, i);
    }
}
