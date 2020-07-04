package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.ktx.C12637b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effect.C27439r;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40491bc;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40492bd;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.pixaloop.C40426a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.utils.C43107es;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.gamora.recorder.status.C44737a;
import com.p280ss.android.ugc.gamora.recorder.status.C44739b;
import com.p280ss.android.ugc.gamora.recorder.status.C44751c;
import com.p280ss.android.ugc.gamora.recorder.status.StatusBackgroundAdapter.C44735b;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.C47518x.C47519a;
import dmt.p1861av.video.VEPreviewMusicParams;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.gamora.editor.cu */
public final class C44299cu extends C12629j {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f114475i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44299cu.class), "handlerThread", "getHandlerThread()Landroid/os/HandlerThread;"))};

    /* renamed from: u */
    public static final C44300a f114476u = new C44300a(null);

    /* renamed from: A */
    private int f114477A;

    /* renamed from: B */
    private final C7541d f114478B = C7546e.m23569a(C44305e.f114504a);

    /* renamed from: C */
    private C44302c f114479C = new C44302c(this, m140174e().getLooper());

    /* renamed from: D */
    private final C23254a f114480D = new C44311k(this);

    /* renamed from: j */
    public C44301b f114481j;

    /* renamed from: k */
    public C44739b f114482k;

    /* renamed from: l */
    public VEVideoPublishEditViewModel f114483l;

    /* renamed from: m */
    public EditViewModel f114484m;

    /* renamed from: n */
    public StatusViewModel f114485n;

    /* renamed from: o */
    public C15389d f114486o;

    /* renamed from: p */
    public C44737a f114487p;

    /* renamed from: q */
    public C44737a f114488q;

    /* renamed from: r */
    public long f114489r;

    /* renamed from: s */
    public String f114490s;

    /* renamed from: t */
    public boolean f114491t;

    /* renamed from: v */
    private ViewGroup f114492v;

    /* renamed from: w */
    private View f114493w;

    /* renamed from: x */
    private AVDmtTabLayout f114494x;

    /* renamed from: y */
    private EffectPlatform f114495y;

    /* renamed from: z */
    private final List<Integer> f114496z = C7525m.m23464b((T[]) new Integer[]{Integer.valueOf(R.string.aji), Integer.valueOf(R.string.ajj), Integer.valueOf(R.string.ajk)});

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$a */
    public static final class C44300a {
        private C44300a() {
        }

        public /* synthetic */ C44300a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$b */
    public interface C44301b {
        /* renamed from: a */
        void mo106626a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$c */
    public static final class C44302c extends Handler {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114497a;

        /* renamed from: com.ss.android.ugc.gamora.editor.cu$c$a */
        static final class C44303a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C15389d f114498a;

            /* renamed from: b */
            final /* synthetic */ C44302c f114499b;

            /* renamed from: c */
            final /* synthetic */ ObjectRef f114500c;

            /* renamed from: d */
            final /* synthetic */ ObjectRef f114501d;

            C44303a(C15389d dVar, C44302c cVar, ObjectRef objectRef, ObjectRef objectRef2) {
                this.f114498a = dVar;
                this.f114499b = cVar;
                this.f114500c = objectRef;
                this.f114501d = objectRef2;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                m140186a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m140186a() {
                Integer num;
                C44299cu.m140171c(this.f114499b.f114497a).f113818c.setValue(Boolean.valueOf(false));
                String str = this.f114499b.f114497a.f114490s;
                if (str != null) {
                    num = Integer.valueOf(this.f114498a.mo38789a(str, (String[]) this.f114500c.element, (String[]) this.f114501d.element));
                } else {
                    num = null;
                }
                C44299cu.m140171c(this.f114499b.f114497a).f113818c.setValue(Boolean.valueOf(true));
                if (num != null && num.intValue() == 0) {
                    C0052o m = C44299cu.m140172d(this.f114499b.f114497a).mo119521m();
                    C7573i.m23582a((Object) m, "mVEVideoPublishEditViewM…el.volumeChangeOpLiveData");
                    VEVolumeChangeOp vEVolumeChangeOp = (VEVolumeChangeOp) m.getValue();
                    C0052o e = C44299cu.m140172d(this.f114499b.f114497a).mo119513e();
                    C7573i.m23582a((Object) e, "mVEVideoPublishEditViewModel.previewMusicParams");
                    VEPreviewMusicParams vEPreviewMusicParams = (VEPreviewMusicParams) e.getValue();
                    if (vEPreviewMusicParams != null) {
                        vEPreviewMusicParams.f121607b = C44299cu.m140169b(this.f114499b.f114497a).mo29069f().mMusicStart;
                        C0052o e2 = C44299cu.m140172d(this.f114499b.f114497a).mo119513e();
                        C7573i.m23582a((Object) e2, "mVEVideoPublishEditViewModel.previewMusicParams");
                        e2.setValue(vEPreviewMusicParams);
                    }
                    if (vEVolumeChangeOp == null) {
                        vEVolumeChangeOp = VEVolumeChangeOp.ofMusic(0.5f);
                    }
                    C0052o m2 = C44299cu.m140172d(this.f114499b.f114497a).mo119521m();
                    C7573i.m23582a((Object) m2, "mVEVideoPublishEditViewM…el.volumeChangeOpLiveData");
                    m2.setValue(vEVolumeChangeOp);
                    this.f114498a.mo38763a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                    this.f114498a.mo38879v();
                }
            }
        }

        /* JADX WARNING: type inference failed for: r4v5, types: [T, java.lang.String[]] */
        /* JADX WARNING: type inference failed for: r4v6, types: [T, java.lang.String[]] */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
            if (r7 != null) goto L_0x0034;
         */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v5, types: [T, java.lang.String[]]
          assigns: [java.lang.String[]]
          uses: [?[OBJECT, ARRAY][], T]
          mth insns count: 53
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r7) {
            /*
                r6 = this;
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                r1 = 0
                java.lang.String[] r2 = new java.lang.String[r1]
                r0.element = r2
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                java.lang.String[] r3 = new java.lang.String[r1]
                r2.element = r3
                r3 = 1
                if (r7 == 0) goto L_0x005e
                int r4 = r7.arg1
                if (r4 != r3) goto L_0x005e
                java.lang.Object r4 = r7.obj
                if (r4 == 0) goto L_0x0056
                java.lang.String r4 = (java.lang.String) r4
                int r7 = r7.arg2
                if (r7 != r3) goto L_0x0033
                com.ss.android.ugc.gamora.editor.cu r7 = r6.f114497a
                int r7 = r7.mo106780d()
                com.ss.android.ugc.gamora.recorder.status.d r5 = com.p280ss.android.ugc.gamora.recorder.status.C44753d.f115164a
                java.lang.String r7 = r5.mo107170a(r4, r7)
                if (r7 == 0) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r7 = r4
            L_0x0034:
                java.lang.String[] r4 = new java.lang.String[r3]
                r4[r1] = r7
                r0.element = r4
                java.lang.String[] r4 = new java.lang.String[r3]
                java.lang.String r5 = "bgimg"
                r4[r1] = r5
                r2.element = r4
                com.ss.android.ugc.gamora.editor.cu r1 = r6.f114497a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44299cu.m140169b(r1)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r1.mo29069f()
                com.ss.android.ugc.aweme.status.StatusCreateVideoData r1 = r1.statusCreateVideoData
                r1.setBgPath(r7)
                com.ss.android.ugc.gamora.editor.cu r7 = r6.f114497a
                r7.f114491t = r3
                goto L_0x0073
            L_0x0056:
                kotlin.TypeCastException r7 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
                r7.<init>(r0)
                throw r7
            L_0x005e:
                com.ss.android.ugc.gamora.editor.cu r7 = r6.f114497a
                com.ss.android.ugc.gamora.editor.EditViewModel r7 = com.p280ss.android.ugc.gamora.editor.C44299cu.m140169b(r7)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7 = r7.mo29069f()
                com.ss.android.ugc.aweme.status.StatusCreateVideoData r7 = r7.statusCreateVideoData
                java.lang.String r4 = ""
                r7.setBgPath(r4)
                com.ss.android.ugc.gamora.editor.cu r7 = r6.f114497a
                r7.f114491t = r1
            L_0x0073:
                com.ss.android.ugc.gamora.editor.cu r7 = r6.f114497a
                com.ss.android.ugc.asve.b.d r7 = r7.f114486o
                if (r7 == 0) goto L_0x0087
                r4 = 0
                com.ss.android.ugc.gamora.editor.cu$c$a r1 = new com.ss.android.ugc.gamora.editor.cu$c$a
                r1.<init>(r7, r6, r0, r2)
                kotlin.jvm.a.a r1 = (kotlin.jvm.p357a.C7561a) r1
                r7 = 0
                com.p280ss.android.ugc.aweme.utils.C43107es.m136728a(0, r1)
                return
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44299cu.C44302c.handleMessage(android.os.Message):void");
        }

        C44302c(C44299cu cuVar, Looper looper) {
            this.f114497a = cuVar;
            super(looper);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$d */
    public static final class C44304d implements C43760j {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114502a;

        /* renamed from: b */
        final /* synthetic */ C44737a f114503b;

        /* renamed from: b */
        public final void mo9282b(Effect effect) {
        }

        /* renamed from: a */
        public final void mo9280a(Effect effect) {
            String str;
            if (effect != null) {
                str = effect.getUnzipPath();
            } else {
                str = null;
            }
            if (str != null) {
                String a = C44751c.m141247a(str);
                if (a != null) {
                    this.f114503b.f115132a = a;
                    this.f114502a.mo106776a(this.f114503b);
                }
            }
            C44299cu.m140168a(true, this.f114503b.f115133b, (Exception) null);
        }

        C44304d(C44299cu cuVar, C44737a aVar) {
            this.f114502a = cuVar;
            this.f114503b = aVar;
        }

        /* renamed from: a */
        public final void mo9281a(Effect effect, C43726c cVar) {
            C7573i.m23587b(cVar, "e");
            C44299cu.m140168a(false, this.f114503b.f115133b, cVar.f113222c);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$e */
    static final class C44305e extends Lambda implements C7561a<HandlerThread> {

        /* renamed from: a */
        public static final C44305e f114504a = new C44305e();

        C44305e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m140190a();
        }

        /* renamed from: a */
        private static HandlerThread m140190a() {
            HandlerThread handlerThread = new HandlerThread("status_change_background");
            handlerThread.start();
            return handlerThread;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$f */
    public static final class C44306f implements C41006c {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114505a;

        /* renamed from: b */
        public final void mo74744b(C41011f fVar) {
        }

        /* renamed from: c */
        public final void mo74745c(C41011f fVar) {
        }

        C44306f(C44299cu cuVar) {
            this.f114505a = cuVar;
        }

        /* renamed from: a */
        public final void mo74743a(C41011f fVar) {
            Integer num;
            if (fVar != null) {
                C44299cu.m140167a(this.f114505a).mo107157a(fVar.f106702e);
            }
            String str = "enter_background_tab";
            C38511bc a = C38511bc.m123103a().mo96485a("enter_from", "video_edit_page").mo96485a("shoot_way", C44299cu.m140169b(this.f114505a).mo29069f().mShootWay).mo96485a("creation_id", C44299cu.m140169b(this.f114505a).mo29069f().creationId).mo96485a("content_type", "status");
            String str2 = "tab_name";
            if (fVar != null) {
                num = Integer.valueOf(fVar.f106702e);
            } else {
                num = null;
            }
            if (num == null) {
                C7573i.m23580a();
            }
            C6907h.m21524a(str, (Map) a.mo96485a(str2, C44299cu.m140173d(num.intValue())).f100112a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$g */
    static final class C44307g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114506a;

        C44307g(C44299cu cuVar) {
            this.f114506a = cuVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f114506a.mo106777a(false);
            if (!C7573i.m23585a((Object) this.f114506a.f114488q, (Object) this.f114506a.f114487p)) {
                if (this.f114506a.f114487p == null) {
                    this.f114506a.mo106778b();
                    C44299cu.m140167a(this.f114506a).mo107161d();
                    return;
                }
                C44737a aVar = this.f114506a.f114487p;
                if (aVar != null) {
                    this.f114506a.mo106776a(aVar);
                    C44299cu.m140167a(this.f114506a).mo107156a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$h */
    static final class C44308h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114507a;

        C44308h(C44299cu cuVar) {
            this.f114507a = cuVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f114507a.mo106777a(false);
            C44299cu.m140167a(this.f114507a).mo107159b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$i */
    static final class C44309i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114508a;

        C44309i(C44299cu cuVar) {
            this.f114508a = cuVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f114508a.mo106774a();
            C6907h.m21524a("click_upload_background", (Map) C38511bc.m123103a().mo96485a("enter_from", "video_edit_page").mo96485a("shoot_way", C44299cu.m140169b(this.f114508a).mo29069f().mShootWay).mo96485a("creation_id", C44299cu.m140169b(this.f114508a).mo29069f().creationId).mo96485a("content_type", "status").f100112a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$j */
    public static final class C44310j implements C44735b {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114509a;

        C44310j(C44299cu cuVar) {
            this.f114509a = cuVar;
        }

        /* renamed from: a */
        public final void mo106785a(C44737a aVar, int i) {
            C7573i.m23587b(aVar, "model");
            this.f114509a.mo106776a(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$k */
    static final class C44311k implements C23254a {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114510a;

        C44311k(C44299cu cuVar) {
            this.f114510a = cuVar;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f114510a.mo106777a(false);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$l */
    static final class C44312l implements C45329l {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114511a;

        C44312l(C44299cu cuVar) {
            this.f114511a = cuVar;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4116) {
                this.f114511a.mo106779c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$m */
    static final class C44313m<T> implements C6892b<Void> {

        /* renamed from: a */
        public static final C44313m f114512a = new C44313m();

        C44313m() {
        }

        public final /* bridge */ /* synthetic */ void run(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$n */
    static final class C44314n<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114513a;

        /* renamed from: b */
        final /* synthetic */ C44737a f114514b;

        C44314n(C44299cu cuVar, C44737a aVar) {
            this.f114513a = cuVar;
            this.f114514b = aVar;
        }

        public final /* synthetic */ Object call() {
            m140196a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140196a() {
            int[] imageWidthHeight = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().getImageWidthHeight(this.f114514b.f115132a);
            long length = new File(this.f114514b.f115132a).length();
            StatusCreateVideoData statusCreateVideoData = C44299cu.m140169b(this.f114513a).mo29069f().statusCreateVideoData;
            statusCreateVideoData.setBgSize((int) length);
            statusCreateVideoData.setBgWidth(imageWidthHeight[0]);
            statusCreateVideoData.setBgHeight(imageWidthHeight[1]);
            String str = this.f114514b.f115132a;
            if (str != null) {
                statusCreateVideoData.setBgSrcImage(str);
            }
            C6907h.m21524a("upload_background_start", (Map) C38511bc.m123103a().mo96485a("enter_from", "video_edit_page").mo96485a("shoot_way", C44299cu.m140169b(this.f114513a).mo29069f().mShootWay).mo96485a("creation_id", C44299cu.m140169b(this.f114513a).mo29069f().creationId).mo96485a("content_type", "status").mo96484a("size", new File(this.f114514b.f115132a).length()).mo96483a("width", imageWidthHeight[0]).mo96483a("height", imageWidthHeight[1]).f100112a);
            this.f114513a.f114489r = System.currentTimeMillis();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cu$o */
    static final class C44315o extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44299cu f114515a;

        C44315o(C44299cu cuVar) {
            this.f114515a = cuVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m140197a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140197a() {
            C12637b.m36715a(this.f114515a, new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44315o f114516a;

                {
                    this.f114516a = r1;
                }

                public final void run() {
                    C44299cu.m140171c(this.f114516a.f114515a).f113817b.setValue(Boolean.valueOf(false));
                }
            }, 200);
            C44299cu.m140167a(this.f114515a).mo107160c();
        }
    }

    /* renamed from: d */
    public static String m140173d(int i) {
        switch (i) {
            case 0:
                return "album";
            case 1:
                return "template";
            case 2:
                return "wallpaper";
            default:
                return "unknown";
        }
    }

    /* renamed from: e */
    private final HandlerThread m140174e() {
        return (HandlerThread) this.f114478B.getValue();
    }

    /* renamed from: H */
    private final void m140165H() {
        View b = mo31002b((int) R.id.a1q);
        if (b == null) {
            C7573i.m23580a();
        }
        this.f114493w = b;
        View b2 = mo31002b((int) R.id.dfo);
        if (b2 == null) {
            C7573i.m23580a();
        }
        this.f114494x = (AVDmtTabLayout) b2;
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        if (VERSION.SDK_INT >= 18) {
            m140174e().quitSafely();
        } else {
            m140174e().quit();
        }
    }

    /* renamed from: I */
    private final int m140166I() {
        return ((C39805en.m127452e(this.f33526d_) - ((int) C9738o.m28708b((Context) this.f33526d_, 200.0f))) - C39805en.m127450c(this.f33526d_)) - C39805en.m127451d(this.f33526d_);
    }

    /* renamed from: b */
    public final void mo106778b() {
        Message message = new Message();
        message.what = 1;
        message.arg1 = 0;
        this.f114479C.removeMessages(1);
        this.f114479C.sendMessage(message);
    }

    /* renamed from: d */
    public final int mo106780d() {
        if (this.f114477A <= 0) {
            EditViewModel editViewModel = this.f114484m;
            if (editViewModel == null) {
                C7573i.m23583a("mEditViewModel");
            }
            this.f114477A = editViewModel.mo106446g().mo98357e();
        }
        return this.f114477A;
    }

    /* renamed from: G */
    private final void m140164G() {
        AVDmtTabLayout aVDmtTabLayout = this.f114494x;
        if (aVDmtTabLayout == null) {
            C7573i.m23583a("mTabLayout");
        }
        aVDmtTabLayout.setMaxTabModeForCount(this.f114496z.size());
        for (Number intValue : this.f114496z) {
            int intValue2 = intValue.intValue();
            AVDmtTabItemView a = C42107a.m134029a(this.f33526d_, true);
            a.setText(intValue2);
            AVDmtTabLayout aVDmtTabLayout2 = this.f114494x;
            if (aVDmtTabLayout2 == null) {
                C7573i.m23583a("mTabLayout");
            }
            AVDmtTabLayout aVDmtTabLayout3 = this.f114494x;
            if (aVDmtTabLayout3 == null) {
                C7573i.m23583a("mTabLayout");
            }
            aVDmtTabLayout2.mo101336a(aVDmtTabLayout3.mo101329a().mo101401a((View) a));
        }
        AVDmtTabLayout aVDmtTabLayout4 = this.f114494x;
        if (aVDmtTabLayout4 == null) {
            C7573i.m23583a("mTabLayout");
        }
        aVDmtTabLayout4.mo101335a(new C44306f(this));
        View b = mo31002b((int) R.id.b6v);
        if (b != null) {
            b.setOnClickListener(new C44307g(this));
        }
        View b2 = mo31002b((int) R.id.bcu);
        if (b2 != null) {
            b2.setOnClickListener(new C44308h(this));
        }
        View b3 = mo31002b((int) R.id.bi_);
        if (b3 == null) {
            C7573i.m23580a();
        }
        this.f114482k = new C44739b((FrameLayout) b3);
        C44739b bVar = this.f114482k;
        if (bVar == null) {
            C7573i.m23583a("panelManager");
        }
        bVar.f115138e = new C44309i(this);
        C44739b bVar2 = this.f114482k;
        if (bVar2 == null) {
            C7573i.m23583a("panelManager");
        }
        bVar2.f115145l = new C44310j(this);
        C44739b bVar3 = this.f114482k;
        if (bVar3 == null) {
            C7573i.m23583a("panelManager");
        }
        bVar3.mo107157a(0);
    }

    /* renamed from: a */
    public final void mo106774a() {
        Bundle bundle = new Bundle();
        bundle.putInt("key_choose_scene", 3);
        bundle.putInt("key_photo_select_min_count", 1);
        bundle.putInt("key_photo_select_max_count", 1);
        bundle.putInt("upload_photo_min_height", 480);
        bundle.putInt("upload_photo_min_width", 360);
        bundle.putInt("key_support_flag", 1);
        C40492bd a = C40491bc.m129422a();
        Activity activity = this.f33526d_;
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        a.mo59052a(activity, bundle, C40426a.m129281b(), C40426a.m129281b());
    }

    /* renamed from: c */
    public final void mo106779c() {
        boolean z = true;
        if (!this.f114479C.hasMessages(1)) {
            Effect effect = null;
            C43107es.m136728a(0, new C44315o(this));
            C44737a aVar = this.f114488q;
            if (aVar != null) {
                effect = aVar.f115133b;
            }
            if (effect != null) {
                z = false;
            }
            if (z) {
                EditViewModel editViewModel = this.f114484m;
                if (editViewModel == null) {
                    C7573i.m23583a("mEditViewModel");
                }
                StatusCreateVideoData statusCreateVideoData = editViewModel.mo29069f().statusCreateVideoData;
                String str = "upload_background_end";
                C38511bc a = C38511bc.m123103a().mo96485a("enter_from", "video_edit_page");
                String str2 = "shoot_way";
                EditViewModel editViewModel2 = this.f114484m;
                if (editViewModel2 == null) {
                    C7573i.m23583a("mEditViewModel");
                }
                C38511bc a2 = a.mo96485a(str2, editViewModel2.mo29069f().mShootWay);
                String str3 = "creation_id";
                EditViewModel editViewModel3 = this.f114484m;
                if (editViewModel3 == null) {
                    C7573i.m23583a("mEditViewModel");
                }
                C6907h.m21524a(str, (Map) a2.mo96485a(str3, editViewModel3.mo29069f().creationId).mo96485a("content_type", "status").mo96484a("upload_duration", System.currentTimeMillis() - this.f114489r).mo96483a("size", statusCreateVideoData.getBgSize()).mo96483a("width", statusCreateVideoData.getBgWidth()).mo96483a("height", statusCreateVideoData.getBgHeight()).f100112a);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C44739b m140167a(C44299cu cuVar) {
        C44739b bVar = cuVar.f114482k;
        if (bVar == null) {
            C7573i.m23583a("panelManager");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditViewModel m140169b(C44299cu cuVar) {
        EditViewModel editViewModel = cuVar.f114484m;
        if (editViewModel == null) {
            C7573i.m23583a("mEditViewModel");
        }
        return editViewModel;
    }

    /* renamed from: c */
    public static final /* synthetic */ StatusViewModel m140171c(C44299cu cuVar) {
        StatusViewModel statusViewModel = cuVar.f114485n;
        if (statusViewModel == null) {
            C7573i.m23583a("mStatusViewModel");
        }
        return statusViewModel;
    }

    /* renamed from: d */
    public static final /* synthetic */ VEVideoPublishEditViewModel m140172d(C44299cu cuVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = cuVar.f114483l;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("mVEVideoPublishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: b */
    private final void m140170b(C44737a aVar) {
        EffectPlatform effectPlatform = this.f114495y;
        if (effectPlatform == null) {
            C7573i.m23583a("mEffectPlatform");
        }
        effectPlatform.mo70620a(aVar.f115133b, (C43760j) new C44304d(this, aVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30985e(android.os.Bundle r4) {
        /*
            r3 = this;
            super.mo30985e(r4)
            r3.m140165H()
            r3.m140164G()
            android.app.Activity r4 = r3.f33526d_
            if (r4 == 0) goto L_0x0105
            android.support.v4.app.FragmentActivity r4 = (android.support.p022v4.app.FragmentActivity) r4
            android.arch.lifecycle.w r4 = android.arch.lifecycle.C0069x.m159a(r4)
            java.lang.Class<dmt.av.video.VEVideoPublishEditViewModel> r0 = dmt.p1861av.video.VEVideoPublishEditViewModel.class
            android.arch.lifecycle.u r4 = r4.mo147a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…ditViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            dmt.av.video.VEVideoPublishEditViewModel r4 = (dmt.p1861av.video.VEVideoPublishEditViewModel) r4
            r3.f114483l = r4
            android.app.Activity r4 = r3.f33526d_
            if (r4 == 0) goto L_0x00fd
            android.support.v4.app.FragmentActivity r4 = (android.support.p022v4.app.FragmentActivity) r4
            com.ss.android.ugc.gamora.a.a r4 = com.p280ss.android.ugc.gamora.p1486a.C36113b.m116288a(r4)
            java.lang.Class<com.ss.android.ugc.gamora.editor.EditViewModel> r0 = com.p280ss.android.ugc.gamora.editor.EditViewModel.class
            com.bytedance.jedi.arch.JediViewModel r4 = r4.mo91871a(r0)
            java.lang.String r0 = "JediViewModelProviders.o…ditViewModel::class.java]"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            com.ss.android.ugc.gamora.editor.EditViewModel r4 = (com.p280ss.android.ugc.gamora.editor.EditViewModel) r4
            r3.f114484m = r4
            android.app.Activity r4 = r3.f33526d_
            if (r4 == 0) goto L_0x00f5
            android.support.v4.app.FragmentActivity r4 = (android.support.p022v4.app.FragmentActivity) r4
            android.arch.lifecycle.w r4 = android.arch.lifecycle.C0069x.m159a(r4)
            java.lang.Class<com.ss.android.ugc.gamora.editor.StatusViewModel> r0 = com.p280ss.android.ugc.gamora.editor.StatusViewModel.class
            android.arch.lifecycle.u r4 = r4.mo147a(r0)
            java.lang.String r0 = "ViewModelProviders.of(ac…tusViewModel::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            com.ss.android.ugc.gamora.editor.StatusViewModel r4 = (com.p280ss.android.ugc.gamora.editor.StatusViewModel) r4
            r3.f114485n = r4
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r4 = new com.ss.android.ugc.aweme.effectplatform.EffectPlatform
            android.app.Activity r0 = r3.f33526d_
            android.content.Context r0 = (android.content.Context) r0
            com.ss.android.ugc.aweme.port.in.z r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93245h
            java.lang.String r2 = "AVEnv.LOCATION_SERVICE"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.lang.String r1 = r1.mo83209c()
            com.ss.android.ugc.aweme.port.in.ae r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93220B
            okhttp3.OkHttpClient r2 = r2.getOKHttpClient()
            r4.<init>(r0, r1, r2)
            r3.f114495y = r4
            com.ss.android.ugc.gamora.editor.EditViewModel r4 = r3.f114484m
            if (r4 != 0) goto L_0x0079
            java.lang.String r0 = "mEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x0079:
            android.arch.lifecycle.o r4 = r4.mo106448i()
            java.lang.Object r4 = r4.getValue()
            com.ss.android.ugc.asve.b.d r4 = (com.p280ss.android.ugc.asve.p754b.C15389d) r4
            r3.f114486o = r4
            dmt.av.video.VEVideoPublishEditViewModel r4 = r3.f114483l
            if (r4 != 0) goto L_0x008e
            java.lang.String r0 = "mVEVideoPublishEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x008e:
            android.arch.lifecycle.o r4 = r4.mo119508a()
            java.lang.String r0 = "mVEVideoPublishEditViewModel.previewParams"
            kotlin.jvm.internal.C7573i.m23582a(r4, r0)
            java.lang.Object r4 = r4.getValue()
            dmt.av.video.VEPreviewParams r4 = (dmt.p1861av.video.VEPreviewParams) r4
            r0 = 0
            if (r4 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r4 = r4.statusCreateVideoData
            if (r4 == 0) goto L_0x00a9
            java.lang.String r4 = r4.getEffectPath()
            goto L_0x00aa
        L_0x00a9:
            r4 = r0
        L_0x00aa:
            r3.f114490s = r4
            com.ss.android.ugc.asve.b.d r4 = r3.f114486o
            if (r4 == 0) goto L_0x00ba
            com.ss.android.ugc.gamora.editor.cu$l r1 = new com.ss.android.ugc.gamora.editor.cu$l
            r1.<init>(r3)
            com.ss.android.vesdk.l r1 = (com.p280ss.android.vesdk.C45329l) r1
            r4.mo38824b(r1)
        L_0x00ba:
            dmt.av.video.VEVideoPublishEditViewModel r4 = r3.f114483l
            if (r4 != 0) goto L_0x00c3
            java.lang.String r1 = "mVEVideoPublishEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00c3:
            android.arch.lifecycle.o r4 = r4.mo119508a()
            java.lang.String r1 = "mVEVideoPublishEditViewModel.previewParams"
            kotlin.jvm.internal.C7573i.m23582a(r4, r1)
            java.lang.Object r4 = r4.getValue()
            dmt.av.video.VEPreviewParams r4 = (dmt.p1861av.video.VEPreviewParams) r4
            if (r4 == 0) goto L_0x00dd
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r4 = r4.statusCreateVideoData
            if (r4 == 0) goto L_0x00dd
            java.lang.String r4 = r4.getBgPath()
            goto L_0x00de
        L_0x00dd:
            r4 = r0
        L_0x00de:
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00f4
            if (r4 == 0) goto L_0x00ee
            com.ss.android.ugc.gamora.recorder.status.a r0 = new com.ss.android.ugc.gamora.recorder.status.a
            r0.<init>(r4)
        L_0x00ee:
            r3.f114487p = r0
            com.ss.android.ugc.gamora.recorder.status.a r4 = r3.f114487p
            r3.f114488q = r4
        L_0x00f4:
            return
        L_0x00f5:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r4.<init>(r0)
            throw r4
        L_0x00fd:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r4.<init>(r0)
            throw r4
        L_0x0105:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44299cu.mo30985e(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r2 == null) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106776a(com.p280ss.android.ugc.gamora.recorder.status.C44737a r6) {
        /*
            r5 = this;
            r5.f114488q = r6
            java.lang.String r0 = r6.f115132a
            if (r0 != 0) goto L_0x000a
            r5.m140170b(r6)
            return
        L_0x000a:
            com.ss.android.ugc.gamora.editor.StatusViewModel r0 = r5.f114485n
            if (r0 != 0) goto L_0x0013
            java.lang.String r1 = "mStatusViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0013:
            android.arch.lifecycle.o<java.lang.Boolean> r0 = r0.f113817b
            r1 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r2)
            java.lang.String r0 = r6.f115132a
            if (r0 == 0) goto L_0x0038
            android.os.Message r2 = new android.os.Message
            r2.<init>()
            r2.what = r1
            r2.arg1 = r1
            r2.arg2 = r1
            r2.obj = r0
            com.ss.android.ugc.gamora.editor.cu$c r0 = r5.f114479C
            r0.removeMessages(r1)
            com.ss.android.ugc.gamora.editor.cu$c r0 = r5.f114479C
            r0.sendMessage(r2)
        L_0x0038:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r6.f115133b
            if (r0 == 0) goto L_0x00dd
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f114484m
            if (r0 != 0) goto L_0x0045
            java.lang.String r2 = "mEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0045:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo29069f()
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r0 = r0.statusCreateVideoData
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r6.f115133b
            if (r2 == 0) goto L_0x0055
            java.lang.String r2 = r2.getEffectId()
            if (r2 != 0) goto L_0x0057
        L_0x0055:
            java.lang.String r2 = ""
        L_0x0057:
            r0.setBgId(r2)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r2 = r5.f114494x
            if (r2 != 0) goto L_0x0063
            java.lang.String r3 = "mTabLayout"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0063:
            int r2 = r2.getSelectedTabPosition()
            if (r2 != r1) goto L_0x006c
            java.lang.String r1 = "template_pic"
            goto L_0x006e
        L_0x006c:
            java.lang.String r1 = "wallpaper"
        L_0x006e:
            r0.setBgFrom(r1)
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r6.f115133b
            if (r6 == 0) goto L_0x00dc
            java.lang.String r0 = "select_background"
            com.ss.android.ugc.aweme.shortvideo.bc r1 = com.p280ss.android.ugc.aweme.shortvideo.C38511bc.m123103a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "video_edit_page"
            com.ss.android.ugc.aweme.shortvideo.bc r1 = r1.mo96485a(r2, r3)
            java.lang.String r2 = "shoot_way"
            com.ss.android.ugc.gamora.editor.EditViewModel r3 = r5.f114484m
            if (r3 != 0) goto L_0x008e
            java.lang.String r4 = "mEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x008e:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo29069f()
            java.lang.String r3 = r3.mShootWay
            com.ss.android.ugc.aweme.shortvideo.bc r1 = r1.mo96485a(r2, r3)
            java.lang.String r2 = "creation_id"
            com.ss.android.ugc.gamora.editor.EditViewModel r3 = r5.f114484m
            if (r3 != 0) goto L_0x00a3
            java.lang.String r4 = "mEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00a3:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r3 = r3.mo29069f()
            java.lang.String r3 = r3.creationId
            com.ss.android.ugc.aweme.shortvideo.bc r1 = r1.mo96485a(r2, r3)
            java.lang.String r2 = "content_type"
            java.lang.String r3 = "status"
            com.ss.android.ugc.aweme.shortvideo.bc r1 = r1.mo96485a(r2, r3)
            java.lang.String r2 = "tab_name"
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r3 = r5.f114494x
            if (r3 != 0) goto L_0x00c0
            java.lang.String r4 = "mTabLayout"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x00c0:
            int r3 = r3.getSelectedTabPosition()
            java.lang.String r3 = m140173d(r3)
            com.ss.android.ugc.aweme.shortvideo.bc r1 = r1.mo96485a(r2, r3)
            java.lang.String r2 = "background_id"
            java.lang.String r6 = r6.getEffectId()
            com.ss.android.ugc.aweme.shortvideo.bc r6 = r1.mo96485a(r2, r6)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f100112a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r6)
            goto L_0x0100
        L_0x00dc:
            return
        L_0x00dd:
            com.ss.android.ugc.gamora.editor.EditViewModel r0 = r5.f114484m
            if (r0 != 0) goto L_0x00e6
            java.lang.String r1 = "mEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x00e6:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo29069f()
            com.ss.android.ugc.aweme.status.StatusCreateVideoData r0 = r0.statusCreateVideoData
            java.lang.String r1 = ""
            r0.setBgId(r1)
            java.lang.String r1 = "upload"
            r0.setBgFrom(r1)
            com.ss.android.ugc.gamora.editor.cu$n r0 = new com.ss.android.ugc.gamora.editor.cu$n
            r0.<init>(r5, r6)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            bolts.C1592h.m7853a(r0)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44299cu.mo106776a(com.ss.android.ugc.gamora.recorder.status.a):void");
    }

    /* renamed from: a */
    public final void mo106777a(boolean z) {
        boolean z2 = z;
        View view = this.f114493w;
        if (view == null) {
            C7573i.m23583a("mView");
        }
        C27439r.m89907a(view, z, (int) C9738o.m28708b((Context) this.f33526d_, 198.0f), this.f114492v, C34943c.f91127w, C44313m.f114512a);
        if (z2) {
            AVDmtTabLayout aVDmtTabLayout = this.f114494x;
            if (aVDmtTabLayout == null) {
                C7573i.m23583a("mTabLayout");
            }
            AVDmtTabLayout aVDmtTabLayout2 = this.f114494x;
            if (aVDmtTabLayout2 == null) {
                C7573i.m23583a("mTabLayout");
            }
            aVDmtTabLayout.mo101345b(aVDmtTabLayout2.mo101330a(0));
            this.f114487p = this.f114488q;
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f114483l;
            if (vEVideoPublishEditViewModel == null) {
                C7573i.m23583a("mVEVideoPublishEditViewModel");
            }
            C0052o g = vEVideoPublishEditViewModel.mo119515g();
            C7573i.m23582a((Object) g, "mVEVideoPublishEditViewM…deoPreviewScaleOpChangeV2");
            g.setValue(C47519a.m148313a(C47518x.f121983l, C42111b.f109618a.mo103542a(true, false, false, false, false), ((int) C9738o.m28708b((Context) this.f33526d_, 0.0f)) + C39805en.m127450c(this.f33526d_), (int) C9738o.m28708b((Context) this.f33526d_, 198.0f), m140166I(), C39804em.m127438b(this.f33526d_, C39804em.f103457a), 0, false, true, false, false, 768, null));
            String str = "click_background_entrance";
            C38511bc a = C38511bc.m123103a().mo96485a("enter_from", "video_edit_page");
            String str2 = "shoot_way";
            EditViewModel editViewModel = this.f114484m;
            if (editViewModel == null) {
                C7573i.m23583a("mEditViewModel");
            }
            C38511bc a2 = a.mo96485a(str2, editViewModel.mo29069f().mShootWay);
            String str3 = "creation_id";
            EditViewModel editViewModel2 = this.f114484m;
            if (editViewModel2 == null) {
                C7573i.m23583a("mEditViewModel");
            }
            C6907h.m21524a(str, (Map) a2.mo96485a(str3, editViewModel2.mo29069f().creationId).mo96485a("content_source", "upload").mo96485a("content_type", "status").f100112a);
        } else {
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f114483l;
            if (vEVideoPublishEditViewModel2 == null) {
                C7573i.m23583a("mVEVideoPublishEditViewModel");
            }
            C0052o g2 = vEVideoPublishEditViewModel2.mo119515g();
            C7573i.m23582a((Object) g2, "mVEVideoPublishEditViewM…deoPreviewScaleOpChangeV2");
            g2.setValue(C47519a.m148310a(mo31017x().getColor(R.color.l3), ((int) C9738o.m28708b((Context) this.f33526d_, 0.0f)) + C39805en.m127450c(this.f33526d_), (int) C9738o.m28708b((Context) this.f33526d_, 198.0f), m140166I(), C39804em.m127438b(this.f33526d_, C39804em.f103457a), 0));
        }
        C44301b bVar = this.f114481j;
        if (bVar != null) {
            bVar.mo106626a(z2);
        }
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.ait, viewGroup, false);
        if (inflate != null) {
            this.f114492v = (ViewGroup) inflate;
            ViewGroup viewGroup2 = this.f114492v;
            if (viewGroup2 == null) {
                C7573i.m23580a();
            }
            return viewGroup2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m140168a(boolean r6, com.p280ss.android.ugc.effectmanager.effect.model.Effect r7, java.lang.Exception r8) {
        /*
            r0 = 0
            r1 = 0
            if (r6 == 0) goto L_0x000a
            java.lang.String r6 = "status_bg_download_error_state"
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r6, r0, r1)
            return
        L_0x000a:
            java.lang.String r6 = "status_bg_download_error_state"
            r2 = 1
            com.ss.android.ugc.aweme.app.g.c r3 = com.p280ss.android.ugc.aweme.app.p305g.C6869c.m21381a()
            java.lang.String r4 = "url"
            if (r7 == 0) goto L_0x0028
            com.ss.android.ugc.effectmanager.common.model.UrlModel r5 = r7.getFileUrl()
            if (r5 == 0) goto L_0x0028
            java.util.List r5 = r5.getUrlList()
            if (r5 == 0) goto L_0x0028
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            com.ss.android.ugc.aweme.app.g.c r0 = r3.mo16887a(r4, r0)
            java.lang.String r3 = "mv_res_id"
            if (r7 == 0) goto L_0x0035
            java.lang.String r1 = r7.getEffectId()
        L_0x0035:
            com.ss.android.ugc.aweme.app.g.c r7 = r0.mo16887a(r3, r1)
            java.lang.String r0 = "exception"
            if (r8 != 0) goto L_0x0040
            java.lang.String r8 = ""
            goto L_0x0046
        L_0x0040:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.String r8 = com.facebook.common.internal.C13315l.m38963c(r8)
        L_0x0046:
            com.ss.android.ugc.aweme.app.g.c r7 = r7.mo16887a(r0, r8)
            org.json.JSONObject r7 = r7.mo16888b()
            com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r6, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44299cu.m140168a(boolean, com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Exception):void");
    }

    /* renamed from: a */
    public final void mo106775a(int i, int i2, Intent intent) {
        if (i == C40426a.m129281b() && intent != null && i2 == -1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C7573i.m23582a((Object) parcelableArrayListExtra, "selectMediaList");
            if (!parcelableArrayListExtra.isEmpty()) {
                MediaModel mediaModel = (MediaModel) parcelableArrayListExtra.get(0);
                C7573i.m23582a((Object) mediaModel, "mediaModel");
                String str = mediaModel.f88156b;
                C7573i.m23582a((Object) str, "imgPath");
                mo106776a(new C44737a(str));
                C44739b bVar = this.f114482k;
                if (bVar == null) {
                    C7573i.m23583a("panelManager");
                }
                bVar.mo107158a(str);
            }
        }
    }
}
