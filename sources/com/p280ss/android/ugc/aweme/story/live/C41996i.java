package com.p280ss.android.ugc.aweme.story.live;

import android.content.Context;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.story.live.i */
public final class C41996i implements NoticeLiveServiceAdapter {
    public final boolean hasLivePermission() {
        return C41990e.m133510c();
    }

    public final void setLivePermission(boolean z) {
        C41990e.m133507b(z);
    }

    public final void enterLiveConverge(Context context, Bundle bundle) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bundle, "bundle");
        C41990e.m133500a(context, bundle);
    }
}
