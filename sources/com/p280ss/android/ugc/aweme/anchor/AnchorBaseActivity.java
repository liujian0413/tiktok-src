package com.p280ss.android.ugc.aweme.anchor;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.anchor.AnchorBaseFragment.C22505a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorBaseActivity */
public class AnchorBaseActivity extends AmeSSActivity implements C22543d {

    /* renamed from: a */
    private ImmersionBar f59950a;

    /* renamed from: b */
    private AnchorSearchFragment f59951b;

    /* renamed from: c */
    private AnchorSelectionFragment f59952c;

    /* renamed from: d */
    private HashMap f59953d;

    /* renamed from: a */
    public View mo59093a(int i) {
        if (this.f59953d == null) {
            this.f59953d = new HashMap();
        }
        View view = (View) this.f59953d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f59953d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.br, R.anim.bs);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar immersionBar = this.f59950a;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public void onResume() {
        super.onResume();
        this.f59950a = ImmersionBar.with((Activity) this).statusBarDarkFont(true);
        ImmersionBar immersionBar = this.f59950a;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    /* renamed from: c */
    private void m74416c() {
        View a = mo59093a(R.id.dal);
        C7573i.m23582a((Object) a, "status_bar");
        LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = C20505c.m68014c(this);
        View a2 = mo59093a(R.id.dal);
        C7573i.m23582a((Object) a2, "status_bar");
        a2.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    private final void m74417d() {
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        AnchorSelectionFragment anchorSelectionFragment = this.f59952c;
        if (anchorSelectionFragment == null) {
            C7573i.m23583a("mSelectionFragment");
        }
        a.mo2585a((int) R.id.aow, (Fragment) anchorSelectionFragment);
        a.mo2606d();
    }

    /* renamed from: a */
    public final void mo59094a() {
        Serializable serializableExtra = getIntent().getSerializableExtra("anchor_type");
        if (!(serializableExtra instanceof AnchorBusinessType)) {
            serializableExtra = null;
        }
        AnchorBusinessType anchorBusinessType = (AnchorBusinessType) serializableExtra;
        if (anchorBusinessType == null) {
            anchorBusinessType = AnchorBusinessType.NO_TYPE;
        }
        C22505a.m74424a(anchorBusinessType);
        this.f59951b = new AnchorSearchFragment();
        this.f59952c = new AnchorSelectionFragment();
    }

    /* renamed from: b */
    public final void mo59095b() {
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "supportFragmentManager.beginTransaction()");
        AnchorSearchFragment anchorSearchFragment = this.f59951b;
        if (anchorSearchFragment == null) {
            C7573i.m23583a("mSearchFragment");
        }
        if (!anchorSearchFragment.isAdded()) {
            AnchorSearchFragment anchorSearchFragment2 = this.f59951b;
            if (anchorSearchFragment2 == null) {
                C7573i.m23583a("mSearchFragment");
            }
            a.mo2585a((int) R.id.aow, (Fragment) anchorSearchFragment2);
        }
        AnchorSearchFragment anchorSearchFragment3 = this.f59951b;
        if (anchorSearchFragment3 == null) {
            C7573i.m23583a("mSearchFragment");
        }
        a.mo2605c(anchorSearchFragment3);
        AnchorSelectionFragment anchorSelectionFragment = this.f59952c;
        if (anchorSelectionFragment == null) {
            C7573i.m23583a("mSelectionFragment");
        }
        a.mo2601b(anchorSelectionFragment);
        a.mo2589a((String) null);
        a.mo2606d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.a_);
        mo59094a();
        m74416c();
        m74417d();
    }
}
