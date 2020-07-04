package com.p280ss.android.ugc.aweme.shortvideo.upload.speedprobe;

import android.content.Context;
import com.p280ss.android.ugc.aweme.p1000ak.C22487c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39961gh;
import com.p280ss.android.ugc.aweme.shortvideo.C39966gm;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41499x;
import com.p280ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p280ss.android.ugc.aweme.shortvideo.upload.httpdns.C41453a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.ttuploader.TTUploadSpeedProber;
import com.p280ss.ttuploader.TTUploadSpeedProberListener;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import p346io.reactivex.C47556ac;
import p346io.reactivex.C47558ae;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7320af;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe */
public final class UploadSpeedProbe {

    /* renamed from: a */
    public static final UploadSpeedProbe f107866a = new UploadSpeedProbe();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static TTUploadSpeedProber f107867b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static C41467a f107868c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static long f107869d = -4;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static long f107870e = -4;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static long f107871f = -4;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$FetchAuthKeyConfigFailException */
    public static final class FetchAuthKeyConfigFailException extends RuntimeException {
        public FetchAuthKeyConfigFailException(String str) {
            C7573i.m23587b(str, "message");
            super(str);
        }

        public FetchAuthKeyConfigFailException(String str, Throwable th) {
            C7573i.m23587b(str, "message");
            C7573i.m23587b(th, "cause");
            super(str, th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$State */
    public enum State {
        NOT_START,
        RUNNING,
        SUCCESS,
        CANCEL,
        FAILED,
        TIME_OUT
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$UploadSpeedProbeFailException */
    public static final class UploadSpeedProbeFailException extends RuntimeException {
        private final int errorCode;

        public final int getErrorCode() {
            return this.errorCode;
        }

        public UploadSpeedProbeFailException(int i) {
            this.errorCode = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$a */
    public static final class C41467a {

        /* renamed from: a */
        public State f107872a = State.NOT_START;

        /* renamed from: b */
        public final C7561a<C7581n> f107873b;

        /* renamed from: c */
        private final C41487a f107874c = new C41487a(m132158c(), false);

        /* renamed from: d */
        private final C7561a<C7581n> f107875d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$a$a */
        static final class C41468a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C41467a f107876a;

            C41468a(C41467a aVar) {
                this.f107876a = aVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                mo102139a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            public final void mo102139a() {
                this.f107876a.f107872a = State.RUNNING;
                this.f107876a.f107873b.invoke();
            }
        }

        /* renamed from: c */
        private static int m132158c() {
            return C35574k.m114859a().mo70096k().mo93306b(Property.UploadSpeedProbeMinGap);
        }

        /* renamed from: b */
        public final void mo102138b() {
            if (C41492b.f107911b[this.f107872a.ordinal()] == 1) {
                this.f107875d.invoke();
            }
        }

        /* renamed from: a */
        public final void mo102136a() {
            C41468a aVar = new C41468a(this);
            switch (C41492b.f107910a[this.f107872a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    if (this.f107874c.mo102146a(m132158c())) {
                        aVar.mo102139a();
                    }
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    aVar.mo102139a();
                    break;
            }
        }

        /* renamed from: a */
        public final void mo102137a(State state) {
            C7573i.m23587b(state, "state");
            if (C41492b.f107912c[this.f107872a.ordinal()] == 1) {
                if (state == State.SUCCESS) {
                    this.f107874c.mo102145a();
                }
                this.f107872a = state;
            }
        }

        public C41467a(C7561a<C7581n> aVar, C7561a<C7581n> aVar2) {
            C7573i.m23587b(aVar, "realStart");
            C7573i.m23587b(aVar2, "realCancel");
            this.f107873b = aVar;
            this.f107875d = aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$b */
    static final class C41469b extends Lambda implements C7562b<Long, UploadSpeedInfo> {

        /* renamed from: a */
        public static final C41469b f107877a = new C41469b();

        C41469b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m132163a(((Number) obj).longValue());
        }

        /* renamed from: a */
        public static UploadSpeedInfo m132163a(long j) {
            UploadSpeedInfo uploadSpeedInfo = new UploadSpeedInfo(j, UploadSpeedProbe.f107870e, UploadSpeedProbe.f107871f, 0, 8, null);
            return uploadSpeedInfo;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$c */
    static final class C41470c extends Lambda implements C7561a<C7319aa<C39961gh>> {

        /* renamed from: a */
        public static final C41470c f107878a = new C41470c();

        C41470c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m132164a();
        }

        /* renamed from: a */
        public static C7319aa<C39961gh> m132164a() {
            C7319aa<C39961gh> a = C7319aa.m22925a((C47558ae<T>) C414711.f107879a);
            C7573i.m23582a((Object) a, "Single.create<UploadAuth…Executor())\n            }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$d */
    static final class C41473d extends Lambda implements C7562b<C39961gh, C7319aa<Long>> {

        /* renamed from: a */
        final /* synthetic */ Context f107881a;

        C41473d(Context context) {
            this.f107881a = context;
            super(1);
        }

        /* renamed from: a */
        public final C7319aa<Long> invoke(final C39961gh ghVar) {
            C7573i.m23587b(ghVar, "config");
            C7319aa<Long> a = C7319aa.m22925a((C47558ae<T>) new C47558ae<T>(this) {

                /* renamed from: a */
                final /* synthetic */ C41473d f107885a;

                {
                    this.f107885a = r1;
                }

                /* renamed from: a */
                public final void mo22262a(final C47556ac<Long> acVar) {
                    C7573i.m23587b(acVar, "it");
                    TTUploadSpeedProber c = UploadSpeedProbe.f107867b;
                    if (c != null) {
                        c.close();
                    }
                    UploadSpeedProbe uploadSpeedProbe = UploadSpeedProbe.f107866a;
                    Context applicationContext = this.f107885a.f107881a.getApplicationContext();
                    C7573i.m23582a((Object) applicationContext, "applicationContext.applicationContext");
                    UploadSpeedProbe.f107867b = C22487c.m74373a(applicationContext, C414752.m132169a());
                    TTUploadSpeedProber c2 = UploadSpeedProbe.f107867b;
                    if (c2 != null) {
                        c2.setListener(new TTUploadSpeedProberListener() {
                            public final void onNotify(int i, long j) {
                                StringBuilder sb = new StringBuilder("SpeedProbe End what:");
                                sb.append(i);
                                sb.append(" parameter:");
                                sb.append(j);
                                UploadSpeedProbe.m132150a(sb.toString(), true);
                                TTUploadSpeedProber c = UploadSpeedProbe.f107867b;
                                if (c != null) {
                                    c.close();
                                }
                                if (i != 0) {
                                    acVar.mo119656b(new UploadSpeedProbeFailException(i));
                                } else {
                                    acVar.mo119654a(Long.valueOf(j));
                                }
                            }
                        });
                    }
                    C39966gm gmVar = ghVar.f103779a;
                    if (!C414741.m132168a(gmVar)) {
                        acVar.mo119656b(new FetchAuthKeyConfigFailException("UploadAuthKeyConfig.uploadImageConfig is not valid"));
                        return;
                    }
                    C41453a.m132107a();
                    C41499x.m132199a();
                    UploadSpeedProbe.f107870e = System.currentTimeMillis();
                    TTUploadSpeedProber c3 = UploadSpeedProbe.f107867b;
                    if (c3 != null) {
                        c3.start(gmVar.f103817c, gmVar.f103840z, gmVar.f103839y, (long) C414763.m132170a());
                    }
                }
            });
            C7573i.m23582a((Object) a, "Single.create<Long> {\n  …正，万一sdk没回调了\n            }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$e */
    static final class C41479e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f107888a;

        /* renamed from: b */
        final /* synthetic */ C41473d f107889b;

        C41479e(ObjectRef objectRef, C41473d dVar) {
            this.f107888a = objectRef;
            this.f107889b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo102142a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo102142a() {
            UploadSpeedProbe.m132150a("SpeedProbe Start", true);
            this.f107888a.element = C41470c.m132164a().mo19135b(C7333a.m23044b()).mo19126a((C7327h<? super T, ? extends C7320af<? extends R>>) new C7327h<T, C7320af<? extends R>>(this) {

                /* renamed from: a */
                final /* synthetic */ C41479e f107890a;

                {
                    this.f107890a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C7319aa<Long> apply(C39961gh ghVar) {
                    C7573i.m23587b(ghVar, "config");
                    return this.f107890a.f107889b.invoke(ghVar);
                }
            }).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) C414812.f107891a, (C7326g<? super Throwable>) C414823.f107892a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$f */
    static final class C41483f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f107893a;

        C41483f(ObjectRef objectRef) {
            this.f107893a = objectRef;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo102143a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo102143a() {
            UploadSpeedProbe.m132150a("realCancel", true);
            C7321c cVar = (C7321c) this.f107893a.element;
            if (cVar != null) {
                cVar.dispose();
            }
            TTUploadSpeedProber c = UploadSpeedProbe.f107867b;
            if (c != null) {
                c.close();
            }
            C41467a d = UploadSpeedProbe.f107868c;
            if (d != null) {
                d.mo102137a(State.CANCEL);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.UploadSpeedProbe$g */
    static final class C41484g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C41479e f107894a;

        /* renamed from: b */
        final /* synthetic */ C41483f f107895b;

        C41484g(C41479e eVar, C41483f fVar) {
            this.f107894a = eVar;
            this.f107895b = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo102144a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo102144a() {
            if (UploadSpeedProbe.f107868c == null) {
                UploadSpeedProbe.f107868c = new C41467a(new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C41484g f107896a;

                    {
                        this.f107896a = r1;
                    }

                    public final String getName() {
                        return "realStart";
                    }

                    public final C7585d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    /* renamed from: a */
                    private void m132178a() {
                        this.f107896a.f107894a.mo102142a();
                    }

                    public final /* synthetic */ Object invoke() {
                        m132178a();
                        return C7581n.f20898a;
                    }
                }, new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C41484g f107897a;

                    {
                        this.f107897a = r1;
                    }

                    public final String getName() {
                        return "realCancel";
                    }

                    public final C7585d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    /* renamed from: a */
                    private void m132179a() {
                        this.f107897a.f107895b.mo102143a();
                    }

                    public final /* synthetic */ Object invoke() {
                        m132179a();
                        return C7581n.f20898a;
                    }
                });
            }
        }
    }

    private UploadSpeedProbe() {
    }

    /* renamed from: b */
    public static final void m132152b() {
        C41467a aVar = f107868c;
        if (aVar != null) {
            aVar.mo102138b();
        }
    }

    /* renamed from: a */
    public static final UploadSpeedInfo m132144a() {
        State state;
        UploadSpeedInfo uploadSpeedInfo;
        C41467a aVar = f107868c;
        if (aVar != null) {
            aVar.mo102138b();
        }
        C41467a aVar2 = f107868c;
        if (aVar2 != null) {
            state = aVar2.f107872a;
        } else {
            state = null;
        }
        if (state != null) {
            switch (C41493c.f107913a[state.ordinal()]) {
                case 1:
                    uploadSpeedInfo = C41469b.m132163a(f107869d);
                    break;
                case 2:
                    uploadSpeedInfo = C41469b.m132163a(-6);
                    break;
                case 3:
                    uploadSpeedInfo = C41469b.m132163a(-5);
                    break;
            }
        }
        uploadSpeedInfo = C41469b.m132163a(-4);
        UploadSpeedProbe uploadSpeedProbe = f107866a;
        StringBuilder sb = new StringBuilder("getSpeed:");
        sb.append(uploadSpeedInfo);
        m132150a(sb.toString(), false);
        return uploadSpeedInfo;
    }

    /* renamed from: a */
    public static final void m132145a(Context context) {
        C7573i.m23587b(context, "applicationContext");
        m132153b(context);
        C41467a aVar = f107868c;
        if (aVar != null) {
            aVar.mo102136a();
        }
    }

    /* renamed from: b */
    private static void m132153b(Context context) {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = null;
        new C41484g(new C41479e(objectRef, new C41473d(context)), new C41483f(objectRef)).mo102144a();
    }

    /* renamed from: a */
    public static void m132150a(String str, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder("UploadSpeedProbe + ");
            sb.append(str);
            C41530am.m132280a(sb.toString());
        }
    }
}
