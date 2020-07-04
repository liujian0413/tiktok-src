package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.CountryAdapter.C21815b;
import com.p280ss.android.ugc.aweme.account.login.p974ui.WaveSideBar.C21860a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.CountryListActivity */
public class CountryListActivity extends AmeSSActivity {

    /* renamed from: a */
    public RecyclerView f58398a;

    /* renamed from: b */
    public ArrayList<C21566a> f58399b = new ArrayList<>();
    @BindView(2131492909)
    ImageView back;

    /* renamed from: c */
    public ArrayList<C21566a> f58400c = new ArrayList<>();

    /* renamed from: d */
    private WaveSideBar f58401d;
    @BindView(2131493421)
    EditText etSearch;
    @BindView(2131493426)
    TextView txtSearch;

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.t);
    }

    /* renamed from: a */
    private void m72934a() {
        setContentView((int) R.layout.b3);
        this.f58398a = (RecyclerView) findViewById(R.id.cx9);
        this.f58398a.setLayoutManager(new LinearLayoutManager(this));
        final CountryAdapter countryAdapter = new CountryAdapter(this.f58399b, R.layout.u7);
        this.f58398a.setAdapter(countryAdapter);
        countryAdapter.f58389a = new C21815b() {
            /* renamed from: a */
            public final void mo58190a(C21566a aVar) {
                if (aVar != null) {
                    C21170a.m71340a(aVar);
                    CountryListActivity.this.onBackPressed();
                }
            }
        };
        this.f58401d = (WaveSideBar) findViewById(R.id.d6o);
        this.f58401d.setOnSelectIndexItemListener(new C21860a() {
            /* renamed from: a */
            public final void mo58192a(String str) {
                for (int i = 0; i < CountryListActivity.this.f58399b.size(); i++) {
                    if (TextUtils.equals(((C21566a) CountryListActivity.this.f58399b.get(i)).f57899b, str)) {
                        ((LinearLayoutManager) CountryListActivity.this.f58398a.getLayoutManager()).mo5417a(i, 0);
                        return;
                    }
                }
            }
        });
        C25713b.m84474a((Activity) this, (View) this.etSearch);
        this.txtSearch.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String obj = CountryListActivity.this.etSearch.getText().toString();
                CountryListActivity.this.f58399b.clear();
                Iterator it = CountryListActivity.this.f58400c.iterator();
                while (it.hasNext()) {
                    C21566a aVar = (C21566a) it.next();
                    if (CountryListActivity.this.getString(aVar.f57898a).contains(obj)) {
                        CountryListActivity.this.f58399b.add(aVar);
                    }
                }
                countryAdapter.notifyDataSetChanged();
            }
        });
        this.back.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                CountryListActivity.this.onBackPressed();
            }
        });
    }

    /* renamed from: b */
    private void m72935b() {
        ArrayList<C21566a> arrayList = new ArrayList<>(C21566a.m72288b());
        List asList = Arrays.asList(new String[]{"CN", "HK", "MO", "TW"});
        C21566a[] aVarArr = new C21566a[asList.size()];
        for (C21566a aVar : arrayList) {
            int indexOf = asList.indexOf(aVar.f57900c);
            if (indexOf >= 0) {
                C21566a a = C21566a.m72286a(aVar.f57898a, aVar.f57899b, aVar.f57900c, aVar.f57901d);
                a.mo57752a("#");
                aVarArr[indexOf] = a;
            }
        }
        arrayList.addAll(0, Arrays.asList(aVarArr));
        this.f58400c.addAll(arrayList);
        this.f58399b.addAll(arrayList);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(R.anim.s, 0);
        m72935b();
        m72934a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", false);
    }
}
