package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import android.view.View;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.l */
public abstract class C28955l {

    /* renamed from: a */
    private final C28933a f76296a;

    /* renamed from: e */
    public Aweme f76297e;

    /* renamed from: f */
    public String f76298f;

    /* renamed from: a */
    public abstract void mo74231a(View view);

    /* renamed from: b */
    public void mo74232b(View view) {
        C7573i.m23587b(view, "v");
        mo74231a(view);
        this.f76296a.mo74230d();
    }

    public C28955l(C28933a aVar) {
        C7573i.m23587b(aVar, "actionsManager");
        this.f76296a = aVar;
        this.f76297e = aVar.f76271b;
        this.f76298f = aVar.f76272c;
    }
}
