package com.p280ss.android.ugc.aweme.commercialize.egg;

import android.net.Uri;
import android.text.TextUtils;
import bolts.C1592h;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1761g;
import com.airbnb.lottie.C1783l;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g.C25356a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lancet.CommerceException;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.h */
public final class C24659h {

    /* renamed from: a */
    public static final C24659h f65025a = new C24659h();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.h$a */
    static final class C24660a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C24641b f65026a;

        C24660a(C24641b bVar) {
            this.f65026a = bVar;
        }

        public final /* synthetic */ Object call() {
            m80831a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m80831a() {
            if (TextUtils.isEmpty(this.f65026a.f64975a)) {
                this.f65026a.f64979e.set(false);
                C24659h.f65025a.mo64529c(this.f65026a);
            } else if (C25354g.m83380a(Uri.parse(this.f65026a.f64975a))) {
                this.f65026a.f64979e.set(true);
                C24659h.f65025a.mo64528b(this.f65026a);
            } else {
                C25354g.m83379a(this.f65026a.f64975a, (C25356a) new C25356a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C24660a f65027a;

                    public final void onFailureImpl() {
                        this.f65027a.f65026a.f64979e.set(false);
                        C24659h.f65025a.mo64529c(this.f65027a.f65026a);
                    }

                    public final void onNewResultImpl() {
                        this.f65027a.f65026a.f64979e.set(true);
                        C24659h.f65025a.mo64528b(this.f65027a.f65026a);
                    }

                    {
                        this.f65027a = r1;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.h$b */
    static final class C24662b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C24641b f65028a;

        C24662b(C24641b bVar) {
            this.f65028a = bVar;
        }

        public final void run() {
            try {
                StringBuilder sb = new StringBuilder("CommerceLikeLayout:setCommerceDigg url = ");
                sb.append(this.f65028a.f64975a);
                C6921a.m21555a(sb.toString());
                final C1783l b = C1761g.m8403b(C6399b.m19921a(), this.f65028a.f64975a);
                C7573i.m23582a((Object) b, "task");
                if (b.f6425b == null && b.f6424a != null) {
                    C6726a.m20844b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C24662b f65029a;

                        {
                            this.f65029a = r1;
                        }

                        public final void run() {
                            this.f65029a.f65028a.f64979e.set(true);
                            C24641b bVar = this.f65029a.f65028a;
                            C1783l lVar = b;
                            C7573i.m23582a((Object) lVar, "task");
                            bVar.f64980f = new C24658g((C1757f) lVar.f6424a);
                            C24659h.f65025a.mo64528b(this.f65029a.f65028a);
                        }
                    });
                }
            } catch (Exception e) {
                C6921a.m21559a((Throwable) new CommerceException(e));
                C24659h.f65025a.mo64529c(this.f65028a);
            }
        }
    }

    private C24659h() {
    }

    /* renamed from: b */
    public final void mo64528b(C24641b bVar) {
        m80826a(bVar, true);
    }

    /* renamed from: c */
    public final void mo64529c(C24641b bVar) {
        m80826a(bVar, false);
    }

    /* renamed from: d */
    private static void m80827d(C24641b bVar) {
        C7573i.m23587b(bVar, "eggData");
        C1592h.m7853a((Callable<TResult>) new C24660a<TResult>(bVar));
    }

    /* renamed from: e */
    private static void m80828e(C24641b bVar) {
        C7573i.m23587b(bVar, "eggData");
        C6726a.m20842a(new C24662b(bVar));
    }

    /* renamed from: a */
    public static void m80825a(C24641b bVar) {
        C24671f.m80871u().mo64537a(bVar);
        if (bVar != null) {
            String str = bVar.f64976b;
            if (str.hashCode() == 120609 && str.equals("zip")) {
                m80828e(bVar);
            } else {
                m80827d(bVar);
            }
        }
    }

    /* renamed from: a */
    private static void m80826a(C24641b bVar, boolean z) {
        C24671f.m80871u().mo64538a(bVar, z);
    }
}
