package com.bytedance.jedi.ext.adapter.multitype;

import android.support.p029v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.internal.C11721a;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import java.util.Iterator;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.jedi.ext.adapter.multitype.c */
public class C11738c<VH extends MultiTypeViewHolder<?>> implements C11743d<VH> {

    /* renamed from: a */
    private final SparseArray<C7562b<ViewGroup, VH>> f31530a = new SparseArray<>();

    /* renamed from: b */
    public final C11721a f31531b;

    /* renamed from: c */
    private int f31532c = 11513600;

    /* renamed from: d */
    private final List<C11739a<VH>> f31533d;

    /* renamed from: com.bytedance.jedi.ext.adapter.multitype.c$a */
    static final class C11739a<VH> {

        /* renamed from: a */
        public final C7562b<ViewGroup, VH> f31534a;

        /* renamed from: b */
        public final C7562b<Integer, Boolean> f31535b;

        /* renamed from: c */
        public final int f31536c;

        /* renamed from: d */
        public final C7563m<Integer, RecyclerView, C7581n> f31537d;

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f31537d, (java.lang.Object) r3.f31537d) != false) goto L_0x002f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x002f
                boolean r0 = r3 instanceof com.bytedance.jedi.ext.adapter.multitype.C11738c.C11739a
                if (r0 == 0) goto L_0x002d
                com.bytedance.jedi.ext.adapter.multitype.c$a r3 = (com.bytedance.jedi.ext.adapter.multitype.C11738c.C11739a) r3
                kotlin.jvm.a.b<android.view.ViewGroup, VH> r0 = r2.f31534a
                kotlin.jvm.a.b<android.view.ViewGroup, VH> r1 = r3.f31534a
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x002d
                kotlin.jvm.a.b<java.lang.Integer, java.lang.Boolean> r0 = r2.f31535b
                kotlin.jvm.a.b<java.lang.Integer, java.lang.Boolean> r1 = r3.f31535b
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x002d
                int r0 = r2.f31536c
                int r1 = r3.f31536c
                if (r0 != r1) goto L_0x002d
                kotlin.jvm.a.m<java.lang.Integer, android.support.v7.widget.RecyclerView, kotlin.n> r0 = r2.f31537d
                kotlin.jvm.a.m<java.lang.Integer, android.support.v7.widget.RecyclerView, kotlin.n> r3 = r3.f31537d
                boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
                if (r3 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r3 = 0
                return r3
            L_0x002f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.multitype.C11738c.C11739a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C7562b<ViewGroup, VH> bVar = this.f31534a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            C7562b<Integer, Boolean> bVar2 = this.f31535b;
            int hashCode2 = (((hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31) + this.f31536c) * 31;
            C7563m<Integer, RecyclerView, C7581n> mVar = this.f31537d;
            if (mVar != null) {
                i = mVar.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HolderCreator(factory=");
            sb.append(this.f31534a);
            sb.append(", typeMatcher=");
            sb.append(this.f31535b);
            sb.append(", viewType=");
            sb.append(this.f31536c);
            sb.append(", onAttachedToRecyclerView=");
            sb.append(this.f31537d);
            sb.append(")");
            return sb.toString();
        }

        public C11739a(C7562b<? super ViewGroup, ? extends VH> bVar, C7562b<? super Integer, Boolean> bVar2, int i, C7563m<? super Integer, ? super RecyclerView, C7581n> mVar) {
            C7573i.m23587b(bVar, "factory");
            C7573i.m23587b(bVar2, "typeMatcher");
            this.f31534a = bVar;
            this.f31535b = bVar2;
            this.f31536c = i;
            this.f31537d = mVar;
        }

        public /* synthetic */ C11739a(C7562b bVar, C7562b bVar2, int i, C7563m mVar, int i2, C7571f fVar) {
            this(bVar, bVar2, i, null);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.multitype.c$b */
    static final class C11740b extends Lambda implements C7562b<ViewGroup, VH> {

        /* renamed from: a */
        final /* synthetic */ C11738c f31538a;

        C11740b(C11738c cVar) {
            this.f31538a = cVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VH invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            return this.f31538a.mo29265a(viewGroup);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.multitype.c$c */
    static final class C11741c extends Lambda implements C7562b<Integer, Boolean> {

        /* renamed from: a */
        public static final C11741c f31539a = new C11741c();

        C11741c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.multitype.c$d */
    static final class C11742d extends Lambda implements C7562b<Integer, Boolean> {

        /* renamed from: a */
        public static final C11742d f31540a = new C11742d();

        C11742d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return Boolean.valueOf(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VH mo29264a(int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VH mo29266a(VH vh) {
        C7573i.m23587b(vh, "holder");
        return vh;
    }

    public C11738c() {
        C7562b bVar = new C11740b(this);
        C7562b bVar2 = C11741c.f31539a;
        int i = this.f31532c;
        this.f31532c = i + 1;
        C11739a aVar = new C11739a(bVar, bVar2, i, null, 8, null);
        this.f31533d = C7525m.m23466c(aVar);
        this.f31531b = new C11721a();
    }

    /* renamed from: b */
    public final void mo29319b(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f31531b.mo29289b(recyclerView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public VH mo29265a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        return (MultiTypeViewHolder) new C11736a(viewGroup);
    }

    /* renamed from: c */
    private final C7562b<ViewGroup, VH> m34423c(int i) {
        boolean z;
        if (this.f31530a.indexOfKey(i) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object obj = this.f31530a.get(i);
            C7573i.m23582a(obj, "factories[viewType]");
            return (C7562b) obj;
        }
        StringBuilder sb = new StringBuilder("no factory for viewType ");
        sb.append(i);
        sb.append(" is registered");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: b */
    public final int mo29318b(int i) {
        Object obj;
        Iterator it = this.f31533d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) ((C11739a) obj).f31535b.invoke(Integer.valueOf(i))).booleanValue()) {
                break;
            }
        }
        C11739a aVar = (C11739a) obj;
        if (aVar != null) {
            C7562b<ViewGroup, VH> bVar = aVar.f31534a;
            int i2 = aVar.f31536c;
            if (this.f31530a.get(i2) == null) {
                this.f31530a.put(i2, bVar);
            }
            return i2;
        }
        throw new IllegalArgumentException("no factory is registered for this item type".toString());
    }

    /* renamed from: a */
    public final void mo29316a(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        this.f31531b.mo29286a(recyclerView);
        for (C11739a aVar : this.f31533d) {
            int i = aVar.f31536c;
            C7563m<Integer, RecyclerView, C7581n> mVar = aVar.f31537d;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(i), recyclerView);
            }
        }
    }

    /* renamed from: a */
    public final void mo29317a(boolean z) {
        this.f31531b.f31492a = z;
    }

    /* renamed from: a */
    public final VH mo29313a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        VH a = mo29264a(i);
        if (a != null) {
            return a;
        }
        VH vh = (MultiTypeViewHolder) m34423c(i).invoke(viewGroup);
        mo29266a(vh);
        return vh;
    }

    /* renamed from: a */
    public final C11743d<VH> mo29314a(int i, C7563m<? super Integer, ? super RecyclerView, C7581n> mVar, C7562b<? super ViewGroup, ? extends VH> bVar) {
        boolean z;
        C7573i.m23587b(bVar, "factory");
        C7562b bVar2 = (C7562b) this.f31530a.get(i);
        if (bVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f31533d.add(this.f31533d.size() - 1, new C11739a(bVar, C11742d.f31540a, i, mVar));
            this.f31530a.put(i, bVar);
            return this;
        }
        StringBuilder sb = new StringBuilder("factory's viewType ");
        sb.append(i);
        sb.append(' ');
        sb.append(bVar2.getClass().getSimpleName());
        sb.append(" is already registered");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public final C11743d<VH> mo29315a(C7562b<? super Integer, Boolean> bVar, C7563m<? super Integer, ? super RecyclerView, C7581n> mVar, C7562b<? super ViewGroup, ? extends VH> bVar2) {
        C7573i.m23587b(bVar, "typeMatcher");
        C7573i.m23587b(bVar2, "factory");
        int size = this.f31533d.size();
        List<C11739a<VH>> list = this.f31533d;
        int i = size - 1;
        int i2 = this.f31532c;
        this.f31532c = i2 + 1;
        list.add(i, new C11739a(bVar2, bVar, i2, mVar));
        return this;
    }

    /* renamed from: a */
    public static void m34422a(VH vh, Object obj, int i, List<Object> list) {
        C7573i.m23587b(vh, "holder");
        if (obj != null) {
            vh.mo29215b(obj, i, list);
        }
    }
}
