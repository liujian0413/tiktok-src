package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.poi.map.C35095h;
import com.p280ss.android.ugc.aweme.poi.map.C35096i;
import com.p280ss.android.ugc.aweme.poi.map.C35100m;
import com.p280ss.android.ugc.aweme.poi.map.MapLayout;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35408q;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity */
public final class TestPoiMapPickUpActivity extends AmeBaseActivity implements C35096i, C35100m {

    /* renamed from: s */
    public static final C37818a f98570s = new C37818a(null);

    /* renamed from: w */
    private static final String f98571w = f98571w;

    /* renamed from: a */
    public MapLayout f98572a;

    /* renamed from: b */
    public DmtEditText f98573b;

    /* renamed from: c */
    public DmtEditText f98574c;

    /* renamed from: d */
    public double f98575d;

    /* renamed from: e */
    public double f98576e;

    /* renamed from: q */
    public double f98577q;

    /* renamed from: r */
    public double f98578r;

    /* renamed from: t */
    private ButtonTitleBar f98579t;

    /* renamed from: u */
    private DmtTextView f98580u;

    /* renamed from: v */
    private TextView f98581v;

    /* renamed from: x */
    private HashMap f98582x;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$a */
    public static final class C37818a {
        private C37818a() {
        }

        public /* synthetic */ C37818a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$b */
    static final class C37819b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiMapPickUpActivity f98583a;

        C37819b(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f98583a = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98583a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$c */
    static final class C37820c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiMapPickUpActivity f98584a;

        C37820c(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f98584a = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C35408q a = C35408q.m114371a();
            C7573i.m23582a((Object) a, "PoiCollectStateInstance.getInstance()");
            if (!a.mo90149b()) {
                C37882ai.m121127a(Toast.makeText(this.f98584a, "enable toggle first", 0));
                return;
            }
            double[] dArr = {this.f98584a.f98575d, this.f98584a.f98576e};
            this.f98584a.f98577q = this.f98584a.f98575d;
            this.f98584a.f98578r = this.f98584a.f98576e;
            C35408q.m114371a().mo90148a(dArr);
            C37882ai.m121127a(Toast.makeText(this.f98584a, "lat & lng saved successfully!", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$d */
    static final class C37821d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TestPoiMapPickUpActivity f98585a;

        C37821d(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f98585a = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            double parseDouble = Double.parseDouble(String.valueOf(TestPoiMapPickUpActivity.m121030a(this.f98585a).getText()));
            double parseDouble2 = Double.parseDouble(String.valueOf(TestPoiMapPickUpActivity.m121032b(this.f98585a).getText()));
            if (TestPoiMapPickUpActivity.m121033b(parseDouble, parseDouble2)) {
                this.f98585a.f98575d = parseDouble;
                this.f98585a.f98576e = parseDouble2;
                TestPoiMapPickUpActivity.m121034c(this.f98585a).mo88949a(BitmapFactory.decodeResource(this.f98585a.getResources(), R.drawable.avl), this.f98585a.f98575d, this.f98585a.f98576e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity$e */
    static final class C37822e implements C35095h {

        /* renamed from: a */
        public static final C37822e f98586a = new C37822e();

        C37822e() {
        }
    }

    /* renamed from: a */
    private View m121029a(int i) {
        if (this.f98582x == null) {
            this.f98582x = new HashMap();
        }
        View view = (View) this.f98582x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98582x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public static boolean m121033b(double d, double d2) {
        return d > 0.0d && d2 > 0.0d;
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.ez;
    }

    public final void onPointerCaptureChanged(boolean z) {
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        MapLayout mapLayout = this.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout.mo88960e();
    }

    public final void onPause() {
        super.onPause();
        MapLayout mapLayout = this.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout.mo88957c();
    }

    public final void onStart() {
        super.onStart();
        MapLayout mapLayout = this.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout.mo88956b();
    }

    public final void onStop() {
        super.onStop();
        MapLayout mapLayout = this.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout.mo88958d();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onResume", true);
        super.onResume();
        MapLayout mapLayout = this.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout.mo88947a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onResume", false);
    }

    /* renamed from: d */
    public final void mo59893d() {
        MapLayout mapLayout = this.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout.mo88950a(BitmapFactory.decodeResource(getResources(), R.drawable.avl), this.f98575d, this.f98576e, 3.0f, (C35095h) C37822e.f98586a);
    }

    public final void onBackPressed() {
        Intent intent = getIntent();
        if (this.f98577q <= 0.0d || this.f98578r <= 0.0d) {
            setResult(0, intent);
        } else {
            intent.putExtra("latitude", this.f98577q);
            intent.putExtra("longitude", this.f98578r);
            setResult(-1, intent);
        }
        finish();
    }

    /* renamed from: i */
    private final void m121036i() {
        this.f98576e = 116.4074d;
        this.f98575d = 39.9042d;
        DmtEditText dmtEditText = this.f98574c;
        if (dmtEditText == null) {
            C7573i.m23583a("mLat");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f98575d));
        dmtEditText.setText(sb.toString());
        DmtEditText dmtEditText2 = this.f98573b;
        if (dmtEditText2 == null) {
            C7573i.m23583a("mLng");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f98576e));
        dmtEditText2.setText(sb2.toString());
    }

    /* renamed from: c */
    private final void m121035c() {
        MapLayout mapLayout = (MapLayout) m121029a((int) R.id.cfe);
        C7573i.m23582a((Object) mapLayout, "poi_map");
        this.f98572a = mapLayout;
        View a = m121029a((int) R.id.dke);
        if (a != null) {
            this.f98579t = (ButtonTitleBar) a;
            DmtEditText dmtEditText = (DmtEditText) m121029a((int) R.id.bg_);
            C7573i.m23582a((Object) dmtEditText, "lat_value");
            this.f98574c = dmtEditText;
            DmtEditText dmtEditText2 = (DmtEditText) m121029a((int) R.id.bt_);
            C7573i.m23582a((Object) dmtEditText2, "lng_value");
            this.f98573b = dmtEditText2;
            ButtonTitleBar buttonTitleBar = this.f98579t;
            if (buttonTitleBar == null) {
                C7573i.m23583a("mButtonTitleBar");
            }
            DmtTextView titleView = buttonTitleBar.getTitleView();
            C7573i.m23582a((Object) titleView, "mButtonTitleBar.titleView");
            this.f98580u = titleView;
            TextView textView = (TextView) m121029a((int) R.id.h3);
            C7573i.m23582a((Object) textView, "apply_latlng");
            this.f98581v = textView;
            ButtonTitleBar buttonTitleBar2 = this.f98579t;
            if (buttonTitleBar2 == null) {
                C7573i.m23583a("mButtonTitleBar");
            }
            buttonTitleBar2.getStartBtn().setOnClickListener(new C37819b(this));
            ButtonTitleBar buttonTitleBar3 = this.f98579t;
            if (buttonTitleBar3 == null) {
                C7573i.m23583a("mButtonTitleBar");
            }
            buttonTitleBar3.getEndBtn().setOnClickListener(new C37820c(this));
            TextView textView2 = this.f98581v;
            if (textView2 == null) {
                C7573i.m23583a("mApply");
            }
            textView2.setOnClickListener(new C37821d(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar");
    }

    /* renamed from: a */
    public static final /* synthetic */ DmtEditText m121030a(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
        DmtEditText dmtEditText = testPoiMapPickUpActivity.f98574c;
        if (dmtEditText == null) {
            C7573i.m23583a("mLat");
        }
        return dmtEditText;
    }

    /* renamed from: b */
    public static final /* synthetic */ DmtEditText m121032b(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
        DmtEditText dmtEditText = testPoiMapPickUpActivity.f98573b;
        if (dmtEditText == null) {
            C7573i.m23583a("mLng");
        }
        return dmtEditText;
    }

    /* renamed from: c */
    public static final /* synthetic */ MapLayout m121034c(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
        MapLayout mapLayout = testPoiMapPickUpActivity.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        return mapLayout;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putDouble("latitude", this.f98575d);
        bundle.putDouble("longitude", this.f98576e);
    }

    /* renamed from: a */
    private final void m121031a(Bundle bundle) {
        this.f98575d = bundle.getDouble("latitude");
        this.f98576e = bundle.getDouble("longitude");
        DmtEditText dmtEditText = this.f98574c;
        if (dmtEditText == null) {
            C7573i.m23583a("mLat");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f98575d));
        dmtEditText.setText(sb.toString());
        DmtEditText dmtEditText2 = this.f98573b;
        if (dmtEditText2 == null) {
            C7573i.m23583a("mLng");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(this.f98576e));
        dmtEditText2.setText(sb2.toString());
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onCreate", true);
        super.onCreate(bundle);
        m121035c();
        DmtTextView dmtTextView = this.f98580u;
        if (dmtTextView == null) {
            C7573i.m23583a("mTitle");
        }
        dmtTextView.setText(f98571w);
        ButtonTitleBar buttonTitleBar = this.f98579t;
        if (buttonTitleBar == null) {
            C7573i.m23583a("mButtonTitleBar");
        }
        DmtTextView endBtn = buttonTitleBar.getEndBtn();
        C7573i.m23582a((Object) endBtn, "mButtonTitleBar.endBtn");
        endBtn.setVisibility(0);
        ButtonTitleBar buttonTitleBar2 = this.f98579t;
        if (buttonTitleBar2 == null) {
            C7573i.m23583a("mButtonTitleBar");
        }
        buttonTitleBar2.getEndBtn().setText(R.string.di_);
        MapLayout mapLayout = this.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout.mo88952a(bundle, this);
        MapLayout mapLayout2 = this.f98572a;
        if (mapLayout2 == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout2.setOnMapClickListener(this);
        if (bundle == null) {
            m121036i();
        } else {
            m121031a(bundle);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo88969a(double d, double d2) {
        DmtEditText dmtEditText = this.f98574c;
        if (dmtEditText == null) {
            C7573i.m23583a("mLat");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(d));
        dmtEditText.setText(sb.toString());
        DmtEditText dmtEditText2 = this.f98573b;
        if (dmtEditText2 == null) {
            C7573i.m23583a("mLng");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.valueOf(d2));
        dmtEditText2.setText(sb2.toString());
        this.f98575d = d;
        this.f98576e = d2;
        MapLayout mapLayout = this.f98572a;
        if (mapLayout == null) {
            C7573i.m23583a("mPoiMap");
        }
        mapLayout.mo88949a(BitmapFactory.decodeResource(getResources(), R.drawable.avl), this.f98575d, this.f98576e);
    }
}
