package com.p280ss.android.ugc.aweme.commercialize.search;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.gyf.barlibrary.ImmersionBar;
import com.gyf.barlibrary.OSUtils;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchCommerceInfoStruct;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity */
public final class SearchMixCommerceViewMoreActivity extends AmeSSActivity {

    /* renamed from: a */
    public List<? extends SearchCommerceInfoStruct> f66113a;

    /* renamed from: b */
    public C7562b<? super String, C7581n> f66114b = C25046a.f66118a;

    /* renamed from: c */
    public C7562b<? super SearchCommerceInfoStruct, C7581n> f66115c = C25048c.f66120a;

    /* renamed from: d */
    public C7562b<? super SearchCommerceInfoStruct, C7581n> f66116d = C25047b.f66119a;

    /* renamed from: e */
    private HashMap f66117e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity$a */
    static final class C25046a extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        public static final C25046a f66118a = new C25046a();

        C25046a() {
            super(1);
        }

        /* renamed from: a */
        private static void m82486a(String str) {
            C7573i.m23587b(str, "it");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m82486a((String) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity$b */
    static final class C25047b extends Lambda implements C7562b<SearchCommerceInfoStruct, C7581n> {

        /* renamed from: a */
        public static final C25047b f66119a = new C25047b();

        C25047b() {
            super(1);
        }

        /* renamed from: a */
        private static void m82487a(SearchCommerceInfoStruct searchCommerceInfoStruct) {
            C7573i.m23587b(searchCommerceInfoStruct, "it");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m82487a((SearchCommerceInfoStruct) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity$c */
    static final class C25048c extends Lambda implements C7562b<SearchCommerceInfoStruct, C7581n> {

        /* renamed from: a */
        public static final C25048c f66120a = new C25048c();

        C25048c() {
            super(1);
        }

        /* renamed from: a */
        private static void m82488a(SearchCommerceInfoStruct searchCommerceInfoStruct) {
            C7573i.m23587b(searchCommerceInfoStruct, "it");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m82488a((SearchCommerceInfoStruct) obj);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity$d */
    static final class C25049d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchMixCommerceViewMoreActivity f66121a;

        C25049d(SearchMixCommerceViewMoreActivity searchMixCommerceViewMoreActivity) {
            this.f66121a = searchMixCommerceViewMoreActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f66121a.onBackPressed();
        }
    }

    /* renamed from: a */
    private View m82484a(int i) {
        if (this.f66117e == null) {
            this.f66117e = new HashMap();
        }
        View view = (View) this.f66117e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f66117e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        if (C42961az.m136384e(this)) {
            C42961az.m136383d(this);
        }
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).destroy();
        super.onDestroy();
    }

    public final void setStatusBarColor() {
        super.setStatusBarColor();
        if (!OSUtils.isEMUI3_0() && !OSUtils.isEMUI3_1() && getWindow() != null && VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            C7573i.m23582a((Object) window, "window");
            window.getAttributes().layoutInDisplayCutoutMode = 1;
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).init();
        }
    }

    /* renamed from: a */
    private final void m82485a() {
        RecyclerView recyclerView = (RecyclerView) m82484a(R.id.cqc);
        C7573i.m23582a((Object) recyclerView, "recycler");
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = (RecyclerView) m82484a(R.id.cqc);
        C7573i.m23582a((Object) recyclerView2, "recycler");
        List<? extends SearchCommerceInfoStruct> list = this.f66113a;
        if (list == null) {
            C7573i.m23583a("list");
        }
        recyclerView2.setAdapter(new SearchCommerceViewMoreAdapter(list, this.f66114b, this.f66115c, this.f66116d));
    }

    @C7709l(mo20400a = ThreadMode.MAIN, mo20401b = true)
    public final void onReceiveEvent(C25050a aVar) {
        C7573i.m23587b(aVar, "event");
        this.f66114b = aVar.f66122a;
        this.f66115c = aVar.f66123b;
        this.f66116d = aVar.f66124c;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.a_n);
        View a = m82484a(R.id.dah);
        C7573i.m23582a((Object) a, "statusBar");
        a.getLayoutParams().height = C20505c.m68014c(this);
        C42961az.m136382c(this);
        Intent intent = getIntent();
        C7573i.m23582a((Object) intent, "intent");
        Object obj = intent.getExtras().get("list");
        if (obj != null) {
            this.f66113a = (List) obj;
            DmtTextView dmtTextView = (DmtTextView) m82484a(R.id.bn4);
            C7573i.m23582a((Object) dmtTextView, "listTitle");
            Intent intent2 = getIntent();
            C7573i.m23582a((Object) intent2, "intent");
            Object obj2 = intent2.getExtras().get("title");
            if (obj2 != null) {
                dmtTextView.setText((CharSequence) obj2);
                m82485a();
                ((ImageView) m82484a(R.id.bn2)).setOnClickListener(new C25049d(this));
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.search.SearchMixCommerceViewMoreActivity", "onCreate", false);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.commercialize.model.SearchCommerceInfoStruct>");
    }
}
