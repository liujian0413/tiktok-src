package com.p280ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p280ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C47556ac;
import p346io.reactivex.C47558ae;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel */
public final class ChallengeDetailJediViewModel extends JediViewModel<ChallengeDetailState> {

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel$a */
    static final class C23810a<T> implements C47558ae<T> {

        /* renamed from: a */
        final /* synthetic */ String f62851a;

        /* renamed from: b */
        final /* synthetic */ int f62852b;

        /* renamed from: c */
        final /* synthetic */ boolean f62853c;

        C23810a(String str, int i, boolean z) {
            this.f62851a = str;
            this.f62852b = i;
            this.f62853c = z;
        }

        /* renamed from: a */
        public final void mo22262a(C47556ac<ChallengeDetail> acVar) {
            C7573i.m23587b(acVar, "emitter");
            try {
                acVar.mo119654a(ChallengeApi.m77599a(this.f62851a, this.f62852b, this.f62853c));
            } catch (Throwable th) {
                if (!acVar.isDisposed()) {
                    acVar.mo119655a(th);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailJediViewModel$b */
    static final class C23811b extends Lambda implements C7563m<ChallengeDetailState, C11491a<? extends ChallengeDetail>, ChallengeDetailState> {

        /* renamed from: a */
        public static final C23811b f62854a = new C23811b();

        C23811b() {
            super(2);
        }

        /* renamed from: a */
        private static ChallengeDetailState m78025a(ChallengeDetailState challengeDetailState, C11491a<? extends ChallengeDetail> aVar) {
            C7573i.m23587b(challengeDetailState, "$receiver");
            C7573i.m23587b(aVar, "state");
            return challengeDetailState.copy(aVar);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m78025a((ChallengeDetailState) obj, (C11491a) obj2);
        }
    }

    /* renamed from: f */
    private static ChallengeDetailState m78021f() {
        return new ChallengeDetailState(null, 1, null);
    }

    /* renamed from: c */
    public final /* synthetic */ C11670t mo29037c() {
        return m78021f();
    }

    /* renamed from: a */
    public final void mo61853a(String str, int i, boolean z) {
        C7319aa b = C7319aa.m22925a((C47558ae<T>) new C23810a<T>(str, i, z)).mo19135b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Single.create<ChallengeD…scribeOn(Schedulers.io())");
        mo29028a(b, (C7563m<? super S, ? super C11491a<? extends T>, ? extends S>) C23811b.f62854a);
    }
}
