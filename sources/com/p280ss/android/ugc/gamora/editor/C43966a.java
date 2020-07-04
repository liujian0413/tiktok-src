package com.p280ss.android.ugc.gamora.editor;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39504az;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39512ba;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39777p.C39778a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfig;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.ResultData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.ResultStatus;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.State;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEListener.C45213i;
import kotlin.C7581n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import p346io.reactivex.C47556ac;
import p346io.reactivex.C47558ae;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.gamora.editor.a */
public final class C43966a {

    /* renamed from: c */
    public static final C43967a f113819c = new C43967a(null);

    /* renamed from: a */
    public CompileProbeConfig f113820a;

    /* renamed from: b */
    public C43982d f113821b;

    /* renamed from: com.ss.android.ugc.gamora.editor.a$a */
    public static final class C43967a {
        private C43967a() {
        }

        public /* synthetic */ C43967a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m139242a(String str) {
            StringBuilder sb = new StringBuilder("CompileProbe + ");
            sb.append(str);
            C41530am.m132280a(sb.toString());
        }

        /* renamed from: a */
        public static void m139243a(String str, boolean z) {
            if (z) {
                StringBuilder sb = new StringBuilder("CompileProbe + ");
                sb.append(str);
                C41530am.m132280a(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$b */
    static final class C43968b extends RuntimeException {

        /* renamed from: a */
        private final C43971b f113822a;

        /* renamed from: a */
        public final C43971b mo106491a() {
            return this.f113822a;
        }

        public C43968b(C43971b bVar) {
            C7573i.m23587b(bVar, "failed");
            this.f113822a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$c */
    public static abstract class C43969c {

        /* renamed from: a */
        public static final C43970a f113823a = new C43970a(null);

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$a */
        public static final class C43970a {
            private C43970a() {
            }

            public /* synthetic */ C43970a(C7571f fVar) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b */
        public static abstract class C43971b extends C43969c {

            /* renamed from: b */
            public final int f113824b;

            /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$a */
            public static abstract class C43972a extends C43971b {

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$a$a */
                public static final class C43973a extends C43972a {
                    public C43973a(int i) {
                        super(i, null);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$a$b */
                public static final class C43974b extends C43972a {

                    /* renamed from: c */
                    public static final C43974b f113825c = new C43974b();

                    private C43974b() {
                        super(-234, null);
                    }
                }

                private C43972a(int i) {
                    super(i, null);
                }

                public /* synthetic */ C43972a(int i, C7571f fVar) {
                    this(i);
                }
            }

            /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$b */
            public static abstract class C43975b extends C43971b {

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$b$a */
                public static final class C43976a extends C43975b {
                    public C43976a(int i) {
                        super(i, null);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$b$b */
                public static final class C43977b extends C43975b {
                    public C43977b(int i) {
                        super(i, null);
                    }
                }

                /* renamed from: com.ss.android.ugc.gamora.editor.a$c$b$b$c */
                public static final class C43978c extends C43975b {

                    /* renamed from: c */
                    public final String f113826c;

                    public C43978c(String str) {
                        C7573i.m23587b(str, "msg");
                        super(-233, null);
                        this.f113826c = str;
                    }
                }

                private C43975b(int i) {
                    super(i, null);
                }

                public /* synthetic */ C43975b(int i, C7571f fVar) {
                    this(i);
                }
            }

            private C43971b(int i) {
                super(null);
                this.f113824b = i;
            }

            public /* synthetic */ C43971b(int i, C7571f fVar) {
                this(i);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$c */
        public static final class C43979c extends C43969c {

            /* renamed from: b */
            public static final C43979c f113827b = new C43979c();

            private C43979c() {
                super(null);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$d */
        public static final class C43980d extends C43969c {

            /* renamed from: b */
            public static final C43980d f113828b = new C43980d();

            private C43980d() {
                super(null);
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.editor.a$c$e */
        public static final class C43981e extends C43969c {

            /* renamed from: b */
            public static final C43981e f113829b = new C43981e();

            private C43981e() {
                super(null);
            }
        }

        private C43969c() {
        }

        public /* synthetic */ C43969c(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$d */
    static final class C43982d {

        /* renamed from: a */
        public C43969c f113830a = C43979c.f113827b;

        /* renamed from: b */
        private final C7561a<C7581n> f113831b;

        /* renamed from: c */
        private final C7561a<C7581n> f113832c;

        /* renamed from: d */
        private final C7562b<CompileProbeResult, C7581n> f113833d;

        /* renamed from: a */
        public final void mo106492a() {
            if (C7573i.m23585a((Object) this.f113830a, (Object) C43979c.f113827b)) {
                this.f113830a = C43980d.f113828b;
                this.f113831b.invoke();
            }
        }

        /* renamed from: b */
        public final void mo106495b() {
            if (C7573i.m23585a((Object) this.f113830a, (Object) C43980d.f113828b)) {
                C43974b bVar = C43974b.f113825c;
                this.f113830a = bVar;
                this.f113832c.invoke();
                this.f113833d.invoke(new CompileProbeResult(new ResultStatus(State.CANCEL, bVar.f113824b, bVar.f113824b, "OuterCancel"), null, 2, null));
            }
        }

        /* renamed from: c */
        public final void mo106496c() {
            C43969c cVar = this.f113830a;
            if (C7573i.m23585a((Object) cVar, (Object) C43979c.f113827b) || C7573i.m23585a((Object) cVar, (Object) C43981e.f113829b) || (cVar instanceof C43971b)) {
                this.f113830a = C43979c.f113827b;
                return;
            }
            if (C7573i.m23585a((Object) cVar, (Object) C43980d.f113828b)) {
                C43967a.m139242a("clear on running");
            }
        }

        /* renamed from: a */
        public final void mo106493a(CompileProbeResult compileProbeResult) {
            C7573i.m23587b(compileProbeResult, "result");
            if (C7573i.m23585a((Object) this.f113830a, (Object) C43980d.f113828b)) {
                this.f113830a = C43981e.f113829b;
                this.f113833d.invoke(compileProbeResult);
                return;
            }
            C43967a.m139242a("Success on not running");
        }

        /* renamed from: a */
        public final void mo106494a(C43971b bVar) {
            CompileProbeResult compileProbeResult;
            C7573i.m23587b(bVar, "failed");
            if (C7573i.m23585a((Object) this.f113830a, (Object) C43980d.f113828b)) {
                this.f113830a = bVar;
                C7562b<CompileProbeResult, C7581n> bVar2 = this.f113833d;
                if ((bVar instanceof C43976a) || (bVar instanceof C43977b)) {
                    ResultStatus resultStatus = new ResultStatus(State.ERROR, bVar.f113824b, 0, null, 12, null);
                    compileProbeResult = new CompileProbeResult(resultStatus, null, 2, null);
                } else if (bVar instanceof C43978c) {
                    compileProbeResult = new CompileProbeResult(new ResultStatus(State.ERROR, bVar.f113824b, bVar.f113824b, ((C43978c) bVar).f113826c), null, 2, null);
                } else if (bVar instanceof C43973a) {
                    ResultStatus resultStatus2 = new ResultStatus(State.CANCEL, bVar.f113824b, 0, null, 12, null);
                    compileProbeResult = new CompileProbeResult(resultStatus2, null, 2, null);
                } else if (C7573i.m23585a((Object) bVar, (Object) C43974b.f113825c)) {
                    C43967a.m139242a("OuterCancel on inner Failed");
                    compileProbeResult = new CompileProbeResult(new ResultStatus(State.CANCEL, bVar.f113824b, bVar.f113824b, "OuterCancel"), null, 2, null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2.invoke(compileProbeResult);
                return;
            }
            C43967a.m139242a("Failed on not running");
        }

        public C43982d(C7561a<C7581n> aVar, C7561a<C7581n> aVar2, C7562b<? super CompileProbeResult, C7581n> bVar) {
            C7573i.m23587b(aVar, "realStart");
            C7573i.m23587b(aVar2, "manualCancel");
            C7573i.m23587b(bVar, "onResult");
            this.f113831b = aVar;
            this.f113832c = aVar2;
            this.f113833d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$e */
    static final class C43983e extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f113834a;

        C43983e(VideoPublishEditModel videoPublishEditModel) {
            this.f113834a = videoPublishEditModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo106497a());
        }

        /* renamed from: a */
        public final boolean mo106497a() {
            boolean z;
            C43967a aVar = C43966a.f113819c;
            StringBuilder sb = new StringBuilder("isSingleSegmentVideo: ");
            sb.append(this.f113834a.mIsMultiVideo);
            sb.append(' ');
            sb.append(this.f113834a.mFromCut);
            sb.append(' ');
            sb.append(this.f113834a.mVideoSegmentsDesc);
            C43967a.m139243a(sb.toString(), false);
            if (this.f113834a.mIsMultiVideo) {
                return false;
            }
            if (this.f113834a.mFromCut) {
                return true;
            }
            CharSequence charSequence = this.f113834a.mVideoSegmentsDesc;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || ShortVideoContext.m122682a(this.f113834a.mVideoSegmentsDesc).size() != 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$f */
    static final class C43984f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C43966a f113835a;

        C43984f(C43966a aVar) {
            this.f113835a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo106498a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo106498a() {
            boolean z;
            String e = C35563c.f93231M.mo93309e(Property.CompileProbeConfig);
            CharSequence charSequence = e;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    this.f113835a.f113820a = (CompileProbeConfig) C35563c.f93239b.mo15974a(e, CompileProbeConfig.class);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("solveCompileProbeConfig failed: ");
                    sb.append(e);
                    C43967a.m139242a(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("solveCompileProbeConfig config: ");
                sb2.append(this.f113835a.f113820a);
                C43967a.m139243a(sb2.toString(), true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$g */
    static final class C43985g extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f113836a;

        C43985g(VideoPublishEditModel videoPublishEditModel) {
            this.f113836a = videoPublishEditModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo106499a());
        }

        /* renamed from: a */
        public final boolean mo106499a() {
            C39504az a = C39512ba.m126206a(this.f113836a, false);
            if (this.f113836a.videoWidth() + this.f113836a.videoHeight() == a.mo98357e() + a.mo98358f()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$h */
    static final class C43986h extends Lambda implements C7561a<C7319aa<CompileProbeResult>> {

        /* renamed from: a */
        final /* synthetic */ C43966a f113837a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f113838b;

        C43986h(C43966a aVar, VideoPublishEditModel videoPublishEditModel) {
            this.f113837a = aVar;
            this.f113838b = videoPublishEditModel;
            super(0);
        }

        /* renamed from: a */
        public final C7319aa<CompileProbeResult> invoke() {
            final LongRef longRef = new LongRef();
            longRef.element = 0;
            final C439882 r1 = new C7561a<Integer>() {
                /* renamed from: a */
                public final int mo106501a() {
                    return (int) (System.currentTimeMillis() - longRef.element);
                }

                public final /* synthetic */ Object invoke() {
                    return Integer.valueOf(mo106501a());
                }
            };
            C7319aa<CompileProbeResult> a = C7319aa.m22925a((C47558ae<T>) new C47558ae<T>(this) {

                /* renamed from: a */
                final /* synthetic */ C43986h f113841a;

                /* renamed from: com.ss.android.ugc.gamora.editor.a$h$3$a */
                static final class C43990a implements C45213i {

                    /* renamed from: a */
                    final /* synthetic */ C439893 f113844a;

                    /* renamed from: b */
                    final /* synthetic */ C47556ac f113845b;

                    C43990a(C439893 r1, C47556ac acVar) {
                        this.f113844a = r1;
                        this.f113845b = acVar;
                    }

                    /* renamed from: a */
                    public final void mo106502a(int i, int i2, float f) {
                        if (i == -10000) {
                            this.f113845b.mo119656b(new C43968b(new C43973a(i)));
                        } else if (i != 0) {
                            this.f113845b.mo119656b(new C43968b(new C43977b(i)));
                        } else {
                            C47556ac acVar = this.f113845b;
                            ResultStatus resultStatus = new ResultStatus(State.SUCCESS, i, 0, null, 12, null);
                            acVar.mo119654a(new CompileProbeResult(resultStatus, new ResultData(i2, f, r1.mo106501a())));
                        }
                    }
                }

                {
                    this.f113841a = r1;
                }

                /* renamed from: a */
                public final void mo22262a(C47556ac<CompileProbeResult> acVar) {
                    C7573i.m23587b(acVar, "it");
                    VEEditor.m142462A();
                    C39504az a = C39512ba.m126206a(this.f113841a.f113838b, false);
                    longRef.element = System.currentTimeMillis();
                    String videoPath = this.f113841a.f113838b.videoPath();
                    String b = C39778a.m127358b();
                    int e = a.mo98357e();
                    int f = a.mo98358f();
                    CompileProbeConfig compileProbeConfig = this.f113841a.f113837a.f113820a;
                    if (compileProbeConfig == null) {
                        C7573i.m23580a();
                    }
                    long startPointMs = compileProbeConfig.getStartPointMs();
                    CompileProbeConfig compileProbeConfig2 = this.f113841a.f113837a.f113820a;
                    if (compileProbeConfig2 == null) {
                        C7573i.m23580a();
                    }
                    int a2 = VEEditor.m142474a(videoPath, b, e, f, startPointMs, compileProbeConfig2.getEndPointMs(), C439871.m139254a(), new C43990a(this, acVar));
                    if (a2 != 0) {
                        acVar.mo119656b(new C43968b(new C43976a(a2)));
                    }
                }
            });
            C7573i.m23582a((Object) a, "create {\n               …          }\n            }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$i */
    static final class C43991i extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C43966a f113846a;

        /* renamed from: b */
        final /* synthetic */ ObjectRef f113847b;

        /* renamed from: c */
        final /* synthetic */ C43986h f113848c;

        C43991i(C43966a aVar, ObjectRef objectRef, C43986h hVar) {
            this.f113846a = aVar;
            this.f113847b = objectRef;
            this.f113848c = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo106503a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo106503a() {
            C43967a.m139243a("Start", true);
            this.f113847b.element = this.f113848c.invoke().mo19135b(C7333a.m23044b()).mo19127a(C47549a.m148327a()).mo19129a((C7326g<? super T>) new C7326g<CompileProbeResult>(this) {

                /* renamed from: a */
                final /* synthetic */ C43991i f113849a;

                {
                    this.f113849a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(CompileProbeResult compileProbeResult) {
                    C43982d dVar = this.f113849a.f113846a.f113821b;
                    if (dVar != null) {
                        C7573i.m23582a((Object) compileProbeResult, "it");
                        dVar.mo106493a(compileProbeResult);
                    }
                }
            }, (C7326g<? super Throwable>) new C7326g<Throwable>(this) {

                /* renamed from: a */
                final /* synthetic */ C43991i f113850a;

                {
                    this.f113850a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(Throwable th) {
                    if (th instanceof C43968b) {
                        C43982d dVar = this.f113850a.f113846a.f113821b;
                        if (dVar != null) {
                            dVar.mo106494a(((C43968b) th).mo106491a());
                        }
                    } else {
                        C43982d dVar2 = this.f113850a.f113846a.f113821b;
                        if (dVar2 != null) {
                            String message = th.getMessage();
                            if (message == null) {
                                message = "FailedNoMessage";
                            }
                            dVar2.mo106494a((C43971b) new C43978c(message));
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$j */
    static final class C43994j extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ ObjectRef f113851a;

        C43994j(ObjectRef objectRef) {
            this.f113851a = objectRef;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo106504a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo106504a() {
            C43967a.m139243a("ManualCancel", true);
            C7321c cVar = (C7321c) this.f113851a.element;
            if (cVar != null) {
                cVar.dispose();
            }
            VEEditor.m142462A();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$k */
    static final class C43995k extends Lambda implements C7562b<CompileProbeResult, C7581n> {

        /* renamed from: a */
        final /* synthetic */ VideoPublishEditModel f113852a;

        C43995k(VideoPublishEditModel videoPublishEditModel) {
            this.f113852a = videoPublishEditModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo106505a((CompileProbeResult) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo106505a(CompileProbeResult compileProbeResult) {
            C7573i.m23587b(compileProbeResult, "result");
            StringBuilder sb = new StringBuilder("onResult: ");
            sb.append(compileProbeResult);
            C43967a.m139243a(sb.toString(), true);
            this.f113852a.compileProbeResult = compileProbeResult;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.a$l */
    static final class C43996l extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C43966a f113853a;

        /* renamed from: b */
        final /* synthetic */ C43991i f113854b;

        /* renamed from: c */
        final /* synthetic */ C43994j f113855c;

        /* renamed from: d */
        final /* synthetic */ C43995k f113856d;

        C43996l(C43966a aVar, C43991i iVar, C43994j jVar, C43995k kVar) {
            this.f113853a = aVar;
            this.f113854b = iVar;
            this.f113855c = jVar;
            this.f113856d = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            mo106506a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo106506a() {
            if (this.f113853a.f113821b == null) {
                this.f113853a.f113821b = new C43982d(new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C43996l f113857a;

                    {
                        this.f113857a = r1;
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
                    private void m139264a() {
                        this.f113857a.f113854b.mo106503a();
                    }

                    public final /* synthetic */ Object invoke() {
                        m139264a();
                        return C7581n.f20898a;
                    }
                }, new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C43996l f113858a;

                    {
                        this.f113858a = r1;
                    }

                    public final String getName() {
                        return "manualCancel";
                    }

                    public final C7585d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke()V";
                    }

                    /* renamed from: a */
                    private void m139265a() {
                        this.f113858a.f113855c.mo106504a();
                    }

                    public final /* synthetic */ Object invoke() {
                        m139265a();
                        return C7581n.f20898a;
                    }
                }, new C7562b<CompileProbeResult, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C43996l f113859a;

                    {
                        this.f113859a = r1;
                    }

                    public final String getName() {
                        return "onResult";
                    }

                    public final C7585d getOwner() {
                        return null;
                    }

                    public final String getSignature() {
                        return "invoke(Lcom/ss/android/ugc/aweme/shortvideo/edit/CompileProbeResult;)V";
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m139266a((CompileProbeResult) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m139266a(CompileProbeResult compileProbeResult) {
                        C7573i.m23587b(compileProbeResult, "p1");
                        this.f113859a.f113856d.mo106505a(compileProbeResult);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo106489a() {
        C43982d dVar = this.f113821b;
        if (dVar != null) {
            dVar.mo106495b();
        }
        C43982d dVar2 = this.f113821b;
        if (dVar2 != null) {
            dVar2.mo106496c();
        }
    }

    /* renamed from: a */
    public final void mo106490a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "videoModel");
        if (!m139237b(videoPublishEditModel)) {
            C43967a.m139243a("Need not start", true);
            return;
        }
        m139238c(videoPublishEditModel);
        C43982d dVar = this.f113821b;
        if (dVar != null) {
            dVar.mo106492a();
        }
    }

    /* renamed from: b */
    private final boolean m139237b(VideoPublishEditModel videoPublishEditModel) {
        C43983e eVar = new C43983e(videoPublishEditModel);
        C43984f fVar = new C43984f(this);
        C43985g gVar = new C43985g(videoPublishEditModel);
        fVar.mo106498a();
        if (this.f113820a != null && eVar.mo106497a() && gVar.mo106499a()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final void m139238c(VideoPublishEditModel videoPublishEditModel) {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = null;
        new C43996l(this, new C43991i(this, objectRef, new C43986h(this, videoPublishEditModel)), new C43994j(objectRef), new C43995k(videoPublishEditModel)).mo106506a();
    }
}
