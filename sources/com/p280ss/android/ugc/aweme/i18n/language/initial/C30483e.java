package com.p280ss.android.ugc.aweme.i18n.language.initial;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25060e;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedRecommendFragment;
import com.p280ss.android.ugc.aweme.journey.C32250l;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.initial.e */
public final class C30483e {

    /* renamed from: a */
    private boolean f80087a;

    /* renamed from: b */
    private boolean f80088b;

    /* renamed from: c */
    private Application f80089c;

    /* renamed from: d */
    private String f80090d;

    /* renamed from: e */
    private SoftReference<Context> f80091e;

    /* renamed from: f */
    private boolean f80092f;

    /* renamed from: g */
    private InitialChooseLanguageDialog f80093g;

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.initial.e$a */
    static class C30485a {

        /* renamed from: a */
        static final C30483e f80094a = new C30483e();
    }

    /* renamed from: a */
    public static C30483e m99569a() {
        return C30485a.f80094a;
    }

    /* renamed from: b */
    public final void mo80162b() {
        this.f80087a = false;
    }

    /* renamed from: c */
    public final void mo80164c() {
        this.f80088b = false;
    }

    private C30483e() {
        this.f80089c = AwemeApplication.m21341a();
        this.f80087a = m99575d();
    }

    /* renamed from: f */
    private boolean m99579f() {
        if (!TextUtils.equals("en", this.f80089c.getResources().getConfiguration().locale.getLanguage())) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m99580g() {
        String[] strArr = {"MY"};
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (TextUtils.equals(str, C32326h.m104885g())) {
                this.f80090d = str;
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private boolean m99576e() {
        int i;
        C30489i iVar = (C30489i) C23336d.m76560a(this.f80089c, C30489i.class);
        switch (iVar.mo60441a(0)) {
            case 0:
                if (C28580o.m93828a().booleanValue()) {
                    i = 1;
                } else {
                    i = 2;
                }
                iVar.mo60442b(i);
                if (i == 1) {
                    return true;
                }
                return false;
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    private boolean m99575d() {
        boolean z = !m99579f();
        if (z && m99580g()) {
            z = false;
        }
        if (z && C32250l.f84286c.mo83470c()) {
            z = false;
        }
        if (z) {
            return m99576e();
        }
        ((C30489i) C23336d.m76560a(this.f80089c, C30489i.class)).mo60442b(2);
        return false;
    }

    /* renamed from: b */
    public final void mo80163b(Context context) {
        this.f80092f = true;
        m99574d(context);
    }

    /* renamed from: a */
    private static String[] m99572a(String str) {
        if (!TextUtils.equals(str, "MY")) {
            return null;
        }
        return new String[]{"ms-MY", "zh-Hant-TW", "en"};
    }

    /* renamed from: d */
    private void m99574d(Context context) {
        if (this.f80092f) {
            if (context == null && this.f80091e != null) {
                context = (Context) this.f80091e.get();
            }
            if (context != null && !C25060e.m82536a()) {
                String[] a = m99572a(this.f80090d);
                if (this.f80087a && m99577e(context) && this.f80088b && a != null) {
                    C1592h.m7855a((Callable<TResult>) new C30486f<TResult>(this, context, a), C1592h.f5958b);
                }
            }
        }
    }

    /* renamed from: f */
    private static String m99578f(Context context) {
        switch (((C30489i) C23336d.m76560a(context, C30489i.class)).mo60441a(0)) {
            case 0:
                return "noSet";
            case 1:
                return "待展示";
            case 2:
                return "有条件未满足，永不展示";
            case 3:
                return "已展示过";
            default:
                return "未知";
        }
    }

    /* renamed from: c */
    public static void m99573c(Context context) {
        C1081a aVar = new C1081a(context);
        StringBuilder sb = new StringBuilder("原生开屏:");
        sb.append(C25060e.m82539b());
        sb.append("\n系统语言:");
        sb.append(C23481i.m77089a().getConfiguration().locale.getLanguage());
        sb.append("\n国家:");
        sb.append(C32326h.m104885g());
        sb.append("\n是否展示过:");
        sb.append(m99578f(context));
        sb.append("\nFirstLaunch:");
        sb.append(C28580o.m93828a());
        aVar.mo4240b((CharSequence) sb.toString());
        aVar.mo4241b((CharSequence) "重置弹窗展示标记", (OnClickListener) new C30487g(context));
        aVar.mo4234a((CharSequence) "ok", C30488h.f80099a);
        aVar.mo4245c();
    }

    /* renamed from: e */
    private static boolean m99577e(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity instanceof MainActivity) {
                Fragment curFragment = ((MainActivity) activity).getCurFragment();
                if ((curFragment instanceof MainFragment) && (((MainFragment) curFragment).mo84447b() instanceof FeedRecommendFragment)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo80161a(Context context) {
        this.f80088b = true;
        if (this.f80091e == null || this.f80091e.get() == null) {
            this.f80091e = new SoftReference<>(context);
        }
        m99574d(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo80160a(Context context, String[] strArr) throws Exception {
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return null;
        }
        if (this.f80093g == null) {
            this.f80093g = new InitialChooseLanguageDialog(context, strArr);
        }
        if (!this.f80093g.isShowing()) {
            this.f80093g.show();
        }
        this.f80087a = false;
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ void m99570a(Context context, DialogInterface dialogInterface, int i) {
        ((C30489i) C23336d.m76560a(context, C30489i.class)).mo60442b(0);
        C28580o.m93832b();
    }
}
