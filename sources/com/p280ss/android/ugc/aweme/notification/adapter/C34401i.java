package com.p280ss.android.ugc.aweme.notification.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.i */
final /* synthetic */ class C34401i implements OnClickListener {

    /* renamed from: a */
    private final NotificationAdapter f89812a;

    /* renamed from: b */
    private final int f89813b;

    C34401i(NotificationAdapter notificationAdapter, int i) {
        this.f89812a = notificationAdapter;
        this.f89813b = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f89812a.mo87678a(this.f89813b, dialogInterface, i);
    }
}
