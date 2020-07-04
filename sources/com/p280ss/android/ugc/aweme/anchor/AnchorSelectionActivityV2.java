package com.p280ss.android.ugc.aweme.anchor;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.view.ViewPager;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.C10830c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.p280ss.android.ugc.aweme.anchor.AnchorListFragment.C22506a;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSelectionActivityV2 */
public final class AnchorSelectionActivityV2 extends AnchorBaseActivity {

    /* renamed from: a */
    private AnchorBusinessType f59983a = AnchorBusinessType.NO_TYPE;

    /* renamed from: b */
    private HashMap f59984b;

    /* renamed from: com.ss.android.ugc.aweme.anchor.AnchorSelectionActivityV2$a */
    static final class C22516a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DmtTabLayout f59985a;

        C22516a(DmtTabLayout dmtTabLayout) {
            this.f59985a = dmtTabLayout;
        }

        public final void run() {
            C10830c.m31774a(this.f59985a);
        }
    }

    /* renamed from: a */
    public final View mo59093a(int i) {
        if (this.f59984b == null) {
            this.f59984b = new HashMap();
        }
        View view = (View) this.f59984b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f59984b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    private final void m74464c() {
        Pair[] pairArr = {new Pair("title1", C22506a.m74437a("test1")), new Pair("title2", C22506a.m74437a("test2")), new Pair("title3", C22506a.m74437a("test3"))};
        ViewPager viewPager = (ViewPager) mo59093a(R.id.ed4);
        C7573i.m23582a((Object) viewPager, "view_pager");
        C0608j supportFragmentManager = getSupportFragmentManager();
        C7573i.m23582a((Object) supportFragmentManager, "supportFragmentManager");
        viewPager.setAdapter(new AnchorTypeAdapter(pairArr, supportFragmentManager));
        DmtTabLayout dmtTabLayout = (DmtTabLayout) mo59093a(R.id.dfo);
        if (dmtTabLayout != null) {
            dmtTabLayout.setCustomTabViewResId(R.layout.sv);
            dmtTabLayout.setTabMode(0);
            dmtTabLayout.setAutoFillWhenScrollable(true);
            dmtTabLayout.setupWithViewPager((ViewPager) mo59093a(R.id.ed4));
            dmtTabLayout.post(new C22516a(dmtTabLayout));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.ac);
        DmtTextView dmtTextView = (DmtTextView) mo59093a(R.id.e7d);
        C7573i.m23582a((Object) dmtTextView, "txt_title");
        dmtTextView.setText("test");
        mo59094a();
        m74464c();
    }

    public final void overridePendingTransition(int i, int i2) {
        super.overridePendingTransition(R.anim.bq, R.anim.bs);
    }
}
