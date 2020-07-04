package com.p280ss.android.ugc.aweme.newfollow.userstate;

import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29369d;
import com.p280ss.android.ugc.aweme.flowfeed.p1255i.C29383a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.g */
public final class C34186g extends C29383a<UserStateFeedAdapter, FollowFeed> {

    /* renamed from: k */
    public static final int f89155k = ((int) C9738o.m28708b(C6399b.m19921a(), 16.0f));

    /* renamed from: l */
    public static final int f89156l = ((int) C9738o.m28708b(C6399b.m19921a(), 16.0f));

    /* renamed from: m */
    public static final int f89157m = ((int) C9738o.m28708b(C6399b.m19921a(), 0.5f));

    /* renamed from: n */
    RelativeLayout f89158n;

    /* renamed from: o */
    protected String f89159o;

    /* renamed from: p */
    protected String f89160p;

    /* renamed from: q */
    public boolean f89161q;

    /* renamed from: r */
    public boolean f89162r;

    /* renamed from: s */
    private C10803a f89163s;

    /* renamed from: t */
    private C34185f f89164t;

    /* renamed from: u */
    private boolean f89165u;

    /* renamed from: d */
    public final C21744b mo75166d() {
        return new C21744b() {
            /* renamed from: d */
            public final String mo58075d() {
                return "key_container_dynamic";
            }

            /* renamed from: e */
            public final Object mo58076e() {
                return C34186g.this.f77427f;
            }

            /* renamed from: a */
            public final boolean mo58072a() {
                if (C34186g.this.f77429h == null || !C34186g.this.f77429h.isViewValid()) {
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final Context mo58074c() {
                if (C34186g.this.f77429h != null) {
                    return C34186g.this.f77429h.getActivity();
                }
                return C34186g.this.f77423b.getContext();
            }

            /* renamed from: b */
            public final boolean mo58073b() {
                if (C34186g.this.f77429h == null || !C34186g.this.f77429h.getLifecycle().mo54a().equals(State.RESUMED) || !C34186g.this.f77429h.mUserVisibleHint) {
                    return false;
                }
                return true;
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public UserStateFeedAdapter mo75164c() {
        return new UserStateFeedAdapter(this.f77423b, this.f89165u);
    }

    /* renamed from: l */
    public final void mo86920l() {
        this.f77424c.setVisibility(4);
        this.f89158n.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo75167e() {
        if (this.f89164t != null) {
            this.f89164t.mo56976a(Integer.valueOf(1), this.f89159o, this.f89160p);
        }
    }

    /* renamed from: m */
    public final void mo86921m() {
        if (isViewValid()) {
            m110365o();
            this.f89158n.setVisibility(4);
            this.f77424c.setVisibility(0);
            this.f77424c.mo25943g();
        }
    }

    /* renamed from: b */
    public final void mo75157b() {
        int i;
        if (this.f89163s == null) {
            this.f89163s = C10803a.m31631a(getContext());
            DmtTextView c = m110363c((int) R.string.c48);
            if (this.f89165u) {
                i = R.string.b11;
            } else {
                i = R.string.b0r;
            }
            DmtTextView c2 = m110363c(i);
            c.setOnClickListener(new C34189h(this));
            this.f89163s.mo25963b((View) c2).mo25966c((View) c);
        }
        this.f77424c.setBuilder(this.f89163s);
    }

    public final void bd_() {
        if (isViewValid() && !this.f89164t.mo66539h().isDataEmpty() && this.f89164t != null) {
            this.f89164t.mo56976a(Integer.valueOf(4), this.f89159o, this.f89160p);
        }
    }

    /* renamed from: o */
    private void m110365o() {
        if (!C6399b.m19944t()) {
            if ((this.f89162r || this.f89161q) && !this.f89165u) {
                int i = 0;
                if (this.f89162r) {
                    i = R.string.tz;
                }
                if (this.f89161q) {
                    i = R.string.tm;
                }
                if (!(i == 0 || this.f89163s == null || this.f77424c == null)) {
                    this.f77424c.mo25939d();
                    this.f89163s.mo25963b((View) m110363c(i));
                    this.f77424c.setBuilder(this.f89163s);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo86917b(View view) {
        if (this.f89164t != null) {
            mo75167e();
        }
    }

    /* renamed from: a */
    public final void mo75134a(View view) {
        super.mo75134a(view);
        this.f89158n = (RelativeLayout) view.findViewById(R.id.cjv);
    }

    /* renamed from: c */
    private DmtTextView m110363c(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        if (this.f77429h != null) {
            dmtTextView.setTextColor(this.f77429h.getResources().getColor(R.color.a51));
            dmtTextView.setText(i);
        }
        return dmtTextView;
    }

    /* renamed from: a */
    public final void mo75133a(int i) {
        if (isViewValid()) {
            switch (i) {
                case 2:
                    if (!(this.f77427f == null || ((UserStateFeedAdapter) this.f77427f).getItemCount() != 0 || this.f77424c == null)) {
                        this.f89158n.setVisibility(8);
                        this.f77424c.setVisibility(0);
                        this.f77424c.mo25942f();
                        return;
                    }
                case 3:
                    mo75160b(null);
                    if (this.f77424c != null) {
                        this.f77424c.setVisibility(0);
                        m110365o();
                        this.f77424c.mo25943g();
                    }
                    if (this.f77427f != null) {
                        ((UserStateFeedAdapter) this.f77427f).ah_();
                        return;
                    }
                    break;
                default:
                    super.mo75133a(i);
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo75158b(String str) {
        int d = ((UserStateFeedAdapter) this.f77427f).mo58057d(str);
        if (d >= 0) {
            C42961az.m136380a(new C28318an(32));
            ((UserStateFeedAdapter) this.f77427f).mo58055c(d);
            if (((UserStateFeedAdapter) this.f77427f).mo62312a().isEmpty()) {
                mo86921m();
            }
        }
    }

    /* renamed from: c */
    public final void mo86919c(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 0) {
            FollowFeed followFeed = new FollowFeed(aweme);
            C21115b.m71197a().updateCurDongtaiCount(1);
            if (this.f77424c.getVisibility() == 0) {
                this.f77424c.setVisibility(8);
            }
            ((UserStateFeedAdapter) this.f77427f).mo62316a(followFeed, 0);
        }
    }

    /* renamed from: a */
    public final boolean mo75155a(List<FollowFeed> list) {
        List a = ((UserStateFeedAdapter) this.f77427f).mo62312a();
        if (C6307b.m19566a((Collection<T>) a) || C6307b.m19566a((Collection<T>) list) || a.size() != list.size()) {
            return true;
        }
        for (int i = 0; i < a.size(); i++) {
            Aweme aweme = ((FollowFeed) list.get(i)).getAweme();
            Aweme aweme2 = ((FollowFeed) a.get(i)).getAweme();
            if (aweme == null || aweme2 == null || !TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo86918b(String str, String str2) {
        this.f89159o = str;
        this.f89160p = str2;
    }

    /* renamed from: a */
    public final void mo75149a(String str, ForwardDetail forwardDetail) {
        C42961az.m136380a(new C28318an(31));
        if (this.f77424c.getVisibility() == 0) {
            this.f77424c.setVisibility(8);
        }
        ((UserStateFeedAdapter) this.f77427f).mo58042a(str, forwardDetail.getAweme(), 0);
        ((UserStateFeedAdapter) this.f77427f).mo58041a(str, forwardDetail.getComment());
    }

    C34186g(String str, String str2, boolean z) {
        this.f89159o = str;
        this.f89160p = str2;
        this.f89165u = z;
    }

    /* renamed from: a */
    public final void mo86916a(UserStateFragment userStateFragment, View view, C34185f fVar, C21743a aVar) {
        this.f89164t = fVar;
        super.mo75136a(userStateFragment, view, fVar, aVar, userStateFragment.f89108i, userStateFragment.f89109j, userStateFragment.f95164O, "");
        if (TimeLockRuler.isTeenModeON()) {
            ((TextView) this.f89158n.findViewById(R.id.title)).setText(R.string.e6j);
            ((TextView) this.f89158n.findViewById(R.id.a1q)).setText(R.string.e69);
        }
        this.f77423b.mo5525a((C1272h) new C1272h() {

            /* renamed from: b */
            private Drawable f89168b = C0683b.m2903a(C34186g.this.getContext(), (int) R.color.a4j);

            public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
                    int i2 = C34186g.f89157m + bottom;
                    if (C29369d.m96464b()) {
                        this.f89168b.setBounds(childAt.getLeft(), bottom, childAt.getRight(), i2);
                    } else {
                        this.f89168b.setBounds(childAt.getLeft() + C34186g.f89155k, bottom, childAt.getRight() - C34186g.f89156l, i2);
                    }
                    this.f89168b.draw(canvas);
                }
            }

            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                rect.bottom = C34186g.f89157m;
            }
        });
        this.f77423b.setOverScrollMode(2);
        this.f89158n.setVisibility(4);
    }
}
