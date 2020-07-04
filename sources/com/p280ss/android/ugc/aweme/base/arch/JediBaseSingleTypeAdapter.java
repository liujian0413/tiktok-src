package com.p280ss.android.ugc.aweme.base.arch;

import android.arch.lifecycle.C0043i;
import android.support.p029v7.util.C1143a.C1147c;
import android.support.p029v7.util.C1151b;
import android.view.ViewGroup;
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
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter */
public abstract class JediBaseSingleTypeAdapter<T> extends JediBaseRawAdapter<JediViewHolder<? extends C11501d, T>> implements C11554a<T> {

    /* renamed from: c */
    private final C11561b<T> f61300c;

    /* renamed from: com.ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter$a */
    static final class C23270a extends Lambda implements C7562b<Integer, Integer> {

        /* renamed from: a */
        final /* synthetic */ JediBaseSingleTypeAdapter f61301a;

        C23270a(JediBaseSingleTypeAdapter jediBaseSingleTypeAdapter) {
            this.f61301a = jediBaseSingleTypeAdapter;
            super(1);
        }

        /* renamed from: a */
        private int m76415a(int i) {
            return i + this.f61301a.mo60563e();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(m76415a(((Number) obj).intValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter$b */
    static final class C23271b extends Lambda implements C7562b<ViewGroup, JediViewHolder<? extends C11501d, T>> {

        /* renamed from: a */
        final /* synthetic */ JediBaseSingleTypeAdapter f61302a;

        C23271b(JediBaseSingleTypeAdapter jediBaseSingleTypeAdapter) {
            this.f61302a = jediBaseSingleTypeAdapter;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public JediViewHolder<? extends C11501d, T> invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return this.f61302a.mo60559a(viewGroup);
        }
    }

    /* renamed from: a */
    public abstract JediViewHolder<? extends C11501d, T> mo60559a(ViewGroup viewGroup);

    public final C11561b<T> aC_() {
        return this.f61300c;
    }

    /* renamed from: d */
    public final List<T> mo60561d() {
        return C11555a.m34007a(this);
    }

    public int getItemCount() {
        return super.getItemCount();
    }

    /* renamed from: c */
    public final int mo60557c() {
        return aC_().mo29143a() + mo60563e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60560a(C11743d<JediViewHolder<? extends C11501d, T>> dVar) {
        C7573i.m23587b(dVar, "registry");
        dVar.mo29314a(0, null, (C7562b<? super ViewGroup, ? extends VH>) new C23271b<Object,Object>(this));
    }

    /* renamed from: a */
    public final T mo29135a(int i, boolean z) {
        return C11555a.m34005a((C11554a<T>) this, i, z);
    }

    /* renamed from: a */
    public final void mo29136a(List<? extends T> list, C7561a<C7581n> aVar) {
        C7573i.m23587b(list, "list");
        C11555a.m34009a((C11554a<T>) this, list, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final T mo60556b(int i, boolean z) {
        return aC_().mo29144a(i - mo60563e(), true);
    }

    public JediBaseSingleTypeAdapter(C0043i iVar, C1147c<T> cVar, C11569b bVar) {
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

    private JediBaseSingleTypeAdapter(C0043i iVar, C11567e eVar, C11564c<T> cVar) {
        C7573i.m23587b(iVar, "parent");
        C7573i.m23587b(cVar, "config");
        super(iVar);
        this.f61300c = new C11561b<>((C1151b) new JediListUpdateCallback(this, new C23270a(this)), cVar, eVar);
    }

    public /* synthetic */ JediBaseSingleTypeAdapter(C0043i iVar, C1147c cVar, C11569b bVar, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            cVar = new EqualsItemCallback();
        }
        this(iVar, cVar, (C11569b) null);
    }
}
