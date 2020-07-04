package com.p280ss.android.ugc.aweme.tools.mvtemplate.p1677c;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40832n;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.C42548k;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42537b;
import com.p280ss.android.ugc.aweme.utils.C43119fc;
import com.p280ss.android.ugc.gamora.bottomtab.C43866b;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f.C43871a;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
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

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.a */
public final class C42517a implements C43867c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f110564a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C42517a.class), "mvTemplateScene", "getMvTemplateScene()Lcom/ss/android/ugc/gamora/bottomtab/TabContentScene;"))};

    /* renamed from: b */
    public RecordMVViewModel f110565b;

    /* renamed from: c */
    public RecordStatusViewModel f110566c;

    /* renamed from: d */
    private final C7541d f110567d = C7546e.m23569a(C42519b.f110570a);

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.a$a */
    public static final class C42518a implements C43870f {

        /* renamed from: a */
        final /* synthetic */ C42517a f110568a;

        /* renamed from: b */
        final /* synthetic */ C43868d f110569b;

        C42518a(C42517a aVar, C43868d dVar) {
            this.f110568a = aVar;
            this.f110569b = dVar;
        }

        /* renamed from: b */
        public final boolean mo94783b(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            if (C42517a.m135127b(this.f110568a).mo29069f().f99782r != null) {
                C40832n nVar = (C40832n) this.f110569b.mo106154m().mo44946a();
                if (nVar != null) {
                    nVar.mo100424e();
                }
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo94782a(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            ((RecordViewModel) C36113b.m116288a(this.f110569b.mo106145d()).mo91871a(RecordViewModel.class)).mo106846k(false);
            ((RecordChooseMusicViewModel) C36113b.m116288a(this.f110569b.mo106145d()).mo91871a(RecordChooseMusicViewModel.class)).f114732d.setValue(null);
            C42517a.m135126a(this.f110568a).mo102542m().setValue(Boolean.valueOf(true));
            if (C42517a.m135127b(this.f110568a).mo29069f().f99782r != null) {
                C40832n nVar = (C40832n) this.f110569b.mo106154m().mo44946a();
                if (nVar != null) {
                    nVar.mo100423d();
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.c.a$b */
    static final class C42519b extends Lambda implements C7561a<C42548k> {

        /* renamed from: a */
        public static final C42519b f110570a = new C42519b();

        C42519b() {
            super(0);
        }

        /* renamed from: a */
        private static C42548k m135134a() {
            return new C42548k();
        }

        public final /* synthetic */ Object invoke() {
            return m135134a();
        }
    }

    /* renamed from: b */
    private final C43869e m135128b() {
        return (C43869e) this.f110567d.getValue();
    }

    public final C43869e bH_() {
        return m135128b();
    }

    /* renamed from: c */
    private final boolean m135129c() {
        if (!C42537b.m135184a()) {
            return false;
        }
        RecordMVViewModel recordMVViewModel = this.f110565b;
        if (recordMVViewModel == null) {
            C7573i.m23583a("mvViewModel");
        }
        if (!recordMVViewModel.mo29069f().mo96142d()) {
            RecordMVViewModel recordMVViewModel2 = this.f110565b;
            if (recordMVViewModel2 == null) {
                C7573i.m23583a("mvViewModel");
            }
            if (!recordMVViewModel2.mo29069f().mo96144e()) {
                RecordMVViewModel recordMVViewModel3 = this.f110565b;
                if (recordMVViewModel3 == null) {
                    C7573i.m23583a("mvViewModel");
                }
                if (recordMVViewModel3.f110511c == null) {
                    return false;
                }
                C42537b.m135192d("mv_reuse");
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordStatusViewModel m135126a(C42517a aVar) {
        RecordStatusViewModel recordStatusViewModel = aVar.f110566c;
        if (recordStatusViewModel == null) {
            C7573i.m23583a("recordStatusViewModel");
        }
        return recordStatusViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecordMVViewModel m135127b(C42517a aVar) {
        RecordMVViewModel recordMVViewModel = aVar.f110565b;
        if (recordMVViewModel == null) {
            C7573i.m23583a("mvViewModel");
        }
        return recordMVViewModel;
    }

    /* renamed from: b */
    public final C43866b mo94780b(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        C43866b bVar = new C43866b(C43119fc.m136748a(R.string.dcq), C43119fc.m136748a(R.string.dcr), "mv", m135129c(), new C42518a(this, dVar));
        return bVar;
    }

    /* renamed from: a */
    public final void mo94779a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        JediViewModel a = C36113b.m116288a(dVar.mo106145d()).mo91871a(RecordMVViewModel.class);
        C7573i.m23582a((Object) a, "JediViewModelProviders.o…dMVViewModel::class.java)");
        this.f110565b = (RecordMVViewModel) a;
        RecordMVViewModel recordMVViewModel = this.f110565b;
        if (recordMVViewModel == null) {
            C7573i.m23583a("mvViewModel");
        }
        recordMVViewModel.mo104070a(dVar.mo106146e());
        RecordMVViewModel recordMVViewModel2 = this.f110565b;
        if (recordMVViewModel2 == null) {
            C7573i.m23583a("mvViewModel");
        }
        recordMVViewModel2.f110511c = dVar.f113659m;
        C0063u a2 = C0069x.m159a(dVar.mo106145d()).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f110566c = (RecordStatusViewModel) a2;
    }
}
