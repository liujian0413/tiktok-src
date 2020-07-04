package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C7092b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bk */
final /* synthetic */ class C31900bk implements OnShowListener {

    /* renamed from: a */
    private final C7092b f83379a;

    private C31900bk(C7092b bVar) {
        this.f83379a = bVar;
    }

    /* renamed from: a */
    static OnShowListener m103632a(C7092b bVar) {
        return new C31900bk(bVar);
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f83379a.mo18352a(dialogInterface);
    }
}
