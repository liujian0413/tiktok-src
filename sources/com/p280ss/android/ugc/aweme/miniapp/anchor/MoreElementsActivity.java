package com.p280ss.android.ugc.aweme.miniapp.anchor;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.gyf.barlibrary.ImmersionBar;
import com.gyf.barlibrary.OSUtils;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24537f;
import com.p280ss.android.ugc.aweme.miniapp.anchor.fragment.MoreElementsFragment;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Stack;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.MoreElementsActivity */
public class MoreElementsActivity extends AmeSSActivity {

    /* renamed from: a */
    public Stack<Fragment> f86972a;

    /* renamed from: b */
    private ImmersionBar f86973b;

    /* renamed from: c */
    private View f86974c;

    /* renamed from: a */
    public void mo85429a(String str) {
    }

    public void onDestroy() {
        if (C42961az.m136384e(this)) {
            C42961az.m136383d(this);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private void mo85432a() {
        this.f86974c = findViewById(R.id.dal);
        LayoutParams layoutParams = this.f86974c.getLayoutParams();
        layoutParams.height = C20505c.m68014c(this);
        this.f86974c.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void mo85435b() {
        if (getCurrentFocus() != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void onBackPressed() {
        Fragment fragment = (Fragment) this.f86972a.peek();
        if (fragment instanceof MoreElementsFragment) {
            super.onBackPressed();
        } else {
            mo85434a(fragment);
        }
    }

    public void setStatusBarColor() {
        super.setStatusBarColor();
        if (!OSUtils.isEMUI3_0() && !OSUtils.isEMUI3_1()) {
            Window window = getWindow();
            if (window != null && VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window.setAttributes(attributes);
                this.f86973b = ImmersionBar.with((Activity) this).statusBarDarkFont(true);
                this.f86973b.init();
            }
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void finishCommandFromMiniApp(C24537f fVar) {
        if (fVar.f64772a) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.db);
        C42961az.m136382c(this);
        mo85432a();
        this.f86972a = new Stack<>();
    }

    /* renamed from: a */
    public final void mo85434a(Fragment fragment) {
        C0633q a = getSupportFragmentManager().mo2645a();
        a.mo2587a(fragment);
        a.mo2606d();
        mo85435b();
        this.f86972a.pop();
    }

    public void overridePendingTransition(int i, int i2) {
        super.overridePendingTransition(R.anim.bq, R.anim.bs);
    }
}
