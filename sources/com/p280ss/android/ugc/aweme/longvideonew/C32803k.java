package com.p280ss.android.ugc.aweme.longvideonew;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29001a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29004c;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29005d;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29013e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29015f;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29016g;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.C29017h;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.VideoSeekBar;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.VideoSeekBar.C28998b;
import com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.VideoSeekBar.C28999c;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32727e;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.k */
public class C32803k implements C28998b, C28999c {

    /* renamed from: u */
    public static final C32804a f85559u = new C32804a(null);

    /* renamed from: a */
    public Aweme f85560a;

    /* renamed from: b */
    public TextView f85561b = ((TextView) this.f85579t.findViewById(R.id.a5k));

    /* renamed from: c */
    public TextView f85562c = ((TextView) this.f85579t.findViewById(R.id.dn5));

    /* renamed from: d */
    public int f85563d;

    /* renamed from: e */
    public boolean f85564e;

    /* renamed from: f */
    public boolean f85565f;

    /* renamed from: g */
    public int f85566g;

    /* renamed from: h */
    public long f85567h;

    /* renamed from: i */
    public C28648x f85568i;

    /* renamed from: j */
    public String f85569j = "";

    /* renamed from: k */
    public int f85570k = -1;

    /* renamed from: l */
    public int f85571l;

    /* renamed from: m */
    public boolean f85572m;

    /* renamed from: n */
    public Aweme f85573n;

    /* renamed from: o */
    public boolean f85574o = true;

    /* renamed from: p */
    public boolean f85575p = true;

    /* renamed from: q */
    public Float f85576q;

    /* renamed from: r */
    public final Runnable f85577r;

    /* renamed from: s */
    public final VideoSeekBar f85578s;

    /* renamed from: t */
    public final LinearLayout f85579t;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.k$a */
    public static final class C32804a {
        private C32804a() {
        }

        public /* synthetic */ C32804a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.k$b */
    static final class C32805b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C32803k f85580a;

        C32805b(C32803k kVar) {
            this.f85580a = kVar;
        }

        public final void run() {
            if (this.f85580a.f85578s.getAlpha() != 0.0f && this.f85580a.f85578s.getVisibility() != 8) {
                C42961az.m136380a(new C29017h(this.f85580a.f85560a));
                this.f85580a.mo84327c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.k$c */
    public static final class C32806c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C32803k f85581a;

        /* renamed from: b */
        final /* synthetic */ ImageView f85582b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            ImageView imageView = this.f85582b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f85581a.f85578s.setThumb(null);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f85581a.f85578s.setAlpha(0.0f);
            this.f85581a.f85578s.setScaleY(1.0f);
            ImageView imageView = this.f85582b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f85582b;
            if (imageView2 != null) {
                imageView2.setScaleX(1.0f);
            }
            ImageView imageView3 = this.f85582b;
            if (imageView3 != null) {
                imageView3.setScaleY(1.0f);
            }
        }

        C32806c(C32803k kVar, ImageView imageView) {
            this.f85581a = kVar;
            this.f85582b = imageView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.k$d */
    public static final class C32807d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C32803k f85583a;

        /* renamed from: b */
        final /* synthetic */ ImageView f85584b;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            ImageView imageView = this.f85584b;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            VideoSeekBar videoSeekBar = this.f85583a.f85578s;
            Context context = this.f85583a.f85578s.getContext();
            C7573i.m23582a((Object) context, "mVideoSeekBar.context");
            videoSeekBar.setThumb(context.getResources().getDrawable(R.drawable.bh8));
            VideoSeekBar videoSeekBar2 = this.f85583a.f85578s;
            Context context2 = this.f85583a.f85578s.getContext();
            C7573i.m23582a((Object) context2, "mVideoSeekBar.context");
            videoSeekBar2.setThumb(context2.getResources().getDrawable(R.drawable.bh8));
            ImageView imageView = this.f85584b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f85584b;
            if (imageView2 != null) {
                imageView2.setScaleX(1.0f);
            }
            ImageView imageView3 = this.f85584b;
            if (imageView3 != null) {
                imageView3.setScaleY(1.0f);
            }
        }

        C32807d(C32803k kVar, ImageView imageView) {
            this.f85583a = kVar;
            this.f85584b = imageView;
        }
    }

    /* renamed from: f */
    private final void m106166f() {
        this.f85578s.postDelayed(this.f85577r, 2000);
    }

    /* renamed from: a */
    private boolean mo74339a() {
        String str;
        String str2;
        if (this.f85560a == null || this.f85573n == null) {
            return false;
        }
        Aweme aweme = this.f85560a;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = this.f85573n;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        if (C7634n.m23717a(str, str2, false)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m106167g() {
        if (this.f85578s.getAlpha() != 0.0f && this.f85578s.getVisibility() != 8) {
            this.f85578s.removeCallbacks(this.f85577r);
            C42961az.m136380a(new C29017h(this.f85560a));
            mo84327c();
        }
    }

    /* renamed from: h */
    private final void m106168h() {
        this.f85579t.setVisibility(0);
        this.f85579t.setAlpha(0.0f);
        ViewPropertyAnimator animate = this.f85579t.animate();
        if (animate != null) {
            ViewPropertyAnimator alpha = animate.alpha(1.0f);
            if (alpha != null) {
                ViewPropertyAnimator duration = alpha.setDuration(200);
                if (duration != null) {
                    duration.start();
                }
            }
        }
    }

    /* renamed from: i */
    private final void m106169i() {
        this.f85579t.setAlpha(1.0f);
        ViewPropertyAnimator animate = this.f85579t.animate();
        if (animate != null) {
            ViewPropertyAnimator alpha = animate.alpha(0.0f);
            if (alpha != null) {
                ViewPropertyAnimator duration = alpha.setDuration(200);
                if (duration != null) {
                    duration.start();
                }
            }
        }
        this.f85579t.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo84328d() {
        if (this.f85578s.getAlpha() != 0.0f && this.f85578s.getVisibility() != 8) {
            this.f85578s.setAlpha(0.0f);
            C42961az.m136380a(new C29017h(this.f85560a));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84326b() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f85560a
            r1 = 0
            if (r0 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.feed.model.VideoControl r0 = r0.getVideoControl()
            if (r0 == 0) goto L_0x000e
            int r0 = r0.draftProgressBar
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r2 = 1
            r3 = 8
            if (r0 != r2) goto L_0x0066
            boolean r0 = r4.mo74339a()
            if (r0 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r4.f85578s
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r4.f85579t
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r4.f85578s
            r2 = 0
            r0.setAlpha(r2)
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r4.f85578s
            r0.setProgress(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f85560a
            if (r0 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x003e
            int r0 = r0.getDuration()
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            int r0 = com.p280ss.android.ugc.aweme.longvideo.p1375b.C32727e.C32728a.m105939b(r0)
            r4.f85563d = r0
            android.widget.TextView r0 = r4.f85562c
            if (r0 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.longvideo.b.e$a r2 = com.p280ss.android.ugc.aweme.longvideo.p1375b.C32727e.f85308a
            int r3 = r4.f85563d
            java.lang.String r2 = r2.mo84203a(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
        L_0x0056:
            android.widget.TextView r0 = r4.f85561b
            if (r0 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.longvideo.b.e$a r2 = com.p280ss.android.ugc.aweme.longvideo.p1375b.C32727e.f85308a
            java.lang.String r1 = r2.mo84203a(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x0065:
            return
        L_0x0066:
            com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar r0 = r4.f85578s
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r4.f85579t
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideonew.C32803k.mo84326b():void");
    }

    /* renamed from: e */
    private final void m106165e() {
        if (this.f85578s.getAlpha() == 1.0f) {
            this.f85578s.removeCallbacks(this.f85577r);
            return;
        }
        this.f85578s.setAlpha(0.15f);
        this.f85578s.setPivotY((float) C23486n.m77122a(7.0d));
        ImageView coverThumbImg = this.f85578s.getCoverThumbImg();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f85578s, "scaleY", new float[]{0.1f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(m… SEEK_BAR_SCALE_HIDE, 1f)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(coverThumbImg, "scaleX", new float[]{0.1f, 1.0f});
        C7573i.m23582a((Object) ofFloat2, "ObjectAnimator.ofFloat(c… SEEK_BAR_SCALE_HIDE, 1f)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(coverThumbImg, "scaleY", new float[]{0.1f, 1.0f});
        C7573i.m23582a((Object) ofFloat3, "ObjectAnimator.ofFloat(c… SEEK_BAR_SCALE_HIDE, 1f)");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f85578s, "alpha", new float[]{0.15f, 1.0f});
        C7573i.m23582a((Object) ofFloat4, "ObjectAnimator.ofFloat(m… SEEK_BAR_ALPHA_HIDE, 1f)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat4, ofFloat2, ofFloat3});
        animatorSet.setDuration(200);
        animatorSet.addListener(new C32807d(this, coverThumbImg));
        animatorSet.start();
    }

    /* renamed from: c */
    public final void mo84327c() {
        this.f85578s.setAlpha(1.0f);
        this.f85578s.setPivotY((float) C23486n.m77122a(7.0d));
        ImageView coverThumbImg = this.f85578s.getCoverThumbImg();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f85578s, "scaleY", new float[]{1.0f, 0.1f});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(m… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(coverThumbImg, "scaleX", new float[]{1.0f, 0.1f});
        C7573i.m23582a((Object) ofFloat2, "ObjectAnimator.ofFloat(c… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(coverThumbImg, "scaleY", new float[]{1.0f, 0.1f});
        C7573i.m23582a((Object) ofFloat3, "ObjectAnimator.ofFloat(c… 1f, SEEK_BAR_SCALE_HIDE)");
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f85578s, "alpha", new float[]{1.0f, 0.15f});
        C7573i.m23582a((Object) ofFloat4, "ObjectAnimator.ofFloat(m… 1f, SEEK_BAR_ALPHA_HIDE)");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat4, ofFloat2, ofFloat3});
        animatorSet.setDuration(200);
        animatorSet.addListener(new C32806c(this, coverThumbImg));
        animatorSet.start();
    }

    public void onPlayerControllerRenderFirstFrameEvent(C29004c cVar) {
        C7573i.m23587b(cVar, "event");
        this.f85573n = cVar.f76397a;
        mo84326b();
    }

    /* renamed from: a */
    public final void mo74322a(SeekBar seekBar) {
        this.f85564e = true;
        if (this.f85566g == 1) {
            C28648x xVar = this.f85568i;
            if (xVar != null) {
                xVar.mo71895aa();
            }
        }
        if (seekBar != null) {
            this.f85571l = seekBar.getProgress();
        }
    }

    public void onFullFeedVideoChangeEvent(C29001a aVar) {
        C7573i.m23587b(aVar, "event");
        this.f85560a = aVar.f76387a;
        String str = aVar.f76388b;
        if (str == null) {
            str = "";
        }
        this.f85569j = str;
        this.f85570k = aVar.f76389c;
        this.f85568i = aVar.f76390d;
        this.f85566g = 0;
        if (!this.f85574o) {
            this.f85575p = false;
        }
    }

    public void onVideoProgressVolumeKeyEvent(C29016g gVar) {
        String str;
        String str2;
        C7573i.m23587b(gVar, "event");
        if (this.f85560a != null && gVar.f76434a != null) {
            Aweme aweme = this.f85560a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = gVar.f76434a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (C7634n.m23717a(str, str2, false) && this.f85574o) {
                m106167g();
            }
        }
    }

    public void onPlayerControllerVideoPlayProgressChange(C29005d dVar) {
        String str;
        String str2;
        C7573i.m23587b(dVar, "event");
        if (this.f85560a != null && dVar.f76402a != null) {
            Aweme aweme = this.f85560a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = dVar.f76402a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (C7634n.m23717a(str, str2, false) && !this.f85564e) {
                if (this.f85567h == 0 || SystemClock.elapsedRealtime() > this.f85567h + 600) {
                    this.f85578s.setProgress(dVar.f76405d);
                    TextView textView = this.f85561b;
                    if (textView != null) {
                        textView.setText(C32727e.f85308a.mo84202a(dVar.f76405d, this.f85563d));
                    }
                }
            }
        }
    }

    public void onPlayerControllerVideoStatusEvent(C29013e eVar) {
        String str;
        String str2;
        C7573i.m23587b(eVar, "event");
        if (this.f85560a != null && eVar.f76427a != null) {
            Aweme aweme = this.f85560a;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            Aweme aweme2 = eVar.f76427a;
            if (aweme2 != null) {
                str2 = aweme2.getAid();
            } else {
                str2 = null;
            }
            if (C7634n.m23717a(str, str2, false)) {
                switch (eVar.f76430d) {
                    case 1:
                        this.f85572m = false;
                        this.f85566g = 1;
                        m106165e();
                        this.f85578s.removeCallbacks(this.f85577r);
                        this.f85578s.setPauseStatus(true);
                        return;
                    case 2:
                        this.f85566g = 2;
                        this.f85578s.setPauseStatus(false);
                        if (this.f85574o) {
                            if (!this.f85572m) {
                                m106167g();
                                break;
                            } else {
                                m106166f();
                                return;
                            }
                        }
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo74321a(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f85578s.removeCallbacks(this.f85577r);
            m106165e();
            m106168h();
            this.f85565f = false;
            this.f85574o = false;
            this.f85576q = Float.valueOf(motionEvent.getRawX());
            return;
        }
        if (num != null && num.intValue() == 2) {
            ImageView coverThumbImg = this.f85578s.getCoverThumbImg();
            if (coverThumbImg != null && coverThumbImg.getVisibility() == 0) {
                ImageView coverThumbImg2 = this.f85578s.getCoverThumbImg();
                if (coverThumbImg2 != null) {
                    coverThumbImg2.setVisibility(8);
                }
                VideoSeekBar videoSeekBar = this.f85578s;
                Context context = this.f85578s.getContext();
                C7573i.m23582a((Object) context, "mVideoSeekBar.context");
                videoSeekBar.setThumb(context.getResources().getDrawable(R.drawable.bh8));
            }
            Float f = this.f85576q;
            if (f != null && Math.abs(f.floatValue() - motionEvent.getRawX()) > 10.0f) {
                this.f85565f = true;
            }
        } else if (num != null && num.intValue() == 1) {
            this.f85574o = true;
        } else if (num != null && num.intValue() == 3) {
            this.f85574o = true;
        }
    }

    /* renamed from: b */
    public void mo74324b(SeekBar seekBar) {
        String str;
        String str2;
        this.f85567h = SystemClock.elapsedRealtime();
        int i = 0;
        this.f85564e = false;
        this.f85572m = true;
        Aweme aweme = null;
        if (this.f85565f || this.f85566g == 1) {
            m106166f();
            this.f85565f = false;
            if (seekBar != null) {
                int progress = seekBar.getProgress();
                if (!this.f85575p) {
                    this.f85575p = true;
                } else {
                    if (!C43316v.m137250H()) {
                        C43316v.m137450K().mo104928a(((float) progress) / 100.0f);
                        double d = (double) progress;
                        Double.isNaN(d);
                        C42961az.m136380a(new C29015f(d / 100.0d, this.f85560a));
                    }
                    if (this.f85571l < progress) {
                        str = "front";
                    } else {
                        str = "back";
                    }
                    if (this.f85566g == 1) {
                        i = 1;
                    }
                    String str3 = "click_progress_bar";
                    C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f85569j).mo59973a("impr_type", C33230ac.m107245t(this.f85560a)).mo59973a("action_type", str).mo59970a("is_pause", i).mo59973a("author_id", C33230ac.m107205a(this.f85560a)).mo59970a("page_type", this.f85570k);
                    String str4 = "group_id";
                    Aweme aweme2 = this.f85560a;
                    if (aweme2 != null) {
                        str2 = aweme2.getAid();
                    } else {
                        str2 = null;
                    }
                    C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
                }
            }
        } else {
            m106167g();
        }
        if (this.f85566g == 1) {
            C28648x xVar = this.f85568i;
            if (xVar != null) {
                C28648x xVar2 = this.f85568i;
                if (xVar2 != null) {
                    aweme = xVar2.mo71904aj();
                }
                xVar.mo73410h(aweme);
            }
        }
        m106169i();
    }

    public C32803k(VideoSeekBar videoSeekBar, LinearLayout linearLayout) {
        C7573i.m23587b(videoSeekBar, "mVideoSeekBar");
        C7573i.m23587b(linearLayout, "mVideoSeekDuration");
        this.f85578s = videoSeekBar;
        this.f85579t = linearLayout;
        this.f85578s.setVisibility(8);
        this.f85579t.setVisibility(8);
        this.f85578s.setOnSeekBarChangeListener(this);
        this.f85578s.setOnDispatchTouchEventListener(this);
        this.f85577r = new C32805b(this);
    }

    /* renamed from: a */
    public final void mo74323a(SeekBar seekBar, int i, boolean z) {
        TextView textView = this.f85561b;
        if (textView != null) {
            textView.setText(C32727e.f85308a.mo84202a(((float) i) / 100.0f, this.f85563d));
        }
    }
}
