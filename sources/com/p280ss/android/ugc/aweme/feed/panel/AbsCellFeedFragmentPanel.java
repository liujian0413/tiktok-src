package com.p280ss.android.ugc.aweme.feed.panel;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.OnAnimatedScrollListener;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1142c.C25657a;
import com.p280ss.android.ugc.aweme.discover.base.HeaderAndFooterWrapper;
import com.p280ss.android.ugc.aweme.feed.adapter.AbsCellViewHolder;
import com.p280ss.android.ugc.aweme.feed.adapter.CellFeedAdapter;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.utils.C43060dk;
import com.p280ss.android.ugc.aweme.views.C43371g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.AbsCellFeedFragmentPanel */
public abstract class AbsCellFeedFragmentPanel extends C28632p {

    /* renamed from: g */
    private static int f75259g;

    /* renamed from: a */
    protected C23685d f75260a;

    /* renamed from: b */
    protected C28532n f75261b;

    /* renamed from: c */
    protected C25657a f75262c;

    /* renamed from: d */
    protected CellFeedAdapter f75263d;

    /* renamed from: e */
    public HeaderAndFooterWrapper f75264e;

    /* renamed from: f */
    public boolean f75265f;
    public RecyclerView mListView;
    protected DmtStatusView mStatusView;

    /* renamed from: e */
    public abstract C1273i mo73297e();

    /* renamed from: f */
    public abstract C1272h mo73298f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract CellFeedAdapter mo73299g();

    /* renamed from: h */
    public final boolean mo73300h() {
        return true;
    }

    /* renamed from: i */
    public boolean mo73301i() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo73296c(int i) {
        this.mListView.mo5541b(i);
    }

    /* renamed from: a */
    public final void mo73293a(C1281m mVar) {
        if (this.mListView != null) {
            this.mListView.mo5528a(mVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo73295b(int i) {
        this.mListView.post(new C28586a(this, 0));
    }

    /* renamed from: a */
    public final void mo73294a(C6905a aVar) {
        if (this.f75263d != null) {
            this.f75263d.mo66504a(aVar);
        }
    }

    /* renamed from: a */
    private void mo73303a(String str) {
        if (!TextUtils.isEmpty(str)) {
            int a = this.f75263d.mo66489a(str);
            if (a >= 0 && !C6307b.m19566a((Collection<T>) this.f75263d.f67539l)) {
                if (this.f75263d.f62015c != null) {
                    this.f75263d.f67539l.remove(a - 1);
                } else {
                    this.f75263d.f67539l.remove(a);
                }
                this.f75263d.notifyItemRemoved(a);
                if (this.f75263d.getItemCount() == 0) {
                    this.mStatusView.setVisibility(0);
                    this.mStatusView.mo25943g();
                    this.f75263d.ah_();
                }
            }
        }
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        if (mo73385bf()) {
            int i = anVar.f74631a;
            if (i != 2) {
                if (i != 13) {
                    switch (i) {
                        case 21:
                            Aweme aweme = (Aweme) anVar.f74632b;
                            if (aweme != null) {
                                m93847a(this.f75263d.mo66489a(aweme.getAid()));
                                return;
                            }
                            return;
                        case 22:
                            this.f75263d.notifyDataSetChanged();
                            if (this.f75263d.getItemCount() == 0) {
                                this.mStatusView.setVisibility(0);
                                this.mStatusView.mo25943g();
                                this.f75263d.ah_();
                                break;
                            }
                            break;
                    }
                    return;
                }
                int childCount = this.mListView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    C1293v b = this.mListView.mo5539b(this.mListView.getChildAt(i2));
                    if (b.mItemViewType == 0) {
                        ((AbsCellViewHolder) b).mo67074n();
                    }
                }
                return;
            }
            mo73303a((String) anVar.f74632b);
        }
    }

    /* renamed from: a */
    private void m93847a(int i) {
        int i2;
        if (f75259g == 0) {
            f75259g = mo105655bv().getResources().getDimensionPixelOffset(R.dimen.mz);
        }
        if (i != -1 && (this.mListView.getLayoutManager() instanceof C43371g)) {
            if (this.mListView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.mListView.getLayoutManager();
                int[] a = staggeredGridLayoutManager.mo6009a((int[]) null);
                int[] c = staggeredGridLayoutManager.mo6011c((int[]) null);
                if ((i >= a[0] || i >= a[1]) && (i <= c[0] || i <= c[1])) {
                    View c2 = staggeredGridLayoutManager.mo5432c(i);
                    Rect rect = new Rect();
                    c2.getGlobalVisibleRect(rect);
                    int i3 = rect.top;
                    int i4 = rect.bottom;
                    if (mo73301i()) {
                        i2 = f75259g;
                    } else {
                        i2 = 0;
                    }
                    if (i3 <= i4 - i2) {
                        return;
                    }
                }
            } else if (this.mListView.getLayoutManager() instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) this.mListView.getLayoutManager();
                int j = gridLayoutManager.mo5445j();
                int l = gridLayoutManager.mo5447l();
                if (i >= j && i <= l) {
                    return;
                }
            }
            ((C43371g) this.mListView.getLayoutManager()).mo105243a(i, 0);
            this.f75265f = true;
        }
    }

    public AbsCellFeedFragmentPanel(C23685d dVar, C28532n nVar) {
        this.f75260a = dVar;
        this.f75261b = nVar;
    }

    /* renamed from: a */
    public void mo67605a(View view, Bundle bundle) {
        OnAnimatedScrollListener onAnimatedScrollListener;
        super.mo67605a(view, bundle);
        this.mListView.setLayoutManager(mo73297e());
        this.mListView.mo5525a(mo73298f());
        this.f75263d = mo73299g();
        this.f75264e = new HeaderAndFooterWrapper(this.f75263d);
        this.mListView.setAdapter(this.f75264e);
        if (!C7188c.m22428a()) {
            onAnimatedScrollListener = new OnAnimatedScrollListener();
            this.mListView.mo5528a((C1281m) onAnimatedScrollListener);
        } else {
            onAnimatedScrollListener = null;
        }
        this.mListView = C43060dk.m136608a(this.mListView, this.f75261b);
        this.f75262c = new C25657a(this.mListView, onAnimatedScrollListener);
        this.mListView.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0 && AbsCellFeedFragmentPanel.this.f75263d.getItemCount() > 1 && AbsCellFeedFragmentPanel.this.f75265f) {
                    AbsCellFeedFragmentPanel.this.f75263d.notifyItemChanged(1);
                    AbsCellFeedFragmentPanel.this.f75265f = false;
                }
            }
        });
        this.mListView.getItemAnimator().f4942k = 0;
        this.mListView.getItemAnimator().f4943l = 0;
    }
}
