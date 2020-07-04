package com.p280ss.android.ugc.aweme.p1052b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p063by.inflate_lib.C2058a;
import com.p280ss.android.ugc.aweme.p1052b.C23150e.C23151a;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.b.h */
public class C23154h extends C23150e {

    /* renamed from: d */
    public static final C23155a f61101d = new C23155a(null);

    /* renamed from: b */
    public final ConcurrentHashMap<Integer, LinkedList<View>> f61102b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public long f61103c = 10000;

    /* renamed from: com.ss.android.ugc.aweme.b.h$a */
    public static final class C23155a {
        private C23155a() {
        }

        public /* synthetic */ C23155a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m76074a(C23151a aVar, ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap, long j) {
            C7573i.m23587b(aVar, "target");
            C7573i.m23587b(concurrentHashMap, "viewCaches");
            C23146a.m76058a().postDelayed(new C23153g(aVar, concurrentHashMap), j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.b.h$b */
    static final class C23156b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C23154h f61104a;

        /* renamed from: b */
        final /* synthetic */ C23151a f61105b;

        C23156b(C23154h hVar, C23151a aVar) {
            this.f61104a = hVar;
            this.f61105b = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m76075a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m76075a() {
            if (!this.f61104a.f61095a.isFinishing()) {
                try {
                    for (Pair pair : this.f61105b.f61096a) {
                        Object first = pair.getFirst();
                        int intValue = ((Number) pair.getSecond()).intValue();
                        int intValue2 = ((Number) first).intValue();
                        LinkedList linkedList = (LinkedList) this.f61104a.f61102b.get(Integer.valueOf(intValue2));
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f61104a.f61102b.put(Integer.valueOf(intValue2), linkedList);
                        }
                        int i = 0;
                        while (true) {
                            if (i < intValue) {
                                View a = C2058a.m9122a(this.f61104a.f61095a, intValue2, new FrameLayout(this.f61104a.f61095a), false);
                                synchronized (linkedList) {
                                    linkedList.offer(a);
                                }
                                i++;
                            }
                        }
                    }
                    C23155a.m76074a(this.f61105b, this.f61104a.f61102b, this.f61104a.f61103c);
                } catch (Exception unused) {
                }
            }
        }
    }

    public C23154h(Activity activity) {
        C7573i.m23587b(activity, "activity");
        super(activity);
    }

    /* renamed from: a */
    public final View mo60290a(int i) {
        if (C23158j.f61108b.mo60301c()) {
            LinkedList linkedList = (LinkedList) this.f61102b.get(Integer.valueOf(i));
            if (linkedList != null) {
                synchronized (linkedList) {
                    View view = (View) linkedList.poll();
                    if (view != null) {
                        return view;
                    }
                    this.f61102b.remove(Integer.valueOf(i));
                }
            }
            View a = C2058a.m9122a(this.f61095a, i, new FrameLayout(this.f61095a), false);
            C7573i.m23582a((Object) a, "AndInflater.getView(acti…eLayout(activity), false)");
            return a;
        } else if (C23158j.f61108b.mo60300b()) {
            View a2 = C2058a.m9122a(this.f61095a, i, new FrameLayout(this.f61095a), false);
            C7573i.m23582a((Object) a2, "AndInflater.getView(acti…eLayout(activity), false)");
            return a2;
        } else {
            View inflate = LayoutInflater.from(this.f61095a).inflate(i, new FrameLayout(this.f61095a), false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(acti…eLayout(activity), false)");
            return inflate;
        }
    }

    /* renamed from: a */
    public void mo60293a(C23151a aVar, long j) {
        C7573i.m23587b(aVar, "target");
        if (C23158j.f61108b.mo60301c()) {
            C7561a bVar = new C23156b(this, aVar);
            if (j > 0) {
                C23146a.m76058a().postDelayed(new C23157i(bVar), j);
            } else {
                C23146a.m76058a().post(new C23157i(bVar));
            }
        }
    }
}
