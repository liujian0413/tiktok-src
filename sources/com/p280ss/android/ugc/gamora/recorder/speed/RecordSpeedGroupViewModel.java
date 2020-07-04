package com.p280ss.android.ugc.gamora.recorder.speed;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewModel */
public final class RecordSpeedGroupViewModel extends BaseJediViewModel<RecordSpeedGroupViewState> {

    /* renamed from: com.ss.android.ugc.gamora.recorder.speed.RecordSpeedGroupViewModel$a */
    static final class C44724a extends Lambda implements C7562b<RecordSpeedGroupViewState, RecordSpeedGroupViewState> {

        /* renamed from: a */
        final /* synthetic */ RecordingSpeed f115100a;

        C44724a(RecordingSpeed recordingSpeed) {
            this.f115100a = recordingSpeed;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordSpeedGroupViewState invoke(RecordSpeedGroupViewState recordSpeedGroupViewState) {
            C7573i.m23587b(recordSpeedGroupViewState, "$receiver");
            return recordSpeedGroupViewState.copy(this.f115100a);
        }
    }

    /* renamed from: f */
    private static RecordSpeedGroupViewState m141170f() {
        return new RecordSpeedGroupViewState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m141170f();
    }

    /* renamed from: a */
    public final void mo107139a(RecordingSpeed recordingSpeed) {
        C7573i.m23587b(recordingSpeed, "value");
        mo29038c(new C44724a(recordingSpeed));
    }
}
