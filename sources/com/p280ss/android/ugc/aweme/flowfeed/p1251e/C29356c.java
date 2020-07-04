package com.p280ss.android.ugc.aweme.flowfeed.p1251e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.e.c */
final /* synthetic */ class C29356c implements OnClickListener {

    /* renamed from: a */
    private final C29351a f77382a;

    /* renamed from: b */
    private final User f77383b;

    /* renamed from: c */
    private final List f77384c;

    C29356c(C29351a aVar, User user, List list) {
        this.f77382a = aVar;
        this.f77383b = user;
        this.f77384c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f77382a.mo75065a(this.f77383b, this.f77384c, dialogInterface, i);
    }
}
