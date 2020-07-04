package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.profile.model.SelelctCityModel;
import com.p280ss.android.ugc.aweme.profile.p1487ui.WheelPicker.C36324a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36005ae;
import com.p280ss.android.ugc.aweme.profile.presenter.C36043q;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dz */
public final class C36442dz extends PopupWindow implements C36043q, C36324a {

    /* renamed from: a */
    WheelPicker f95619a;

    /* renamed from: b */
    WheelPicker f95620b;

    /* renamed from: c */
    public C36005ae f95621c = new C36005ae();

    /* renamed from: d */
    public String f95622d;

    /* renamed from: e */
    public int f95623e;

    /* renamed from: f */
    public C36444a f95624f;

    /* renamed from: g */
    private TextView f95625g;

    /* renamed from: h */
    private Activity f95626h;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.dz$a */
    public interface C36444a {
        /* renamed from: a */
        void mo71404a(boolean z, String str);
    }

    /* renamed from: a */
    public final void mo92514a() {
        if (!C36446ea.m117667a(this.f95626h)) {
            C10761a.m31403c((Context) this.f95626h, this.f95626h.getResources().getString(R.string.cjm)).mo25750a();
            return;
        }
        if (this.f95626h != null && !this.f95626h.isFinishing() && !isShowing()) {
            showAtLocation(this.f95626h.getWindow().getDecorView(), 80, 0, 0);
        }
    }

    public C36442dz(Activity activity) {
        super(activity);
        this.f95626h = activity;
        View inflate = ((LayoutInflater) AwemeApplication.m21341a().getSystemService("layout_inflater")).inflate(R.layout.agk, null);
        m117662b(inflate);
        m117661a(inflate);
    }

    /* renamed from: b */
    private void m117662b(View view) {
        setContentView(view);
        setWidth(C9738o.m28691a((Context) AwemeApplication.m21341a()));
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(this.f95626h.getResources().getColor(R.color.ayd)));
        setFocusable(true);
        setOutsideTouchable(true);
        setAnimationStyle(R.style.wn);
        update();
    }

    /* renamed from: a */
    private void m117661a(View view) {
        this.f95625g = (TextView) view.findViewById(R.id.dyz);
        this.f95619a = (WheelPicker) view.findViewById(R.id.bwp);
        this.f95619a.setOnItemSelectedListener(this);
        this.f95620b = (WheelPicker) view.findViewById(R.id.bwq);
        this.f95620b.setOnItemSelectedListener(this);
        this.f95625g.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                boolean z;
                ClickInstrumentation.onClick(view);
                if (C36442dz.this.f95624f != null) {
                    C36444a aVar = C36442dz.this.f95624f;
                    boolean z2 = false;
                    if (C36442dz.this.f95623e != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo71404a(z, C36442dz.this.f95622d);
                    if (C36442dz.this.f95623e != 0) {
                        z2 = true;
                    }
                    SelelctCityModel.uploadLocation(z2);
                }
                C36442dz.this.dismiss();
            }
        });
        this.f95621c.mo66537a(this);
        this.f95621c.mo56976a(new Object[0]);
    }

    /* renamed from: a */
    public final void mo91732a(List<String> list, List<String> list2) {
        if (this.f95619a != null && this.f95620b != null && list != null && list2 != null) {
            this.f95619a.setData(list);
            this.f95620b.setData(list2);
        }
    }

    /* renamed from: a */
    public final void mo92442a(WheelPicker wheelPicker, Object obj, int i) {
        int id = wheelPicker.getId();
        if (id == R.id.bwp) {
            this.f95623e = i;
            this.f95620b.setData(((SelelctCityModel) this.f95621c.mo66539h()).getCityData(i));
            this.f95620b.setSelectedItemPosition(0);
            this.f95622d = String.valueOf(this.f95620b.getData().get(0));
            return;
        }
        if (id == R.id.bwq) {
            this.f95622d = String.valueOf(obj);
        }
    }
}
