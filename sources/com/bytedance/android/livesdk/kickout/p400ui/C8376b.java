package com.bytedance.android.livesdk.kickout.p400ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.kickout.ui.b */
final /* synthetic */ class C8376b implements OnClickListener {

    /* renamed from: a */
    private final BannedViewHolder f22961a;

    /* renamed from: b */
    private final Map f22962b;

    C8376b(BannedViewHolder bannedViewHolder, Map map) {
        this.f22961a = bannedViewHolder;
        this.f22962b = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f22961a.mo21527a(this.f22962b, dialogInterface, i);
    }
}
