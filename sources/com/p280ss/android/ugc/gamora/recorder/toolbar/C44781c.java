package com.p280ss.android.ugc.gamora.recorder.toolbar;

import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.toolbar.c */
public final class C44781c {

    /* renamed from: a */
    public RecordToolbarAdapter f115201a;

    /* renamed from: b */
    public RecordToolbarAdapter f115202b;

    /* renamed from: c */
    public List<? extends C44779b> f115203c;

    /* renamed from: d */
    public List<? extends C44779b> f115204d;

    /* renamed from: e */
    private LinkedList<C44779b> f115205e;

    /* renamed from: f */
    private final C44779b f115206f;

    /* renamed from: a */
    public final RecordToolbarAdapter mo107232a() {
        RecordToolbarAdapter recordToolbarAdapter = this.f115201a;
        if (recordToolbarAdapter == null) {
            C7573i.m23583a("visibleToolbarAdapter");
        }
        return recordToolbarAdapter;
    }

    /* renamed from: b */
    public final RecordToolbarAdapter mo107237b() {
        RecordToolbarAdapter recordToolbarAdapter = this.f115202b;
        if (recordToolbarAdapter == null) {
            C7573i.m23583a("hiddenToolbarAdapter");
        }
        return recordToolbarAdapter;
    }

    /* renamed from: c */
    public final List<C44779b> mo107238c() {
        List<? extends C44779b> list = this.f115203c;
        if (list == null) {
            C7573i.m23583a("visibleToolbarItems");
        }
        return list;
    }

    public C44781c(C44779b bVar) {
        this.f115206f = bVar;
    }

    /* renamed from: a */
    public final void mo107234a(RecordToolbarAdapter recordToolbarAdapter) {
        C7573i.m23587b(recordToolbarAdapter, "<set-?>");
        this.f115201a = recordToolbarAdapter;
    }

    /* renamed from: a */
    private static <T> LinkedList<T> m141314a(LinkedList<T> linkedList) {
        HashSet hashSet = new HashSet(linkedList);
        linkedList.clear();
        linkedList.addAll(hashSet);
        return linkedList;
    }

    /* renamed from: b */
    private final RecordToolbarAdapter m141316b(C44779b bVar) {
        RecordToolbarAdapter recordToolbarAdapter;
        RecordToolbarAdapter recordToolbarAdapter2 = this.f115201a;
        if (recordToolbarAdapter2 == null) {
            C7573i.m23583a("visibleToolbarAdapter");
        }
        if (recordToolbarAdapter2.mo107172a(bVar)) {
            recordToolbarAdapter = this.f115201a;
            if (recordToolbarAdapter == null) {
                C7573i.m23583a("visibleToolbarAdapter");
                return recordToolbarAdapter;
            }
        } else {
            RecordToolbarAdapter recordToolbarAdapter3 = this.f115202b;
            if (recordToolbarAdapter3 == null) {
                C7573i.m23583a("hiddenToolbarAdapter");
            }
            if (recordToolbarAdapter3.mo107172a(bVar)) {
                recordToolbarAdapter = this.f115202b;
                if (recordToolbarAdapter == null) {
                    C7573i.m23583a("hiddenToolbarAdapter");
                    return recordToolbarAdapter;
                }
            } else {
                recordToolbarAdapter = null;
            }
        }
        return recordToolbarAdapter;
    }

    /* renamed from: a */
    public final void mo107235a(C44779b bVar) {
        C7573i.m23587b(bVar, "model");
        RecordToolbarAdapter b = m141316b(bVar);
        if (b != null) {
            b.notifyItemChanged(b.mo107173b(bVar));
        }
    }

    /* renamed from: b */
    private final Pair<List<C44779b>, List<C44779b>> m141317b(List<? extends C44779b> list, int i) {
        LinkedList linkedList;
        LinkedList linkedList2;
        if (list.size() <= i || this.f115206f == null) {
            linkedList2 = new LinkedList(list);
            linkedList = new LinkedList();
        } else {
            int i2 = i - 1;
            linkedList2 = new LinkedList(list.subList(0, i2));
            linkedList2.addLast(this.f115206f);
            linkedList = new LinkedList(list.subList(i2, list.size()));
        }
        return new Pair<>(linkedList2, linkedList);
    }

    /* renamed from: a */
    public final void mo107236a(List<? extends C44779b> list, int i) {
        C7573i.m23587b(list, "toolbarItems");
        this.f115205e = new LinkedList<>(list);
        Pair b = m141317b(list, i);
        this.f115203c = (List) b.getFirst();
        this.f115204d = (List) b.getSecond();
        List<? extends C44779b> list2 = this.f115203c;
        if (list2 == null) {
            C7573i.m23583a("visibleToolbarItems");
        }
        this.f115201a = new RecordToolbarAdapter(list2);
        List<? extends C44779b> list3 = this.f115204d;
        if (list3 == null) {
            C7573i.m23583a("hiddenToolbarItems");
        }
        this.f115202b = new RecordToolbarAdapter(list3);
    }

    /* renamed from: a */
    private static void m141315a(List<? extends C44779b> list, List<? extends C44779b> list2, RecordToolbarAdapter recordToolbarAdapter) {
        C1146b a = C1143a.m5067a(new RecordToolbarDiffCallback(list, list2), true);
        C7573i.m23582a((Object) a, "DiffUtil.calculateDiff(diffCallback, true)");
        recordToolbarAdapter.mo107171a(list2);
        a.mo4548a((C1262a) recordToolbarAdapter);
    }

    /* renamed from: a */
    public final void mo107233a(int i, List<? extends C44779b> list, List<? extends C44779b> list2) {
        C7573i.m23587b(list, "newItems");
        C7573i.m23587b(list2, "deleteItems");
        LinkedList<C44779b> linkedList = this.f115205e;
        if (linkedList == null) {
            C7573i.m23583a("toolbarItems");
        }
        linkedList.addAll(list);
        LinkedList<C44779b> linkedList2 = this.f115205e;
        if (linkedList2 == null) {
            C7573i.m23583a("toolbarItems");
        }
        linkedList2.removeAll(list2);
        LinkedList<C44779b> linkedList3 = this.f115205e;
        if (linkedList3 == null) {
            C7573i.m23583a("toolbarItems");
        }
        C7525m.m23475c(m141314a(linkedList3));
        LinkedList<C44779b> linkedList4 = this.f115205e;
        if (linkedList4 == null) {
            C7573i.m23583a("toolbarItems");
        }
        Pair b = m141317b(linkedList4, i);
        List<? extends C44779b> list3 = (List) b.component1();
        List<? extends C44779b> list4 = (List) b.component2();
        List<? extends C44779b> list5 = this.f115203c;
        if (list5 == null) {
            C7573i.m23583a("visibleToolbarItems");
        }
        RecordToolbarAdapter recordToolbarAdapter = this.f115201a;
        if (recordToolbarAdapter == null) {
            C7573i.m23583a("visibleToolbarAdapter");
        }
        m141315a(list5, list3, recordToolbarAdapter);
        this.f115203c = list3;
        List<? extends C44779b> list6 = this.f115204d;
        if (list6 == null) {
            C7573i.m23583a("hiddenToolbarItems");
        }
        RecordToolbarAdapter recordToolbarAdapter2 = this.f115202b;
        if (recordToolbarAdapter2 == null) {
            C7573i.m23583a("hiddenToolbarAdapter");
        }
        m141315a(list6, list4, recordToolbarAdapter2);
        this.f115204d = list4;
    }
}
