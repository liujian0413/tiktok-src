package com.bytedance.opensdk.p618a;

import android.content.Intent;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.opensdk.core.ApiInfo;
import com.bytedance.opensdk.core.base.C12303a;
import com.bytedance.opensdk.core.base.p625a.C12304a;
import com.bytedance.opensdk.core.base.p625a.C12305b;
import com.bytedance.opensdk.core.grant.model.GrantInfo;
import com.bytedance.opensdk.core.grant.p631a.C12323a;
import com.bytedance.opensdk.core.p620a.p621a.C12290b;
import com.bytedance.opensdk.core.p620a.p621a.C12293c;
import com.bytedance.opensdk.p619b.C12280k;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.jvm.internal.C7540d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import kotlinx.coroutines.C48056ad;
import kotlinx.coroutines.C48057ae;
import kotlinx.coroutines.C48080as;
import kotlinx.coroutines.C48100bi;

/* renamed from: com.bytedance.opensdk.a.d */
public final class C12259d implements C12258c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f32585a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C12259d.class), "jobContext", "getJobContext()Lkotlinx/coroutines/Job;"))};

    /* renamed from: b */
    public C12323a f32586b;

    /* renamed from: c */
    private final C7541d f32587c;

    /* renamed from: d */
    private C12290b f32588d;

    /* renamed from: e */
    private C12293c f32589e;

    /* renamed from: f */
    private C12304a f32590f;

    /* renamed from: com.bytedance.opensdk.a.d$a */
    public static final class C12260a {

        /* renamed from: a */
        public String f32591a;

        /* renamed from: b */
        public String f32592b;

        /* renamed from: b */
        private final void m35656b() {
            C12260a aVar = this;
            if (aVar.f32592b == null || aVar.f32591a == null) {
                throw new IllegalStateException("you must init all these necessary properties before use builder!");
            }
        }

        /* renamed from: a */
        public final C12258c mo30075a() {
            m35656b();
            C12290b a = C12280k.f32621a.mo30083a();
            C12280k kVar = C12280k.f32621a;
            String str = this.f32591a;
            if (str == null) {
                C7573i.m23583a("hostAuthTicketDomain");
            }
            String str2 = this.f32592b;
            if (str2 == null) {
                C7573i.m23583a("hostAuthCodeDomain");
            }
            C12259d dVar = new C12259d(a, kVar.mo30084a(str, str2), C12280k.m35694a(C12303a.f32660a.mo30103c().f32680c), new C12304a(), null);
            return dVar;
        }

        /* renamed from: a */
        public final void mo30076a(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.f32591a = str;
        }

        /* renamed from: b */
        public final void mo30077b(String str) {
            C7573i.m23587b(str, "<set-?>");
            this.f32592b = str;
        }
    }

    @C7540d(mo19421b = "HeloOpenApiImpl.kt", mo19422c = {120, 125}, mo19423d = "auth", mo19424e = "com.bytedance.opensdk.api.HeloOpenApiImpl")
    /* renamed from: com.bytedance.opensdk.a.d$b */
    static final class C12261b extends ContinuationImpl {

        /* renamed from: a */
        /* synthetic */ Object f32593a;

        /* renamed from: b */
        int f32594b;

        /* renamed from: c */
        final /* synthetic */ C12259d f32595c;

        /* renamed from: d */
        Object f32596d;

        /* renamed from: e */
        Object f32597e;

        C12261b(C12259d dVar, C47919b bVar) {
            this.f32595c = dVar;
            super(bVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f32593a = obj;
            this.f32594b |= Integer.MIN_VALUE;
            return this.f32595c.mo30074a(this);
        }
    }

    /* renamed from: com.bytedance.opensdk.a.d$c */
    public static final class C12262c implements C12305b {

        /* renamed from: a */
        final /* synthetic */ int f32598a;

        /* renamed from: b */
        final /* synthetic */ C12256a f32599b;

        C12262c(int i, C12256a aVar) {
            this.f32598a = i;
            this.f32599b = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x005f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo30079a(int r4, int r5, android.content.Intent r6) {
            /*
                r3 = this;
                int r0 = r3.f32598a
                if (r0 != r4) goto L_0x006f
                r4 = 0
                if (r6 == 0) goto L_0x000e
                java.lang.String r0 = "result"
                java.lang.String r6 = r6.getStringExtra(r0)
                goto L_0x000f
            L_0x000e:
                r6 = r4
            L_0x000f:
                com.google.gson.e r0 = com.bytedance.opensdk.core.C12287a.m35724a()     // Catch:{ Exception -> 0x001c }
                java.lang.Class<com.bytedance.opensdk.core.c.a.a> r1 = com.bytedance.opensdk.core.p629c.p630a.C12319a.class
                java.lang.Object r6 = r0.mo15974a(r6, r1)     // Catch:{ Exception -> 0x001c }
                com.bytedance.opensdk.core.c.a.a r6 = (com.bytedance.opensdk.core.p629c.p630a.C12319a) r6     // Catch:{ Exception -> 0x001c }
                goto L_0x001d
            L_0x001c:
                r6 = r4
            L_0x001d:
                r0 = 0
                if (r6 == 0) goto L_0x0025
                boolean r1 = r6.mo30108b()
                goto L_0x0026
            L_0x0025:
                r1 = 0
            L_0x0026:
                r2 = -1
                if (r5 != r2) goto L_0x0041
                if (r1 == 0) goto L_0x0041
                com.bytedance.opensdk.a.b r5 = new com.bytedance.opensdk.a.b
                if (r6 == 0) goto L_0x0032
                java.lang.String r1 = r6.f32667b
                goto L_0x0033
            L_0x0032:
                r1 = r4
            L_0x0033:
                if (r6 == 0) goto L_0x003d
                T r6 = r6.f32668c
                com.bytedance.opensdk.core.c.a.b r6 = (com.bytedance.opensdk.core.p629c.p630a.C12320b) r6
                if (r6 == 0) goto L_0x003d
                java.lang.String r4 = r6.f32665c
            L_0x003d:
                r5.<init>(r0, r1, r4)
                goto L_0x006a
            L_0x0041:
                com.bytedance.opensdk.a.b r5 = new com.bytedance.opensdk.a.b
                if (r6 == 0) goto L_0x0054
                T r0 = r6.f32668c
                com.bytedance.opensdk.core.c.a.b r0 = (com.bytedance.opensdk.core.p629c.p630a.C12320b) r0
                if (r0 == 0) goto L_0x0054
                java.lang.Integer r0 = r0.f32666d
                if (r0 == 0) goto L_0x0054
                int r0 = r0.intValue()
                goto L_0x0055
            L_0x0054:
                r0 = 1
            L_0x0055:
                if (r6 == 0) goto L_0x005c
                java.lang.String r1 = r6.mo30109c()
                goto L_0x005d
            L_0x005c:
                r1 = r4
            L_0x005d:
                if (r6 == 0) goto L_0x0067
                T r6 = r6.f32668c
                com.bytedance.opensdk.core.c.a.b r6 = (com.bytedance.opensdk.core.p629c.p630a.C12320b) r6
                if (r6 == 0) goto L_0x0067
                java.lang.String r4 = r6.f32665c
            L_0x0067:
                r5.<init>(r0, r1, r4)
            L_0x006a:
                com.bytedance.opensdk.a.a r4 = r3.f32599b
                r4.mo30070a(r5)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.p618a.C12259d.C12262c.mo30079a(int, int, android.content.Intent):void");
        }
    }

    @C7540d(mo19421b = "HeloOpenApiImpl.kt", mo19422c = {82, 84, 92}, mo19423d = "invokeSuspend", mo19424e = "com.bytedance.opensdk.api.HeloOpenApiImpl$grant$2")
    /* renamed from: com.bytedance.opensdk.a.d$d */
    static final class C12263d extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f32600a;

        /* renamed from: b */
        int f32601b;

        /* renamed from: c */
        final /* synthetic */ C12259d f32602c;

        /* renamed from: d */
        final /* synthetic */ LoadingDialogFragment f32603d;

        /* renamed from: e */
        final /* synthetic */ AppCompatActivity f32604e;

        /* renamed from: f */
        final /* synthetic */ GrantInfo f32605f;

        /* renamed from: g */
        final /* synthetic */ C12256a f32606g;

        /* renamed from: h */
        private C48056ad f32607h;

        C12263d(C12259d dVar, LoadingDialogFragment loadingDialogFragment, AppCompatActivity appCompatActivity, GrantInfo grantInfo, C12256a aVar, C47919b bVar) {
            this.f32602c = dVar;
            this.f32603d = loadingDialogFragment;
            this.f32604e = appCompatActivity;
            this.f32605f = grantInfo;
            this.f32606g = aVar;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C12263d dVar = new C12263d(this.f32602c, this.f32603d, this.f32604e, this.f32605f, this.f32606g, bVar);
            dVar.f32607h = (C48056ad) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C12263d) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            r1 = (com.bytedance.opensdk.core.p620a.C12288a) r6;
            r6 = kotlinx.coroutines.C48080as.m149072b();
            r2 = new com.bytedance.opensdk.p618a.C12259d.C12263d.C122641(r5, null);
            r5.f32600a = r1;
            r5.f32601b = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
            if (kotlinx.coroutines.C48143e.m149376a(r6, r2, r5) != r0) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            if (r1.f32639a != 0) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
            if (r1.f32640b == null) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
            r6 = r5.f32602c.f32586b;
            r2 = r5.f32604e;
            r3 = r5.f32605f;
            r4 = r1.f32640b;
            r5.f32600a = r1;
            r5.f32601b = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
            if (r6.mo30153a(r2, r3, r4, r5) != r0) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
            r5.f32606g.mo30070a(new com.bytedance.opensdk.p618a.C12257b(r1.f32639a, r1.f32641c, r1.f32642d));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
            return kotlin.C7581n.f20898a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C47948a.m148881a()
                int r1 = r5.f32601b
                switch(r1) {
                    case 0: goto L_0x0034;
                    case 1: goto L_0x002a;
                    case 2: goto L_0x001c;
                    case 3: goto L_0x0011;
                    default: goto L_0x0009;
                }
            L_0x0009:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0011:
                boolean r0 = r6 instanceof kotlin.Result.Failure
                if (r0 != 0) goto L_0x0017
                goto L_0x0091
            L_0x0017:
                kotlin.Result$Failure r6 = (kotlin.Result.Failure) r6
                java.lang.Throwable r6 = r6.exception
                throw r6
            L_0x001c:
                java.lang.Object r1 = r5.f32600a
                com.bytedance.opensdk.core.a.a r1 = (com.bytedance.opensdk.core.p620a.C12288a) r1
                boolean r2 = r6 instanceof kotlin.Result.Failure
                if (r2 != 0) goto L_0x0025
                goto L_0x0061
            L_0x0025:
                kotlin.Result$Failure r6 = (kotlin.Result.Failure) r6
                java.lang.Throwable r6 = r6.exception
                throw r6
            L_0x002a:
                boolean r1 = r6 instanceof kotlin.Result.Failure
                if (r1 != 0) goto L_0x002f
                goto L_0x0044
            L_0x002f:
                kotlin.Result$Failure r6 = (kotlin.Result.Failure) r6
                java.lang.Throwable r6 = r6.exception
                throw r6
            L_0x0034:
                boolean r1 = r6 instanceof kotlin.Result.Failure
                if (r1 != 0) goto L_0x0094
                com.bytedance.opensdk.a.d r6 = r5.f32602c
                r1 = 1
                r5.f32601b = r1
                java.lang.Object r6 = r6.mo30074a(r5)
                if (r6 != r0) goto L_0x0044
                return r0
            L_0x0044:
                r1 = r6
                com.bytedance.opensdk.core.a.a r1 = (com.bytedance.opensdk.core.p620a.C12288a) r1
                kotlinx.coroutines.bs r6 = kotlinx.coroutines.C48080as.m149072b()
                kotlin.coroutines.e r6 = (kotlin.coroutines.C47924e) r6
                com.bytedance.opensdk.a.d$d$1 r2 = new com.bytedance.opensdk.a.d$d$1
                r3 = 0
                r2.<init>(r5, r3)
                kotlin.jvm.a.m r2 = (kotlin.jvm.p357a.C7563m) r2
                r5.f32600a = r1
                r3 = 2
                r5.f32601b = r3
                java.lang.Object r6 = kotlinx.coroutines.C48143e.m149376a(r6, r2, r5)
                if (r6 != r0) goto L_0x0061
                return r0
            L_0x0061:
                int r6 = r1.f32639a
                if (r6 != 0) goto L_0x0081
                java.lang.String r6 = r1.f32640b
                if (r6 == 0) goto L_0x0081
                com.bytedance.opensdk.a.d r6 = r5.f32602c
                com.bytedance.opensdk.core.grant.a.a r6 = r6.f32586b
                android.support.v7.app.AppCompatActivity r2 = r5.f32604e
                android.app.Activity r2 = (android.app.Activity) r2
                com.bytedance.opensdk.core.grant.model.GrantInfo r3 = r5.f32605f
                java.lang.String r4 = r1.f32640b
                r5.f32600a = r1
                r1 = 3
                r5.f32601b = r1
                java.lang.Object r6 = r6.mo30153a(r2, r3, r4, r5)
                if (r6 != r0) goto L_0x0091
                return r0
            L_0x0081:
                com.bytedance.opensdk.a.a r6 = r5.f32606g
                com.bytedance.opensdk.a.b r0 = new com.bytedance.opensdk.a.b
                int r2 = r1.f32639a
                java.lang.String r3 = r1.f32641c
                java.lang.String r1 = r1.f32642d
                r0.<init>(r2, r3, r1)
                r6.mo30070a(r0)
            L_0x0091:
                kotlin.n r6 = kotlin.C7581n.f20898a
                return r6
            L_0x0094:
                kotlin.Result$Failure r6 = (kotlin.Result.Failure) r6
                java.lang.Throwable r6 = r6.exception
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.p618a.C12259d.C12263d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.bytedance.opensdk.a.d$e */
    static final class C12265e extends Lambda implements C7561a<C48100bi> {

        /* renamed from: a */
        public static final C12265e f32611a = new C12265e();

        C12265e() {
            super(0);
        }

        /* renamed from: a */
        private static C48100bi m35661a() {
            return C48106bm.m149149a(null, 1, null);
        }

        public final /* synthetic */ Object invoke() {
            return m35661a();
        }
    }

    /* renamed from: b */
    private final C48100bi m35651b() {
        return (C48100bi) this.f32587c.getValue();
    }

    /* renamed from: a */
    public final void mo30071a() {
        m35651b().mo120332n();
        this.f32590f.mo30104a();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo30074a(kotlin.coroutines.C47919b<? super com.bytedance.opensdk.core.p620a.C12288a> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.bytedance.opensdk.p618a.C12259d.C12261b
            if (r0 == 0) goto L_0x0014
            r0 = r5
            com.bytedance.opensdk.a.d$b r0 = (com.bytedance.opensdk.p618a.C12259d.C12261b) r0
            int r1 = r0.f32594b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.f32594b
            int r5 = r5 - r2
            r0.f32594b = r5
            goto L_0x0019
        L_0x0014:
            com.bytedance.opensdk.a.d$b r0 = new com.bytedance.opensdk.a.d$b
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.f32593a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C47948a.m148881a()
            int r2 = r0.f32594b
            switch(r2) {
                case 0: goto L_0x0044;
                case 1: goto L_0x0036;
                case 2: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002c:
            boolean r0 = r5 instanceof kotlin.Result.Failure
            if (r0 != 0) goto L_0x0031
            goto L_0x006e
        L_0x0031:
            kotlin.Result$Failure r5 = (kotlin.Result.Failure) r5
            java.lang.Throwable r5 = r5.exception
            throw r5
        L_0x0036:
            java.lang.Object r2 = r0.f32596d
            com.bytedance.opensdk.a.d r2 = (com.bytedance.opensdk.p618a.C12259d) r2
            boolean r3 = r5 instanceof kotlin.Result.Failure
            if (r3 != 0) goto L_0x003f
            goto L_0x0057
        L_0x003f:
            kotlin.Result$Failure r5 = (kotlin.Result.Failure) r5
            java.lang.Throwable r5 = r5.exception
            throw r5
        L_0x0044:
            boolean r2 = r5 instanceof kotlin.Result.Failure
            if (r2 != 0) goto L_0x0071
            com.bytedance.opensdk.core.a.a.b r5 = r4.f32588d
            r0.f32596d = r4
            r2 = 1
            r0.f32594b = r2
            java.lang.Object r5 = r5.mo30094a(r0)
            if (r5 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r4
        L_0x0057:
            com.bytedance.opensdk.core.a.a r5 = (com.bytedance.opensdk.core.p620a.C12288a) r5
            int r3 = r5.f32639a
            if (r3 == 0) goto L_0x005e
            return r5
        L_0x005e:
            com.bytedance.opensdk.core.a.a.c r3 = r2.f32589e
            r0.f32596d = r2
            r0.f32597e = r5
            r5 = 2
            r0.f32594b = r5
            java.lang.Object r5 = r3.mo30096a(r0)
            if (r5 != r1) goto L_0x006e
            return r1
        L_0x006e:
            com.bytedance.opensdk.core.a.a r5 = (com.bytedance.opensdk.core.p620a.C12288a) r5
            return r5
        L_0x0071:
            kotlin.Result$Failure r5 = (kotlin.Result.Failure) r5
            java.lang.Throwable r5 = r5.exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.opensdk.p618a.C12259d.mo30074a(kotlin.coroutines.b):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo30072a(int i, int i2, Intent intent) {
        this.f32590f.mo30105a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo30073a(GrantInfo grantInfo, AppCompatActivity appCompatActivity, C12256a aVar) {
        C7573i.m23587b(grantInfo, "grantInfo");
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(aVar, "callback");
        LoadingDialogFragment a = C21788a.m72835a(null);
        a.mo58122a(appCompatActivity.getSupportFragmentManager());
        int requestCodeInt = ApiInfo.GRANT.getRequestCodeInt();
        this.f32590f.mo30106a(requestCodeInt, new C12262c(requestCodeInt, aVar));
        C48056ad a2 = C48057ae.m149020a(m35651b().plus(C48080as.m149073c()));
        C12263d dVar = new C12263d(this, a, appCompatActivity, grantInfo, aVar, null);
        C48145g.m149385a(a2, null, null, dVar, 3, null);
    }

    private C12259d(C12290b bVar, C12293c cVar, C12323a aVar, C12304a aVar2) {
        this.f32588d = bVar;
        this.f32589e = cVar;
        this.f32586b = aVar;
        this.f32590f = aVar2;
        this.f32587c = C7546e.m23569a(C12265e.f32611a);
    }

    public /* synthetic */ C12259d(C12290b bVar, C12293c cVar, C12323a aVar, C12304a aVar2, C7571f fVar) {
        this(bVar, cVar, aVar, aVar2);
    }
}
