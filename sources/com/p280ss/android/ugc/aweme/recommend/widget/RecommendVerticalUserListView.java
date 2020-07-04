package com.p280ss.android.ugc.aweme.recommend.widget;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.p1285ui.CustomItemAnimator;
import com.p280ss.android.ugc.aweme.newfollow.C34109a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.recommend.adapter.RecommendListAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.RecommendVerticalUserListView */
public class RecommendVerticalUserListView extends BaseRecommendCommonView {

    /* renamed from: c */
    static final /* synthetic */ C7595j[] f97305c = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendVerticalUserListView.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/recommend/adapter/RecommendListAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendVerticalUserListView.class), "mRecommendListPresenter", "getMRecommendListPresenter()Lcom/ss/android/ugc/aweme/newfollow/IRecommendListPresenter;"))};

    /* renamed from: a */
    private final RecyclerView f97306a;

    /* renamed from: b */
    private final C7541d f97307b;

    /* renamed from: d */
    private final C7541d f97308d;

    /* renamed from: e */
    private HashMap f97309e;

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.RecommendVerticalUserListView$a */
    static final class C37188a extends Lambda implements C7561a<RecommendListAdapter> {

        /* renamed from: a */
        final /* synthetic */ RecommendVerticalUserListView f97310a;

        C37188a(RecommendVerticalUserListView recommendVerticalUserListView) {
            this.f97310a = recommendVerticalUserListView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecommendListAdapter invoke() {
            RecommendListAdapter b = this.f97310a.mo93683b();
            b.mo66516d(this.f97310a.mo93684c());
            return b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.RecommendVerticalUserListView$b */
    static final class C37189b extends Lambda implements C7561a<C34109a> {

        /* renamed from: a */
        final /* synthetic */ RecommendVerticalUserListView f97311a;

        C37189b(RecommendVerticalUserListView recommendVerticalUserListView) {
            this.f97311a = recommendVerticalUserListView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C34109a invoke() {
            C34109a createRecommendListPresenter = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).createRecommendListPresenter();
            this.f97311a.getRecommendType();
            return createRecommendListPresenter;
        }
    }

    public RecommendVerticalUserListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RecommendVerticalUserListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C34109a getMRecommendListPresenter() {
        return (C34109a) this.f97308d.getValue();
    }

    /* renamed from: a */
    public View mo93679a(int i) {
        if (this.f97309e == null) {
            this.f97309e = new HashMap();
        }
        View view = (View) this.f97309e.get(Integer.valueOf(R.id.cp8));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cp8);
        this.f97309e.put(Integer.valueOf(R.id.cp8), findViewById);
        return findViewById;
    }

    public int getContentLayoutResId() {
        return R.layout.b46;
    }

    public final RecommendListAdapter getMAdapter() {
        return (RecommendListAdapter) this.f97307b.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1267f mo93678a() {
        return new CustomItemAnimator();
    }

    /* renamed from: b */
    public RecommendListAdapter mo93683b() {
        return new RecommendListAdapter(0);
    }

    public Activity getActivity() {
        return getMActivity();
    }

    /* renamed from: c */
    public boolean mo93684c() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            Boolean bool = (Boolean) mDataCenter.mo60136b("config_show_footer", Boolean.valueOf(true));
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo93707d() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            Boolean bool = (Boolean) mDataCenter.mo60136b("config_enable_scroll_vertically", Boolean.valueOf(true));
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo93708e() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            Boolean bool = (Boolean) mDataCenter.mo60136b("config_enable_scroll_horizontal", Boolean.valueOf(true));
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    public final int getRecommendType() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            Integer num = (Integer) mDataCenter.mo60136b("key_recommend_type", Integer.valueOf(2));
            if (num != null) {
                return num.intValue();
            }
        }
        return 2;
    }

    /* renamed from: f */
    private final void m119537f() {
        RecyclerView recyclerView = this.f97306a;
        C7573i.m23582a((Object) recyclerView, "it");
        recyclerView.setLayoutManager(new RecommendVerticalUserListView$initView$$inlined$also$lambda$1(getContext(), this));
        recyclerView.setAdapter(getMAdapter());
        recyclerView.setItemAnimator(mo93678a());
        recyclerView.setNestedScrollingEnabled(false);
    }

    /* renamed from: g */
    private final void m119538g() {
        DataCenter mDataCenter = getMDataCenter();
        if (mDataCenter != null) {
            C0053p pVar = this;
            mDataCenter.mo60132a("action_list_bind_user", pVar);
            mDataCenter.mo60132a("action_list_refresh", pVar);
            mDataCenter.mo60132a("action_list_load_more", pVar);
            mDataCenter.mo60132a("action_click_dislike", pVar);
            mDataCenter.mo60132a("action_list_remove_user", pVar);
        }
    }

    /* renamed from: a */
    public void mo93682a(List<? extends User> list) {
        getMAdapter().mo58045a(list);
    }

    /* renamed from: a */
    private void m119535a(String str) {
        C7573i.m23587b(str, "uid");
        int a = getMAdapter().mo93604a(str);
        if (a != -1) {
            List a2 = getMAdapter().mo62312a();
            if (a2 != null) {
                a2.remove(a);
            }
            getMAdapter().notifyItemRemoved(a);
            getMAdapter().notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    private void m119536b(String str) {
        C7573i.m23587b(str, "uid");
        int a = getMAdapter().mo93604a(str);
        if (a >= 0 && a < getMAdapter().mo60557c()) {
            List a2 = getMAdapter().mo62312a();
            if (a2 != null) {
                a2.remove(a);
            }
            getMAdapter().notifyItemRemoved(a);
            if (getMAdapter().mo60557c() == 0) {
                DataCenter mDataCenter = getMDataCenter();
                if (mDataCenter != null) {
                    mDataCenter.mo60134a("action_dislike_all", (Object) "");
                }
            }
        }
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        String str;
        super.onChanged(aVar);
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1814650973:
                    if (str.equals("action_list_refresh")) {
                        getMRecommendListPresenter();
                        return;
                    }
                    break;
                case -1620059355:
                    if (str.equals("action_click_dislike")) {
                        Object a = aVar.mo60161a();
                        if (!(a instanceof String)) {
                            a = null;
                        }
                        String str2 = (String) a;
                        if (str2 != null) {
                            m119536b(str2);
                            return;
                        }
                    }
                    break;
                case -1010710674:
                    if (str.equals("action_list_remove_user")) {
                        Object a2 = aVar.mo60161a();
                        if (!(a2 instanceof String)) {
                            a2 = null;
                        }
                        String str3 = (String) a2;
                        if (str3 != null) {
                            m119535a(str3);
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
                case -488269483:
                    if (str.equals("action_list_bind_user")) {
                        mo93682a((List) aVar.mo60161a());
                        return;
                    }
                    break;
                case 1831094742:
                    if (str.equals("action_list_load_more")) {
                        getMRecommendListPresenter();
                        return;
                    }
                    break;
            }
        }
    }

    public RecommendVerticalUserListView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f97306a = (RecyclerView) getMRootView().findViewById(R.id.cp8);
        this.f97307b = C7546e.m23569a(new C37188a(this));
        this.f97308d = C7546e.m23569a(new C37189b(this));
        m119537f();
        m119538g();
    }

    public /* synthetic */ RecommendVerticalUserListView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
