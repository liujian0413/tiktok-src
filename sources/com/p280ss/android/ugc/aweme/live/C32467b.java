package com.p280ss.android.ugc.aweme.live;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.live.b */
final /* synthetic */ class C32467b implements OnClickListener {

    /* renamed from: a */
    private final Context f84708a;

    /* renamed from: b */
    private final long f84709b;

    /* renamed from: c */
    private final String f84710c;

    /* renamed from: d */
    private final Bundle f84711d;

    /* renamed from: e */
    private final String f84712e;

    /* renamed from: f */
    private final List f84713f;

    C32467b(Context context, long j, String str, Bundle bundle, String str2, List list) {
        this.f84708a = context;
        this.f84709b = j;
        this.f84710c = str;
        this.f84711d = bundle;
        this.f84712e = str2;
        this.f84713f = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C32430a.m105058a(this.f84708a, this.f84709b, this.f84710c, this.f84711d, this.f84712e, this.f84713f, dialogInterface, i);
    }
}
