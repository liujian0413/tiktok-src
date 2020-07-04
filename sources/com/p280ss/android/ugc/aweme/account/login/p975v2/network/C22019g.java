package com.p280ss.android.ugc.aweme.account.login.p975v2.network;

import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21904d;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a.C21913a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.BooleanRef;
import p346io.reactivex.C7490k;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.g */
public final class C22019g {

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.g$a */
    static final class C22020a<T> implements C7326g<T> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58884a;

        /* renamed from: b */
        final /* synthetic */ BooleanRef f58885b;

        C22020a(BaseAccountFlowFragment baseAccountFlowFragment, BooleanRef booleanRef) {
            this.f58884a = baseAccountFlowFragment;
            this.f58885b = booleanRef;
        }

        public final void accept(T t) {
            this.f58884a.mo58334a(0);
            this.f58885b.element = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.g$b */
    static final class C22021b<T> implements C7328l<Throwable> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58886a;

        /* renamed from: b */
        final /* synthetic */ BooleanRef f58887b;

        C22021b(BaseAccountFlowFragment baseAccountFlowFragment, BooleanRef booleanRef) {
            this.f58886a = baseAccountFlowFragment;
            this.f58887b = booleanRef;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo9283a(Throwable th) {
            C7573i.m23587b(th, "it");
            this.f58886a.mo58334a(0);
            this.f58887b.element = true;
            if (th instanceof NetworkException) {
                BaseAccountFlowFragment baseAccountFlowFragment = this.f58886a;
                NetworkException networkException = (NetworkException) th;
                int errorCode = networkException.getErrorCode();
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                C21913a.m73131a(baseAccountFlowFragment, errorCode, message, networkException.getScene(), networkException.getStep(), networkException.getExtra());
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.g$c */
    static final class C22022c implements C7323a {

        /* renamed from: a */
        final /* synthetic */ BooleanRef f58888a;

        /* renamed from: b */
        final /* synthetic */ BaseAccountFlowFragment f58889b;

        C22022c(BooleanRef booleanRef, BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58888a = booleanRef;
            this.f58889b = baseAccountFlowFragment;
        }

        /* renamed from: a */
        public final void mo8975a() {
            if (!this.f58888a.element) {
                this.f58889b.mo58334a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.network.g$d */
    static final class C22023d<T> implements C7326g<C7321c> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58890a;

        C22023d(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58890a = baseAccountFlowFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C7321c cVar) {
            this.f58890a.mo58334a(1);
        }
    }

    /* renamed from: a */
    public static final <T> C7490k<T> m73300a(BaseAccountFlowFragment baseAccountFlowFragment, C7490k<T> kVar) {
        C7573i.m23587b(baseAccountFlowFragment, "fragment");
        C7573i.m23587b(kVar, "source");
        BooleanRef booleanRef = new BooleanRef();
        booleanRef.element = false;
        C7490k b = kVar.mo19276b(C47549a.m148327a());
        C7573i.m23582a((Object) b, "source\n            .subs…dSchedulers.mainThread())");
        C7490k<T> b2 = C21904d.m73119a(b, baseAccountFlowFragment).mo19278c((C7326g<? super T>) new C22020a<Object>(baseAccountFlowFragment, booleanRef)).mo19267a((C7328l<? super Throwable>) new C22021b<Object>(baseAccountFlowFragment, booleanRef)).mo19264a((C7323a) new C22022c(booleanRef, baseAccountFlowFragment)).mo19274b((C7326g<? super C7321c>) new C22023d<Object>(baseAccountFlowFragment));
        C7573i.m23582a((Object) b2, "source\n            .subs…_ANIMATIOM)\n            }");
        return b2;
    }
}
