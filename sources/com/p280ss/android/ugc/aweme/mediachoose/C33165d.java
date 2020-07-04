package com.p280ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42133c;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.p280ss.android.vesdk.VEConstant.CODEC_ID;
import com.p280ss.android.vesdk.VEUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.p356e.C7551d;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.d */
public final class C33165d implements C33185q {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f86319a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C33165d.class), "videoLegalCheckThreadPool", "getVideoLegalCheckThreadPool()Ljava/util/concurrent/ExecutorService;"))};

    /* renamed from: b */
    public final Context f86320b;

    /* renamed from: c */
    private final C7541d f86321c = C7546e.m23569a(C33172e.f86340a);

    /* renamed from: d */
    private final String f86322d = "video/mp4";

    /* renamed from: e */
    private boolean f86323e = true;

    /* renamed from: f */
    private String f86324f = "";

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.d$a */
    static final class C33166a<V> implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f86325a;

        /* renamed from: b */
        final /* synthetic */ IntRef f86326b;

        C33166a(MediaModel mediaModel, IntRef intRef) {
            this.f86325a = mediaModel;
            this.f86326b = intRef;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m107015a());
        }

        /* renamed from: a */
        private int m107015a() {
            int[] iArr = new int[10];
            String str = this.f86325a.f88156b;
            C7573i.m23582a((Object) str, "mediaModel.filePath");
            int a = C42133c.m134093a(str, iArr);
            if (a == 0) {
                this.f86325a.f88163i = iArr[0];
                this.f86325a.f88164j = iArr[1];
                this.f86326b.element = iArr[8];
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.d$b */
    static final class C33167b<TTaskResult, TContinuationResult> implements C1591g<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7563m f86327a;

        /* renamed from: b */
        final /* synthetic */ IntRef f86328b;

        C33167b(C7563m mVar, IntRef intRef) {
            this.f86327a = mVar;
            this.f86328b = intRef;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m107016a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m107016a(C1592h<Integer> hVar) {
            C7563m mVar = this.f86327a;
            C7573i.m23582a((Object) hVar, "task");
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "task.result");
            mVar.invoke(e, Integer.valueOf(this.f86328b.element));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.d$c */
    static final class C33168c extends Lambda implements C48006q<String, Long, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C48007r f86329a;

        C33168c(C48007r rVar) {
            this.f86329a = rVar;
            super(3);
        }

        /* renamed from: a */
        public final void mo84916a(String str, long j, int i) {
            C7573i.m23587b(str, "checkerType");
            this.f86329a.invoke(str, Long.valueOf(j), Integer.valueOf(i), "");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo84916a((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.d$d */
    static final class C33169d extends Lambda implements C7563m<Integer, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33165d f86330a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f86331b;

        /* renamed from: c */
        final /* synthetic */ long f86332c;

        /* renamed from: d */
        final /* synthetic */ long f86333d;

        /* renamed from: e */
        final /* synthetic */ C7563m f86334e;

        /* renamed from: f */
        final /* synthetic */ C48007r f86335f;

        /* renamed from: g */
        final /* synthetic */ C33168c f86336g;

        /* renamed from: h */
        final /* synthetic */ long f86337h;

        C33169d(C33165d dVar, MediaModel mediaModel, long j, long j2, C7563m mVar, C48007r rVar, C33168c cVar, long j3) {
            this.f86330a = dVar;
            this.f86331b = mediaModel;
            this.f86332c = j;
            this.f86333d = j2;
            this.f86334e = mVar;
            this.f86335f = rVar;
            this.f86336g = cVar;
            this.f86337h = j3;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m107018a(((Number) obj).intValue(), ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m107018a(int i, int i2) {
            if (i != 0) {
                C33146a aVar = new C33146a(this.f86330a.f86320b);
                aVar.mo84893a(this.f86330a.mo84913c());
                aVar.mo84891a(this.f86331b, this.f86332c, this.f86333d, this.f86334e, this.f86335f);
                return;
            }
            int c = C7551d.m23566c(this.f86331b.f88163i, this.f86331b.f88164j);
            int d = C7551d.m23567d(this.f86331b.f88163i, this.f86331b.f88164j);
            int i3 = -5;
            if (!C33165d.m107008e()) {
                if (d > 1100) {
                    this.f86336g.mo84916a(C33165d.m107007b(), System.currentTimeMillis() - this.f86337h, -5);
                    return;
                }
            } else if (d > 1100) {
                if (TextUtils.equals(this.f86330a.mo84914d(), "enter_from_multi")) {
                    i3 = -8;
                } else if (i2 != CODEC_ID.AV_CODEC_ID_H264.ordinal()) {
                    i3 = -7;
                } else if (d <= 2160 && c <= 4096) {
                    i3 = 0;
                }
                if (i3 != 0) {
                    this.f86336g.mo84916a(C33165d.m107007b(), System.currentTimeMillis() - this.f86337h, i3);
                    return;
                } else {
                    C1592h.m7855a((Callable<TResult>) new Callable<Integer>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C33169d f86338a;

                        {
                            this.f86338a = r1;
                        }

                        public final /* synthetic */ Object call() {
                            return Integer.valueOf(m107019a());
                        }

                        /* renamed from: a */
                        private int m107019a() {
                            String str = this.f86338a.f86331b.f88156b;
                            C7573i.m23582a((Object) str, "mediaModel.filePath");
                            return VEUtils.isCanImport(C43142i.m136842a(str, MediaType.VIDEO));
                        }
                    }, (Executor) this.f86330a.mo84912a()).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<Integer, C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C33169d f86339a;

                        {
                            this.f86339a = r1;
                        }

                        public final /* synthetic */ Object then(C1592h hVar) {
                            m107020a(hVar);
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m107020a(C1592h<Integer> hVar) {
                            C7573i.m23582a((Object) hVar, "task");
                            Integer num = (Integer) hVar.mo6890e();
                            if (num != null && num.intValue() == 0) {
                                this.f86339a.f86334e.invoke(C33165d.m107007b(), Long.valueOf(System.currentTimeMillis() - this.f86339a.f86337h));
                                return;
                            }
                            C33168c cVar = this.f86339a.f86336g;
                            String b = C33165d.m107007b();
                            long currentTimeMillis = System.currentTimeMillis() - this.f86339a.f86337h;
                            Object e = hVar.mo6890e();
                            C7573i.m23582a(e, "task.result");
                            cVar.mo84916a(b, currentTimeMillis, ((Number) e).intValue());
                        }
                    }, C1592h.f5958b);
                    return;
                }
            }
            this.f86334e.invoke(C33165d.m107007b(), Long.valueOf(System.currentTimeMillis() - this.f86337h));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.d$e */
    static final class C33172e extends Lambda implements C7561a<ExecutorService> {

        /* renamed from: a */
        public static final C33172e f86340a = new C33172e();

        C33172e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m107021a();
        }

        /* renamed from: a */
        private static ExecutorService m107021a() {
            return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18994a("videoLegalCheck").mo18996a());
        }
    }

    /* renamed from: b */
    public static String m107007b() {
        return "LocalVideoLegalChecker";
    }

    /* renamed from: a */
    public final ExecutorService mo84912a() {
        return (ExecutorService) this.f86321c.getValue();
    }

    /* renamed from: c */
    public final boolean mo84913c() {
        return this.f86323e;
    }

    /* renamed from: d */
    public final String mo84914d() {
        return this.f86324f;
    }

    /* renamed from: e */
    public static boolean m107008e() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Integer enable4kImport = a.getEnable4kImport();
            if (enable4kImport == null) {
                return false;
            }
            if (enable4kImport.intValue() == 1) {
                return true;
            }
            return false;
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo84893a(boolean z) {
        this.f86323e = z;
    }

    /* renamed from: a */
    public final void mo84892a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f86324f = str;
    }

    public C33165d(Context context) {
        C7573i.m23587b(context, "context");
        this.f86320b = context;
    }

    /* renamed from: a */
    private final void m107006a(MediaModel mediaModel, boolean z, C7563m<? super Integer, ? super Integer, C7581n> mVar) {
        if (mediaModel.f88163i <= 0 || mediaModel.f88164j <= 0 || (!z && C7551d.m23567d(mediaModel.f88163i, mediaModel.f88164j) > 1100)) {
            IntRef intRef = new IntRef();
            intRef.element = 0;
            C1592h.m7855a((Callable<TResult>) new C33166a<TResult>(mediaModel, intRef), (Executor) mo84912a()).mo6876a((C1591g<TResult, TContinuationResult>) new C33167b<TResult,TContinuationResult>(mVar, intRef), C1592h.f5958b);
            return;
        }
        mVar.invoke(Integer.valueOf(0), Integer.valueOf(0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        if (r0 == null) goto L_0x0063;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84891a(com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r17, long r18, long r20, kotlin.jvm.p357a.C7563m<? super java.lang.String, ? super java.lang.Long, kotlin.C7581n> r22, kotlin.jvm.p357a.C48007r<? super java.lang.String, ? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.String, kotlin.C7581n> r23) {
        /*
            r16 = this;
            r12 = r16
            r13 = r17
            r8 = r23
            java.lang.String r0 = "mediaModel"
            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
            java.lang.String r0 = "onSuccess"
            r7 = r22
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            com.ss.android.ugc.aweme.mediachoose.d$c r9 = new com.ss.android.ugc.aweme.mediachoose.d$c
            r9.<init>(r8)
            com.ss.android.ugc.aweme.utils.g r0 = com.p280ss.android.ugc.aweme.utils.C43137g.C43138a.m136839a()
            java.lang.String r1 = r13.f88156b
            java.lang.String r2 = "mediaModel.filePath"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.utils.MediaType r2 = com.p280ss.android.ugc.aweme.utils.MediaType.VIDEO
            r0.mo104766a(r1, r2)
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r13.f88156b
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0106
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r13.f88156b
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0049
            goto L_0x0106
        L_0x0049:
            java.lang.String r0 = r13.f88161g
            if (r0 == 0) goto L_0x0063
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            if (r0 != 0) goto L_0x0065
            goto L_0x0063
        L_0x005b:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0063:
            java.lang.String r0 = ""
        L_0x0065:
            java.lang.String r1 = r13.f88161g
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x007e
            java.lang.String r1 = r12.f86322d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x007e
            r1 = 1
            goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            if (r1 != 0) goto L_0x00b2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = m107007b()
            r1.append(r2)
            java.lang.String r2 = " ImportVideoTypeError:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.ugc.aweme.shortvideo.util.C41530am.m132280a(r1)
            java.lang.String r1 = m107007b()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r10
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = -2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.invoke(r1, r2, r3, r0)
            return
        L_0x00b2:
            long r0 = r13.f88159e
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c6
            java.lang.String r0 = m107007b()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            r3 = -1
            r9.mo84916a(r0, r1, r3)
            return
        L_0x00c6:
            r0 = -1
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00e0
            long r0 = r13.f88159e
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e0
            java.lang.String r0 = m107007b()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            r3 = -6
            r9.mo84916a(r0, r1, r3)
            return
        L_0x00e0:
            java.lang.String r0 = r16.mo84914d()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "enter_from_multi"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r14 = android.text.TextUtils.equals(r0, r1)
            com.ss.android.ugc.aweme.mediachoose.d$d r15 = new com.ss.android.ugc.aweme.mediachoose.d$d
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r7 = r22
            r8 = r23
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            kotlin.jvm.a.m r15 = (kotlin.jvm.p357a.C7563m) r15
            r12.m107006a(r13, r14, r15)
            return
        L_0x0106:
            java.lang.String r0 = m107007b()
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r10
            r3 = -4
            r9.mo84916a(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mediachoose.C33165d.mo84891a(com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel, long, long, kotlin.jvm.a.m, kotlin.jvm.a.r):void");
    }
}
