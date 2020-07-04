package com.p280ss.android.ugc.aweme.servicimpl;

import com.p280ss.android.ugc.aweme.tutorial.C42660a;
import com.p280ss.android.ugc.aweme.utils.C43119fc;
import com.p280ss.android.ugc.gamora.bottomtab.C43866b;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f.C43871a;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.c */
public final class C37465c implements C43867c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f97782a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37465c.class), "creationTutorialScene", "getCreationTutorialScene()Lcom/ss/android/ugc/aweme/tutorial/CreationTutorialScene;"))};

    /* renamed from: b */
    public C43868d f97783b;

    /* renamed from: c */
    private final C7541d f97784c = C7546e.m23569a(new C37467b(this));

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.c$a */
    public static final class C37466a implements C43870f {

        /* renamed from: a */
        final /* synthetic */ C43868d f97785a;

        C37466a(C43868d dVar) {
            this.f97785a = dVar;
        }

        /* renamed from: a */
        public final boolean mo94782a(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            ((RecordViewModel) C36113b.m116288a(this.f97785a.mo106145d()).mo91871a(RecordViewModel.class)).mo106846k(false);
            return false;
        }

        /* renamed from: b */
        public final boolean mo94783b(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            ((RecordViewModel) C36113b.m116288a(this.f97785a.mo106145d()).mo91871a(RecordViewModel.class)).mo106846k(true);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.c$b */
    static final class C37467b extends Lambda implements C7561a<C42660a> {

        /* renamed from: a */
        final /* synthetic */ C37465c f97786a;

        C37467b(C37465c cVar) {
            this.f97786a = cVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C42660a invoke() {
            return new C42660a(C37465c.m120132a(this.f97786a));
        }
    }

    /* renamed from: b */
    private final C42660a m120133b() {
        return (C42660a) this.f97784c.getValue();
    }

    public final C43869e bH_() {
        return m120133b();
    }

    /* renamed from: a */
    public final void mo94779a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        this.f97783b = dVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C43868d m120132a(C37465c cVar) {
        C43868d dVar = cVar.f97783b;
        if (dVar == null) {
            C7573i.m23583a("tabEnv");
        }
        return dVar;
    }

    /* renamed from: b */
    public final C43866b mo94780b(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        C43866b bVar = new C43866b(C43119fc.m136748a(R.string.alg), C43119fc.m136748a(R.string.dcn), "tutorial", false, new C37466a(dVar));
        bVar.f113641a = R.drawable.vh;
        return bVar;
    }
}
