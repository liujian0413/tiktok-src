package com.p280ss.android.ugc.gamora.recorder;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.framwork.core.p517a.p522e.C10231c;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11673w;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12675t;
import com.bytedance.scene.group.C12604b;
import com.bytedance.scene.ktx.C12636a;
import com.bytedance.scene.navigation.C12648d;
import com.bytedance.scene.p639a.C12565c;
import com.bytedance.scene.p639a.p640a.C12559b;
import com.bytedance.scene.p642b.C12586e.C12588a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.p1578i.C39998a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordNewActivity;
import com.p280ss.android.ugc.aweme.shortvideo.toolbar.RecordSimplifyConfigViewModel.C41121a;
import com.p280ss.android.ugc.aweme.status.C41811c;
import com.p280ss.android.ugc.aweme.status.RecordStatusViewModel;
import com.p280ss.android.ugc.aweme.tools.C42581q;
import com.p280ss.android.ugc.aweme.utils.C43119fc;
import com.p280ss.android.ugc.gamora.bottomtab.C43865a;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.integration.IIntegrationService;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.C44507l;
import com.p280ss.android.ugc.gamora.recorder.control.C44535a;
import com.p280ss.android.ugc.gamora.recorder.control.C44579s;
import com.p280ss.android.ugc.gamora.recorder.countdown.C44600a;
import com.p280ss.android.ugc.gamora.recorder.exit.C44631c;
import com.p280ss.android.ugc.gamora.recorder.exit.RecordExitViewModel;
import com.p280ss.android.ugc.gamora.recorder.musiccut.C44692b;
import com.p280ss.android.ugc.gamora.recorder.progress.C44705a;
import com.p280ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44782d;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44786f;
import com.p280ss.android.ugc.gamora.recorder.toolbar.C44802h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.g */
public final class C44643g extends C12604b implements C44396a {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f114989j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44643g.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;"))};

    /* renamed from: o */
    public static final C44644a f114990o = new C44644a(null);

    /* renamed from: k */
    public SafeHandler f114991k;

    /* renamed from: l */
    public C43868d f114992l;

    /* renamed from: m */
    public C44452af f114993m;

    /* renamed from: n */
    public C41811c f114994n;

    /* renamed from: p */
    private C39382ed f114995p;

    /* renamed from: q */
    private final C7541d f114996q;

    /* renamed from: r */
    private RecordStatusViewModel f114997r;

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$a */
    public static final class C44644a {
        private C44644a() {
        }

        public /* synthetic */ C44644a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$b */
    static final class C44645b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44643g f114998a;

        /* renamed from: b */
        final /* synthetic */ C44462c f114999b;

        C44645b(C44643g gVar, C44462c cVar) {
            this.f114998a = gVar;
            this.f114999b = cVar;
        }

        public final void run() {
            C12629j a = this.f114998a.mo30924a("RecordBottomTabScene");
            if (a == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) a, "findSceneByTag<RecordBot…cordBottomTabScene.TAG)!!");
            C44820v vVar = (C44820v) a;
            int a2 = vVar.mo107263a((Object) this.f114999b.f114729b.f113643c);
            if (a2 > 0) {
                vVar.mo107265a(a2, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$c */
    static final class C44646c extends Lambda implements C7563m<C44396a, C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115000a;

        C44646c(C44643g gVar) {
            this.f115000a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141036a((C44396a) obj, (C7581n) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141036a(C44396a aVar, C7581n nVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(nVar, "it");
            C12629j a = this.f115000a.mo30924a("RecordFilterScene");
            if (a == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) a, "findSceneByTag<RecordFil…(RecordFilterScene.TAG)!!");
            ((C44830z) a).mo107271a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$d */
    static final class C44647d extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115001a;

        C44647d(C44643g gVar) {
            this.f115001a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141037a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141037a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            if (i == 0) {
                C12636a.m36710a(this.f115001a, "RecordBottomTabScene");
            } else {
                C12636a.m36711b(this.f115001a, "RecordBottomTabScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$e */
    static final class C44648e extends Lambda implements C7563m<C44396a, C43865a, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115002a;

        C44648e(C44643g gVar) {
            this.f115002a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141038a((C44396a) obj, (C43865a) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141038a(C44396a aVar, C43865a aVar2) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(aVar2, "it");
            if (C44665h.f115021a[aVar2.f113637a.ordinal()] == 1) {
                this.f115002a.mo107083a(C44643g.m141010b(this.f115002a), aVar2.f113638b, aVar2.f113639c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$f */
    static final class C44649f extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115003a;

        C44649f(C44643g gVar) {
            this.f115003a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141039a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141039a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            C12629j a = this.f115003a.mo30924a("RecordChooseMusicScene");
            if (a != null) {
                if (z) {
                    this.f115003a.mo30945d(a);
                } else {
                    this.f115003a.mo30940c(a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$g */
    static final class C44650g extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115004a;

        C44650g(C44643g gVar) {
            this.f115004a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141040a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141040a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                C12636a.m36710a(this.f115004a, "RecordExitScene");
            } else {
                C12636a.m36711b(this.f115004a, "RecordExitScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$h */
    static final class C44651h extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115005a;

        C44651h(C44643g gVar) {
            this.f115005a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141041a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141041a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                C12636a.m36710a(this.f115005a, "RecordProgressScene");
            } else {
                C12636a.m36711b(this.f115005a, "RecordProgressScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$i */
    static final class C44652i extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115006a;

        C44652i(C44643g gVar) {
            this.f115006a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141042a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141042a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            if (i == 0) {
                this.f115006a.mo96987K().mo106892a();
            } else {
                this.f115006a.mo96987K().mo106893b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$j */
    static final class C44653j extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115007a;

        C44653j(C44643g gVar) {
            this.f115007a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141043a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141043a(C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                C12648d y = this.f115007a.mo31018y();
                C7573i.m23582a((Object) y, "requireNavigationScene()");
                if (!C37299a.m119793a(y, C44692b.class)) {
                    this.f115007a.mo31018y().mo31063a(C44692b.class);
                    C12648d y2 = this.f115007a.mo31018y();
                    C7573i.m23582a((Object) y2, "requireNavigationScene()");
                    C37299a.m119790a(y2, C44692b.class, (C7561a<C7581n>) new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44653j f115008a;

                        {
                            this.f115008a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m141044a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m141044a() {
                            this.f115008a.f115007a.mo107082J().mo106838c(false);
                        }
                    });
                    return;
                }
            }
            C12648d y3 = this.f115007a.mo31018y();
            C7573i.m23582a((Object) y3, "requireNavigationScene()");
            if (C37299a.m119793a(y3, C44692b.class)) {
                this.f115007a.mo31018y().mo31069b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$k */
    static final class C44655k extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115009a;

        C44655k(C44643g gVar) {
            this.f115009a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141045a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141045a(final C44396a aVar, boolean z) {
            C7573i.m23587b(aVar, "$receiver");
            if (z) {
                C12648d y = this.f115009a.mo31018y();
                C7573i.m23582a((Object) y, "requireNavigationScene()");
                if (!C37299a.m119793a(y, C44600a.class)) {
                    this.f115009a.mo31018y().mo31065a(C44600a.class, (Bundle) null, new C12588a().mo30862a(true).mo30860a((C12565c) new C12559b()).mo30863a());
                    C12648d y2 = this.f115009a.mo31018y();
                    C7573i.m23582a((Object) y2, "requireNavigationScene()");
                    C37299a.m119790a(y2, C44600a.class, (C7561a<C7581n>) new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C44655k f115010a;

                        /* renamed from: com.ss.android.ugc.gamora.recorder.g$k$1$a */
                        static final class C44657a extends Lambda implements C7562b<RecordViewState, RecordViewState> {

                            /* renamed from: a */
                            public static final C44657a f115012a = new C44657a();

                            C44657a() {
                                super(1);
                            }

                            /* renamed from: a */
                            private static RecordViewState m141047a(RecordViewState recordViewState) {
                                C7573i.m23587b(recordViewState, "it");
                                return recordViewState;
                            }

                            public final /* synthetic */ Object invoke(Object obj) {
                                return m141047a((RecordViewState) obj);
                            }
                        }

                        {
                            this.f115010a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m141046a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m141046a() {
                            if (!C7573i.m23585a((Object) ((RecordViewState) aVar.mo29066a(this.f115010a.f115009a.mo107082J(), C44657a.f115012a)).getCountDown(), (Object) Boolean.valueOf(false))) {
                                this.f115010a.f115009a.mo107082J().mo106841f(false);
                            }
                        }
                    });
                    return;
                }
            }
            C12648d y3 = this.f115009a.mo31018y();
            C7573i.m23582a((Object) y3, "requireNavigationScene()");
            if (C37299a.m119793a(y3, C44600a.class)) {
                this.f115009a.mo31018y().mo31069b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$l */
    static final class C44658l extends Lambda implements C7563m<C44396a, C42581q, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115013a;

        C44658l(C44643g gVar) {
            this.f115013a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141048a((C44396a) obj, (C42581q) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141048a(C44396a aVar, C42581q qVar) {
            C7573i.m23587b(aVar, "$receiver");
            C7573i.m23587b(qVar, "it");
            if (qVar.f110727a == 0) {
                this.f115013a.mo96987K().mo106894c();
            } else {
                this.f115013a.mo96987K().mo106895d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$m */
    static final class C44659m<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115014a;

        /* renamed from: b */
        final /* synthetic */ C44462c f115015b;

        C44659m(C44643g gVar, C44462c cVar) {
            this.f115014a = gVar;
            this.f115015b = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null && this.f115015b.f114730c != null) {
                if (bool.booleanValue()) {
                    if (C39805en.m127445a() && C7573i.m23585a((Object) this.f115015b.f114730c.bQ_(), (Object) "RecordLiveScene")) {
                        if (!this.f115015b.f114730c.mo30922I()) {
                            Activity activity = this.f115014a.f33526d_;
                            if (activity != null) {
                                ((VideoRecordNewActivity) activity).mo101830a(true, false);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                            }
                        } else {
                            Activity activity2 = this.f115014a.f33526d_;
                            if (activity2 != null) {
                                ((VideoRecordNewActivity) activity2).f107279T = true;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                            }
                        }
                        if (C44643g.m141003L() && C44643g.m141004M()) {
                            this.f115014a.mo107082J().mo106832a(Integer.valueOf(-1));
                        }
                    }
                    this.f115014a.mo30945d((C12629j) this.f115015b.f114730c);
                    this.f115015b.f114730c.bR_();
                    return;
                }
                if (C39805en.m127445a() && C7573i.m23585a((Object) this.f115015b.f114730c.bQ_(), (Object) "RecordLiveScene") && !this.f115015b.f114730c.mo30922I()) {
                    Activity activity3 = this.f115014a.f33526d_;
                    if (activity3 != null) {
                        ((VideoRecordNewActivity) activity3).mo101830a(false, true);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                    }
                }
                this.f115015b.f114730c.bS_();
                this.f115014a.mo30940c((C12629j) this.f115015b.f114730c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$n */
    static final class C44660n extends Lambda implements C7563m<C44396a, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115016a;

        C44660n(C44643g gVar) {
            this.f115016a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141050a((C44396a) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141050a(C44396a aVar, int i) {
            C7573i.m23587b(aVar, "$receiver");
            C12629j a = this.f115016a.mo30924a("RecordBottomTabScene");
            if (a == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) a, "findSceneByTag<RecordBot…cordBottomTabScene.TAG)!!");
            C44820v vVar = (C44820v) a;
            if (i == -1) {
                vVar.mo107267a(C43119fc.m136748a(R.string.dcp));
                return;
            }
            if (!C7573i.m23585a((Object) C43119fc.m136748a(R.string.dcp), vVar.mo30920G())) {
                if (i == 1) {
                    vVar.mo107268a(C43119fc.m136748a(R.string.dcp), C43119fc.m136748a(R.string.ti));
                } else if (i == 2) {
                    vVar.mo107268a(C43119fc.m136748a(R.string.dcp), C43119fc.m136748a(R.string.dh2));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$o */
    static final class C44661o extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115017a;

        C44661o(C44643g gVar) {
            this.f115017a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141051a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141051a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                C12636a.m36710a(this.f115017a, "RecordExitScene");
            } else {
                C12636a.m36711b(this.f115017a, "RecordExitScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$p */
    static final class C44662p extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115018a;

        C44662p(C44643g gVar) {
            this.f115018a = gVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141052a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141052a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                C12636a.m36710a(this.f115018a, "RecordProgressScene");
            } else {
                C12636a.m36711b(this.f115018a, "RecordProgressScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.g$q */
    static final class C44663q<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C44643g f115019a;

        C44663q(C44643g gVar) {
            this.f115019a = gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            C44643g.m141007a(this.f115019a).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44663q f115020a;

                {
                    this.f115020a = r1;
                }

                public final void run() {
                    if (this.f115020a.f115019a.f33526d_ != null) {
                        C44643g gVar = this.f115020a.f115019a;
                        Activity activity = this.f115020a.f115019a.f33526d_;
                        if (activity != null) {
                            C12629j a = gVar.mo30924a(((FragmentActivity) activity).getString(R.string.dcw));
                            if (a == null) {
                                C7573i.m23580a();
                            }
                            C7573i.m23582a((Object) a, "findSceneByTag<RecordBot…ecord_mode_status_tag))!!");
                            C44820v vVar = (C44820v) a;
                            Activity activity2 = this.f115020a.f115019a.f33526d_;
                            if (activity2 != null) {
                                String string = ((FragmentActivity) activity2).getString(R.string.dcw);
                                C7573i.m23582a((Object) string, "(activity as FragmentAct…g.record_mode_status_tag)");
                                int a2 = vVar.mo107263a((Object) string);
                                if (a2 >= 0) {
                                    vVar.mo107265a(a2, false);
                                }
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
            });
        }
    }

    /* renamed from: J */
    public final RecordViewModel mo107082J() {
        return (RecordViewModel) this.f114996q.getValue();
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo107083a(C43868d dVar, int i, C43867c cVar) {
        Object obj;
        Iterator it = C44442a.m140572a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C7573i.m23585a((Object) ((C44462c) obj).f114729b.f113643c, (Object) cVar.mo94780b(dVar).f113643c)) {
                break;
            }
        }
        if (((C44462c) obj) == null) {
            C44462c a = C44442a.m140571a(dVar, i, cVar);
            m141011b(a);
            C12629j a2 = mo30924a("RecordBottomTabScene");
            if (a2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) a2, "findSceneByTag<RecordBot…cordBottomTabScene.TAG)!!");
            ((C44820v) a2).mo107264a(i, a.f114729b.f113642b, a.f114729b.f113643c);
            C43869e eVar = a.f114730c;
            if (eVar != null) {
                C12636a.m36709a(this, R.id.cpz, eVar, eVar.bQ_());
            }
            if (a.f114729b.f113645e) {
                m141009a(a);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        C44442a.m140575b();
    }

    /* renamed from: K */
    public final C44452af mo96987K() {
        C44452af afVar = this.f114993m;
        if (afVar == null) {
            C7573i.m23583a("speedCommerceMediator");
        }
        return afVar;
    }

    public C44643g() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f114996q = C7546e.m23569a(new NormalGroupScene$$special$$inlined$activityViewModel$1(this, a, a));
    }

    /* renamed from: I */
    public final void mo30922I() {
        super.mo30922I();
        IIntegrationService iIntegrationService = C35563c.f93229K;
        C43868d dVar = this.f114992l;
        if (dVar == null) {
            C7573i.m23583a("recordEnv");
        }
        iIntegrationService.onPostSceneCreated(dVar, this);
        m141005N();
    }

    /* renamed from: L */
    public static boolean m141003L() {
        String str;
        boolean z = false;
        if (C10231c.m30354a(C44442a.m140572a())) {
            return false;
        }
        for (C44462c cVar : C44442a.m140572a()) {
            String str2 = "RecordLiveScene";
            C43869e eVar = cVar.f114730c;
            if (eVar != null) {
                str = eVar.bQ_();
            } else {
                str = null;
            }
            if (C7573i.m23585a((Object) str2, (Object) str)) {
                z = cVar.f114730c.mo103835J();
            }
        }
        return z;
    }

    /* renamed from: M */
    public static boolean m141004M() {
        String str;
        boolean z = false;
        if (C10231c.m30354a(C44442a.m140572a())) {
            return false;
        }
        for (C44462c cVar : C44442a.m140572a()) {
            String str2 = "RecordLiveScene";
            C43869e eVar = cVar.f114730c;
            if (eVar != null) {
                str = eVar.bQ_();
            } else {
                str = null;
            }
            if (C7573i.m23585a((Object) str2, (Object) str)) {
                z = cVar.f114730c.mo96987K();
            }
        }
        return z;
    }

    /* renamed from: N */
    private final void m141005N() {
        C43868d dVar = this.f114992l;
        if (dVar == null) {
            C7573i.m23583a("recordEnv");
        }
        if (C39998a.m127887a(dVar.mo106146e().f99764ay, m141003L())) {
            mo91868b(mo107082J(), C44721s.f115099a, C11673w.m34161b(true), new C44660n(this));
        }
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ SafeHandler m141007a(C44643g gVar) {
        SafeHandler safeHandler = gVar.f114991k;
        if (safeHandler == null) {
            C7573i.m23583a("safeHandler");
        }
        return safeHandler;
    }

    /* renamed from: b */
    public static final /* synthetic */ C43868d m141010b(C44643g gVar) {
        C43868d dVar = gVar.f114992l;
        if (dVar == null) {
            C7573i.m23583a("recordEnv");
        }
        return dVar;
    }

    /* renamed from: a */
    private final boolean m141009a(C44462c cVar) {
        SafeHandler safeHandler = this.f114991k;
        if (safeHandler == null) {
            C7573i.m23583a("safeHandler");
        }
        return safeHandler.postDelayed(new C44645b(this, cVar), 500);
    }

    /* renamed from: b */
    private final void m141011b(C44462c cVar) {
        cVar.f114728a.observe(mo31018y(), new C44659m(this, cVar));
    }

    /* renamed from: e */
    private static C12629j m141012e(int i) {
        if (i == 1) {
            return new C44786f();
        }
        if (i != 3) {
            return new C44782d();
        }
        return new C44802h();
    }

    /* renamed from: f */
    private static C44535a m141013f(int i) {
        if (i != 2 && i != 3) {
            return new C44535a();
        }
        C12604b sVar = new C44579s();
        sVar.getLifecycle().mo55a(new C44416x7c8148b7(sVar));
        return (C44535a) sVar;
    }

    /* renamed from: a */
    private final void m141008a(List<C44462c> list) {
        Object obj;
        Iterable<C44462c> iterable = list;
        for (C44462c b : iterable) {
            m141011b(b);
        }
        mo91868b(mo107082J(), C44674m.f115040a, C11673w.m34161b(true), new C44652i(this));
        mo91868b(mo107082J(), C44696p.f115072a, C11673w.m34161b(true), new C44653j(this));
        mo91868b(mo107082J(), C44719q.f115097a, C11673w.m34161b(true), new C44655k(this));
        mo91868b(mo107082J(), C44720r.f115098a, C11673w.m34161b(true), new C44658l(this));
        mo91869c(mo107082J(), C44666i.f115022a, C11673w.m34161b(true), new C44646c(this));
        mo91869c(mo107082J(), C44667j.f115023a, C11673w.m34161b(true), new C44647d(this));
        mo91868b(mo107082J(), C44668k.f115024a, C11673w.m34161b(true), new C44648e(this));
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C44462c) obj).f114729b.f113645e) {
                break;
            }
        }
        C44462c cVar = (C44462c) obj;
        if (cVar != null) {
            m141009a(cVar);
        }
        mo91868b(mo107082J(), C44669l.f115025a, new C11672v(), new C44649f(this));
        Activity activity = this.f33526d_;
        if (activity != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity).mo91871a(RecordExitViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…xitViewModel::class.java)");
            mo29062a((RecordExitViewModel) a, C44694n.f115070a, C11640h.m34110a(), new C44650g(this));
            Activity activity2 = this.f33526d_;
            if (activity2 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity2).mo91871a(RecordProgressViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…essViewModel::class.java)");
                mo29062a((RecordProgressViewModel) a2, C44695o.f115071a, C11640h.m34110a(), new C44651h(this));
                IIntegrationService iIntegrationService = C35563c.f93229K;
                C43868d dVar = this.f114992l;
                if (dVar == null) {
                    C7573i.m23583a("recordEnv");
                }
                iIntegrationService.onSceneCreated(dVar, this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f114995p = (C39382ed) b;
        Object b2 = mo30998F().mo31126b((Object) "safe_handler");
        if (b2 == null) {
            C7573i.m23580a();
        }
        this.f114991k = (SafeHandler) b2;
        Object b3 = mo30998F().mo31126b((Object) "record_env_context");
        if (b3 == null) {
            C7573i.m23580a();
        }
        this.f114992l = (C43868d) b3;
        IIntegrationService iIntegrationService = C35563c.f93229K;
        C43868d dVar = this.f114992l;
        if (dVar == null) {
            C7573i.m23583a("recordEnv");
        }
        iIntegrationService.onEnvCreated(dVar, this);
        this.f114993m = new C44452af(this);
        C43868d dVar2 = this.f114992l;
        if (dVar2 == null) {
            C7573i.m23583a("recordEnv");
        }
        IIntegrationService iIntegrationService2 = C35563c.f93229K;
        C43868d dVar3 = this.f114992l;
        if (dVar3 == null) {
            C7573i.m23583a("recordEnv");
        }
        C44442a.m140574a(dVar2, iIntegrationService2.getRecordBottomTabComponents(dVar3));
        C12648d y = mo31018y();
        C7573i.m23582a((Object) y, "requireNavigationScene()");
        C12675t F = y.mo30998F();
        String str = "toolbar_manager";
        IIntegrationService iIntegrationService3 = C35563c.f93229K;
        C43868d dVar4 = this.f114992l;
        if (dVar4 == null) {
            C7573i.m23583a("recordEnv");
        }
        F.mo31124a((Object) str, (Object) iIntegrationService3.getToolbarManager(dVar4));
        List<C44462c> a = C44442a.m140572a();
        mo30925a((int) R.id.cpy, (C12629j) new C44631c(), "RecordExitScene");
        mo30925a((int) R.id.cpy, (C12629j) new C44705a(), "RecordProgressScene");
        int a2 = C41121a.m131298a(this.f33526d_);
        if (!(a2 == 2 || a2 == 3)) {
            mo30925a((int) R.id.cpy, (C12629j) new C44507l(), "RecordChooseMusicScene");
        }
        mo30925a((int) R.id.cpy, m141012e(a2), "RecordToolbarScene");
        mo30925a((int) R.id.cpy, (C12629j) m141013f(a2), "RecordControlScene");
        for (C44462c cVar : a) {
            if (cVar.f114730c != null) {
                C12636a.m36709a(this, R.id.cpy, cVar.f114730c, cVar.f114730c.bQ_());
            }
        }
        mo30925a((int) R.id.cpy, (C12629j) new C44820v(), "RecordBottomTabScene");
        if (C35563c.f93230L.mo93342a(Property.SpeedPanelOpen)) {
            C44452af afVar = this.f114993m;
            if (afVar == null) {
                C7573i.m23583a("speedCommerceMediator");
            }
            afVar.mo106892a();
        }
        C12636a.m36709a(this, R.id.cpy, new C44825x(), "RecordCommerceTagScene");
        mo30925a((int) R.id.cpy, (C12629j) new C44830z(), "RecordFilterScene");
        if (!TextUtils.isEmpty(C35563c.f93230L.mo93346e(Property.StatusTabKey))) {
            Activity activity = this.f33526d_;
            if (activity != null) {
                this.f114994n = new C41811c((FragmentActivity) activity);
                C41811c cVar2 = this.f114994n;
                if (cVar2 == null) {
                    C7573i.m23583a("recordStatusPendantScene");
                }
                mo30925a((int) R.id.cpy, (C12629j) cVar2, "RecordStatusPendantScene");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
        }
        Activity activity2 = this.f33526d_;
        if (activity2 != null) {
            C0063u a3 = C0069x.m159a((FragmentActivity) activity2).mo147a(RecordStatusViewModel.class);
            C7573i.m23582a((Object) a3, "ViewModelProviders.of(ac…tusViewModel::class.java)");
            this.f114997r = (RecordStatusViewModel) a3;
            m141008a(a);
            Activity activity3 = this.f33526d_;
            if (activity3 != null) {
                JediViewModel a4 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(RecordExitViewModel.class);
                C7573i.m23582a((Object) a4, "JediViewModelProviders.o…xitViewModel::class.java)");
                mo29062a((RecordExitViewModel) a4, C44754t.f115165a, C11640h.m34110a(), new C44661o(this));
                Activity activity4 = this.f33526d_;
                if (activity4 != null) {
                    JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(RecordProgressViewModel.class);
                    C7573i.m23582a((Object) a5, "JediViewModelProviders.o…essViewModel::class.java)");
                    mo29062a((RecordProgressViewModel) a5, C44819u.f115292a, C11640h.m34110a(), new C44662p(this));
                    RecordStatusViewModel recordStatusViewModel = this.f114997r;
                    if (recordStatusViewModel == null) {
                        C7573i.m23583a("recordStatusViewModel");
                    }
                    C0052o l = recordStatusViewModel.mo102541l();
                    Activity activity5 = this.f33526d_;
                    if (activity5 != null) {
                        l.observe((FragmentActivity) activity5, new C44663q(this));
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: b */
    public final ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b2a, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }
}
