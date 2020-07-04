package com.p280ss.android.ugc.aweme.following.p1265ui.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.e */
final /* synthetic */ class C29752e implements OnClickListener {

    /* renamed from: a */
    private final ViewHolder f78283a;

    /* renamed from: b */
    private final User f78284b;

    C29752e(ViewHolder viewHolder, User user) {
        this.f78283a = viewHolder;
        this.f78284b = user;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f78283a.mo75724a(this.f78284b, dialogInterface, i);
    }
}
