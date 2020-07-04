package com.bytedance.android.livesdk.kickout.p400ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.live.base.model.user.User;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.kickout.ui.c */
final /* synthetic */ class C8377c implements OnClickListener {

    /* renamed from: a */
    private final BannedViewHolder f22963a;

    /* renamed from: b */
    private final Map f22964b;

    /* renamed from: c */
    private final String f22965c;

    /* renamed from: d */
    private final User f22966d;

    C8377c(BannedViewHolder bannedViewHolder, Map map, String str, User user) {
        this.f22963a = bannedViewHolder;
        this.f22964b = map;
        this.f22965c = str;
        this.f22966d = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f22963a.mo21528a(this.f22964b, this.f22965c, this.f22966d, dialogInterface, i);
    }
}
