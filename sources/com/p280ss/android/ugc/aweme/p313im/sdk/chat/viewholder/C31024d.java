package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.p1315b.C30737e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.d */
public final class C31024d {

    /* renamed from: a */
    private static Map<Integer, C31025a> f81438a = new ConcurrentHashMap();

    /* renamed from: b */
    private static List<BaseContent> f81439b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private static Set<String> f81440c = new HashSet();

    /* renamed from: d */
    private static int f81441d = -1;

    /* renamed from: e */
    private static boolean f81442e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.d$a */
    static class C31025a {

        /* renamed from: a */
        public int f81443a = -1;

        /* renamed from: a */
        public void mo81458a(int i) {
        }

        /* renamed from: a */
        public void mo81459a(boolean z) {
        }

        /* renamed from: a */
        public boolean mo81460a() {
            return false;
        }

        /* renamed from: b */
        public void mo81461b(int i) {
        }

        public C31025a(int i) {
            this.f81443a = i;
        }
    }

    /* renamed from: c */
    public static void m101260c() {
        C30737e.m100133a(C31027f.f81445a, 200);
    }

    static {
        Set E = C7076p.m22077a().mo18289E();
        if (!C6307b.m19566a((Collection<T>) E)) {
            f81440c.addAll(E);
        }
    }

    /* renamed from: a */
    public static void m101250a() {
        if (f81438a.get(Integer.valueOf(f81441d)) != null) {
            ((C31025a) f81438a.get(Integer.valueOf(f81441d))).mo81459a(true);
        }
    }

    /* renamed from: b */
    public static void m101257b() {
        C7076p.m22077a().mo18302b(f81440c);
        if (f81438a.get(Integer.valueOf(f81441d)) != null) {
            f81438a.get(Integer.valueOf(f81441d));
        }
        f81438a.clear();
        f81439b.clear();
        f81441d = -1;
        f81442e = false;
    }

    /* renamed from: d */
    static final /* synthetic */ void m101262d() {
        if (f81438a != null) {
            for (Entry value : f81438a.entrySet()) {
                ((C31025a) value.getValue()).mo81459a(false);
            }
        }
    }

    /* renamed from: a */
    private static synchronized void m101251a(int i) {
        synchronized (C31024d.class) {
            f81441d = i;
        }
    }

    /* renamed from: b */
    public static void m101259b(String str) {
        if (f81440c != null) {
            f81440c.add(str);
        }
    }

    /* renamed from: a */
    public static void m101253a(RecyclerView recyclerView) {
        C30737e.m100133a(new C31028g(recyclerView), 800);
    }

    /* renamed from: c */
    static final /* synthetic */ void m101261c(RecyclerView recyclerView) {
        if (recyclerView != null && recyclerView.getAdapter() != null && !f81438a.isEmpty()) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int j = linearLayoutManager.mo5445j();
            int l = linearLayoutManager.mo5447l();
            for (int i = j; i <= l; i++) {
                if (f81438a.get(Integer.valueOf(i)) != null) {
                    ((C31025a) f81438a.get(Integer.valueOf(i))).mo81461b(i);
                }
            }
            if (recyclerView.getAdapter().getItemCount() >= l && j != -1) {
                while (true) {
                    if (j > l) {
                        j = -1;
                        break;
                    }
                    try {
                        int itemViewType = recyclerView.getAdapter().getItemViewType(j);
                        if ((itemViewType == 3 || itemViewType == 4) && linearLayoutManager.mo5767a(linearLayoutManager.mo5432c(j), true, true)) {
                            break;
                        }
                        j++;
                    } catch (Exception unused) {
                        return;
                    }
                }
                if (j != f81441d || f81438a.get(Integer.valueOf(j)) == null || !((C31025a) f81438a.get(Integer.valueOf(j))).mo81460a()) {
                    for (Entry entry : f81438a.entrySet()) {
                        if (!(((Integer) entry.getKey()).intValue() == j || entry.getValue() == null)) {
                            ((C31025a) entry.getValue()).mo81459a(true);
                        }
                    }
                    if (f81438a.get(Integer.valueOf(j)) != null) {
                        ((C31025a) f81438a.get(Integer.valueOf(j))).mo81458a(j);
                        m101251a(j);
                    }
                    f81442e = false;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m101256a(String str) {
        if (!C6307b.m19566a((Collection<T>) f81440c)) {
            return f81440c.contains(str);
        }
        return false;
    }

    /* renamed from: a */
    public static void m101255a(RecyclerView recyclerView, boolean z) {
        f81442e = true;
        m101254a(recyclerView, 0);
    }

    /* renamed from: a */
    public static void m101252a(int i, C31025a aVar) {
        if (f81438a != null && aVar != null) {
            f81438a.put(Integer.valueOf(i), aVar);
        }
    }

    /* renamed from: a */
    public static void m101254a(RecyclerView recyclerView, int i) {
        if (i == 0 && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            C31026e eVar = new C31026e(recyclerView);
            if (!f81442e || f81438a == null || f81438a.size() <= 0) {
                eVar.run();
            } else {
                recyclerView.getAdapter().notifyDataSetChanged();
                C30737e.m100132a(eVar);
            }
        }
    }
}
