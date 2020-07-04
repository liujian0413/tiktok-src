package com.p280ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.util.C1151b;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.ext.list.C11554a;
import com.bytedance.jedi.arch.ext.list.C11554a.C11555a;
import com.bytedance.jedi.arch.ext.list.differ.C11561b;
import com.bytedance.jedi.arch.ext.list.differ.C11564c;
import com.bytedance.jedi.arch.ext.list.differ.C11566d;
import com.bytedance.jedi.arch.ext.list.differ.C11567e;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.bytedance.jedi.arch.ext.list.differ.C11570f;
import com.bytedance.jedi.ext.adapter.JediListUpdateCallback;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter */
public abstract class JediBaseMultiTypeAdapter<T> extends JediBaseRawAdapter<JediViewHolder<? extends C11501d, ?>> implements C11554a<T> {

    /* renamed from: c */
    private final C11561b<T> f61297c;

    /* renamed from: com.ss.android.ugc.aweme.base.arch.JediBaseMultiTypeAdapter$a */
    static final class C23269a extends Lambda implements C7562b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ JediBaseMultiTypeAdapter f61298a;

        C23269a(JediBaseMultiTypeAdapter jediBaseMultiTypeAdapter) {
            this.f61298a = jediBaseMultiTypeAdapter;
            super(1);
        }

        /* renamed from: a */
        private int m76406a(int i) {
            return i + this.f61298a.mo60563e();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(m76406a(((Number) obj).intValue()));
        }
    }

    public final C11561b<T> aC_() {
        return this.f61297c;
    }

    /* renamed from: d */
    public final List<T> mo60558d() {
        return C11555a.m34007a(this);
    }

    public int getItemCount() {
        return super.getItemCount();
    }

    /* renamed from: c */
    public final int mo60557c() {
        return aC_().mo29143a() + mo60563e();
    }

    /* renamed from: a */
    public final void mo60555a(List<? extends T> list) {
        C7573i.m23587b(list, "list");
        C11555a.m34008a(this, list);
    }

    /* renamed from: a */
    public final T mo29135a(int i, boolean z) {
        return C11555a.m34005a((C11554a<T>) this, i, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo60556b(int i, boolean z) {
        return aC_().mo29144a(i - mo60563e(), true);
    }

    /* renamed from: a */
    public final void mo29136a(List<? extends T> list, C7561a<C7581n> aVar) {
        C7573i.m23587b(list, "list");
        C11555a.m34009a((C11554a<T>) this, list, aVar);
    }

    public JediBaseMultiTypeAdapter(C0043i iVar, C1147c<T> cVar, C11569b bVar) {
        C11567e eVar;
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(cVar, "diffCallback");
        if (bVar != null) {
            eVar = C11570f.m34039a(bVar, true, 10);
        } else {
            eVar = null;
        }
        this(iVar, eVar, C11566d.m34032a(cVar, null));
    }

    private JediBaseMultiTypeAdapter(C0043i iVar, C11567e eVar, C11564c<T> cVar) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(cVar, "config");
        super(iVar);
        this.f61297c = new C11561b<>((C1151b) new JediListUpdateCallback(this, new C23269a(this)), cVar, eVar);
    }

    public /* synthetic */ JediBaseMultiTypeAdapter(C0043i iVar, C1147c cVar, C11569b bVar, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            cVar = new EqualsItemCallback();
        }
        this(iVar, cVar, (C11569b) null);
    }
}
