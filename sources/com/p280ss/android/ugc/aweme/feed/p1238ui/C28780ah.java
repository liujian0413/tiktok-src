package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgBubble;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgProfileTabGuide;
import com.p280ss.android.ugc.aweme.money.growth.C33633c.C33634a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ah */
public final class C28780ah extends PopupWindow {

    /* renamed from: e */
    public static boolean f75901e = false;

    /* renamed from: f */
    public static String f75902f = "";

    /* renamed from: g */
    public static int f75903g = 5000;

    /* renamed from: h */
    public static final long f75904h = 300;

    /* renamed from: i */
    public static final C28781a f75905i = new C28781a(null);

    /* renamed from: a */
    public final View f75906a;

    /* renamed from: b */
    public final String f75907b;

    /* renamed from: c */
    public int f75908c;

    /* renamed from: d */
    public final Context f75909d;

    /* renamed from: j */
    private final Runnable f75910j = new C28783c(this);

    /* renamed from: k */
    private int f75911k;

    /* renamed from: l */
    private int f75912l;

    /* renamed from: m */
    private final DmtTextView f75913m;

    /* renamed from: n */
    private final FrameLayout f75914n;

    /* renamed from: o */
    private final int f75915o = ((int) C20505c.m68010a(this.f75909d, -8.0f));

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ah$a */
    public static final class C28781a {
        private C28781a() {
        }

        /* renamed from: b */
        private static String m94776b() {
            return C28780ah.f75902f;
        }

        /* renamed from: c */
        private final boolean m94778c() {
            if (!m94774a()) {
                return false;
            }
            m94773a(false);
            return true;
        }

        /* renamed from: a */
        public static boolean m94774a() {
            return C28780ah.f75901e;
        }

        /* renamed from: a */
        private static void m94771a(int i) {
            C28780ah.f75903g = i;
        }

        public /* synthetic */ C28781a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static void m94772a(String str) {
            C28780ah.f75902f = str;
        }

        /* renamed from: a */
        public static void m94773a(boolean z) {
            C28780ah.f75901e = z;
        }

        /* renamed from: a */
        private static boolean m94775a(UgAwemeActivitySetting ugAwemeActivitySetting) {
            try {
                Boolean isNewUser = ugAwemeActivitySetting.getIsNewUser();
                if (isNewUser == null) {
                    C7573i.m23580a();
                }
                if (isNewUser.booleanValue()) {
                    return true;
                }
            } catch (NullValueException unused) {
            }
            return false;
        }

        /* renamed from: b */
        private final boolean m94777b(UgAwemeActivitySetting ugAwemeActivitySetting) {
            try {
                UgProfileTabGuide profileTabGuide = ugAwemeActivitySetting.getProfileTabGuide();
                C7573i.m23582a((Object) profileTabGuide, "profileTabGuide");
                UgBubble bubble = profileTabGuide.getBubble();
                C7573i.m23582a((Object) bubble, "profileTabGuide.bubble");
                m94772a(bubble.getText());
                UgBubble bubble2 = profileTabGuide.getBubble();
                C7573i.m23582a((Object) bubble2, "profileTabGuide.bubble");
                m94771a(bubble2.getSeconds().intValue() * 1000);
                if (!TextUtils.isEmpty(m94776b())) {
                    return true;
                }
                return false;
            } catch (NullValueException unused) {
                return false;
            }
        }

        /* renamed from: c */
        private final boolean m94779c(UgAwemeActivitySetting ugAwemeActivitySetting) {
            if (ugAwemeActivitySetting == null || C33634a.m108554b().f87780c.f87772b || !m94777b(ugAwemeActivitySetting)) {
                return false;
            }
            try {
                if (!ugAwemeActivitySetting.getOverallSwitch().booleanValue()) {
                    return false;
                }
                if (m94775a(ugAwemeActivitySetting)) {
                    boolean c = m94778c();
                    Boolean a = C28580o.m93828a();
                    C7573i.m23582a((Object) a, "Feed0VVManagerUtils.isFirstInstallAndFirstLaunch()");
                    if (a.booleanValue() && !c) {
                        return false;
                    }
                }
                return true;
            } catch (NullValueException unused) {
                return false;
            }
        }

        /* renamed from: a */
        public final C28780ah mo74008a(UgAwemeActivitySetting ugAwemeActivitySetting, Activity activity, View view) {
            C7573i.m23587b(view, "view");
            if (activity == null || !m94779c(ugAwemeActivitySetting) || m94776b() == null) {
                return null;
            }
            Context context = activity;
            String b = m94776b();
            if (b != null) {
                C28780ah ahVar = new C28780ah(context, view, b);
                ahVar.mo74006c();
                C33634a.m108554b().f87780c.mo86013a(true);
                return ahVar;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ah$b */
    public static final class C28782b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C28780ah f75916a;

        C28782b(C28780ah ahVar) {
            this.f75916a = ahVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f75916a.mo74005b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ah$c */
    static final class C28783c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28780ah f75917a;

        C28783c(C28780ah ahVar) {
            this.f75917a = ahVar;
        }

        public final void run() {
            this.f75917a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ah$d */
    static final class C28784d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28780ah f75918a;

        C28784d(C28780ah ahVar) {
            this.f75918a = ahVar;
        }

        public final void run() {
            this.f75918a.mo74004a().start();
        }
    }

    /* renamed from: e */
    private void m94766e() {
        this.f75914n.post(new C28784d(this));
    }

    /* renamed from: b */
    public final void mo74005b() {
        if (this.f75909d != null && (this.f75909d instanceof Activity) && !((Activity) this.f75909d).isFinishing()) {
            C28785ai.m94781a(this);
        }
    }

    public final void dismiss() {
        Animator d = m94765d();
        d.addListener(new C28782b(this));
        d.start();
    }

    /* renamed from: f */
    private final void m94767f() {
        getContentView().measure(0, 0);
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        this.f75912l = contentView.getMeasuredHeight();
        View contentView2 = getContentView();
        C7573i.m23582a((Object) contentView2, "contentView");
        this.f75911k = contentView2.getMeasuredWidth();
    }

    /* renamed from: c */
    public final void mo74006c() {
        if (this.f75906a != null) {
            if (VERSION.SDK_INT >= 19) {
                showAsDropDown(this.f75906a, this.f75908c, -(this.f75906a.getHeight() + this.f75912l + this.f75915o), 51);
            } else {
                showAsDropDown(this.f75906a, this.f75908c, -(this.f75906a.getHeight() + this.f75912l + this.f75915o));
            }
            m94766e();
            m94762a((long) f75903g);
        }
    }

    /* renamed from: d */
    private Animator m94765d() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f75914n, "scaleX", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f75914n, "scaleY", new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f75914n, "alpha", new float[]{1.0f, 0.0f})});
        animatorSet.setDuration(f75904h);
        return animatorSet;
    }

    /* renamed from: a */
    public final AnimatorSet mo74004a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f75914n, "scaleX", new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f75914n, "scaleY", new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f75914n, "alpha", new float[]{0.0f, 1.0f})});
        animatorSet.setDuration(f75904h);
        return animatorSet;
    }

    /* renamed from: a */
    private void m94762a(long j) {
        getContentView().removeCallbacks(this.f75910j);
        getContentView().postDelayed(this.f75910j, j);
    }

    /* renamed from: a */
    private final void m94763a(Context context, View view) {
        float a = C20505c.m68010a(context, 10.0f);
        View contentView = getContentView();
        C7573i.m23582a((Object) contentView, "contentView");
        int measuredWidth = contentView.getMeasuredWidth();
        View contentView2 = getContentView();
        C7573i.m23582a((Object) contentView2, "contentView");
        int measuredHeight = contentView2.getMeasuredHeight();
        ImageView imageView = (ImageView) getContentView().findViewById(R.id.b6c);
        ImageView imageView2 = (ImageView) getContentView().findViewById(R.id.b6d);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int a2 = C20505c.m68011a(context);
        int width = iArr[0] + (view.getWidth() / 2);
        this.f75908c = 0;
        int i = measuredWidth / 2;
        float f = (float) width;
        if (((float) i) + a > f) {
            this.f75908c = (int) (a - ((float) iArr[0]));
            C7573i.m23582a((Object) imageView, "left");
            imageView.getLayoutParams().width = (int) (f - a);
            C7573i.m23582a((Object) imageView2, "right");
            imageView2.getLayoutParams().width = measuredWidth - imageView.getLayoutParams().width;
        } else {
            float f2 = ((float) a2) - a;
            if (((float) (width + i)) > f2) {
                this.f75908c = (int) (f2 - ((float) (iArr[0] + measuredWidth)));
                C7573i.m23582a((Object) imageView2, "right");
                imageView2.getLayoutParams().width = (int) (f2 - f);
                C7573i.m23582a((Object) imageView, "left");
                imageView.getLayoutParams().width = measuredWidth - imageView2.getLayoutParams().width;
            } else {
                this.f75908c = (view.getWidth() - measuredWidth) / 2;
                C7573i.m23582a((Object) imageView, "left");
                imageView.getLayoutParams().width = i;
                C7573i.m23582a((Object) imageView2, "right");
                imageView2.getLayoutParams().width = i;
            }
        }
        imageView.getLayoutParams().height = measuredHeight;
        imageView2.getLayoutParams().height = measuredHeight;
        m94767f();
        this.f75914n.setPivotX((float) imageView.getMeasuredWidth());
        this.f75914n.setPivotY((float) measuredHeight);
    }

    public C28780ah(Context context, View view, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "anchorView");
        C7573i.m23587b(str, "text");
        super(context);
        this.f75909d = context;
        this.f75906a = view;
        this.f75907b = str;
        View inflate = LayoutInflater.from(this.f75909d).inflate(R.layout.afn, null);
        View findViewById = inflate.findViewById(R.id.dsf);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.tv_content)");
        this.f75913m = (DmtTextView) findViewById;
        this.f75913m.setFontType(C10834d.f29337g);
        this.f75913m.setText(str);
        View findViewById2 = inflate.findViewById(R.id.amt);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.fl_root_container)");
        this.f75914n = (FrameLayout) findViewById2;
        setContentView(inflate);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        inflate.measure(0, 0);
        C7573i.m23582a((Object) inflate, "view");
        this.f75912l = inflate.getMeasuredHeight();
        this.f75911k = inflate.getMeasuredWidth();
        m94763a(this.f75909d, view);
    }
}
