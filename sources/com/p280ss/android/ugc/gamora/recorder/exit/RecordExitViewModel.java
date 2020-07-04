package com.p280ss.android.ugc.gamora.recorder.exit;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.gamora.recorder.C44460aj;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel */
public final class RecordExitViewModel extends JediViewModel<RecordExitState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f114946c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordExitViewModel.class), "recordExitController", "getRecordExitController()Lcom/ss/android/ugc/gamora/recorder/exit/IRecordExitController;"))};

    /* renamed from: d */
    private final C7541d f114947d = C7546e.m23569a(C44620g.f114962a);

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$a */
    static final class C44614a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecordExitViewModel f114948a;

        /* renamed from: b */
        final /* synthetic */ Activity f114949b;

        C44614a(RecordExitViewModel recordExitViewModel, Activity activity) {
            this.f114948a = recordExitViewModel;
            this.f114949b = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m140939a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140939a() {
            this.f114948a.mo29069f().mo107067a(this.f114949b);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$b */
    static final class C44615b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecordExitViewModel f114950a;

        /* renamed from: b */
        final /* synthetic */ Activity f114951b;

        C44615b(RecordExitViewModel recordExitViewModel, Activity activity) {
            this.f114950a = recordExitViewModel;
            this.f114951b = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m140940a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140940a() {
            this.f114950a.mo29069f().mo107067a(this.f114951b);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$c */
    static final class C44616c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecordExitViewModel f114952a;

        /* renamed from: b */
        final /* synthetic */ Activity f114953b;

        /* renamed from: c */
        final /* synthetic */ ShortVideoContext f114954c;

        C44616c(RecordExitViewModel recordExitViewModel, Activity activity, ShortVideoContext shortVideoContext) {
            this.f114952a = recordExitViewModel;
            this.f114953b = activity;
            this.f114954c = shortVideoContext;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m140941a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140941a() {
            this.f114952a.mo29069f().mo107072b(this.f114953b);
            ShortVideoContext shortVideoContext = this.f114954c;
            C7573i.m23582a((Object) shortVideoContext, "shortVideoContext");
            if (shortVideoContext.mo96150k() == 0) {
                this.f114952a.mo29069f().mo107067a(this.f114953b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$d */
    static final class C44617d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ ShortVideoContextViewModel f114955a;

        C44617d(ShortVideoContextViewModel shortVideoContextViewModel) {
            this.f114955a = shortVideoContextViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m140942a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140942a() {
            C6907h.onEvent(MobClick.obtain().setEventName("cancel_shoot_fail").setLabelName("shoot_page").setJsonObject(C44460aj.m140631a(this.f114955a)));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$e */
    static final class C44618e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecordExitViewModel f114956a;

        /* renamed from: b */
        final /* synthetic */ Activity f114957b;

        /* renamed from: c */
        final /* synthetic */ ShortVideoContextViewModel f114958c;

        C44618e(RecordExitViewModel recordExitViewModel, Activity activity, ShortVideoContextViewModel shortVideoContextViewModel) {
            this.f114956a = recordExitViewModel;
            this.f114957b = activity;
            this.f114958c = shortVideoContextViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m140943a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140943a() {
            C35563c.f93253p.mo90376a();
            this.f114956a.mo29069f().mo107067a(this.f114957b);
            C6907h.onEvent(MobClick.obtain().setEventName("cancel_shoot_confirm").setLabelName("shoot_page").setJsonObject(C44460aj.m140631a(this.f114958c)));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$f */
    static final class C44619f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ RecordExitViewModel f114959a;

        /* renamed from: b */
        final /* synthetic */ ShortVideoContext f114960b;

        /* renamed from: c */
        final /* synthetic */ Activity f114961c;

        C44619f(RecordExitViewModel recordExitViewModel, ShortVideoContext shortVideoContext, Activity activity) {
            this.f114959a = recordExitViewModel;
            this.f114960b = shortVideoContext;
            this.f114961c = activity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m140944a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140944a() {
            C6907h.m21524a("reshoot", (Map) C22984d.m75611a().mo59973a("creation_id", this.f114960b.f99787w).mo59973a("shoot_way", this.f114960b.f99788x).mo59970a("draft_id", this.f114960b.f99790z).f60753a);
            this.f114959a.mo29069f().mo107073c(this.f114961c);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$g */
    static final class C44620g extends Lambda implements C7561a<C44624b> {

        /* renamed from: a */
        public static final C44620g f114962a = new C44620g();

        C44620g() {
            super(0);
        }

        /* renamed from: a */
        private static C44624b m140945a() {
            return new C44624b();
        }

        public final /* synthetic */ Object invoke() {
            return m140945a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$h */
    static final class C44621h extends Lambda implements C7562b<RecordExitState, RecordExitState> {

        /* renamed from: a */
        final /* synthetic */ Pair f114963a;

        C44621h(Pair pair) {
            this.f114963a = pair;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordExitState invoke(RecordExitState recordExitState) {
            C7573i.m23587b(recordExitState, "$receiver");
            return RecordExitState.copy$default(recordExitState, null, false, this.f114963a, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.exit.RecordExitViewModel$i */
    static final class C44622i extends Lambda implements C7562b<RecordExitState, RecordExitState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114964a;

        C44622i(boolean z) {
            this.f114964a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordExitState invoke(RecordExitState recordExitState) {
            C7573i.m23587b(recordExitState, "$receiver");
            return RecordExitState.copy$default(recordExitState, null, this.f114964a, null, 5, null);
        }
    }

    /* renamed from: f */
    public final C44623a mo29069f() {
        return (C44623a) this.f114947d.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m140933g();
    }

    /* renamed from: g */
    private static RecordExitState m140933g() {
        RecordExitState recordExitState = new RecordExitState(null, false, null, 7, null);
        return recordExitState;
    }

    /* renamed from: a */
    public final void mo107065a(Pair<Float, Float> pair) {
        mo29038c(new C44621h(pair));
    }

    /* renamed from: a */
    public final void mo107066a(boolean z) {
        mo29038c(new C44622i(z));
    }

    /* renamed from: a */
    public final void mo107064a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        C0063u a = C0069x.m159a((FragmentActivity) activity).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a;
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f99791a;
        C6907h.onEvent(MobClick.obtain().setEventName("cancel_shoot").setLabelName("shoot_page").setJsonObject(C44460aj.m140631a(shortVideoContextViewModel)));
        if (shortVideoContext.f99766b != 1 || shortVideoContext.f99779o) {
            Context context = activity;
            if (mo29069f().mo107071a(context)) {
                mo29069f().mo107069a(context, new C44615b(this, activity), new C44616c(this, activity, shortVideoContext));
                return;
            }
            C7573i.m23582a((Object) shortVideoContext, "shortVideoContext");
            if (shortVideoContext.mo96150k() == 0) {
                mo29069f().mo107067a(activity);
            } else {
                mo29069f().mo107070a(context, new C44617d(shortVideoContextViewModel), new C44618e(this, activity, shortVideoContextViewModel), new C44619f(this, shortVideoContext, activity));
            }
        } else {
            mo29069f().mo107068a(activity, new C44614a(this, activity));
        }
    }
}
