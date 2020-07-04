package dmt.p1861av.video.p1863b;

import android.content.Context;
import android.view.SurfaceHolder;
import com.p280ss.android.ugc.asve.constant.AS_ENCODE_PROFILE;
import com.p280ss.android.ugc.asve.context.C15420a;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.context.C15424d;
import com.p280ss.android.ugc.asve.context.C15428f;
import com.p280ss.android.ugc.asve.context.C15430g;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.recorder.C20733d;
import com.p280ss.android.ugc.asve.sandbox.C21053p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40312g;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: dmt.av.video.b.d */
public final class C47445d implements C15432h {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f121812a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C47445d.class), "workspaceProvider", "getWorkspaceProvider()Lcom/ss/android/ugc/asve/recorder/IRecorderWorkspaceProvider;"))};

    /* renamed from: b */
    public C21053p f121813b;

    /* renamed from: c */
    public final Void f121814c;

    /* renamed from: d */
    public final Context f121815d;

    /* renamed from: e */
    public final ShortVideoContext f121816e;

    /* renamed from: f */
    public final C15420a f121817f;

    /* renamed from: g */
    private final C7541d f121818g;

    /* renamed from: h */
    private final C15430g f121819h;

    /* renamed from: i */
    private final C15428f f121820i;

    /* renamed from: j */
    private final C15424d f121821j;

    /* renamed from: k */
    private final Pair<Integer, Integer> f121822k;

    /* renamed from: l */
    private final boolean f121823l;

    /* renamed from: m */
    private final boolean f121824m;

    /* renamed from: n */
    private final boolean f121825n;

    /* renamed from: o */
    private final boolean f121826o;

    /* renamed from: p */
    private final boolean f121827p;

    /* renamed from: q */
    private final Boolean f121828q = null;

    /* renamed from: r */
    private final boolean f121829r;

    /* renamed from: dmt.av.video.b.d$a */
    public static final class C47446a implements C15424d {

        /* renamed from: a */
        final /* synthetic */ C47445d f121830a;

        /* renamed from: b */
        private final boolean f121831b;

        /* renamed from: c */
        private final boolean f121832c;

        /* renamed from: d */
        private final float f121833d;

        /* renamed from: e */
        private final AS_ENCODE_PROFILE f121834e;

        /* renamed from: f */
        private final int f121835f;

        /* renamed from: g */
        private final boolean f121836g;

        /* renamed from: a */
        public final float mo38935a() {
            return 1.0f;
        }

        /* renamed from: b */
        public final boolean mo38936b() {
            return this.f121832c;
        }

        /* renamed from: c */
        public final float mo38937c() {
            return this.f121833d;
        }

        /* renamed from: d */
        public final boolean mo38938d() {
            return this.f121831b;
        }

        /* renamed from: e */
        public final int mo38939e() {
            return this.f121835f;
        }

        /* renamed from: f */
        public final AS_ENCODE_PROFILE mo38940f() {
            return this.f121834e;
        }

        /* renamed from: g */
        public final boolean mo38941g() {
            return this.f121836g;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
            if (r0 == null) goto L_0x001a;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo38942h() {
            /*
                r9 = this;
                boolean r0 = r9.mo38941g()
                if (r0 == 0) goto L_0x004d
                dmt.av.video.b.d r0 = r9.f121830a
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.f121816e
                com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r0 = r0.f99775k
                if (r0 == 0) goto L_0x001a
                java.io.File r0 = r0.mo96314c()
                if (r0 == 0) goto L_0x001a
                java.lang.String r0 = r0.getPath()
                if (r0 != 0) goto L_0x001c
            L_0x001a:
                java.lang.String r0 = ""
            L_0x001c:
                r4 = r0
                r1 = 1
                r2 = 0
                dmt.av.video.b.d r0 = r9.f121830a
                android.content.Context r3 = r0.f121815d
                r0 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                dmt.av.video.b.d r0 = r9.f121830a
                kotlin.Pair r0 = r0.mo38922e()
                java.lang.Object r0 = r0.getFirst()
                r6 = r0
                java.lang.Integer r6 = (java.lang.Integer) r6
                dmt.av.video.b.d r0 = r9.f121830a
                kotlin.Pair r0 = r0.mo38922e()
                java.lang.Object r0 = r0.getSecond()
                r7 = r0
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = 0
                java.lang.String r0 = com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l.m123252a(r1, r2, r3, r4, r5, r6, r7, r8)
                java.lang.String r1 = "MetaDataUtil.getMetaData… outputSize.second, null)"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                return r0
            L_0x004d:
                java.lang.String r0 = ""
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dmt.p1861av.video.p1863b.C47445d.C47446a.mo38942h():java.lang.String");
        }

        C47446a(C47445d dVar) {
            this.f121830a = dVar;
            boolean z = true;
            if (dVar.f121816e.f99783s != 1) {
                z = false;
            }
            this.f121831b = z;
            this.f121832c = C35563c.f93231M.mo93305a(Property.EnableEnhanceVolume);
            this.f121833d = C36964i.m118929e() * 4.0f;
            this.f121834e = C40312g.m128764b();
            this.f121835f = C36964i.m118931g();
            this.f121836g = dVar.f121816e.f99706K;
        }
    }

    /* renamed from: dmt.av.video.b.d$b */
    public static final class C47447b implements C15428f {

        /* renamed from: a */
        final /* synthetic */ C47445d f121837a;

        /* renamed from: b */
        private final boolean f121838b;

        /* renamed from: c */
        private final String f121839c;

        /* renamed from: d */
        private final String f121840d;

        /* renamed from: e */
        private final int f121841e;

        /* renamed from: f */
        private final int f121842f;

        /* renamed from: a */
        public final boolean mo38970a() {
            return this.f121838b;
        }

        /* renamed from: b */
        public final String mo38971b() {
            return this.f121839c;
        }

        /* renamed from: c */
        public final String mo38972c() {
            return this.f121840d;
        }

        /* renamed from: d */
        public final int mo38973d() {
            return this.f121841e;
        }

        /* renamed from: e */
        public final int mo38974e() {
            return this.f121842f;
        }

        C47447b(C47445d dVar) {
            FaceStickerBean faceStickerBean;
            boolean z;
            this.f121837a = dVar;
            GameDuetResource gameDuetResource = dVar.f121816e.f99753an;
            if (gameDuetResource != null) {
                faceStickerBean = gameDuetResource.gameSticker;
            } else {
                faceStickerBean = null;
            }
            if (faceStickerBean != null) {
                z = true;
            } else {
                z = false;
            }
            this.f121838b = z;
            String str = dVar.f121816e.f99701F;
            if (str == null) {
                str = "";
            }
            this.f121839c = str;
            String str2 = dVar.f121816e.f99700E;
            if (str2 == null) {
                str2 = "";
            }
            this.f121840d = str2;
            this.f121841e = dVar.f121816e.f99702G;
            this.f121842f = dVar.f121816e.f99703H;
        }
    }

    /* renamed from: dmt.av.video.b.d$c */
    public static final class C47448c implements C15430g {

        /* renamed from: a */
        final /* synthetic */ C47445d f121843a;

        /* renamed from: b */
        private final String f121844b;

        /* renamed from: c */
        private final String f121845c;

        /* renamed from: d */
        private final boolean f121846d;

        /* renamed from: a */
        public final String mo38975a() {
            return this.f121844b;
        }

        /* renamed from: b */
        public final String mo38976b() {
            return this.f121845c;
        }

        /* renamed from: c */
        public final float mo38977c() {
            return 0.66f;
        }

        /* renamed from: d */
        public final boolean mo38978d() {
            return this.f121846d;
        }

        /* renamed from: e */
        public final int mo38979e() {
            return R.array.a7;
        }

        /* renamed from: f */
        public final int mo38980f() {
            return R.array.a6;
        }

        /* renamed from: g */
        public final int mo38981g() {
            return R.drawable.bg4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
            if (r0 == null) goto L_0x000f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
            if (r0 == null) goto L_0x001d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C47448c(dmt.p1861av.video.p1863b.C47445d r2) {
            /*
                r1 = this;
                r1.f121843a = r2
                r1.<init>()
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.f121816e
                com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r0.f99705J
                if (r0 == 0) goto L_0x000f
                java.lang.String r0 = r0.wavPath
                if (r0 != 0) goto L_0x0011
            L_0x000f:
                java.lang.String r0 = ""
            L_0x0011:
                r1.f121844b = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r2.f121816e
                com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r0 = r0.f99705J
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r0.videoPath
                if (r0 != 0) goto L_0x001f
            L_0x001d:
                java.lang.String r0 = ""
            L_0x001f:
                r1.f121845c = r0
                com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r2.f121816e
                com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams r2 = r2.f99705J
                r0 = 0
                if (r2 == 0) goto L_0x002b
                boolean r2 = r2.nonReacted
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                if (r2 != 0) goto L_0x002f
                r0 = 1
            L_0x002f:
                r1.f121846d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dmt.p1861av.video.p1863b.C47445d.C47448c.<init>(dmt.av.video.b.d):void");
        }
    }

    /* renamed from: dmt.av.video.b.d$d */
    static final class C47449d extends Lambda implements C7561a<C47442a> {

        /* renamed from: a */
        final /* synthetic */ C47445d f121847a;

        C47449d(C47445d dVar) {
            this.f121847a = dVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C47442a invoke() {
            Workspace workspace = this.f121847a.f121816e.f99775k;
            if (workspace == null) {
                workspace = Workspace.m122801a();
                C7573i.m23582a((Object) workspace, "Workspace.allocate()");
            }
            return new C47442a(workspace);
        }
    }

    /* renamed from: a */
    public final Boolean mo38918a() {
        return this.f121828q;
    }

    /* renamed from: b */
    public final boolean mo38919b() {
        return false;
    }

    /* renamed from: d */
    public final C20733d mo38921d() {
        return (C20733d) this.f121818g.getValue();
    }

    /* renamed from: e */
    public final Pair<Integer, Integer> mo38922e() {
        return this.f121822k;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47445d) {
                C47445d dVar = (C47445d) obj;
                if (C7573i.m23585a((Object) this.f121815d, (Object) dVar.f121815d) && C7573i.m23585a((Object) this.f121816e, (Object) dVar.f121816e) && C7573i.m23585a((Object) this.f121817f, (Object) dVar.f121817f) && C7573i.m23585a((Object) mo38918a(), (Object) dVar.mo38918a())) {
                    if (mo38931n() == dVar.mo38931n()) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo38923f() {
        return this.f121824m;
    }

    /* renamed from: g */
    public final boolean mo38924g() {
        return this.f121825n;
    }

    /* renamed from: h */
    public final boolean mo38925h() {
        return this.f121826o;
    }

    public final int hashCode() {
        Context context = this.f121815d;
        int i = 0;
        int hashCode = (context != null ? context.hashCode() : 0) * 31;
        ShortVideoContext shortVideoContext = this.f121816e;
        int hashCode2 = (hashCode + (shortVideoContext != null ? shortVideoContext.hashCode() : 0)) * 31;
        C15420a aVar = this.f121817f;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Boolean a = mo38918a();
        if (a != null) {
            i = a.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean n = mo38931n();
        if (n) {
            n = true;
        }
        return i2 + (n ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo38926i() {
        return this.f121823l;
    }

    /* renamed from: j */
    public final C15428f mo38927j() {
        return this.f121820i;
    }

    /* renamed from: k */
    public final C15430g mo38928k() {
        return this.f121819h;
    }

    /* renamed from: l */
    public final C15424d mo38929l() {
        return this.f121821j;
    }

    /* renamed from: n */
    public final boolean mo38931n() {
        return this.f121829r;
    }

    /* renamed from: o */
    public final C21053p mo38932o() {
        return this.f121813b;
    }

    /* renamed from: p */
    public final boolean mo38933p() {
        return this.f121827p;
    }

    /* renamed from: q */
    public final boolean mo38934q() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecorderContext(context=");
        sb.append(this.f121815d);
        sb.append(", shortVideoContext=");
        sb.append(this.f121816e);
        sb.append(", cameraContext=");
        sb.append(this.f121817f);
        sb.append(", isUseVERecorder=");
        sb.append(mo38918a());
        sb.append(", enableSandBox=");
        sb.append(mo38931n());
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ SurfaceHolder mo38920c() {
        return (SurfaceHolder) this.f121814c;
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C15422c mo38930m() {
        return this.f121817f;
    }

    public C47445d(Context context, ShortVideoContext shortVideoContext, C15420a aVar, Boolean bool, boolean z) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        C7573i.m23587b(aVar, "cameraContext");
        this.f121815d = context;
        this.f121816e = shortVideoContext;
        this.f121817f = aVar;
        this.f121829r = z;
        this.f121818g = C7546e.m23569a(new C47449d(this));
        this.f121819h = new C47448c(this);
        this.f121820i = new C47447b(this);
        this.f121821j = new C47446a(this);
        this.f121822k = new Pair<>(Integer.valueOf(this.f121816e.f99773i), Integer.valueOf(this.f121816e.f99774j));
        this.f121823l = this.f121816e.mo96141c();
        this.f121824m = C35563c.f93231M.mo93305a(Property.EnableEffectNewEngine);
        this.f121825n = !C35563c.f93231M.mo93305a(Property.CameraOptionFlagsOpt);
        this.f121826o = C35563c.f93231M.mo93305a(Property.EnableEffectParallelFwk);
        this.f121827p = C35563c.f93231M.mo93305a(Property.EnableThreeBuffer);
    }
}
