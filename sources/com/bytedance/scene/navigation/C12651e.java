package com.bytedance.scene.navigation;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12640l;
import com.bytedance.scene.C12673r;
import com.bytedance.scene.State;
import com.bytedance.scene.group.C12621e;
import com.bytedance.scene.p639a.C12557a;
import com.bytedance.scene.p639a.C12565c;
import com.bytedance.scene.p639a.p641b.C12563a;
import com.bytedance.scene.p642b.C12586e;
import com.bytedance.scene.utlity.C12689a;
import com.bytedance.scene.utlity.C12693c;
import com.bytedance.scene.utlity.C12696f;
import com.bytedance.scene.utlity.C12697g;
import com.bytedance.scene.utlity.SceneInternalException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.navigation.e */
final class C12651e {

    /* renamed from: i */
    public static final Runnable f33588i = new Runnable() {
        public final void run() {
        }
    };

    /* renamed from: a */
    public C12648d f33589a;

    /* renamed from: b */
    public final C12668h f33590b = new C12668h();

    /* renamed from: c */
    public C12647c f33591c;

    /* renamed from: d */
    public final ArrayDeque<C12657b> f33592d = new ArrayDeque<>();

    /* renamed from: e */
    public long f33593e = -1;

    /* renamed from: f */
    public final C12656a f33594f = new C12656a();

    /* renamed from: g */
    public Set<String> f33595g = new HashSet();

    /* renamed from: h */
    public int f33596h = 0;

    /* renamed from: j */
    public boolean f33597j = false;

    /* renamed from: k */
    private final C12645a f33598k = new C12645a(Looper.getMainLooper());

    /* renamed from: l */
    private final List<C12696f<C0043i, C12667g>> f33599l = new ArrayList();

    /* renamed from: m */
    private int f33600m = 0;

    /* renamed from: com.bytedance.scene.navigation.e$a */
    static class C12656a {

        /* renamed from: a */
        private final List<C12693c> f33606a;

        private C12656a() {
            this.f33606a = new ArrayList();
        }

        /* renamed from: a */
        public final void mo31097a() {
            if (this.f33606a.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f33606a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C12693c cVar = (C12693c) it.next();
                    it.remove();
                    cVar.mo31149b();
                }
                this.f33606a.removeAll(arrayList);
            }
        }

        /* renamed from: a */
        public final void mo31098a(C12693c cVar) {
            this.f33606a.add(cVar);
        }

        /* renamed from: b */
        public final void mo31099b(C12693c cVar) {
            this.f33606a.remove(cVar);
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$b */
    interface C12657b {
        /* renamed from: a */
        void mo31100a(Runnable runnable);
    }

    /* renamed from: com.bytedance.scene.navigation.e$c */
    class C12658c implements C12657b {

        /* renamed from: b */
        private final C12565c f33608b;

        /* renamed from: c */
        private final int f33609c;

        /* renamed from: a */
        public final void mo31100a(Runnable runnable) {
            boolean z;
            C12651e.this.mo31092h();
            if (C12651e.this.mo31093i()) {
                if (VERSION.SDK_INT >= 19) {
                    C12651e.this.f33589a.f33523b.cancelPendingInputEvents();
                }
                List c = C12651e.this.f33590b.mo31114c();
                if (this.f33609c <= 0) {
                    StringBuilder sb = new StringBuilder("popCount can not be ");
                    sb.append(this.f33609c);
                    sb.append(" stackSize is ");
                    sb.append(c.size());
                    throw new IllegalArgumentException(sb.toString());
                } else if (this.f33609c >= c.size()) {
                    if (c.size() > 1) {
                        new C12658c(this.f33608b, c.size() - 1).mo31100a(C12651e.f33588i);
                    }
                    C12651e.this.f33589a.mo31071c();
                    runnable.run();
                } else {
                    ArrayList<Record> arrayList = new ArrayList<>();
                    for (int i = 0; i <= this.f33609c - 1; i++) {
                        arrayList.add((Record) c.get((c.size() - 1) - i));
                    }
                    Record record = (Record) c.get((c.size() - this.f33609c) - 1);
                    final Record a = C12651e.this.f33590b.mo31107a();
                    C12629j jVar = a.f33566a;
                    View view = jVar.f33523b;
                    for (Record record2 : arrayList) {
                        C12629j jVar2 = record2.f33566a;
                        C12651e.m36787a(C12651e.this.f33589a, jVar2, State.NONE, null, false, null);
                        C12651e.this.f33590b.mo31112b(record2);
                        if (record2 != a && (jVar2 instanceof C12621e)) {
                            C12651e.this.f33589a.mo31061a((C12621e) jVar2);
                        }
                    }
                    C12629j jVar3 = record.f33566a;
                    if (C12651e.this.f33589a.f33528f.value >= State.STARTED.value) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C12651e.m36787a(C12651e.this.f33589a, jVar3, C12651e.this.f33589a.f33528f, null, false, null);
                    if (a.f33571f != null) {
                        a.f33571f.mo30864a(a.f33570e);
                    }
                    if (record.f33567b) {
                        List c2 = C12651e.this.f33590b.mo31114c();
                        if (c2.size() > 1) {
                            for (int size = c2.size() - 2; size >= 0; size--) {
                                Record record3 = (Record) c2.get(size);
                                C12651e.m36787a(C12651e.this.f33589a, record3.f33566a, C12651e.m36786a(C12651e.this.f33589a.f33528f, State.STARTED), null, false, null);
                                if (!record3.f33567b) {
                                    break;
                                }
                            }
                        }
                    }
                    C12651e.this.mo31081a(record.f33568c);
                    C12651e.this.f33591c.mo31053a(a.f33566a, record.f33566a, false);
                    C12565c cVar = null;
                    if (this.f33608b != null) {
                        a.f33566a.getClass();
                        record.f33566a.getClass();
                        cVar = this.f33608b;
                    }
                    if (cVar == null && a.f33569d != null) {
                        a.f33566a.getClass();
                        record.f33566a.getClass();
                        cVar = a.f33569d;
                    }
                    if (cVar == null) {
                        cVar = C12651e.this.f33589a.f33579n;
                    }
                    C12565c cVar2 = cVar;
                    if (C12651e.this.f33597j || !z || cVar2 == null) {
                        Runnable runnable2 = runnable;
                        if (a.f33566a instanceof C12621e) {
                            C12651e.this.f33589a.mo31061a((C12621e) a.f33566a);
                        }
                        runnable.run();
                        return;
                    }
                    a.f33566a.getClass();
                    record.f33566a.getClass();
                    FrameLayout frameLayout = C12651e.this.f33589a.f33578m;
                    C12689a.m36892c(frameLayout);
                    cVar2.f33340a = frameLayout;
                    final C12693c cVar3 = new C12693c();
                    final Runnable runnable3 = runnable;
                    C126591 r14 = new Runnable() {
                        public final void run() {
                            C12651e.this.f33594f.mo31099b(cVar3);
                            if (a.f33566a instanceof C12621e) {
                                C12651e.this.f33589a.mo31061a((C12621e) a.f33566a);
                            }
                            runnable3.run();
                        }
                    };
                    C12557a aVar = new C12557a(jVar, view, jVar.f33528f, a.f33567b);
                    C12557a aVar2 = new C12557a(record.f33566a, record.f33566a.f33523b, record.f33566a.f33528f, record.f33567b);
                    C12651e.this.f33594f.mo31098a(cVar3);
                    cVar2.mo30843b(C12651e.this.f33589a, C12651e.this.f33589a.f33523b.getRootView(), aVar, aVar2, cVar3, r14);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Can't pop, current NavigationScene state ");
                sb2.append(C12651e.this.f33589a.f33528f.name);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private C12658c(C12565c cVar, int i) {
            this.f33608b = cVar;
            this.f33609c = i;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$d */
    class C12660d implements C12657b {

        /* renamed from: b */
        private final C12565c f33615b;

        /* renamed from: a */
        public final void mo31100a(Runnable runnable) {
            new C12658c(this.f33615b).mo31100a(runnable);
        }

        private C12660d(C12565c cVar) {
            this.f33615b = cVar;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$e */
    class C12661e implements C12657b {

        /* renamed from: b */
        private final C12629j f33617b;

        /* renamed from: c */
        private final C12586e f33618c;

        /* renamed from: a */
        public final void mo31100a(final Runnable runnable) {
            View view;
            C12629j jVar;
            State state;
            C12651e.this.mo31092h();
            if (C12651e.this.mo31093i()) {
                if (VERSION.SDK_INT >= 19) {
                    C12651e.this.f33589a.f33523b.cancelPendingInputEvents();
                }
                Record a = C12651e.this.f33590b.mo31107a();
                C12565c cVar = null;
                if (a != null) {
                    view = a.f33566a.f33523b;
                } else {
                    view = null;
                }
                if (this.f33617b.f33524c == null) {
                    C12697g<C12629j> gVar = this.f33618c.f33406d;
                    boolean z = true;
                    if (gVar != null) {
                        List c = C12651e.this.f33590b.mo31114c();
                        for (int size = c.size() - 1; size >= 0; size--) {
                            Record record = (Record) c.get(size);
                            C12629j jVar2 = record.f33566a;
                            if (gVar.mo31157a(jVar2)) {
                                C12651e.m36787a(C12651e.this.f33589a, jVar2, State.NONE, null, false, null);
                                C12651e.this.f33590b.mo31112b(record);
                            }
                        }
                    }
                    if (a != null && C12651e.this.f33590b.mo31114c().contains(a)) {
                        a.mo31047a();
                        C12629j jVar3 = a.f33566a;
                        if (this.f33618c.f33405c) {
                            state = State.STARTED;
                        } else {
                            state = State.ACTIVITY_CREATED;
                        }
                        C12651e.m36787a(C12651e.this.f33589a, jVar3, C12651e.m36786a(state, C12651e.this.f33589a.f33528f), null, false, null);
                        List c2 = C12651e.this.f33590b.mo31114c();
                        if (c2.size() > 1 && !this.f33618c.f33405c && a.f33567b) {
                            for (int size2 = c2.size() - 2; size2 >= 0; size2--) {
                                Record record2 = (Record) c2.get(size2);
                                C12651e.m36787a(C12651e.this.f33589a, record2.f33566a, C12651e.m36786a(State.ACTIVITY_CREATED, C12651e.this.f33589a.f33528f), null, false, null);
                                if (!record2.f33567b) {
                                    break;
                                }
                            }
                        }
                    }
                    C12565c cVar2 = this.f33618c.f33403a;
                    Record a2 = Record.m36731a(this.f33617b, this.f33618c.f33405c, cVar2);
                    a2.f33571f = this.f33618c.f33404b;
                    C12651e.this.f33590b.mo31111a(a2);
                    C12651e.m36787a(C12651e.this.f33589a, this.f33617b, C12651e.this.f33589a.f33528f, null, false, null);
                    C12647c cVar3 = C12651e.this.f33591c;
                    if (a != null) {
                        jVar = a.f33566a;
                    } else {
                        jVar = null;
                    }
                    cVar3.mo31053a(jVar, this.f33617b, true);
                    if (C12651e.this.f33589a.f33528f.value < State.STARTED.value) {
                        z = false;
                    }
                    if (C12651e.this.f33597j || !z || a == null) {
                        runnable.run();
                    } else {
                        C12565c cVar4 = a2.f33569d;
                        if (cVar4 != null) {
                            a.f33566a.getClass();
                            this.f33617b.getClass();
                            cVar = cVar4;
                        }
                        if (cVar == null && cVar2 != null) {
                            a.f33566a.getClass();
                            this.f33617b.getClass();
                            cVar = cVar2;
                        }
                        if (cVar == null) {
                            cVar = C12651e.this.f33589a.f33579n;
                        }
                        C12565c cVar5 = cVar;
                        if (cVar5 != null) {
                            a.f33566a.getClass();
                            this.f33617b.getClass();
                            C12629j jVar4 = a.f33566a;
                            C12689a.m36892c(C12651e.this.f33589a.f33577l);
                            cVar5.f33340a = C12651e.this.f33589a.f33578m;
                            C12557a aVar = new C12557a(jVar4, view, jVar4.f33528f, a.f33567b);
                            C12557a aVar2 = new C12557a(this.f33617b, this.f33617b.f33523b, this.f33617b.f33528f, a2.f33567b);
                            final C12693c cVar6 = new C12693c();
                            C12651e.this.f33594f.mo31098a(cVar6);
                            cVar5.mo30841a(C12651e.this.f33589a, C12651e.this.f33589a.f33523b.getRootView(), aVar, aVar2, cVar6, new Runnable() {
                                public final void run() {
                                    C12651e.this.f33594f.mo31099b(cVar6);
                                    runnable.run();
                                }
                            });
                        } else {
                            runnable.run();
                        }
                    }
                } else if (this.f33617b.f33524c == C12651e.this.f33589a) {
                    runnable.run();
                } else {
                    StringBuilder sb = new StringBuilder("Scene already has a parent, parent ");
                    sb.append(this.f33617b.f33524c);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Can't push, current NavigationScene state ");
                sb2.append(C12651e.this.f33589a.f33528f.name);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        private C12661e(C12629j jVar, C12586e eVar) {
            this.f33617b = jVar;
            this.f33618c = eVar;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$f */
    class C12663f implements C12657b {

        /* renamed from: b */
        private final C12629j f33623b;

        /* renamed from: a */
        public final void mo31100a(Runnable runnable) {
            if (C12651e.this.mo31088d() == this.f33623b) {
                new C12660d().mo31100a(runnable);
                return;
            }
            List c = C12651e.this.f33590b.mo31114c();
            int size = c.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Record record = (Record) c.get(size);
                if (record.f33566a == this.f33623b) {
                    if (size == c.size() - 2) {
                        C12651e.this.mo31092h();
                    }
                    State state = this.f33623b.f33528f;
                    C12651e.m36787a(C12651e.this.f33589a, this.f33623b, State.NONE, null, false, null);
                    C12651e.this.f33590b.mo31112b(record);
                    if (size > 0) {
                        C12651e.m36787a(C12651e.this.f33589a, ((Record) c.get(size - 1)).f33566a, state, null, false, null);
                    }
                } else {
                    size--;
                }
            }
            runnable.run();
        }

        private C12663f(C12629j jVar) {
            this.f33623b = jVar;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$g */
    class C12664g implements C12657b {

        /* renamed from: b */
        private final State f33625b;

        /* renamed from: a */
        public final void mo31100a(Runnable runnable) {
            if (C12651e.this.mo31090f() == null) {
                runnable.run();
                return;
            }
            for (Record record : C12651e.this.f33590b.mo31114c()) {
                C12651e.m36787a(C12651e.this.f33589a, record.f33566a, this.f33625b, null, true, null);
            }
            runnable.run();
        }

        private C12664g(State state) {
            this.f33625b = state;
        }
    }

    /* renamed from: com.bytedance.scene.navigation.e$h */
    class C12665h implements C12657b {

        /* renamed from: b */
        private final State f33627b;

        /* renamed from: a */
        public final void mo31100a(Runnable runnable) {
            if (C12651e.this.mo31090f() == null) {
                runnable.run();
                return;
            }
            List c = C12651e.this.f33590b.mo31114c();
            State state = this.f33627b;
            for (int size = c.size() - 1; size >= 0; size--) {
                Record record = (Record) c.get(size);
                if (size != c.size() - 1) {
                    State state2 = null;
                    if (state == State.RESUMED) {
                        state2 = State.STARTED;
                    } else if (state == State.STARTED) {
                        state2 = State.STARTED;
                    } else if (state == State.ACTIVITY_CREATED) {
                        state2 = State.ACTIVITY_CREATED;
                    } else if (state == State.VIEW_CREATED) {
                        state2 = State.VIEW_CREATED;
                    }
                    C12651e.m36787a(C12651e.this.f33589a, record.f33566a, state2, null, true, runnable);
                    if (!record.f33567b) {
                        break;
                    }
                } else {
                    C12651e.m36787a(C12651e.this.f33589a, record.f33566a, state, null, true, runnable);
                    if (!record.f33567b) {
                        break;
                    }
                }
            }
            runnable.run();
        }

        private C12665h(State state) {
            this.f33627b = state;
        }
    }

    /* renamed from: a */
    public final void mo31079a(C12629j jVar) {
        m36788a((C12657b) new C12663f(jVar));
    }

    /* renamed from: a */
    public final void mo31080a(C12629j jVar, C12586e eVar) {
        if (jVar != null) {
            m36788a((C12657b) new C12661e(jVar, eVar));
            return;
        }
        throw new NullPointerException("scene can't be null");
    }

    /* renamed from: a */
    public final void mo31081a(ActivityStatusRecord activityStatusRecord) {
        activityStatusRecord.mo31040b(this.f33589a.f33526d_);
    }

    /* renamed from: a */
    public final void mo31082a(C12667g gVar) {
        C12696f fVar;
        int size = this.f33599l.size() - 1;
        while (true) {
            if (size < 0) {
                fVar = null;
                break;
            }
            fVar = (C12696f) this.f33599l.get(size);
            if (fVar.f33696b == gVar) {
                break;
            }
            size--;
        }
        this.f33599l.remove(fVar);
    }

    /* renamed from: c */
    public final boolean mo31087c() {
        return this.f33590b.mo31113b();
    }

    /* renamed from: f */
    public final Record mo31090f() {
        return this.f33590b.mo31107a();
    }

    /* renamed from: a */
    public final void mo31074a() {
        m36788a((C12657b) new C12660d());
    }

    /* renamed from: d */
    public final C12629j mo31088d() {
        Record a = this.f33590b.mo31107a();
        if (a != null) {
            return a.f33566a;
        }
        return null;
    }

    /* renamed from: h */
    public final void mo31092h() {
        this.f33594f.mo31097a();
        C12563a.m36473a();
    }

    /* renamed from: i */
    public final boolean mo31093i() {
        if (this.f33589a.f33528f.value >= State.ACTIVITY_CREATED.value) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final List<C12629j> mo31089e() {
        List<Record> c = this.f33590b.mo31114c();
        ArrayList arrayList = new ArrayList();
        for (Record record : c) {
            arrayList.add(record.f33566a);
        }
        return arrayList;
    }

    /* renamed from: g */
    public final boolean mo31091g() {
        ArrayList arrayList = new ArrayList(this.f33599l);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C12667g) ((C12696f) arrayList.get(size)).f33696b).mo31072a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo31084b() {
        boolean z;
        boolean z2;
        if (this.f33592d.size() != 0 && mo31093i()) {
            C12673r.m36850a("NavigationSceneManager#executePendingOperation");
            if (System.currentTimeMillis() - this.f33593e > 800) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList(this.f33592d);
            for (int i = 0; i < arrayList.size(); i++) {
                C12657b bVar = (C12657b) arrayList.get(i);
                if (i < arrayList.size() - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f33597j = z2 | z;
                String a = mo31073a("NavigationManager executePendingOperation");
                bVar.mo31100a(f33588i);
                mo31086b(a);
                this.f33597j = false;
            }
            this.f33592d.removeAll(arrayList);
            if (this.f33592d.size() <= 0) {
                this.f33593e = -1;
                C12673r.m36849a();
                return;
            }
            throw new IllegalStateException("why mPendingActionList still have item?");
        }
    }

    /* renamed from: b */
    public final Record mo31083b(C12629j jVar) {
        return this.f33590b.mo31108a(jVar);
    }

    /* renamed from: b */
    public final void mo31085b(State state) {
        String a = mo31073a("NavigationManager dispatchChildrenState");
        new C12664g(state).mo31100a(f33588i);
        mo31086b(a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo31073a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        int i = this.f33600m;
        this.f33600m = i + 1;
        sb.append(i);
        String sb2 = sb.toString();
        if (this.f33595g.add(sb2)) {
            return sb2;
        }
        throw new SceneInternalException("suppressTag already exists");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31086b(String str) {
        if (!this.f33595g.remove(str)) {
            throw new SceneInternalException("suppressTag not found");
        } else if (this.f33595g.size() == 0) {
            this.f33600m = 0;
        }
    }

    C12651e(C12648d dVar) {
        this.f33589a = dVar;
        this.f33591c = dVar;
    }

    /* renamed from: a */
    private void m36788a(final C12657b bVar) {
        if (!mo31093i()) {
            this.f33592d.addLast(bVar);
            this.f33593e = System.currentTimeMillis();
        } else if (this.f33595g.size() > 0 || this.f33596h > 0) {
            C126521 r0 = new Runnable() {
                public final void run() {
                    C12651e.this.f33596h--;
                    if (C12651e.this.f33595g.size() > 0) {
                        String join = TextUtils.join(",", C12651e.this.f33595g);
                        StringBuilder sb = new StringBuilder("miss endSuppressStackOperation(), mIsNavigationStateChangeInProgress content ");
                        sb.append(join);
                        throw new SceneInternalException(sb.toString());
                    } else if (C12651e.this.mo31093i()) {
                        C12673r.m36850a("NavigationSceneManager#executeOperation");
                        String a = C12651e.this.mo31073a("NavigationManager execute operation by Handler.post()");
                        bVar.mo31100a(C12651e.f33588i);
                        C12651e.this.mo31086b(a);
                        C12673r.m36849a();
                    } else {
                        C12651e.this.f33592d.addLast(bVar);
                        C12651e.this.f33593e = System.currentTimeMillis();
                    }
                }
            };
            this.f33596h++;
            this.f33598k.mo31052a(r0);
        } else {
            C12673r.m36850a("NavigationSceneManager#executeOperation");
            String a = mo31073a("NavigationManager execute operation directly");
            try {
                bVar.mo31100a(f33588i);
            } catch (Throwable th) {
                mo31086b(a);
                throw th;
            }
            mo31086b(a);
            C12673r.m36849a();
        }
    }

    /* renamed from: a */
    public final void mo31077a(Bundle bundle) {
        this.f33590b.mo31110a(bundle);
        ArrayList arrayList = new ArrayList();
        for (Record record : this.f33590b.mo31114c()) {
            Bundle bundle2 = new Bundle();
            record.f33566a.mo30939c(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList("bd-scene-nav:navigation_scene_manager", arrayList);
    }

    /* renamed from: a */
    public final void mo31078a(State state) {
        String a = mo31073a("NavigationManager dispatchCurrentChildState");
        new C12665h(state).mo31100a(f33588i);
        mo31086b(a);
    }

    /* renamed from: a */
    public static State m36786a(State state, State state2) {
        if (state.value > state2.value) {
            return state2;
        }
        return state;
    }

    /* renamed from: a */
    public final void mo31075a(C0043i iVar, C12667g gVar) {
        this.f33599l.add(C12696f.m36901a(iVar, gVar));
    }

    /* renamed from: a */
    public final void mo31076a(Context context, Bundle bundle, C12640l lVar) {
        this.f33590b.mo31109a(context, bundle, lVar);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:navigation_scene_manager");
        List c = this.f33590b.mo31114c();
        for (int i = 0; i <= c.size() - 1; i++) {
            Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
            m36787a(this.f33589a, ((Record) c.get(i)).f33566a, State.ACTIVITY_CREATED, bundle2, false, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        r0 = r6.f33523b;
        r6.mo30954k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if (r9 != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        com.bytedance.scene.utlity.C12700j.m36911a(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m36787a(com.bytedance.scene.navigation.C12648d r5, com.bytedance.scene.C12629j r6, com.bytedance.scene.State r7, android.os.Bundle r8, boolean r9, java.lang.Runnable r10) {
        /*
        L_0x0000:
            com.bytedance.scene.State r0 = r6.f33528f
            if (r0 != r7) goto L_0x000a
            if (r10 == 0) goto L_0x0009
            r10.run()
        L_0x0009:
            return
        L_0x000a:
            int r1 = r0.value
            int r2 = r7.value
            r3 = 8
            if (r1 >= r2) goto L_0x009b
            int[] r1 = com.bytedance.scene.navigation.C12651e.C126554.f33605a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x003d;
                case 2: goto L_0x0035;
                case 3: goto L_0x0027;
                case 4: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x009a
        L_0x001f:
            r6.mo30951h()
            m36787a(r5, r6, r7, r8, r9, r10)
            goto L_0x009a
        L_0x0027:
            android.view.View r0 = r6.f33523b
            r1 = 0
            r0.setVisibility(r1)
            r6.mo30950g()
            m36787a(r5, r6, r7, r8, r9, r10)
            goto L_0x00de
        L_0x0035:
            r6.mo30934b(r8)
            m36787a(r5, r6, r7, r8, r9, r10)
            goto L_0x00de
        L_0x003d:
            android.app.Activity r0 = r5.mo31015v()
            r6.mo30926a(r0)
            r6.mo30930a(r5)
            r6.mo30927a(r8)
            android.widget.FrameLayout r0 = r5.f33577l
            r6.mo30928a(r8, r0)
            if (r9 != 0) goto L_0x0091
            android.view.View r1 = r6.f33523b
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 != 0) goto L_0x008c
            com.bytedance.scene.navigation.Record r1 = r5.mo31070c(r6)
            boolean r1 = r1.f33567b
            if (r1 != 0) goto L_0x008c
            com.bytedance.scene.navigation.f r1 = r5.f33575j
            boolean r1 = r1.f33631d
            if (r1 == 0) goto L_0x008c
            com.bytedance.scene.navigation.f r1 = r5.f33575j
            int r1 = r1.f33632e
            if (r1 <= 0) goto L_0x007f
            android.view.View r2 = r6.f33523b
            android.content.Context r4 = r6.mo31014u()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r1)
            r2.setBackgroundDrawable(r1)
            goto L_0x008c
        L_0x007f:
            android.view.View r1 = r6.f33523b
            android.content.Context r2 = r6.mo31014u()
            android.graphics.drawable.Drawable r2 = com.bytedance.scene.utlity.C12700j.m36906a(r2)
            r1.setBackgroundDrawable(r2)
        L_0x008c:
            android.view.View r1 = r6.f33523b
            r0.addView(r1)
        L_0x0091:
            android.view.View r0 = r6.f33523b
            r0.setVisibility(r3)
            m36787a(r5, r6, r7, r8, r9, r10)
            goto L_0x00de
        L_0x009a:
            return
        L_0x009b:
            int[] r1 = com.bytedance.scene.navigation.C12651e.C126554.f33605a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 2: goto L_0x00c9;
                case 3: goto L_0x00bc;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a7;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            goto L_0x00de
        L_0x00a7:
            r6.mo30952i()
            m36787a(r5, r6, r7, r8, r9, r10)
            return
        L_0x00ae:
            r6.mo30953j()
            if (r9 != 0) goto L_0x00b8
            android.view.View r0 = r6.f33523b
            r0.setVisibility(r3)
        L_0x00b8:
            m36787a(r5, r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x00df }
            return
        L_0x00bc:
            com.bytedance.scene.State r0 = com.bytedance.scene.State.VIEW_CREATED
            if (r7 == r0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "cant switch state ACTIVITY_CREATED to VIEW_CREATED"
            r5.<init>(r6)
            throw r5
        L_0x00c9:
            android.view.View r0 = r6.f33523b
            r6.mo30954k()
            if (r9 != 0) goto L_0x00d3
            com.bytedance.scene.utlity.C12700j.m36911a(r0)
        L_0x00d3:
            r6.mo30955l()
            r6.mo30956m()
            r6.mo30957n()
            goto L_0x0000
        L_0x00de:
            return
        L_0x00df:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.C12651e.m36787a(com.bytedance.scene.navigation.d, com.bytedance.scene.j, com.bytedance.scene.State, android.os.Bundle, boolean, java.lang.Runnable):void");
    }
}
