package com.p280ss.android.ugc.gamora.recorder.progress;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel */
public final class RecordProgressViewModel extends JediViewModel<RecordProgressState> {

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel$a */
    static final class C44702a extends Lambda implements C7562b<RecordProgressState, RecordProgressState> {

        /* renamed from: a */
        final /* synthetic */ Pair f115076a;

        C44702a(Pair pair) {
            this.f115076a = pair;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordProgressState invoke(RecordProgressState recordProgressState) {
            C7573i.m23587b(recordProgressState, "$receiver");
            return RecordProgressState.copy$default(recordProgressState, 0, false, this.f115076a, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel$b */
    static final class C44703b extends Lambda implements C7562b<RecordProgressState, RecordProgressState> {

        /* renamed from: a */
        final /* synthetic */ long f115077a;

        C44703b(long j) {
            this.f115077a = j;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordProgressState invoke(RecordProgressState recordProgressState) {
            C7573i.m23587b(recordProgressState, "$receiver");
            return RecordProgressState.copy$default(recordProgressState, this.f115077a, false, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordProgressViewModel$c */
    static final class C44704c extends Lambda implements C7562b<RecordProgressState, RecordProgressState> {

        /* renamed from: a */
        final /* synthetic */ boolean f115078a;

        C44704c(boolean z) {
            this.f115078a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordProgressState invoke(RecordProgressState recordProgressState) {
            C7573i.m23587b(recordProgressState, "$receiver");
            return RecordProgressState.copy$default(recordProgressState, 0, this.f115078a, null, 5, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m141134f();
    }

    /* renamed from: f */
    private static RecordProgressState m141134f() {
        RecordProgressState recordProgressState = new RecordProgressState(0, false, null, 7, null);
        return recordProgressState;
    }

    /* renamed from: a */
    public final void mo107136a(long j) {
        mo29038c(new C44703b(j));
    }

    /* renamed from: a */
    public final void mo107137a(Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        C7573i.m23587b(pair, "value");
        mo29038c(new C44702a(pair));
    }

    /* renamed from: a */
    public final void mo107138a(boolean z) {
        mo29038c(new C44704c(z));
    }
}
