package com.p280ss.android.ugc.aweme.search.activity;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.p1052b.C23148c;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.p1052b.C23154h;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.search.C37382e;
import com.p280ss.android.ugc.aweme.search.model.SearchEnterParam;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity */
public final class SearchResultActivity extends JediBaseActivity implements C11592h, C23149d {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f97607b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SearchResultActivity.class), "asyncInflater", "getAsyncInflater()Lcom/ss/android/ugc/aweme/ainflate/AsyncInflater;"))};

    /* renamed from: c */
    public static final C37377a f97608c = new C37377a(null);

    /* renamed from: d */
    private SearchResultParam f97609d;

    /* renamed from: e */
    private final C7541d f97610e;

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$a */
    public static final class C37377a {
        private C37377a() {
        }

        public /* synthetic */ C37377a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m119970a(Context context, SearchResultParam searchResultParam, SearchEnterParam searchEnterParam, Bundle bundle) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(searchResultParam, "param");
            Intent intent = new Intent();
            intent.putExtra(C37382e.f97612a.getSearchResultFragmentKeySearchParam(), searchResultParam);
            C37382e.f97612a.addEnterParamForIntent(intent, searchEnterParam);
            intent.setClass(context, SearchResultActivity.class);
            if (bundle == null || VERSION.SDK_INT < 21) {
                context.startActivity(intent);
            } else {
                context.startActivity(intent, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.activity.SearchResultActivity$b */
    static final class C37378b extends Lambda implements C7561a<C23154h> {

        /* renamed from: a */
        final /* synthetic */ SearchResultActivity f97611a;

        C37378b(SearchResultActivity searchResultActivity) {
            this.f97611a = searchResultActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C23154h invoke() {
            return new C23154h(this.f97611a);
        }
    }

    /* renamed from: i */
    private final C23148c m119969i() {
        return (C23148c) this.f97610e.getValue();
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C23148c getInflater() {
        return m119969i();
    }

    public final void setStatusBarColor() {
        C37382e.f97612a.setupStatusBar(this);
    }

    public SearchResultActivity() {
        for (C0042h a : C37382e.f97612a.getLifecycleObserverForSearchResultActivity(this)) {
            mo29173d().getLifecycle().mo55a(a);
        }
        this.f97610e = C7546e.m23569a(new C37378b(this));
    }

    public final void onBackPressed() {
        boolean z;
        Fragment a = getSupportFragmentManager().mo2644a("container");
        if (C37382e.f97612a.isSearchResultFragment(a)) {
            z = C37382e.f97612a.handleBackPressed(a);
        } else {
            z = false;
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    /* renamed from: g */
    private final SearchResultParam m119967g() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(POIService.KEY_KEYWORD);
            String stringExtra2 = intent.getStringExtra("display_keyword");
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = intent.getStringExtra("displayKeyword");
            }
            String stringExtra3 = intent.getStringExtra(C37382e.f97612a.getSearchResultFragmentKeyEnterFrom());
            int intExtra = intent.getIntExtra(C37382e.f97612a.getSearchResultFragmentKeySearchFrom(), 0);
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra3)) {
                SearchResultParam realSearchWord = new SearchResultParam().setRealSearchWord(stringExtra);
                if (!TextUtils.isEmpty(stringExtra2)) {
                    stringExtra = stringExtra2;
                }
                return realSearchWord.setKeyword(stringExtra).setEnterFrom(stringExtra3).setSearchFrom(intExtra);
            }
        }
        return null;
    }

    /* renamed from: h */
    private final void m119968h() {
        if (getIntent() != null) {
            Intent intent = getIntent();
            this.f97609d = (SearchResultParam) intent.getSerializableExtra(C37382e.f97612a.getSearchResultFragmentKeySearchParam());
            SearchEnterParam searchEnterParam = (SearchEnterParam) intent.getSerializableExtra(C37382e.f97612a.getSearchResultFragmentKeySearchEnterParam());
            if (this.f97609d == null) {
                this.f97609d = m119967g();
            }
            if (this.f97609d == null) {
                finish();
                return;
            }
            SearchResultParam searchResultParam = this.f97609d;
            if (searchResultParam == null) {
                C7573i.m23580a();
            }
            searchResultParam.setOpenNewSearchContainer(true);
            SearchResultParam searchResultParam2 = this.f97609d;
            if (searchResultParam2 == null) {
                C7573i.m23580a();
            }
            m119966a(searchResultParam2, searchEnterParam);
            return;
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (android.text.TextUtils.equals(r0.getEnterFrom(), "push") != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r3 = this;
            super.finish()
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r3.f97609d
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r3.f97609d
            if (r0 != 0) goto L_0x000e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x000e:
            java.lang.String r0 = r0.getEnterFrom()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "douyin_assistant"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x0035
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r3.f97609d
            if (r0 != 0) goto L_0x0025
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0025:
            java.lang.String r0 = r0.getEnterFrom()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "push"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0046
        L_0x0035:
            com.ss.android.ugc.aweme.search.e r0 = com.p280ss.android.ugc.aweme.search.C37382e.f97612a
            r1 = r3
            android.content.Context r1 = (android.content.Context) r1
            r2 = 1
            r0.startRankingListActivity(r1, r2)
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 4
            com.p280ss.android.ugc.aweme.base.activity.C23256c.m76348b(r0, r1)
            return
        L_0x0046:
            r0 = r3
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 0
            com.p280ss.android.ugc.aweme.base.activity.C23256c.m76348b(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.search.activity.SearchResultActivity.finish():void");
    }

    public final Resources getResources() {
        if (this.mFirstResumed) {
            Resources resources = super.getResources();
            C7573i.m23582a((Object) resources, "super.getResources()");
            return resources;
        }
        Activity activity = this;
        C43073dv.m136653b(activity);
        if (C23346d.m76602a(activity)) {
            Resources resources2 = super.getResources();
            C7573i.m23582a((Object) resources2, "super.getResources()");
            AssetManager assets = resources2.getAssets();
            Resources resources3 = super.getResources();
            C7573i.m23582a((Object) resources3, "super.getResources()");
            DisplayMetrics displayMetrics = resources3.getDisplayMetrics();
            Resources resources4 = super.getResources();
            C7573i.m23582a((Object) resources4, "super.getResources()");
            return new C23346d(assets, displayMetrics, resources4.getConfiguration());
        }
        Resources resources5 = super.getResources();
        C7573i.m23582a((Object) resources5, "super.getResources()");
        return resources5;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", true);
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", false);
            return;
        }
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onResume", false);
    }

    public final void onNewIntent(Intent intent) {
        C7573i.m23587b(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        m119968h();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bt);
        m119968h();
        C23256c.m76347a(this, 0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.search.activity.SearchResultActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m119966a(SearchResultParam searchResultParam, SearchEnterParam searchEnterParam) {
        Fragment searchResultFragmentInstance = C37382e.f97612a.getSearchResultFragmentInstance(searchResultParam, searchEnterParam);
        C0633q a = getSupportFragmentManager().mo2645a();
        C7573i.m23582a((Object) a, "fm.beginTransaction()");
        a.mo2600b(R.id.aoy, searchResultFragmentInstance, "container");
        a.mo2606d();
    }
}
