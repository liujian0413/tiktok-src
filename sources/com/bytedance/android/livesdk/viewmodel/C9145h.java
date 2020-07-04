package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.core.rxutils.C3298g;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.PortalApi;
import com.bytedance.android.livesdk.chatroom.api.PortalApi.PingType;
import com.bytedance.android.livesdk.chatroom.model.C4877aj;
import com.bytedance.android.livesdk.chatroom.model.C4878ak;
import com.bytedance.android.livesdk.chatroom.model.C4879al;
import com.bytedance.android.livesdk.chatroom.model.C4880am;
import com.bytedance.android.livesdk.chatroom.model.C4881an;
import com.bytedance.android.livesdk.chatroom.model.C4882ao;
import com.bytedance.android.livesdk.chatroom.model.C4917n;
import com.bytedance.android.livesdk.chatroom.model.PortalStatsResult;
import com.bytedance.android.livesdk.chatroom.model.PortalStatsResult.C4847a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4860k;
import com.bytedance.android.livesdk.log.C8444d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.bytedance.android.livesdk.viewmodel.h */
public final class C9145h {

    /* renamed from: d */
    public static final C9146a f24848d = new C9146a(null);

    /* renamed from: a */
    public C4917n f24849a = new C4878ak();

    /* renamed from: b */
    public final C7486b<List<C4847a>> f24850b;

    /* renamed from: c */
    public final C7486b<Pair<Long, Long>> f24851c;

    /* renamed from: e */
    private final C7486b<Pair<C4917n, C4917n>> f24852e;

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$a */
    public static final class C9146a {
        private C9146a() {
        }

        /* renamed from: a */
        public static long m27221a() {
            return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        public /* synthetic */ C9146a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m27223a(C7321c cVar, C47562b bVar) {
            C7573i.m23587b(cVar, "$this$bind");
            C7573i.m23587b(bVar, "cd");
            bVar.mo119661a(cVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
            if (r4.getId() == r9) goto L_0x002f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0012 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<com.bytedance.android.livesdk.chatroom.model.PortalStatsResult.C4847a> m27222a(java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.PortalStatsResult.C4847a> r7, boolean r8, long r9) {
            /*
                java.lang.String r0 = "portals"
                kotlin.jvm.internal.C7573i.m23587b(r7, r0)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Iterator r7 = r7.iterator()
            L_0x0012:
                boolean r1 = r7.hasNext()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0036
                java.lang.Object r1 = r7.next()
                r4 = r1
                com.bytedance.android.livesdk.chatroom.model.PortalStatsResult$a r4 = (com.bytedance.android.livesdk.chatroom.model.PortalStatsResult.C4847a) r4
                if (r8 != 0) goto L_0x002f
                com.bytedance.android.live.base.model.user.User r4 = r4.f13836c
                if (r4 == 0) goto L_0x0030
                long r4 = r4.getId()
                int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
                if (r6 != 0) goto L_0x0030
            L_0x002f:
                r2 = 1
            L_0x0030:
                if (r2 == 0) goto L_0x0012
                r0.add(r1)
                goto L_0x0012
            L_0x0036:
                java.util.List r0 = (java.util.List) r0
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.Iterator r8 = r0.iterator()
            L_0x0045:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x0065
                java.lang.Object r9 = r8.next()
                r10 = r9
                com.bytedance.android.livesdk.chatroom.model.PortalStatsResult$a r10 = (com.bytedance.android.livesdk.chatroom.model.PortalStatsResult.C4847a) r10
                int r10 = r10.f13842i
                com.bytedance.android.livesdk.chatroom.model.PortalStatsResult$PortalStatus r0 = com.bytedance.android.livesdk.chatroom.model.PortalStatsResult.PortalStatus.FINISHED
                int r0 = r0.ordinal()
                if (r10 == r0) goto L_0x005e
                r10 = 1
                goto L_0x005f
            L_0x005e:
                r10 = 0
            L_0x005f:
                if (r10 == 0) goto L_0x0045
                r7.add(r9)
                goto L_0x0045
            L_0x0065:
                java.util.List r7 = (java.util.List) r7
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.C9145h.C9146a.m27222a(java.util.List, boolean, long):java.util.List");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$b */
    static final class C9147b<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ C4879al f24853a;

        /* renamed from: b */
        final /* synthetic */ C9145h f24854b;

        /* renamed from: c */
        final /* synthetic */ C47562b f24855c;

        C9147b(C4879al alVar, C9145h hVar, C47562b bVar) {
            this.f24853a = alVar;
            this.f24854b = hVar;
            this.f24855c = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            long a = (this.f24853a.f13966a + this.f24853a.f13967b) - C9146a.m27221a();
            if (a <= 0) {
                this.f24854b.mo22348a((C4917n) new C4878ak());
            } else {
                this.f24854b.f24851c.onNext(C7579l.m23633a(Long.valueOf(a), Long.valueOf(this.f24853a.f13967b)));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$c */
    static final class C9148c<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ C4881an f24856a;

        /* renamed from: b */
        final /* synthetic */ C9145h f24857b;

        /* renamed from: c */
        final /* synthetic */ C47562b f24858c;

        C9148c(C4881an anVar, C9145h hVar, C47562b bVar) {
            this.f24856a = anVar;
            this.f24857b = hVar;
            this.f24858c = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            long a = (this.f24856a.f13978a + this.f24856a.f13979b) - C9146a.m27221a();
            if (a <= 0) {
                this.f24857b.mo22348a((C4917n) new C4878ak());
            } else {
                this.f24857b.f24851c.onNext(C7579l.m23633a(Long.valueOf(a), Long.valueOf(this.f24856a.f13979b)));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$d */
    static final class C9149d<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ C4882ao f24859a;

        /* renamed from: b */
        final /* synthetic */ C9145h f24860b;

        /* renamed from: c */
        final /* synthetic */ C47562b f24861c;

        C9149d(C4882ao aoVar, C9145h hVar, C47562b bVar) {
            this.f24859a = aoVar;
            this.f24860b = hVar;
            this.f24861c = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            long a = (this.f24859a.f13984a + this.f24859a.f13985b) - C9146a.m27221a();
            if (a <= 0) {
                C9145h hVar = this.f24860b;
                C4881an anVar = new C4881an(C9146a.m27221a(), this.f24859a.f13986c, this.f24859a.f13987d, this.f24859a.f13988e, this.f24859a.f13989f, this.f24859a.f13990g);
                hVar.mo22348a((C4917n) anVar);
                return;
            }
            this.f24860b.f24851c.onNext(C7579l.m23633a(Long.valueOf(a), Long.valueOf(this.f24859a.f13985b)));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$e */
    static final class C9150e<T> implements C7326g<C3479d<C4860k>> {

        /* renamed from: a */
        final /* synthetic */ C9145h f24862a;

        /* renamed from: b */
        final /* synthetic */ C47562b f24863b;

        C9150e(C9145h hVar, C47562b bVar) {
            this.f24862a = hVar;
            this.f24863b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C4860k> dVar) {
            long j = ((C4860k) dVar.data).f13903a;
            C8444d.m25673b();
            StringBuilder sb = new StringBuilder("RECEIVE_INVITATION ping success, nextTimePing=");
            sb.append(j);
            C8444d.m11971b("ttlive_portal", sb.toString());
            if (j >= 1) {
                C7321c f = C7492s.m23295b(j, TimeUnit.SECONDS).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C9150e f24864a;

                    {
                        this.f24864a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Long l) {
                        this.f24864a.f24862a.mo22353c(this.f24864a.f24863b);
                    }
                });
                C7573i.m23582a((Object) f, "Observable.timer(nextTim…InviteState(disposable) }");
                C9146a.m27223a(f, this.f24863b);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$f */
    static final class C9152f<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C9145h f24865a;

        /* renamed from: b */
        final /* synthetic */ C47562b f24866b;

        C9152f(C9145h hVar, C47562b bVar) {
            this.f24865a = hVar;
            this.f24866b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C8444d.m25673b();
            C7573i.m23582a((Object) th, "t");
            C8444d.m11969a(5, th.getStackTrace());
            C7321c f = C7492s.m23295b(10, TimeUnit.SECONDS).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                /* renamed from: a */
                final /* synthetic */ C9152f f24867a;

                {
                    this.f24867a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Long l) {
                    this.f24867a.f24865a.mo22353c(this.f24867a.f24866b);
                }
            });
            C7573i.m23582a((Object) f, "Observable.timer(RETRY_I…InviteState(disposable) }");
            C9146a.m27223a(f, this.f24866b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$g */
    static final class C9154g<T> implements C7326g<C3479d<PortalStatsResult>> {

        /* renamed from: a */
        final /* synthetic */ C4880am f24868a;

        /* renamed from: b */
        final /* synthetic */ C9145h f24869b;

        /* renamed from: c */
        final /* synthetic */ C47562b f24870c;

        C9154g(C4880am amVar, C9145h hVar, C47562b bVar) {
            this.f24868a = amVar;
            this.f24869b = hVar;
            this.f24870c = bVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r4 == null) goto L_0x000c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(com.bytedance.android.live.network.response.C3479d<com.bytedance.android.livesdk.chatroom.model.PortalStatsResult> r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L_0x000c
                java.lang.Object r4 = r4.data
                com.bytedance.android.livesdk.chatroom.model.PortalStatsResult r4 = (com.bytedance.android.livesdk.chatroom.model.PortalStatsResult) r4
                if (r4 == 0) goto L_0x000c
                java.util.List<com.bytedance.android.livesdk.chatroom.model.PortalStatsResult$a> r4 = r4.f13833a
                if (r4 != 0) goto L_0x0010
            L_0x000c:
                java.util.List r4 = kotlin.collections.C7525m.m23461a()
            L_0x0010:
                com.bytedance.android.livesdk.chatroom.model.am r0 = r3.f24868a
                boolean r0 = r0.f13976c
                com.bytedance.android.livesdk.chatroom.model.am r1 = r3.f24868a
                long r1 = r1.f13975b
                java.util.List r4 = com.bytedance.android.livesdk.viewmodel.C9145h.C9146a.m27222a(r4, r0, r1)
                boolean r0 = r4.isEmpty()
                if (r0 == 0) goto L_0x0039
                com.bytedance.android.livesdk.log.C8444d.m25673b()
                java.lang.String r4 = "ttlive_portal"
                java.lang.String r0 = "no visible portals"
                com.bytedance.android.livesdk.log.C8444d.m11970a(r4, r0)
                com.bytedance.android.livesdk.viewmodel.h r4 = r3.f24869b
                com.bytedance.android.livesdk.chatroom.model.ak r0 = new com.bytedance.android.livesdk.chatroom.model.ak
                r0.<init>()
                com.bytedance.android.livesdk.chatroom.model.n r0 = (com.bytedance.android.livesdk.chatroom.model.C4917n) r0
                r4.mo22348a(r0)
                return
            L_0x0039:
                com.bytedance.android.livesdk.viewmodel.h r0 = r3.f24869b
                io.reactivex.j.b<java.util.List<com.bytedance.android.livesdk.chatroom.model.PortalStatsResult$a>> r0 = r0.f24850b
                r0.onNext(r4)
                r0 = 5
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                io.reactivex.s r4 = p346io.reactivex.C7492s.m23295b(r0, r4)
                com.bytedance.android.livesdk.viewmodel.h$g$1 r0 = new com.bytedance.android.livesdk.viewmodel.h$g$1
                r0.<init>(r3)
                io.reactivex.d.g r0 = (p346io.reactivex.p348d.C7326g) r0
                io.reactivex.b.c r4 = r4.mo19325f(r0)
                java.lang.String r0 = "Observable.timer(POLL_IN…llOpenState(disposable) }"
                kotlin.jvm.internal.C7573i.m23582a(r4, r0)
                io.reactivex.b.b r0 = r3.f24870c
                com.bytedance.android.livesdk.viewmodel.C9145h.C9146a.m27223a(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.viewmodel.C9145h.C9154g.accept(com.bytedance.android.live.network.response.d):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$h */
    static final class C9156h<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C9145h f24872a;

        /* renamed from: b */
        final /* synthetic */ C47562b f24873b;

        C9156h(C9145h hVar, C47562b bVar) {
            this.f24872a = hVar;
            this.f24873b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C8444d.m25673b();
            C7573i.m23582a((Object) th, "t");
            C8444d.m11969a(5, th.getStackTrace());
            C7321c f = C7492s.m23295b(10, TimeUnit.SECONDS).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                /* renamed from: a */
                final /* synthetic */ C9156h f24874a;

                {
                    this.f24874a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Long l) {
                    this.f24874a.f24872a.mo22351b(this.f24874a.f24873b);
                }
            });
            C7573i.m23582a((Object) f, "Observable.timer(RETRY_I…llOpenState(disposable) }");
            C9146a.m27223a(f, this.f24873b);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$i */
    static final class C9158i<T> implements C7326g<C3479d<C4860k>> {

        /* renamed from: a */
        final /* synthetic */ C9145h f24875a;

        /* renamed from: b */
        final /* synthetic */ C47562b f24876b;

        C9158i(C9145h hVar, C47562b bVar) {
            this.f24875a = hVar;
            this.f24876b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C4860k> dVar) {
            if (!((C4860k) dVar.data).f13905c) {
                C8444d.m25673b();
                C8444d.m11971b("ttlive_portal", "WAIT_REWARD ping invalid");
                this.f24875a.mo22348a((C4917n) new C4878ak());
                return;
            }
            long j = ((C4860k) dVar.data).f13903a;
            C8444d.m25673b();
            StringBuilder sb = new StringBuilder("WAIT_REWARD ping success, nextTimePing=");
            sb.append(j);
            sb.append(", luckyMoneyCountDown=");
            sb.append(((C4860k) dVar.data).f13904b);
            C8444d.m11971b("ttlive_portal", sb.toString());
            if (((C4860k) dVar.data).f13904b > 0 && j >= 1) {
                C7321c f = C7492s.m23295b(j, TimeUnit.SECONDS).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C9158i f24877a;

                    {
                        this.f24877a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Long l) {
                        this.f24877a.f24875a.mo22354d(this.f24877a.f24876b);
                    }
                });
                C7573i.m23582a((Object) f, "Observable.timer(nextTim…llWaitState(disposable) }");
                C9146a.m27223a(f, this.f24876b);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.viewmodel.h$j */
    static final class C9160j<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C9145h f24878a;

        /* renamed from: b */
        final /* synthetic */ C47562b f24879b;

        C9160j(C9145h hVar, C47562b bVar) {
            this.f24878a = hVar;
            this.f24879b = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C8444d.m25673b();
            C7573i.m23582a((Object) th, "t");
            C8444d.m11969a(5, th.getStackTrace());
            C7321c f = C7492s.m23295b(10, TimeUnit.SECONDS).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                /* renamed from: a */
                final /* synthetic */ C9160j f24880a;

                {
                    this.f24880a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Long l) {
                    this.f24880a.f24878a.mo22354d(this.f24880a.f24879b);
                }
            });
            C7573i.m23582a((Object) f, "Observable.timer(RETRY_I…llWaitState(disposable) }");
            C9146a.m27223a(f, this.f24879b);
        }
    }

    /* renamed from: a */
    public final C7492s<Pair<C4917n, C4917n>> mo22347a() {
        C7492s<Pair<C4917n, C4917n>> a = this.f24852e.mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "_stateChanged.observeOn(…dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: b */
    public final C7492s<List<C4847a>> mo22350b() {
        C7492s<List<C4847a>> a = this.f24850b.mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "_portalStatsChanged.obse…dSchedulers.mainThread())");
        return a;
    }

    /* renamed from: c */
    public final C7492s<Pair<Long, Long>> mo22352c() {
        C7492s<Pair<Long, Long>> a = this.f24851c.mo19294a(C47549a.m148327a());
        C7573i.m23582a((Object) a, "_countDownChanged.observ…dSchedulers.mainThread())");
        return a;
    }

    public C9145h() {
        C7486b<Pair<C4917n, C4917n>> a = C7486b.m23223a();
        C7573i.m23582a((Object) a, "PublishSubject.create<Pa…ntext, IPortalContext>>()");
        this.f24852e = a;
        C7486b<List<C4847a>> a2 = C7486b.m23223a();
        C7573i.m23582a((Object) a2, "PublishSubject.create<Li…talStatsResult.Portal>>()");
        this.f24850b = a2;
        C7486b<Pair<Long, Long>> a3 = C7486b.m23223a();
        C7573i.m23582a((Object) a3, "PublishSubject.create<Pair<Long, Long>>()");
        this.f24851c = a3;
    }

    /* renamed from: e */
    private final void m27209e(C47562b bVar) {
        mo22351b(bVar);
    }

    /* renamed from: f */
    private final void m27210f(C47562b bVar) {
        C4917n nVar = this.f24849a;
        if (!(nVar instanceof C4879al)) {
            nVar = null;
        }
        C4879al alVar = (C4879al) nVar;
        if (alVar != null) {
            C7321c f = C3298g.f10030a.mo10214a(0, 1, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C9147b<Object>(alVar, this, bVar));
            C7573i.m23582a((Object) f, "ObservableCompat.interva…  }\n                    }");
            C9146a.m27223a(f, bVar);
        }
        mo22353c(bVar);
    }

    /* renamed from: g */
    private final void m27211g(C47562b bVar) {
        C4917n nVar = this.f24849a;
        if (!(nVar instanceof C4882ao)) {
            nVar = null;
        }
        C4882ao aoVar = (C4882ao) nVar;
        if (aoVar != null) {
            C7321c f = C3298g.f10030a.mo10214a(0, 1, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C9149d<Object>(aoVar, this, bVar));
            C7573i.m23582a((Object) f, "ObservableCompat.interva…  }\n                    }");
            C9146a.m27223a(f, bVar);
        }
        mo22354d(bVar);
    }

    /* renamed from: h */
    private final void m27212h(C47562b bVar) {
        C4917n nVar = this.f24849a;
        if (!(nVar instanceof C4881an)) {
            nVar = null;
        }
        C4881an anVar = (C4881an) nVar;
        if (anVar != null) {
            C7321c f = C3298g.f10030a.mo10214a(0, 1, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C9148c<Object>(anVar, this, bVar));
            C7573i.m23582a((Object) f, "ObservableCompat.interva…  }\n                    }");
            C9146a.m27223a(f, bVar);
        }
    }

    /* renamed from: a */
    public final void mo22348a(C4917n nVar) {
        C7573i.m23587b(nVar, "input");
        C4917n nVar2 = this.f24849a;
        C4917n a = C4877aj.m15877a(nVar2, nVar);
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("input=");
        sb.append(nVar);
        sb.append(", curState=");
        sb.append(nVar2);
        sb.append(", nextState=");
        sb.append(a);
        C8444d.m11970a("ttlive_portal", sb.toString());
        this.f24849a = a;
        this.f24852e.onNext(C7579l.m23633a(nVar2, a));
    }

    /* renamed from: a */
    public final void mo22349a(C47562b bVar) {
        C7573i.m23587b(bVar, "disposable");
        bVar.mo119660a();
        C4917n nVar = this.f24849a;
        if (!(nVar instanceof C4878ak)) {
            if (nVar instanceof C4880am) {
                m27209e(bVar);
            } else if (nVar instanceof C4879al) {
                m27210f(bVar);
            } else if (nVar instanceof C4882ao) {
                m27211g(bVar);
            } else if (nVar instanceof C4881an) {
                m27212h(bVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo22351b(C47562b bVar) {
        C4917n nVar = this.f24849a;
        if (!(nVar instanceof C4880am)) {
            nVar = null;
        }
        C4880am amVar = (C4880am) nVar;
        if (amVar != null) {
            C7321c a = ((PortalApi) C3458e.m12798a().mo10440a(PortalApi.class)).stats(amVar.f13974a).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C9154g<Object>(amVar, this, bVar), (C7326g<? super Throwable>) new C9156h<Object>(this, bVar));
            C7573i.m23582a((Object) a, "LiveClient.get().getServ…e)\n                    })");
            C9146a.m27223a(a, bVar);
        }
    }

    /* renamed from: c */
    public final void mo22353c(C47562b bVar) {
        C4917n nVar = this.f24849a;
        if (!(nVar instanceof C4879al)) {
            nVar = null;
        }
        C4879al alVar = (C4879al) nVar;
        if (alVar != null) {
            C7321c a = ((PortalApi) C3458e.m12798a().mo10440a(PortalApi.class)).ping(alVar.f13971f, alVar.f13972g, PingType.RECEIVE_INVITATION).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C9150e<Object>(this, bVar), (C7326g<? super Throwable>) new C9152f<Object>(this, bVar));
            C7573i.m23582a((Object) a, "LiveClient.get().getServ…e)\n                    })");
            C9146a.m27223a(a, bVar);
        }
    }

    /* renamed from: d */
    public final void mo22354d(C47562b bVar) {
        C4917n nVar = this.f24849a;
        if (!(nVar instanceof C4882ao)) {
            nVar = null;
        }
        C4882ao aoVar = (C4882ao) nVar;
        if (aoVar != null) {
            C7321c a = ((PortalApi) C3458e.m12798a().mo10440a(PortalApi.class)).ping(aoVar.f13989f, aoVar.f13990g, PingType.WAIT_REWARD).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C9158i<Object>(this, bVar), (C7326g<? super Throwable>) new C9160j<Object>(this, bVar));
            C7573i.m23582a((Object) a, "LiveClient.get().getServ…e)\n                    })");
            C9146a.m27223a(a, bVar);
        }
    }
}
