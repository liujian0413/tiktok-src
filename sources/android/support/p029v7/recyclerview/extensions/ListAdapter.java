package android.support.p029v7.recyclerview.extensions;

import android.support.p029v7.recyclerview.extensions.C1135a.C1136a;
import android.support.p029v7.util.AdapterListUpdateCallback;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import java.util.List;

/* renamed from: android.support.v7.recyclerview.extensions.ListAdapter */
public abstract class ListAdapter<T, VH extends C1293v> extends C1262a<VH> {

    /* renamed from: a */
    private final C1138c<T> f4085a;

    public int getItemCount() {
        return this.f4085a.f4097c.size();
    }

    /* renamed from: a */
    public final void mo4536a(List<T> list) {
        this.f4085a.mo4538a(list);
    }

    /* renamed from: a */
    public T mo4535a(int i) {
        return this.f4085a.f4097c.get(i);
    }

    protected ListAdapter(C1147c<T> cVar) {
        this.f4085a = new C1138c<>(new AdapterListUpdateCallback(this), new C1136a(cVar).mo4537a());
    }
}
