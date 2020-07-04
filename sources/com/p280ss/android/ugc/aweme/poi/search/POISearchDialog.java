package com.p280ss.android.ugc.aweme.poi.search;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.location.C32639p;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.poi.event.C35079b;
import com.p280ss.android.ugc.aweme.poi.search.C35228a.C35231a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.p280ss.android.ugc.aweme.views.C43372h;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.poi.search.POISearchDialog */
public class POISearchDialog extends Dialog implements C0935e, TextWatcher, OnClickListener, OnEditorActionListener, C35231a {

    /* renamed from: a */
    public C35227a f92241a;

    /* renamed from: b */
    private View f92242b;

    /* renamed from: c */
    private ImmersionBar f92243c;

    /* renamed from: d */
    private ImageView f92244d;

    /* renamed from: e */
    private TextView f92245e;

    /* renamed from: f */
    private ImageView f92246f;

    /* renamed from: g */
    private EditText f92247g;

    /* renamed from: h */
    private DmtTextView f92248h;

    /* renamed from: i */
    private View f92249i;

    /* renamed from: j */
    private AwemeViewPagerNavigator f92250j;

    /* renamed from: k */
    private RtlViewPager f92251k;

    /* renamed from: l */
    private PoiSearchPagerAdapter f92252l;

    /* renamed from: m */
    private Context f92253m;

    /* renamed from: n */
    private String f92254n;

    /* renamed from: o */
    private String f92255o;

    /* renamed from: p */
    private boolean f92256p;

    /* renamed from: q */
    private boolean f92257q;

    /* renamed from: com.ss.android.ugc.aweme.poi.search.POISearchDialog$a */
    public interface C35227a {
        /* renamed from: a */
        void mo89679a(C35079b bVar);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    /* renamed from: a */
    public final void mo89666a() {
        m113652f();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42961az.m136382c(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this);
    }

    public void dismiss() {
        m113652f();
        if (this.f92243c != null) {
            this.f92243c.destroy();
        }
        C35240j.m113695a(this);
    }

    /* renamed from: f */
    private void m113652f() {
        if (getOwnerActivity() != null) {
            C25713b.m84474a(getOwnerActivity(), (View) this.f92247g);
            this.f92247g.clearFocus();
        }
    }

    /* renamed from: d */
    private void m113650d() {
        findViewById(R.id.cgz).setOnClickListener(this);
        this.f92244d.setOnClickListener(this);
        this.f92246f.setOnClickListener(this);
        this.f92248h.setOnClickListener(this);
        this.f92247g.addTextChangedListener(this);
        this.f92247g.setOnEditorActionListener(this);
        this.f92249i.setOnClickListener(this);
    }

    /* renamed from: b */
    public final String mo89669b() {
        return this.f92252l.mo89684a(this.f92251k.getCurrentItem()).getPoiSearchRegionType();
    }

    public void show() {
        super.show();
        this.f92247g.getText().clear();
        if (C6399b.m19944t()) {
            C32640a.m105721a();
            if (!C32639p.m105712a(getContext())) {
                this.f92252l.mo89684a(this.f92251k.getCurrentItem()).mo89692f();
                return;
            }
        }
        m113648b(false);
    }

    /* renamed from: c */
    private void m113649c() {
        this.f92245e.setText(R.string.f3);
        this.f92247g.setHint(R.string.dkf);
        this.f92252l = new PoiSearchPagerAdapter(this.f92253m, this.f92254n, this.f92256p, this);
        this.f92251k.setAdapter(this.f92252l);
        this.f92250j.mo105130a((ViewPager) this.f92251k, (C43372h) new C35242l());
        this.f92251k.addOnPageChangeListener(this);
        if (!this.f92256p) {
            this.f92250j.setVisibility(8);
            return;
        }
        if (this.f92257q) {
            this.f92251k.setCurrentItem(this.f92252l.getCount());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00bc  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m113651e() {
        /*
            r4 = this;
            r0 = 2131301778(0x7f091592, float:1.8221623E38)
            android.view.View r0 = r4.findViewById(r0)
            r4.f92242b = r0
            r0 = 2131300644(0x7f091124, float:1.8219323E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.f92244d = r0
            r0 = 2131300648(0x7f091128, float:1.8219332E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.f92245e = r0
            r0 = 2131301024(0x7f0912a0, float:1.8220094E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.f92246f = r0
            r0 = 2131300645(0x7f091125, float:1.8219325E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r4.f92247g = r0
            r0 = 2131300643(0x7f091123, float:1.8219321E38)
            android.view.View r0 = r4.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r0
            r4.f92248h = r0
            r0 = 2131296870(0x7f090266, float:1.8211669E38)
            android.view.View r0 = r4.findViewById(r0)
            r4.f92249i = r0
            r0 = 2131300110(0x7f090f0e, float:1.821824E38)
            android.view.View r0 = r4.findViewById(r0)
            com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator r0 = (com.p280ss.android.ugc.aweme.views.AwemeViewPagerNavigator) r0
            r4.f92250j = r0
            r0 = 2131303265(0x7f091b61, float:1.822464E38)
            android.view.View r0 = r4.findViewById(r0)
            com.ss.android.ugc.aweme.views.RtlViewPager r0 = (com.p280ss.android.ugc.aweme.views.RtlViewPager) r0
            r4.f92251k = r0
            r0 = 0
            android.content.Context r1 = r4.f92253m     // Catch:{ Exception -> 0x009c }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ Exception -> 0x009c }
            java.lang.Class<com.ss.android.ugc.aweme.poi.search.POISearchDialog> r2 = com.p280ss.android.ugc.aweme.poi.search.POISearchDialog.class
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ Exception -> 0x009c }
            com.gyf.barlibrary.ImmersionBar r1 = com.gyf.barlibrary.ImmersionBar.with(r1, r4, r2)     // Catch:{ Exception -> 0x009c }
            r4.f92243c = r1     // Catch:{ Exception -> 0x009c }
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()     // Catch:{ Exception -> 0x009c }
            if (r1 != 0) goto L_0x008b
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Exception -> 0x009c }
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r2 = com.p280ss.android.ugc.aweme.services.IMainService.class
            java.lang.Object r1 = r1.getService(r2)     // Catch:{ Exception -> 0x009c }
            com.ss.android.ugc.aweme.services.IMainService r1 = (com.p280ss.android.ugc.aweme.services.IMainService) r1     // Catch:{ Exception -> 0x009c }
            boolean r1 = r1.isTiktokWhite()     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r1 = 0
            goto L_0x008c
        L_0x008b:
            r1 = 1
        L_0x008c:
            com.gyf.barlibrary.ImmersionBar r2 = r4.f92243c     // Catch:{ Exception -> 0x009c }
            r3 = 2131101121(0x7f0605c1, float:1.7814643E38)
            com.gyf.barlibrary.ImmersionBar r2 = r2.statusBarColor(r3)     // Catch:{ Exception -> 0x009c }
            com.gyf.barlibrary.ImmersionBar r1 = r2.statusBarDarkFont(r1)     // Catch:{ Exception -> 0x009c }
            r1.init()     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 19
            if (r1 < r2) goto L_0x00b0
            android.view.View r1 = r4.f92242b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.content.Context r2 = r4.f92253m
            int r2 = com.bytedance.ies.uikit.p576a.C10994a.m32204a(r2)
            r1.height = r2
        L_0x00b0:
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r1 == 0) goto L_0x00bc
            android.widget.ImageView r1 = r4.f92246f
            r1.setVisibility(r0)
            return
        L_0x00bc:
            android.widget.ImageView r0 = r4.f92246f
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.search.POISearchDialog.m113651e():void");
    }

    /* renamed from: a */
    public final void mo89667a(boolean z) {
        this.f92252l.mo89685a(true);
    }

    @C7709l
    public void onEvent(C35079b bVar) {
        if (this.f92241a != null) {
            this.f92241a.mo89679a(bVar);
        }
        dismiss();
    }

    /* renamed from: b */
    private void m113648b(boolean z) {
        this.f92255o = this.f92247g.getText().toString();
        this.f92252l.mo89684a(this.f92251k.getCurrentItem()).mo89688a(z, this.f92255o);
    }

    public void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (obj.contains("\n")) {
            C10761a.m31409e(getContext(), (int) R.string.cn2).mo25750a();
            int indexOf = obj.indexOf("\n");
            editable.replace(indexOf, indexOf + 1, "");
        }
    }

    public void onPageSelected(int i) {
        m113648b(false);
        C6907h.m21524a("search_poi_tab_change", (Map) C22984d.m75611a().mo59973a("enter_method", "slide").mo59973a("search_region_type", this.f92252l.mo89684a(i).getPoiSearchRegionType()).f60753a);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.cgw) {
            m113648b(true);
            m113652f();
        } else if (id == R.id.cgx) {
            dismiss();
        } else if (id == R.id.pw) {
            this.f92247g.setText("");
            m113648b(true);
        } else if (id == R.id.cgz) {
            m113652f();
        } else {
            if (id == R.id.cr8) {
                this.f92255o = this.f92247g.getText().toString();
                this.f92252l.mo89684a(this.f92251k.getCurrentItem()).mo89692f();
                C6907h.m21524a("reset_location", (Map) C22984d.m75611a().mo59973a("enter_from", "video_post_page").f60753a);
            }
        }
    }

    public POISearchDialog(Context context, Bundle bundle) {
        this(context, 0, bundle);
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (3 == i) {
            m113652f();
            m113648b(true);
        }
        return false;
    }

    private POISearchDialog(Context context, int i, Bundle bundle) {
        super(context, R.style.vj);
        this.f92255o = "";
        setContentView(R.layout.ky);
        if (bundle != null) {
            this.f92254n = bundle.getString("candidateloc");
            this.f92256p = bundle.getBoolean("enable_global_search");
            this.f92257q = bundle.getBoolean("is_over_sea");
        }
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(34);
        }
        this.f92253m = context;
        m113651e();
        m113650d();
        m113649c();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 == 1 && !TextUtils.isEmpty(charSequence) && 10 == charSequence.toString().charAt(i)) {
            C10761a.m31409e(getContext(), (int) R.string.cn2).mo25750a();
            this.f92247g.getEditableText().delete(i, i + 1);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (!C6319n.m19593a(this.f92255o)) {
                m113648b(true);
            }
            this.f92249i.setVisibility(8);
            return;
        }
        this.f92249i.setVisibility(0);
    }
}
