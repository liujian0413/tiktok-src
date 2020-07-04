package com.p280ss.android.ugc.aweme.recommend.widget;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.event.C28325h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d.C34324a;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.RecommendUserActivity;
import com.p280ss.android.ugc.aweme.recommend.FeedRecommendUserViewStyle;
import com.p280ss.android.ugc.aweme.recommend.adapter.AutoFillRecommendUserListAdapter;
import com.p280ss.android.ugc.aweme.recommend.adapter.RecommendListAdapter;
import com.p280ss.android.ugc.aweme.recommend.viewholder.AutoFillFeedRecommendUserItemAnimator;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.AutoFillFeedRecommendUserView */
public final class AutoFillFeedRecommendUserView extends RecommendVerticalUserListView {

    /* renamed from: b */
    public static final C37185a f97287b = new C37185a(null);

    /* renamed from: a */
    public HashSet<String> f97288a;

    /* renamed from: d */
    private boolean f97289d;

    /* renamed from: e */
    private String f97290e;

    /* renamed from: f */
    private int f97291f;

    /* renamed from: g */
    private HashMap f97292g;

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.AutoFillFeedRecommendUserView$a */
    public static final class C37185a {
        private C37185a() {
        }

        public /* synthetic */ C37185a(C7571f fVar) {
            this();
        }
    }

    public AutoFillFeedRecommendUserView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoFillFeedRecommendUserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo93679a(int i) {
        if (this.f97292g == null) {
            this.f97292g = new HashMap();
        }
        View view = (View) this.f97292g.get(Integer.valueOf(R.id.cp8));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cp8);
        this.f97292g.put(Integer.valueOf(R.id.cp8), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final boolean mo93684c() {
        return false;
    }

    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    public final boolean canScrollVertically(int i) {
        return false;
    }

    public final int getContentLayoutResId() {
        return R.layout.b2k;
    }

    public final int getRemainHeight() {
        return this.f97291f;
    }

    public final String getRequestId() {
        return this.f97290e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C1267f mo93678a() {
        return new AutoFillFeedRecommendUserItemAnimator();
    }

    /* renamed from: f */
    private final int m119517f() {
        return C9738o.m28691a(getContext()) - C23486n.m77122a(32.0d);
    }

    public final HashSet<String> getImpressionMap() {
        HashSet<String> hashSet = this.f97288a;
        if (hashSet == null) {
            C7573i.m23583a("impressionMap");
        }
        return hashSet;
    }

    /* renamed from: b */
    public final RecommendListAdapter mo93683b() {
        this.f97288a = new HashSet<>();
        HashSet<String> hashSet = this.f97288a;
        if (hashSet == null) {
            C7573i.m23583a("impressionMap");
        }
        return new AutoFillRecommendUserListAdapter(hashSet);
    }

    public final void setRemainHeight(int i) {
        this.f97291f = i;
    }

    /* renamed from: c */
    private static int m119516c(int i) {
        return i * FeedRecommendUserViewStyle.getRecyclerViewItemHeight();
    }

    public final void setImpressionMap(HashSet<String> hashSet) {
        C7573i.m23587b(hashSet, "<set-?>");
        this.f97288a = hashSet;
    }

    public final void setRequestId(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f97290e = str;
    }

    /* renamed from: b */
    private final void m119515b(int i) {
        RecyclerView recyclerView = (RecyclerView) mo93679a((int) R.id.cp8);
        C7573i.m23582a((Object) recyclerView, "recommend_list");
        RecyclerView recyclerView2 = (RecyclerView) mo93679a((int) R.id.cp8);
        C7573i.m23582a((Object) recyclerView2, "recommend_list");
        LayoutParams layoutParams = recyclerView2.getLayoutParams();
        layoutParams.width = MeasureSpec.makeMeasureSpec(m119517f(), 1073741824);
        layoutParams.height = MeasureSpec.makeMeasureSpec(m119516c(i), 1073741824);
        recyclerView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null && str.hashCode() == -488269483 && str.equals("action_list_bind_user")) {
            mo93682a((List) aVar.mo60161a());
        }
    }

    /* renamed from: a */
    public final void mo93682a(List<? extends User> list) {
        int i;
        super.mo93682a(list);
        if (this.f97289d) {
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            int a = C21085a.m71116a(getContext()) + C23486n.m77122a(52.0d);
            Math.min((i - 1) * C23486n.m77122a(18.5d), (int) (((float) this.f97291f) / 4.0f));
            findViewById(R.id.bjh).setPadding(0, a, 0, 0);
            m119515b(i);
            this.f97289d = false;
        }
    }

    public AutoFillFeedRecommendUserView(final Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        findViewById(R.id.bif).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AutoFillFeedRecommendUserView f97293a;

            {
                this.f97293a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    DataCenter mDataCenter = this.f97293a.getMDataCenter();
                    if (mDataCenter != null) {
                        mDataCenter.mo60134a("action_auto_fill_holder_did_action", (Object) Boolean.valueOf(true));
                    }
                    RecommendUserActivity.m117277a(this.f97293a.getMContext(), "", 16, "homepage_hot", "", this.f97293a.getRequestId());
                }
            }
        });
        findViewById(R.id.b0v).setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ AutoFillFeedRecommendUserView f97294a;

            {
                this.f97294a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view)) {
                    DataCenter mDataCenter = this.f97294a.getMDataCenter();
                    if (mDataCenter != null) {
                        mDataCenter.mo60134a("action_auto_fill_holder_did_action", (Object) Boolean.valueOf(true));
                    }
                    C6907h.m21524a("click_privacy_tips", (Map) C7507ae.m23401c((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("enter_from", "homepage_hot")}));
                    String g = ((C34320a) C34324a.m111010a(C34320a.class)).mo60344g();
                    if (!TextUtils.isEmpty(g)) {
                        ((SchemaPageHelper) ServiceManager.get().getService(SchemaPageHelper.class)).openCrossPlatformActivity(context, true, false, g);
                    }
                }
            }
        });
        this.f97289d = true;
        this.f97290e = "";
    }

    /* renamed from: a */
    public final void mo93681a(String str, User user, boolean z) {
        String str2;
        C7573i.m23587b(str, "uid");
        List a = getMAdapter().mo62312a();
        if (a != null) {
            int i = 0;
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                User user2 = (User) it.next();
                if (user2 != null) {
                    str2 = user2.getUid();
                } else {
                    str2 = null;
                }
                if (C7573i.m23585a((Object) str2, (Object) str)) {
                    break;
                }
                i++;
            }
            int size = a.size();
            if (i >= 0 && size > i) {
                User user3 = (User) a.get(i);
                a.remove(i);
                getMAdapter().notifyItemRemoved(i);
                if (user != null) {
                    a.add(i, user);
                    getMAdapter().notifyItemInserted(i);
                }
                if (z) {
                    C42961az.m136380a(new C28325h(user3));
                }
                if (getMAdapter().mo60557c() == 0) {
                    DataCenter mDataCenter = getMDataCenter();
                    if (mDataCenter != null) {
                        mDataCenter.mo60134a("action_dislike_all", (Object) "");
                    }
                }
            }
        }
    }

    public /* synthetic */ AutoFillFeedRecommendUserView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
