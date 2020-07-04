package com.p280ss.ugc.live.barrage;

import com.p280ss.ugc.live.barrage.p1824a.C46187a;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a.C46189a;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a.C46192d;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList */
public final class BarrageCopyOnWriteArrayList extends CopyOnWriteArrayList<C46187a> {
    private C46186a onChangerListener;

    /* renamed from: com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList$a */
    public interface C46186a {
        /* renamed from: a */
        void mo114134a(boolean z, C46187a aVar);
    }

    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(C46187a aVar) {
        return super.contains(aVar);
    }

    public final /* bridge */ int indexOf(C46187a aVar) {
        return super.indexOf(aVar);
    }

    public final /* bridge */ int lastIndexOf(C46187a aVar) {
        return super.lastIndexOf(aVar);
    }

    public final C46187a remove(int i) {
        return remove(i);
    }

    public final void setOnChangeListener(C46186a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.onChangerListener = aVar;
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C46187a;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return contains((C46187a) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C46187a;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return indexOf((C46187a) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C46187a;
        } else {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return lastIndexOf((C46187a) obj);
    }

    public final boolean remove(C46187a aVar) {
        boolean remove = super.remove(aVar);
        if (aVar != null) {
            aVar.mo114137a((C46188a) C46189a.f118763a);
            C46186a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.mo114134a(false, aVar);
            }
        }
        return remove;
    }

    /* renamed from: removeAt */
    public final C46187a remove(int i) {
        C46187a aVar = (C46187a) super.remove(i);
        if (aVar != null) {
            aVar.mo114137a((C46188a) C46189a.f118763a);
            C46186a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.mo114134a(false, aVar);
            }
        }
        C7573i.m23582a((Object) aVar, "barrage");
        return aVar;
    }

    public final boolean add(C46187a aVar) {
        C7573i.m23587b(aVar, "element");
        boolean add = super.add(aVar);
        aVar.mo114137a((C46188a) C46192d.f118766a);
        C46186a aVar2 = this.onChangerListener;
        if (aVar2 != null) {
            aVar2.mo114134a(true, aVar);
        }
        return add;
    }

    public final /* bridge */ boolean remove(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof C46187a;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        return remove((C46187a) obj);
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        C7573i.m23587b(collection, "elements");
        boolean removeAll = super.removeAll(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C46187a aVar = (C46187a) it.next();
            if (aVar != null) {
                aVar.mo114137a((C46188a) C46189a.f118763a);
                C46186a aVar2 = this.onChangerListener;
                if (aVar2 != null) {
                    aVar2.mo114134a(false, aVar);
                }
            }
        }
        return removeAll;
    }

    public final boolean addAll(Collection<? extends C46187a> collection) {
        C7573i.m23587b(collection, "elements");
        boolean addAll = super.addAll(collection);
        for (C46187a aVar : collection) {
            aVar.mo114137a((C46188a) C46192d.f118766a);
            C46186a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.mo114134a(true, aVar);
            }
        }
        return addAll;
    }

    public final void add(int i, C46187a aVar) {
        C7573i.m23587b(aVar, "element");
        super.add(i, aVar);
        aVar.mo114137a((C46188a) C46192d.f118766a);
        C46186a aVar2 = this.onChangerListener;
        if (aVar2 != null) {
            aVar2.mo114134a(true, aVar);
        }
    }

    public final boolean addAll(int i, Collection<? extends C46187a> collection) {
        C7573i.m23587b(collection, "elements");
        boolean addAll = super.addAll(i, collection);
        for (C46187a aVar : collection) {
            aVar.mo114137a((C46188a) C46192d.f118766a);
            C46186a aVar2 = this.onChangerListener;
            if (aVar2 != null) {
                aVar2.mo114134a(true, aVar);
            }
        }
        return addAll;
    }
}
