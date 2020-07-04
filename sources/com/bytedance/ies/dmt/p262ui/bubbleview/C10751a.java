package com.bytedance.ies.dmt.p262ui.bubbleview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.base.C10749d;
import com.bytedance.ies.dmt.p262ui.bubbleview.DmtBubbleLayout.C10750a;
import com.bytedance.ies.dmt.p262ui.p562b.C10743b;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a */
public final class C10751a extends PopupWindow {

    /* renamed from: A */
    private float f28783A = 13.0f;

    /* renamed from: B */
    private int f28784B;

    /* renamed from: C */
    private Typeface f28785C;

    /* renamed from: D */
    private boolean f28786D = true;

    /* renamed from: E */
    private float f28787E = 12.0f;

    /* renamed from: F */
    private int f28788F;

    /* renamed from: G */
    private int f28789G;

    /* renamed from: H */
    private boolean f28790H = true;

    /* renamed from: I */
    private boolean f28791I = true;

    /* renamed from: J */
    private boolean f28792J;

    /* renamed from: K */
    private TextView f28793K;

    /* renamed from: L */
    private boolean f28794L;

    /* renamed from: M */
    private int f28795M;

    /* renamed from: N */
    private Activity f28796N;

    /* renamed from: O */
    private View f28797O;

    /* renamed from: P */
    private C10749d<Point> f28798P;

    /* renamed from: Q */
    private final Runnable f28799Q;

    /* renamed from: a */
    public int f28800a;

    /* renamed from: b */
    public boolean f28801b;

    /* renamed from: c */
    public long f28802c = 200;

    /* renamed from: d */
    public int f28803d;

    /* renamed from: e */
    public DmtBubbleLayout f28804e;

    /* renamed from: f */
    public AnimatorSet f28805f;

    /* renamed from: g */
    public C10753b f28806g;

    /* renamed from: h */
    public C10755d f28807h;

    /* renamed from: i */
    public C10754c f28808i;

    /* renamed from: j */
    private float f28809j;

    /* renamed from: k */
    private float f28810k;

    /* renamed from: l */
    private int f28811l;

    /* renamed from: m */
    private int f28812m;

    /* renamed from: n */
    private boolean f28813n = true;

    /* renamed from: o */
    private boolean f28814o;

    /* renamed from: p */
    private boolean f28815p;

    /* renamed from: q */
    private int f28816q;

    /* renamed from: r */
    private boolean f28817r;

    /* renamed from: s */
    private int f28818s;

    /* renamed from: t */
    private int f28819t;

    /* renamed from: u */
    private long f28820u = DouPlusShareGuideExperiment.MIN_VALID_DURATION;

    /* renamed from: v */
    private boolean f28821v = true;

    /* renamed from: w */
    private int f28822w;

    /* renamed from: x */
    private int f28823x;

    /* renamed from: y */
    private String f28824y = "";

    /* renamed from: z */
    private int f28825z;

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$a */
    public static final class C10752a {

        /* renamed from: A */
        public boolean f28826A = true;

        /* renamed from: B */
        public boolean f28827B;

        /* renamed from: C */
        public int f28828C;

        /* renamed from: D */
        public boolean f28829D = true;

        /* renamed from: E */
        public Activity f28830E;

        /* renamed from: a */
        public int f28831a;

        /* renamed from: b */
        public float f28832b;

        /* renamed from: c */
        public int f28833c;

        /* renamed from: d */
        public int f28834d;

        /* renamed from: e */
        public boolean f28835e = true;

        /* renamed from: f */
        public boolean f28836f;

        /* renamed from: g */
        public boolean f28837g;

        /* renamed from: h */
        public boolean f28838h;

        /* renamed from: i */
        public int f28839i;

        /* renamed from: j */
        public int f28840j;

        /* renamed from: k */
        public long f28841k = 800;

        /* renamed from: l */
        public long f28842l = DouPlusShareGuideExperiment.MIN_VALID_DURATION;

        /* renamed from: m */
        public boolean f28843m = true;

        /* renamed from: n */
        public View f28844n;

        /* renamed from: o */
        public int f28845o;

        /* renamed from: p */
        public int f28846p;

        /* renamed from: q */
        public String f28847q = "";

        /* renamed from: r */
        public int f28848r;

        /* renamed from: s */
        public float f28849s = 13.0f;

        /* renamed from: t */
        public Typeface f28850t;

        /* renamed from: u */
        public int f28851u;

        /* renamed from: v */
        public C10753b f28852v;

        /* renamed from: w */
        public C10754c f28853w;

        /* renamed from: x */
        public C10755d f28854x;

        /* renamed from: y */
        public boolean f28855y = true;

        /* renamed from: z */
        public float f28856z = 12.0f;

        /* renamed from: a */
        public final C10751a mo25737a() {
            return new C10751a(this);
        }

        /* renamed from: a */
        public final C10752a mo25730a(int i) {
            this.f28851u = i;
            return this;
        }

        /* renamed from: b */
        public final C10752a mo25738b(int i) {
            this.f28848r = i;
            return this;
        }

        /* renamed from: c */
        public final C10752a mo25740c(int i) {
            this.f28834d = i;
            return this;
        }

        /* renamed from: d */
        public final C10752a mo25742d(int i) {
            this.f28840j = i;
            return this;
        }

        /* renamed from: a */
        public final C10752a mo25729a(float f) {
            this.f28856z = 8.0f;
            return this;
        }

        /* renamed from: b */
        public final C10752a mo25739b(boolean z) {
            this.f28835e = z;
            return this;
        }

        /* renamed from: c */
        public final C10752a mo25741c(boolean z) {
            this.f28843m = false;
            return this;
        }

        /* renamed from: a */
        public final C10752a mo25731a(long j) {
            this.f28842l = j;
            return this;
        }

        /* renamed from: a */
        public final C10752a mo25732a(View view) {
            C7573i.m23587b(view, "view");
            this.f28844n = view;
            return this;
        }

        public C10752a(Activity activity) {
            C7573i.m23587b(activity, "activity");
            this.f28830E = activity;
        }

        /* renamed from: a */
        public final C10752a mo25733a(C10753b bVar) {
            C7573i.m23587b(bVar, "listener");
            this.f28852v = bVar;
            return this;
        }

        /* renamed from: a */
        public final C10752a mo25734a(C10755d dVar) {
            C7573i.m23587b(dVar, "listener");
            this.f28854x = dVar;
            return this;
        }

        /* renamed from: a */
        public final C10752a mo25735a(String str) {
            C7573i.m23587b(str, "str");
            this.f28847q = str;
            return this;
        }

        /* renamed from: a */
        public final C10752a mo25736a(boolean z) {
            this.f28826A = z;
            return this;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$b */
    public interface C10753b {
        /* renamed from: a */
        void mo25743a();
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$c */
    public interface C10754c {
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$d */
    public interface C10755d {
        /* renamed from: a */
        void mo25744a();
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$e */
    static final class C10756e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10751a f28857a;

        /* renamed from: b */
        final /* synthetic */ DmtBubbleLayout f28858b;

        /* renamed from: c */
        final /* synthetic */ boolean f28859c;

        C10756e(C10751a aVar, DmtBubbleLayout dmtBubbleLayout, boolean z) {
            this.f28857a = aVar;
            this.f28858b = dmtBubbleLayout;
            this.f28859c = z;
        }

        public final void run() {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            if (this.f28857a.f28805f != null) {
                int i3 = this.f28857a.f28800a;
                if (i3 == 3) {
                    i2 = (int) (this.f28858b.getX() + ((float) this.f28858b.getMeasuredWidth()));
                    i = (int) (this.f28858b.getY() + C10751a.m31348a(this.f28857a).getBubbleOffset());
                } else if (i3 == 5) {
                    i2 = (int) this.f28858b.getX();
                    i = (int) (this.f28858b.getY() + C10751a.m31348a(this.f28857a).getBubbleOffset());
                } else if (i3 == 48) {
                    i2 = (int) (this.f28858b.getX() + C10751a.m31348a(this.f28857a).getBubbleOffset());
                    i = (int) (this.f28858b.getY() + ((float) this.f28858b.getMeasuredHeight()));
                } else if (i3 != 80) {
                    i2 = 0;
                    i = 0;
                } else {
                    i2 = (int) (this.f28858b.getX() + C10751a.m31348a(this.f28857a).getBubbleOffset());
                    i = (int) this.f28858b.getY();
                }
                this.f28858b.setPivotY((float) i);
                this.f28858b.setPivotX((float) i2);
                DmtBubbleLayout dmtBubbleLayout = this.f28858b;
                String str = "scaleX";
                float[] fArr = new float[2];
                if (this.f28859c) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                fArr[0] = f;
                if (this.f28859c) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                fArr[1] = f2;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dmtBubbleLayout, str, fArr);
                C7573i.m23582a((Object) ofFloat, "scaleX");
                ofFloat.setDuration(200);
                DmtBubbleLayout dmtBubbleLayout2 = this.f28858b;
                String str2 = "scaleY";
                float[] fArr2 = new float[2];
                if (this.f28859c) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                fArr2[0] = f3;
                if (this.f28859c) {
                    f4 = 1.0f;
                } else {
                    f4 = 0.0f;
                }
                fArr2[1] = f4;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dmtBubbleLayout2, str2, fArr2);
                C7573i.m23582a((Object) ofFloat2, "scaleY");
                ofFloat2.setDuration(200);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f28858b, "translationY", new float[]{0.0f});
                C7573i.m23582a((Object) ofFloat3, "translationDownAnimL");
                if (this.f28859c) {
                    j = 500;
                } else {
                    j = 200;
                }
                ofFloat3.setDuration(j);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f28858b, "translationY", new float[]{0.0f});
                C7573i.m23582a((Object) ofFloat4, "translationUpAnimL");
                if (this.f28859c) {
                    j2 = 500;
                } else {
                    j2 = 200;
                }
                ofFloat4.setDuration(j2);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f28858b, "translationX", new float[]{0.0f});
                C7573i.m23582a((Object) ofFloat5, "translationLeftAnimL");
                if (this.f28859c) {
                    j3 = 500;
                } else {
                    j3 = 200;
                }
                ofFloat5.setDuration(j3);
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f28858b, "translationX", new float[]{0.0f});
                C7573i.m23582a((Object) ofFloat6, "translationRightAnimL");
                if (this.f28859c) {
                    j4 = 500;
                } else {
                    j4 = 200;
                }
                ofFloat6.setDuration(j4);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f28858b, "translationY", new float[]{0.0f, 10.0f});
                C7573i.m23582a((Object) ofFloat7, "translationDownAnimS");
                if (this.f28859c) {
                    j5 = 200;
                } else {
                    j5 = 150;
                }
                ofFloat7.setDuration(j5);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f28858b, "translationY", new float[]{0.0f, -10.0f});
                C7573i.m23582a((Object) ofFloat8, "translationUpAnimS");
                if (this.f28859c) {
                    j6 = 200;
                } else {
                    j6 = 150;
                }
                ofFloat8.setDuration(j6);
                ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f28858b, "translationX", new float[]{0.0f, -10.0f});
                C7573i.m23582a((Object) ofFloat9, "translationLeftAnimS");
                if (this.f28859c) {
                    j7 = 200;
                } else {
                    j7 = 150;
                }
                ofFloat9.setDuration(j7);
                ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this.f28858b, "translationX", new float[]{0.0f, 10.0f});
                C7573i.m23582a((Object) ofFloat10, "translationRightAnimS");
                if (this.f28859c) {
                    j8 = 200;
                } else {
                    j8 = 150;
                }
                ofFloat10.setDuration(j8);
                this.f28858b.setVisibility(0);
                if (this.f28859c) {
                    int i4 = this.f28857a.f28800a;
                    if (i4 == 3) {
                        ofFloat9.setInterpolator(new C10744c());
                        ofFloat6.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet = this.f28857a.f28805f;
                        if (animatorSet != null) {
                            Builder play = animatorSet.play(ofFloat);
                            if (play != null) {
                                Builder with = play.with(ofFloat2);
                                if (with != null) {
                                    Builder with2 = with.with(ofFloat9);
                                    if (with2 != null) {
                                        with2.before(ofFloat6);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 5) {
                        ofFloat10.setInterpolator(new C10744c());
                        ofFloat5.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet2 = this.f28857a.f28805f;
                        if (animatorSet2 != null) {
                            Builder play2 = animatorSet2.play(ofFloat);
                            if (play2 != null) {
                                Builder with3 = play2.with(ofFloat2);
                                if (with3 != null) {
                                    Builder with4 = with3.with(ofFloat10);
                                    if (with4 != null) {
                                        with4.before(ofFloat5);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 48) {
                        ofFloat8.setInterpolator(new C10744c());
                        ofFloat3.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet3 = this.f28857a.f28805f;
                        if (animatorSet3 != null) {
                            Builder play3 = animatorSet3.play(ofFloat);
                            if (play3 != null) {
                                Builder with5 = play3.with(ofFloat2);
                                if (with5 != null) {
                                    Builder with6 = with5.with(ofFloat8);
                                    if (with6 != null) {
                                        with6.before(ofFloat3);
                                    }
                                }
                            }
                        }
                    } else if (i4 == 80) {
                        ofFloat7.setInterpolator(new C10744c());
                        ofFloat4.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet4 = this.f28857a.f28805f;
                        if (animatorSet4 != null) {
                            Builder play4 = animatorSet4.play(ofFloat);
                            if (play4 != null) {
                                Builder with7 = play4.with(ofFloat2);
                                if (with7 != null) {
                                    Builder with8 = with7.with(ofFloat7);
                                    if (with8 != null) {
                                        with8.before(ofFloat4);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int i5 = this.f28857a.f28800a;
                    if (i5 == 3) {
                        ofFloat6.setInterpolator(new C10743b());
                        ofFloat9.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet5 = this.f28857a.f28805f;
                        if (animatorSet5 != null) {
                            Builder play5 = animatorSet5.play(ofFloat);
                            if (play5 != null) {
                                Builder with9 = play5.with(ofFloat2);
                                if (with9 != null) {
                                    Builder with10 = with9.with(ofFloat6);
                                    if (with10 != null) {
                                        with10.after(ofFloat9);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 5) {
                        ofFloat5.setInterpolator(new C10743b());
                        ofFloat10.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet6 = this.f28857a.f28805f;
                        if (animatorSet6 != null) {
                            Builder play6 = animatorSet6.play(ofFloat);
                            if (play6 != null) {
                                Builder with11 = play6.with(ofFloat2);
                                if (with11 != null) {
                                    Builder with12 = with11.with(ofFloat5);
                                    if (with12 != null) {
                                        with12.after(ofFloat10);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 48) {
                        ofFloat3.setInterpolator(new C10743b());
                        ofFloat8.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet7 = this.f28857a.f28805f;
                        if (animatorSet7 != null) {
                            Builder play7 = animatorSet7.play(ofFloat);
                            if (play7 != null) {
                                Builder with13 = play7.with(ofFloat2);
                                if (with13 != null) {
                                    Builder with14 = with13.with(ofFloat3);
                                    if (with14 != null) {
                                        with14.after(ofFloat8);
                                    }
                                }
                            }
                        }
                    } else if (i5 == 80) {
                        ofFloat4.setInterpolator(new C10743b());
                        ofFloat7.setInterpolator(new AccelerateDecelerateInterpolator());
                        AnimatorSet animatorSet8 = this.f28857a.f28805f;
                        if (animatorSet8 != null) {
                            Builder play8 = animatorSet8.play(ofFloat);
                            if (play8 != null) {
                                Builder with15 = play8.with(ofFloat2);
                                if (with15 != null) {
                                    Builder with16 = with15.with(ofFloat4);
                                    if (with16 != null) {
                                        with16.after(ofFloat7);
                                    }
                                }
                            }
                        }
                    }
                }
                AnimatorSet animatorSet9 = this.f28857a.f28805f;
                if (animatorSet9 != null) {
                    animatorSet9.addListener(new AnimatorListenerAdapter(this) {

                        /* renamed from: a */
                        final /* synthetic */ C10756e f28860a;

                        {
                            this.f28860a = r1;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            C7573i.m23587b(animator, "animation");
                            super.onAnimationEnd(animator);
                            if (!this.f28860a.f28859c) {
                                this.f28860a.f28858b.setVisibility(8);
                                this.f28860a.f28857a.mo25722b();
                            }
                        }

                        public final void onAnimationStart(Animator animator) {
                            C7573i.m23587b(animator, "animation");
                            super.onAnimationStart(animator);
                            if (this.f28860a.f28859c) {
                                C10755d dVar = this.f28860a.f28857a.f28807h;
                                if (dVar != null) {
                                    dVar.mo25744a();
                                }
                                this.f28860a.f28858b.setVisibility(0);
                            }
                        }
                    });
                }
                if (this.f28857a.f28801b) {
                    AnimatorSet animatorSet10 = this.f28857a.f28805f;
                    if (animatorSet10 != null) {
                        animatorSet10.setInterpolator(new OvershootInterpolator(1.0f));
                    }
                }
                AnimatorSet animatorSet11 = this.f28857a.f28805f;
                if (animatorSet11 != null) {
                    animatorSet11.start();
                }
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$f */
    static final class C10758f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10751a f28861a;

        C10758f(C10751a aVar) {
            this.f28861a = aVar;
        }

        public final void run() {
            this.f28861a.mo25721a(false, this.f28861a.f28800a);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.bubbleview.a$g */
    static final class C10759g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10751a f28862a;

        C10759g(C10751a aVar) {
            this.f28862a = aVar;
        }

        public final void onClick(View view) {
            C10753b bVar = this.f28862a.f28806g;
            if (bVar != null) {
                bVar.mo25743a();
            }
            this.f28862a.dismiss();
        }
    }

    /* renamed from: a */
    private static int m31347a(int i) {
        if (i == 3) {
            return 2;
        }
        if (i != 5) {
            if (i == 48) {
                return 3;
            }
            if (i == 80) {
                return 0;
            }
        }
        return 1;
    }

    /* renamed from: c */
    public final int mo25723c() {
        mo25716a();
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        return contentView.getMeasuredHeight();
    }

    /* renamed from: d */
    public final int mo25724d() {
        mo25716a();
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        return contentView.getMeasuredWidth();
    }

    public final void dismiss() {
        if (!this.f28794L) {
            mo25721a(false, this.f28800a);
            getContentView().removeCallbacks(this.f28799Q);
            this.f28818s = 0;
            this.f28819t = 0;
        }
    }

    /* renamed from: i */
    private final void m31354i() {
        if (this.f28817r) {
            if (VERSION.SDK_INT < 19) {
                View contentView = getContentView();
                C7573i.m23582a((Object) contentView, "contentView");
                contentView.setSystemUiVisibility(8);
                return;
            }
            if (VERSION.SDK_INT >= 19) {
                View contentView2 = getContentView();
                C7573i.m23582a((Object) contentView2, "contentView");
                contentView2.setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
            }
        }
    }

    /* renamed from: a */
    public final void mo25716a() {
        if (this.f28822w == 0 || this.f28823x == 0) {
            getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f28822w, 1073741824), MeasureSpec.makeMeasureSpec(this.f28823x, 1073741824));
    }

    /* renamed from: b */
    public final void mo25722b() {
        AnimatorSet animatorSet = this.f28805f;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f28805f;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f28805f = null;
        if (!this.f28796N.isFinishing() && isShowing()) {
            try {
                C10760b.m31382a(this);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public final int mo25726e() {
        mo25716a();
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        int measuredWidth = contentView.getMeasuredWidth();
        DmtBubbleLayout dmtBubbleLayout = this.f28804e;
        if (dmtBubbleLayout == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        return measuredWidth - (dmtBubbleLayout.getPADDING() * 4);
    }

    /* renamed from: f */
    public final void mo25727f() {
        if (!this.f28794L) {
            DmtBubbleLayout dmtBubbleLayout = this.f28804e;
            if (dmtBubbleLayout == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            dmtBubbleLayout.setVisibility(8);
            mo25722b();
            getContentView().removeCallbacks(this.f28799Q);
            this.f28818s = 0;
            this.f28819t = 0;
        }
    }

    /* renamed from: g */
    private final void m31352g() {
        if (!(this.f28822w == 0 || this.f28823x == 0)) {
            setWidth(this.f28822w);
            setHeight(this.f28823x);
            C10750a.m31345a(getWidth());
            C10750a.m31346b(getHeight());
        }
        if (this.f28817r) {
            m31354i();
        }
        if (this.f28811l != 0) {
            DmtBubbleLayout dmtBubbleLayout = this.f28804e;
            if (dmtBubbleLayout == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            dmtBubbleLayout.setMBgColor(this.f28811l);
        }
        if (this.f28812m != 0) {
            DmtBubbleLayout dmtBubbleLayout2 = this.f28804e;
            if (dmtBubbleLayout2 == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            dmtBubbleLayout2.setMBorderColor(this.f28812m);
        }
        if (!this.f28791I) {
            DmtBubbleLayout dmtBubbleLayout3 = this.f28804e;
            if (dmtBubbleLayout3 == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            dmtBubbleLayout3.setNeedAddColor(false);
        }
        DmtBubbleLayout dmtBubbleLayout4 = this.f28804e;
        if (dmtBubbleLayout4 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout4.setMNeedPath(this.f28813n);
        DmtBubbleLayout dmtBubbleLayout5 = this.f28804e;
        if (dmtBubbleLayout5 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout5.setBubbleOrientation(m31347a(this.f28800a));
        if (this.f28787E != 0.0f) {
            DmtBubbleLayout dmtBubbleLayout6 = this.f28804e;
            if (dmtBubbleLayout6 == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            dmtBubbleLayout6.setMPadding(this.f28787E);
        }
    }

    /* renamed from: h */
    private final void m31353h() {
        this.f28793K = new DmtTextView(this.f28796N);
        if (this.f28784B != 0) {
            TextView textView = this.f28793K;
            if (textView == null) {
                C7573i.m23583a("mTextView");
            }
            textView.setTextColor(this.f28784B);
        } else {
            TextView textView2 = this.f28793K;
            if (textView2 == null) {
                C7573i.m23583a("mTextView");
            }
            textView2.setTextColor(this.f28796N.getResources().getColor(R.color.aus));
        }
        TextView textView3 = this.f28793K;
        if (textView3 == null) {
            C7573i.m23583a("mTextView");
        }
        textView3.setTextSize(1, 13.0f);
        if (VERSION.SDK_INT >= 17) {
            TextView textView4 = this.f28793K;
            if (textView4 == null) {
                C7573i.m23583a("mTextView");
            }
            textView4.setTextAlignment(5);
        }
        TextView textView5 = this.f28793K;
        if (textView5 == null) {
            C7573i.m23583a("mTextView");
        }
        textView5.setLayoutParams(new LayoutParams(-2, -2));
        TextView textView6 = this.f28793K;
        if (textView6 == null) {
            C7573i.m23583a("mTextView");
        }
        textView6.setGravity(17);
        TextView textView7 = this.f28793K;
        if (textView7 == null) {
            C7573i.m23583a("mTextView");
        }
        textView7.setMaxWidth((int) C9738o.m28708b((Context) this.f28796N, 197.0f));
        TextView textView8 = this.f28793K;
        if (textView8 == null) {
            C7573i.m23583a("mTextView");
        }
        textView8.setMaxLines(2);
        TextView textView9 = this.f28793K;
        if (textView9 == null) {
            C7573i.m23583a("mTextView");
        }
        m31349a((View) textView9);
        this.f28817r = true;
        if (!TextUtils.isEmpty(this.f28824y)) {
            TextView textView10 = this.f28793K;
            if (textView10 == null) {
                C7573i.m23583a("mTextView");
            }
            textView10.setText(this.f28824y);
        }
        if (this.f28825z != 0) {
            TextView textView11 = this.f28793K;
            if (textView11 == null) {
                C7573i.m23583a("mTextView");
            }
            textView11.setText(this.f28825z);
        }
        if (this.f28783A != 0.0f) {
            TextView textView12 = this.f28793K;
            if (textView12 == null) {
                C7573i.m23583a("mTextView");
            }
            textView12.setTextSize(1, this.f28783A);
        }
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo25720a(C10749d<Point> dVar) {
        C7573i.m23587b(dVar, "locationSupplier");
        this.f28798P = dVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtBubbleLayout m31348a(C10751a aVar) {
        DmtBubbleLayout dmtBubbleLayout = aVar.f28804e;
        if (dmtBubbleLayout == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        return dmtBubbleLayout;
    }

    public C10751a(C10752a aVar) {
        C7573i.m23587b(aVar, "builder");
        this.f28796N = aVar.f28830E;
        this.f28800a = aVar.f28831a;
        this.f28810k = aVar.f28832b;
        this.f28811l = aVar.f28833c;
        this.f28812m = aVar.f28834d;
        this.f28813n = aVar.f28835e;
        this.f28814o = aVar.f28836f;
        this.f28801b = aVar.f28837g;
        this.f28817r = aVar.f28838h;
        this.f28818s = aVar.f28839i;
        this.f28819t = aVar.f28840j;
        this.f28802c = aVar.f28841k;
        this.f28820u = aVar.f28842l;
        this.f28821v = aVar.f28843m;
        this.f28797O = aVar.f28844n;
        this.f28823x = aVar.f28846p;
        this.f28822w = aVar.f28845o;
        this.f28824y = aVar.f28847q;
        this.f28825z = aVar.f28848r;
        this.f28783A = aVar.f28849s;
        this.f28784B = aVar.f28851u;
        this.f28785C = aVar.f28850t;
        this.f28806g = aVar.f28852v;
        this.f28808i = aVar.f28853w;
        this.f28807h = aVar.f28854x;
        this.f28786D = aVar.f28855y;
        this.f28787E = aVar.f28856z;
        this.f28790H = aVar.f28826A;
        this.f28815p = aVar.f28827B;
        this.f28816q = aVar.f28828C;
        this.f28791I = aVar.f28829D;
        this.f28803d = (int) C9738o.m28708b((Context) this.f28796N, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(this.f28790H);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (this.f28821v || this.f28797O == null) {
            m31353h();
        } else {
            m31349a(this.f28797O);
            DmtBubbleLayout dmtBubbleLayout = this.f28804e;
            if (dmtBubbleLayout == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            dmtBubbleLayout.setUseDefaultView(false);
        }
        m31352g();
        this.f28799Q = new C10758f(this);
    }

    /* renamed from: a */
    private final void m31349a(View view) {
        this.f28804e = new DmtBubbleLayout(this.f28796N);
        DmtBubbleLayout dmtBubbleLayout = this.f28804e;
        if (dmtBubbleLayout == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout.setBackgroundColor(0);
        DmtBubbleLayout dmtBubbleLayout2 = this.f28804e;
        if (dmtBubbleLayout2 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout2.addView(view);
        DmtBubbleLayout dmtBubbleLayout3 = this.f28804e;
        if (dmtBubbleLayout3 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout3.setGravity(17);
        MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-2, -2);
        DmtBubbleLayout dmtBubbleLayout4 = this.f28804e;
        if (dmtBubbleLayout4 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout4.setLayoutParams(marginLayoutParams);
        DmtBubbleLayout dmtBubbleLayout5 = this.f28804e;
        if (dmtBubbleLayout5 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout5.setVisibility(8);
        if (this.f28811l != 0) {
            DmtBubbleLayout dmtBubbleLayout6 = this.f28804e;
            if (dmtBubbleLayout6 == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            dmtBubbleLayout6.setMBgColor(this.f28811l);
        }
        DmtBubbleLayout dmtBubbleLayout7 = this.f28804e;
        if (dmtBubbleLayout7 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout7.setMNeedPath(this.f28813n);
        DmtBubbleLayout dmtBubbleLayout8 = this.f28804e;
        if (dmtBubbleLayout8 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout8.setMNeedArrow(this.f28786D);
        DmtBubbleLayout dmtBubbleLayout9 = this.f28804e;
        if (dmtBubbleLayout9 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout9.setMNeedPressFade(this.f28814o);
        DmtBubbleLayout dmtBubbleLayout10 = this.f28804e;
        if (dmtBubbleLayout10 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout10.setMNeedShadow(this.f28815p);
        DmtBubbleLayout dmtBubbleLayout11 = this.f28804e;
        if (dmtBubbleLayout11 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout11.setMShadowColor(this.f28816q);
        DmtBubbleLayout dmtBubbleLayout12 = this.f28804e;
        if (dmtBubbleLayout12 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        dmtBubbleLayout12.setOnClickListener(new C10759g(this));
        DmtBubbleLayout dmtBubbleLayout13 = this.f28804e;
        if (dmtBubbleLayout13 == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        setContentView(dmtBubbleLayout13);
        getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo25721a(boolean z, int i) {
        DmtBubbleLayout dmtBubbleLayout = this.f28804e;
        if (dmtBubbleLayout == null) {
            C7573i.m23583a("mDmtBubbleLayout");
        }
        if (!z) {
            this.f28794L = true;
        }
        this.f28805f = new AnimatorSet();
        if (dmtBubbleLayout != null) {
            dmtBubbleLayout.post(new C10756e(this, dmtBubbleLayout, z));
        }
    }

    /* renamed from: b */
    private final void m31351b(View view, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        Point point;
        int[] iArr = new int[2];
        int i5 = 0;
        if (this.f28798P == null || VERSION.SDK_INT < 24) {
            view.getLocationOnScreen(iArr);
        } else {
            C10749d<Point> dVar = this.f28798P;
            if (dVar != null) {
                point = (Point) dVar.mo25669a();
            } else {
                point = null;
            }
            if (point == null) {
                C7573i.m23580a();
            }
            iArr[0] = point.x;
            iArr[1] = point.y;
        }
        if (i == 3) {
            if (z) {
                i2 = (view.getMeasuredHeight() - mo25723c()) / 2;
            } else {
                i2 = 0;
            }
            showAtLocation(view, 0, (iArr[0] + this.f28818s) - mo25724d(), iArr[1] + this.f28819t + i2 + ((int) C9738o.m28708b((Context) this.f28796N, 1.3f)));
        } else if (i == 5) {
            if (z) {
                i3 = (view.getMeasuredHeight() - mo25723c()) / 2;
            } else {
                i3 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f28818s + view.getWidth(), iArr[1] + this.f28819t + i3 + ((int) C9738o.m28708b((Context) this.f28796N, 1.3f)));
        } else if (i == 48) {
            if (z) {
                i4 = (view.getMeasuredWidth() - mo25724d()) / 2;
            } else {
                i4 = 0;
            }
            showAtLocation(view, 0, iArr[0] + this.f28818s + i4 + ((int) C9738o.m28708b((Context) this.f28796N, 1.4f)), (iArr[1] - mo25723c()) + this.f28819t + ((int) C9738o.m28708b((Context) this.f28796N, 1.3f)));
        } else if (i == 80) {
            if (z) {
                i5 = (view.getMeasuredWidth() - mo25724d()) / 2;
            }
            showAsDropDown(view, this.f28818s + i5 + ((int) C9738o.m28708b((Context) this.f28796N, 1.4f)), this.f28819t + ((int) C9738o.m28708b((Context) this.f28796N, 1.3f)));
            mo25721a(true, i);
        }
    }

    /* renamed from: a */
    public final void mo25719a(View view, int i, boolean z) {
        if (!this.f28796N.isFinishing() && view != null && view.getWindowToken() != null) {
            this.f28788F = view.getMeasuredHeight();
            this.f28789G = view.getMeasuredWidth();
            getContentView().removeCallbacks(this.f28799Q);
            this.f28800a = i;
            DmtBubbleLayout dmtBubbleLayout = this.f28804e;
            if (dmtBubbleLayout == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            this.f28795M = dmtBubbleLayout.getPADDING();
            if (!isShowing()) {
                int a = m31347a(i);
                if (this.f28822w == 0 || this.f28823x == 0) {
                    getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                } else {
                    getContentView().measure(MeasureSpec.makeMeasureSpec(this.f28822w, 1073741824), MeasureSpec.makeMeasureSpec(this.f28823x, 1073741824));
                }
                if (z) {
                    if (i == 80 || i == 48) {
                        this.f28809j = ((float) mo25724d()) / 2.0f;
                    } else {
                        this.f28809j = ((float) mo25723c()) / 2.0f;
                    }
                } else if (!this.f28792J) {
                    this.f28810k += (float) (this.f28795M * 8);
                    this.f28792J = true;
                }
                DmtBubbleLayout dmtBubbleLayout2 = this.f28804e;
                if (dmtBubbleLayout2 == null) {
                    C7573i.m23583a("mDmtBubbleLayout");
                }
                dmtBubbleLayout2.mo25670a(a, this.f28809j + this.f28810k);
                m31351b(view, i, z);
                this.f28794L = false;
                if (this.f28820u > 0) {
                    getContentView().postDelayed(this.f28799Q, this.f28820u);
                }
            } else {
                C10760b.m31382a(this);
            }
        }
    }

    public final void showAtLocation(View view, int i, int i2, int i3) {
        C7573i.m23587b(view, "parent");
        try {
            super.showAtLocation(view, i, i2, i3);
            mo25721a(true, i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo25717a(View view, int i, float f, int i2) {
        if (i == 80 || i == 48) {
            this.f28818s = i2;
        }
        this.f28809j = f;
        mo25719a(view, i, false);
    }

    /* renamed from: a */
    public final void mo25718a(View view, int i, int i2, int i3, float f) {
        C7573i.m23587b(view, "parent");
        try {
            this.f28800a = i;
            this.f28810k = f;
            DmtBubbleLayout dmtBubbleLayout = this.f28804e;
            if (dmtBubbleLayout == null) {
                C7573i.m23583a("mDmtBubbleLayout");
            }
            dmtBubbleLayout.mo25670a(m31347a(i), this.f28809j + this.f28810k);
            showAtLocation(view, 0, i2, i3);
            if (this.f28820u > 0) {
                getContentView().postDelayed(this.f28799Q, this.f28820u);
            }
        } catch (Exception unused) {
        }
    }
}
