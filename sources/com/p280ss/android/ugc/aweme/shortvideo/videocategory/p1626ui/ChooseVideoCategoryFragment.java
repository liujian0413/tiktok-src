package com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p280ss.android.ugc.asve.p754b.C15388c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1622a.C41590a;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1622a.C41591b;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.C41611c;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.repository.C41613e;
import com.p280ss.android.ugc.aweme.utils.C43107es;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.coroutines.C47918a;
import kotlin.coroutines.C47919b;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.jvm.internal.C47951a;
import kotlin.coroutines.jvm.internal.C7540d;
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
import kotlinx.coroutines.C48063ak;
import kotlinx.coroutines.C48080as;
import kotlinx.coroutines.C48100bi;
import kotlinx.coroutines.C48143e;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment */
public final class ChooseVideoCategoryFragment extends Fragment {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108134a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChooseVideoCategoryFragment.class), "mCategoryProvider", "getMCategoryProvider()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/IVideoCategoryProvider;"))};

    /* renamed from: e */
    public static final C41620b f108135e = new C41620b(null);

    /* renamed from: b */
    public VideoCategoryParam f108136b;

    /* renamed from: c */
    public AtomicBoolean f108137c = new AtomicBoolean(true);

    /* renamed from: d */
    public VideoCategoryAdapter f108138d;

    /* renamed from: f */
    private final C7541d f108139f = C7546e.m23570a(new C41613e());

    /* renamed from: g */
    private AVETParameter f108140g;

    /* renamed from: h */
    private RecyclerView f108141h;

    /* renamed from: i */
    private StatusLoadingDialog f108142i;

    /* renamed from: j */
    private final C48100bi f108143j = C48106bm.m149149a(null, 1, null);

    /* renamed from: k */
    private final CoroutineExceptionHandler f108144k = new C41618a(CoroutineExceptionHandler.f122896b, this);

    /* renamed from: l */
    private final C48056ad f108145l = C48057ae.m149020a(C15388c.m44889a().plus(this.f108143j).plus(this.f108144k));

    /* renamed from: m */
    private HashMap f108146m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$a */
    public static final class C41618a extends C47918a implements CoroutineExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoCategoryFragment f108147a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$a$a */
        static final class C41619a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C41618a f108148a;

            C41619a(C41618a aVar) {
                this.f108148a = aVar;
                super(0);
            }

            /* renamed from: a */
            private void m132517a() {
                this.f108148a.f108147a.mo102246c();
            }

            public final /* synthetic */ Object invoke() {
                m132517a();
                return C7581n.f20898a;
            }
        }

        public C41618a(C47929c cVar, ChooseVideoCategoryFragment chooseVideoCategoryFragment) {
            this.f108147a = chooseVideoCategoryFragment;
            super(cVar);
        }

        public final void handleException(C47924e eVar, Throwable th) {
            C7573i.m23587b(eVar, "context");
            C7573i.m23587b(th, "exception");
            C43107es.m136728a(0, new C41619a(this));
            C6921a.m21559a(th);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$b */
    public static final class C41620b {
        private C41620b() {
        }

        public /* synthetic */ C41620b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ChooseVideoCategoryFragment m132518a(VideoCategoryParam videoCategoryParam, AVETParameter aVETParameter) {
            C7573i.m23587b(aVETParameter, "mobParam");
            Bundle bundle = new Bundle();
            bundle.putParcelable("KEY_VIDEO_DEFAULT_CATEGORY", videoCategoryParam);
            bundle.putSerializable("key_video_mob_param", aVETParameter);
            ChooseVideoCategoryFragment chooseVideoCategoryFragment = new ChooseVideoCategoryFragment();
            chooseVideoCategoryFragment.setArguments(bundle);
            return chooseVideoCategoryFragment;
        }
    }

    @C7540d(mo19421b = "ChooseVideoCategoryFragment.kt", mo19422c = {120, 122, 122, 122}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$fetchData$1")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c */
    static final class C41621c extends SuspendLambda implements C7563m<C48056ad, C47919b<? super C7581n>, Object> {

        /* renamed from: a */
        Object f108149a;

        /* renamed from: b */
        Object f108150b;

        /* renamed from: c */
        Object f108151c;

        /* renamed from: d */
        Object f108152d;

        /* renamed from: e */
        Object f108153e;

        /* renamed from: f */
        boolean f108154f;

        /* renamed from: g */
        int f108155g;

        /* renamed from: h */
        final /* synthetic */ ChooseVideoCategoryFragment f108156h;

        /* renamed from: i */
        private C48056ad f108157i;

        @C7540d(mo19421b = "ChooseVideoCategoryFragment.kt", mo19422c = {120, 120}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$fetchData$1$isDefaultPresent$1")
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$a */
        static final class C41622a extends SuspendLambda implements C7563m<C48056ad, C47919b<? super Boolean>, Object> {

            /* renamed from: a */
            Object f108158a;

            /* renamed from: b */
            Object f108159b;

            /* renamed from: c */
            int f108160c;

            /* renamed from: d */
            final /* synthetic */ C41621c f108161d;

            /* renamed from: e */
            final /* synthetic */ C48063ak f108162e;

            /* renamed from: f */
            private C48056ad f108163f;

            C41622a(C41621c cVar, C48063ak akVar, C47919b bVar) {
                this.f108161d = cVar;
                this.f108162e = akVar;
                super(2, bVar);
            }

            public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
                C7573i.m23587b(bVar, "completion");
                C41622a aVar = new C41622a(this.f108161d, this.f108162e, bVar);
                aVar.f108163f = (C48056ad) obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C41622a) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:11:0x003e A[PHI: r5 
              PHI: (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v4 java.lang.Object) binds: [B:1:0x0006, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.C47948a.m148881a()
                    int r1 = r4.f108160c
                    switch(r1) {
                        case 0: goto L_0x001a;
                        case 1: goto L_0x0011;
                        case 2: goto L_0x003e;
                        default: goto L_0x0009;
                    }
                L_0x0009:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L_0x0011:
                    java.lang.Object r1 = r4.f108159b
                    com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r1 = (com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui.ChooseVideoCategoryFragment) r1
                    java.lang.Object r2 = r4.f108158a
                    kotlinx.coroutines.ad r2 = (kotlinx.coroutines.C48056ad) r2
                    goto L_0x0030
                L_0x001a:
                    kotlinx.coroutines.ad r2 = r4.f108163f
                    com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c r5 = r4.f108161d
                    com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r1 = r5.f108156h
                    kotlinx.coroutines.ak r5 = r4.f108162e
                    r4.f108158a = r2
                    r4.f108159b = r1
                    r3 = 1
                    r4.f108160c = r3
                    java.lang.Object r5 = r5.mo120272a(r4)
                    if (r5 != r0) goto L_0x0030
                    return r0
                L_0x0030:
                    java.util.List r5 = (java.util.List) r5
                    r4.f108158a = r2
                    r2 = 2
                    r4.f108160c = r2
                    java.lang.Object r5 = r1.mo102241a(r5, r4)
                    if (r5 != r0) goto L_0x003e
                    return r0
                L_0x003e:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui.ChooseVideoCategoryFragment.C41621c.C41622a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @C7540d(mo19421b = "ChooseVideoCategoryFragment.kt", mo19422c = {118}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$fetchData$1$longVideoCategory$1")
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$b */
        static final class C41623b extends SuspendLambda implements C7563m<C48056ad, C47919b<? super List<? extends VideoCategoryParam>>, Object> {

            /* renamed from: a */
            Object f108164a;

            /* renamed from: b */
            int f108165b;

            /* renamed from: c */
            final /* synthetic */ C41621c f108166c;

            /* renamed from: d */
            private C48056ad f108167d;

            C41623b(C41621c cVar, C47919b bVar) {
                this.f108166c = cVar;
                super(2, bVar);
            }

            public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
                C7573i.m23587b(bVar, "completion");
                C41623b bVar2 = new C41623b(this.f108166c, bVar);
                bVar2.f108167d = (C48056ad) obj;
                return bVar2;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C41623b) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
            }

            public final Object invokeSuspend(Object obj) {
                Object a = C47948a.m148881a();
                switch (this.f108165b) {
                    case 0:
                        C48056ad adVar = this.f108167d;
                        ChooseVideoCategoryFragment chooseVideoCategoryFragment = this.f108166c.f108156h;
                        this.f108164a = adVar;
                        this.f108165b = 1;
                        obj = chooseVideoCategoryFragment.mo102242a((C47919b<? super List<VideoCategoryParam>>) this);
                        if (obj == a) {
                            return a;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @C7540d(mo19421b = "ChooseVideoCategoryFragment.kt", mo19422c = {117}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$fetchData$1$recentVideoCategory$1")
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$c */
        static final class C41624c extends SuspendLambda implements C7563m<C48056ad, C47919b<? super List<? extends VideoCategoryParam>>, Object> {

            /* renamed from: a */
            Object f108168a;

            /* renamed from: b */
            int f108169b;

            /* renamed from: c */
            final /* synthetic */ C41621c f108170c;

            /* renamed from: d */
            private C48056ad f108171d;

            C41624c(C41621c cVar, C47919b bVar) {
                this.f108170c = cVar;
                super(2, bVar);
            }

            public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
                C7573i.m23587b(bVar, "completion");
                C41624c cVar = new C41624c(this.f108170c, bVar);
                cVar.f108171d = (C48056ad) obj;
                return cVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C41624c) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
            }

            public final Object invokeSuspend(Object obj) {
                Object a = C47948a.m148881a();
                switch (this.f108169b) {
                    case 0:
                        C48056ad adVar = this.f108171d;
                        ChooseVideoCategoryFragment chooseVideoCategoryFragment = this.f108170c.f108156h;
                        this.f108168a = adVar;
                        this.f108169b = 1;
                        obj = chooseVideoCategoryFragment.mo102239a(3, (C47919b<? super List<VideoCategoryParam>>) this);
                        if (obj == a) {
                            return a;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        C41621c(ChooseVideoCategoryFragment chooseVideoCategoryFragment, C47919b bVar) {
            this.f108156h = chooseVideoCategoryFragment;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C41621c cVar = new C41621c(this.f108156h, bVar);
            cVar.f108157i = (C48056ad) obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C41621c) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0098, code lost:
            r12 = ((java.lang.Boolean) r12).booleanValue();
            r11.f108156h.f108137c.set(r12);
            r4 = r11.f108156h;
            r11.f108149a = r3;
            r11.f108150b = r1;
            r11.f108151c = r2;
            r11.f108154f = r12;
            r11.f108152d = r4;
            r11.f108155g = 2;
            r5 = r1.mo120272a(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b8, code lost:
            if (r5 != r0) goto L_0x00bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ba, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00bb, code lost:
            r6 = r3;
            r3 = r12;
            r12 = r5;
            r5 = r1;
            r10 = r4;
            r4 = r2;
            r2 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c2, code lost:
            r1 = (java.util.List) r12;
            r11.f108149a = r6;
            r11.f108150b = r5;
            r11.f108151c = r4;
            r11.f108154f = r3;
            r11.f108152d = r2;
            r11.f108153e = r1;
            r11.f108155g = 3;
            r12 = r4.mo120272a(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d8, code lost:
            if (r12 != r0) goto L_0x00db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00da, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00db, code lost:
            r12 = (java.util.List) r12;
            r11.f108149a = r6;
            r11.f108150b = r5;
            r11.f108151c = r4;
            r11.f108154f = r3;
            r11.f108155g = 4;
            r12 = r2.mo102240a(r1, r12, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ec, code lost:
            if (r12 != r0) goto L_0x00ef;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ee, code lost:
            return r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C47948a.m148881a()
                int r1 = r11.f108155g
                switch(r1) {
                    case 0: goto L_0x0052;
                    case 1: goto L_0x0042;
                    case 2: goto L_0x0029;
                    case 3: goto L_0x0011;
                    case 4: goto L_0x00ef;
                    default: goto L_0x0009;
                }
            L_0x0009:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0011:
                java.lang.Object r1 = r11.f108153e
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r11.f108152d
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r2 = (com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui.ChooseVideoCategoryFragment) r2
                boolean r3 = r11.f108154f
                java.lang.Object r4 = r11.f108151c
                kotlinx.coroutines.ak r4 = (kotlinx.coroutines.C48063ak) r4
                java.lang.Object r5 = r11.f108150b
                kotlinx.coroutines.ak r5 = (kotlinx.coroutines.C48063ak) r5
                java.lang.Object r6 = r11.f108149a
                kotlinx.coroutines.ad r6 = (kotlinx.coroutines.C48056ad) r6
                goto L_0x00db
            L_0x0029:
                java.lang.Object r1 = r11.f108152d
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r1 = (com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui.ChooseVideoCategoryFragment) r1
                boolean r2 = r11.f108154f
                java.lang.Object r3 = r11.f108151c
                kotlinx.coroutines.ak r3 = (kotlinx.coroutines.C48063ak) r3
                java.lang.Object r4 = r11.f108150b
                kotlinx.coroutines.ak r4 = (kotlinx.coroutines.C48063ak) r4
                java.lang.Object r5 = r11.f108149a
                kotlinx.coroutines.ad r5 = (kotlinx.coroutines.C48056ad) r5
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                goto L_0x00c2
            L_0x0042:
                java.lang.Object r1 = r11.f108151c
                kotlinx.coroutines.ak r1 = (kotlinx.coroutines.C48063ak) r1
                java.lang.Object r2 = r11.f108150b
                kotlinx.coroutines.ak r2 = (kotlinx.coroutines.C48063ak) r2
                java.lang.Object r3 = r11.f108149a
                kotlinx.coroutines.ad r3 = (kotlinx.coroutines.C48056ad) r3
                r10 = r2
                r2 = r1
                r1 = r10
                goto L_0x0098
            L_0x0052:
                kotlinx.coroutines.ad r12 = r11.f108157i
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r1 = r11.f108156h
                r1.mo102244b()
                r5 = 0
                r6 = 0
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$c r1 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$c
                r2 = 0
                r1.<init>(r11, r2)
                r7 = r1
                kotlin.jvm.a.m r7 = (kotlin.jvm.p357a.C7563m) r7
                r8 = 3
                r9 = 0
                r4 = r12
                kotlinx.coroutines.ak r1 = kotlinx.coroutines.C48145g.m149387b(r4, null, null, r7, 3, null)
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$b r3 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$b
                r3.<init>(r11, r2)
                r7 = r3
                kotlin.jvm.a.m r7 = (kotlin.jvm.p357a.C7563m) r7
                kotlinx.coroutines.ak r3 = kotlinx.coroutines.C48145g.m149387b(r4, null, null, r7, 3, null)
                kotlinx.coroutines.y r4 = kotlinx.coroutines.C48080as.m149071a()
                kotlin.coroutines.e r4 = (kotlin.coroutines.C47924e) r4
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$a r5 = new com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$c$a
                r5.<init>(r11, r3, r2)
                kotlin.jvm.a.m r5 = (kotlin.jvm.p357a.C7563m) r5
                r11.f108149a = r12
                r11.f108150b = r1
                r11.f108151c = r3
                r2 = 1
                r11.f108155g = r2
                java.lang.Object r2 = kotlinx.coroutines.C48143e.m149376a(r4, r5, r11)
                if (r2 != r0) goto L_0x0094
                return r0
            L_0x0094:
                r10 = r3
                r3 = r12
                r12 = r2
                r2 = r10
            L_0x0098:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r4 = r11.f108156h
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f108137c
                r4.set(r12)
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r4 = r11.f108156h
                r11.f108149a = r3
                r11.f108150b = r1
                r11.f108151c = r2
                r11.f108154f = r12
                r11.f108152d = r4
                r5 = 2
                r11.f108155g = r5
                java.lang.Object r5 = r1.mo120272a(r11)
                if (r5 != r0) goto L_0x00bb
                return r0
            L_0x00bb:
                r6 = r3
                r3 = r12
                r12 = r5
                r5 = r1
                r10 = r4
                r4 = r2
                r2 = r10
            L_0x00c2:
                r1 = r12
                java.util.List r1 = (java.util.List) r1
                r11.f108149a = r6
                r11.f108150b = r5
                r11.f108151c = r4
                r11.f108154f = r3
                r11.f108152d = r2
                r11.f108153e = r1
                r12 = 3
                r11.f108155g = r12
                java.lang.Object r12 = r4.mo120272a(r11)
                if (r12 != r0) goto L_0x00db
                return r0
            L_0x00db:
                java.util.List r12 = (java.util.List) r12
                r11.f108149a = r6
                r11.f108150b = r5
                r11.f108151c = r4
                r11.f108154f = r3
                r3 = 4
                r11.f108155g = r3
                java.lang.Object r12 = r2.mo102240a(r1, r12, r11)
                if (r12 != r0) goto L_0x00ef
                return r0
            L_0x00ef:
                java.util.List r12 = (java.util.List) r12
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r0 = r11.f108156h
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryAdapter r0 = com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui.ChooseVideoCategoryFragment.m132503a(r0)
                r0.mo58045a(r12)
                com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment r12 = r11.f108156h
                r12.mo102246c()
                kotlin.n r12 = kotlin.C7581n.f20898a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui.ChooseVideoCategoryFragment.C41621c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C7540d(mo19421b = "ChooseVideoCategoryFragment.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$findDefaultCategory$2")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$d */
    static final class C41625d extends SuspendLambda implements C7563m<C48056ad, C47919b<? super Boolean>, Object> {

        /* renamed from: a */
        int f108172a;

        /* renamed from: b */
        final /* synthetic */ ChooseVideoCategoryFragment f108173b;

        /* renamed from: c */
        final /* synthetic */ List f108174c;

        /* renamed from: d */
        private C48056ad f108175d;

        C41625d(ChooseVideoCategoryFragment chooseVideoCategoryFragment, List list, C47919b bVar) {
            this.f108173b = chooseVideoCategoryFragment;
            this.f108174c = list;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C41625d dVar = new C41625d(this.f108173b, this.f108174c, bVar);
            dVar.f108175d = (C48056ad) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C41625d) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.f108172a == 0) {
                Iterator it = this.f108174c.iterator();
                boolean z = false;
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    String categoryName = ((VideoCategoryParam) it.next()).getCategoryName();
                    VideoCategoryParam videoCategoryParam = this.f108173b.f108136b;
                    if (videoCategoryParam != null) {
                        str = videoCategoryParam.getCategoryName();
                    } else {
                        str = null;
                    }
                    if (C47951a.m148882a(C7573i.m23585a((Object) categoryName, (Object) str)).booleanValue()) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    z = true;
                }
                return C47951a.m148882a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C7540d(mo19421b = "ChooseVideoCategoryFragment.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$getLongVideoCategoryAsync$2")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$e */
    static final class C41626e extends SuspendLambda implements C7563m<C48056ad, C47919b<? super List<? extends VideoCategoryParam>>, Object> {

        /* renamed from: a */
        int f108176a;

        /* renamed from: b */
        final /* synthetic */ ChooseVideoCategoryFragment f108177b;

        /* renamed from: c */
        private C48056ad f108178c;

        C41626e(ChooseVideoCategoryFragment chooseVideoCategoryFragment, C47919b bVar) {
            this.f108177b = chooseVideoCategoryFragment;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C41626e eVar = new C41626e(this.f108177b, bVar);
            eVar.f108178c = (C48056ad) obj;
            return eVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C41626e) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f108176a == 0) {
                return this.f108177b.mo102238a().mo102222a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C7540d(mo19421b = "ChooseVideoCategoryFragment.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$getRecentCategoryAsync$2")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$f */
    static final class C41627f extends SuspendLambda implements C7563m<C48056ad, C47919b<? super List<? extends VideoCategoryParam>>, Object> {

        /* renamed from: a */
        int f108179a;

        /* renamed from: b */
        final /* synthetic */ ChooseVideoCategoryFragment f108180b;

        /* renamed from: c */
        final /* synthetic */ int f108181c;

        /* renamed from: d */
        private C48056ad f108182d;

        C41627f(ChooseVideoCategoryFragment chooseVideoCategoryFragment, int i, C47919b bVar) {
            this.f108180b = chooseVideoCategoryFragment;
            this.f108181c = i;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C41627f fVar = new C41627f(this.f108180b, this.f108181c, bVar);
            fVar.f108182d = (C48056ad) obj;
            return fVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C41627f) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f108179a == 0) {
                return this.f108180b.mo102238a().mo102234a(this.f108181c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$g */
    static final class C41628g extends Lambda implements C7563m<Integer, VideoCategoryParam, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoCategoryFragment f108183a;

        C41628g(ChooseVideoCategoryFragment chooseVideoCategoryFragment) {
            this.f108183a = chooseVideoCategoryFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m132519a(((Number) obj).intValue(), (VideoCategoryParam) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m132519a(int i, VideoCategoryParam videoCategoryParam) {
            C7573i.m23587b(videoCategoryParam, "category");
            this.f108183a.mo102245b(videoCategoryParam);
            this.f108183a.mo102238a().mo102235a(videoCategoryParam);
            this.f108183a.mo102243a(videoCategoryParam);
        }
    }

    @C7540d(mo19421b = "ChooseVideoCategoryFragment.kt", mo19422c = {}, mo19423d = "invokeSuspend", mo19424e = "com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$mergeVideoCategory$2")
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.ChooseVideoCategoryFragment$h */
    static final class C41629h extends SuspendLambda implements C7563m<C48056ad, C47919b<? super List<C41591b>>, Object> {

        /* renamed from: a */
        int f108184a;

        /* renamed from: b */
        final /* synthetic */ ChooseVideoCategoryFragment f108185b;

        /* renamed from: c */
        final /* synthetic */ List f108186c;

        /* renamed from: d */
        final /* synthetic */ List f108187d;

        /* renamed from: e */
        private C48056ad f108188e;

        C41629h(ChooseVideoCategoryFragment chooseVideoCategoryFragment, List list, List list2, C47919b bVar) {
            this.f108185b = chooseVideoCategoryFragment;
            this.f108186c = list;
            this.f108187d = list2;
            super(2, bVar);
        }

        public final C47919b<C7581n> create(Object obj, C47919b<?> bVar) {
            C7573i.m23587b(bVar, "completion");
            C41629h hVar = new C41629h(this.f108185b, this.f108186c, this.f108187d, bVar);
            hVar.f108188e = (C48056ad) obj;
            return hVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C41629h) create(obj, (C47919b) obj2)).invokeSuspend(C7581n.f20898a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f108184a == 0) {
                List arrayList = new ArrayList();
                if (!this.f108186c.isEmpty()) {
                    arrayList.add(new C41591b(3, 0, null, this.f108185b.getResources().getString(R.string.a50)));
                    int i = 0;
                    for (Object next : this.f108186c) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C7525m.m23465b();
                        }
                        arrayList.add(C41590a.m132436a((VideoCategoryParam) next, 2, C47951a.m148884a(i).intValue(), null));
                        i = i2;
                    }
                }
                if (!this.f108187d.isEmpty()) {
                    String string = this.f108185b.getResources().getString(R.string.a47);
                    C7573i.m23582a((Object) string, "resources.getString(R.string.classify_choose_tips)");
                    arrayList.add(new C41591b(1, 0, null, new Pair(string, C47951a.m148882a(!this.f108186c.isEmpty()))));
                    int i3 = 0;
                    for (Object next2 : this.f108187d) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            C7525m.m23465b();
                        }
                        arrayList.add(C41590a.m132436a((VideoCategoryParam) next2, 0, C47951a.m148884a(i3).intValue(), null));
                        i3 = i4;
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: g */
    private void m132506g() {
        if (this.f108146m != null) {
            this.f108146m.clear();
        }
    }

    /* renamed from: a */
    public final C41611c mo102238a() {
        return (C41611c) this.f108139f.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m132506g();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: d */
    public final VideoCategoryParam mo102247d() {
        if (this.f108137c.get()) {
            return this.f108136b;
        }
        return null;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f108143j.mo120332n();
    }

    /* renamed from: f */
    private final void m132505f() {
        C48145g.m149385a(this.f108145l, C15388c.m44889a(), null, new C41621c(this, null), 2, null);
    }

    /* renamed from: c */
    public final void mo102246c() {
        StatusLoadingDialog statusLoadingDialog = this.f108142i;
        if (statusLoadingDialog != null && statusLoadingDialog.isShowing()) {
            StatusLoadingDialog statusLoadingDialog2 = this.f108142i;
            if (statusLoadingDialog2 != null) {
                statusLoadingDialog2.dismiss();
            }
        }
    }

    /* renamed from: b */
    public final void mo102244b() {
        if (this.f108142i == null) {
            FragmentActivity requireActivity = requireActivity();
            C7573i.m23582a((Object) requireActivity, "requireActivity()");
            StatusLoadingDialog statusLoadingDialog = new StatusLoadingDialog(requireActivity);
            statusLoadingDialog.setCancelable(false);
            this.f108142i = statusLoadingDialog;
        }
        StatusLoadingDialog statusLoadingDialog2 = this.f108142i;
        if (statusLoadingDialog2 != null) {
            statusLoadingDialog2.show();
        }
    }

    /* renamed from: e */
    private final void m132504e() {
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getContext(), 3, 1, false);
        RecyclerView recyclerView = this.f108141h;
        if (recyclerView == null) {
            C7573i.m23583a("mVideoCategoryList");
        }
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        RecyclerView recyclerView2 = this.f108141h;
        if (recyclerView2 == null) {
            C7573i.m23583a("mVideoCategoryList");
        }
        if (recyclerView2.getAdapter() == null) {
            SpaceItemDecoration spaceItemDecoration = new SpaceItemDecoration(3);
            VideoCategoryAdapter videoCategoryAdapter = new VideoCategoryAdapter(spaceItemDecoration, new C41628g(this));
            videoCategoryAdapter.mo66516d(false);
            this.f108138d = videoCategoryAdapter;
            RecyclerView recyclerView3 = this.f108141h;
            if (recyclerView3 == null) {
                C7573i.m23583a("mVideoCategoryList");
            }
            VideoCategoryAdapter videoCategoryAdapter2 = this.f108138d;
            if (videoCategoryAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            recyclerView3.setAdapter(videoCategoryAdapter2);
            recyclerView3.mo5525a((C1272h) spaceItemDecoration);
            return;
        }
        RecyclerView recyclerView4 = this.f108141h;
        if (recyclerView4 == null) {
            C7573i.m23583a("mVideoCategoryList");
        }
        C1262a adapter = recyclerView4.getAdapter();
        if (adapter != null) {
            this.f108138d = (VideoCategoryAdapter) adapter;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryAdapter");
    }

    /* renamed from: a */
    public static final /* synthetic */ VideoCategoryAdapter m132503a(ChooseVideoCategoryFragment chooseVideoCategoryFragment) {
        VideoCategoryAdapter videoCategoryAdapter = chooseVideoCategoryFragment.f108138d;
        if (videoCategoryAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        return videoCategoryAdapter;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            m132504e();
            m132505f();
        }
    }

    public final void onCreate(Bundle bundle) {
        VideoCategoryParam videoCategoryParam;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            videoCategoryParam = (VideoCategoryParam) arguments.getParcelable("KEY_VIDEO_DEFAULT_CATEGORY");
        } else {
            videoCategoryParam = null;
        }
        this.f108136b = videoCategoryParam;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_video_mob_param");
        }
        if (serializable != null) {
            this.f108140g = (AVETParameter) serializable;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.model.AVETParameter");
    }

    /* renamed from: b */
    public final void mo102245b(VideoCategoryParam videoCategoryParam) {
        Intent intent = new Intent();
        String str = "KEY_VIDEO_CATEGORY_CHOOSE_RESULT";
        if (videoCategoryParam != null) {
            intent.putExtra(str, videoCategoryParam);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo102242a(C47919b<? super List<VideoCategoryParam>> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C41626e(this, null), bVar);
    }

    /* renamed from: a */
    public final void mo102243a(VideoCategoryParam videoCategoryParam) {
        String str = "click_type";
        C38511bc a = C38511bc.m123103a().mo96485a("enter_from", "video_post_page");
        String str2 = "shoot_way";
        AVETParameter aVETParameter = this.f108140g;
        if (aVETParameter == null) {
            C7573i.m23583a("mMobParam");
        }
        C38511bc a2 = a.mo96485a(str2, aVETParameter.getShootWay());
        String str3 = "creation_id";
        AVETParameter aVETParameter2 = this.f108140g;
        if (aVETParameter2 == null) {
            C7573i.m23583a("mMobParam");
        }
        C6907h.m21524a(str, (Map) a2.mo96485a(str3, aVETParameter2.getCreationId()).mo96485a("content_source", "upload").mo96485a("content_type", "video").mo96483a("type", videoCategoryParam.getCategoryIndex()).mo96485a("type_name", videoCategoryParam.getCategoryName()).f100112a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo102239a(int i, C47919b<? super List<VideoCategoryParam>> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C41627f(this, 3, null), bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo102241a(List<VideoCategoryParam> list, C47919b<? super Boolean> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C41625d(this, list, null), bVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.ng, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.eab);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.video_category_list)");
        this.f108141h = (RecyclerView) findViewById;
        return inflate;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo102240a(List<VideoCategoryParam> list, List<VideoCategoryParam> list2, C47919b<? super List<C41591b>> bVar) {
        return C48143e.m149376a(C48080as.m149073c(), new C41629h(this, list, list2, null), bVar);
    }
}
