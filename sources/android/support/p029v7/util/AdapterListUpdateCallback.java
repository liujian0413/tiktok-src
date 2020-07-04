package android.support.p029v7.util;

import android.support.p029v7.widget.RecyclerView.C1262a;

/* renamed from: android.support.v7.util.AdapterListUpdateCallback */
public final class AdapterListUpdateCallback implements C1151b {

    /* renamed from: a */
    private final C1262a f4109a;

    public AdapterListUpdateCallback(C1262a aVar) {
        this.f4109a = aVar;
    }

    /* renamed from: a */
    public final void mo253a(int i, int i2) {
        this.f4109a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: b */
    public final void mo255b(int i, int i2) {
        this.f4109a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: c */
    public final void mo256c(int i, int i2) {
        this.f4109a.notifyItemMoved(i, i2);
    }

    /* renamed from: a */
    public final void mo254a(int i, int i2, Object obj) {
        this.f4109a.notifyItemRangeChanged(i, i2, obj);
    }
}
