package com.p280ss.android.ugc.aweme.common.adapter;

import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter */
public abstract class LoadMoreRecyclerViewAdapter extends RecyclerViewWithFooterAdapter {

    /* renamed from: o */
    static final String f67542o = "LoadMoreRecyclerViewAdapter";

    /* renamed from: a */
    private int f67543a;

    /* renamed from: b */
    private String f67544b;

    /* renamed from: c */
    private TextView f67545c;

    /* renamed from: d */
    private long f67546d = -1;

    /* renamed from: e */
    private RecyclerView f67547e;

    /* renamed from: f */
    private LoadMoreViewHolder f67548f;

    /* renamed from: p */
    public int f67549p = -1;

    /* renamed from: q */
    public int f67550q = C0683b.m2912c(C6399b.m19921a(), R.color.vo);

    /* renamed from: r */
    public int f67551r;

    /* renamed from: s */
    public String f67552s;

    /* renamed from: t */
    public C6905a f67553t;

    /* renamed from: u */
    public C1241a f67554u = new C1241a() {
        /* renamed from: a */
        public final int mo5386a(int i) {
            if (i == 0 && RecyclerHeaderViewAdapter.this.mo58029a(i) == RecyclerHeaderViewAdapter.f62013a) {
                return 2;
            }
            return 1;
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter$a */
    public interface C6905a {
        void bd_();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter$LoadMoreViewHolder */
    public class LoadMoreViewHolder extends C1293v {

        /* renamed from: b */
        private PullUpLoadMoreHelper f67558b;

        /* renamed from: c */
        private TextView f67559c;

        /* renamed from: b */
        public final void mo66512b() {
            ((DmtStatusView) this.itemView).mo25942f();
        }

        /* renamed from: c */
        public final void mo66513c() {
            ((DmtStatusView) this.itemView).mo25944h();
        }

        /* renamed from: d */
        public final void mo66514d() {
            ((DmtStatusView) this.itemView).mo25943g();
        }

        /* renamed from: e */
        public final void mo66515e() {
            ((DmtStatusView) this.itemView).mo25939d();
        }

        /* renamed from: a */
        public final void mo66509a() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            dmtStatusView.setStatus(LoadMoreRecyclerViewAdapter.this.f67549p);
            if (dmtStatusView.mo25941e() && LoadMoreRecyclerViewAdapter.this.f67553t != null) {
                LoadMoreRecyclerViewAdapter.this.f67553t.bd_();
            }
        }

        /* renamed from: a */
        public final void mo66510a(RecyclerView recyclerView) {
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            if (!TextUtils.equals(this.f67559c.getText(), this.f67559c.getResources().getString(R.string.d9q))) {
                this.f67559c.setText(R.string.d9q);
            }
            dmtStatusView.mo25944h();
            if (this.f67558b == null) {
                this.f67558b = new PullUpLoadMoreHelper(recyclerView, LoadMoreRecyclerViewAdapter.this.f67553t);
            }
            this.f67558b.f67560a = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo66511a(View view) {
            if (LoadMoreRecyclerViewAdapter.this.f67553t != null) {
                LoadMoreRecyclerViewAdapter.this.f67553t.bd_();
            }
            if (this.f67558b != null) {
                this.f67558b.f67560a = false;
            }
        }

        public LoadMoreViewHolder(View view, TextView textView) {
            super(view);
            this.f67559c = textView;
            textView.setOnClickListener(new C25651e(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo58051b(View view) {
    }

    public void ah_() {
        if (this.f67548f != null) {
            this.f67548f.mo66514d();
        }
        this.f67549p = 1;
    }

    public int getItemCount() {
        if (mo60557c() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    /* renamed from: h */
    public final void mo66507h() {
        if (this.f67548f != null) {
            this.f67548f.mo66513c();
        }
        this.f67549p = 2;
    }

    /* renamed from: i */
    public final void mo66508i() {
        if (this.f67547e != null) {
            mo66503a(this.f67547e, true);
        }
    }

    public void ag_() {
        if (this.f67548f != null) {
            this.f67548f.mo66512b();
        }
        this.f67549p = 0;
        if (this.f67546d == -1) {
            this.f67546d = System.currentTimeMillis();
        }
    }

    public void ai_() {
        if (this.f67548f != null) {
            this.f67548f.mo66515e();
        }
        this.f67549p = -1;
        this.f67546d = -1;
    }

    /* renamed from: a */
    public void mo66504a(C6905a aVar) {
        this.f67553t = aVar;
    }

    /* renamed from: a */
    public void mo62313a(C1293v vVar) {
        ((LoadMoreViewHolder) vVar).mo66509a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo58030a(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.en);
    }

    /* renamed from: c */
    public final void mo66505c(String str) {
        if (this.f67545c != null) {
            this.f67545c.setText(str);
        }
        this.f67544b = str;
    }

    /* renamed from: d */
    public final void mo66506d(int i) {
        if (this.f67545c != null) {
            this.f67545c.setText(i);
        }
        this.f67543a = i;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f67547e = recyclerView;
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4721g = new C1241a() {
                /* renamed from: a */
                public final int mo5386a(int i) {
                    if (LoadMoreRecyclerViewAdapter.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4716b;
                    }
                    if (LoadMoreRecyclerViewAdapter.this.f67554u != null) {
                        return LoadMoreRecyclerViewAdapter.this.f67554u.mo5386a(i);
                    }
                    return 1;
                }
            };
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        boolean z;
        super.onViewAttachedToWindow(vVar);
        LayoutParams layoutParams = vVar.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (getItemViewType(vVar.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            layoutParams2.f5145b = z;
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (this.f67546d != -1 && !TextUtils.isEmpty(this.f67552s)) {
            C6893q.m21451b("aweme_feed_load_more_duration", this.f67552s, (float) (System.currentTimeMillis() - this.f67546d));
            this.f67546d = -1;
        }
    }

    /* renamed from: a_ */
    public C1293v mo61886a_(ViewGroup viewGroup) {
        DmtStatusView dmtStatusView = new DmtStatusView(viewGroup.getContext());
        int a = mo58030a((View) viewGroup);
        mo58051b(dmtStatusView);
        dmtStatusView.setLayoutParams(new RecyclerView.LayoutParams(-1, a));
        this.f67545c = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2x, null);
        if (this.f67550q != 0) {
            this.f67545c.setTextColor(this.f67550q);
        }
        if (this.f67543a != 0) {
            this.f67545c.setText(this.f67543a);
        }
        if (this.f67544b != null) {
            this.f67545c.setText(this.f67544b);
        }
        this.f67545c.setGravity(17);
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2z, null);
        textView.setText(R.string.c46);
        textView.setGravity(17);
        if (this.f67551r != 0) {
            textView.setTextColor(this.f67551r);
        }
        dmtStatusView.setBuilder(C10803a.m31631a(viewGroup.getContext()).mo25963b((View) this.f67545c).mo25966c((View) textView));
        this.f67548f = new LoadMoreViewHolder(dmtStatusView, textView);
        return this.f67548f;
    }

    /* renamed from: a */
    public final void mo66503a(RecyclerView recyclerView, boolean z) {
        if (this.f67548f != null) {
            this.f67548f.mo66510a(recyclerView);
        }
        this.f67549p = 2;
        if (z) {
            C10761a.m31399c(recyclerView.getContext(), (int) R.string.c44).mo25750a();
        }
    }
}
