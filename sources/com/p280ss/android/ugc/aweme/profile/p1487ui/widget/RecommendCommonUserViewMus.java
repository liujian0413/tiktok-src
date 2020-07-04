package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapterMus.C36631a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolderMus.C36636b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserViewMus */
public final class RecommendCommonUserViewMus extends RelativeLayout {

    /* renamed from: b */
    public static final int f96130b = 1;

    /* renamed from: c */
    public static final int f96131c = 2;

    /* renamed from: d */
    public static final int f96132d = 3;

    /* renamed from: e */
    public static final C36622a f96133e = new C36622a(null);

    /* renamed from: a */
    public RecyclerView f96134a;

    /* renamed from: f */
    private View f96135f;

    /* renamed from: g */
    private TextView f96136g;

    /* renamed from: h */
    private View f96137h;

    /* renamed from: i */
    private RecommendUserAdapterMus f96138i;

    /* renamed from: j */
    private List<? extends User> f96139j;

    /* renamed from: k */
    private int f96140k;

    /* renamed from: l */
    private String f96141l;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendCommonUserViewMus$a */
    public static final class C36622a {
        private C36622a() {
        }

        public /* synthetic */ C36622a(C7571f fVar) {
            this();
        }
    }

    public RecommendCommonUserViewMus(Context context) {
        this(context, null, 0, 6, null);
    }

    public RecommendCommonUserViewMus(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final RecommendUserAdapterMus getAdapter() {
        if (this.f96138i == null) {
            this.f96138i = new RecommendUserAdapterMus();
        }
        return this.f96138i;
    }

    public final List<User> getData() {
        return getAdapter().mo62312a();
    }

    public final Map<String, Integer> getPosInApiListMap() {
        return getAdapter().mo92950f();
    }

    public final void setBackgroundResource(int i) {
        findViewById(R.id.bj6).setBackgroundResource(i);
    }

    public final void setOnItemOperationListener(C36631a aVar) {
        C7573i.m23587b(aVar, "onItemOperationListener");
        getAdapter().mo92948a(aVar);
    }

    public final void setOnViewAttachedToWindowListener(C25663d<RecommendUserCardViewHolderMus> dVar) {
        C7573i.m23587b(dVar, "onViewAttachedToWindowListener");
        getAdapter().mo92947a(dVar);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C7573i.m23587b(motionEvent, "ev");
        ViewParent parent = getParent();
        if (parent != null) {
            if (!(parent instanceof RecyclerView)) {
                z = true;
            } else {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setPageType(int i) {
        this.f96140k = i;
        getAdapter().f96174c = i;
        getAdapter().mo66516d(false);
        this.f96136g.setText(R.string.d7o);
    }

    /* renamed from: a */
    public final void mo92930a(boolean z) {
        if (z) {
            this.f96134a.setVisibility(8);
            this.f96136g.setVisibility(8);
            this.f96137h.setVisibility(0);
            return;
        }
        this.f96134a.setVisibility(0);
        this.f96136g.setVisibility(0);
        this.f96137h.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo92929a(List<? extends User> list, String str) {
        if (list != null) {
            if (list.size() <= 0) {
                mo92930a(true);
            } else {
                mo92930a(false);
            }
            this.f96141l = str;
            this.f96139j = list;
            RecommendUserAdapterMus adapter = getAdapter();
            List<? extends User> list2 = this.f96139j;
            if (list2 == null) {
                C7573i.m23583a("mUsers");
            }
            adapter.mo58045a(list2);
            getAdapter().f96173b = str;
            getAdapter().mo66516d(false);
        }
    }

    public RecommendCommonUserViewMus(final Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.b44, this, true);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…mon_user_mus, this, true)");
        this.f96135f = inflate;
        if (ProfileNewStyleExperiment.INSTANCE.getENABLE_NEW_STYLE()) {
            setBackgroundResource(R.color.a3z);
        }
        View findViewById = this.f96135f.findViewById(R.id.cqp);
        C7573i.m23582a((Object) findViewById, "mRoot.findViewById(R.id.recycler_view)");
        this.f96134a = (RecyclerView) findViewById;
        this.f96138i = new RecommendUserAdapterMus();
        this.f96134a.setAdapter(getAdapter());
        View findViewById2 = this.f96135f.findViewById(R.id.ed8);
        C7573i.m23582a((Object) findViewById2, "mRoot.findViewById(R.id.view_recommend_empty)");
        this.f96137h = findViewById2;
        View findViewById3 = this.f96135f.findViewById(R.id.e0b);
        C7573i.m23582a((Object) findViewById3, "mRoot.findViewById(R.id.tv_recommend)");
        this.f96136g = (TextView) findViewById3;
        C1267f itemAnimator = this.f96134a.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).f5112m = false;
            this.f96138i.mo92949a((C36636b) new C36636b(this) {

                /* renamed from: a */
                final /* synthetic */ RecommendCommonUserViewMus f96142a;

                /* renamed from: a */
                public final void mo92939a(int i) {
                    this.f96142a.f96134a.mo5521a((int) C9738o.m28708b(context, 130.0f), 0);
                }

                {
                    this.f96142a = r1;
                }
            });
            this.f96134a.setPadding((int) C9738o.m28708b(this.f96134a.getContext(), 16.0f), 0, 0, 0);
            this.f96134a.setClipToPadding(false);
            this.f96134a.mo5525a((C1272h) new DividerItemDecoration(0, (int) C9738o.m28708b(context, 4.0f), 0));
            this.f96134a.setLayoutManager(new WrapLinearLayoutManager(context, 0, false));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    public /* synthetic */ RecommendCommonUserViewMus(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
