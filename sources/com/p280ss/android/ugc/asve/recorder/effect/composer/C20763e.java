package com.p280ss.android.ugc.asve.recorder.effect.composer;

import com.p280ss.android.ugc.asve.recorder.effect.composer.C20756a.C20758b;
import com.p280ss.android.vesdk.C45382z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.effect.composer.e */
public final class C20763e implements C20759b {

    /* renamed from: a */
    private final HashMap<Integer, ArrayList<ComposerInfo>> f56053a = new HashMap<>(8);

    /* renamed from: b */
    private final C45382z f56054b;

    /* renamed from: a */
    public final void mo56040a() {
        this.f56053a.clear();
        m69304b();
    }

    /* renamed from: d */
    public final C20761c mo56102d() {
        return new C20756a(this);
    }

    /* renamed from: b */
    private final void m69304b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Collection<ArrayList> values = this.f56053a.values();
        C7573i.m23582a((Object) values, "nodeMap.values");
        for (ArrayList<ComposerInfo> arrayList3 : values) {
            C7573i.m23582a((Object) arrayList3, "it");
            for (ComposerInfo composerInfo : arrayList3) {
                arrayList.add(composerInfo.f56036a);
                arrayList2.add(composerInfo.f56037b);
            }
        }
        C45382z zVar = this.f56054b;
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = arrayList.size();
            Object[] array2 = arrayList2.toArray(new String[0]);
            if (array2 != null) {
                zVar.mo108640a(strArr, size, (String[]) array2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: n */
    public final void mo56127n(boolean z) {
        this.f56054b.mo108705c(z ? 1 : 0, 0);
    }

    public C20763e(C45382z zVar) {
        C7573i.m23587b(zVar, "recoder");
        this.f56054b = zVar;
    }

    /* renamed from: a */
    private final void m69303a(C20758b bVar) {
        ArrayList arrayList = (ArrayList) this.f56053a.get(Integer.valueOf(bVar.f56043b));
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new ComposerInfo(bVar.f56044c, bVar.f56047f));
            this.f56053a.put(Integer.valueOf(bVar.f56043b), arrayList2);
            return;
        }
        arrayList.add(new ComposerInfo(bVar.f56044c, bVar.f56047f));
    }

    /* renamed from: a */
    public final void mo56147a(C20756a aVar) {
        C7573i.m23587b(aVar, "composerOperation");
        if (aVar.f56039a.size() > 0) {
            for (C20758b bVar : aVar.f56039a) {
                switch (bVar.f56042a) {
                    case 0:
                        this.f56053a.clear();
                        this.f56054b.mo108639a(new String[0], 0);
                        break;
                    case 1:
                        m69303a(bVar);
                        break;
                    case 2:
                        m69305b(bVar);
                        break;
                    case 3:
                        this.f56053a.remove(Integer.valueOf(bVar.f56043b));
                        break;
                }
            }
            m69304b();
        }
        for (C20758b bVar2 : aVar.f56040b) {
            this.f56054b.mo108691b(bVar2.f56044c, bVar2.f56045d, bVar2.f56046e);
        }
    }

    /* renamed from: b */
    private final void m69305b(C20758b bVar) {
        String str = bVar.f56044c;
        Set<Integer> keySet = this.f56053a.keySet();
        C7573i.m23582a((Object) keySet, "nodeMap.keys");
        for (Integer num : keySet) {
            ArrayList<ComposerInfo> arrayList = (ArrayList) this.f56053a.get(num);
            if (arrayList != null) {
                for (ComposerInfo composerInfo : arrayList) {
                    if (C7573i.m23585a((Object) str, (Object) composerInfo.f56036a)) {
                        arrayList.remove(composerInfo);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo56097c(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        this.f56053a.clear();
        this.f56053a.put(Integer.valueOf(i), (ArrayList) list);
        m69304b();
    }

    /* renamed from: d */
    public final void mo56105d(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        ArrayList arrayList = (ArrayList) this.f56053a.get(Integer.valueOf(i));
        if (arrayList != null) {
            arrayList.clear();
        } else {
            arrayList = new ArrayList();
            this.f56053a.put(Integer.valueOf(i), arrayList);
        }
        arrayList.addAll(list);
        m69304b();
    }

    /* renamed from: a */
    public final void mo56068a(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        ArrayList arrayList = (ArrayList) this.f56053a.get(Integer.valueOf(i));
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            this.f56053a.put(Integer.valueOf(i), arrayList2);
        } else {
            arrayList.addAll(list);
        }
        Iterable<ComposerInfo> iterable = list;
        Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ComposerInfo composerInfo : iterable) {
            arrayList3.add(composerInfo.f56036a);
        }
        List list2 = (List) arrayList3;
        Collection arrayList4 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ComposerInfo composerInfo2 : iterable) {
            arrayList4.add(composerInfo2.f56037b);
        }
        List list3 = (List) arrayList4;
        C45382z zVar = this.f56054b;
        Object[] array = list2.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = list2.size();
            Object[] array2 = list3.toArray(new String[0]);
            if (array2 != null) {
                zVar.mo108694b(strArr, size, (String[]) array2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: b */
    public final void mo56089b(List<ComposerInfo> list, int i) {
        C7573i.m23587b(list, "nodes");
        ArrayList arrayList = (ArrayList) this.f56053a.get(Integer.valueOf(i));
        if (arrayList != null) {
            arrayList.removeAll(list);
            Iterable<ComposerInfo> iterable = list;
            Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
            for (ComposerInfo composerInfo : iterable) {
                arrayList2.add(composerInfo.f56036a);
            }
            List list2 = (List) arrayList2;
            C45382z zVar = this.f56054b;
            Object[] array = list2.toArray(new String[0]);
            if (array != null) {
                zVar.mo108693b((String[]) array, list2.size());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new Exception("should not go this case ");
    }

    /* renamed from: a */
    public final void mo56069a(List<ComposerInfo> list, List<ComposerInfo> list2, int i) {
        C7573i.m23587b(list, "oldNodes");
        C7573i.m23587b(list2, "newNodes");
        ArrayList arrayList = (ArrayList) this.f56053a.get(Integer.valueOf(i));
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.removeAll(list);
            arrayList2.addAll(list2);
            this.f56053a.put(Integer.valueOf(i), arrayList2);
        } else {
            arrayList.removeAll(list);
            arrayList.addAll(list2);
        }
        Iterable<ComposerInfo> iterable = list;
        Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ComposerInfo composerInfo : iterable) {
            arrayList3.add(composerInfo.f56036a);
        }
        List list3 = (List) arrayList3;
        Iterable<ComposerInfo> iterable2 = list2;
        Collection arrayList4 = new ArrayList(C7525m.m23469a(iterable2, 10));
        for (ComposerInfo composerInfo2 : iterable2) {
            arrayList4.add(composerInfo2.f56036a);
        }
        List list4 = (List) arrayList4;
        Collection arrayList5 = new ArrayList(C7525m.m23469a(iterable2, 10));
        for (ComposerInfo composerInfo3 : iterable2) {
            arrayList5.add(composerInfo3.f56037b);
        }
        List list5 = (List) arrayList5;
        C45382z zVar = this.f56054b;
        Object[] array = list3.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int size = list3.size();
            Object[] array2 = list4.toArray(new String[0]);
            if (array2 != null) {
                String[] strArr2 = (String[]) array2;
                int size2 = list4.size();
                Object[] array3 = list5.toArray(new String[0]);
                if (array3 != null) {
                    zVar.mo108641a(strArr, size, strArr2, size2, (String[]) array3);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
