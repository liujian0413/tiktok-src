package com.p280ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p280ss.android.ugc.aweme.lego.C7152c;
import com.p280ss.android.ugc.aweme.lego.RequestType;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.e */
public final class C37245e implements C7152c {
    /* renamed from: a */
    public final RequestType mo18606a() {
        return RequestType.IDLE;
    }

    /* renamed from: a */
    public final void mo18607a(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        CommerceSettingsApi.m80553b();
    }
}
