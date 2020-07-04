package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.C1642a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.k */
final /* synthetic */ class C21874k implements OnClickListener {

    /* renamed from: a */
    static final OnClickListener f58575a = new C21874k();

    private C21874k() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a((Context) C21671bd.m72532b(), C1642a.m8034a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
    }
}
