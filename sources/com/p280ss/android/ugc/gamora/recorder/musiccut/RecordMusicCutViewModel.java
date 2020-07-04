package com.p280ss.android.ugc.gamora.recorder.musiccut;

import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewModel */
public final class RecordMusicCutViewModel extends JediViewModel<RecordMusicCutViewState> {

    /* renamed from: com.ss.android.ugc.gamora.recorder.musiccut.RecordMusicCutViewModel$a */
    static final class C44690a extends Lambda implements C7562b<RecordMusicCutViewState, RecordMusicCutViewState> {

        /* renamed from: a */
        final /* synthetic */ C44691a f115059a;

        C44690a(C44691a aVar) {
            this.f115059a = aVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecordMusicCutViewState invoke(RecordMusicCutViewState recordMusicCutViewState) {
            C7573i.m23587b(recordMusicCutViewState, "$receiver");
            return recordMusicCutViewState.copy(new C44403b(this.f115059a));
        }
    }

    /* renamed from: f */
    private static RecordMusicCutViewState m141096f() {
        return new RecordMusicCutViewState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m141096f();
    }

    /* renamed from: a */
    public final void mo107103a(C44691a aVar) {
        C7573i.m23587b(aVar, "value");
        mo29038c(new C44690a(aVar));
    }
}
