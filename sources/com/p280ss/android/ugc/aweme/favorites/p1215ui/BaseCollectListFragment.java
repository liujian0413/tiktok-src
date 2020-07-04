package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a.C27753a;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.utils.C43060dk;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.BaseCollectListFragment */
public abstract class BaseCollectListFragment extends ProfileListFragment implements C25675c, C25676d, C28532n {

    /* renamed from: e */
    BaseAdapter f73215e;

    /* renamed from: f */
    protected String f73216f;

    /* renamed from: g */
    protected boolean f73217g = true;

    /* renamed from: h */
    protected C10803a f73218h;

    /* renamed from: i */
    public C25674b<C25673a> f73219i;

    /* renamed from: j */
    private boolean f73220j = true;
    RecyclerView mListView;
    DmtStatusView mStatusView;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.BaseCollectListFragment$ItemDecorationSpace */
    public static class ItemDecorationSpace extends C1272h {

        /* renamed from: a */
        private int f73222a = 1;

        public ItemDecorationSpace(int i) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            rect.bottom = this.f73222a;
        }
    }

    public final void aE_() {
    }

    public final boolean aO_() {
        return this.f73217g;
    }

    public final void aP_() {
        mo71262i();
    }

    public final void aQ_() {
        mo71265o();
    }

    public final boolean aR_() {
        return this.f73220j;
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo71261g();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo71262i();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo71263m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract BaseAdapter mo71264n();

    /* renamed from: l */
    private static C1272h mo62002l() {
        return new ItemDecorationSpace(1);
    }

    public final void aT_() {
        if (this.mUserVisibleHint) {
            m91030u();
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid()) {
            this.mStatusView.mo25942f();
        }
    }

    public final void aD_() {
        if (isViewValid()) {
            this.f73215e.ag_();
        }
    }

    /* renamed from: j */
    public final View mo61750j() {
        if (!isViewValid()) {
            return null;
        }
        return this.mListView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo71266p() {
        this.f73215e = mo71264n();
        this.mListView.setAdapter(this.f73215e);
    }

    /* renamed from: k */
    private void mo62001k() {
        mo71267q();
        mo71266p();
        mo71269s();
        if (this.f95163N) {
            mo71265o();
        }
    }

    public final void aS_() {
        if (isViewValid() && this.mListView.getChildCount() > 0) {
            this.mListView.mo5561d(0);
        }
    }

    public void ae_() {
        if (isViewValid()) {
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo25943g();
            this.mListView.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo71269s() {
        this.f73219i = new C25674b<>();
        this.f73219i.mo66537a(this);
        this.f73219i.mo66568a((C25676d) this);
        mo71263m();
    }

    /* renamed from: t */
    public void mo71270t() {
        if (this.f73219i != null && this.f73219i.mo66539h() != null) {
            this.f73219i.mo56977b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public View mo71268r() {
        if (!C6399b.m19944t()) {
            return LayoutInflater.from(getContext()).inflate(R.layout.b2q, null);
        }
        TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.b2x, null);
        textView.setGravity(1);
        textView.setText(R.string.b0n);
        return textView;
    }

    /* renamed from: u */
    private void m91030u() {
        if (this.mListView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mListView.getLayoutManager();
            if (linearLayoutManager != null) {
                int j = linearLayoutManager.mo5445j();
                int l = linearLayoutManager.mo5447l();
                for (int i = j; i <= l; i++) {
                    if (i >= 0 && i < linearLayoutManager.mo5744A()) {
                        View childAt = this.mListView.getChildAt(i - j);
                        if (!(childAt == null || this.mListView.mo5539b(childAt) == null || !(this.mListView.mo5539b(childAt) instanceof C27753a))) {
                            ((C27753a) this.mListView.mo5539b(childAt)).mo71237a();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public boolean mo71265o() {
        if (!isViewValid()) {
            return false;
        }
        if (!C27811b.m91212a(getActivity())) {
            if (!this.f73217g) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            }
            this.f73217g = true;
            return false;
        }
        this.f73217g = false;
        this.mStatusView.mo25942f();
        boolean z = !this.f73219i.mo66540i();
        if (TextUtils.isEmpty(this.f73216f)) {
            this.f73216f = C21115b.m71197a().getCurUserId();
        }
        if (!TextUtils.isEmpty(this.f73216f)) {
            mo71261g();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo71267q() {
        this.mListView.setOverScrollMode(2);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.mo5525a(mo62002l());
        this.mListView = C43060dk.m136608a(this.mListView, this);
        if (this.f73218h == null) {
            this.f73218h = new C10803a(getContext()).mo25953a().mo25963b(mo71268r()).mo25964b(C43361b.m137644a(getContext(), new C27810a(this)));
            this.mStatusView.setBuilder(this.f73218h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo71260a(View view) {
        mo71265o();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.mo25944h();
            this.f73217g = true;
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            this.f73215e.mo66507h();
        }
    }

    /* renamed from: c_ */
    public final void mo61747c_(int i) {
        if (isViewValid()) {
            this.f73215e.notifyItemRemoved(i);
            if (this.f73215e.mo60557c() == 0) {
                this.mStatusView.mo25943g();
            }
        }
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        if (!z) {
            this.f73215e.mo66504a((C6905a) null);
            this.f73215e.mo66506d(R.string.am0);
            if (C6399b.m19944t()) {
                this.f73215e.mo66516d(false);
            } else {
                this.f73215e.mo66516d(true);
                this.f73215e.ah_();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo62001k();
    }

    /* renamed from: a */
    public final void mo61742a(List list, int i) {
        if (!isViewValid() || C6307b.m19566a((Collection<T>) list)) {
            return;
        }
        if (this.f73215e.mo60557c() == 0) {
            this.f73215e.mo58045a(list);
            return;
        }
        this.f73215e.notifyItemInserted(i);
        if (this.mListView != null) {
            this.mListView.post(new Runnable() {
                public final void run() {
                    BaseCollectListFragment.this.mListView.mo5541b(0);
                    BaseCollectListFragment.this.mListView.requestFocus();
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo59108b(List list, boolean z) {
        if (isViewValid()) {
            this.f73215e.ai_();
            this.f73215e.mo61577b(list);
            this.mStatusView.setVisibility(4);
            if (this.mListView.getVisibility() == 4) {
                this.mListView.setVisibility(0);
            }
            this.f73220j = z;
            mo59100a(z);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List list, boolean z) {
        if (isViewValid()) {
            this.f73215e.ai_();
            if (C6399b.m19944t()) {
                this.f73215e.mo66516d(true);
            }
            this.f73215e.mo58045a(list);
            this.f73220j = z;
            this.mStatusView.setVisibility(4);
            if (this.mListView.getVisibility() == 4) {
                this.mListView.setVisibility(0);
            }
            mo59100a(z);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.nh, viewGroup, false);
    }
}
