package com.p280ss.android.ugc.aweme.setting.serverpush;

import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.compliance.C25784a;
import com.p280ss.android.ugc.aweme.compliance.C25795d;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28501q;
import com.p280ss.android.ugc.aweme.p313im.C30561h.C30562a;
import com.p280ss.android.ugc.aweme.setting.commentfilter.p1515b.C37607a;
import com.p280ss.android.ugc.aweme.setting.p1512b.C37584a;
import com.p280ss.android.ugc.aweme.setting.p1519g.C37632a;
import com.p280ss.android.ugc.aweme.setting.p337ui.WhoCanSeeMyLikeListActivity.C37870a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.p1659a.C42019a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48068an;
import kotlinx.coroutines.C48080as;
import kotlinx.coroutines.C48093bb;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a */
public final class C37703a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f98218a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C37703a.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;"))};

    /* renamed from: b */
    public static final C37703a f98219b;

    /* renamed from: c */
    private static List<C37704a> f98220c = new ArrayList();

    /* renamed from: d */
    private static C37704a f98221d;

    /* renamed from: e */
    private static final C7541d f98222e = C7546e.m23569a(C37705b.f98223a);

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a$a */
    public interface C37704a {
        /* renamed from: a */
        void mo59219a(C37723b bVar);

        /* renamed from: a */
        void mo59220a(Exception exc);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a$b */
    static final class C37705b extends Lambda implements C7561a<C37716e> {

        /* renamed from: a */
        public static final C37705b f98223a = new C37705b();

        C37705b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m120573a();
        }

        /* renamed from: a */
        private static C37716e m120573a() {
            C37716e eVar = new C37716e();
            eVar.mo66537a(new C37709b() {
                /* renamed from: a */
                public final void mo83181a(C37723b bVar) {
                    C7573i.m23587b(bVar, "settings");
                    C37703a.m120567a(bVar);
                }

                /* renamed from: c_ */
                public final void mo83182c_(Exception exc) {
                    C7573i.m23587b(exc, "e");
                    C37703a.m120568a(exc);
                }
            });
            return eVar;
        }
    }

    @C7540d(mo19421b = "PushSettingsManager.kt", mo19422c = {90}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.setting.serverpush.PushSettingsManager$syncPUshSettingData$1")
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.a$c */
    static final class C37707c extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f98224a;

        /* renamed from: b */
        int f98225b;

        /* renamed from: c */
        final /* synthetic */ C37704a f98226c;

        /* renamed from: d */
        private C48056ad f98227d;

        C37707c(C37704a aVar, C47919b bVar) {
            this.f98226c = aVar;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C37707c cVar = new C37707c(this.f98226c, bVar);
            cVar.f98227d = (C48056ad) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C37707c) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            Object a = C47948a.m148881a();
            switch (this.f98225b) {
                case 0:
                    C48056ad adVar = this.f98227d;
                    long millis = TimeUnit.SECONDS.toMillis(1);
                    this.f98224a = adVar;
                    this.f98225b = 1;
                    if (C48068an.m149042a(millis, this) == a) {
                        return a;
                    }
                    break;
                case 1:
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C37703a.f98219b.mo95049a(this.f98226c, true);
            return C7581n.f20898a;
        }
    }

    private C37703a() {
    }

    /* renamed from: b */
    private final C37716e m120569b() {
        return (C37716e) f98222e.getValue();
    }

    static {
        C37703a aVar = new C37703a();
        f98219b = aVar;
        aVar.m120564a();
    }

    /* renamed from: a */
    private final void m120564a() {
        m120565a((C37704a) new C28501q());
        C37704a a = C42019a.m133571a();
        C7573i.m23582a((Object) a, "DuoshanPushSettingCallba….getPushSettingCallback()");
        m120565a(a);
        m120565a((C37704a) C37607a.f98067a);
        m120565a(C37870a.m121120a());
        m120565a((C37704a) ParentalPlatformManager.f60137a);
        m120565a((C37704a) C22598e.f60167a);
        m120565a((C37704a) C37632a.f98102a);
        m120565a((C37704a) C30562a.m99834a());
        m120565a((C37704a) new C37584a());
        m120565a((C37704a) C25795d.f68207a);
        m120565a((C37704a) C25784a.f68190a);
    }

    /* renamed from: a */
    private static void m120565a(C37704a aVar) {
        f98220c.add(aVar);
    }

    /* renamed from: a */
    public static void m120567a(C37723b bVar) {
        C7573i.m23587b(bVar, "settings");
        for (C37704a a : f98220c) {
            a.mo59219a(bVar);
        }
        C37704a aVar = f98221d;
        if (aVar != null) {
            aVar.mo59219a(bVar);
        }
        f98221d = null;
    }

    /* renamed from: a */
    public static void m120568a(Exception exc) {
        for (C37704a a : f98220c) {
            a.mo59220a(exc);
        }
        C37704a aVar = f98221d;
        if (aVar != null) {
            aVar.mo59220a(exc);
        }
        f98221d = null;
    }

    /* renamed from: a */
    public final void mo95049a(C37704a aVar, boolean z) {
        f98221d = aVar;
        try {
            m120569b().mo56976a(new Object[0]);
        } catch (Exception unused) {
            if (!z) {
                C48145g.m149385a(C48093bb.f122957a, C48080as.m149072b(), null, new C37707c(aVar, null), 2, null);
            } else {
                m120568a(new Exception());
            }
        }
    }
}
