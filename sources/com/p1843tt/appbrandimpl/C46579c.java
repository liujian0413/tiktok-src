package com.p1843tt.appbrandimpl;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.experiment.MicroAppItemTypeExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.tt.appbrandimpl.c */
public final class C46579c extends Dialog implements OnClickListener {

    /* renamed from: a */
    private DmtTextView f120062a;

    /* renamed from: b */
    private View f120063b;

    /* renamed from: a */
    private void m146379a() {
        this.f120062a = (DmtTextView) findViewById(R.id.c5m);
        this.f120063b = findViewById(R.id.x_);
        this.f120062a.setTypeface(Typeface.defaultFromStyle(1));
        this.f120063b.setOnClickListener(this);
    }

    public C46579c(Context context) {
        super(context, R.style.uu);
    }

    public final void onClick(View view) {
        if (view.getId() == R.id.x_) {
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C6384b.m19835a().mo15287a(MicroAppItemTypeExperiment.class, true, "micro_app_item_type", C6384b.m19835a().mo15295d().micro_app_item_type, 0) == 1) {
            setContentView(R.layout.kq);
        } else {
            setContentView(R.layout.kp);
        }
        setCanceledOnTouchOutside(false);
        m146379a();
    }
}
