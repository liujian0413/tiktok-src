package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.google.common.collect.ImmutableList;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusCountryAdapter.C21836b;
import com.p280ss.android.ugc.aweme.account.login.p974ui.WaveSideBar.C21860a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity */
public class MusCountryListActivity extends AmeSSActivity {

    /* renamed from: a */
    public RecyclerView f58465a;

    /* renamed from: b */
    public ArrayList<C21566a> f58466b = new ArrayList<>();
    @BindView(2131492909)
    ImageView back;

    /* renamed from: c */
    private WaveSideBar f58467c;

    /* renamed from: d */
    private ArrayList<C21566a> f58468d = new ArrayList<>();
    @BindView(2131493421)
    EditText etSearch;
    @BindView(2131493426)
    TextView txtSearch;

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private void m72981b() {
        ImmutableList b = C21566a.m72288b();
        this.f58468d.addAll(b);
        this.f58466b.addAll(b);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.t);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
    }

    /* renamed from: a */
    private void m72980a() {
        setContentView((int) R.layout.b3);
        this.f58465a = (RecyclerView) findViewById(R.id.cx9);
        this.f58465a.setLayoutManager(new LinearLayoutManager(this));
        MusCountryAdapter musCountryAdapter = new MusCountryAdapter(this.f58466b, R.layout.u7);
        this.f58465a.setAdapter(musCountryAdapter);
        musCountryAdapter.f58456a = new C21836b() {
            /* renamed from: a */
            public final void mo58226a(C21566a aVar) {
                if (aVar != null) {
                    C21170a.m71340a(aVar);
                    MusCountryListActivity.this.onBackPressed();
                }
            }
        };
        this.f58467c = (WaveSideBar) findViewById(R.id.d6o);
        this.f58467c.setOnSelectIndexItemListener(new C21860a() {
            /* renamed from: a */
            public final void mo58192a(String str) {
                for (int i = 0; i < MusCountryListActivity.this.f58466b.size(); i++) {
                    if (TextUtils.equals(((C21566a) MusCountryListActivity.this.f58466b.get(i)).f57899b, str)) {
                        ((LinearLayoutManager) MusCountryListActivity.this.f58465a.getLayoutManager()).mo5417a(i, 0);
                        return;
                    }
                }
            }
        });
        C25713b.m84474a((Activity) this, (View) this.etSearch);
        this.txtSearch.setOnClickListener(new C21876m(this, musCountryAdapter));
        this.back.setOnClickListener(new C21877n(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58227a(View view) {
        onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onCreate", true);
        super.onCreate(bundle);
        m72981b();
        m72980a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58228a(MusCountryAdapter musCountryAdapter, View view) {
        String lowerCase = this.etSearch.getText().toString().toLowerCase();
        this.f58466b.clear();
        Iterator it = this.f58468d.iterator();
        while (it.hasNext()) {
            C21566a aVar = (C21566a) it.next();
            if (getString(aVar.f57898a).toLowerCase().contains(lowerCase)) {
                this.f58466b.add(aVar);
            }
        }
        musCountryAdapter.notifyDataSetChanged();
    }
}
