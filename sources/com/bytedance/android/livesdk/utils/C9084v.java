package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.airbnb.lottie.C1757f;
import com.airbnb.lottie.C1833n;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.assets.C7877j;
import com.bytedance.android.livesdk.livebuild.C8404a;
import com.bytedance.android.livesdk.livebuild.C8406c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.p397k.C8349c;
import com.bytedance.android.livesdk.p397k.C8362l;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import p346io.reactivex.C47556ac;
import p346io.reactivex.C47558ae;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;
import p346io.reactivex.p354j.C47850e;

/* renamed from: com.bytedance.android.livesdk.utils.v */
public final class C9084v {

    /* renamed from: com.bytedance.android.livesdk.utils.v$a */
    public static final class C9085a extends C7877j {

        /* renamed from: a */
        final /* synthetic */ C47850e f24751a;

        C9085a(C47850e eVar) {
            this.f24751a = eVar;
        }

        /* renamed from: a */
        public final void mo9344a(long j) {
            this.f24751a.onError(new Exception("operation canceled"));
        }

        /* renamed from: a */
        public final void mo9346a(Throwable th) {
            C47850e eVar = this.f24751a;
            if (th == null) {
                th = new Exception("unknown exception");
            }
            eVar.onError(th);
        }

        /* renamed from: a */
        public final void mo9345a(long j, String str) {
            if (str != null) {
                this.f24751a.onSuccess(str);
            } else {
                this.f24751a.onError(new Exception("result path is null"));
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.v$b */
    static final class C9086b<T> implements C47558ae<T> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f24752a;

        /* renamed from: b */
        final /* synthetic */ C7561a f24753b;

        C9086b(ObjectRef objectRef, C7561a aVar) {
            this.f24752a = objectRef;
            this.f24753b = aVar;
        }

        /* renamed from: a */
        public final void mo22262a(final C47556ac<String> acVar) {
            C7573i.m23587b(acVar, "emitter");
            String str = (String) this.f24752a.element;
            if (str == null) {
                final long longValue = ((Number) this.f24753b.invoke()).longValue();
                C8444d.m25673b();
                StringBuilder sb = new StringBuilder("downloading assets, id=");
                sb.append(longValue);
                C8444d.m11970a("ttlive_gift", sb.toString());
                C9084v.m27122a(longValue).mo19129a((C7326g<? super T>) new C7326g<String>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C9086b f24754a;

                    {
                        this.f24754a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(String str) {
                        if (str != null) {
                            this.f24754a.f24752a.element = str;
                        }
                        acVar.mo119654a(str);
                    }
                }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Throwable th) {
                        C47556ac acVar = acVar;
                        StringBuilder sb = new StringBuilder("failed to download assets, id=");
                        sb.append(longValue);
                        acVar.mo119656b(new Exception(sb.toString(), th));
                    }
                });
                return;
            }
            acVar.mo119654a(str);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.v$c */
    static final class C9089c<T> implements C47558ae<T> {

        /* renamed from: a */
        final /* synthetic */ Context f24758a;

        /* renamed from: b */
        final /* synthetic */ C8362l f24759b;

        C9089c(Context context, C8362l lVar) {
            this.f24758a = context;
            this.f24759b = lVar;
        }

        /* renamed from: a */
        public final void mo22262a(final C47556ac<C1757f> acVar) {
            C7573i.m23587b(acVar, "emitter");
            C8404a.m25573a(C8406c.class);
            new C1833n() {
                /* renamed from: a */
                public final void mo7330a(C1757f fVar) {
                    if (fVar != null) {
                        acVar.mo119654a(fVar);
                    } else {
                        acVar.mo119656b(new IllegalArgumentException("composition is null"));
                    }
                }
            };
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.v$d */
    static final class C9091d<T> implements C47558ae<T> {

        /* renamed from: a */
        final /* synthetic */ String f24761a;

        /* renamed from: b */
        final /* synthetic */ C9037af f24762b;

        C9091d(String str, C9037af afVar) {
            this.f24761a = str;
            this.f24762b = afVar;
        }

        /* renamed from: a */
        public final void mo22262a(C47556ac<C8362l> acVar) {
            C7573i.m23587b(acVar, "emitter");
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f24761a);
                sb.append(this.f24762b.getSubFolder());
                Object a = C8349c.m25445a(sb.toString(), this.f24762b.getOrdinal());
                if (!(a instanceof C8362l)) {
                    a = null;
                }
                C8362l lVar = (C8362l) a;
                if (lVar != null) {
                    acVar.mo119654a(lVar);
                } else {
                    acVar.mo119656b(new Exception("entity is null"));
                }
            } catch (Throwable th) {
                acVar.mo119656b(th);
            }
        }
    }

    /* renamed from: a */
    public static final C7319aa<String> m27122a(long j) {
        C47850e c = C47850e.m148766c();
        C7573i.m23582a((Object) c, "SingleSubject.create<String>()");
        C9085a aVar = new C9085a(c);
        C2324b a = C3596c.m13172a(IGiftService.class);
        C7573i.m23582a((Object) a, "ServiceManager.getServic…IGiftService::class.java)");
        ((IGiftService) a).getAssetsManager().mo20656a(j, aVar, 4);
        return c;
    }

    /* renamed from: a */
    public static final C7319aa<String> m27125a(C7561a<Long> aVar) {
        C7573i.m23587b(aVar, "getAssetId");
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = null;
        C7319aa<String> a = C7319aa.m22925a((C47558ae<T>) new C9086b<T>(objectRef, aVar));
        C7573i.m23582a((Object) a, "Single.create { emitter …curValue)\n        }\n    }");
        return a;
    }

    /* renamed from: a */
    public static final C7319aa<C1757f> m27123a(Context context, C8362l lVar) {
        C7573i.m23587b(lVar, "entity");
        C7319aa<C1757f> b = C7319aa.m22925a((C47558ae<T>) new C9089c<T>(context, lVar)).mo19135b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Single.create<LottieComp…scribeOn(Schedulers.io())");
        return b;
    }

    /* renamed from: a */
    public static final C7319aa<C8362l> m27124a(String str, C9037af afVar) {
        C7573i.m23587b(str, "assetRoot");
        C7573i.m23587b(afVar, "res");
        C7319aa<C8362l> b = C7319aa.m22925a((C47558ae<T>) new C9091d<T>(str, afVar)).mo19135b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Single.create<LocalLotti…scribeOn(Schedulers.io())");
        return b;
    }
}
