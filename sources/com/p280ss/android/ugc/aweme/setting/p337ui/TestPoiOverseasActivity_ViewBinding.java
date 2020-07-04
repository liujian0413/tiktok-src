package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestPoiOverseasActivity_ViewBinding */
public class TestPoiOverseasActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private TestPoiOverseasActivity f98597a;

    /* renamed from: b */
    private View f98598b;

    /* renamed from: c */
    private View f98599c;

    /* renamed from: d */
    private View f98600d;

    /* renamed from: e */
    private View f98601e;

    public void unbind() {
        TestPoiOverseasActivity testPoiOverseasActivity = this.f98597a;
        if (testPoiOverseasActivity != null) {
            this.f98597a = null;
            testPoiOverseasActivity.fakeGps = null;
            testPoiOverseasActivity.mSchemaEditText = null;
            testPoiOverseasActivity.mTxtLat = null;
            testPoiOverseasActivity.mTxtLng = null;
            testPoiOverseasActivity.mTxtApply = null;
            testPoiOverseasActivity.latValue = null;
            testPoiOverseasActivity.lngValue = null;
            testPoiOverseasActivity.mTitle = null;
            testPoiOverseasActivity.mMccMnc = null;
            testPoiOverseasActivity.mLocationList = null;
            testPoiOverseasActivity.mMapGetPoint = null;
            this.f98598b.setOnClickListener(null);
            this.f98598b = null;
            this.f98599c.setOnClickListener(null);
            this.f98599c = null;
            this.f98600d.setOnClickListener(null);
            this.f98600d = null;
            this.f98601e.setOnClickListener(null);
            this.f98601e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public TestPoiOverseasActivity_ViewBinding(final TestPoiOverseasActivity testPoiOverseasActivity, View view) {
        this.f98597a = testPoiOverseasActivity;
        testPoiOverseasActivity.fakeGps = (SettingItemSwitch) Utils.findRequiredViewAsType(view, R.id.aek, "field 'fakeGps'", SettingItemSwitch.class);
        testPoiOverseasActivity.mSchemaEditText = (DmtEditText) Utils.findRequiredViewAsType(view, R.id.cz3, "field 'mSchemaEditText'", DmtEditText.class);
        testPoiOverseasActivity.mTxtLat = (TextView) Utils.findRequiredViewAsType(view, R.id.bg9, "field 'mTxtLat'", TextView.class);
        testPoiOverseasActivity.mTxtLng = (TextView) Utils.findRequiredViewAsType(view, R.id.bt9, "field 'mTxtLng'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.h3, "field 'mTxtApply' and method 'onConfigPoiOverseas'");
        testPoiOverseasActivity.mTxtApply = (TextView) Utils.castView(findRequiredView, R.id.h3, "field 'mTxtApply'", TextView.class);
        this.f98598b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                testPoiOverseasActivity.onConfigPoiOverseas();
            }
        });
        testPoiOverseasActivity.latValue = (DmtEditText) Utils.findRequiredViewAsType(view, R.id.bg_, "field 'latValue'", DmtEditText.class);
        testPoiOverseasActivity.lngValue = (DmtEditText) Utils.findRequiredViewAsType(view, R.id.bt_, "field 'lngValue'", DmtEditText.class);
        testPoiOverseasActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        testPoiOverseasActivity.mMccMnc = (TextView) Utils.findRequiredViewAsType(view, R.id.bxg, "field 'mMccMnc'", TextView.class);
        testPoiOverseasActivity.mLocationList = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bus, "field 'mLocationList'", RecyclerView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.bwv, "field 'mMapGetPoint' and method 'mapGetPoint'");
        testPoiOverseasActivity.mMapGetPoint = (TextView) Utils.castView(findRequiredView2, R.id.bwv, "field 'mMapGetPoint'", TextView.class);
        this.f98599c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                testPoiOverseasActivity.mapGetPoint();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.bfi, "method 'schemaJump'");
        this.f98600d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                testPoiOverseasActivity.schemaJump();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.jo, "method 'exit'");
        this.f98601e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                testPoiOverseasActivity.exit(view);
            }
        });
    }
}
