package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout */
public final class VotingStickerLayout extends FrameLayout implements OnClickListener, C39652d {

    /* renamed from: a */
    public VotingStickerView f103051a;

    /* renamed from: b */
    public boolean f103052b;

    /* renamed from: c */
    private FrameLayout f103053c;

    /* renamed from: d */
    private FrameLayout f103054d;

    /* renamed from: e */
    private final C7561a<C7581n> f103055e = new C39635c(this);

    /* renamed from: f */
    private C7562b<? super VotingStickerView, C7581n> f103056f;

    /* renamed from: g */
    private C7562b<? super VotingStickerView, C7581n> f103057g;

    /* renamed from: h */
    private C39641a f103058h;

    /* renamed from: i */
    private C39641a f103059i;

    /* renamed from: j */
    private volatile int f103060j;

    /* renamed from: k */
    private int f103061k;

    /* renamed from: l */
    private boolean f103062l;

    /* renamed from: m */
    private boolean f103063m;

    /* renamed from: n */
    private boolean f103064n;

    /* renamed from: o */
    private PointF f103065o;

    /* renamed from: p */
    private int f103066p;

    /* renamed from: q */
    private int f103067q;

    /* renamed from: r */
    private HashMap f103068r;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$a */
    public static final class C39633a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VotingStickerLayout f103069a;

        C39633a(VotingStickerLayout votingStickerLayout) {
            this.f103069a = votingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            VotingStickerView votingStickerView = this.f103069a.f103051a;
            if (votingStickerView != null) {
                votingStickerView.mo98912b();
            }
            this.f103069a.mo98897d();
            this.f103069a.setVisibility(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$b */
    public static final class C39634b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VotingStickerLayout f103070a;

        C39634b(VotingStickerLayout votingStickerLayout) {
            this.f103070a = votingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            VotingStickerView votingStickerView = this.f103070a.f103051a;
            if (votingStickerView != null) {
                votingStickerView.mo98913c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$c */
    static final class C39635c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ VotingStickerLayout f103071a;

        C39635c(VotingStickerLayout votingStickerLayout) {
            this.f103071a = votingStickerLayout;
            super(0);
        }

        /* renamed from: a */
        private void m126930a() {
            this.f103071a.mo98896c();
        }

        public final /* synthetic */ Object invoke() {
            m126930a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout$d */
    public static final class C39636d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ VotingStickerLayout f103072a;

        C39636d(VotingStickerLayout votingStickerLayout) {
            this.f103072a = votingStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            VotingStickerView votingStickerView = this.f103072a.f103051a;
            if (votingStickerView != null) {
                votingStickerView.mo98913c();
            }
        }
    }

    /* renamed from: b */
    private View m126913b(int i) {
        if (this.f103068r == null) {
            this.f103068r = new HashMap();
        }
        View view = (View) this.f103068r.get(Integer.valueOf(R.id.dwi));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.dwi);
        this.f103068r.put(Integer.valueOf(R.id.dwi), findViewById);
        return findViewById;
    }

    public final C7562b<VotingStickerView, C7581n> getBeforeChangeListener() {
        return this.f103057g;
    }

    public final C7562b<VotingStickerView, C7581n> getOnCompleteListener() {
        return this.f103056f;
    }

    /* renamed from: a */
    public final void mo98890a() {
        this.f103066p = C39654e.f103119b;
        dismiss();
    }

    /* renamed from: f */
    private final void m126915f() {
        OnClickListener onClickListener = this;
        ((TextView) m126913b(R.id.dwi)).setOnClickListener(onClickListener);
        setOnClickListener(onClickListener);
    }

    /* renamed from: k */
    private final void m126920k() {
        this.f103066p = C39654e.f103119b;
        this.f103064n = false;
        if (!this.f103063m) {
            VotingStickerView votingStickerView = this.f103051a;
            if (votingStickerView != null) {
                votingStickerView.setVisibility(0);
                m126909a((View) votingStickerView);
            }
            this.f103063m = true;
        }
    }

    /* renamed from: g */
    private final void m126916g() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        Activity a = C37299a.m119788a(context);
        if (a != null && inputMethodManager != null) {
            Window window = a.getWindow();
            C7573i.m23582a((Object) window, "it.window");
            View decorView = window.getDecorView();
            C7573i.m23582a((Object) decorView, "it.window.decorView");
            inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
        }
    }

    /* renamed from: h */
    private final void m126917h() {
        VotingStickerView votingStickerView = this.f103051a;
        if (votingStickerView != null) {
            this.f103058h.f103085d = (float) ((getWidth() - votingStickerView.getWidth()) / 2);
            this.f103058h.f103086e = (float) (((getHeight() - this.f103060j) - votingStickerView.getHeight()) / 2);
        }
    }

    /* renamed from: l */
    private final void m126921l() {
        VotingStickerView votingStickerView = this.f103051a;
        if (votingStickerView != null) {
            votingStickerView.setScaleX(1.0f);
            votingStickerView.setScaleY(1.0f);
            votingStickerView.setRotation(0.0f);
            votingStickerView.setTranslationX(0.0f);
            votingStickerView.setTranslationY(0.0f);
            this.f103062l = false;
            this.f103061k = 0;
            C39641a aVar = new C39641a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
            this.f103059i = aVar;
        }
    }

    /* renamed from: d */
    public final void mo98897d() {
        VotingStickerView votingStickerView = this.f103051a;
        if (votingStickerView != null) {
            FrameLayout frameLayout = this.f103053c;
            if (frameLayout == null) {
                C7573i.m23583a("container");
            }
            frameLayout.removeView(votingStickerView);
            votingStickerView.setEditEnable(false);
            m126921l();
            C7562b<? super VotingStickerView, C7581n> bVar = this.f103056f;
            if (bVar != null) {
                bVar.invoke(this.f103051a);
            }
            this.f103051a = null;
        }
    }

    public final void dismiss() {
        this.f103063m = false;
        VotingStickerView votingStickerView = this.f103051a;
        if (votingStickerView != null) {
            votingStickerView.setTouchEnable(true);
        }
        if (!this.f103064n) {
            VotingStickerView votingStickerView2 = this.f103051a;
            if (votingStickerView2 != null) {
                m126910a((View) votingStickerView2, (AnimatorListener) new C39633a(this));
                m126916g();
            }
            this.f103064n = true;
        }
    }

    /* renamed from: e */
    private final void m126914e() {
        setBackgroundColor(getResources().getColor(R.color.fp));
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ac8, this, false);
        if (inflate != null) {
            this.f103053c = (FrameLayout) inflate;
            FrameLayout frameLayout = this.f103053c;
            if (frameLayout == null) {
                C7573i.m23583a("container");
            }
            addView(frameLayout);
            m126915f();
            setVisibility(4);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: j */
    private final void m126919j() {
        VotingStickerView votingStickerView = this.f103051a;
        if (votingStickerView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(votingStickerView, "scaleX", new float[]{0.0f, 1.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(votingStickerView, "scaleY", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300);
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.addListener(new C39636d(this));
            animatorSet.start();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.jvm.a.a<kotlin.n>, kotlin.jvm.a.a] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98895b() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0022
            android.widget.FrameLayout r0 = r3.f103054d
            if (r0 != 0) goto L_0x000f
            java.lang.String r1 = "root"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x000f:
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            kotlin.jvm.a.a<kotlin.n> r1 = r3.f103055e
            if (r1 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f r2 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f
            r2.<init>(r1)
            r1 = r2
        L_0x001d:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r0.removeOnGlobalLayoutListener(r1)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.mo98895b():void");
    }

    /* renamed from: c */
    public final void mo98896c() {
        if (this.f103051a != null) {
            Rect rect = new Rect();
            FrameLayout frameLayout = this.f103054d;
            if (frameLayout == null) {
                C7573i.m23583a("root");
            }
            frameLayout.getWindowVisibleDisplayFrame(rect);
            if (this.f103061k != 0 && getHeight() > this.f103061k && (getHeight() <= rect.height() || m126912a(Math.abs(getHeight() - rect.height())))) {
                C7562b<? super VotingStickerView, C7581n> bVar = this.f103057g;
                if (bVar != null) {
                    bVar.invoke(this.f103051a);
                }
            }
            if (getHeight() - rect.height() > C39654e.f103118a) {
                this.f103060j = getHeight() - rect.height();
                m126917h();
                int i = this.f103066p;
                if (i == C39654e.f103121d) {
                    m126920k();
                } else if (i == C39654e.f103120c) {
                    m126918i();
                }
                this.f103061k = rect.height();
            }
        }
    }

    /* renamed from: i */
    private final void m126918i() {
        boolean z;
        this.f103066p = C39654e.f103119b;
        this.f103064n = false;
        if (!this.f103063m) {
            VotingStickerView votingStickerView = this.f103051a;
            if (votingStickerView != null) {
                this.f103059i.f103085d = (float) ((getWidth() - votingStickerView.getWidth()) / 2);
                VoteEditText voteEditText = (VoteEditText) votingStickerView.mo98911b(R.id.agt);
                C7573i.m23582a((Object) voteEditText, "it.et_voting_sticker_title");
                if (String.valueOf(voteEditText.getText()).length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f103059i.f103086e = (((this.f103065o.x - ((float) votingStickerView.getHeight())) / 2.0f) + this.f103065o.y) - (((float) votingStickerView.getHeight()) - C9738o.m28708b(getContext(), 96.0f));
                } else {
                    this.f103059i.f103086e = ((this.f103065o.x - ((float) votingStickerView.getHeight())) / 2.0f) + this.f103065o.y;
                }
                votingStickerView.setX(this.f103058h.f103085d);
                votingStickerView.setY(this.f103058h.f103086e);
                votingStickerView.setVisibility(0);
                requestLayout();
                m126919j();
            }
            this.f103063m = true;
        }
    }

    public final void setBeforeChangeListener(C7562b<? super VotingStickerView, C7581n> bVar) {
        this.f103057g = bVar;
    }

    public final void setMaxLine(int i) {
        this.f103067q = i;
    }

    public final void setOnCompleteListener(C7562b<? super VotingStickerView, C7581n> bVar) {
        this.f103056f = bVar;
    }

    /* renamed from: a */
    private static void m126911a(C39641a aVar) {
        float f = aVar.f103084c % 360.0f;
        if (f < 0.0f) {
            f += 360.0f;
        }
        aVar.f103084c = f;
    }

    /* renamed from: a */
    private static boolean m126912a(int i) {
        if (!C39805en.m127445a()) {
            return false;
        }
        if (i <= C23482j.m77101d() || i <= C23482j.m77103e()) {
            return true;
        }
        return false;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (C7573i.m23585a((Object) view, (Object) this) || C7573i.m23585a((Object) view, (Object) (TextView) m126913b(R.id.dwi))) {
            m126916g();
        }
    }

    /* renamed from: a */
    public final void mo98891a(float f) {
        this.f103059i.f103086e += f;
    }

    public VotingStickerLayout(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        C39641a aVar = new C39641a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f103058h = aVar;
        C39641a aVar2 = new C39641a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f103059i = aVar2;
        this.f103062l = true;
        this.f103065o = new PointF(0.0f, 0.0f);
        this.f103066p = C39654e.f103119b;
        this.f103067q = 3;
        m126914e();
    }

    /* renamed from: a */
    private final void m126909a(View view) {
        float f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f103059i.f103082a, this.f103058h.f103082a});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f103059i.f103083b, this.f103058h.f103083b});
        String str = "rotation";
        float[] fArr = new float[2];
        fArr[0] = this.f103059i.f103084c;
        if (this.f103059i.f103084c > 180.0f) {
            f = 360.0f;
        } else {
            f = this.f103058h.f103084c;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, str, fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", new float[]{this.f103059i.f103085d, this.f103058h.f103085d});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", new float[]{this.f103059i.f103086e, this.f103058h.f103086e});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        animatorSet.addListener(new C39634b(this));
        animatorSet.start();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [kotlin.jvm.a.a<kotlin.n>, kotlin.jvm.a.a] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r1v0, types: [com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98893a(android.app.Activity r3) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r0)
            java.lang.String r0 = "activity.findViewById(android.R.id.content)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r0)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r2.f103054d = r3
            android.widget.FrameLayout r3 = r2.f103054d
            if (r3 != 0) goto L_0x001e
            java.lang.String r0 = "root"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x001e:
            android.view.ViewTreeObserver r3 = r3.getViewTreeObserver()
            kotlin.jvm.a.a<kotlin.n> r0 = r2.f103055e
            if (r0 == 0) goto L_0x002c
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f r1 = new com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.f
            r1.<init>(r0)
            r0 = r1
        L_0x002c:
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r0
            r3.addOnGlobalLayoutListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote.VotingStickerLayout.mo98893a(android.app.Activity):void");
    }

    /* renamed from: a */
    public final void mo98892a(float f, float f2) {
        this.f103065o.x = f;
        this.f103065o.y = f2;
    }

    public VotingStickerLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attr");
        super(context, attributeSet);
        C39641a aVar = new C39641a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f103058h = aVar;
        C39641a aVar2 = new C39641a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f103059i = aVar2;
        this.f103062l = true;
        this.f103065o = new PointF(0.0f, 0.0f);
        this.f103066p = C39654e.f103119b;
        this.f103067q = 3;
        m126914e();
    }

    /* renamed from: a */
    private final void m126910a(View view, AnimatorListener animatorListener) {
        float f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f103058h.f103082a, this.f103059i.f103082a});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f103058h.f103083b, this.f103059i.f103083b});
        String str = "rotation";
        float[] fArr = new float[2];
        if (this.f103059i.f103084c > 180.0f) {
            f = 360.0f;
        } else {
            f = this.f103058h.f103084c;
        }
        fArr[0] = f;
        fArr[1] = this.f103059i.f103084c;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, str, fArr);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "x", new float[]{this.f103058h.f103085d, this.f103059i.f103085d});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view, "y", new float[]{this.f103058h.f103086e, this.f103059i.f103086e});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300);
        animatorSet.addListener(animatorListener);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo98894a(VotingStickerView votingStickerView, C39641a aVar) {
        C7581n nVar;
        C7573i.m23587b(aVar, "animatorInfo");
        setVisibility(0);
        if (votingStickerView != null) {
            this.f103066p = C39654e.f103121d;
            this.f103059i = aVar;
            m126911a(this.f103059i);
            this.f103051a = votingStickerView;
            VotingStickerView votingStickerView2 = this.f103051a;
            if (votingStickerView2 != null) {
                votingStickerView2.setTouchEnable(false);
            }
            ViewParent parent = votingStickerView.getParent();
            if (parent != null) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f103051a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            FrameLayout frameLayout = this.f103053c;
            if (frameLayout == null) {
                C7573i.m23583a("container");
            }
            frameLayout.addView(votingStickerView);
            votingStickerView.setEditEnable(true);
            setVisibility(0);
            VotingStickerView votingStickerView3 = this.f103051a;
            if (votingStickerView3 != null) {
                votingStickerView3.setVisibility(4);
            }
            VotingStickerView votingStickerView4 = this.f103051a;
            if (votingStickerView4 != null) {
                votingStickerView4.mo98909a(this.f103067q);
            }
            VotingStickerView votingStickerView5 = this.f103051a;
            if (votingStickerView5 != null) {
                votingStickerView5.setEditTextFocusable(aVar.f103087f);
                nVar = C7581n.f20898a;
            } else {
                nVar = null;
            }
            if (nVar != null) {
                return;
            }
        }
        this.f103066p = C39654e.f103120c;
        this.f103062l = true;
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        VotingStickerView votingStickerView6 = new VotingStickerView(context);
        votingStickerView6.mo98909a(this.f103067q);
        votingStickerView6.setTouchEnable(false);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        votingStickerView6.setVisibility(4);
        FrameLayout frameLayout2 = this.f103053c;
        if (frameLayout2 == null) {
            C7573i.m23583a("container");
        }
        frameLayout2.addView(votingStickerView6, layoutParams);
        this.f103051a = votingStickerView6;
        votingStickerView6.mo98908a();
    }

    public VotingStickerLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attr");
        super(context, attributeSet, i);
        C39641a aVar = new C39641a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f103058h = aVar;
        C39641a aVar2 = new C39641a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 63, null);
        this.f103059i = aVar2;
        this.f103062l = true;
        this.f103065o = new PointF(0.0f, 0.0f);
        this.f103066p = C39654e.f103119b;
        this.f103067q = 3;
        m126914e();
    }
}
