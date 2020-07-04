package com.p280ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.trill.share.C45150i;
import com.p280ss.android.ugc.trill.share.SyncShareView;

/* renamed from: com.ss.android.ugc.aweme.share.n */
public final class C38246n {
    /* renamed from: a */
    public static C38247o m122183a(Context context, int i) {
        int i2 = 1;
        if (C37954a.m121244a()) {
            if (C6399b.m19946v() || C7212bb.m22493a()) {
                i2 = 0;
            }
            return new C45150i(context, i2);
        }
        if (C6399b.m19946v() || C7212bb.m22493a()) {
            i2 = 0;
        }
        return new SyncShareView(context, i2);
    }
}
