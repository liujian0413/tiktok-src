package com.p280ss.android.ugc.aweme.shortvideo.toolbar;

import com.p280ss.android.ugc.gamora.recorder.toolbar.C44781c;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.toolbar.RecordToolbarAdapterWrapperExpC */
public final class RecordToolbarAdapterWrapperExpC extends RecordToolbarAdapter {

    /* renamed from: c */
    private boolean f107000c;

    /* renamed from: d */
    private final C44781c f107001d;

    public final int getItemCount() {
        if (this.f107000c) {
            return super.getItemCount();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo101579a() {
        this.f107000c = true;
        int size = this.f107001d.mo107238c().size();
        for (int i = 0; i < size; i++) {
            notifyItemInserted(i);
        }
    }

    /* renamed from: b */
    public final void mo101580b() {
        this.f107000c = false;
        for (int size = this.f107001d.mo107238c().size() - 1; size >= 0; size--) {
            notifyItemRemoved(size);
        }
    }

    public RecordToolbarAdapterWrapperExpC(C44781c cVar) {
        C7573i.m23587b(cVar, "toolbarManager");
        super(cVar.mo107238c());
        this.f107001d = cVar;
    }
}
