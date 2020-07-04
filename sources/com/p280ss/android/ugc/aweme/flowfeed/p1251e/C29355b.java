package com.p280ss.android.ugc.aweme.flowfeed.p1251e;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.e.b */
final /* synthetic */ class C29355b implements OnClickListener {

    /* renamed from: a */
    private final C29351a f77379a;

    /* renamed from: b */
    private final Aweme f77380b;

    /* renamed from: c */
    private final List f77381c;

    C29355b(C29351a aVar, Aweme aweme, List list) {
        this.f77379a = aVar;
        this.f77380b = aweme;
        this.f77381c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f77379a.mo75062a(this.f77380b, this.f77381c, dialogInterface, i);
    }
}
