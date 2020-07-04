package com.bytedance.scene.group;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.util.C0902i;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12673r;
import com.bytedance.scene.State;
import com.bytedance.scene.navigation.C12648d;
import com.bytedance.scene.p639a.C12562b;
import com.bytedance.scene.utlity.C12691b;
import com.bytedance.scene.utlity.C12700j;
import com.bytedance.scene.utlity.SceneInternalException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.group.c */
final class C12606c {

    /* renamed from: d */
    public static final HashMap<C12629j, C12691b> f33453d = new HashMap<>();

    /* renamed from: g */
    private static final Runnable f33454g = new Runnable() {
        public final void run() {
        }
    };

    /* renamed from: a */
    public final C12604b f33455a;

    /* renamed from: b */
    public ViewGroup f33456b;

    /* renamed from: c */
    public final C12603a f33457c = new C12603a();

    /* renamed from: e */
    private final Handler f33458e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final Set<C0902i<C12629j, String>> f33459f = new HashSet();

    /* renamed from: h */
    private boolean f33460h = false;

    /* renamed from: i */
    private List<C12616d> f33461i = new ArrayList();

    /* renamed from: com.bytedance.scene.group.c$a */
    final class C12612a extends C12614c {

        /* renamed from: a */
        final int f33469a;

        /* renamed from: b */
        final String f33470b;

        /* renamed from: c */
        final C12562b f33471c;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo30981a(boolean z) {
            super.mo30981a(z);
            if (z) {
            }
        }

        private C12612a(int i, C12629j jVar, String str, C12562b bVar) {
            super(jVar, i, str, C12606c.m36582a(State.RESUMED, C12606c.this.f33455a.f33528f), true, false, false);
            this.f33469a = i;
            this.f33470b = str;
            this.f33471c = bVar;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$b */
    final class C12613b extends C12614c {

        /* renamed from: b */
        private final C12562b f33474b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo30981a(boolean z) {
            super.mo30981a(z);
            if (this.f33480i.f33523b != null) {
                C12606c.m36586a(this.f33480i, 8);
                if (z) {
                }
            }
        }

        private C12613b(C12629j jVar, C12562b bVar) {
            super(jVar, -1, null, C12606c.m36582a(State.ACTIVITY_CREATED, C12606c.this.f33455a.f33528f), false, true, false);
            this.f33474b = bVar;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$c */
    abstract class C12614c extends C12616d {

        /* renamed from: e */
        final int f33475e;

        /* renamed from: f */
        final String f33476f;

        /* renamed from: g */
        final State f33477g;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo30981a(boolean z) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo30983b(boolean z) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo30982a(Runnable runnable) {
            C12691b bVar = (C12691b) C12606c.f33453d.get(this.f33480i);
            if (bVar != null) {
                bVar.mo31149b();
                if (C12606c.f33453d.get(this.f33480i) != null) {
                    throw new SceneInternalException("CancellationSignal cancel callback should remove target Scene from CancellationSignal map");
                }
            }
            if (!C12606c.this.mo30976f(this.f33480i)) {
                if (this.f33480i.f33528f == State.NONE) {
                    C12700j.m36907a(this.f33476f, "tag can't be null");
                    C12606c.this.f33457c.mo30917a(GroupRecord.m36521a(this.f33475e, this.f33480i, this.f33476f));
                } else {
                    StringBuilder sb = new StringBuilder("Scene state is ");
                    sb.append(this.f33480i.f33528f.name);
                    sb.append(" but it is not added to record list");
                    throw new SceneInternalException(sb.toString());
                }
            }
            boolean z = false;
            if (this.f33482k) {
                C12606c.this.f33457c.mo30912a(this.f33480i).f33439d = false;
            }
            if (this.f33483l) {
                C12606c.this.f33457c.mo30912a(this.f33480i).f33439d = true;
            }
            if (this.f33480i.f33528f != this.f33477g) {
                z = true;
            }
            mo30983b(z);
            C12606c.this.mo30966a(this.f33480i);
            C12606c.m36584a(C12606c.this.f33455a, this.f33480i, this.f33477g, this.f33484m, new Runnable() {
                public final void run() {
                    C12606c.this.mo30970b(C12614c.this.f33480i);
                }
            });
            if (this.f33484m) {
                C12606c.this.f33457c.mo30919b(C12606c.this.f33457c.mo30912a(this.f33480i));
            }
            mo30981a(z);
            runnable.run();
        }

        C12614c(C12629j jVar, int i, String str, State state, boolean z, boolean z2, boolean z3) {
            super(jVar, state, z, z2, z3);
            if (!z || !z2) {
                this.f33475e = i;
                this.f33476f = str;
                this.f33477g = state;
                return;
            }
            throw new IllegalArgumentException("cant forceShow with forceHide");
        }
    }

    /* renamed from: com.bytedance.scene.group.c$d */
    abstract class C12616d {

        /* renamed from: i */
        final C12629j f33480i;

        /* renamed from: j */
        final State f33481j;

        /* renamed from: k */
        final boolean f33482k;

        /* renamed from: l */
        final boolean f33483l;

        /* renamed from: m */
        final boolean f33484m;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo30982a(Runnable runnable);

        C12616d(C12629j jVar, State state, boolean z, boolean z2, boolean z3) {
            this.f33480i = jVar;
            this.f33481j = state;
            this.f33482k = z;
            this.f33483l = z2;
            this.f33484m = z3;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$e */
    final class C12617e extends C12614c {

        /* renamed from: a */
        public final View f33486a;

        /* renamed from: b */
        public final ViewGroup f33487b;

        /* renamed from: c */
        public int f33488c;

        /* renamed from: o */
        private final C12562b f33490o;

        /* renamed from: p */
        private final boolean f33491p;

        /* renamed from: q */
        private boolean f33492q;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo30983b(boolean z) {
            super.mo30983b(z);
            if (!z || this.f33491p) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo30981a(boolean z) {
            super.mo30981a(z);
            if (z && this.f33492q) {
                this.f33488c = this.f33486a.getVisibility();
                this.f33486a.setVisibility(0);
            }
        }

        private C12617e(C12629j jVar, C12562b bVar) {
            boolean z;
            super(jVar, -1, null, State.NONE, false, false, true);
            this.f33490o = bVar;
            if (jVar.f33523b == null || jVar.f33523b.getParent() == null) {
                z = false;
            } else {
                z = true;
            }
            this.f33491p = z;
            if (this.f33491p) {
                this.f33486a = jVar.f33523b;
                this.f33487b = (ViewGroup) this.f33486a.getParent();
                return;
            }
            this.f33486a = null;
            this.f33487b = null;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$f */
    final class C12618f extends C12614c {

        /* renamed from: b */
        private final C12562b f33494b;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo30981a(boolean z) {
            super.mo30981a(z);
            if (!z || this.f33480i.f33523b != null) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo30983b(boolean z) {
            super.mo30983b(z);
            if (this.f33480i.f33523b != null) {
                C12606c.m36586a(this.f33480i, 0);
            }
        }

        private C12618f(C12629j jVar, C12562b bVar) {
            super(jVar, -1, null, C12606c.m36582a(State.RESUMED, C12606c.this.f33455a.f33528f), true, false, false);
            this.f33494b = bVar;
        }
    }

    /* renamed from: com.bytedance.scene.group.c$g */
    final class C12619g extends C12614c {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo30981a(boolean z) {
            super.mo30981a(z);
            if (this.f33480i.f33523b != null && this.f33483l) {
                C12606c.m36586a(this.f33480i, 8);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo30983b(boolean z) {
            super.mo30983b(z);
            if (this.f33480i.f33523b != null && this.f33482k) {
                C12606c.m36586a(this.f33480i, 0);
            }
        }

        C12619g(C12629j jVar, int i, String str, State state, boolean z, boolean z2, boolean z3) {
            super(jVar, i, str, state, z, z2, z3);
        }
    }

    /* renamed from: a */
    public final void mo30966a(C12629j jVar) {
        for (C0902i iVar : this.f33459f) {
            if (iVar.f3154a == jVar) {
                throw new SceneInternalException("Target scene is already tracked");
            }
        }
        C12648d dVar = this.f33455a.f33527e;
        this.f33459f.add(C0902i.m3837a(jVar, dVar != null ? dVar.mo31054a(jVar.toString()) : null));
    }

    /* renamed from: a */
    public final void mo30967a(C12629j jVar, C12562b bVar) {
        m36589g(jVar);
        if (this.f33460h || this.f33457c.mo30912a(jVar) != null) {
            C12617e eVar = new C12617e(jVar, bVar);
            if (this.f33460h) {
                this.f33461i.add(eVar);
            } else {
                m36585a((C12616d) eVar);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30965a(State state) {
        List c = m36587c();
        for (int i = 0; i <= c.size() - 1; i++) {
            final C12629j jVar = (C12629j) c.get(i);
            if (mo30976f(jVar)) {
                mo30966a(jVar);
                m36584a(this.f33455a, jVar, state, false, new Runnable() {
                    public final void run() {
                        C12606c.this.mo30970b(jVar);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30964a(Bundle bundle) {
        this.f33457c.mo30916a(bundle);
        ArrayList arrayList = new ArrayList();
        List c = m36587c();
        for (int i = 0; i <= c.size() - 1; i++) {
            C12629j jVar = (C12629j) c.get(i);
            Bundle bundle2 = new Bundle();
            jVar.mo30939c(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:group_scene_manager", arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo30963a(Context context, Bundle bundle) {
        this.f33457c.mo30915a(context, bundle);
        List b = this.f33457c.mo30918b();
        if (b.size() != 0) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:group_scene_manager");
            int i = 0;
            while (i <= b.size() - 1) {
                GroupRecord groupRecord = (GroupRecord) b.get(i);
                final C12629j jVar = groupRecord.f33437b;
                groupRecord.f33442g = (Bundle) parcelableArrayList.get(i);
                if (mo30976f(jVar)) {
                    mo30966a(jVar);
                    m36584a(this.f33455a, jVar, this.f33455a.f33528f, false, new Runnable() {
                        public final void run() {
                            C12606c.this.mo30970b(jVar);
                        }
                    });
                    i++;
                } else {
                    throw new SceneInternalException("Scene is not found");
                }
            }
        }
    }

    /* renamed from: c */
    private List<C12629j> m36587c() {
        return this.f33457c.mo30914a();
    }

    /* renamed from: d */
    private List<GroupRecord> m36588d() {
        return this.f33457c.mo30918b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30968b() {
        if (this.f33460h) {
            if (this.f33461i.size() > 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (C12616d dVar : this.f33461i) {
                    List list = (List) linkedHashMap.get(dVar.f33480i);
                    if (list == null) {
                        list = new ArrayList();
                        linkedHashMap.put(dVar.f33480i, list);
                    }
                    list.add(dVar);
                }
                for (C12629j jVar : linkedHashMap.keySet()) {
                    List list2 = (List) linkedHashMap.get(jVar);
                    State state = jVar.f33528f;
                    State state2 = ((C12616d) list2.get(list2.size() - 1)).f33481j;
                    boolean z = ((C12616d) list2.get(list2.size() - 1)).f33482k;
                    boolean z2 = ((C12616d) list2.get(list2.size() - 1)).f33483l;
                    boolean z3 = ((C12616d) list2.get(list2.size() - 1)).f33484m;
                    if (state != state2 || z || z2 || z3) {
                        if (state == State.NONE) {
                            C12612a a = m36583a(list2);
                            if (a == null) {
                                throw new IllegalStateException("you must add Scene first");
                            } else if (mo30960a(a.f33470b) == null) {
                                C12619g gVar = new C12619g(jVar, a.f33469a, a.f33470b, state2, z, z2, z3);
                                m36585a((C12616d) gVar);
                            } else {
                                StringBuilder sb = new StringBuilder("already have a Scene with tag ");
                                sb.append(a.f33470b);
                                throw new IllegalStateException(sb.toString());
                            }
                        } else {
                            C12619g gVar2 = new C12619g(jVar, -1, null, state2, z, z2, z3);
                            m36585a((C12616d) gVar2);
                        }
                    }
                }
                this.f33461i.clear();
            }
            this.f33460h = false;
            return;
        }
        throw new IllegalStateException("you must call beginTransaction before commitTransaction");
    }

    /* renamed from: a */
    public final void mo30961a() {
        if (!this.f33460h) {
            this.f33460h = true;
            return;
        }
        throw new IllegalStateException("you must call commitTransaction before another beginTransaction");
    }

    /* renamed from: a */
    private static void m36585a(C12616d dVar) {
        C12673r.m36850a("GroupSceneManager#executeOperation");
        dVar.mo30982a(f33454g);
        C12673r.m36849a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final GroupRecord mo30972c(C12629j jVar) {
        return this.f33457c.mo30912a(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo30974d(C12629j jVar) {
        return this.f33457c.mo30912a(jVar).f33436a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final String mo30975e(C12629j jVar) {
        return this.f33457c.mo30912a(jVar).f33438c;
    }

    /* renamed from: a */
    private static C12612a m36583a(List<C12616d> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C12616d dVar = (C12616d) list.get(size);
            if (dVar instanceof C12612a) {
                return (C12612a) dVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo30976f(C12629j jVar) {
        List d = m36588d();
        for (int i = 0; i < d.size(); i++) {
            if (((GroupRecord) d.get(i)).f33437b == jVar) {
                return true;
            }
        }
        return false;
    }

    C12606c(C12604b bVar) {
        this.f33455a = bVar;
    }

    /* renamed from: g */
    private void m36589g(C12629j jVar) {
        for (C0902i iVar : this.f33459f) {
            if (iVar.f3154a == jVar) {
                StringBuilder sb = new StringBuilder("Cant add/remove/show/hide ");
                sb.append(jVar.getClass().getSimpleName());
                sb.append(" before it finish previous add/remove/show/hide operation or in its lifecycle method");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo30969b(State state) {
        List d = m36588d();
        for (int i = 0; i <= d.size() - 1; i++) {
            GroupRecord groupRecord = (GroupRecord) d.get(i);
            if (!groupRecord.f33439d) {
                final C12629j jVar = groupRecord.f33437b;
                if (mo30976f(jVar)) {
                    mo30966a(jVar);
                    m36584a(this.f33455a, groupRecord.f33437b, state, false, new Runnable() {
                        public final void run() {
                            C12606c.this.mo30970b(jVar);
                        }
                    });
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final GroupRecord mo30959a(View view) {
        return this.f33457c.mo30911a(view);
    }

    /* renamed from: b */
    public final void mo30970b(C12629j jVar) {
        C0902i iVar;
        Iterator it = this.f33459f.iterator();
        while (true) {
            if (!it.hasNext()) {
                iVar = null;
                break;
            }
            iVar = (C0902i) it.next();
            if (iVar.f3154a == jVar) {
                break;
            }
        }
        if (iVar != null) {
            if (((String) iVar.f3155b) != null) {
                this.f33455a.f33527e.mo31068b((String) iVar.f3155b);
            }
            this.f33459f.remove(iVar);
            return;
        }
        throw new SceneInternalException("Target scene is not tracked");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final GroupRecord mo30960a(String str) {
        return this.f33457c.mo30913a(str);
    }

    /* renamed from: a */
    public static State m36582a(State state, State state2) {
        if (state.value < state2.value) {
            return state;
        }
        return state2;
    }

    /* renamed from: a */
    public static void m36586a(C12629j jVar, int i) {
        View view = jVar.f33523b;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: c */
    public final void mo30973c(C12629j jVar, C12562b bVar) {
        m36589g(jVar);
        if (this.f33460h || this.f33457c.mo30912a(jVar) != null) {
            C12618f fVar = new C12618f(jVar, bVar);
            if (this.f33460h) {
                this.f33461i.add(fVar);
            } else {
                m36585a((C12616d) fVar);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    /* renamed from: b */
    public final void mo30971b(C12629j jVar, C12562b bVar) {
        m36589g(jVar);
        if (this.f33460h || this.f33457c.mo30912a(jVar) != null) {
            C12613b bVar2 = new C12613b(jVar, bVar);
            if (this.f33460h) {
                this.f33461i.add(bVar2);
            } else {
                m36585a((C12616d) bVar2);
            }
        } else {
            throw new IllegalStateException("Target scene is not find");
        }
    }

    /* renamed from: a */
    public final void mo30962a(int i, C12629j jVar, String str, C12562b bVar) {
        m36589g(jVar);
        C12612a aVar = new C12612a(i, jVar, str, bVar);
        if (this.f33460h) {
            this.f33461i.add(aVar);
        } else {
            m36585a((C12616d) aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r0 = r4.f33523b;
        r4.mo30954k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
        if (r6 == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        com.bytedance.scene.utlity.C12700j.m36911a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m36584a(com.bytedance.scene.group.C12604b r3, com.bytedance.scene.C12629j r4, com.bytedance.scene.State r5, boolean r6, java.lang.Runnable r7) {
        /*
        L_0x0000:
            com.bytedance.scene.State r0 = r4.f33528f
            if (r0 != r5) goto L_0x000a
            if (r7 == 0) goto L_0x0009
            r7.run()
        L_0x0009:
            return
        L_0x000a:
            int r1 = r0.value
            int r2 = r5.value
            if (r1 >= r2) goto L_0x0072
            int[] r1 = com.bytedance.scene.group.C12606c.C126115.f33468a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x003d;
                case 2: goto L_0x002b;
                case 3: goto L_0x0023;
                case 4: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x0071
        L_0x001c:
            r4.mo30951h()
            m36584a(r3, r4, r5, r6, r7)
            goto L_0x0071
        L_0x0023:
            r4.mo30950g()
            m36584a(r3, r4, r5, r6, r7)
            goto L_0x00ae
        L_0x002b:
            com.bytedance.scene.group.c r0 = r3.f33450i
            com.bytedance.scene.group.GroupRecord r0 = r0.mo30972c(r4)
            android.os.Bundle r1 = r0.f33442g
            r4.mo30934b(r1)
            r1 = 0
            r0.f33442g = r1
            m36584a(r3, r4, r5, r6, r7)
            goto L_0x00ae
        L_0x003d:
            android.app.Activity r0 = r3.mo31015v()
            r4.mo30926a(r0)
            r4.mo30930a(r3)
            com.bytedance.scene.group.c r0 = r3.f33450i
            com.bytedance.scene.group.GroupRecord r0 = r0.mo30972c(r4)
            android.os.Bundle r1 = r0.f33442g
            r4.mo30927a(r1)
            com.bytedance.scene.group.c r2 = r3.f33450i
            int r2 = r2.mo30974d(r4)
            android.view.ViewGroup r2 = r3.mo30943d(r2)
            r4.mo30928a(r1, r2)
            android.view.View r1 = r4.f33523b
            r2.addView(r1)
            boolean r0 = r0.f33439d
            if (r0 == 0) goto L_0x006d
            r0 = 8
            m36586a(r4, r0)
        L_0x006d:
            m36584a(r3, r4, r5, r6, r7)
            goto L_0x00ae
        L_0x0071:
            return
        L_0x0072:
            int[] r1 = com.bytedance.scene.group.C12606c.C126115.f33468a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 2: goto L_0x0099;
                case 3: goto L_0x008c;
                case 4: goto L_0x0085;
                case 5: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x00ae
        L_0x007e:
            r4.mo30952i()
            m36584a(r3, r4, r5, r6, r7)
            return
        L_0x0085:
            r4.mo30953j()
            m36584a(r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x00af }
            return
        L_0x008c:
            com.bytedance.scene.State r0 = com.bytedance.scene.State.VIEW_CREATED
            if (r5 == r0) goto L_0x0091
            goto L_0x0099
        L_0x0091:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "cant switch state ACTIVITY_CREATED to VIEW_CREATED"
            r3.<init>(r4)
            throw r3
        L_0x0099:
            android.view.View r0 = r4.f33523b
            r4.mo30954k()
            if (r6 == 0) goto L_0x00a3
            com.bytedance.scene.utlity.C12700j.m36911a(r0)
        L_0x00a3:
            r4.mo30955l()
            r4.mo30956m()
            r4.mo30957n()
            goto L_0x0000
        L_0x00ae:
            return
        L_0x00af:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.C12606c.m36584a(com.bytedance.scene.group.b, com.bytedance.scene.j, com.bytedance.scene.State, boolean, java.lang.Runnable):void");
    }
}
