package com.p280ss.android.ugc.aweme.shortvideo.toolbar;

import com.p280ss.android.ugc.gamora.recorder.toolbar.C44781c;
import com.p280ss.android.ugc.gamora.recorder.toolbar.RecordToolbarAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.toolbar.RecordToolbarAdapterWrapperExpA */
public final class RecordToolbarAdapterWrapperExpA extends RecordToolbarAdapter {

    /* renamed from: c */
    private boolean f106998c;

    /* renamed from: d */
    private final C44781c f106999d;

    public final int getItemCount() {
        if (this.f106998c) {
            return super.getItemCount();
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo101577a() {
        this.f106998c = true;
        int size = this.f106999d.mo107238c().size();
        for (int i = 1; i < size; i++) {
            notifyItemInserted(i);
        }
    }

    /* renamed from: b */
    public final void mo101578b() {
        this.f106998c = false;
        for (int size = this.f106999d.mo107238c().size() - 1; size > 0; size--) {
            notifyItemRemoved(size);
        }
    }

    public RecordToolbarAdapterWrapperExpA(C44781c cVar) {
        C7573i.m23587b(cVar, "toolbarManager");
        super(cVar.mo107238c());
        this.f106999d = cVar;
    }
}
