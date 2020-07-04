package com.p280ss.android.ugc.aweme.base.p308ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23316d;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23492r;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.base.ui.b */
public final class C23460b extends FrameLayout {

    /* renamed from: a */
    public static final float f61910a = ((float) C23486n.m77122a(90.0d));

    /* renamed from: b */
    public static final float f61911b = ((float) C23486n.m77122a(50.0d));

    /* renamed from: c */
    public static float f61912c;

    /* renamed from: d */
    public static float f61913d;

    /* renamed from: e */
    public static float f61914e;

    /* renamed from: f */
    public static float f61915f;

    /* renamed from: g */
    public static final int f61916g = C23486n.m77122a(2.0d);

    /* renamed from: h */
    public static final C23461a f61917h = new C23461a(null);

    /* renamed from: i */
    private View f61918i;

    /* renamed from: j */
    private FrameLayout f61919j;

    /* renamed from: k */
    private DmtTextView f61920k;

    /* renamed from: l */
    private boolean f61921l;

    /* renamed from: m */
    private Intent f61922m;

    /* renamed from: n */
    private float f61923n;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.b$a */
    public static final class C23461a {
        private C23461a() {
        }

        public /* synthetic */ C23461a(C7571f fVar) {
            this();
        }
    }

    public final Intent getCurrentIntent() {
        return this.f61922m;
    }

    public final boolean getMove() {
        return this.f61921l;
    }

    public final float getVirtualBarHeight() {
        return this.f61923n;
    }

    /* renamed from: a */
    private final void m77036a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.5f});
        C7573i.m23582a((Object) ofFloat, "objectAlphaAnimator");
        ofFloat.setDuration(200);
    }

    public final void setCurrentIntent(Intent intent) {
        this.f61922m = intent;
    }

    public final void setMove(boolean z) {
        this.f61921l = z;
    }

    public final void setVirtualBarHeight(float f) {
        this.f61923n = f;
    }

    /* renamed from: a */
    private final void m77037a(float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "y", new float[]{getY(), f});
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    /* renamed from: a */
    private final void m77038a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.j6, this, true);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…_back_layout, this, true)");
        this.f61918i = inflate;
        View view = this.f61918i;
        if (view == null) {
            C7573i.m23583a("currentRootView");
        }
        View findViewById = view.findViewById(R.id.a6t);
        C7573i.m23582a((Object) findViewById, "currentRootView.findView…id.deeplink_back_content)");
        this.f61919j = (FrameLayout) findViewById;
        FrameLayout frameLayout = this.f61919j;
        if (frameLayout == null) {
            C7573i.m23583a("currentContentView");
        }
        View findViewById2 = frameLayout.findViewById(R.id.a6u);
        C7573i.m23582a((Object) findViewById2, "currentContentView.findV…(R.id.deeplink_back_name)");
        this.f61920k = (DmtTextView) findViewById2;
        Intent intent = this.f61922m;
        DmtTextView dmtTextView = this.f61920k;
        if (dmtTextView == null) {
            C7573i.m23583a("deeplinkBackNameView");
        }
        View view2 = this.f61918i;
        if (view2 == null) {
            C7573i.m23583a("currentRootView");
        }
        C23316d.m76491a(intent, dmtTextView, view2, context);
        C23492r rVar = C23492r.f61970a;
        if (context != null) {
            this.f61923n = rVar.mo61097a((Activity) context);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    private final boolean m77039a(View view) {
        ViewParent parent = getParent();
        if (parent != null) {
            float height = ((float) ((ViewGroup) parent).getHeight()) - this.f61923n;
            view.getLocationOnScreen(new int[2]);
            float y = view.getY();
            float height2 = ((float) view.getHeight()) + y;
            if (f61910a > view.getY()) {
                m77037a(f61910a);
            } else if (height - f61911b < view.getY() + ((float) view.getHeight())) {
                m77037a((height - f61911b) - ((float) view.getHeight()));
            }
            if (f61910a < y || f61911b > height2) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                f61912c = motionEvent.getRawX();
                f61913d = motionEvent.getRawY();
                f61914e = motionEvent.getRawX();
                f61915f = motionEvent.getRawY();
                if (m77040a(this, motionEvent.getRawX(), motionEvent.getRawY())) {
                    m77036a();
                    break;
                } else {
                    return false;
                }
            case 1:
                float abs = Math.abs(Math.abs(motionEvent.getRawX()) - Math.abs(f61912c));
                float abs2 = Math.abs(Math.abs(motionEvent.getRawY()) - Math.abs(f61913d));
                if (((float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)))) < ((float) f61916g)) {
                    callOnClick();
                }
                m77039a((View) this);
                break;
            case 2:
                float rawY = motionEvent.getRawY() - f61915f;
                if (getY() + rawY < 0.0f) {
                    rawY = -getY();
                } else {
                    float y = getY() + rawY + ((float) getHeight()) + this.f61923n;
                    ViewParent parent = getParent();
                    if (parent == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                    } else if (y > ((float) ((ViewGroup) parent).getHeight())) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            rawY = ((((float) ((ViewGroup) parent2).getHeight()) - ((float) getHeight())) - getY()) - this.f61923n;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    }
                }
                setTranslationY(getTranslationY() + ((float) ((int) rawY)));
                f61915f = motionEvent.getRawY();
                break;
        }
        return true;
    }

    public C23460b(Intent intent, Context context) {
        C7573i.m23587b(intent, "intent");
        C7573i.m23587b(context, "context");
        super(context);
        this.f61922m = intent;
        m77038a(context);
    }

    /* renamed from: a */
    private static boolean m77040a(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i;
        int measuredHeight = view.getMeasuredHeight() + i2;
        if (f2 < ((float) i2) || f2 > ((float) measuredHeight) || f < ((float) i) || f > ((float) measuredWidth)) {
            return false;
        }
        return true;
    }
}
