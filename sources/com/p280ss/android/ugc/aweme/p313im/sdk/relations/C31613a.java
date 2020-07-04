package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.IndexView.C31601a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.C31731a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.IndexerListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31692e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31859ae;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a */
public final class C31613a extends C31752d {

    /* renamed from: d */
    public IndexView f82799d;

    /* renamed from: e */
    public LinearLayoutManager f82800e;

    /* renamed from: f */
    public float f82801f;

    /* renamed from: v */
    private View f82802v;

    /* renamed from: w */
    private TextView f82803w;

    /* renamed from: x */
    private FloatingBarItemDecoration f82804x;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo82395e() {
        super.mo82395e();
        this.f83085m.f82955j = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo82396f() {
        super.mo82396f();
        if (this.f83081i) {
            this.f82799d.setVisibility(8);
            return;
        }
        this.f82799d.setIndexLetters(((C31692e) ((C31732b) this.f80317c).f83044b).mo82466h());
        this.f82799d.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo80360a() {
        this.f83087o = (ImTextTitleBar) this.f80316b.findViewById(R.id.djz);
        this.f83084l = (DmtStatusView) this.f80316b.findViewById(R.id.dav);
        this.f83086n = (RecyclerView) this.f80316b.findViewById(R.id.cqb);
        this.f82800e = new LinearLayoutManager(mo80363c());
        this.f83086n.setLayoutManager(this.f82800e);
        this.f83086n.mo5528a((C1281m) new FrescoRecycleViewScrollListener(this.f80315a) {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                int sectionForPosition = ((IndexerListAdapter) C31613a.this.f83085m).getSectionForPosition(C31613a.this.f82800e.mo5445j() - C31613a.this.f83085m.mo82485c());
                List h = ((C31692e) ((C31732b) C31613a.this.f80317c).f83044b).mo82466h();
                if (h != null && h.size() != 0 && sectionForPosition >= 0 && sectionForPosition < h.size()) {
                    C31613a.this.f82799d.setCurrentIndex((String) h.get(sectionForPosition));
                }
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (((float) i2) > C9738o.m28708b(C31613a.this.f80315a, 10.0f)) {
                    C25713b.m84474a(C31613a.this.mo80364d(), (View) C31613a.this.f83082j);
                }
            }
        });
        this.f83086n.mo5527a((C1280l) new C1280l() {
            /* renamed from: a */
            public final void mo5689a(boolean z) {
            }

            /* renamed from: b */
            public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            /* renamed from: a */
            public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
                if (motionEvent.getY() < C31613a.this.f82801f) {
                    return true;
                }
                return false;
            }
        });
        this.f82802v = this.f80316b.findViewById(R.id.d12);
        this.f83082j = (EditText) this.f82802v.findViewById(R.id.d0s);
        this.f83082j.setTag("relation_search_tag");
        this.f83083k = (ImageView) this.f82802v.findViewById(R.id.pw);
        this.f82799d = (IndexView) this.f80316b.findViewById(R.id.b0o);
        this.f82803w = (TextView) this.f80316b.findViewById(R.id.b0m);
        this.f82799d.setOnLetterTouchListener(new C31601a() {
            /* renamed from: a */
            public final void mo82379a(String str, int i) {
                C31613a.this.f82800e.mo5417a(((IndexerListAdapter) C31613a.this.f83085m).getPositionForSection(i) + C31613a.this.f83085m.mo82485c(), 0);
                C31859ae.m103516a();
            }
        });
        this.f82799d.setIndexLetterTv(this.f82803w);
    }

    /* renamed from: a */
    public final void mo82393a(List<IMContact> list) {
        this.f83081i = false;
        List h = ((C31692e) ((C31732b) this.f80317c).f83044b).mo82466h();
        List g = ((C31692e) ((C31732b) this.f80317c).f83044b).mo82462g();
        if (!h.isEmpty() && !g.isEmpty()) {
            ((IndexerListAdapter) this.f83085m).mo82501a((SectionIndexer) m102741a(h, g));
            this.f83085m.mo82477a(list);
            if (this.f82804x != null) {
                this.f83086n.mo5542b((C1272h) this.f82804x);
            }
            this.f82804x = new FloatingBarItemDecoration(this.f80315a, h, g);
            this.f83086n.mo5525a((C1272h) this.f82804x);
            mo82396f();
        }
    }

    /* renamed from: a */
    public final void mo82394a(List<IMContact> list, CharSequence charSequence) {
        this.f83081i = true;
        if (this.f82804x != null) {
            this.f83086n.mo5542b((C1272h) this.f82804x);
        }
        this.f83085m.mo82478a(list, charSequence);
        mo82396f();
    }

    /* renamed from: a */
    private static C31731a m102741a(List<String> list, List<Integer> list2) {
        int[] iArr = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            iArr[i] = ((Integer) list2.get(i)).intValue();
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return new C31731a(strArr, iArr);
    }

    public C31613a(Context context, View view, boolean z) {
        super(context, view, z);
        this.f82801f = C9738o.m28708b(context, 32.0f);
    }
}
