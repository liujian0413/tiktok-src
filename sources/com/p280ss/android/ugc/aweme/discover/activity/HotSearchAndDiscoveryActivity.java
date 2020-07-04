package com.p280ss.android.ugc.aweme.discover.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p280ss.android.ugc.aweme.discover.p1178d.C26614a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27029ba;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27035bc;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverFragment;
import com.p280ss.android.ugc.aweme.discover.p1185ui.DiscoverFragment.Style;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchContainerFragment;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchScanView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchScanView.C26984a;
import com.p280ss.android.ugc.aweme.main.experiment.C33002a;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity */
public class HotSearchAndDiscoveryActivity extends AmeSSActivity {

    /* renamed from: a */
    public SearchScanView f69374a;

    /* renamed from: b */
    public EditText f69375b;

    /* renamed from: c */
    Style f69376c;

    /* renamed from: d */
    private Fragment f69377d;

    /* renamed from: e */
    private ImageView f69378e;

    /* renamed from: f */
    private View f69379f;

    /* renamed from: g */
    private ImageView f69380g;

    /* renamed from: h */
    private ImageView f69381h;

    /* renamed from: i */
    private boolean f69382i;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo67871a() {
        m86690a(false);
    }

    /* renamed from: d */
    private void m86693d() {
        if (this.f69376c == Style.HOT_SEARCH_WITH_DISCOVER) {
            C23256c.m76347a(this, 3);
        }
    }

    /* renamed from: g */
    private void m86696g() {
        if (this.f69376c != Style.KEYWORD_SEARCH) {
            onBackPressed();
        }
    }

    public void finish() {
        super.finish();
        if (this.f69376c == Style.HOT_SEARCH_WITH_DISCOVER) {
            C23256c.m76348b(this, 3);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: c */
    private void m86692c() {
        this.f69378e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                KeyboardUtils.m77057c(HotSearchAndDiscoveryActivity.this.f69375b);
                HotSearchAndDiscoveryActivity.this.onBackPressed();
            }
        });
        this.f69379f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
        this.f69374a.setOnInternalClickListener(new C26984a() {
            /* renamed from: a */
            public final void mo67879a(View view) {
                HotSearchAndDiscoveryActivity.this.mo67871a();
            }

            /* renamed from: b */
            public final void mo67880b(View view) {
                C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
                QRCodePermissionActivity.m119022a(HotSearchAndDiscoveryActivity.this, false);
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f69378e.setImageDrawable(getResources().getDrawable(R.drawable.al3));
    }

    /* renamed from: b */
    private void m86691b() {
        switch (C33002a.m106650a()) {
            case 0:
                this.f69376c = Style.KEYWORD_SEARCH;
                break;
            case 1:
                this.f69376c = Style.HOT_SEARCH;
                return;
            case 2:
                this.f69376c = Style.HOT_SEARCH_WITH_DISCOVER;
                return;
        }
    }

    public void setStatusBarColor() {
        if (C6399b.m19946v()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a3z).init();
        }
    }

    /* renamed from: e */
    private void m86694e() {
        int i;
        this.f69375b.setHint(C23338f.m76567e().mo60623a("place_holder", C23481i.m77091b(R.string.cv7)));
        ImageView imageView = this.f69378e;
        if (this.f69376c == Style.HOT_SEARCH) {
            i = R.drawable.cmw;
        } else {
            i = R.drawable.al3;
        }
        imageView.setImageResource(i);
        if (this.f69376c == Style.HOT_SEARCH && VERSION.SDK_INT >= 19) {
            this.f69378e.getDrawable().setAutoMirrored(true);
        }
        C26614a.m87410a(this.f69378e);
        if (this.f69376c != Style.KEYWORD_SEARCH) {
            C0633q a = getSupportFragmentManager().mo2645a();
            this.f69377d = DiscoverFragment.m88238a(this.f69376c, false);
            a.mo2599b(R.id.aoy, this.f69377d);
            a.mo2604c();
        } else {
            mo67871a();
        }
        if (this.f69382i) {
            this.f69374a.mo69772b();
        } else {
            this.f69374a.mo69771a();
        }
    }

    /* renamed from: f */
    private void m86695f() {
        this.f69379f = findViewById(R.id.ami);
        this.f69378e = (ImageView) findViewById(R.id.jo);
        this.f69374a = (SearchScanView) findViewById(R.id.d1g);
        this.f69375b = (EditText) findViewById(R.id.agn);
        this.f69380g = (ImageView) findViewById(R.id.pw);
        this.f69381h = (ImageView) findViewById(R.id.bbw);
        this.f69375b.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 3) {
                    return false;
                }
                HotSearchAndDiscoveryActivity.this.mo67871a();
                KeyboardUtils.m77057c(HotSearchAndDiscoveryActivity.this.f69375b);
                return true;
            }
        });
        this.f69375b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                HotSearchAndDiscoveryActivity.this.f69375b.setCursorVisible(true);
                HotSearchAndDiscoveryActivity.this.f69374a.mo69772b();
            }
        });
    }

    @C7709l
    public void onSearchHistoryEvent(SearchHistory searchHistory) {
        this.f69375b.setText(searchHistory.keyword);
        m86690a(true);
    }

    public void onClick(View view) {
        this.f69375b.setText("");
        this.f69375b.clearFocus();
        KeyboardUtils.m77057c(this.f69375b);
        m86696g();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.c9);
        if (getIntent() != null) {
            this.f69382i = getIntent().getBooleanExtra("intent_extra_from_discover", false);
        }
        m86691b();
        m86695f();
        m86692c();
        m86694e();
        m86693d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity", "onCreate", false);
    }

    public void onTextChanged(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f69380g.getVisibility() == 8) {
            this.f69380g.setVisibility(0);
        } else if (TextUtils.isEmpty(charSequence) && this.f69380g.getVisibility() == 0) {
            this.f69380g.setVisibility(8);
        }
        if (!this.f69382i) {
            if (TextUtils.isEmpty(charSequence)) {
                this.f69374a.mo69771a();
                return;
            }
            this.f69374a.mo69772b();
        }
    }

    /* renamed from: a */
    public final void mo67872a(int i) {
        if (C6399b.m19944t()) {
            if (i != C27029ba.f71319a) {
                if (i == C27029ba.f71321c) {
                    this.f69375b.setHint(getString(R.string.cv_));
                    return;
                } else if (i == C27029ba.f71323e) {
                    this.f69375b.setHint(getString(R.string.cv8));
                    return;
                } else if (i == C27029ba.f71324f) {
                    this.f69375b.setHint(getString(R.string.cv9));
                    return;
                } else {
                    int i2 = C27029ba.f71320b;
                }
            }
            this.f69375b.setHint(getString(R.string.cv7));
        }
    }

    /* renamed from: a */
    private void m86690a(boolean z) {
        String obj = this.f69375b.getText().toString();
        if (!C27035bc.m88798a(obj)) {
            KeyboardUtils.m77057c(this.f69375b);
            boolean z2 = false;
            this.f69375b.setCursorVisible(false);
            this.f69378e.setImageDrawable(getResources().getDrawable(R.drawable.cmw));
            C0608j supportFragmentManager = getSupportFragmentManager();
            SearchContainerFragment searchContainerFragment = (SearchContainerFragment) supportFragmentManager.mo2644a("container");
            C0633q a = supportFragmentManager.mo2645a();
            String obj2 = this.f69375b.getText().toString();
            if (!TextUtils.isEmpty(obj2)) {
                SearchHistoryManager.inst().recordSearchHistory(new SearchHistory(obj2, 0));
            }
            SearchResultParam keyword = new SearchResultParam().setSearchFrom(z ? 1 : 0).setKeyword(obj);
            if (searchContainerFragment == null) {
                searchContainerFragment = SearchContainerFragment.m88488a(keyword);
                a.mo2586a(R.id.aoy, searchContainerFragment, "container");
                if (this.f69376c != Style.KEYWORD_SEARCH) {
                    if (this.f69377d != null) {
                        a.mo2601b(this.f69377d);
                    }
                    a.mo2589a("container");
                }
            } else {
                z2 = true;
            }
            searchContainerFragment.mo69663a((C0935e) new C0935e() {
                public final void onPageScrollStateChanged(int i) {
                }

                public final void onPageScrolled(int i, float f, int i2) {
                }

                public final void onPageSelected(int i) {
                    HotSearchAndDiscoveryActivity.this.mo67872a(i);
                }
            });
            mo67872a(searchContainerFragment.mo69660a());
            a.mo2606d();
            if (z2) {
                searchContainerFragment.mo69666b(keyword);
            }
        }
    }

    /* renamed from: a */
    public static void m86689a(Context context, boolean z) {
        Intent intent = new Intent(context, HotSearchAndDiscoveryActivity.class);
        intent.putExtra("intent_extra_from_discover", z);
        context.startActivity(intent);
    }
}
