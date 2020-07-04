package com.p280ss.android.ugc.aweme.account.login.p957c;

import android.content.Context;
import android.os.Message;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.mobilelib.model.MobileStateModel;
import com.p280ss.android.mobilelib.present.CommonPresent;
import com.p280ss.android.mobilelib.view.CommonView;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.c */
public abstract class C21354c extends CommonPresent {

    /* renamed from: a */
    protected final MobileStateModel f57346a = MobileStateModel.INSTANCE;

    /* renamed from: a */
    public abstract void mo57435a(String str, String str2, C12855p pVar);

    /* renamed from: b */
    public abstract void mo57437b(String str, String str2, C12855p pVar);

    public void destroy() {
        super.destroy();
        this.f57346a.setRetryTime(-1);
        this.f57346a.setLastSendTime(0);
    }

    public void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public C21354c(Context context, CommonView commonView) {
        super(context, commonView);
    }
}
