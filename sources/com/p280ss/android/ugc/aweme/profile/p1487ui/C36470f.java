package com.p280ss.android.ugc.aweme.profile.p1487ui;

import com.p280ss.android.ugc.aweme.services.draft.IDraftService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.f */
final /* synthetic */ class C36470f implements Callable {

    /* renamed from: a */
    private final AwemeListFragmentImpl f95657a;

    /* renamed from: b */
    private final IDraftService f95658b;

    C36470f(AwemeListFragmentImpl awemeListFragmentImpl, IDraftService iDraftService) {
        this.f95657a = awemeListFragmentImpl;
        this.f95658b = iDraftService;
    }

    public final Object call() {
        return this.f95657a.mo91889a(this.f95658b);
    }
}
