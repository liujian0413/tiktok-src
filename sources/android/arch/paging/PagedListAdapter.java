package android.arch.paging;

import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;

public abstract class PagedListAdapter<T, VH extends C1293v> extends C1262a<VH> {

    /* renamed from: a */
    private final C0073a<T> f118a;

    /* renamed from: b */
    private final C0077a<T> f119b = new C0077a<T>() {
    };

    public int getItemCount() {
        return this.f118a.mo156a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public T mo153a(int i) {
        return this.f118a.mo157a(i);
    }

    /* renamed from: a */
    public final void mo154a(C0100h<T> hVar) {
        this.f118a.mo158a(hVar);
    }

    protected PagedListAdapter(C1147c<T> cVar) {
        this.f118a = new C0073a<>(this, cVar);
        this.f118a.f124d = this.f119b;
    }
}
