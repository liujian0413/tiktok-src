package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.C23074c;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23843a;
import com.p280ss.android.ugc.aweme.choosemusic.view.C23969n.C23971a;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView */
public abstract class BaseMusicListView<T> implements C23074c<T> {

    /* renamed from: a */
    protected BaseAdapter f63258a;

    /* renamed from: b */
    protected C23843a f63259b;

    /* renamed from: c */
    C33746f<C23822c> f63260c;

    /* renamed from: d */
    protected int f63261d;

    /* renamed from: e */
    public boolean f63262e;

    /* renamed from: f */
    protected boolean f63263f;

    /* renamed from: g */
    private Context f63264g;

    /* renamed from: h */
    private C6905a f63265h;

    /* renamed from: i */
    private int f63266i;
    public RecyclerView mRecyclerView;
    public DmtStatusView mStatusView;
    public TextTitleBar mTitleBar;
    public LinearLayout mTitleLayout;

    /* renamed from: d */
    public final BaseAdapter mo60125d() {
        return this.f63258a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract BaseAdapter mo62114f();

    /* renamed from: g */
    private void mo62180g() {
        m78581h();
        m78583j();
        m78582i();
    }

    /* renamed from: k */
    private void m78584k() {
        if (this.mStatusView != null) {
            this.mStatusView.mo25939d();
        }
    }

    /* renamed from: a */
    public final void mo60120a() {
        if (this.f63258a != null) {
            this.f63258a.ag_();
        }
    }

    /* renamed from: e */
    public final void mo62113e() {
        if (this.mStatusView != null) {
            this.mStatusView.mo25942f();
        }
    }

    /* renamed from: h */
    private void m78581h() {
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                if (BaseMusicListView.this.f63259b != null) {
                    BaseMusicListView.this.f63259b.mo61919s();
                }
            }
        });
        this.mTitleBar.setColorMode(0);
    }

    /* renamed from: b */
    public final void mo60122b() {
        if (this.mStatusView != null) {
            this.mStatusView.mo25944h();
        }
        if (this.f63258a != null) {
            this.f63258a.mo58045a(null);
        }
    }

    /* renamed from: i */
    private void m78582i() {
        this.f63258a = mo62114f();
        this.f63258a.f67550q = this.mRecyclerView.getResources().getColor(R.color.lz);
        this.f63258a.mo66504a(this.f63265h);
        this.mRecyclerView.setAdapter(this.f63258a);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this.f63264g, 1, false));
    }

    /* renamed from: j */
    private void m78583j() {
        C10803a c = C10803a.m31631a(this.f63264g).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C23956a(this)).mo25965c(0);
        if (this.f63266i != 0) {
            c.mo25954a(this.f63266i);
        }
        this.mStatusView.setBuilder(c);
        mo62113e();
    }

    /* renamed from: c */
    public void mo60124c() {
        if (this.f63258a.f67566v) {
            this.f63258a.mo66516d(false);
            this.f63258a.mo58045a(null);
            this.f63258a.ah_();
        }
        if (this.mStatusView != null) {
            this.mStatusView.mo25943g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62111a(View view) {
        m78584k();
        if (this.f63259b != null) {
            this.f63259b.mo61918r();
        }
    }

    /* renamed from: b */
    public final void mo60123b(List<T> list, boolean z) {
        if (this.f63258a != null) {
            this.f63262e = z;
            if (z) {
                this.f63258a.ai_();
            } else if (C6399b.m19944t()) {
                this.f63258a.mo66516d(false);
            } else {
                this.f63258a.ah_();
            }
            if (!C6307b.m19566a((Collection<T>) list)) {
                this.f63258a.mo61577b(list);
            }
        }
    }

    /* renamed from: a */
    public final void mo62112a(C23971a aVar, int i) {
        new C23969n(aVar, 10).mo62184a(this.mRecyclerView);
    }

    /* renamed from: a */
    public void mo60121a(List<T> list, boolean z) {
        m78584k();
        if (this.f63258a != null) {
            if (C6307b.m19566a((Collection<T>) list)) {
                mo60124c();
                return;
            }
            this.f63258a.mo66516d(true);
            this.f63262e = z;
            if (z) {
                this.f63258a.ai_();
            } else if (C6399b.m19944t()) {
                this.f63258a.mo66516d(false);
            } else {
                this.f63258a.ah_();
            }
            this.f63258a.mo58045a(list);
        }
    }

    BaseMusicListView(Context context, View view, C23843a aVar, int i, C6905a aVar2, C33746f<C23822c> fVar, int i2) {
        m78579a(context, view, aVar, i, aVar2, fVar, i2);
    }

    /* renamed from: a */
    private void m78579a(Context context, View view, C23843a aVar, int i, C6905a aVar2, C33746f<C23822c> fVar, int i2) {
        ButterKnife.bind((Object) this, view);
        this.f63264g = context;
        this.f63259b = aVar;
        this.f63265h = aVar2;
        this.f63260c = fVar;
        this.f63266i = i;
        this.f63261d = i2;
        mo62180g();
    }

    BaseMusicListView(Context context, View view, C23843a aVar, int i, C6905a aVar2, C33746f<C23822c> fVar, int i2, boolean z) {
        this.f63263f = z;
        m78579a(context, view, aVar, i, aVar2, fVar, i2);
    }
}
