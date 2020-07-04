package com.p280ss.android.ugc.gamora.recorder.mask;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.recorder.mask.RecordMaskViewModel */
public final class RecordMaskViewModel extends JediViewModel<RecordMaskViewState> {

    /* renamed from: com.ss.android.ugc.gamora.recorder.mask.RecordMaskViewModel$a */
    static final class C44677a extends Lambda implements C7562b<RecordMaskViewState, RecordMaskViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f115041a;

        C44677a(boolean z) {
            this.f115041a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordMaskViewState invoke(RecordMaskViewState recordMaskViewState) {
            C7573i.m23587b(recordMaskViewState, "$receiver");
            return RecordMaskViewState.copy$default(recordMaskViewState, null, Boolean.valueOf(this.f115041a), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.mask.RecordMaskViewModel$b */
    static final class C44678b extends Lambda implements C7562b<RecordMaskViewState, RecordMaskViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f115042a;

        C44678b(boolean z) {
            this.f115042a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordMaskViewState invoke(RecordMaskViewState recordMaskViewState) {
            C7573i.m23587b(recordMaskViewState, "$receiver");
            return RecordMaskViewState.copy$default(recordMaskViewState, Boolean.valueOf(this.f115042a), null, 2, null);
        }
    }

    /* renamed from: f */
    private static RecordMaskViewState m141062f() {
        return new RecordMaskViewState(null, null, 3, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m141062f();
    }

    /* renamed from: a */
    public final void mo107093a(boolean z) {
        mo29038c(new C44678b(z));
    }

    /* renamed from: b */
    public final void mo107094b(boolean z) {
        mo29038c(new C44677a(z));
    }
}
