package com.p280ss.android.ugc.aweme.comment;

import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;

/* renamed from: com.ss.android.ugc.aweme.comment.i */
final /* synthetic */ class C24170i implements C6892b {

    /* renamed from: a */
    private final C24093d f63843a;

    /* renamed from: b */
    private final Aweme f63844b;

    /* renamed from: c */
    private final IIMService f63845c;

    /* renamed from: d */
    private final IMContact f63846d;

    C24170i(C24093d dVar, Aweme aweme, IIMService iIMService, IMContact iMContact) {
        this.f63843a = dVar;
        this.f63844b = aweme;
        this.f63845c = iIMService;
        this.f63846d = iMContact;
    }

    public final void run(Object obj) {
        this.f63843a.mo62472a(this.f63844b, this.f63845c, this.f63846d, (Boolean) obj);
    }
}
