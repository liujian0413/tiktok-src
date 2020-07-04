package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17454q;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39209j;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39163a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.AbstractVideoEditView;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2.C39280c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.C39293a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.MicroAppModel;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40308e;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40308e.C40310a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.story.shootvideo.C42017d;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtAutoRTLImageView;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.FloatRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment */
public abstract class VECutVideoFragment extends Fragment implements OnClickListener, C38751g, C38776l {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f100415a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VECutVideoFragment.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(VECutVideoFragment.class), "speedModule", "getSpeedModule()Lcom/ss/android/ugc/aweme/shortvideo/record/RecordSpeedModule;"))};

    /* renamed from: u */
    public static long f100416u = -1;

    /* renamed from: v */
    public static final C38650a f100417v = new C38650a(null);

    /* renamed from: A */
    private boolean f100418A;

    /* renamed from: B */
    private boolean f100419B;

    /* renamed from: C */
    private Serializable f100420C;

    /* renamed from: D */
    private MicroAppModel f100421D;

    /* renamed from: E */
    private String f100422E;

    /* renamed from: F */
    private Boolean f100423F = Boolean.valueOf(false);

    /* renamed from: G */
    private Workspace f100424G;

    /* renamed from: H */
    private final C7541d f100425H = C7546e.m23569a(new C38673v(this));

    /* renamed from: I */
    private final C7541d f100426I = C7546e.m23569a(new C38676y(this));

    /* renamed from: J */
    private HashMap f100427J;

    /* renamed from: b */
    public boolean f100428b;

    /* renamed from: c */
    public boolean f100429c;

    /* renamed from: d */
    public int f100430d;

    /* renamed from: e */
    public int f100431e;

    /* renamed from: f */
    public boolean f100432f = true;

    /* renamed from: g */
    public C39163a f100433g;

    /* renamed from: h */
    public int f100434h;

    /* renamed from: i */
    protected CutMultiVideoViewModel f100435i;

    /* renamed from: j */
    protected VideoEditViewModel f100436j;

    /* renamed from: k */
    protected VEVideoCutterViewModel f100437k;

    /* renamed from: l */
    public final ArrayList<ImportVideoInfo> f100438l = new ArrayList<>();

    /* renamed from: m */
    public final Handler f100439m = new Handler();

    /* renamed from: n */
    public final Runnable f100440n = new C38678z(this);

    /* renamed from: o */
    protected RelativeLayout f100441o;

    /* renamed from: p */
    protected LinearLayout f100442p;

    /* renamed from: q */
    public long f100443q;

    /* renamed from: r */
    public final C39293a f100444r = new C39293a(3, 0, SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);

    /* renamed from: s */
    public String f100445s;

    /* renamed from: t */
    public String f100446t;

    /* renamed from: w */
    private Intent f100447w;

    /* renamed from: x */
    private long f100448x = C39810eq.m127460a();

    /* renamed from: y */
    private final int f100449y = 3600000;

    /* renamed from: z */
    private AVChallenge f100450z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$a */
    public static final class C38650a {
        private C38650a() {
        }

        public /* synthetic */ C38650a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static VECutVideoFragment m123512a(Bundle bundle) {
            VECutVideoFragment vECutVideoFragment;
            C7573i.m23587b(bundle, "args");
            if (bundle.getBoolean("is_multi_mode")) {
                vECutVideoFragment = new VEMultiCutVideoFragment();
            } else {
                vECutVideoFragment = new VESingleCutVideoFragment();
            }
            vECutVideoFragment.setArguments(bundle);
            return vECutVideoFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$b */
    static final class C38651b<T> implements C0053p<C39293a> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100451a;

        C38651b(VECutVideoFragment vECutVideoFragment) {
            this.f100451a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C39293a aVar) {
            Integer num;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f102021c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                if (this.f100451a.mo96700j().mo96748c()) {
                    this.f100451a.mo96771b().setVisibility(8);
                    this.f100451a.f100439m.post(this.f100451a.f100440n);
                }
            } else if (num != null && num.intValue() == 2) {
                if (aVar.f102022d) {
                    this.f100451a.mo96771b().setVisibility(0);
                }
                this.f100451a.f100439m.removeCallbacks(this.f100451a.f100440n);
            } else if (num != null && num.intValue() == 3) {
                this.f100451a.f100439m.removeCallbacks(this.f100451a.f100440n);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$c */
    static final class C38652c<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100452a;

        C38652c(VECutVideoFragment vECutVideoFragment) {
            this.f100452a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            C6907h.m21524a("upload_duration_adjust", (Map) C22984d.m75611a().mo59973a("creation_id", this.f100452a.f100446t).mo59973a("shoot_way", this.f100452a.f100445s).mo59973a("enter_from", "clip_edit_page").mo59973a("content_type", "video").mo59970a("content_duration_ms", (int) (this.f100452a.mo96768a().getSelectedTime() * 1000.0f)).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$d */
    static final class C38653d<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100453a;

        C38653d(VECutVideoFragment vECutVideoFragment) {
            this.f100453a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100453a.f100444r.f102020b = this.f100453a.mo96768a().getPlayingPosition();
            this.f100453a.mo96699i().mo97802a(this.f100453a.f100444r);
            this.f100453a.mo96682F();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$e */
    static final class C38654e<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100454a;

        C38654e(VECutVideoFragment vECutVideoFragment) {
            this.f100454a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            long j;
            if (this.f100454a.mo96768a() instanceof VEVideoEditViewV2) {
                this.f100454a.mo96699i().mo97802a(new C39293a(3, this.f100454a.mo96768a().getSingleSeekTime(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
            } else {
                if (this.f100454a.f100434h == 1) {
                    j = this.f100454a.mo96768a().getMultiPlayingPosition();
                } else {
                    j = this.f100454a.mo96768a().getSinglePlayingPosition();
                }
                VECutVideoPresenter j2 = this.f100454a.mo96700j();
                C0902i playBoundary = this.f100454a.mo96768a().getPlayBoundary();
                C7573i.m23582a((Object) playBoundary, "videoEditView().playBoundary");
                j2.mo96738a(playBoundary);
                this.f100454a.mo96699i().mo97802a(new C39293a(3, j, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
            }
            this.f100454a.mo96682F();
            if (this.f100454a.f100434h == 2) {
                VECutVideoPresenter j3 = this.f100454a.mo96700j();
                VideoSegment videoSegment = (VideoSegment) this.f100454a.mo96698h().mo97721n().get(this.f100454a.f100431e);
                F f = this.f100454a.mo96768a().getPlayBoundary().f3154a;
                if (f == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) f, "videoEditView().playBoundary.first!!");
                long longValue = ((Number) f).longValue();
                S s = this.f100454a.mo96768a().getPlayBoundary().f3155b;
                if (s == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) s, "videoEditView().playBoundary.second!!");
                j3.mo96740a(videoSegment, longValue, ((Number) s).longValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$f */
    static final class C38655f<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100455a;

        C38655f(VECutVideoFragment vECutVideoFragment) {
            this.f100455a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            long j;
            if (f != null) {
                VECutVideoPresenter j2 = this.f100455a.mo96700j();
                int i = this.f100455a.f100431e;
                C7573i.m23582a((Object) f, "it");
                j2.mo96734a(i, f.floatValue());
                C0902i playBoundary = this.f100455a.mo96768a().getPlayBoundary();
                if (!(playBoundary.f3154a == null || playBoundary.f3155b == null)) {
                    if (this.f100455a.f100434h == 1) {
                        j = this.f100455a.mo96768a().getMultiSeekTime();
                    } else {
                        j = this.f100455a.mo96768a().getSingleSeekTime();
                    }
                    VECutVideoPresenter j3 = this.f100455a.mo96700j();
                    C0902i playBoundary2 = this.f100455a.mo96768a().getPlayBoundary();
                    C7573i.m23582a((Object) playBoundary2, "videoEditView().playBoundary");
                    j3.mo96738a(playBoundary2);
                    this.f100455a.mo96699i().mo97802a(new C39293a(3, j, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
                }
                this.f100455a.mo96682F();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$g */
    static final class C38656g<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100456a;

        C38656g(VECutVideoFragment vECutVideoFragment) {
            this.f100456a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100456a.mo96699i().mo97802a(new C39293a(3, this.f100456a.mo96768a().getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$h */
    static final class C38657h<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100457a;

        C38657h(VECutVideoFragment vECutVideoFragment) {
            this.f100457a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100457a.mo96699i().mo97802a(new C39293a(3, this.f100457a.mo96768a().getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateInOut));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$i */
    static final class C38658i<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100458a;

        C38658i(VECutVideoFragment vECutVideoFragment) {
            this.f100458a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                VECutVideoFragment vECutVideoFragment = this.f100458a;
                C7573i.m23582a((Object) bool, "it");
                vECutVideoFragment.mo96694c(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$j */
    static final class C38659j<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100459a;

        C38659j(VECutVideoFragment vECutVideoFragment) {
            this.f100459a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            int i;
            VECutVideoFragment vECutVideoFragment = this.f100459a;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            vECutVideoFragment.f100434h = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$k */
    static final class C38660k<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100460a;

        C38660k(VECutVideoFragment vECutVideoFragment) {
            this.f100460a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                if (!(!bool.booleanValue())) {
                    bool = null;
                }
                if (bool != null) {
                    this.f100460a.mo96699i().mo97802a(new C39293a(3, this.f100460a.mo96768a().getPlayingPosition(), SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$l */
    static final class C38661l<T> implements C0053p<Long> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100461a;

        C38661l(VECutVideoFragment vECutVideoFragment) {
            this.f100461a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Long l) {
            if (l != null) {
                this.f100461a.mo96699i().mo97802a(new C39293a(3, l.longValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$m */
    static final class C38662m<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100462a;

        C38662m(VECutVideoFragment vECutVideoFragment) {
            this.f100462a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            this.f100462a.mo96682F();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$n */
    static final class C38663n<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100463a;

        C38663n(VECutVideoFragment vECutVideoFragment) {
            this.f100463a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100463a.mo96699i().mo97802a(new C39293a(3, this.f100463a.mo96768a().getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            this.f100463a.mo96682F();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$o */
    static final class C38664o<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100464a;

        C38664o(VECutVideoFragment vECutVideoFragment) {
            this.f100464a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100464a.mo96699i().mo97802a(new C39293a(3, this.f100464a.mo96768a().getRightSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing));
            this.f100464a.mo96682F();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$p */
    static final class C38665p<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100465a;

        C38665p(VECutVideoFragment vECutVideoFragment) {
            this.f100465a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100465a.mo96699i().mo97802a(new C39293a(3, this.f100465a.mo96768a().getLeftSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateIn));
            this.f100465a.mo96682F();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$q */
    static final class C38666q<T> implements C0053p<Void> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100466a;

        C38666q(VECutVideoFragment vECutVideoFragment) {
            this.f100466a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Void voidR) {
            this.f100466a.mo96699i().mo97802a(new C39293a(3, this.f100466a.mo96768a().getRightSeekingValue(), SEEK_MODE.EDITOR_SEEK_FLAG_LAST_UpdateOut));
            this.f100466a.mo96682F();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$r */
    public static final class C38667r implements C38747c {

        /* renamed from: a */
        public C41654d f100467a;

        /* renamed from: b */
        public boolean f100468b;

        /* renamed from: c */
        final /* synthetic */ VECutVideoFragment f100469c;

        /* renamed from: d */
        final /* synthetic */ C17454q f100470d;

        public final void onCompileDone() {
            TextView textView = (TextView) this.f100469c.mo96687a((int) R.id.dq1);
            C7573i.m23582a((Object) textView, "tvNext");
            textView.setEnabled(true);
            C42951au.m136343b(this.f100467a);
            this.f100469c.mo96695d(this.f100468b);
            C17454q qVar = this.f100470d;
            C7573i.m23582a((Object) qVar, "stopwatch");
            if (qVar.f48412a) {
                this.f100470d.mo44943d();
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                String a = C1642a.m8035a(locale, "%d", Arrays.copyOf(new Object[]{Long.valueOf(this.f100470d.mo44941a(TimeUnit.MILLISECONDS))}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                C6907h.m21524a("import_transcoding_end", (Map) C22984d.m75611a().mo59970a("status", 1).mo59973a("duration", a).f60753a);
            }
        }

        public final void onCompileProgress(float f) {
            C41654d dVar = this.f100467a;
            if (dVar != null) {
                if (!dVar.isShowing()) {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.setProgress((int) (f * 100.0f));
                }
            }
        }

        /* renamed from: a */
        public final void mo96718a(boolean z) {
            this.f100468b = z;
            if (!z) {
                this.f100467a = C41654d.m132586b(this.f100469c.getActivity(), this.f100469c.getResources().getString(R.string.dtv));
                C41654d dVar = this.f100467a;
                if (dVar != null) {
                    dVar.setIndeterminate(false);
                }
            }
        }

        C38667r(VECutVideoFragment vECutVideoFragment, C17454q qVar) {
            this.f100469c = vECutVideoFragment;
            this.f100470d = qVar;
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            TextView textView = (TextView) this.f100469c.mo96687a((int) R.id.dq1);
            C7573i.m23582a((Object) textView, "tvNext");
            textView.setEnabled(true);
            C42951au.m136343b(this.f100467a);
            Context context = this.f100469c.getContext();
            StringBuilder sb = new StringBuilder("合成失败 ");
            sb.append(i);
            C10761a.m31403c(context, sb.toString()).mo25750a();
            C6907h.m21524a("import_transcoding_end", (Map) C22984d.m75611a().mo59970a("status", 0).f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$s */
    public static final class C38668s implements C38750f {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100471a;

        /* renamed from: b */
        final /* synthetic */ View f100472b;

        /* renamed from: c */
        final /* synthetic */ TextView f100473c;

        /* renamed from: d */
        final /* synthetic */ FrameLayout f100474d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$s$a */
        static final class C38669a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C38668s f100475a;

            C38669a(C38668s sVar) {
                this.f100475a = sVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RadioGroup radioGroup = (RadioGroup) this.f100475a.f100472b.findViewById(R.id.cmr);
                TextView textView = this.f100475a.f100473c;
                C7573i.m23582a((Object) textView, "selfAdaptionToast");
                C7573i.m23582a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    textView.setAlpha(((Float) animatedValue).floatValue());
                    FrameLayout frameLayout = this.f100475a.f100474d;
                    C7573i.m23582a((Object) frameLayout, "bottomTools");
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        frameLayout.setAlpha(1.0f - ((Float) animatedValue2).floatValue());
                        if (radioGroup != null && radioGroup.getVisibility() == 0) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            if (animatedValue3 != null) {
                                radioGroup.setAlpha(1.0f - ((Float) animatedValue3).floatValue());
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$s$b */
        static final class C38670b implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C38668s f100476a;

            C38670b(C38668s sVar) {
                this.f100476a = sVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RadioGroup radioGroup = (RadioGroup) this.f100476a.f100472b.findViewById(R.id.cmr);
                TextView textView = this.f100476a.f100473c;
                C7573i.m23582a((Object) textView, "selfAdaptionToast");
                C7573i.m23582a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    textView.setAlpha(((Float) animatedValue).floatValue());
                    FrameLayout frameLayout = this.f100476a.f100474d;
                    C7573i.m23582a((Object) frameLayout, "bottomTools");
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    if (animatedValue2 != null) {
                        frameLayout.setAlpha(1.0f - ((Float) animatedValue2).floatValue());
                        if (radioGroup != null && radioGroup.getVisibility() == 0) {
                            Object animatedValue3 = valueAnimator.getAnimatedValue();
                            if (animatedValue3 != null) {
                                radioGroup.setAlpha(1.0f - ((Float) animatedValue3).floatValue());
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }

        /* renamed from: a */
        public final void mo96719a() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(250);
            ofFloat.addUpdateListener(new C38669a(this));
            ofFloat.start();
        }

        /* renamed from: b */
        public final void mo96721b(float f) {
            TextView textView = this.f100473c;
            C7573i.m23582a((Object) textView, "selfAdaptionToast");
            textView.setText(this.f100471a.mo96688a(f));
        }

        /* renamed from: a */
        public final void mo96720a(float f) {
            mo96721b(f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.setDuration(250);
            ofFloat.addUpdateListener(new C38670b(this));
            ofFloat.start();
        }

        C38668s(VECutVideoFragment vECutVideoFragment, View view, TextView textView, FrameLayout frameLayout) {
            this.f100471a = vECutVideoFragment;
            this.f100472b = view;
            this.f100473c = textView;
            this.f100474d = frameLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$t */
    static final class C38671t<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100477a;

        C38671t(VECutVideoFragment vECutVideoFragment) {
            this.f100477a = vECutVideoFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7581n call() {
            List<VideoSegment> n = this.f100477a.mo96698h().mo97721n();
            if (n == null) {
                return null;
            }
            for (VideoSegment videoSegment : n) {
                ArrayList<ImportVideoInfo> arrayList = this.f100477a.f100438l;
                int i = videoSegment.f100765g;
                int i2 = videoSegment.f100766h;
                C7573i.m23582a((Object) videoSegment, "segment");
                ImportVideoInfo importVideoInfo = new ImportVideoInfo(i, i2, videoSegment.mo96907f(), videoSegment.mo96905e(), videoSegment.mo96908g(), videoSegment.f100761c, videoSegment.mo96910i() - videoSegment.mo96909h());
                arrayList.add(importVideoInfo);
            }
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$u */
    public static final class C38672u extends C42939as {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100478a;

        C38672u(VECutVideoFragment vECutVideoFragment) {
            this.f100478a = vECutVideoFragment;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            this.f100478a.mo96714w();
            this.f100478a.mo96773c().setEnabled(false);
            this.f100478a.f100443q = System.currentTimeMillis();
            if (this.f100478a.mo96768a() instanceof VEVideoEditViewV2) {
                VECutVideoPresenter j = this.f100478a.mo96700j();
                C0902i playBoundary = this.f100478a.mo96768a().getPlayBoundary();
                C7573i.m23582a((Object) playBoundary, "videoEditView().playBoundary");
                j.mo96738a(playBoundary);
            }
            this.f100478a.mo96681E();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$v */
    static final class C38673v extends Lambda implements C7561a<VECutVideoPresenter> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100479a;

        C38673v(VECutVideoFragment vECutVideoFragment) {
            this.f100479a = vECutVideoFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VECutVideoPresenter invoke() {
            String b = Workspace.m122805b();
            C7573i.m23582a((Object) b, "Workspace.getImportDir()");
            return new VECutVideoPresenter(b, this.f100479a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$w */
    static final class C38674w implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100480a;

        /* renamed from: b */
        final /* synthetic */ IntRef f100481b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f100482c;

        /* renamed from: d */
        final /* synthetic */ FloatRef f100483d;

        /* renamed from: e */
        final /* synthetic */ IntRef f100484e;

        /* renamed from: f */
        final /* synthetic */ IntRef f100485f;

        /* renamed from: g */
        final /* synthetic */ View f100486g;

        C38674w(VECutVideoFragment vECutVideoFragment, IntRef intRef, FloatRef floatRef, FloatRef floatRef2, IntRef intRef2, IntRef intRef3, View view) {
            this.f100480a = vECutVideoFragment;
            this.f100481b = intRef;
            this.f100482c = floatRef;
            this.f100483d = floatRef2;
            this.f100484e = intRef2;
            this.f100485f = intRef3;
            this.f100486g = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            VECutVideoPresenter.m123542a(this.f100480a.mo96700j(), this.f100480a.f100431e, (90.0f * animatedFraction) + ((float) this.f100481b.element), false, this.f100482c.element + (this.f100483d.element * animatedFraction), this.f100482c.element + (this.f100483d.element * animatedFraction), this.f100484e.element, this.f100485f.element, 4, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$x */
    public static final class C38675x extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100487a;

        /* renamed from: b */
        final /* synthetic */ IntRef f100488b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f100489c;

        /* renamed from: d */
        final /* synthetic */ FloatRef f100490d;

        /* renamed from: e */
        final /* synthetic */ IntRef f100491e;

        /* renamed from: f */
        final /* synthetic */ IntRef f100492f;

        /* renamed from: g */
        final /* synthetic */ View f100493g;

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f100493g.setEnabled(true);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f100493g.setEnabled(false);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f100493g.setEnabled(true);
            this.f100487a.mo96697g().mo96670b();
        }

        C38675x(VECutVideoFragment vECutVideoFragment, IntRef intRef, FloatRef floatRef, FloatRef floatRef2, IntRef intRef2, IntRef intRef3, View view) {
            this.f100487a = vECutVideoFragment;
            this.f100488b = intRef;
            this.f100489c = floatRef;
            this.f100490d = floatRef2;
            this.f100491e = intRef2;
            this.f100492f = intRef3;
            this.f100493g = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$y */
    static final class C38676y extends Lambda implements C7561a<C40308e> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100494a;

        C38676y(VECutVideoFragment vECutVideoFragment) {
            this.f100494a = vECutVideoFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C40308e invoke() {
            return new C40308e(this.f100494a.mo96775e(), new C40310a(this) {

                /* renamed from: a */
                final /* synthetic */ C38676y f100495a;

                {
                    this.f100495a = r1;
                }

                /* renamed from: a */
                public final void mo96729a(RecordingSpeed recordingSpeed) {
                    this.f100495a.f100494a.mo96697g().mo96663a(recordingSpeed.value());
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment$z */
    public static final class C38678z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VECutVideoFragment f100496a;

        public final void run() {
            long b = this.f100496a.mo96700j().mo96747b();
            if (b > 0) {
                this.f100496a.mo96697g().mo96666a(b, this.f100496a.mo96698h().mo97720m(), this.f100496a.mo96698h().mo97722o());
            }
            this.f100496a.f100439m.postDelayed(this, 30);
        }

        C38678z(VECutVideoFragment vECutVideoFragment) {
            this.f100496a = vECutVideoFragment;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo96678B() {
        mo96680D();
    }

    /* renamed from: G */
    public boolean mo96683G() {
        return false;
    }

    /* renamed from: H */
    public AVMusic mo96684H() {
        return null;
    }

    /* renamed from: J */
    public void mo96686J() {
        if (this.f100427J != null) {
            this.f100427J.clear();
        }
    }

    /* renamed from: a */
    public View mo96687a(int i) {
        if (this.f100427J == null) {
            this.f100427J = new HashMap();
        }
        View view = (View) this.f100427J.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f100427J.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public abstract void mo96689a(int i, int i2);

    /* renamed from: a */
    public void mo96691a(C15389d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo96692a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo96693b(boolean z) {
    }

    /* renamed from: f */
    public abstract int mo96696f();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final VECutVideoPresenter mo96700j() {
        return (VECutVideoPresenter) this.f100425H.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C40308e mo96701k() {
        return (C40308e) this.f100426I.getValue();
    }

    /* renamed from: o */
    public final C0043i mo96705o() {
        return this;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo96686J();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    /* renamed from: q */
    public void mo96708q() {
    }

    /* renamed from: s */
    public final int mo96710s() {
        return this.f100434h;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: w */
    public void mo96714w() {
    }

    /* renamed from: x */
    public abstract boolean mo96715x();

    /* renamed from: v */
    public final void mo96713v() {
        mo96768a().mo97635b();
    }

    /* renamed from: L */
    private final boolean mo96767L() {
        Intent intent = this.f100447w;
        if (intent != null) {
            return intent.getBooleanExtra("from_music_detail", false);
        }
        return false;
    }

    /* renamed from: M */
    private final void m123465M() {
        this.f100438l.clear();
        C1592h.m7853a((Callable<TResult>) new C38671t<TResult>(this));
    }

    /* renamed from: D */
    public void mo96680D() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final CutMultiVideoViewModel mo96697g() {
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f100435i;
        if (cutMultiVideoViewModel == null) {
            C7573i.m23583a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final VideoEditViewModel mo96698h() {
        VideoEditViewModel videoEditViewModel = this.f100436j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final VEVideoCutterViewModel mo96699i() {
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f100437k;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final RelativeLayout mo96702l() {
        RelativeLayout relativeLayout = this.f100441o;
        if (relativeLayout == null) {
            C7573i.m23583a("layoutTop");
        }
        return relativeLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final LinearLayout mo96703m() {
        LinearLayout linearLayout = this.f100442p;
        if (linearLayout == null) {
            C7573i.m23583a("layoutBottom");
        }
        return linearLayout;
    }

    /* renamed from: n */
    public final Context mo96704n() {
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        return context;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f100439m.removeCallbacks(this.f100440n);
    }

    /* renamed from: p */
    public final void mo96707p() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: t */
    public final long mo96711t() {
        return mo96768a().getMaxCutDuration();
    }

    /* renamed from: u */
    public final C0902i<Long, Long> mo96712u() {
        C0902i<Long, Long> playBoundary = mo96768a().getPlayBoundary();
        C7573i.m23582a((Object) playBoundary, "videoEditView().playBoundary");
        return playBoundary;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo96677A() {
        OnClickListener onClickListener = this;
        ((AVDmtAutoRTLImageView) mo96687a((int) R.id.b5g)).setOnClickListener(onClickListener);
        mo96766K().setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo96682F() {
        mo96774d().setText(mo96688a(mo96768a().getSelectedTime()));
    }

    /* renamed from: r */
    public final void mo96709r() {
        if (C35563c.f93231M.mo93305a(Property.VEExtractFramesAfterRender)) {
            mo96768a().setLoadThumbnailDirectly(true);
            mo96768a().mo97620a();
        }
    }

    /* renamed from: C */
    public final void mo96679C() {
        Serializable serializable;
        Intent intent = this.f100447w;
        if (intent != null) {
            serializable = intent.getSerializableExtra("extra_share_context");
        } else {
            serializable = null;
        }
        ShareContext shareContext = (ShareContext) serializable;
        if (C35563c.f93259v.mo83150a(shareContext)) {
            C35563c.f93259v.mo83147a(getActivity(), shareContext, "Sharing canceled", 20013);
        }
        mo96678B();
    }

    /* renamed from: I */
    public final void mo96685I() {
        if (this.f100420C != null) {
            Serializable serializable = this.f100420C;
            if (serializable != null) {
                startActivity(new Intent(getActivity(), (Class) serializable));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m123468P() {
        /*
            r5 = this;
            android.support.v4.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x005b
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "videoPath"
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r3 = r5.f100424G
            r4 = 0
            if (r3 == 0) goto L_0x001d
            java.io.File r3 = r3.mo96328p()
            if (r3 == 0) goto L_0x001d
            java.lang.String r3 = r3.getPath()
            goto L_0x001e
        L_0x001d:
            r3 = r4
        L_0x001e:
            r1.putExtra(r2, r3)
            java.lang.String r2 = "audioPath"
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r3 = r5.f100424G
            if (r3 == 0) goto L_0x0031
            java.io.File r3 = r3.mo96329q()
            if (r3 == 0) goto L_0x0031
            java.lang.String r4 = r3.getPath()
        L_0x0031:
            r1.putExtra(r2, r4)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r2 = r5.f100436j
            if (r2 != 0) goto L_0x003d
            java.lang.String r3 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x003d:
            java.util.List r2 = r2.mo97721n()
            int r3 = r5.f100431e
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r2 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r2
            java.lang.String r3 = "videoOriginPath"
            r4 = 0
            java.lang.String r2 = r2.mo96896a(r4)
            r1.putExtra(r3, r2)
            r2 = -1
            r0.setResult(r2, r1)
            r0.finish()
            return
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment.m123468P():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo96716y() {
        if (C39805en.m127445a()) {
            switch (C39804em.f103457a) {
                case 1:
                    mo96692a(true);
                    mo96693b(true);
                    return;
                case 2:
                    mo96692a(false);
                    mo96693b(true);
                    return;
                case 3:
                    mo96692a(true);
                    mo96693b(false);
                    return;
                case 4:
                    mo96692a(true);
                    mo96693b(true);
                    return;
                case 5:
                    mo96692a(false);
                    mo96693b(true);
                    return;
                case 6:
                    mo96692a(true);
                    mo96693b(false);
                    return;
                case 7:
                    mo96692a(false);
                    mo96693b(false);
                    return;
                default:
                    mo96692a(false);
                    mo96693b(false);
                    return;
            }
        }
    }

    /* renamed from: O */
    private final void m123467O() {
        String str;
        boolean z;
        Bundle arguments = getArguments();
        ArrayList arrayList = null;
        if (arguments != null) {
            str = arguments.getString("single_video_path");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arrayList = arguments2.getParcelableArrayList("multi_video_path_list");
        }
        CharSequence charSequence = str;
        if (!TextUtils.isEmpty(charSequence) || arrayList == null || !arrayList.isEmpty()) {
            if (C6399b.m19946v()) {
                mo96768a().setMaxVideoLength(60000);
            }
            if (this.f100428b) {
                mo96768a().setMinVideoLength(1000);
                mo96768a().setMaxVideoLength(10000);
                Context context = getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                mo96689a(R.drawable.tr, C0683b.m2912c(context, R.color.ab1));
            }
            if (this.f100429c) {
                Intent intent = this.f100447w;
                long j = C40413c.f105051b;
                if (intent != null) {
                    j = intent.getLongExtra("background_video_max_length", C40413c.f105051b);
                }
                mo96768a().setMaxVideoLength(j);
            }
            mo96768a().setExtractFramesInRoughMode(true);
            if (!TextUtils.isEmpty(charSequence)) {
                AbstractVideoEditView a = mo96768a();
                FragmentActivity activity = getActivity();
                CutMultiVideoViewModel cutMultiVideoViewModel = this.f100435i;
                if (cutMultiVideoViewModel == null) {
                    C7573i.m23583a("cutMultiVideoViewModel");
                }
                z = a.mo97632a(activity, cutMultiVideoViewModel, str);
            } else {
                AbstractVideoEditView a2 = mo96768a();
                FragmentActivity activity2 = getActivity();
                CutMultiVideoViewModel cutMultiVideoViewModel2 = this.f100435i;
                if (cutMultiVideoViewModel2 == null) {
                    C7573i.m23583a("cutMultiVideoViewModel");
                }
                z = a2.mo97633a(activity2, cutMultiVideoViewModel2, (List) arrayList);
            }
            if (!z) {
                mo96679C();
            } else {
                this.f100434h = mo96768a().getEditState();
            }
        } else {
            mo96679C();
        }
    }

    /* renamed from: E */
    public final void mo96681E() {
        FragmentActivity activity = getActivity();
        if (activity != null && activity.isFinishing()) {
            return;
        }
        if (mo96700j().mo96731a() + 5 < this.f100448x) {
            C10761a.m31403c(getContext(), getString(R.string.fob, Long.valueOf(this.f100448x / 1000))).mo25750a();
            mo96773c().setEnabled(true);
        } else if (mo96700j().mo96731a() > ((long) this.f100449y)) {
            StringBuilder sb = new StringBuilder("compile failed,duration=");
            sb.append(mo96700j().mo96731a());
            sb.append(",maxEncodeDuration=");
            sb.append(this.f100449y);
            C41530am.m132280a(sb.toString());
            C10761a.m31399c(getContext(), (int) R.string.cap).mo25750a();
            mo96773c().setEnabled(true);
        } else {
            C6907h.m21524a("import_transcoding_start", Collections.emptyMap());
            C17454q b = C17454q.m58004b();
            if (this.f100434h != 1) {
                VECutVideoPresenter j = mo96700j();
                int i = this.f100431e;
                VideoEditViewModel videoEditViewModel = this.f100436j;
                if (videoEditViewModel == null) {
                    C7573i.m23583a("videoEditViewModel");
                }
                VECutVideoPresenter.m123542a(j, i, (float) ((VideoSegment) videoEditViewModel.mo97720m().get(this.f100431e)).f100769k, false, 0.0f, 0.0f, 0, 0, 120, null);
            }
            VECutVideoPresenter j2 = mo96700j();
            Workspace workspace = this.f100424G;
            if (workspace == null) {
                C7573i.m23580a();
            }
            j2.mo96739a(workspace, this.f100429c, this.f100419B, new C38667r(this, b));
        }
    }

    /* renamed from: N */
    private final void m123466N() {
        Intent intent;
        boolean z;
        AVChallenge aVChallenge;
        MicroAppModel microAppModel;
        boolean z2;
        boolean z3;
        String str;
        Bundle arguments = getArguments();
        String str2 = null;
        if (arguments != null) {
            intent = (Intent) arguments.getParcelable("page_intent_data");
        } else {
            intent = null;
        }
        this.f100447w = intent;
        Intent intent2 = this.f100447w;
        if (intent2 != null) {
            this.f100428b = C42017d.m133561a(intent2.getIntExtra("shoot_mode", -1));
            boolean z4 = false;
            this.f100429c = intent2.getBooleanExtra("from_background_video", false);
            if (this.f100428b || this.f100429c) {
                z = false;
            } else {
                z = true;
            }
            this.f100432f = z;
            this.f100448x = intent2.getLongExtra("min_duration", C39810eq.m127460a());
            String stringExtra = intent2.getStringExtra("path");
            if (!TextUtils.isEmpty(stringExtra)) {
                Workspace workspace = this.f100424G;
                if (workspace != null) {
                    workspace.mo96312a(new File(stringExtra));
                }
            }
            if (intent2.getSerializableExtra("av_challenge") == null) {
                aVChallenge = null;
            } else {
                Serializable serializableExtra = intent2.getSerializableExtra("av_challenge");
                if (serializableExtra != null) {
                    aVChallenge = (AVChallenge) serializableExtra;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVChallenge");
                }
            }
            this.f100450z = aVChallenge;
            this.f100422E = intent2.getStringExtra("micro_app_id");
            if (intent2.getSerializableExtra("micro_app_info") == null) {
                microAppModel = null;
            } else {
                Serializable serializableExtra2 = intent2.getSerializableExtra("micro_app_info");
                if (serializableExtra2 != null) {
                    microAppModel = (MicroAppModel) serializableExtra2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel");
                }
            }
            this.f100421D = microAppModel;
            this.f100420C = intent2.getSerializableExtra("micro_app_class");
            if (this.f100421D != null || !TextUtils.isEmpty(this.f100422E)) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f100423F = Boolean.valueOf(z2);
            if (intent2.getBooleanExtra("enter_record_from_other_platform", false) || this.f100421D != null || !TextUtils.isEmpty(this.f100422E)) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f100418A = z3;
            if (this.f100421D != null || !TextUtils.isEmpty(this.f100422E)) {
                z4 = true;
            }
            this.f100419B = z4;
            Intent intent3 = this.f100447w;
            if (intent3 != null) {
                str = intent3.getStringExtra("shoot_way");
            } else {
                str = null;
            }
            this.f100445s = str;
            Intent intent4 = this.f100447w;
            if (intent4 != null) {
                str2 = intent4.getStringExtra("creation_id");
            }
            this.f100446t = str2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo96717z() {
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f100437k;
        if (vEVideoCutterViewModel == null) {
            C7573i.m23583a("veVideoCutterViewModel");
        }
        C0043i iVar = this;
        vEVideoCutterViewModel.mo97801a().observe(iVar, new C38651b(this));
        VideoEditViewModel videoEditViewModel = this.f100436j;
        if (videoEditViewModel == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel.f101836a.observe(iVar, new C38659j(this));
        VideoEditViewModel videoEditViewModel2 = this.f100436j;
        if (videoEditViewModel2 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel2.f101837b.observe(iVar, new C38660k(this));
        VideoEditViewModel videoEditViewModel3 = this.f100436j;
        if (videoEditViewModel3 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel3.f101839d.observe(iVar, new C38661l(this));
        VideoEditViewModel videoEditViewModel4 = this.f100436j;
        if (videoEditViewModel4 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel4.f101838c.observe(iVar, new C38662m(this));
        VideoEditViewModel videoEditViewModel5 = this.f100436j;
        if (videoEditViewModel5 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel5.f101841f.observe(iVar, new C38663n(this));
        VideoEditViewModel videoEditViewModel6 = this.f100436j;
        if (videoEditViewModel6 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel6.f101840e.observe(iVar, new C38664o(this));
        VideoEditViewModel videoEditViewModel7 = this.f100436j;
        if (videoEditViewModel7 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel7.f101842g.observe(iVar, new C38665p(this));
        VideoEditViewModel videoEditViewModel8 = this.f100436j;
        if (videoEditViewModel8 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel8.f101845j.observe(iVar, new C38666q(this));
        VideoEditViewModel videoEditViewModel9 = this.f100436j;
        if (videoEditViewModel9 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel9.f101854s.observe(iVar, new C38652c(this));
        VideoEditViewModel videoEditViewModel10 = this.f100436j;
        if (videoEditViewModel10 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel10.f101846k.observe(iVar, new C38653d(this));
        VideoEditViewModel videoEditViewModel11 = this.f100436j;
        if (videoEditViewModel11 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel11.f101847l.observe(iVar, new C38654e(this));
        VideoEditViewModel videoEditViewModel12 = this.f100436j;
        if (videoEditViewModel12 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel12.f101848m.observe(iVar, new C38655f(this));
        VideoEditViewModel videoEditViewModel13 = this.f100436j;
        if (videoEditViewModel13 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel13.f101843h.observe(iVar, new C38656g(this));
        VideoEditViewModel videoEditViewModel14 = this.f100436j;
        if (videoEditViewModel14 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel14.f101844i.observe(iVar, new C38657h(this));
        VideoEditViewModel videoEditViewModel15 = this.f100436j;
        if (videoEditViewModel15 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        videoEditViewModel15.f101853r.observe(iVar, new C38658i(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo96690a(RelativeLayout relativeLayout) {
        C7573i.m23587b(relativeLayout, "<set-?>");
        this.f100441o = relativeLayout;
    }

    /* renamed from: b */
    private final boolean m123471b(float f) {
        if (mo96683G() || !C39280c.m125554b() || f <= 60.0f) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        Workspace workspace;
        super.onCreate(bundle);
        if (bundle == null) {
            workspace = Workspace.m122801a();
        } else {
            workspace = (Workspace) bundle.getParcelable("workspace");
        }
        this.f100424G = workspace;
        m123466N();
        mo96717z();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("workspace", this.f100424G);
    }

    /* renamed from: c */
    public void mo96694c(boolean z) {
        mo96768a().setEnabled(!z);
        TextView textView = (TextView) mo96687a((int) R.id.dq1);
        C7573i.m23582a((Object) textView, "tvNext");
        textView.setEnabled(!z);
        AVDmtAutoRTLImageView aVDmtAutoRTLImageView = (AVDmtAutoRTLImageView) mo96687a((int) R.id.b5g);
        C7573i.m23582a((Object) aVDmtAutoRTLImageView, "ivBack");
        aVDmtAutoRTLImageView.setEnabled(!z);
        mo96766K().setEnabled(!z);
    }

    /* renamed from: a */
    private final void m123469a(View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.of);
        TextView textView = (TextView) view.findViewById(R.id.d2p);
        if (!mo96715x()) {
            Drawable a = C38501ax.m123066a(0, 1459617792, 0, C23486n.m77122a(2.0d));
            C7573i.m23582a((Object) textView, "selfAdaptionToast");
            textView.setBackground(a);
        }
        AbstractVideoEditView a2 = mo96768a();
        if (a2 != null) {
            ((VEVideoEditViewV2) a2).setSelfAdaptiontoastAnimListener(new C38668s(this, view, textView, frameLayout));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEVideoEditViewV2");
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context != null) {
            FragmentActivity fragmentActivity = (AppCompatActivity) context;
            mo96700j().mo96737a(fragmentActivity);
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(CutMultiVideoViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…deoViewModel::class.java]");
            this.f100435i = (CutMultiVideoViewModel) a;
            C0063u a2 = C0069x.m159a(fragmentActivity).mo147a(VideoEditViewModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(ac…ditViewModel::class.java]");
            this.f100436j = (VideoEditViewModel) a2;
            C0063u a3 = C0069x.m159a(fragmentActivity).mo147a(VEVideoCutterViewModel.class);
            C7573i.m23582a((Object) a3, "ViewModelProviders.of(ac…terViewModel::class.java]");
            this.f100437k = (VEVideoCutterViewModel) a3;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }

    public void onClick(View view) {
        Integer num;
        C39293a aVar;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b5g) {
            mo96679C();
        } else if (num != null && num.intValue() == R.id.ea6) {
            VEVideoCutterViewModel vEVideoCutterViewModel = this.f100437k;
            if (vEVideoCutterViewModel == null) {
                C7573i.m23583a("veVideoCutterViewModel");
            }
            if (mo96700j().mo96748c()) {
                aVar = new C39293a(2, false, 2, null);
            } else {
                aVar = new C39293a(1, false, 2, null);
            }
            vEVideoCutterViewModel.mo97802a(aVar);
        } else {
            if (num != null && num.intValue() == R.id.b5n) {
                C38774k.m123815a();
                m123470b(view);
            }
        }
    }

    /* renamed from: a */
    public final String mo96688a(float f) {
        String str;
        boolean b = m123471b(f);
        if (b) {
            int i = (int) f;
            StringBuilder sb = new StringBuilder();
            Locale locale = Locale.getDefault();
            C7573i.m23582a((Object) locale, "Locale.getDefault()");
            String a = C1642a.m8035a(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            sb.append(a);
            sb.append(':');
            Locale locale2 = Locale.getDefault();
            C7573i.m23582a((Object) locale2, "Locale.getDefault()");
            String a2 = C1642a.m8035a(locale2, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i % 60)}, 1));
            C7573i.m23582a((Object) a2, "java.lang.String.format(locale, format, *args)");
            sb.append(a2);
            str = sb.toString();
        } else {
            Locale locale3 = Locale.getDefault();
            C7573i.m23582a((Object) locale3, "Locale.getDefault()");
            str = C1642a.m8035a(locale3, "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            C7573i.m23582a((Object) str, "java.lang.String.format(locale, format, *args)");
        }
        String string = getResources().getString(R.string.cb0, new Object[]{str});
        if (b) {
            C7573i.m23582a((Object) string, "text");
            int length = string.length() - 1;
            if (string != null) {
                String substring = string.substring(0, length);
                C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        C7573i.m23582a((Object) string, "text");
        return string;
    }

    /* renamed from: b */
    private void m123470b(View view) {
        int i;
        int i2;
        C39209j jVar;
        C39209j jVar2;
        C39209j jVar3;
        C7573i.m23587b(view, "view");
        int currentRotate = mo96768a().getCurrentRotate();
        FloatRef floatRef = new FloatRef();
        floatRef.element = 0.0f;
        if (this.f100434h == 0) {
            VideoEditViewModel videoEditViewModel = this.f100436j;
            if (videoEditViewModel == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            i2 = ((VideoSegment) videoEditViewModel.mo97721n().get(this.f100431e)).f100765g;
            VideoEditViewModel videoEditViewModel2 = this.f100436j;
            if (videoEditViewModel2 == null) {
                C7573i.m23583a("videoEditViewModel");
            }
            i = ((VideoSegment) videoEditViewModel2.mo97721n().get(this.f100431e)).f100766h;
        } else {
            i2 = mo96766K().getMeasuredWidth();
            i = mo96766K().getMeasuredHeight();
        }
        float f = 1.0f;
        if (mo96768a().getCurrentRotate() % NormalGiftView.ALPHA_180 == 0) {
            floatRef.element = 1.0f;
            f = (((float) i2) * 1.0f) / ((float) i);
        } else {
            floatRef.element = (((float) i2) * 1.0f) / ((float) i);
        }
        VideoEditViewModel videoEditViewModel3 = this.f100436j;
        if (videoEditViewModel3 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        ((VideoSegment) videoEditViewModel3.mo97721n().get(this.f100431e)).f100770l = f;
        VideoEditViewModel videoEditViewModel4 = this.f100436j;
        if (videoEditViewModel4 == null) {
            C7573i.m23583a("videoEditViewModel");
        }
        ((VideoSegment) videoEditViewModel4.mo97721n().get(this.f100431e)).f100771m = f;
        FloatRef floatRef2 = new FloatRef();
        floatRef2.element = f - floatRef.element;
        IntRef intRef = new IntRef();
        intRef.element = currentRotate % 360;
        IntRef intRef2 = new IntRef();
        intRef2.element = 0;
        IntRef intRef3 = new IntRef();
        intRef3.element = 0;
        C39163a aVar = this.f100433g;
        C39209j jVar4 = null;
        if (aVar != null) {
            jVar = aVar.mo97401k();
        } else {
            jVar = null;
        }
        if (jVar != null) {
            floatRef2.element = 0.0f;
            C39163a aVar2 = this.f100433g;
            if (aVar2 != null) {
                jVar2 = aVar2.mo97401k();
            } else {
                jVar2 = null;
            }
            if (jVar2 == null) {
                C7573i.m23580a();
            }
            floatRef.element = jVar2.f101619a;
            C39163a aVar3 = this.f100433g;
            if (aVar3 != null) {
                jVar3 = aVar3.mo97401k();
            } else {
                jVar3 = null;
            }
            if (jVar3 == null) {
                C7573i.m23580a();
            }
            intRef2.element = jVar3.f101621c;
            C39163a aVar4 = this.f100433g;
            if (aVar4 != null) {
                jVar4 = aVar4.mo97401k();
            }
            if (jVar4 == null) {
                C7573i.m23580a();
            }
            intRef3.element = jVar4.f101622d;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        IntRef intRef4 = intRef;
        FloatRef floatRef3 = floatRef;
        FloatRef floatRef4 = floatRef2;
        IntRef intRef5 = intRef2;
        IntRef intRef6 = intRef3;
        View view2 = view;
        C38674w wVar = new C38674w(this, intRef4, floatRef3, floatRef4, intRef5, intRef6, view2);
        ofFloat.addUpdateListener(wVar);
        C38675x xVar = new C38675x(this, intRef4, floatRef3, floatRef4, intRef5, intRef6, view2);
        ofFloat.addListener(xVar);
        ofFloat.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0423, code lost:
        if (r3 == null) goto L_0x0425;
     */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x04db  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96695d(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.f100429c
            if (r0 == 0) goto L_0x0008
            r11.m123468P()
            return
        L_0x0008:
            boolean r0 = r11.mo96767L()
            r1 = 0
            if (r0 != 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r0 = r11.f100424G
            if (r0 == 0) goto L_0x0016
            r0.mo96318f()
        L_0x0016:
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            r0.mo97928a(r1)
        L_0x001d:
            r11.m123465M()
            android.content.Intent r0 = r11.f100447w
            if (r0 == 0) goto L_0x002b
            java.lang.String r2 = "shoot_way"
            java.lang.String r0 = r0.getStringExtra(r2)
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            android.content.Intent r2 = r11.f100447w
            if (r2 == 0) goto L_0x0037
            java.lang.String r3 = "creation_id"
            java.lang.String r2 = r2.getStringExtra(r3)
            goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            android.content.Intent r3 = r11.f100447w
            if (r3 == 0) goto L_0x0043
            java.lang.String r4 = "cc_vid"
            java.lang.String r3 = r3.getStringExtra(r4)
            goto L_0x0044
        L_0x0043:
            r3 = r1
        L_0x0044:
            android.content.Intent r4 = r11.f100447w
            if (r4 == 0) goto L_0x004f
            java.lang.String r5 = "task_id"
            java.lang.String r4 = r4.getStringExtra(r5)
            goto L_0x0050
        L_0x004f:
            r4 = r1
        L_0x0050:
            android.content.Intent r5 = r11.f100447w
            if (r5 == 0) goto L_0x005b
            java.lang.String r6 = "challenge_names"
            java.util.ArrayList r5 = r5.getStringArrayListExtra(r6)
            goto L_0x005c
        L_0x005b:
            r5 = r1
        L_0x005c:
            boolean r6 = r11.mo96683G()
            if (r6 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.shortvideo.AVMusic r6 = r11.mo96684H()
            java.lang.String r6 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.m125100c(r6)
            boolean r7 = com.p280ss.android.ugc.aweme.video.C7276d.m22812b(r6)
            if (r7 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r7 = r11.f100424G
            if (r7 == 0) goto L_0x007c
            java.io.File r8 = new java.io.File
            r8.<init>(r6)
            r7.mo96312a(r8)
        L_0x007c:
            com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter r6 = r11.mo96700j()
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r7 = r11.f100424G
            android.content.Intent r12 = r6.mo96732a(r7, r12)
            java.lang.String r6 = "extra_start_enter_edit_page"
            long r7 = r11.f100443q
            r12.putExtra(r6, r7)
            java.lang.String r6 = "extra_import_compile_cost_time"
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r11.f100443q
            long r7 = r7 - r9
            r12.putExtra(r6, r7)
            java.lang.String r6 = "send_to_user_head"
            android.content.Intent r7 = r11.f100447w
            if (r7 == 0) goto L_0x00a6
            java.lang.String r8 = "send_to_user_head"
            java.io.Serializable r7 = r7.getSerializableExtra(r8)
            goto L_0x00a7
        L_0x00a6:
            r7 = r1
        L_0x00a7:
            r12.putExtra(r6, r7)
            java.lang.String r6 = "extra_is_change_speed"
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r7 = r11.f100436j
            if (r7 != 0) goto L_0x00b5
            java.lang.String r8 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r8)
        L_0x00b5:
            boolean r7 = r7.mo97723p()
            r12.putExtra(r6, r7)
            java.lang.String r6 = "enter_from"
            android.content.Intent r7 = r11.f100447w
            if (r7 == 0) goto L_0x00c9
            java.lang.String r8 = "enter_from"
            java.lang.String r7 = r7.getStringExtra(r8)
            goto L_0x00ca
        L_0x00c9:
            r7 = r1
        L_0x00ca:
            r12.putExtra(r6, r7)
            android.content.Intent r6 = r11.f100447w
            if (r6 == 0) goto L_0x00d8
            java.lang.String r7 = "enter_from"
            java.lang.String r6 = r6.getStringExtra(r7)
            goto L_0x00d9
        L_0x00d8:
            r6 = r1
        L_0x00d9:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.String r7 = "douplus"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 == 0) goto L_0x00f6
            java.lang.String r6 = "extra_mention_user_model"
            android.content.Intent r7 = r11.f100447w
            if (r7 == 0) goto L_0x00f2
            java.lang.String r8 = "extra_mention_user_model"
            java.io.Serializable r7 = r7.getSerializableExtra(r8)
            goto L_0x00f3
        L_0x00f2:
            r7 = r1
        L_0x00f3:
            r12.putExtra(r6, r7)
        L_0x00f6:
            java.lang.String r6 = "dir"
            java.lang.String r7 = com.p280ss.android.ugc.aweme.shortvideo.C39810eq.f103468d
            r12.putExtra(r6, r7)
            java.lang.String r6 = "shoot_way"
            r12.putExtra(r6, r0)
            java.lang.String r0 = "task_id"
            r12.putExtra(r0, r4)
            java.lang.String r0 = "content_type"
            boolean r4 = r11.mo96683G()
            if (r4 == 0) goto L_0x0112
            java.lang.String r4 = "sound_sync"
            goto L_0x0114
        L_0x0112:
            java.lang.String r4 = "video"
        L_0x0114:
            r12.putExtra(r0, r4)
            java.lang.String r0 = "content_source"
            java.lang.String r4 = "upload"
            r12.putExtra(r0, r4)
            java.lang.String r0 = "enable_music_path_check"
            r4 = 0
            r12.putExtra(r0, r4)
            java.lang.String r0 = "fromMultiCut"
            boolean r6 = r11 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.VEMultiCutVideoFragment
            r12.putExtra(r0, r6)
            java.lang.String r0 = "fromCut"
            r7 = 1
            r12.putExtra(r0, r7)
            java.lang.String r0 = "origin"
            r12.putExtra(r0, r4)
            java.lang.String r0 = "creation_id"
            r12.putExtra(r0, r2)
            java.lang.String r0 = "cc_vid"
            r12.putExtra(r0, r3)
            java.lang.String r0 = "poi_struct_in_tools_line"
            android.content.Intent r3 = r11.f100447w
            if (r3 == 0) goto L_0x014d
            java.lang.String r8 = "poi_struct_in_tools_line"
            java.lang.String r3 = r3.getStringExtra(r8)
            goto L_0x014e
        L_0x014d:
            r3 = r1
        L_0x014e:
            r12.putExtra(r0, r3)
            java.lang.String r0 = "back_to_main_after_publish"
            java.lang.Boolean r3 = r11.f100423F
            java.io.Serializable r3 = (java.io.Serializable) r3
            r12.putExtra(r0, r3)
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r0 = r11.f100450z
            if (r0 == 0) goto L_0x0174
            java.lang.String r3 = "challenge"
            java.util.List r0 = kotlin.collections.C7525m.m23457a(r0)
            if (r0 == 0) goto L_0x016c
            java.io.Serializable r0 = (java.io.Serializable) r0
            r12.putExtra(r3, r0)
            goto L_0x0174
        L_0x016c:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.io.Serializable"
            r12.<init>(r0)
            throw r12
        L_0x0174:
            java.lang.String r0 = "enter_record_from_other_platform"
            boolean r3 = r11.f100418A
            r12.putExtra(r0, r3)
            java.lang.String r0 = "edit_publish_session_end_together"
            android.content.Intent r3 = r11.f100447w
            if (r3 == 0) goto L_0x018c
            java.lang.String r8 = "edit_publish_session_end_together"
            boolean r3 = r3.getBooleanExtra(r8, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x018d
        L_0x018c:
            r3 = r1
        L_0x018d:
            java.io.Serializable r3 = (java.io.Serializable) r3
            r12.putExtra(r0, r3)
            java.lang.String r0 = "upload_video_type"
            r12.putExtra(r0, r6)
            java.lang.String r0 = "micro_app_id"
            java.lang.String r3 = r11.f100422E
            r12.putExtra(r0, r3)
            java.lang.String r0 = "micro_app_info"
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r3 = r11.f100421D
            java.io.Serializable r3 = (java.io.Serializable) r3
            r12.putExtra(r0, r3)
            java.lang.String r0 = "av_et_parameter"
            android.content.Intent r3 = r11.f100447w
            if (r3 == 0) goto L_0x01b4
            java.lang.String r6 = "av_et_parameter"
            java.io.Serializable r3 = r3.getSerializableExtra(r6)
            goto L_0x01b5
        L_0x01b4:
            r3 = r1
        L_0x01b5:
            r12.putExtra(r0, r3)
            java.lang.String r0 = "shoot_mode"
            android.content.Intent r3 = r11.f100447w
            r6 = -1
            if (r3 == 0) goto L_0x01ca
            java.lang.String r8 = "shoot_mode"
            int r3 = r3.getIntExtra(r8, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x01cb
        L_0x01ca:
            r3 = r1
        L_0x01cb:
            java.io.Serializable r3 = (java.io.Serializable) r3
            r12.putExtra(r0, r3)
            java.lang.String r0 = "story_mediaType"
            r12.putExtra(r0, r7)
            java.lang.String r0 = "extra_share_context"
            android.content.Intent r3 = r11.f100447w
            if (r3 == 0) goto L_0x01e2
            java.lang.String r8 = "extra_share_context"
            java.io.Serializable r3 = r3.getSerializableExtra(r8)
            goto L_0x01e3
        L_0x01e2:
            r3 = r1
        L_0x01e3:
            r12.putExtra(r0, r3)
            java.lang.String r0 = "extra_share_app_name"
            android.content.Intent r3 = r11.f100447w
            if (r3 == 0) goto L_0x01f3
            java.lang.String r8 = "extra_share_app_name"
            java.lang.String r3 = r3.getStringExtra(r8)
            goto L_0x01f4
        L_0x01f3:
            r3 = r1
        L_0x01f4:
            r12.putExtra(r0, r3)
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r0 = r11.f100438l
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x0209
            java.lang.String r0 = "extra_import_video_info_list"
            java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo> r3 = r11.f100438l
            r12.putParcelableArrayListExtra(r0, r3)
        L_0x0209:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r5 == 0) goto L_0x0240
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = com.bytedance.common.utility.collection.C6307b.m19566a(r3)
            if (r3 != 0) goto L_0x0240
            java.util.Iterator r3 = r5.iterator()
        L_0x021d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0240
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x021d
            java.lang.String r8 = "#"
            r0.append(r8)
            r0.append(r5)
            java.lang.String r5 = " "
            r0.append(r5)
            goto L_0x021d
        L_0x0240:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r11.f100436j
            if (r3 != 0) goto L_0x0249
            java.lang.String r5 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x0249:
            java.util.List r3 = r3.mo97721n()
            java.lang.String r5 = "videoEditViewModel.originVideoList"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x029f
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r11.f100436j
            if (r3 != 0) goto L_0x0264
            java.lang.String r5 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r5)
        L_0x0264:
            java.util.List r3 = r3.mo97721n()
            if (r3 == 0) goto L_0x028b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
            r5 = 0
        L_0x0271:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x028c
            java.lang.Object r8 = r3.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r8 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r8
            java.lang.String r9 = "segment"
            kotlin.jvm.internal.C7573i.m23582a(r8, r9)
            boolean r8 = r8.mo96899a()
            if (r8 == 0) goto L_0x0271
            int r5 = r5 + 1
            goto L_0x0271
        L_0x028b:
            r5 = 0
        L_0x028c:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r3 = r11.f100436j
            if (r3 != 0) goto L_0x0295
            java.lang.String r8 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r8)
        L_0x0295:
            java.util.List r3 = r3.mo97721n()
            int r3 = r3.size()
            int r3 = r3 - r5
            goto L_0x02a1
        L_0x029f:
            r3 = 0
            r5 = 0
        L_0x02a1:
            java.lang.String r8 = "extra_photo_count"
            r12.putExtra(r8, r5)
            java.lang.String r5 = "extra_video_count"
            r12.putExtra(r5, r3)
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r3 = r11.f100421D
            if (r3 == 0) goto L_0x02fa
            java.lang.String r5 = r3.getExtra()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ r7
            if (r5 == 0) goto L_0x02bd
            goto L_0x02be
        L_0x02bd:
            r3 = r1
        L_0x02be:
            if (r3 == 0) goto L_0x02fa
            com.google.gson.e r5 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93239b
            java.lang.String r3 = r3.getExtra()
            java.lang.Class<com.tt.appbrandimpl.d> r8 = com.p1843tt.appbrandimpl.C46580d.class
            java.lang.Object r3 = r5.mo15974a(r3, r8)
            com.tt.appbrandimpl.d r3 = (com.p1843tt.appbrandimpl.C46580d) r3
            if (r3 == 0) goto L_0x02fa
            java.util.List<java.lang.String> r5 = r3.f120064a
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = com.bytedance.common.utility.collection.C6307b.m19566a(r5)
            if (r5 != 0) goto L_0x02fa
            java.util.List<java.lang.String> r3 = r3.f120064a
            java.util.Iterator r3 = r3.iterator()
        L_0x02e0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02fa
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r8 = "#"
            r0.append(r8)
            r0.append(r5)
            java.lang.String r5 = " "
            r0.append(r5)
            goto L_0x02e0
        L_0x02fa:
            java.lang.String r3 = r0.toString()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x030f
            java.lang.String r3 = "video_title"
            java.lang.String r0 = r0.toString()
            r12.putExtra(r3, r0)
        L_0x030f:
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r11.f100436j
            if (r0 != 0) goto L_0x0318
            java.lang.String r3 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0318:
            java.util.List r0 = r0.mo97720m()
            if (r0 == 0) goto L_0x0378
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0327:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0348
            java.lang.Object r5 = r0.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r5 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r5
            java.lang.String r8 = r5.f100773o
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0327
            java.lang.String r5 = r5.f100773o
            r3.append(r5)
            java.lang.String r5 = ","
            r3.append(r5)
            goto L_0x0327
        L_0x0348:
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "sb.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0378
            java.lang.String r3 = "md5"
            int r5 = r0.length()
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0370
            java.lang.String r0 = r0.substring(r4, r5)
            java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            r12.putExtra(r3, r0)
            goto L_0x0378
        L_0x0370:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r0)
            throw r12
        L_0x0378:
            android.content.Intent r0 = r11.f100447w
            com.ss.android.ugc.aweme.tools.extension.Scene r3 = com.p280ss.android.ugc.aweme.tools.extension.Scene.CUT
            com.ss.android.ugc.aweme.tools.extension.Scene r5 = com.p280ss.android.ugc.aweme.tools.extension.Scene.EDIT
            com.p280ss.android.ugc.aweme.tools.extension.C42311e.m134567a(r0, r12, r3, r5)
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel r0 = r11.f100436j
            if (r0 != 0) goto L_0x038a
            java.lang.String r3 = "videoEditViewModel"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x038a:
            java.util.List r0 = r0.mo97720m()
            if (r0 == 0) goto L_0x03ea
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0399:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x03ba
            java.lang.Object r5 = r0.next()
            com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment r5 = (com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment) r5
            java.lang.String r8 = r5.f100772n
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0399
            java.lang.String r5 = r5.f100772n
            r3.append(r5)
            java.lang.String r5 = ";"
            r3.append(r5)
            goto L_0x0399
        L_0x03ba:
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "sb.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x03ea
            java.lang.String r3 = "poi_data_in_tools_line"
            int r5 = r0.length()
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x03e2
            java.lang.String r0 = r0.substring(r4, r5)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            r12.putExtra(r3, r0)
            goto L_0x03ea
        L_0x03e2:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r12.<init>(r0)
            throw r12
        L_0x03ea:
            boolean r0 = r11.mo96683G()
            if (r0 == 0) goto L_0x03fb
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r3 = r11.mo96684H()
            r0.mo97928a(r3)
        L_0x03fb:
            java.lang.String r0 = "extra_edit_preview_info"
            android.os.Parcelable r0 = r12.getParcelableExtra(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = (com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo) r0
            if (r0 == 0) goto L_0x0418
            java.util.List r0 = r0.getVideoList()
            if (r0 == 0) goto L_0x0418
            java.lang.Object r0 = kotlin.collections.C7525m.m23513g(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r0 = (com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r0
            if (r0 == 0) goto L_0x0418
            java.lang.String r0 = r0.getVideoPath()
            goto L_0x0419
        L_0x0418:
            r0 = r1
        L_0x0419:
            if (r0 == 0) goto L_0x0434
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r3 = r11.f100421D
            if (r3 == 0) goto L_0x0425
            java.lang.String r3 = r3.getAppId()
            if (r3 != 0) goto L_0x0427
        L_0x0425:
            java.lang.String r3 = r11.f100422E
        L_0x0427:
            r11.f100422E = r3
            com.ss.android.ugc.aweme.toolsport.IAVMusicService r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93246i
            com.ss.android.ugc.aweme.toolsport.IAVMusicService$b r3 = r3.mo103867e()
            java.lang.String r4 = r11.f100422E
            r3.mo103923a(r0, r2, r4)
        L_0x0434:
            java.lang.String r0 = "extra_stickpoint_mode"
            boolean r2 = r11.mo96683G()
            r12.putExtra(r0, r2)
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.m125103f()
            if (r0 == 0) goto L_0x0454
            java.lang.String r0 = "key_stick_point_data"
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.a r2 = r11.f100433g
            if (r2 == 0) goto L_0x044e
            com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData r2 = r2.mo97403m()
            goto L_0x044f
        L_0x044e:
            r2 = r1
        L_0x044f:
            java.io.Serializable r2 = (java.io.Serializable) r2
            r12.putExtra(r0, r2)
        L_0x0454:
            boolean r0 = r11.f100418A
            if (r0 != 0) goto L_0x049d
            android.content.Intent r0 = r11.f100447w
            if (r0 == 0) goto L_0x0463
            java.lang.String r2 = "enter_from"
            java.lang.String r0 = r0.getStringExtra(r2)
            goto L_0x0464
        L_0x0463:
            r0 = r1
        L_0x0464:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r2 = "from_chat"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0471
            goto L_0x049d
        L_0x0471:
            java.lang.String r0 = "shoot_mode"
            int r0 = r12.getIntExtra(r0, r6)
            boolean r0 = com.p280ss.android.ugc.aweme.story.shootvideo.C42017d.m133561a(r0)
            if (r0 == 0) goto L_0x0493
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            android.support.v4.app.FragmentActivity r1 = r11.requireActivity()
            android.app.Activity r1 = (android.app.Activity) r1
            r0.startStoryEditActivity(r1, r12)
            return
        L_0x0493:
            android.support.v4.app.FragmentActivity r0 = r11.requireActivity()
            android.content.Context r0 = (android.content.Context) r0
            com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m125843a(r0, r12, r7)
            return
        L_0x049d:
            android.content.Intent r0 = r11.f100447w
            if (r0 == 0) goto L_0x04a7
            java.lang.String r1 = "enter_from"
            java.lang.String r1 = r0.getStringExtra(r1)
        L_0x04a7:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = "from_chat"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x04b9
            java.lang.String r0 = "extra_request_code"
            r1 = 4
            r12.putExtra(r0, r1)
        L_0x04b9:
            java.lang.String r0 = "shoot_mode"
            int r0 = r12.getIntExtra(r0, r6)
            boolean r0 = com.p280ss.android.ugc.aweme.story.shootvideo.C42017d.m133561a(r0)
            if (r0 == 0) goto L_0x04db
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVService> r1 = com.p280ss.android.ugc.aweme.services.IAVService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IAVService r0 = (com.p280ss.android.ugc.aweme.services.IAVService) r0
            android.support.v4.app.FragmentActivity r1 = r11.requireActivity()
            android.app.Activity r1 = (android.app.Activity) r1
            r0.startStoryEditActivity(r1, r12)
            return
        L_0x04db:
            android.support.v4.app.FragmentActivity r0 = r11.requireActivity()
            android.app.Activity r0 = (android.app.Activity) r0
            com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m125842a(r0, r12, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment.mo96695d(boolean):void");
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        if (C35563c.f93231M.mo93305a(Property.EnableUploadVideoSlideAutoJust)) {
            m123469a(view);
        }
        mo96773c().setOnClickListener(new C38672u(this));
        mo96677A();
        View findViewById = view.findViewById(R.id.dkg);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.title_menu)");
        this.f100441o = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.o1);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.bottom_menu)");
        this.f100442p = (LinearLayout) findViewById2;
        m123467O();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(mo96696f(), viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(getLayoutRes(), container, false)");
        return inflate;
    }
}
