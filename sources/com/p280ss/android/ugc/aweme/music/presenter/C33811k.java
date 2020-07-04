package com.p280ss.android.ugc.aweme.music.presenter;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.k */
final /* synthetic */ class C33811k implements C7563m {

    /* renamed from: a */
    static final C7563m f88189a = new C33811k();

    private C33811k() {
    }

    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(TextUtils.equals(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }
}
