package com.p280ss.android.ugc.gamora.recorder;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40304b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p280ss.android.ugc.aweme.shortvideo.widget.TabHost.C41670a;
import com.p280ss.android.ugc.aweme.tools.C42155av;
import com.p280ss.android.ugc.aweme.tools.C42156aw;
import com.p280ss.android.ugc.aweme.tools.C42343h;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.a */
public final class C44442a {

    /* renamed from: a */
    public static final C44442a f114701a = new C44442a();

    /* renamed from: b */
    private static final List<C44462c> f114702b = new ArrayList();

    /* renamed from: com.ss.android.ugc.gamora.recorder.a$a */
    static final class C44443a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f114703a;

        /* renamed from: b */
        final /* synthetic */ C39382ed f114704b;

        /* renamed from: c */
        final /* synthetic */ TabHost f114705c;

        C44443a(String str, C39382ed edVar, TabHost tabHost) {
            this.f114703a = str;
            this.f114704b = edVar;
            this.f114705c = tabHost;
        }

        public final void run() {
            C41530am.m132280a("BottomTabPresenter dispatchEvent BottomTabIndexChangeEvent");
            C42343h hVar = new C42343h(null, this.f114703a);
            hVar.f110141c = true;
            C42155av avVar = hVar;
            this.f114704b.mo97963P().mo103594a((Object) this.f114705c, avVar);
            C42156aw J = this.f114704b.mo97896J();
            if (J == null) {
                C7573i.m23580a();
            }
            J.mo103594a((Object) this.f114705c, avVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.a$b */
    static final class C44444b implements C41670a {

        /* renamed from: a */
        final /* synthetic */ TabHost f114706a;

        /* renamed from: b */
        final /* synthetic */ C39382ed f114707b;

        C44444b(TabHost tabHost, C39382ed edVar) {
            this.f114706a = tabHost;
            this.f114707b = edVar;
        }

        /* renamed from: a */
        public final void mo102409a(int i, int i2) {
            C42155av hVar = new C42343h(this.f114706a.mo102391a(i), this.f114706a.mo102391a(i2));
            this.f114707b.mo97963P().mo103594a((Object) this.f114706a, hVar);
            C42156aw J = this.f114707b.mo97896J();
            if (J == null) {
                C7573i.m23580a();
            }
            J.mo103594a((Object) this.f114706a, hVar);
        }
    }

    private C44442a() {
    }

    /* renamed from: a */
    public static List<C44462c> m140572a() {
        return f114702b;
    }

    /* renamed from: b */
    public static void m140575b() {
        f114702b.clear();
    }

    /* renamed from: a */
    private static void m140573a(C39382ed edVar, TabHost tabHost) {
        tabHost.setOnIndexChangedListener(new C44444b(tabHost, edVar));
    }

    /* renamed from: a */
    public static void m140574a(C43868d dVar, List<? extends C43867c> list) {
        C7573i.m23587b(dVar, "recordEnv");
        C7573i.m23587b(list, "bottomModules");
        f114702b.clear();
        for (C43867c cVar : list) {
            cVar.mo94779a(dVar);
            f114702b.add(new C44462c(cVar.mo94780b(dVar), cVar.bH_()));
        }
    }

    /* renamed from: a */
    public static C40304b m140570a(TabHost tabHost, ShortVideoContext shortVideoContext) {
        C7573i.m23587b(tabHost, "bottomTabHost");
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        C40304b bVar = new C40304b(tabHost, shortVideoContext);
        if (C43057di.m136601a(tabHost.getContext())) {
            for (C44462c cVar : C7525m.m23485d(f114702b)) {
                bVar.mo100129a(-1, cVar.f114729b.f113642b, cVar.f114729b.f113641a, cVar.f114729b.f113643c);
            }
        } else {
            for (C44462c cVar2 : f114702b) {
                bVar.mo100129a(-1, cVar2.f114729b.f113642b, cVar2.f114729b.f113641a, cVar2.f114729b.f113643c);
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public static C44462c m140571a(C43868d dVar, int i, C43867c cVar) {
        C7573i.m23587b(dVar, "recordEnv");
        C7573i.m23587b(cVar, "bottomTabModule");
        cVar.mo94779a(dVar);
        C44462c cVar2 = new C44462c(cVar.mo94780b(dVar), cVar.bH_());
        f114702b.add(i, cVar2);
        return cVar2;
    }

    /* renamed from: a */
    public final void mo106888a(C39382ed edVar, ShortVideoContext shortVideoContext, TabHost tabHost, C40304b bVar) {
        boolean z;
        C7573i.m23587b(edVar, "mOwner");
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        C7573i.m23587b(tabHost, "bottomTabHost");
        C7573i.m23587b(bVar, "tabConfigure");
        String a = C44461b.m140633a(shortVideoContext, C44461b.m140632a(shortVideoContext));
        int a2 = bVar.mo100128a(a);
        if (!C6399b.m19946v() || !shortVideoContext.f99764ay) {
            z = false;
        } else {
            z = true;
            m140573a(edVar, tabHost);
        }
        tabHost.setIndexWithoutAnim(a2);
        new SafeHandler(edVar).post(new C44443a(a, edVar, tabHost));
        if (!z) {
            m140573a(edVar, tabHost);
        }
    }
}
