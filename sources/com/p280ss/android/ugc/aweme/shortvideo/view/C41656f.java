package com.p280ss.android.ugc.aweme.shortvideo.view;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.f */
public final class C41656f implements C43346d {

    /* renamed from: a */
    private boolean f108255a;

    public C41656f(boolean z) {
        this.f108255a = z;
    }

    /* renamed from: a */
    public final boolean mo102311a(TextExtraStruct textExtraStruct) {
        if (C6399b.m19944t() || this.f108255a || textExtraStruct.getType() != 1) {
            return false;
        }
        return true;
    }
}
