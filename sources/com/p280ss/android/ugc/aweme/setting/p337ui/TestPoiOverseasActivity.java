package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23484l;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35408q;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity */
public class TestPoiOverseasActivity extends AmeBaseActivity implements C10813a {

    /* renamed from: a */
    private double[][] f98587a = {new double[]{35.6876148d, 139.7567735d}, new double[]{35.7078225d, 139.7660301d}, new double[]{39.4972306d, -116.5261509d}, new double[]{35.4634218d, -97.5173063d}, new double[]{12.8966982d, 100.8938733d}, new double[]{12.9723444d, 100.973703d}, new double[]{50.8812038d, 10.1427705d}, new double[]{39.9252825d, -8.7372812d}, new double[]{38.5318013d, 35.4382321d}, new double[]{37.2761492d, 34.7951663d}, new double[]{24.4419429d, 54.6478849d}, new double[]{24.4382834d, 54.5702582d}, new double[]{55.797254d, 37.5471293d}, new double[]{51.7548197d, -1.2565555d}};
    SettingItemSwitch fakeGps;
    DmtEditText latValue;
    DmtEditText lngValue;
    RecyclerView mLocationList;
    TextView mMapGetPoint;
    TextView mMccMnc;
    DmtEditText mSchemaEditText;
    TextView mTitle;
    TextView mTxtApply;
    TextView mTxtLat;
    TextView mTxtLng;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity$a */
    static class C37824a extends C1262a<C37826c> {

        /* renamed from: a */
        private Context f98588a;

        /* renamed from: b */
        private List<C37825b> f98589b;

        public final int getItemCount() {
            if (this.f98589b == null) {
                return 0;
            }
            return this.f98589b.size();
        }

        private C37824a(Context context, List<C37825b> list) {
            this.f98588a = context;
            this.f98589b = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C37826c cVar, int i) {
            cVar.mo95269a((C37825b) this.f98589b.get(i));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37826c onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C37826c(LayoutInflater.from(this.f98588a).inflate(R.layout.f0, viewGroup, false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity$b */
    static class C37825b {

        /* renamed from: a */
        public String f98590a;

        /* renamed from: b */
        public double f98591b;

        /* renamed from: c */
        public double f98592c;

        C37825b(String str, double[] dArr) {
            this.f98590a = str;
            this.f98591b = dArr[0];
            this.f98592c = dArr[1];
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity$c */
    static class C37826c extends C1293v {

        /* renamed from: a */
        public Context f98593a;

        /* renamed from: b */
        private TextView f98594b;

        C37826c(View view) {
            super(view);
            this.f98593a = view.getContext();
            this.f98594b = (TextView) view.findViewById(R.id.bv3);
        }

        /* renamed from: a */
        public final void mo95269a(final C37825b bVar) {
            this.f98594b.setText(bVar.f98590a);
            this.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (!C35408q.m114371a().mo90149b()) {
                        C37883aj.m121128a(Toast.makeText(C37826c.this.f98593a, "enable toggle first", 0));
                        return;
                    }
                    C35408q.m114371a().mo90148a(new double[]{bVar.f98591b, bVar.f98592c});
                    C37883aj.m121128a(Toast.makeText(C37826c.this.f98593a, "lat & lng saved successfully!", 0));
                }
            });
        }
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.f1;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    private String m121040c() {
        StringBuilder sb = new StringBuilder();
        sb.append("getNetworkOperator:");
        sb.append(C23484l.m77112a());
        sb.append("\ngetSimOperator:");
        sb.append(C23484l.m77113a(this, ""));
        return sb.toString();
    }

    public void mapGetPoint() {
        if (!C35408q.m114371a().mo90149b()) {
            C37884ak.m121129a(Toast.makeText(this, "enable toggle first", 0));
        } else {
            startActivityForResult(new Intent(this, TestPoiMapPickUpActivity.class), 666);
        }
    }

    public void schemaJump() {
        String str = "";
        if (this.mSchemaEditText.getText() != null) {
            str = this.mSchemaEditText.getText().toString().trim();
        }
        if (TextUtils.isEmpty(str)) {
            C37884ak.m121129a(Toast.makeText(this, "please input schema!", 0));
        } else {
            C7195s.m22438a().mo18682a(str);
        }
    }

    public void onConfigPoiOverseas() {
        if (!C35408q.m114371a().mo90149b()) {
            C37884ak.m121129a(Toast.makeText(this, "enable toggle first", 0));
            return;
        }
        String obj = this.latValue.getEditableText().toString();
        String obj2 = this.lngValue.getEditableText().toString();
        if (C6319n.m19593a(obj) || C6319n.m19593a(obj2)) {
            C37884ak.m121129a(Toast.makeText(this, "must set both lat & lng", 0));
            return;
        }
        double parseDouble = Double.parseDouble(obj);
        double parseDouble2 = Double.parseDouble(obj2);
        if (Math.abs(parseDouble) > 90.0d) {
            C37884ak.m121129a(Toast.makeText(this, "lat should be set from -90 to 90", 0));
        } else if (Math.abs(parseDouble2) > 180.0d) {
            C37884ak.m121129a(Toast.makeText(this, "lng should be set from -180 to 180", 0));
        } else {
            C35408q.m114371a().mo90146a(obj, obj2);
        }
    }

    /* renamed from: d */
    private List<C37825b> m121041d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C37825b("日本——二の丸庭園", this.f98587a[0]));
        arrayList.add(new C37825b("日本——Yushima Tenmangu", this.f98587a[1]));
        arrayList.add(new C37825b("美国——Sonic Drive-In", this.f98587a[2]));
        arrayList.add(new C37825b("美国——Chesapeake Energy Arena", this.f98587a[3]));
        arrayList.add(new C37825b("泰国——Underwater World Pattaya", this.f98587a[4]));
        arrayList.add(new C37825b("泰国——Pattaya Sheep farms", this.f98587a[5]));
        arrayList.add(new C37825b("德国——schönen Feriendorf Frauensee", this.f98587a[6]));
        arrayList.add(new C37825b("葡萄牙——Vista Alegre", this.f98587a[7]));
        arrayList.add(new C37825b("土耳其——埃尔吉耶斯山Erciyes Dağı", this.f98587a[8]));
        arrayList.add(new C37825b("土耳其——Topaşır Milli Parkı", this.f98587a[9]));
        arrayList.add(new C37825b("阿拉伯——阿布扎比国际机场", this.f98587a[10]));
        arrayList.add(new C37825b("阿拉伯——Al Raha Beach Hotel", this.f98587a[11]));
        arrayList.add(new C37825b("莫斯科——Центральный дом авиации и космонавтики ДОСААФ РФ", this.f98587a[12]));
        arrayList.add(new C37825b("英国——牛津大学University of Oxford", this.f98587a[13]));
        return arrayList;
    }

    public void exit(View view) {
        finish();
    }

    public void OnSettingItemClick(View view) {
        if (view.getId() == R.id.aek) {
            boolean z = !this.fakeGps.mo26028a();
            C35408q.m114371a().mo90147a(z);
            this.fakeGps.setChecked(z);
            this.fakeGps.setBackground(getResources().getDrawable(R.color.a5o));
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onCreate", true);
        super.onCreate(bundle);
        this.fakeGps.setChecked(C35408q.m114371a().mo90149b());
        this.fakeGps.setOnSettingItemClickListener(this);
        this.mTitle.setText("POI FAKE GPS");
        this.mTxtLat.setText("latitude");
        this.mTxtLng.setText("longitude");
        this.mTxtApply.setText("Apply");
        this.mMccMnc.setText(m121040c());
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.mo5427b(1);
        this.mLocationList.setLayoutManager(wrapLinearLayoutManager);
        this.mLocationList.setAdapter(new C37824a(this, m121041d()));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 666) {
                DmtEditText dmtEditText = this.latValue;
                StringBuilder sb = new StringBuilder();
                sb.append(intent.getDoubleExtra("latitude", 0.0d));
                dmtEditText.setText(sb.toString());
                DmtEditText dmtEditText2 = this.lngValue;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(intent.getDoubleExtra("longitude", 0.0d));
                dmtEditText2.setText(sb2.toString());
            }
            super.onActivityResult(i, i2, intent);
        }
    }
}
