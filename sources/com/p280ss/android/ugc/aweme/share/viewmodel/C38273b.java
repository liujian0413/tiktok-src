package com.p280ss.android.ugc.aweme.share.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0068c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.viewmodel.b */
public final class C38273b extends C0068c {

    /* renamed from: a */
    public FeedPanelStateViewModel f99470a;

    /* renamed from: a */
    public final <T extends C0063u> T mo149a(Class<T> cls) {
        C7573i.m23587b(cls, "modelClass");
        if (!C7573i.m23585a((Object) FeedPanelStateViewModel.class, (Object) cls)) {
            return super.mo149a(cls);
        }
        if (this.f99470a == null) {
            this.f99470a = (FeedPanelStateViewModel) super.mo149a(cls);
        }
        return (C0063u) this.f99470a;
    }
}
