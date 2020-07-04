package com.bytedance.android.livesdk.viewmodel;

import android.arch.lifecycle.C0063u;
import com.bytedance.android.live.core.rxutils.C3306n;
import com.bytedance.android.livesdk.message.model.C8683p;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C47844a;

public final class CommonGuideViewModel extends C0063u {

    /* renamed from: a */
    public final C9117f f24805a = new C9117f();

    /* renamed from: b */
    private C7321c f24806b;

    /* renamed from: c */
    private final C47562b f24807c = new C47562b();

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$a */
    public static final class C9112a implements C9119h {
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$b */
    public static final class C9113b implements C9119h {

        /* renamed from: a */
        public final String f24809a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f24809a, (java.lang.Object) ((com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9113b) r2).f24809a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9113b
                if (r0 == 0) goto L_0x0013
                com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$b r2 = (com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9113b) r2
                java.lang.String r0 = r1.f24809a
                java.lang.String r2 = r2.f24809a
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9113b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f24809a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonGuideActionHandleSchema(schema=");
            sb.append(this.f24809a);
            sb.append(")");
            return sb.toString();
        }

        public C9113b(String str) {
            this.f24809a = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$c */
    public static final class C9114c implements C9119h {

        /* renamed from: a */
        public final C8683p f24810a;

        public C9114c(C8683p pVar) {
            this.f24810a = pVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$d */
    public static final class C9115d implements C9120i {

        /* renamed from: a */
        public final String f24811a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f24811a, (java.lang.Object) ((com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9115d) r2).f24811a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9115d
                if (r0 == 0) goto L_0x0013
                com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$d r2 = (com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9115d) r2
                java.lang.String r0 = r1.f24811a
                java.lang.String r2 = r2.f24811a
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9115d.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            String str = this.f24811a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonGuideStateHandleSchema(schema=");
            sb.append(this.f24811a);
            sb.append(")");
            return sb.toString();
        }

        public C9115d(String str) {
            this.f24811a = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$e */
    public static final class C9116e implements C9120i {
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$f */
    public static final class C9117f {

        /* renamed from: a */
        public C9120i f24812a = new C9116e();

        /* renamed from: b */
        private final C47844a<C9120i> f24813b;

        /* renamed from: a */
        public final C7492s<C9120i> mo22294a() {
            return this.f24813b;
        }

        public C9117f() {
            C47844a<C9120i> a = C47844a.m148743a(this.f24812a);
            C7573i.m23582a((Object) a, "BehaviorSubject.createDefault(state)");
            this.f24813b = a;
        }

        /* renamed from: a */
        private final void m27164a(C9120i iVar) {
            this.f24812a = iVar;
            this.f24813b.onNext(iVar);
        }

        /* renamed from: a */
        public final void mo22295a(C9119h hVar) {
            C7573i.m23587b(hVar, "action");
            if (hVar instanceof C9114c) {
                m27164a((C9120i) new C9118g(((C9114c) hVar).f24810a));
            } else if (hVar instanceof C9113b) {
                m27164a((C9120i) new C9115d(((C9113b) hVar).f24809a));
            } else {
                if (hVar instanceof C9112a) {
                    m27164a((C9120i) new C9116e());
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$g */
    public static final class C9118g implements C9120i {

        /* renamed from: a */
        public final C8683p f24814a;

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f24814a, (java.lang.Object) ((com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9118g) r2).f24814a) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9118g
                if (r0 == 0) goto L_0x0013
                com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$g r2 = (com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9118g) r2
                com.bytedance.android.livesdk.message.model.p r0 = r1.f24814a
                com.bytedance.android.livesdk.message.model.p r2 = r2.f24814a
                boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
                if (r2 == 0) goto L_0x0013
                goto L_0x0015
            L_0x0013:
                r2 = 0
                return r2
            L_0x0015:
                r2 = 1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C9118g.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            C8683p pVar = this.f24814a;
            if (pVar != null) {
                return pVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommonGuideStateShow(message=");
            sb.append(this.f24814a);
            sb.append(")");
            return sb.toString();
        }

        public C9118g(C8683p pVar) {
            this.f24814a = pVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$h */
    public interface C9119h {
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$i */
    public interface C9120i {
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$j */
    static final class C9121j<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ CommonGuideViewModel f24815a;

        C9121j(CommonGuideViewModel commonGuideViewModel) {
            this.f24815a = commonGuideViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            this.f24815a.f24805a.mo22295a((C9119h) new C9112a());
        }
    }

    public final void onCleared() {
        super.onCleared();
        if (!this.f24807c.isDisposed()) {
            this.f24807c.dispose();
        }
        C7321c cVar = this.f24806b;
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
    }

    public CommonGuideViewModel() {
        this.f24807c.mo119661a(C3306n.m12381a(this.f24805a.mo22294a()).mo19325f((C7326g<? super T>) new C7326g<Pair<? extends C9120i, ? extends C9120i>>(this) {

            /* renamed from: a */
            final /* synthetic */ CommonGuideViewModel f24808a;

            {
                this.f24808a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Pair<? extends C9120i, ? extends C9120i> pair) {
                this.f24808a.mo22287a((C9120i) pair.component1(), (C9120i) pair.component2());
            }
        }));
    }

    /* renamed from: a */
    public final void mo22287a(C9120i iVar, C9120i iVar2) {
        long j;
        if (iVar2 instanceof C9118g) {
            C8683p pVar = ((C9118g) iVar2).f24814a;
            if (pVar != null) {
                j = pVar.f23646h;
            } else {
                j = 10000;
            }
            this.f24806b = C7492s.m23295b(j, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C9121j<Object>(this));
            return;
        }
        if (iVar2 instanceof C9116e) {
            C7321c cVar = this.f24806b;
            if (cVar != null && !cVar.isDisposed()) {
                cVar.dispose();
            }
        }
    }
}
