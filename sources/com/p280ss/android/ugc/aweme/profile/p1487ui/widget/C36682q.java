package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.app.Activity;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.p1878b.C47891a;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.q */
public final class C36682q extends PopupWindow {

    /* renamed from: a */
    private final Runnable f96303a = new C36683a(this);

    /* renamed from: b */
    private final Activity f96304b;

    /* renamed from: c */
    private ImageView f96305c;

    /* renamed from: d */
    private final int f96306d;

    /* renamed from: e */
    private final int f96307e;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.q$a */
    static final class C36683a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C36682q f96308a;

        C36683a(C36682q qVar) {
            this.f96308a = qVar;
        }

        public final void run() {
            this.f96308a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.q$b */
    public static final class C36684b implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C36682q f96309a;

        /* renamed from: b */
        final /* synthetic */ View f96310b;

        public final void onGlobalLayout() {
            this.f96310b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f96309a.mo93021b(this.f96310b);
        }

        C36684b(C36682q qVar, View view) {
            this.f96309a = qVar;
            this.f96310b = view;
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f96303a);
    }

    /* renamed from: a */
    private void m118326a() {
        getContentView().removeCallbacks(this.f96303a);
        getContentView().postDelayed(this.f96303a, 6000);
    }

    public final void dismiss() {
        if (isShowing() && this.f96304b != null && !this.f96304b.isFinishing() && !this.f96304b.isDestroyed()) {
            try {
                C36685r.m118331a(this);
            } catch (IllegalArgumentException unused) {
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: a */
    private final void m118327a(int i) {
        LayoutParams layoutParams = this.f96305c.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (!C43127fh.m136806a(this.f96304b)) {
                marginLayoutParams.leftMargin = i;
            } else {
                marginLayoutParams.rightMargin = i;
            }
            this.f96305c.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C36682q(Activity activity) {
        C7573i.m23587b(activity, "context");
        super(activity);
        this.f96304b = activity;
        View inflate = LayoutInflater.from(this.f96304b).inflate(R.layout.a4r, null);
        View findViewById = inflate.findViewById(R.id.b75);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.i…ge_username_bubble_arrow)");
        this.f96305c = (ImageView) findViewById;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setAnimationStyle(R.style.fh);
        getContentView().measure(0, 0);
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        this.f96306d = contentView.getMeasuredWidth();
        View contentView2 = getContentView();
        C7573i.m23582a((Object) contentView2, "contentView");
        this.f96307e = contentView2.getMeasuredHeight();
        update();
    }

    /* renamed from: a */
    public final boolean mo93020a(View view) {
        if (view == null || this.f96304b == null || isShowing() || this.f96304b.isFinishing()) {
            return false;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new C36684b(this, view));
        m118326a();
        return true;
    }

    /* renamed from: b */
    public final void mo93021b(View view) {
        float f;
        float f2;
        float measuredWidth = (float) view.getMeasuredWidth();
        float measuredHeight = (float) view.getMeasuredHeight();
        float measuredWidth2 = (float) this.f96305c.getMeasuredWidth();
        float a = (float) C9738o.m28691a((Context) this.f96304b);
        float f3 = 0.0f;
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_M_NEW()) {
            f2 = ((a - ((float) this.f96306d)) / 2.0f) - ((a - measuredWidth) / 2.0f);
            f = (((-f2) + measuredWidth) - (measuredHeight / 2.0f)) - (measuredWidth2 / 2.0f);
        } else {
            f = (measuredWidth - (measuredHeight / 2.0f)) - (measuredWidth2 / 2.0f);
            f2 = 0.0f;
        }
        if (f > ((float) this.f96306d) - measuredWidth2) {
            f2 = f - (((float) this.f96306d) - measuredWidth2);
            f -= f2;
        }
        if (!ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW() || !C43127fh.m136806a(this.f96304b)) {
            if (!ProfileNewStyleExperiment.INSTANCE.getUSE_M_NEW() || !C43127fh.m136806a(this.f96304b)) {
                f3 = f;
            } else {
                f3 = (((((float) this.f96306d) - measuredWidth) / 2.0f) + (measuredHeight / 2.0f)) - (measuredWidth2 / 2.0f);
            }
        }
        m118327a(C47891a.m148821a(f3));
        if (!C43127fh.m136806a(this.f96304b)) {
            showAsDropDown(view, C47891a.m148821a(f2), 0);
        } else {
            showAsDropDown(view, C47891a.m148821a((-f2) - ((float) this.f96306d)), 0, 53);
        }
    }
}
