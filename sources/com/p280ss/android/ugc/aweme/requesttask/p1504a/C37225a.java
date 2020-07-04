package com.p280ss.android.ugc.aweme.requesttask.p1504a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.a.a */
public final class C37225a implements C7152c {
    /* renamed from: a */
    public final RequestType mo18606a() {
        if (C30553b.m99810g().canFetchFollowListIdle()) {
            return RequestType.IDLE;
        }
        return RequestType.NORMAL;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        C30553b.m99810g().fetchFollowList();
    }
}
