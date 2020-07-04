package com.p280ss.android.ugc.gamora.recorder;

import android.arch.lifecycle.C0043i;
import android.content.Intent;
import android.os.Handler;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.tools.C42581q;
import com.p280ss.android.ugc.gamora.bottomtab.C43865a;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44409e;
import com.p280ss.android.ugc.gamora.jedi.C44412h;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import kotlin.Triple;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel */
public final class RecordViewModel extends BaseJediViewModel<RecordViewState> {

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$a */
    static final class C44419a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordViewModel f114674a;

        /* renamed from: b */
        final /* synthetic */ boolean f114675b;

        C44419a(RecordViewModel recordViewModel, boolean z) {
            this.f114674a = recordViewModel;
            this.f114675b = z;
        }

        public final void run() {
            this.f114674a.mo29038c(new C7562b<RecordViewState, RecordViewState>(this) {

                /* renamed from: a */
                final /* synthetic */ C44419a f114676a;

                {
                    this.f114676a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public RecordViewState invoke(RecordViewState recordViewState) {
                    RecordViewState recordViewState2 = recordViewState;
                    C7573i.m23587b(recordViewState, "$receiver");
                    return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, this.f114676a.f114675b, null, null, null, null, null, null, null, null, null, 65471, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$b */
    static final class C44421b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordViewModel f114677a;

        /* renamed from: b */
        final /* synthetic */ boolean f114678b;

        C44421b(RecordViewModel recordViewModel, boolean z) {
            this.f114677a = recordViewModel;
            this.f114678b = z;
        }

        public final void run() {
            this.f114677a.mo29038c(new C7562b<RecordViewState, RecordViewState>(this) {

                /* renamed from: a */
                final /* synthetic */ C44421b f114679a;

                {
                    this.f114679a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public RecordViewState invoke(RecordViewState recordViewState) {
                    RecordViewState recordViewState2 = recordViewState;
                    C7573i.m23587b(recordViewState, "$receiver");
                    return RecordViewState.copy$default(recordViewState2, null, null, null, Boolean.valueOf(this.f114679a.f114678b), null, null, false, null, null, null, null, null, null, null, null, null, 65527, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$c */
    static final class C44423c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordViewModel f114680a;

        /* renamed from: b */
        final /* synthetic */ boolean f114681b;

        C44423c(RecordViewModel recordViewModel, boolean z) {
            this.f114680a = recordViewModel;
            this.f114681b = z;
        }

        public final void run() {
            this.f114680a.mo29038c(new C7562b<RecordViewState, RecordViewState>(this) {

                /* renamed from: a */
                final /* synthetic */ C44423c f114682a;

                {
                    this.f114682a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public RecordViewState invoke(RecordViewState recordViewState) {
                    RecordViewState recordViewState2 = recordViewState;
                    C7573i.m23587b(recordViewState, "$receiver");
                    return RecordViewState.copy$default(recordViewState2, Boolean.valueOf(this.f114682a.f114681b), null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65534, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$d */
    static final class C44425d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordViewModel f114683a;

        /* renamed from: b */
        final /* synthetic */ boolean f114684b;

        C44425d(RecordViewModel recordViewModel, boolean z) {
            this.f114683a = recordViewModel;
            this.f114684b = z;
        }

        public final void run() {
            this.f114683a.mo29038c(new C7562b<RecordViewState, RecordViewState>(this) {

                /* renamed from: a */
                final /* synthetic */ C44425d f114685a;

                {
                    this.f114685a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public RecordViewState invoke(RecordViewState recordViewState) {
                    RecordViewState recordViewState2 = recordViewState;
                    C7573i.m23587b(recordViewState, "$receiver");
                    return RecordViewState.copy$default(recordViewState2, null, null, Boolean.valueOf(this.f114685a.f114684b), null, null, null, false, null, null, null, null, null, null, null, null, null, 65531, null);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$e */
    static final class C44427e extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114686a;

        C44427e(boolean z) {
            this.f114686a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, this.f114686a, null, null, null, null, null, null, null, null, null, 65471, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$f */
    static final class C44428f extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ int f114687a;

        C44428f(int i) {
            this.f114687a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            C44409e eVar = r1;
            C44409e eVar2 = new C44409e(this.f114687a);
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, false, eVar, null, null, null, null, null, null, null, null, 65407, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$g */
    static final class C44429g extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ C43865a f114688a;

        C44429g(C43865a aVar) {
            this.f114688a = aVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, false, null, null, null, null, null, this.f114688a, null, null, null, 61439, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$h */
    static final class C44430h extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114689a;

        C44430h(boolean z) {
            this.f114689a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, false, null, null, null, null, null, null, Boolean.valueOf(this.f114689a), null, null, 57343, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$i */
    static final class C44431i extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ C42581q f114690a;

        C44431i(C42581q qVar) {
            this.f114690a = qVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, this.f114690a, null, false, null, null, null, null, null, null, null, null, null, 65519, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$j */
    static final class C44432j extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114691a;

        C44432j(boolean z) {
            this.f114691a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, null, null, Boolean.valueOf(this.f114691a), null, null, false, null, null, null, null, null, null, null, null, null, 65527, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$k */
    static final class C44433k extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114692a;

        C44433k(boolean z) {
            this.f114692a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, Boolean.valueOf(this.f114692a), null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65534, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$l */
    static final class C44434l extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114693a;

        C44434l(boolean z) {
            this.f114693a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, null, Boolean.valueOf(this.f114693a), null, null, null, false, null, null, null, null, null, null, null, null, null, 65531, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$m */
    static final class C44435m extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ Triple f114694a;

        C44435m(Triple triple) {
            this.f114694a = triple;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            C44403b bVar = r1;
            C44403b bVar2 = new C44403b(this.f114694a);
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, false, null, null, null, null, bVar, null, null, null, null, 63487, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$n */
    static final class C44436n extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114695a;

        C44436n(boolean z) {
            this.f114695a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, false, null, null, null, Boolean.valueOf(this.f114695a), null, null, null, null, null, 64511, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$o */
    static final class C44437o extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114696a;

        C44437o(boolean z) {
            this.f114696a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            C44413i iVar = r1;
            C44413i iVar2 = new C44413i(Boolean.valueOf(this.f114696a));
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, false, null, iVar, null, null, null, null, null, null, null, 65279, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$p */
    static final class C44438p extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ Integer f114697a;

        C44438p(Integer num) {
            this.f114697a = num;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, false, null, null, null, null, null, null, null, this.f114697a, null, 49151, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$q */
    static final class C44439q extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ int f114698a;

        C44439q(int i) {
            this.f114698a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            return RecordViewState.copy$default(recordViewState2, null, Integer.valueOf(this.f114698a), null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65533, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$r */
    static final class C44440r extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114699a;

        C44440r(boolean z) {
            this.f114699a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordViewState invoke(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            C44413i iVar = r1;
            C44413i iVar2 = new C44413i(Boolean.valueOf(this.f114699a));
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, null, false, null, null, iVar, null, null, null, null, null, null, 65023, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.RecordViewModel$s */
    static final class C44441s extends Lambda implements C7562b<RecordViewState, RecordViewState> {

        /* renamed from: a */
        public static final C44441s f114700a = new C44441s();

        C44441s() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m140569a((RecordViewState) obj);
        }

        /* renamed from: a */
        private static RecordViewState m140569a(RecordViewState recordViewState) {
            RecordViewState recordViewState2 = recordViewState;
            C7573i.m23587b(recordViewState, "$receiver");
            C44412h hVar = r1;
            C44412h hVar2 = new C44412h();
            return RecordViewState.copy$default(recordViewState2, null, null, null, null, null, hVar, false, null, null, null, null, null, null, null, null, null, 65503, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m140529g();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C44441s.f114700a);
    }

    /* renamed from: g */
    private static RecordViewState m140529g() {
        RecordViewState recordViewState = new RecordViewState(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 65535, null);
        return recordViewState;
    }

    /* renamed from: a */
    public final void mo106829a(int i) {
        mo29038c(new C44439q(i));
    }

    /* renamed from: b */
    public final void mo106836b(int i) {
        mo29038c(new C44428f(i));
    }

    /* renamed from: d */
    public final void mo106839d(boolean z) {
        mo29038c(new C44434l(z));
    }

    /* renamed from: e */
    public final void mo106840e(boolean z) {
        mo29038c(new C44432j(z));
    }

    /* renamed from: g */
    public final void mo106842g(boolean z) {
        mo29038c(new C44427e(z));
    }

    /* renamed from: i */
    public final void mo106844i(boolean z) {
        mo29038c(new C44437o(z));
    }

    /* renamed from: j */
    public final void mo106845j(boolean z) {
        mo29038c(new C44440r(z));
    }

    /* renamed from: k */
    public final void mo106846k(boolean z) {
        mo29038c(new C44436n(z));
    }

    /* renamed from: l */
    public final void mo106847l(boolean z) {
        mo29038c(new C44430h(z));
    }

    /* renamed from: a */
    public final void mo106830a(C42581q qVar) {
        C7573i.m23587b(qVar, "value");
        mo29038c(new C44431i(qVar));
    }

    /* renamed from: b */
    public final Boolean mo106835b(C0043i iVar) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        return Boolean.valueOf(((RecordViewState) mo106825a(iVar)).getBeauty());
    }

    /* renamed from: c */
    public final void mo106838c(boolean z) {
        new Handler().post(new C44425d(this, false));
    }

    /* renamed from: f */
    public final void mo106841f(boolean z) {
        new Handler().post(new C44421b(this, false));
    }

    /* renamed from: h */
    public final void mo106843h(boolean z) {
        new Handler().post(new C44419a(this, false));
    }

    /* renamed from: a */
    public final void mo106831a(C43865a aVar) {
        C7573i.m23587b(aVar, "value");
        mo29038c(new C44429g(aVar));
    }

    /* renamed from: b */
    public final void mo106837b(boolean z) {
        new Handler().post(new C44423c(this, false));
    }

    /* renamed from: a */
    public final void mo106832a(Integer num) {
        mo29038c(new C44438p(num));
    }

    /* renamed from: a */
    public final void mo106833a(Triple<Integer, Integer, ? extends Intent> triple) {
        C7573i.m23587b(triple, "value");
        mo29038c(new C44435m(triple));
    }

    /* renamed from: a */
    public final void mo106834a(boolean z) {
        mo29038c(new C44433k(z));
    }
}
