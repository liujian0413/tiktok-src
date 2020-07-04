package p1886me.drakeet.multitype;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

/* renamed from: me.drakeet.multitype.MultiTypeAdapter */
public class MultiTypeAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public List<?> f123129a;

    /* renamed from: b */
    public C48232i f123130b;

    public MultiTypeAdapter() {
        this(Collections.emptyList());
    }

    public final int getItemCount() {
        return this.f123129a.size();
    }

    /* renamed from: a */
    public void mo11418a(List<?> list) {
        this.f123129a = list;
    }

    public final void onViewAttachedToWindow(C1293v vVar) {
        m149615a(vVar);
    }

    public final void onViewDetachedFromWindow(C1293v vVar) {
        m149615a(vVar);
    }

    public final void onViewRecycled(C1293v vVar) {
        m149615a(vVar);
    }

    /* renamed from: b */
    private void m149616b(Class<?> cls) {
        this.f123130b.mo120462a(cls);
    }

    public final boolean onFailedToRecycleView(C1293v vVar) {
        m149615a(vVar);
        return false;
    }

    private MultiTypeAdapter(List<?> list) {
        this(list, new C48228e());
    }

    /* renamed from: a */
    private C48226c m149615a(C1293v vVar) {
        return this.f123130b.mo120460a(vVar.mItemViewType);
    }

    public final int getItemViewType(int i) {
        return m149614a(this.f123129a.get(i));
    }

    /* renamed from: a */
    public final <T> C48231h<T> mo120456a(Class<? extends T> cls) {
        m149616b(cls);
        return new C48229f(this, cls);
    }

    public final long getItemId(int i) {
        this.f123129a.get(i);
        this.f123130b.mo120460a(getItemViewType(i));
        return -1;
    }

    /* renamed from: a */
    private int m149614a(Object obj) throws C48224a {
        int b = this.f123130b.mo120463b(obj.getClass());
        if (b != -1) {
            return b + this.f123130b.mo120464b(b).mo21960a(obj);
        }
        throw new C48224a(obj.getClass());
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        throw new IllegalAccessError("You should not call this method. Call RecyclerView.Adapter#onBindViewHolder(holder, position, payloads) instead.");
    }

    private MultiTypeAdapter(List<?> list, C48232i iVar) {
        this.f123129a = list;
        this.f123130b = iVar;
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C48226c a = this.f123130b.mo120460a(i);
        a.f123131e = this;
        return a.mo21965a(from, viewGroup);
    }

    /* renamed from: a */
    public final <T> void mo120457a(Class<? extends T> cls, C48226c<T, ?> cVar) {
        m149616b(cls);
        this.f123130b.mo120461a(cls, cVar, new C48225b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> void mo120458a(Class<? extends T> cls, C48226c<T, ?> cVar, C48227d<T> dVar) {
        this.f123130b.mo120461a(cls, cVar, dVar);
    }

    public final void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        this.f123130b.mo120460a(vVar.mItemViewType).mo120459a(vVar, this.f123129a.get(i), list);
    }
}
