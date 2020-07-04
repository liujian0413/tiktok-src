package com.p280ss.android.ugc.gamora.recorder.choosemusic;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.graphics.drawable.Drawable;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel */
public final class RecordChooseMusicViewModel extends JediViewModel<RecordChooseMusicState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f114731c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecordChooseMusicViewModel.class), "recordChooseMusicController", "getRecordChooseMusicController()Lcom/ss/android/ugc/gamora/recorder/choosemusic/IRecordChooseMusicController;"))};

    /* renamed from: d */
    public final C0052o<Void> f114732d = new C0052o<>();

    /* renamed from: e */
    public final C0052o<Integer> f114733e = new C0052o<>();

    /* renamed from: f */
    public final C0052o<Void> f114734f = new C0052o<>();

    /* renamed from: g */
    public final C0052o<Boolean> f114735g = new C0052o<>();

    /* renamed from: h */
    private final C7541d f114736h = C7546e.m23569a(C44464a.f114737a);

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$a */
    static final class C44464a extends Lambda implements C7561a<C44477c> {

        /* renamed from: a */
        public static final C44464a f114737a = new C44464a();

        C44464a() {
            super(0);
        }

        /* renamed from: a */
        private static C44477c m140649a() {
            return new C44477c();
        }

        public final /* synthetic */ Object invoke() {
            return m140649a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$b */
    static final class C44465b extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ Pair f114738a;

        C44465b(Pair pair) {
            this.f114738a = pair;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, 0.0f, 0, null, false, false, false, null, false, false, this.f114738a, 511, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$c */
    static final class C44466c extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114739a;

        C44466c(boolean z) {
            this.f114739a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, 0.0f, 0, null, false, false, false, null, false, this.f114739a, null, 767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$d */
    static final class C44467d extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ int f114740a;

        C44467d(int i) {
            this.f114740a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, 0.0f, this.f114740a, null, false, false, false, null, false, false, null, 1021, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$e */
    static final class C44468e extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ Drawable f114741a;

        C44468e(Drawable drawable) {
            this.f114741a = drawable;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, 0.0f, 0, null, false, false, false, this.f114741a, false, false, null, 959, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$f */
    static final class C44469f extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114742a;

        C44469f(boolean z) {
            this.f114742a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, 0.0f, 0, null, this.f114742a, false, false, null, false, false, null, 1015, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$g */
    static final class C44470g extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ float f114743a;

        C44470g(float f) {
            this.f114743a = f;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, this.f114743a, 0, null, false, false, false, null, false, false, null, 1022, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$h */
    static final class C44471h extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114744a;

        C44471h(boolean z) {
            this.f114744a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, 0.0f, 0, null, false, false, this.f114744a, null, false, false, null, 991, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$i */
    static final class C44472i extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ String f114745a;

        C44472i(String str) {
            this.f114745a = str;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, 0.0f, 0, this.f114745a, false, false, false, null, false, false, null, 1019, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel$j */
    static final class C44473j extends Lambda implements C7562b<RecordChooseMusicState, RecordChooseMusicState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114746a;

        C44473j(boolean z) {
            this.f114746a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordChooseMusicState invoke(RecordChooseMusicState recordChooseMusicState) {
            C7573i.m23587b(recordChooseMusicState, "$receiver");
            return RecordChooseMusicState.copy$default(recordChooseMusicState, 0.0f, 0, null, false, this.f114746a, false, null, false, false, null, 1007, null);
        }
    }

    /* renamed from: f */
    private final C44476b m140636f() {
        return (C44476b) this.f114736h.getValue();
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m140637g();
    }

    /* renamed from: g */
    private static RecordChooseMusicState m140637g() {
        RecordChooseMusicState recordChooseMusicState = new RecordChooseMusicState(0.0f, 0, null, false, false, false, null, false, false, null, 1023, null);
        return recordChooseMusicState;
    }

    /* renamed from: a */
    public final void mo106924a(float f) {
        mo29038c(new C44470g(f));
    }

    /* renamed from: b */
    public final void mo106931b(boolean z) {
        mo29038c(new C44473j(z));
    }

    /* renamed from: c */
    public final void mo106932c(boolean z) {
        mo29038c(new C44471h(false));
    }

    /* renamed from: d */
    public final void mo106933d(boolean z) {
        mo29038c(new C44466c(z));
    }

    /* renamed from: a */
    public final void mo106925a(int i) {
        mo29038c(new C44467d(i));
    }

    /* renamed from: a */
    public final void mo106926a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        m140636f().mo106934a(activity);
    }

    /* renamed from: a */
    public final void mo106927a(Drawable drawable) {
        C7573i.m23587b(drawable, "value");
        mo29038c(new C44468e(drawable));
    }

    /* renamed from: a */
    public final void mo106928a(String str) {
        C7573i.m23587b(str, "value");
        mo29038c(new C44472i(str));
    }

    /* renamed from: a */
    public final void mo106929a(Pair<Float, Float> pair) {
        mo29038c(new C44465b(pair));
    }

    /* renamed from: a */
    public final void mo106930a(boolean z) {
        mo29038c(new C44469f(z));
    }
}
