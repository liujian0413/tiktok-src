package p1886me.drakeet.multitype;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: me.drakeet.multitype.c */
public abstract class C48226c<T, VH extends C1293v> {

    /* renamed from: e */
    public MultiTypeAdapter f123131e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract VH mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21966a(VH vh, T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo120459a(VH vh, T t, List<Object> list) {
        mo21966a(vh, t);
    }
}
