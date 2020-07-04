package com.p280ss.android.ugc.gamora.recorder.progress;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordModeViewModel */
public final class RecordModeViewModel extends JediViewModel<RecordMode> {

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordModeViewModel$a */
    static final class C44698a extends Lambda implements C7562b<RecordMode, RecordMode> {

        /* renamed from: a */
        final /* synthetic */ Pair f115073a;

        C44698a(Pair pair) {
            this.f115073a = pair;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordMode invoke(RecordMode recordMode) {
            C7573i.m23587b(recordMode, "$receiver");
            return RecordMode.copy$default(recordMode, 0, null, this.f115073a, 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordModeViewModel$b */
    static final class C44699b extends Lambda implements C7562b<RecordMode, RecordMode> {

        /* renamed from: a */
        final /* synthetic */ int f115074a;

        C44699b(int i) {
            this.f115074a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordMode invoke(RecordMode recordMode) {
            C7573i.m23587b(recordMode, "$receiver");
            return RecordMode.copy$default(recordMode, this.f115074a, null, null, 6, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.progress.RecordModeViewModel$c */
    static final class C44700c extends Lambda implements C7562b<RecordMode, RecordMode> {

        /* renamed from: a */
        final /* synthetic */ RetakeVideoContext f115075a;

        C44700c(RetakeVideoContext retakeVideoContext) {
            this.f115075a = retakeVideoContext;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordMode invoke(RecordMode recordMode) {
            C7573i.m23587b(recordMode, "$receiver");
            return RecordMode.copy$default(recordMode, 0, this.f115075a, null, 5, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m141125f();
    }

    /* renamed from: f */
    private static RecordMode m141125f() {
        RecordMode recordMode = new RecordMode(0, null, null, 7, null);
        return recordMode;
    }

    /* renamed from: a */
    public final void mo107123a(int i) {
        mo29038c(new C44699b(i));
    }

    /* renamed from: a */
    public final void mo107124a(RetakeVideoContext retakeVideoContext) {
        C7573i.m23587b(retakeVideoContext, "retakeVideoContext");
        mo29038c(new C44700c(retakeVideoContext));
    }

    /* renamed from: a */
    public final void mo107125a(Pair<? extends List<? extends TimeSpeedModelExtension>, Long> pair) {
        C7573i.m23587b(pair, "value");
        mo29038c(new C44698a(pair));
    }
}
