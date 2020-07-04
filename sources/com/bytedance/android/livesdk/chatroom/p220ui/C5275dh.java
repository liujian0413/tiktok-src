package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C4866ab;
import com.bytedance.android.livesdk.config.C5864b;
import com.bytedance.android.livesdk.sharedpref.Properties;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dh */
public final class C5275dh extends Dialog {

    /* renamed from: a */
    private List<C4866ab> f15425a;

    /* renamed from: b */
    private C4866ab f15426b;

    /* renamed from: c */
    private Map<C4866ab, TextView> f15427c;

    /* renamed from: d */
    private boolean f15428d;

    /* renamed from: e */
    private LuckyBoxSendAdapter f15429e;

    /* renamed from: f */
    private LuckyBoxDescriptionAdapter f15430f;

    /* renamed from: g */
    private TextView f15431g;

    /* renamed from: h */
    private View f15432h;

    /* renamed from: i */
    private TextView f15433i;

    /* renamed from: j */
    private CheckBox f15434j;

    /* renamed from: k */
    private LinearLayoutManager f15435k;

    /* renamed from: l */
    private OnClickListener f15436l;

    /* renamed from: m */
    private OnClickListener f15437m;

    /* renamed from: n */
    private C5148a f15438n;

    /* renamed from: a */
    private void m16930a() {
        if (this.f15425a != null && this.f15425a.size() > 0) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.dfb);
            for (C4866ab abVar : this.f15425a) {
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.axu, linearLayout, false);
                textView.setText(abVar.f13921b);
                textView.setSelected(false);
                textView.setOnClickListener(new C5277dj(this, abVar));
                this.f15427c.put(abVar, textView);
                linearLayout.addView(textView);
            }
            m16933b((C4866ab) this.f15425a.get(0));
        }
    }

    /* renamed from: b */
    private void m16933b(C4866ab abVar) {
        this.f15426b = abVar;
        m16932a(abVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m16931a(View view) {
        view.setScaleX(0.64f);
        view.setScaleY(0.64f);
    }

    /* renamed from: a */
    private void m16932a(C4866ab abVar) {
        boolean z;
        if (this.f15427c != null && this.f15427c.size() > 0) {
            for (C4866ab abVar2 : this.f15425a) {
                TextView textView = (TextView) this.f15427c.get(abVar2);
                if (abVar2 == abVar) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setSelected(z);
            }
        }
        this.f15431g.setText(abVar.f13922c.f13925a);
        if (TextUtils.isEmpty(abVar.f13922c.f13926b)) {
            this.f15432h.setVisibility(8);
        } else {
            this.f15432h.setVisibility(0);
        }
        this.f15429e.mo13382a(abVar.f13923d);
        this.f15434j.setText(C3358ac.m12517a((int) R.string.faz, C9048ao.m27018b(abVar.f13924e)));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            dismiss();
            return;
        }
        window.requestFeature(1);
        window.setBackgroundDrawable(new BitmapDrawable());
        setContentView(R.layout.aoh);
        View findViewById = findViewById(R.id.cwn);
        if (!this.f15428d) {
            findViewById.post(new C5276di(findViewById));
        }
        this.f15431g = (TextView) findViewById(R.id.e3d);
        this.f15432h = findViewById(R.id.qc);
        this.f15433i = (TextView) findViewById(R.id.dt7);
        this.f15434j = (CheckBox) findViewById(R.id.vl);
        View findViewById2 = findViewById(R.id.rg);
        this.f15432h.setOnClickListener(this.f15437m);
        findViewById2.setOnClickListener(this.f15436l);
        if (((Boolean) C5864b.f17271Z.mo10240a()).booleanValue()) {
            this.f15434j.setChecked(false);
            this.f15434j.setVisibility(8);
        } else {
            this.f15434j.setChecked(TTLiveSDKContext.getHostService().mo22361b().mo23190b().mo22767a(Properties.SEND_DELAY_RED_ENVELOPE));
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bnd);
        this.f15429e = new LuckyBoxSendAdapter(from, this.f15438n);
        recyclerView.setAdapter(this.f15429e);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.bn7);
        this.f15430f = new LuckyBoxDescriptionAdapter(from, R.layout.axs);
        recyclerView2.setAdapter(this.f15430f);
        this.f15435k = new LinearLayoutManager(getContext(), 0, false);
        recyclerView2.setLayoutManager(this.f15435k);
        m16930a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13538a(C4866ab abVar, View view) {
        m16933b(abVar);
    }
}
