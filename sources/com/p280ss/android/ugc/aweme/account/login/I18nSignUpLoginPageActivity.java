package com.p280ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetBehavior.C0343a;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.sliding.DmtSlidingPaneLayout;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21172b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.p1056b.C23275a;
import com.p280ss.android.ugc.aweme.base.p1056b.C23278c;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.IntRef;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity */
public class I18nSignUpLoginPageActivity extends AmeActivity implements C21172b, C23278c {

    /* renamed from: f */
    public static final C21257a f57100f = new C21257a(null);

    /* renamed from: a */
    public C21539i f57101a;

    /* renamed from: b */
    public boolean f57102b = true;

    /* renamed from: c */
    public boolean f57103c;

    /* renamed from: d */
    public boolean f57104d;

    /* renamed from: e */
    public String f57105e;

    /* renamed from: g */
    private HashMap f57106g;

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity$a */
    public static final class C21257a {
        private C21257a() {
        }

        public /* synthetic */ C21257a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m71553a(Activity activity, Bundle bundle, boolean z) {
            C7573i.m23587b(activity, "activity");
            if (z) {
                Intent intent = new Intent(activity, I18nSignUpActivity.class);
                intent.putExtra(C21557l.m72259a(), bundle).putExtra(C21557l.m72260b(), true).putExtra(C21557l.m72261c(), C21276aa.m71637a(activity));
                activity.startActivity(intent);
                activity.overridePendingTransition(R.anim.s, 0);
                return;
            }
            Intent intent2 = new Intent(activity, I18nSignUpLoginPageActivity.class);
            intent2.putExtra(C21557l.m72262d(), bundle).putExtra(C21557l.m72260b(), false);
            activity.startActivity(intent2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity$b */
    static final class C21258b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpLoginPageActivity f57107a;

        C21258b(I18nSignUpLoginPageActivity i18nSignUpLoginPageActivity) {
            this.f57107a = i18nSignUpLoginPageActivity;
        }

        public final void run() {
            if (TextUtils.equals(C21671bd.m72536d(), this.f57107a.f57105e) && !this.f57107a.f57104d) {
                C21671bd.m72522a(1, 3, (Object) "");
                C21671bd.m72547o();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity$c */
    public static final class C21259c extends C0343a {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpLoginPageActivity f57108a;

        /* renamed from: b */
        final /* synthetic */ IntRef f57109b;

        /* renamed from: c */
        final /* synthetic */ BottomSheetBehavior f57110c;

        /* renamed from: a */
        public final void mo1372a(View view, float f) {
            C7573i.m23587b(view, "p0");
        }

        /* renamed from: a */
        public final void mo1373a(View view, int i) {
            C7573i.m23587b(view, "p0");
            if (i == 5) {
                this.f57108a.getWindow().setDimAmount(0.0f);
                this.f57108a.finish();
            }
        }

        C21259c(I18nSignUpLoginPageActivity i18nSignUpLoginPageActivity, IntRef intRef, BottomSheetBehavior bottomSheetBehavior) {
            this.f57108a = i18nSignUpLoginPageActivity;
            this.f57109b = intRef;
            this.f57110c = bottomSheetBehavior;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity$d */
    static final class C21260d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpLoginPageActivity f57111a;

        /* renamed from: b */
        final /* synthetic */ IntRef f57112b;

        /* renamed from: c */
        final /* synthetic */ BottomSheetBehavior f57113c;

        C21260d(I18nSignUpLoginPageActivity i18nSignUpLoginPageActivity, IntRef intRef, BottomSheetBehavior bottomSheetBehavior) {
            this.f57111a = i18nSignUpLoginPageActivity;
            this.f57112b = intRef;
            this.f57113c = bottomSheetBehavior;
        }

        public final void run() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f57111a.mo57181b(R.id.cwi);
            C7573i.m23582a((Object) relativeLayout, "root");
            if (relativeLayout.getHeight() != this.f57112b.element) {
                BottomSheetBehavior bottomSheetBehavior = this.f57113c;
                C7573i.m23582a((Object) bottomSheetBehavior, "bottomSheetBehavior");
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f57111a.mo57181b(R.id.cwi);
                C7573i.m23582a((Object) relativeLayout2, "root");
                bottomSheetBehavior.mo1352a(relativeLayout2.getHeight());
            }
        }
    }

    /* renamed from: b */
    public View mo57181b(int i) {
        if (this.f57106g == null) {
            this.f57106g = new HashMap();
        }
        View view = (View) this.f57106g.get(Integer.valueOf(R.id.cwi));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cwi);
        this.f57106g.put(Integer.valueOf(R.id.cwi), findViewById);
        return findViewById;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public boolean useImmerseMode() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public I18nSignUpLoginPageActivity() {
        String d = C21671bd.m72536d();
        C7573i.m23582a((Object) d, "ModuleStore.getCurUserId()");
        this.f57105e = d;
    }

    public void onBackPressed() {
        String str;
        if (!this.f57102b) {
            C21539i iVar = this.f57101a;
            if (iVar != null) {
                str = iVar.f57852c;
            } else {
                str = null;
            }
            C21556k.m72258a(str, "click_back");
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        C21170a.m71341b(this);
        C21539i iVar = this.f57101a;
        if (iVar != null) {
            iVar.mo57690e();
        }
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity", "onResume", true);
        super.onResume();
        if (this.f57103c) {
            finish();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        super.setStatusBarColor();
        if (VERSION.SDK_INT >= 23 && !this.f57102b) {
            C23487o.m77155c((Activity) this);
        }
    }

    public void finish() {
        super.finish();
        if (this.f57102b) {
            C21671bd.m72523a(10, 4, "");
            new Handler().postDelayed(new C21258b(this), 200);
            overridePendingTransition(0, R.anim.u);
        }
    }

    public int getStatusBarColor() {
        if (this.f57102b) {
            return getResources().getColor(R.color.ac4);
        }
        if (VERSION.SDK_INT >= 23) {
            return getResources().getColor(R.color.az3);
        }
        return super.getStatusBarColor();
    }

    /* renamed from: a_ */
    public final void mo57096a_(int i) {
        if (i == 11 || i == 10) {
            if (i == 11) {
                this.f57104d = true;
            }
            if (this.f57102b) {
                finish();
                return;
            }
            this.f57103c = true;
        }
    }

    /* renamed from: a */
    public final String mo57183a(C23275a aVar) {
        String str;
        String str2;
        if (aVar == null) {
            return null;
        }
        String str3 = aVar.f61308a;
        if (C7573i.m23585a((Object) str3, (Object) "dismiss") || C7573i.m23585a((Object) str3, (Object) C21556k.m72257a())) {
            if (!this.f57102b) {
                C21539i iVar = this.f57101a;
                if (iVar != null) {
                    str = iVar.f57852c;
                } else {
                    str = null;
                }
                if (C7573i.m23585a((Object) aVar.f61308a, (Object) C21556k.m72257a())) {
                    str2 = "click_sign_up";
                } else {
                    str2 = "click_back";
                }
                C21556k.m72258a(str, str2);
            }
            finish();
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        int i;
        String str;
        boolean z;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity", "onCreate", true);
        this.f57102b = getIntent().getBooleanExtra(C21557l.m72260b(), true);
        super.onCreate(bundle);
        C21170a.m71339a((C21172b) this);
        supportRequestWindowFeature(1);
        if (this.f57102b) {
            i = R.layout.ad5;
        } else {
            i = R.layout.s6;
        }
        setContentView(i);
        Activity activity = this;
        RelativeLayout relativeLayout = (RelativeLayout) mo57181b(R.id.cwi);
        C7573i.m23582a((Object) relativeLayout, "root");
        View view = relativeLayout;
        Intent intent = getIntent();
        if (this.f57102b) {
            str = C21557l.m72259a();
        } else {
            str = C21557l.m72262d();
        }
        C21539i iVar = new C21539i(activity, view, intent.getBundleExtra(str), this.f57102b, this);
        this.f57101a = iVar;
        if (this.f57102b) {
            C21671bd.m72523a(10, 1, "");
            IntRef intRef = new IntRef();
            Context context = this;
            intRef.element = DmtSlidingPaneLayout.m31509a(activity) - C9738o.m28717e(context);
            if (!C6776h.m20950c() || !C21276aa.m71638a(context)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                intRef.element += C21276aa.m71639b(activity);
            }
            getWindow().setGravity(80);
            getWindow().setLayout(-1, -1);
            BottomSheetBehavior a = BottomSheetBehavior.m1365a((RelativeLayout) mo57181b(R.id.cwi));
            a.mo1352a(intRef.element);
            a.f1340f = true;
            a.mo1357b(3);
            a.f1347m = new C21259c(this, intRef, a);
            ((RelativeLayout) mo57181b(R.id.cwi)).post(new C21260d(this, intRef, a));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity", "onCreate", false);
    }
}
