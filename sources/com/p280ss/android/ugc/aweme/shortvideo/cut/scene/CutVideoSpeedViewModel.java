package com.p280ss.android.ugc.aweme.shortvideo.cut.scene;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.LiveData;
import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel */
public final class CutVideoSpeedViewModel extends BaseJediViewModel<CutVideoSpeedState> {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f100973c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CutVideoSpeedViewModel.class), "checkedSpeed", "getCheckedSpeed()Landroid/arch/lifecycle/MutableLiveData;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CutVideoSpeedViewModel.class), "speedAlpha", "getSpeedAlpha()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: d */
    private final C7541d f100974d = C7546e.m23569a(C38873a.f100976a);

    /* renamed from: e */
    private final C7541d f100975e = C7546e.m23569a(C38876d.f100979a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$a */
    static final class C38873a extends Lambda implements C7561a<C0052o<RecordingSpeed>> {

        /* renamed from: a */
        public static final C38873a f100976a = new C38873a();

        C38873a() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<RecordingSpeed> m124118a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m124118a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$b */
    static final class C38874b extends Lambda implements C7562b<CutVideoSpeedState, CutVideoSpeedState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100977a;

        C38874b(boolean z) {
            this.f100977a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoSpeedState invoke(CutVideoSpeedState cutVideoSpeedState) {
            C7573i.m23587b(cutVideoSpeedState, "$receiver");
            return CutVideoSpeedState.copy$default(cutVideoSpeedState, Boolean.valueOf(this.f100977a), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$c */
    static final class C38875c extends Lambda implements C7562b<CutVideoSpeedState, CutVideoSpeedState> {

        /* renamed from: a */
        final /* synthetic */ boolean f100978a;

        C38875c(boolean z) {
            this.f100978a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CutVideoSpeedState invoke(CutVideoSpeedState cutVideoSpeedState) {
            C7573i.m23587b(cutVideoSpeedState, "$receiver");
            return CutVideoSpeedState.copy$default(cutVideoSpeedState, null, Boolean.valueOf(this.f100978a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$d */
    static final class C38876d extends Lambda implements C7561a<C0052o<Float>> {

        /* renamed from: a */
        public static final C38876d f100979a = new C38876d();

        C38876d() {
            super(0);
        }

        /* renamed from: a */
        private static C0052o<Float> m124121a() {
            return new C0052o<>();
        }

        public final /* synthetic */ Object invoke() {
            return m124121a();
        }
    }

    /* renamed from: i */
    private final C0052o<RecordingSpeed> m124109i() {
        return (C0052o) this.f100974d.getValue();
    }

    /* renamed from: j */
    private final C0052o<Float> m124110j() {
        return (C0052o) this.f100975e.getValue();
    }

    /* renamed from: h */
    private static CutVideoSpeedState m124108h() {
        return new CutVideoSpeedState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m124108h();
    }

    /* renamed from: f */
    public final LiveData<RecordingSpeed> mo29069f() {
        return m124109i();
    }

    /* renamed from: g */
    public final LiveData<Float> mo97107g() {
        return m124110j();
    }

    /* renamed from: a */
    public final void mo97103a(float f) {
        m124110j().setValue(Float.valueOf(f));
    }

    /* renamed from: b */
    public final void mo97106b(boolean z) {
        mo29038c(new C38875c(z));
    }

    /* renamed from: a */
    public final void mo97104a(RecordingSpeed recordingSpeed) {
        C7573i.m23587b(recordingSpeed, "value");
        m124109i().setValue(recordingSpeed);
    }

    /* renamed from: a */
    public final void mo97105a(boolean z) {
        mo29038c(new C38874b(z));
    }
}
