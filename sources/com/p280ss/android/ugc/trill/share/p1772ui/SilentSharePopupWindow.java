package com.p280ss.android.ugc.trill.share.p1772ui;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.trill.share.ui.SilentSharePopupWindow */
public final class SilentSharePopupWindow extends PopupWindow implements C0042h {

    /* renamed from: a */
    public static final C45161a f116033a = new C45161a(null);

    /* renamed from: b */
    private final Runnable f116034b;

    /* renamed from: c */
    private int f116035c;

    /* renamed from: d */
    private int f116036d;

    /* renamed from: e */
    private final DmtTextView f116037e;

    /* renamed from: f */
    private final FrameLayout f116038f;

    /* renamed from: g */
    private final Context f116039g;

    /* renamed from: h */
    private final String f116040h;

    /* renamed from: i */
    private final int f116041i;

    /* renamed from: com.ss.android.ugc.trill.share.ui.SilentSharePopupWindow$a */
    public static final class C45161a {
        private C45161a() {
        }

        public /* synthetic */ C45161a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.share.ui.SilentSharePopupWindow$b */
    static final class C45162b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SilentSharePopupWindow f116042a;

        C45162b(SilentSharePopupWindow silentSharePopupWindow) {
            this.f116042a = silentSharePopupWindow;
        }

        public final void run() {
            this.f116042a.dismiss();
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f116034b);
    }

    public final void dismiss() {
        if (isShowing()) {
            if ((this.f116039g instanceof Activity) && ((Activity) this.f116039g).isFinishing()) {
                return;
            }
            if (VERSION.SDK_INT < 17 || !(this.f116039g instanceof Activity) || !((Activity) this.f116039g).isDestroyed()) {
                C45163a.m142374a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo107721a() {
        getContentView().measure(0, 0);
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        this.f116036d = contentView.getMeasuredHeight();
        View contentView2 = getContentView();
        C7573i.m23582a((Object) contentView2, "contentView");
        this.f116035c = contentView2.getMeasuredWidth();
    }

    /* renamed from: a */
    private void m142368a(long j) {
        getContentView().removeCallbacks(this.f116034b);
        getContentView().postDelayed(this.f116034b, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m142369a(View view, int i, long j) {
        if (view != null) {
            if (!(this.f116039g instanceof Activity) || !((Activity) this.f116039g).isFinishing()) {
                if (VERSION.SDK_INT >= 19) {
                    showAsDropDown(view, i, -(view.getHeight() + this.f116036d + this.f116041i), 51);
                } else {
                    showAsDropDown(view, i, -(view.getHeight() + this.f116036d + this.f116041i));
                }
                m142368a(j);
            }
        }
    }

    private SilentSharePopupWindow(Context context, String str, int i, int i2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "label");
        this.f116039g = context;
        this.f116040h = str;
        this.f116041i = i;
        this.f116034b = new C45162b(this);
        Context context2 = this.f116039g;
        if (!(context2 instanceof C0043i)) {
            context2 = null;
        }
        C0043i iVar = (C0043i) context2;
        if (iVar != null) {
            Lifecycle lifecycle = iVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo55a(this);
            }
        }
        View inflate = LayoutInflater.from(this.f116039g).inflate(i2, null);
        View findViewById = inflate.findViewById(R.id.dsf);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.tv_content)");
        this.f116037e = (DmtTextView) findViewById;
        if (C6399b.m19946v()) {
            this.f116037e.setFontType(C10834d.f29337g);
        } else {
            this.f116037e.setFontType(C10834d.f29331a);
        }
        this.f116037e.setText(this.f116040h);
        View findViewById2 = inflate.findViewById(R.id.amt);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.fl_root_container)");
        this.f116038f = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.gd);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        C7573i.m23582a((Object) inflate, "view");
        this.f116036d = inflate.getMeasuredHeight();
        this.f116035c = inflate.getMeasuredWidth();
    }

    public /* synthetic */ SilentSharePopupWindow(Context context, String str, int i, int i2, int i3, C7571f fVar) {
        this(context, str, i, R.layout.agq);
    }
}
