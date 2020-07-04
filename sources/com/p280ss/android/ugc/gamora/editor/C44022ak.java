package com.p280ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.ktx.C12637b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C38579ch;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39313a;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39314b;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicLayout;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView.C39297a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.widget.KTVView;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService;
import com.p280ss.android.ugc.aweme.utils.C43021cp;
import com.p280ss.android.ugc.aweme.utils.C43109eu;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.gamora.editor.p1743b.C44148a;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEListener.C45217m;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import kotlin.C7581n;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.editor.ak */
public final class C44022ak extends C12629j implements OnTouchListener, C44396a {

    /* renamed from: z */
    public static final C44023a f113898z = new C44023a(null);

    /* renamed from: A */
    private TextView f113899A;

    /* renamed from: B */
    private TextView f113900B;

    /* renamed from: C */
    private ImageView f113901C;

    /* renamed from: D */
    private FrameLayout f113902D;

    /* renamed from: E */
    private View f113903E;

    /* renamed from: F */
    private int f113904F;

    /* renamed from: G */
    private float f113905G;

    /* renamed from: H */
    private float f113906H;

    /* renamed from: I */
    private C23258e f113907I;

    /* renamed from: J */
    private C44024b f113908J;

    /* renamed from: K */
    private EditMusicCutViewModel f113909K;

    /* renamed from: L */
    private EditMusicViewModel f113910L;

    /* renamed from: M */
    private final C44034k f113911M = new C44034k(this);

    /* renamed from: N */
    private final C44035l f113912N = new C44035l(this);

    /* renamed from: i */
    public ImageView f113913i;

    /* renamed from: j */
    public KTVView f113914j;

    /* renamed from: k */
    public DmtCutMusicLayout f113915k;

    /* renamed from: l */
    public RelativeLayout f113916l;

    /* renamed from: m */
    public C44021aj f113917m;

    /* renamed from: n */
    public int f113918n;

    /* renamed from: o */
    public int f113919o;

    /* renamed from: p */
    public int f113920p;

    /* renamed from: q */
    public final Handler f113921q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    public C44025c f113922r;

    /* renamed from: s */
    public boolean f113923s;

    /* renamed from: t */
    public EditViewModel f113924t;

    /* renamed from: u */
    public EditStickerViewModel f113925u;

    /* renamed from: v */
    public VEVideoPublishEditViewModel f113926v;

    /* renamed from: w */
    public EditPreviewViewModel f113927w;

    /* renamed from: x */
    public final C45217m f113928x = new C44037n(this);

    /* renamed from: y */
    public boolean f113929y;

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$a */
    public static final class C44023a {
        private C44023a() {
        }

        public /* synthetic */ C44023a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$b */
    public interface C44024b {
        /* renamed from: a */
        void mo106531a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$c */
    public interface C44025c {
        /* renamed from: a */
        void mo106532a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$d */
    static final class C44026d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113930a;

        C44026d(C44022ak akVar) {
            this.f113930a = akVar;
        }

        public final void run() {
            this.f113930a.mo30922I();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$e */
    static final class C44027e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113931a;

        C44027e(C44022ak akVar) {
            this.f113931a = akVar;
        }

        public final void run() {
            C44022ak.m139325b(this.f113931a).addView(C44022ak.m139326c(this.f113931a));
            C44022ak.m139326c(this.f113931a).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C44027e f113932a;

                {
                    this.f113932a = r1;
                }

                public final void run() {
                    if (this.f113932a.f113931a.f113918n == 0) {
                        C44022ak.m139326c(this.f113932a.f113931a).setX(C44022ak.m139328d(this.f113932a.f113931a).getX() - ((float) (C44022ak.m139326c(this.f113932a.f113931a).getWidth() / 2)));
                    } else {
                        double d = (double) this.f113932a.f113931a.f113918n;
                        Double.isNaN(d);
                        double d2 = d * 1.0d;
                        double width = (double) C44022ak.m139328d(this.f113932a.f113931a).getWidth();
                        Double.isNaN(width);
                        double d3 = d2 * width;
                        double d4 = (double) this.f113932a.f113931a.f113919o;
                        Double.isNaN(d4);
                        C44022ak.m139326c(this.f113932a.f113931a).setX((C44022ak.m139328d(this.f113932a.f113931a).getX() + ((float) ((int) (d3 / d4)))) - ((float) (C44022ak.m139326c(this.f113932a.f113931a).getWidth() / 2)));
                    }
                    C44022ak.m139328d(this.f113932a.f113931a).setLength(this.f113932a.f113931a.mo30921H());
                    C44022ak.m139326c(this.f113932a.f113931a).setOnTouchListener(this.f113932a.f113931a);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$f */
    public static final class C44029f implements C39297a {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113933a;

        C44029f(C44022ak akVar) {
            this.f113933a = akVar;
        }

        /* renamed from: a */
        public final void mo97840a(float f) {
            this.f113933a.f113918n = (int) (f * ((float) this.f113933a.f113919o));
            C44025c cVar = this.f113933a.f113922r;
            if (cVar != null) {
                cVar.mo106532a(this.f113933a.f113923s);
            }
        }

        /* renamed from: b */
        public final void mo97841b(float f) {
            C44022ak.m139329e(this.f113933a).setTimeBubble((int) (f * ((float) this.f113933a.f113919o)));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$g */
    public static final class C44030g implements C44024b {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113934a;

        C44030g(C44022ak akVar) {
            this.f113934a = akVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0150  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0191  */
        /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo106531a(boolean r9) {
            /*
                r8 = this;
                com.ss.android.ugc.gamora.editor.ak r0 = r8.f113934a
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo29069f()
                com.ss.android.ugc.gamora.editor.ak r1 = r8.f113934a
                int r1 = r1.f113918n
                r0.mMusicStart = r1
                java.lang.String r1 = r0.mMusicPath
                boolean r2 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136538a(r0)
                int r1 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r1, r2)
                com.ss.android.ugc.aweme.property.AVAB r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
                com.ss.android.ugc.aweme.property.AVAB$Property r3 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
                boolean r2 = r2.mo93305a(r3)
                if (r2 == 0) goto L_0x006e
                com.ss.android.ugc.aweme.shortvideo.dw r2 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r2 = r2.mo97931b()
                if (r2 == 0) goto L_0x006e
                com.ss.android.ugc.aweme.shortvideo.dw r2 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r2 = r2.mo97931b()
                if (r2 != 0) goto L_0x003b
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x003b:
                int r2 = r2.getShootDuration()
                if (r2 <= 0) goto L_0x006e
                com.ss.android.ugc.aweme.shortvideo.dw r2 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r2 = r2.mo97931b()
                if (r2 != 0) goto L_0x004e
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x004e:
                int r2 = r2.getShootDuration()
                int r2 = r1 - r2
                int r2 = java.lang.Math.abs(r2)
                r3 = 1000(0x3e8, float:1.401E-42)
                if (r2 < r3) goto L_0x00ad
                com.ss.android.ugc.aweme.shortvideo.dw r1 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r1 = r1.mo97931b()
                if (r1 != 0) goto L_0x0069
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0069:
                int r1 = r1.getShootDuration()
                goto L_0x00ad
            L_0x006e:
                boolean r1 = com.p280ss.android.ugc.aweme.shortvideo.C38579ch.m123272a()
                if (r1 == 0) goto L_0x0094
                com.ss.android.ugc.gamora.editor.ak r1 = r8.f113934a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r1)
                android.arch.lifecycle.o r1 = r1.mo106448i()
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L_0x0087
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0087:
                com.ss.android.ugc.asve.b.d r1 = (com.p280ss.android.ugc.asve.p754b.C15389d) r1
                int r1 = r1.mo38860l()
                r2 = 15000(0x3a98, float:2.102E-41)
                int r1 = java.lang.Math.min(r2, r1)
                goto L_0x00ad
            L_0x0094:
                com.ss.android.ugc.gamora.editor.ak r1 = r8.f113934a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r1)
                android.arch.lifecycle.o r1 = r1.mo106448i()
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L_0x00a7
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00a7:
                com.ss.android.ugc.asve.b.d r1 = (com.p280ss.android.ugc.asve.p754b.C15389d) r1
                int r1 = r1.mo38860l()
            L_0x00ad:
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r2)
                android.arch.lifecycle.o r2 = r2.mo106448i()
                java.lang.Object r2 = r2.getValue()
                if (r2 != 0) goto L_0x00c0
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00c0:
                com.ss.android.ugc.asve.b.d r2 = (com.p280ss.android.ugc.asve.p754b.C15389d) r2
                int r2 = r2.mo38860l()
                int r1 = java.lang.Math.min(r1, r2)
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                int r2 = r2.f113918n
                int r2 = r2 + r1
                r0.mMusicEnd = r2
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r2)
                boolean r2 = com.p280ss.android.ugc.gamora.editor.EditViewModel.m139162E()
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x00ea
                if (r9 != 0) goto L_0x00ea
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r2)
                r2.mo106443a(r4, r4)
                goto L_0x00f3
            L_0x00ea:
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                com.ss.android.ugc.gamora.editor.EditViewModel r2 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r2)
                r2.mo106443a(r3, r4)
            L_0x00f3:
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                r2.mo106527a(r4)
                if (r9 != 0) goto L_0x0118
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                com.bytedance.scene.j r2 = r2.f33524c
                if (r2 == 0) goto L_0x0110
                com.bytedance.scene.group.b r2 = (com.bytedance.scene.group.C12604b) r2
                java.lang.String r5 = "MusicScene"
                com.bytedance.scene.j r2 = r2.mo30924a(r5)
                com.ss.android.ugc.gamora.editor.al r2 = (com.p280ss.android.ugc.gamora.editor.C44038al) r2
                if (r2 == 0) goto L_0x0118
                r2.mo96987K()
                goto L_0x0118
            L_0x0110:
                kotlin.TypeCastException r9 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.scene.group.GroupScene"
                r9.<init>(r0)
                throw r9
            L_0x0118:
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                com.ss.android.ugc.gamora.editor.EditStickerViewModel r2 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139330f(r2)
                android.arch.lifecycle.o r2 = r2.mo106364h()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
                r2.setValue(r5)
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                com.ss.android.ugc.gamora.editor.EditPreviewViewModel r2 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139331g(r2)
                r2.mo106321a(r4)
                com.ss.android.ugc.gamora.editor.ak r2 = r8.f113934a
                dmt.av.video.VEVideoPublishEditViewModel r2 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139332h(r2)
                android.arch.lifecycle.o r2 = r2.mo119522n()
                java.lang.String r4 = "publishEditViewModel.musicStartChangeOpLiveData"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                int r4 = r0.mMusicStart
                dmt.av.video.u r1 = dmt.p1861av.video.C47515u.m148294a(r4, r1)
                r2.setValue(r1)
                java.lang.String r1 = r0.getWavFile()
                if (r1 == 0) goto L_0x0168
                com.ss.android.ugc.gamora.editor.ak r1 = r8.f113934a
                dmt.av.video.VEVideoPublishEditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139332h(r1)
                android.arch.lifecycle.o r1 = r1.mo119521m()
                java.lang.String r2 = "publishEditViewModel.volumeChangeOpLiveData"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                float r2 = r0.voiceVolume
                com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp r2 = com.p280ss.android.ugc.aweme.services.video.VEVolumeChangeOp.ofVoice(r2)
                r1.setValue(r2)
            L_0x0168:
                com.ss.android.ugc.gamora.editor.ak r1 = r8.f113934a
                r1.mo96987K()
                boolean r1 = r0.isMvThemeVideoType()
                if (r1 == 0) goto L_0x018f
                com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData r1 = r0.mvCreateVideoData
                int r1 = r1.mvType
                if (r1 != r3) goto L_0x018f
                com.ss.android.ugc.gamora.editor.ak r1 = r8.f113934a
                com.ss.android.ugc.gamora.editor.aj r2 = r1.mo30920G()
                java.lang.String r3 = r0.mMusicPath
                java.lang.String r1 = "mModel.mMusicPath"
                kotlin.jvm.internal.C7573i.m23582a(r3, r1)
                int r4 = r0.mMusicStart
                int r5 = r0.mMusicEnd
                r6 = -1
                r7 = 0
                r2.mo106522a(r3, r4, r5, r6, r7)
            L_0x018f:
                if (r9 == 0) goto L_0x01c1
                java.lang.String r9 = "select_lyricsticker_clip_complete"
                com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r2 = "creation_id"
                java.lang.String r3 = r0.creationId
                com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
                java.lang.String r2 = "shoot_way"
                java.lang.String r0 = r0.mShootWay
                com.ss.android.ugc.aweme.app.g.d r0 = r1.mo59973a(r2, r0)
                java.lang.String r1 = "music_id"
                com.ss.android.ugc.aweme.shortvideo.dw r2 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r2 = r2.mo97931b()
                if (r2 != 0) goto L_0x01b6
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x01b6:
                java.lang.String r2 = r2.mid
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r9, r0)
            L_0x01c1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44022ak.C44030g.mo106531a(boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$h */
    public static final class C44031h implements C44025c {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113935a;

        C44031h(C44022ak akVar) {
            this.f113935a = akVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x010c  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x015b  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo106532a(boolean r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.property.AVAB r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
                com.ss.android.ugc.aweme.property.AVAB$Property r1 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
                boolean r0 = r0.mo93305a(r1)
                if (r0 == 0) goto L_0x0086
                com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
                if (r0 == 0) goto L_0x0086
                com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
                if (r0 != 0) goto L_0x0021
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0021:
                int r0 = r0.getShootDuration()
                if (r0 <= 0) goto L_0x0086
                com.ss.android.ugc.gamora.editor.ak r0 = r4.f113935a
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r0)
                android.arch.lifecycle.o r0 = r0.mo106448i()
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x003a
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x003a:
                com.ss.android.ugc.asve.b.d r0 = (com.p280ss.android.ugc.asve.p754b.C15389d) r0
                int r0 = r0.mo38860l()
                com.ss.android.ugc.aweme.shortvideo.dw r1 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r1 = r1.mo97931b()
                if (r1 != 0) goto L_0x004d
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x004d:
                int r1 = r1.getShootDuration()
                int r0 = r0 - r1
                int r0 = java.lang.Math.abs(r0)
                r1 = 1000(0x3e8, float:1.401E-42)
                if (r0 < r1) goto L_0x006c
                com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = r0.mo97931b()
                if (r0 != 0) goto L_0x0067
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0067:
                int r0 = r0.getShootDuration()
                goto L_0x00c5
            L_0x006c:
                com.ss.android.ugc.gamora.editor.ak r0 = r4.f113935a
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r0)
                android.arch.lifecycle.o r0 = r0.mo106448i()
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x007f
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x007f:
                com.ss.android.ugc.asve.b.d r0 = (com.p280ss.android.ugc.asve.p754b.C15389d) r0
                int r0 = r0.mo38860l()
                goto L_0x00c5
            L_0x0086:
                boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C38579ch.m123272a()
                if (r0 == 0) goto L_0x00ac
                com.ss.android.ugc.gamora.editor.ak r0 = r4.f113935a
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r0)
                android.arch.lifecycle.o r0 = r0.mo106448i()
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x009f
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x009f:
                com.ss.android.ugc.asve.b.d r0 = (com.p280ss.android.ugc.asve.p754b.C15389d) r0
                int r0 = r0.mo38860l()
                r1 = 15000(0x3a98, float:2.102E-41)
                int r0 = java.lang.Math.min(r1, r0)
                goto L_0x00c5
            L_0x00ac:
                com.ss.android.ugc.gamora.editor.ak r0 = r4.f113935a
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r0)
                android.arch.lifecycle.o r0 = r0.mo106448i()
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x00bf
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00bf:
                com.ss.android.ugc.asve.b.d r0 = (com.p280ss.android.ugc.asve.p754b.C15389d) r0
                int r0 = r0.mo38860l()
            L_0x00c5:
                com.ss.android.ugc.gamora.editor.ak r1 = r4.f113935a
                com.ss.android.ugc.gamora.editor.EditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r1)
                android.arch.lifecycle.o r1 = r1.mo106448i()
                java.lang.Object r1 = r1.getValue()
                if (r1 != 0) goto L_0x00d8
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00d8:
                com.ss.android.ugc.asve.b.d r1 = (com.p280ss.android.ugc.asve.p754b.C15389d) r1
                int r1 = r1.mo38860l()
                int r0 = java.lang.Math.min(r0, r1)
                com.ss.android.ugc.gamora.editor.ak r1 = r4.f113935a
                dmt.av.video.VEVideoPublishEditViewModel r1 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139332h(r1)
                android.arch.lifecycle.o r1 = r1.mo119522n()
                java.lang.String r2 = "publishEditViewModel.musicStartChangeOpLiveData"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.gamora.editor.ak r2 = r4.f113935a
                int r2 = r2.f113918n
                dmt.av.video.u r0 = dmt.p1861av.video.C47515u.m148294a(r2, r0)
                r1.setValue(r0)
                com.ss.android.ugc.gamora.editor.ak r0 = r4.f113935a
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r0)
                android.arch.lifecycle.o r0 = r0.mo106448i()
                java.lang.Object r0 = r0.getValue()
                if (r0 != 0) goto L_0x010f
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x010f:
                com.ss.android.ugc.asve.b.d r0 = (com.p280ss.android.ugc.asve.p754b.C15389d) r0
                r1 = 0
                com.ss.android.vesdk.VEEditor$SEEK_MODE r2 = com.p280ss.android.vesdk.VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek
                com.ss.android.ugc.gamora.editor.ak r3 = r4.f113935a
                com.ss.android.vesdk.VEListener$m r3 = r3.f113928x
                int r0 = r0.mo38764a(r1, r2, r3)
                if (r0 != 0) goto L_0x015b
                com.ss.android.ugc.gamora.editor.ak r0 = r4.f113935a
                com.ss.android.ugc.gamora.editor.EditViewModel r0 = com.p280ss.android.ugc.gamora.editor.C44022ak.m139324a(r0)
                com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.mo29069f()
                if (r5 == 0) goto L_0x015a
                java.lang.String r5 = "lyricsticker_clip_adjust"
                com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
                java.lang.String r2 = "creation_id"
                java.lang.String r3 = r0.creationId
                com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
                java.lang.String r2 = "shoot_way"
                java.lang.String r0 = r0.mShootWay
                com.ss.android.ugc.aweme.app.g.d r0 = r1.mo59973a(r2, r0)
                java.lang.String r1 = "music_id"
                com.ss.android.ugc.aweme.shortvideo.dw r2 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
                com.ss.android.ugc.aweme.shortvideo.AVMusic r2 = r2.mo97931b()
                if (r2 != 0) goto L_0x014f
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x014f:
                java.lang.String r2 = r2.mid
                com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r0.f60753a
                com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r5, r0)
            L_0x015a:
                return
            L_0x015b:
                java.lang.IllegalStateException r5 = com.p280ss.android.ugc.gamora.editor.p1743b.C44148a.m139740d(r0)
                java.lang.String r0 = "VEVideoPublishEditScene.wrapSeekException(ret)"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.editor.C44022ak.C44031h.mo106532a(boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$i */
    public static final class C44032i implements C39313a {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113936a;

        /* renamed from: b */
        final /* synthetic */ AVMusic f113937b;

        /* renamed from: a */
        public final void mo96524a(AVMusicWaveBean aVMusicWaveBean) {
            this.f113936a.f113929y = false;
            this.f113936a.mo106527a(true);
            this.f113936a.mo106525a(aVMusicWaveBean, this.f113937b.getDuration(), C44022ak.m139324a(this.f113936a).mo29069f().mMusicStart);
        }

        C44032i(C44022ak akVar, AVMusic aVMusic) {
            this.f113936a = akVar;
            this.f113937b = aVMusic;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$j */
    static final class C44033j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113938a;

        C44033j(C44022ak akVar) {
            this.f113938a = akVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f113938a.mo106524J();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$k */
    public static final class C44034k implements C23254a {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113939a;

        C44034k(C44022ak akVar) {
            this.f113939a = akVar;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f113939a.mo106524J();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$l */
    public static final class C44035l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113940a;

        public final void run() {
            C15389d dVar = (C15389d) C44022ak.m139324a(this.f113940a).mo106448i().getValue();
            if (dVar != null) {
                int m = dVar.mo38862m();
                if (m < this.f113940a.f113920p) {
                    C44022ak.m139329e(this.f113940a).mo97826a((((float) m) * 1.0f) / ((float) this.f113940a.f113920p), true);
                }
                this.f113940a.f113921q.post(this);
            }
        }

        C44035l(C44022ak akVar) {
            this.f113940a = akVar;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$m */
    static final class C44036m extends Lambda implements C7563m<C11585f, EditMusicCutState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113941a;

        C44036m(C44022ak akVar) {
            this.f113941a = akVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m139368a((C11585f) obj, (EditMusicCutState) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m139368a(C11585f fVar, EditMusicCutState editMusicCutState) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(editMusicCutState, "it");
            Integer videoLength = editMusicCutState.getVideoLength();
            if (videoLength != null) {
                this.f113941a.mo106529d(videoLength.intValue());
            }
            Triple musicWaveData = editMusicCutState.getMusicWaveData();
            if (musicWaveData != null) {
                this.f113941a.mo106525a((AVMusicWaveBean) musicWaveData.getFirst(), ((Number) musicWaveData.getSecond()).intValue(), ((Number) musicWaveData.getThird()).intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.ak$n */
    static final class C44037n implements C45217m {

        /* renamed from: a */
        final /* synthetic */ C44022ak f113942a;

        C44037n(C44022ak akVar) {
            this.f113942a = akVar;
        }

        /* renamed from: a */
        public final void mo98376a(int i) {
            C15389d dVar = (C15389d) C44022ak.m139324a(this.f113942a).mo106448i().getValue();
            if (dVar != null) {
                dVar.mo38879v();
            }
        }
    }

    /* renamed from: a */
    public final void mo106526a(C44021aj ajVar) {
        C7573i.m23587b(ajVar, "<set-?>");
        this.f113917m = ajVar;
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        View view2;
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        if (C39805en.m127445a()) {
            LayoutInflater from = LayoutInflater.from(this.f33526d_);
            FrameLayout frameLayout = this.f113902D;
            if (frameLayout == null) {
                C7573i.m23583a("mParentLayout");
            }
            view2 = from.inflate(R.layout.akx, frameLayout, false);
            C7573i.m23582a((Object) view2, "LayoutInflater.from(acti…fs, mParentLayout, false)");
        } else {
            LayoutInflater from2 = LayoutInflater.from(this.f33526d_);
            FrameLayout frameLayout2 = this.f113902D;
            if (frameLayout2 == null) {
                C7573i.m23583a("mParentLayout");
            }
            view2 = from2.inflate(R.layout.hf, frameLayout2, false);
            C7573i.m23582a((Object) view2, "LayoutInflater.from(acti…ic, mParentLayout, false)");
        }
        this.f113903E = view2;
        FrameLayout frameLayout3 = this.f113902D;
        if (frameLayout3 == null) {
            C7573i.m23583a("mParentLayout");
        }
        View view3 = this.f113903E;
        if (view3 == null) {
            C7573i.m23583a("mDragLayout");
        }
        frameLayout3.addView(view3);
    }

    /* renamed from: a */
    public final void mo106527a(boolean z) {
        if (z) {
            View view = this.f113903E;
            if (view == null) {
                C7573i.m23583a("mDragLayout");
            }
            if (view.getVisibility() != 0) {
                View view2 = this.f113903E;
                if (view2 == null) {
                    C7573i.m23583a("mDragLayout");
                }
                view2.setVisibility(0);
                View view3 = this.f113903E;
                if (view3 == null) {
                    C7573i.m23583a("mDragLayout");
                }
                view3.setAlpha(0.0f);
                View view4 = this.f113903E;
                if (view4 == null) {
                    C7573i.m23583a("mDragLayout");
                }
                view4.animate().alpha(1.0f).setDuration(200).start();
                this.f113921q.post(this.f113912N);
                return;
            }
            return;
        }
        View view5 = this.f113903E;
        if (view5 == null) {
            C7573i.m23583a("mDragLayout");
        }
        if (view5.getVisibility() != 4) {
            View view6 = this.f113903E;
            if (view6 == null) {
                C7573i.m23583a("mDragLayout");
            }
            view6.setVisibility(4);
            this.f113921q.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: a */
    public final void mo106525a(AVMusicWaveBean aVMusicWaveBean, int i, int i2) {
        this.f113920p = i;
        m139327c(true);
        if (aVMusicWaveBean == null || !C39314b.m125640a(aVMusicWaveBean.getMusicWavePointArray())) {
            m139327c(true);
            return;
        }
        C39312e.m125628b(aVMusicWaveBean);
        C39314b.m125637a().mo97876a(aVMusicWaveBean, (long) this.f113904F, (long) i);
        m139327c(false);
        if (i2 == 0) {
            DmtCutMusicLayout dmtCutMusicLayout = this.f113915k;
            if (dmtCutMusicLayout == null) {
                C7573i.m23583a("cutMusicLayout");
            }
            dmtCutMusicLayout.mo97824a();
        } else {
            DmtCutMusicLayout dmtCutMusicLayout2 = this.f113915k;
            if (dmtCutMusicLayout2 == null) {
                C7573i.m23583a("cutMusicLayout");
            }
            dmtCutMusicLayout2.mo97825a((((float) i2) * 1.0f) / ((float) i));
            DmtCutMusicLayout dmtCutMusicLayout3 = this.f113915k;
            if (dmtCutMusicLayout3 == null) {
                C7573i.m23583a("cutMusicLayout");
            }
            dmtCutMusicLayout3.setTimeBubble(i2);
        }
        DmtCutMusicLayout dmtCutMusicLayout4 = this.f113915k;
        if (dmtCutMusicLayout4 == null) {
            C7573i.m23583a("cutMusicLayout");
        }
        dmtCutMusicLayout4.setAudioWaveViewData(aVMusicWaveBean);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    /* renamed from: S */
    private final void m139321S() {
        C23258e eVar = this.f113907I;
        if (eVar != null) {
            eVar.mo60525a(this.f113911M);
        }
    }

    /* renamed from: G */
    public final C44021aj mo30920G() {
        C44021aj ajVar = this.f113917m;
        if (ajVar == null) {
            C7573i.m23583a("musicCallback");
        }
        return ajVar;
    }

    /* renamed from: T */
    private void m139322T() {
        this.f113908J = new C44030g(this);
        this.f113922r = new C44031h(this);
    }

    /* renamed from: J */
    public final void mo106524J() {
        C44024b bVar = this.f113908J;
        if (bVar != null) {
            bVar.mo106531a(this.f113923s);
        }
        C23258e eVar = this.f113907I;
        if (eVar != null) {
            eVar.mo60526b(this.f113911M);
        }
    }

    /* renamed from: H */
    public final int mo30921H() {
        if (this.f113904F >= this.f113919o) {
            KTVView kTVView = this.f113914j;
            if (kTVView == null) {
                C7573i.m23583a("mKTVView");
            }
            return kTVView.getWidth();
        }
        KTVView kTVView2 = this.f113914j;
        if (kTVView2 == null) {
            C7573i.m23583a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d = width * 1.0d;
        double d2 = (double) this.f113904F;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f113919o;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: O */
    private final void m139317O() {
        ImageView imageView = this.f113913i;
        if (imageView == null) {
            C7573i.m23583a("mSlide");
        }
        float x = imageView.getX();
        ImageView imageView2 = this.f113913i;
        if (imageView2 == null) {
            C7573i.m23583a("mSlide");
        }
        float width = x + ((float) (imageView2.getWidth() / 2));
        KTVView kTVView = this.f113914j;
        if (kTVView == null) {
            C7573i.m23583a("mKTVView");
        }
        int x2 = (int) (width - kTVView.getX());
        KTVView kTVView2 = this.f113914j;
        if (kTVView2 == null) {
            C7573i.m23583a("mKTVView");
        }
        kTVView2.setStart(x2);
        KTVView kTVView3 = this.f113914j;
        if (kTVView3 == null) {
            C7573i.m23583a("mKTVView");
        }
        kTVView3.setLength(mo30921H());
        TextView textView = this.f113899A;
        if (textView == null) {
            C7573i.m23583a("mTextViewTimeStart");
        }
        textView.setText(C43109eu.m136730a(m139318P()));
    }

    /* renamed from: P */
    private final int m139318P() {
        ImageView imageView = this.f113913i;
        if (imageView == null) {
            C7573i.m23583a("mSlide");
        }
        double x = (double) imageView.getX();
        Double.isNaN(x);
        double d = x * 1.0d;
        KTVView kTVView = this.f113914j;
        if (kTVView == null) {
            C7573i.m23583a("mKTVView");
        }
        double x2 = (double) kTVView.getX();
        Double.isNaN(x2);
        double d2 = d - x2;
        ImageView imageView2 = this.f113913i;
        if (imageView2 == null) {
            C7573i.m23583a("mSlide");
        }
        double width = (double) (imageView2.getWidth() / 2);
        Double.isNaN(width);
        double d3 = d2 + width;
        KTVView kTVView2 = this.f113914j;
        if (kTVView2 == null) {
            C7573i.m23583a("mKTVView");
        }
        double width2 = (double) kTVView2.getWidth();
        Double.isNaN(width2);
        double d4 = d3 / width2;
        double d5 = (double) this.f113919o;
        Double.isNaN(d5);
        int i = (int) (d4 * d5);
        if (i < 0) {
            i = 0;
        }
        if (i > this.f113919o) {
            return 0;
        }
        return i;
    }

    /* renamed from: R */
    private final int m139320R() {
        if (this.f113904F >= this.f113919o) {
            KTVView kTVView = this.f113914j;
            if (kTVView == null) {
                C7573i.m23583a("mKTVView");
            }
            return (int) (((((float) kTVView.getWidth()) * 1.0f) * 15000.0f) / ((float) this.f113919o));
        }
        KTVView kTVView2 = this.f113914j;
        if (kTVView2 == null) {
            C7573i.m23583a("mKTVView");
        }
        double width = (double) kTVView2.getWidth();
        Double.isNaN(width);
        double d = width * 1.0d;
        double d2 = (double) this.f113904F;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f113919o;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: K */
    public final void mo96987K() {
        EditViewModel editViewModel = this.f113924t;
        if (editViewModel == null) {
            C7573i.m23583a("mEditViewModel");
        }
        int J = editViewModel.mo106435J();
        EditViewModel editViewModel2 = this.f113924t;
        if (editViewModel2 == null) {
            C7573i.m23583a("mEditViewModel");
        }
        if (J <= editViewModel2.mo29069f().mCurMusicLength) {
            EditMusicViewModel editMusicViewModel = this.f113910L;
            if (editMusicViewModel == null) {
                C7573i.m23583a("musicViewModel");
            }
            EditViewModel editViewModel3 = this.f113924t;
            if (editViewModel3 == null) {
                C7573i.m23583a("mEditViewModel");
            }
            editMusicViewModel.mo106299a(editViewModel3.mo29069f().mMusicStart);
            EditStickerViewModel editStickerViewModel = this.f113925u;
            if (editStickerViewModel == null) {
                C7573i.m23583a("stickerViewModel");
            }
            editStickerViewModel.mo106364h().setValue(Boolean.valueOf(true));
        }
    }

    /* renamed from: M */
    private final void m139315M() {
        boolean z;
        C39312e a = C39314b.m125637a();
        Activity v = mo31015v();
        C7573i.m23582a((Object) v, "requireActivity()");
        a.mo97875a((Context) v);
        C39314b.m125637a().f102120e = this.f113904F;
        AVMusic b = C39360dw.m125725a().mo97931b();
        StringBuilder sb = new StringBuilder("OLD_DRAFT avMusicIsNull:");
        boolean z2 = false;
        if (b == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C41530am.m132280a(sb.toString());
        if (b != null) {
            IAVMusicService iAVMusicService = C35563c.f93246i;
            Activity v2 = mo31015v();
            C7573i.m23582a((Object) v2, "requireActivity()");
            AVMusicWaveBean a2 = iAVMusicService.mo103844a(v2.getIntent().getSerializableExtra("music_wave_data"));
            StringBuilder sb2 = new StringBuilder("OLD_DRAFT musicWaveBeanIsNull:");
            if (a2 == null) {
                z2 = true;
            }
            sb2.append(z2);
            C41530am.m132280a(sb2.toString());
            if (a2 != null) {
                int duration = b.getDuration();
                EditViewModel editViewModel = this.f113924t;
                if (editViewModel == null) {
                    C7573i.m23583a("mEditViewModel");
                }
                mo106525a(a2, duration, editViewModel.mo29069f().mMusicStart);
                return;
            }
            String str = b.path;
            if (!C7276d.m22812b(str)) {
                EditViewModel editViewModel2 = this.f113924t;
                if (editViewModel2 == null) {
                    C7573i.m23583a("mEditViewModel");
                }
                str = editViewModel2.mo29069f().mMusicPath;
            }
            this.f113929y = true;
            C39314b.m125637a().mo97877a(str, (C39313a) new C44032i(this, b));
        }
    }

    /* renamed from: N */
    private final void m139316N() {
        View view = this.f113903E;
        if (view == null) {
            C7573i.m23583a("mDragLayout");
        }
        View findViewById = view.findViewById(R.id.bfv);
        C7573i.m23582a((Object) findViewById, "mDragLayout.findViewById(R.id.ktvView)");
        this.f113914j = (KTVView) findViewById;
        View view2 = this.f113903E;
        if (view2 == null) {
            C7573i.m23583a("mDragLayout");
        }
        View findViewById2 = view2.findViewById(R.id.e2_);
        C7573i.m23582a((Object) findViewById2, "mDragLayout.findViewById(R.id.tv_start)");
        this.f113899A = (TextView) findViewById2;
        View view3 = this.f113903E;
        if (view3 == null) {
            C7573i.m23583a("mDragLayout");
        }
        View findViewById3 = view3.findViewById(R.id.du3);
        C7573i.m23582a((Object) findViewById3, "mDragLayout.findViewById(R.id.tv_end)");
        this.f113900B = (TextView) findViewById3;
        View view4 = this.f113903E;
        if (view4 == null) {
            C7573i.m23583a("mDragLayout");
        }
        View findViewById4 = view4.findViewById(R.id.a5u);
        C7573i.m23582a((Object) findViewById4, "mDragLayout.findViewById(R.id.cutmusic_view)");
        this.f113915k = (DmtCutMusicLayout) findViewById4;
        View view5 = this.f113903E;
        if (view5 == null) {
            C7573i.m23583a("mDragLayout");
        }
        View findViewById5 = view5.findViewById(R.id.d7n);
        C7573i.m23582a((Object) findViewById5, "mDragLayout.findViewById(R.id.slide_container)");
        this.f113916l = (RelativeLayout) findViewById5;
        View view6 = this.f113903E;
        if (view6 == null) {
            C7573i.m23583a("mDragLayout");
        }
        View findViewById6 = view6.findViewById(R.id.b8_);
        C7573i.m23582a((Object) findViewById6, "mDragLayout.findViewById(R.id.iv_cut_music_next)");
        this.f113901C = (ImageView) findViewById6;
        ImageView imageView = this.f113901C;
        if (imageView == null) {
            C7573i.m23583a("mCutMusicNext");
        }
        imageView.setOnClickListener(new C44033j(this));
    }

    /* renamed from: Q */
    private final void m139319Q() {
        TextView textView = this.f113900B;
        if (textView == null) {
            C7573i.m23583a("mTextViewTotalTime");
        }
        textView.setText(C43109eu.m136730a(this.f113919o));
        TextView textView2 = this.f113899A;
        if (textView2 == null) {
            C7573i.m23583a("mTextViewTimeStart");
        }
        View view = this.f113903E;
        if (view == null) {
            C7573i.m23583a("mDragLayout");
        }
        textView2.setText(view.getContext().getString(R.string.e_x));
        View view2 = this.f113903E;
        if (view2 == null) {
            C7573i.m23583a("mDragLayout");
        }
        this.f113913i = new ImageView(view2.getContext());
        ImageView imageView = this.f113913i;
        if (imageView == null) {
            C7573i.m23583a("mSlide");
        }
        imageView.setImageResource(R.drawable.a48);
        ImageView imageView2 = this.f113913i;
        if (imageView2 == null) {
            C7573i.m23583a("mSlide");
        }
        imageView2.setScaleType(ScaleType.FIT_XY);
        View view3 = this.f113903E;
        if (view3 == null) {
            C7573i.m23583a("mDragLayout");
        }
        view3.postDelayed(new C44027e(this), 10);
        DmtCutMusicLayout dmtCutMusicLayout = this.f113915k;
        if (dmtCutMusicLayout == null) {
            C7573i.m23583a("cutMusicLayout");
        }
        DmtCutMusicLayout dmtCutMusicLayout2 = this.f113915k;
        if (dmtCutMusicLayout2 == null) {
            C7573i.m23583a("cutMusicLayout");
        }
        dmtCutMusicLayout.setBubbleTextViewAttrite(C39314b.m125636a(dmtCutMusicLayout2.getContext()));
        DmtCutMusicLayout dmtCutMusicLayout3 = this.f113915k;
        if (dmtCutMusicLayout3 == null) {
            C7573i.m23583a("cutMusicLayout");
        }
        dmtCutMusicLayout3.setScrollListener(new C44029f(this));
        DmtCutMusicLayout dmtCutMusicLayout4 = this.f113915k;
        if (dmtCutMusicLayout4 == null) {
            C7573i.m23583a("cutMusicLayout");
        }
        dmtCutMusicLayout4.mo97825a((((float) this.f113918n) * 1.0f) / ((float) this.f113919o));
        DmtCutMusicLayout dmtCutMusicLayout5 = this.f113915k;
        if (dmtCutMusicLayout5 == null) {
            C7573i.m23583a("cutMusicLayout");
        }
        dmtCutMusicLayout5.setTimeBubble(this.f113918n);
    }

    /* renamed from: I */
    public final void mo30922I() {
        double d = (double) this.f113918n;
        Double.isNaN(d);
        double d2 = d * 1.0d;
        KTVView kTVView = this.f113914j;
        if (kTVView == null) {
            C7573i.m23583a("mKTVView");
        }
        double width = (double) kTVView.getWidth();
        Double.isNaN(width);
        double d3 = d2 * width;
        double d4 = (double) this.f113919o;
        Double.isNaN(d4);
        int i = (int) (d3 / d4);
        ImageView imageView = this.f113913i;
        if (imageView == null) {
            C7573i.m23583a("mSlide");
        }
        KTVView kTVView2 = this.f113914j;
        if (kTVView2 == null) {
            C7573i.m23583a("mKTVView");
        }
        float x = kTVView2.getX() + ((float) i);
        ImageView imageView2 = this.f113913i;
        if (imageView2 == null) {
            C7573i.m23583a("mSlide");
        }
        imageView.setX(x - ((float) (imageView2.getWidth() / 2)));
        KTVView kTVView3 = this.f113914j;
        if (kTVView3 == null) {
            C7573i.m23583a("mKTVView");
        }
        kTVView3.setStart(i);
        KTVView kTVView4 = this.f113914j;
        if (kTVView4 == null) {
            C7573i.m23583a("mKTVView");
        }
        kTVView4.setLength(mo30921H());
        TextView textView = this.f113899A;
        if (textView == null) {
            C7573i.m23583a("mTextViewTimeStart");
        }
        textView.setText(C43109eu.m136730a(this.f113918n));
    }

    /* renamed from: L */
    private final void m139314L() {
        int i;
        Activity activity = this.f33526d_;
        if (!(activity instanceof C23258e)) {
            activity = null;
        }
        this.f113907I = (C23258e) activity;
        Activity activity2 = this.f33526d_;
        if (activity2 != null) {
            JediViewModel a = C36113b.m116288a((FragmentActivity) activity2).mo91871a(EditViewModel.class);
            C7573i.m23582a((Object) a, "JediViewModelProviders.o…ditViewModel::class.java)");
            this.f113924t = (EditViewModel) a;
            Activity activity3 = this.f33526d_;
            if (activity3 != null) {
                JediViewModel a2 = C36113b.m116288a((FragmentActivity) activity3).mo91871a(EditStickerViewModel.class);
                C7573i.m23582a((Object) a2, "JediViewModelProviders.o…kerViewModel::class.java)");
                this.f113925u = (EditStickerViewModel) a2;
                Activity activity4 = this.f33526d_;
                if (activity4 != null) {
                    JediViewModel a3 = C36113b.m116288a((FragmentActivity) activity4).mo91871a(EditMusicCutViewModel.class);
                    C7573i.m23582a((Object) a3, "JediViewModelProviders.o…CutViewModel::class.java)");
                    this.f113909K = (EditMusicCutViewModel) a3;
                    Activity activity5 = this.f33526d_;
                    if (activity5 != null) {
                        C0063u a4 = C0069x.m159a((FragmentActivity) activity5).mo147a(VEVideoPublishEditViewModel.class);
                        C7573i.m23582a((Object) a4, "ViewModelProviders.of(ac…ditViewModel::class.java)");
                        this.f113926v = (VEVideoPublishEditViewModel) a4;
                        Activity activity6 = this.f33526d_;
                        if (activity6 != null) {
                            JediViewModel a5 = C36113b.m116288a((FragmentActivity) activity6).mo91871a(EditPreviewViewModel.class);
                            C7573i.m23582a((Object) a5, "JediViewModelProviders.o…iewViewModel::class.java)");
                            this.f113927w = (EditPreviewViewModel) a5;
                            Activity activity7 = this.f33526d_;
                            if (activity7 != null) {
                                JediViewModel a6 = C36113b.m116288a((FragmentActivity) activity7).mo91871a(EditMusicViewModel.class);
                                C7573i.m23582a((Object) a6, "JediViewModelProviders.o…sicViewModel::class.java)");
                                this.f113910L = (EditMusicViewModel) a6;
                                if (!C38579ch.m123272a()) {
                                    EditViewModel editViewModel = this.f113924t;
                                    if (editViewModel == null) {
                                        C7573i.m23583a("mEditViewModel");
                                    }
                                    Object value = editViewModel.mo106448i().getValue();
                                    if (value == null) {
                                        C7573i.m23580a();
                                    }
                                    i = Math.min(IAVService.MUSIC_LENGTH_FOR_COPYRIGHT, ((C15389d) value).mo38860l());
                                } else {
                                    EditViewModel editViewModel2 = this.f113924t;
                                    if (editViewModel2 == null) {
                                        C7573i.m23583a("mEditViewModel");
                                    }
                                    Object value2 = editViewModel2.mo106448i().getValue();
                                    if (value2 == null) {
                                        C7573i.m23580a();
                                    }
                                    i = ((C15389d) value2).mo38860l();
                                }
                                this.f113904F = i;
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                        }
                        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                }
                throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: a */
    public static final /* synthetic */ EditViewModel m139324a(C44022ak akVar) {
        EditViewModel editViewModel = akVar.f113924t;
        if (editViewModel == null) {
            C7573i.m23583a("mEditViewModel");
        }
        return editViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ RelativeLayout m139325b(C44022ak akVar) {
        RelativeLayout relativeLayout = akVar.f113916l;
        if (relativeLayout == null) {
            C7573i.m23583a("slideContainer");
        }
        return relativeLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m139326c(C44022ak akVar) {
        ImageView imageView = akVar.f113913i;
        if (imageView == null) {
            C7573i.m23583a("mSlide");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ KTVView m139328d(C44022ak akVar) {
        KTVView kTVView = akVar.f113914j;
        if (kTVView == null) {
            C7573i.m23583a("mKTVView");
        }
        return kTVView;
    }

    /* renamed from: e */
    public static final /* synthetic */ DmtCutMusicLayout m139329e(C44022ak akVar) {
        DmtCutMusicLayout dmtCutMusicLayout = akVar.f113915k;
        if (dmtCutMusicLayout == null) {
            C7573i.m23583a("cutMusicLayout");
        }
        return dmtCutMusicLayout;
    }

    /* renamed from: f */
    public static final /* synthetic */ EditStickerViewModel m139330f(C44022ak akVar) {
        EditStickerViewModel editStickerViewModel = akVar.f113925u;
        if (editStickerViewModel == null) {
            C7573i.m23583a("stickerViewModel");
        }
        return editStickerViewModel;
    }

    /* renamed from: g */
    public static final /* synthetic */ EditPreviewViewModel m139331g(C44022ak akVar) {
        EditPreviewViewModel editPreviewViewModel = akVar.f113927w;
        if (editPreviewViewModel == null) {
            C7573i.m23583a("previewViewModel");
        }
        return editPreviewViewModel;
    }

    /* renamed from: h */
    public static final /* synthetic */ VEVideoPublishEditViewModel m139332h(C44022ak akVar) {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = akVar.f113926v;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("publishEditViewModel");
        }
        return vEVideoPublishEditViewModel;
    }

    /* renamed from: d */
    public final void mo106529d(int i) {
        this.f113904F = i;
        C39314b.m125637a().f102120e = this.f113904F;
    }

    /* renamed from: c */
    private final void m139327c(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        KTVView kTVView = this.f113914j;
        if (kTVView == null) {
            C7573i.m23583a("mKTVView");
        }
        int i5 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        kTVView.setVisibility(i);
        TextView textView = this.f113899A;
        if (textView == null) {
            C7573i.m23583a("mTextViewTimeStart");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        TextView textView2 = this.f113900B;
        if (textView2 == null) {
            C7573i.m23583a("mTextViewTotalTime");
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView2.setVisibility(i3);
        DmtCutMusicLayout dmtCutMusicLayout = this.f113915k;
        if (dmtCutMusicLayout == null) {
            C7573i.m23583a("cutMusicLayout");
        }
        if (z) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        dmtCutMusicLayout.setVisibility(i4);
        ImageView imageView = this.f113913i;
        if (imageView == null) {
            C7573i.m23583a("mSlide");
        }
        if (z) {
            i5 = 0;
        }
        imageView.setVisibility(i5);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m139314L();
        m139316N();
        m139319Q();
        View view = this.f113903E;
        if (view == null) {
            C7573i.m23583a("mDragLayout");
        }
        view.bringToFront();
        this.f113921q.post(this.f113912N);
        mo106527a(false);
        m139315M();
        m139322T();
        EditMusicCutViewModel editMusicCutViewModel = this.f113909K;
        if (editMusicCutViewModel == null) {
            C7573i.m23583a("musicCutViewModel");
        }
        mo29061a(editMusicCutViewModel, C11640h.m34110a(), new C44036m(this));
    }

    /* renamed from: b */
    public final void mo106528b(boolean z) {
        EditViewModel editViewModel = this.f113924t;
        if (editViewModel == null) {
            C7573i.m23583a("mEditViewModel");
        }
        VideoPublishEditModel f = editViewModel.mo29069f();
        if (f.mMusicPath != null && !f.isStickPointMode) {
            EditViewModel editViewModel2 = this.f113924t;
            if (editViewModel2 == null) {
                C7573i.m23583a("mEditViewModel");
            }
            editViewModel2.mo106443a(false, false);
            if (f.getWavFile() != null) {
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f113926v;
                if (vEVideoPublishEditViewModel == null) {
                    C7573i.m23583a("publishEditViewModel");
                }
                C0052o m = vEVideoPublishEditViewModel.mo119521m();
                C7573i.m23582a((Object) m, "publishEditViewModel.volumeChangeOpLiveData");
                m.setValue(VEVolumeChangeOp.ofVoice(0.0f));
            }
            if (C35563c.f93231M.mo93305a(Property.EnableRemove15sCapMusic) && C39360dw.m125725a().mo97931b() != null) {
                AVMusic b = C39360dw.m125725a().mo97931b();
                if (b == null) {
                    C7573i.m23580a();
                }
                if (b.getShootDuration() > 0) {
                    int a = C43021cp.m136536a(f.mMusicPath, false);
                    AVMusic b2 = C39360dw.m125725a().mo97931b();
                    if (b2 == null) {
                        C7573i.m23580a();
                    }
                    if (Math.abs(a - b2.getShootDuration()) >= 1000) {
                        EditMusicCutViewModel editMusicCutViewModel = this.f113909K;
                        if (editMusicCutViewModel == null) {
                            C7573i.m23583a("musicCutViewModel");
                        }
                        AVMusic b3 = C39360dw.m125725a().mo97931b();
                        if (b3 == null) {
                            C7573i.m23580a();
                        }
                        int shootDuration = b3.getShootDuration();
                        EditViewModel editViewModel3 = this.f113924t;
                        if (editViewModel3 == null) {
                            C7573i.m23583a("mEditViewModel");
                        }
                        editMusicCutViewModel.mo106287a(Math.min(shootDuration, editViewModel3.mo106435J()));
                    } else {
                        EditMusicCutViewModel editMusicCutViewModel2 = this.f113909K;
                        if (editMusicCutViewModel2 == null) {
                            C7573i.m23583a("musicCutViewModel");
                        }
                        EditViewModel editViewModel4 = this.f113924t;
                        if (editViewModel4 == null) {
                            C7573i.m23583a("mEditViewModel");
                        }
                        editMusicCutViewModel2.mo106287a(Math.min(a, editViewModel4.mo106435J()));
                    }
                }
            }
            this.f113919o = C35563c.f93246i.mo103862b(f.mMusicPath);
            TextView textView = this.f113900B;
            if (textView == null) {
                C7573i.m23583a("mTextViewTotalTime");
            }
            textView.setText(C43109eu.m136730a(this.f113919o));
            this.f113918n = f.mMusicStart;
            C12637b.m36714a(this, new C44026d(this));
            if (!this.f113929y) {
                mo106527a(true);
            }
            this.f113923s = z;
            EditViewModel editViewModel5 = this.f113924t;
            if (editViewModel5 == null) {
                C7573i.m23583a("mEditViewModel");
            }
            Object value = editViewModel5.mo106448i().getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            int a2 = ((C15389d) value).mo38764a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, this.f113928x);
            if (a2 == 0) {
                m139321S();
                C39500av.m126165u(f);
                return;
            }
            IllegalStateException d = C44148a.m139740d(a2);
            C7573i.m23582a((Object) d, "VEVideoPublishEditScene.wrapSeekException(ret)");
            throw d;
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7573i.m23587b(view, "v");
        C7573i.m23587b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                this.f113905G = motionEvent.getRawX();
                ImageView imageView = this.f113913i;
                if (imageView == null) {
                    C7573i.m23583a("mSlide");
                }
                this.f113906H = imageView.getX();
                break;
            case 1:
                ImageView imageView2 = this.f113913i;
                if (imageView2 == null) {
                    C7573i.m23583a("mSlide");
                }
                float x = imageView2.getX();
                KTVView kTVView = this.f113914j;
                if (kTVView == null) {
                    C7573i.m23583a("mKTVView");
                }
                float x2 = x - kTVView.getX();
                ImageView imageView3 = this.f113913i;
                if (imageView3 == null) {
                    C7573i.m23583a("mSlide");
                }
                int width = (int) (x2 + ((float) (imageView3.getWidth() / 2)));
                if (width < 0) {
                    width = 0;
                }
                double d = (double) width;
                Double.isNaN(d);
                double d2 = d * 1.0d;
                KTVView kTVView2 = this.f113914j;
                if (kTVView2 == null) {
                    C7573i.m23583a("mKTVView");
                }
                double width2 = (double) kTVView2.getWidth();
                Double.isNaN(width2);
                double d3 = d2 / width2;
                double d4 = (double) this.f113919o;
                Double.isNaN(d4);
                this.f113918n = (int) (d3 * d4);
                C44025c cVar = this.f113922r;
                if (cVar != null) {
                    cVar.mo106532a(this.f113923s);
                    break;
                }
                break;
            case 2:
                float rawX = this.f113906H + (motionEvent.getRawX() - this.f113905G);
                KTVView kTVView3 = this.f113914j;
                if (kTVView3 == null) {
                    C7573i.m23583a("mKTVView");
                }
                float x3 = kTVView3.getX();
                ImageView imageView4 = this.f113913i;
                if (imageView4 == null) {
                    C7573i.m23583a("mSlide");
                }
                if (rawX < x3 - ((float) (imageView4.getWidth() / 2))) {
                    KTVView kTVView4 = this.f113914j;
                    if (kTVView4 == null) {
                        C7573i.m23583a("mKTVView");
                    }
                    float x4 = kTVView4.getX();
                    ImageView imageView5 = this.f113913i;
                    if (imageView5 == null) {
                        C7573i.m23583a("mSlide");
                    }
                    rawX = x4 - ((float) (imageView5.getWidth() / 2));
                }
                KTVView kTVView5 = this.f113914j;
                if (kTVView5 == null) {
                    C7573i.m23583a("mKTVView");
                }
                float x5 = rawX - kTVView5.getX();
                ImageView imageView6 = this.f113913i;
                if (imageView6 == null) {
                    C7573i.m23583a("mSlide");
                }
                float width3 = x5 + ((float) (imageView6.getWidth() / 2));
                KTVView kTVView6 = this.f113914j;
                if (kTVView6 == null) {
                    C7573i.m23583a("mKTVView");
                }
                if (width3 >= ((float) (kTVView6.getWidth() - m139320R()))) {
                    KTVView kTVView7 = this.f113914j;
                    if (kTVView7 == null) {
                        C7573i.m23583a("mKTVView");
                    }
                    float x6 = kTVView7.getX();
                    ImageView imageView7 = this.f113913i;
                    if (imageView7 == null) {
                        C7573i.m23583a("mSlide");
                    }
                    float width4 = x6 - ((float) (imageView7.getWidth() / 2));
                    KTVView kTVView8 = this.f113914j;
                    if (kTVView8 == null) {
                        C7573i.m23583a("mKTVView");
                    }
                    rawX = (width4 + ((float) kTVView8.getWidth())) - ((float) m139320R());
                }
                float f = 0.0f;
                if (rawX >= 0.0f) {
                    f = rawX;
                }
                ImageView imageView8 = this.f113913i;
                if (imageView8 == null) {
                    C7573i.m23583a("mSlide");
                }
                imageView8.animate().x(f).setDuration(0).start();
                m139317O();
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aiq, viewGroup, false);
        if (inflate != null) {
            this.f113902D = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f113902D;
            if (frameLayout == null) {
                C7573i.m23583a("mParentLayout");
            }
            return frameLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
