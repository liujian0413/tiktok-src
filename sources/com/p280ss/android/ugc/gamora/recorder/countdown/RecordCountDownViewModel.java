package com.p280ss.android.ugc.gamora.recorder.countdown;

import com.bytedance.jedi.arch.C11670t;
import com.p280ss.android.ugc.gamora.jedi.BaseJediViewModel;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.recorder.countdown.RecordCountDownViewModel */
public final class RecordCountDownViewModel extends BaseJediViewModel<RecordCountDownViewState> {

    /* renamed from: com.ss.android.ugc.gamora.recorder.countdown.RecordCountDownViewModel$a */
    static final class C44597a extends Lambda implements C7562b<RecordCountDownViewState, RecordCountDownViewState> {

        /* renamed from: a */
        public static final C44597a f114901a = new C44597a();

        C44597a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m140866a((RecordCountDownViewState) obj);
        }

        /* renamed from: a */
        private static RecordCountDownViewState m140866a(RecordCountDownViewState recordCountDownViewState) {
            C7573i.m23587b(recordCountDownViewState, "$receiver");
            return RecordCountDownViewState.copy$default(recordCountDownViewState, null, 0, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.countdown.RecordCountDownViewModel$b */
    static final class C44598b extends Lambda implements C7562b<RecordCountDownViewState, RecordCountDownViewState> {

        /* renamed from: a */
        final /* synthetic */ int f114902a;

        C44598b(int i) {
            this.f114902a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordCountDownViewState invoke(RecordCountDownViewState recordCountDownViewState) {
            C7573i.m23587b(recordCountDownViewState, "$receiver");
            return RecordCountDownViewState.copy$default(recordCountDownViewState, null, this.f114902a, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.countdown.RecordCountDownViewModel$c */
    static final class C44599c extends Lambda implements C7562b<RecordCountDownViewState, RecordCountDownViewState> {

        /* renamed from: a */
        final /* synthetic */ boolean f114903a;

        C44599c(boolean z) {
            this.f114903a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordCountDownViewState invoke(RecordCountDownViewState recordCountDownViewState) {
            C7573i.m23587b(recordCountDownViewState, "$receiver");
            return RecordCountDownViewState.copy$default(recordCountDownViewState, Boolean.valueOf(this.f114903a), 0, 2, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m140861g();
    }

    /* renamed from: f */
    public final void mo29069f() {
        mo29038c(C44597a.f114901a);
    }

    /* renamed from: g */
    private static RecordCountDownViewState m140861g() {
        return new RecordCountDownViewState(null, 0, 3, null);
    }

    /* renamed from: a */
    public final void mo107029a(int i) {
        mo29038c(new C44598b(i));
    }

    /* renamed from: a */
    public final void mo107030a(boolean z) {
        mo29038c(new C44599c(z));
    }
}
