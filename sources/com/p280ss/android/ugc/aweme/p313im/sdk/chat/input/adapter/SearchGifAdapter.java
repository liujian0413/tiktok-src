package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.adapter;

import android.content.Context;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30864b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30865c;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30866d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30868f;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.giphy.p1321a.C30869g;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1318b.C30855a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1318b.C30856b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1319c.p1320a.C30858b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1319c.p1320a.C30859c;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31892bd;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.DiffCallback;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter */
public class SearchGifAdapter extends C1262a<C1293v> {

    /* renamed from: g */
    private static final int f80532g;

    /* renamed from: a */
    public int f80533a;

    /* renamed from: b */
    public boolean f80534b;

    /* renamed from: c */
    public boolean f80535c = true;

    /* renamed from: d */
    public int f80536d;

    /* renamed from: e */
    public C30765d f80537e;

    /* renamed from: f */
    public C30764c f80538f;

    /* renamed from: h */
    private List<C30855a> f80539h = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter$a */
    class C30762a extends C1293v {
        C30762a(View view) {
            super(view);
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = view.getResources().getDisplayMetrics().widthPixels;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter$b */
    class C30763b extends C1293v {

        /* renamed from: a */
        RemoteImageView f80542a;

        C30763b(View view) {
            super(view);
            this.f80542a = (RemoteImageView) view.findViewById(R.id.b9k);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter$c */
    public interface C30764c {
        /* renamed from: a */
        void mo80566a(int i);

        /* renamed from: a */
        void mo80567a(C30858b bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.adapter.SearchGifAdapter$d */
    public interface C30765d {
        /* renamed from: a */
        void mo80568a();
    }

    /* renamed from: a */
    public final boolean mo80560a() {
        return this.f80539h == null || this.f80539h.isEmpty();
    }

    /* renamed from: a */
    public final void mo80558a(C30859c cVar) {
        m100212e();
        m100208a(this.f80539h, cVar);
        notifyDataSetChanged();
        this.f80534b = false;
    }

    /* renamed from: a */
    public final void mo80559a(C30865c cVar) {
        m100212e();
        m100209a(this.f80539h, cVar);
        if (this.f80539h.isEmpty()) {
            m100213f();
        }
        notifyDataSetChanged();
        this.f80534b = false;
    }

    /* renamed from: c */
    public final void mo80564c() {
        if (this.f80534b) {
            this.f80534b = false;
        }
    }

    /* renamed from: e */
    private void m100212e() {
        this.f80536d = 0;
        this.f80539h.clear();
    }

    /* renamed from: f */
    private void m100213f() {
        this.f80539h.add(new C30855a());
        m100211a(false, 0);
    }

    public int getItemCount() {
        if (this.f80539h != null) {
            return this.f80539h.size();
        }
        return 0;
    }

    static {
        float f;
        Context a = C6399b.m19921a();
        if (C31915n.m103671a()) {
            f = 16.0f;
        } else {
            f = 17.0f;
        }
        f80532g = (int) C9738o.m28708b(a, f);
    }

    /* renamed from: g */
    private static boolean m100214g() {
        if (C6956a.m21632a().mo18009f().getAssociativeEmoji() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo80565d() {
        if (this.f80539h.size() > 0) {
            this.f80539h.clear();
            notifyDataSetChanged();
        }
        this.f80534b = false;
        this.f80535c = true;
    }

    /* renamed from: b */
    public final List<C30855a> mo80561b() {
        if (this.f80536d <= 0) {
            return null;
        }
        int size = this.f80539h.size() - 1;
        if (this.f80536d == size) {
            return this.f80539h;
        }
        if (this.f80536d < size) {
            return this.f80539h.subList(0, this.f80536d + 1);
        }
        return null;
    }

    public SearchGifAdapter(RecyclerView recyclerView) {
        m100206a(recyclerView);
    }

    /* renamed from: a */
    private void m100206a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.mo5528a((C1281m) new C1281m() {
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    if (!SearchGifAdapter.this.f80534b && SearchGifAdapter.this.f80535c) {
                        C1273i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof LinearLayoutManager) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                            int l = linearLayoutManager.mo5447l();
                            if (l > SearchGifAdapter.this.f80536d) {
                                SearchGifAdapter.this.f80536d = l;
                            }
                            int A = linearLayoutManager.mo5744A();
                            int i3 = l + 1;
                            if (A > 0 && A != i3 && A - i3 <= 4 && SearchGifAdapter.this.f80537e != null) {
                                SearchGifAdapter.this.f80537e.mo80568a();
                                SearchGifAdapter.this.f80534b = true;
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo80562b(C30859c cVar) {
        ArrayList arrayList = new ArrayList(this.f80539h);
        m100208a(this.f80539h, cVar);
        m100210a(this.f80539h, (List<C30855a>) arrayList);
        this.f80534b = false;
    }

    public int getItemViewType(int i) {
        if (TextUtils.equals(((C30855a) this.f80539h.get(i)).getClass().getCanonicalName(), C30855a.class.getCanonicalName())) {
            return 220;
        }
        return 221;
    }

    /* renamed from: b */
    public final void mo80563b(C30865c cVar) {
        ArrayList arrayList = new ArrayList(this.f80539h);
        m100209a(this.f80539h, cVar);
        m100210a(this.f80539h, (List<C30855a>) arrayList);
        this.f80534b = false;
    }

    /* renamed from: a */
    private void m100211a(boolean z, int i) {
        this.f80535c = z;
        this.f80533a = i;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 221) {
            return new C30763b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w_, viewGroup, false));
        }
        return new C30762a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wa, viewGroup, false));
    }

    /* renamed from: a */
    private void m100208a(List<C30855a> list, C30859c cVar) {
        if (cVar == null) {
            m100211a(false, 0);
            return;
        }
        m100211a(cVar.f80808b, cVar.f80809c);
        List<C30858b> list2 = cVar.f80807a;
        if (list2 != null && !list2.isEmpty()) {
            int i = cVar.f80810d;
            for (C30858b bVar : list2) {
                if (bVar != null) {
                    bVar.f80806f = i;
                    list.add(bVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m100209a(List<C30855a> list, C30865c cVar) {
        C30869g gVar = cVar.f80823c;
        if (gVar != null) {
            List<C30864b> list2 = gVar.f80828a;
            if (list2 != null && list2.size() > 0) {
                for (C30864b bVar : list2) {
                    C30866d dVar = bVar.f80819b;
                    if (dVar != null) {
                        list.add(dVar.f80824a);
                    }
                }
            }
            C30868f fVar = gVar.f80829b;
            if (fVar != null) {
                m100211a(fVar.f80826a, fVar.f80827b);
                return;
            }
            m100211a(false, 0);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        int i2;
        if (vVar instanceof C30763b) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) vVar.itemView.getLayoutParams();
            if (i == 0) {
                i2 = f80532g;
            } else {
                i2 = 0;
            }
            marginLayoutParams.setMargins(i2, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            C30763b bVar = (C30763b) vVar;
            C30855a aVar = (C30855a) this.f80539h.get(i);
            if (aVar instanceof C30856b) {
                C30856b bVar2 = (C30856b) aVar;
                m100207a(bVar.f80542a, Integer.parseInt(bVar2.f80798b), Integer.parseInt(bVar2.f80799c));
                bVar.f80542a.setOnClickListener(new C30766a(this, vVar));
                int parseInt = Integer.parseInt(bVar2.f80799c);
                int parseInt2 = Integer.parseInt(bVar2.f80798b);
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(Collections.singletonList(bVar2.f80797a));
                urlModel.setHeight(parseInt);
                urlModel.setWidth(parseInt2);
                C31892bd.m103612a(bVar.f80542a, urlModel, parseInt2, parseInt, false);
            } else if (aVar instanceof C30858b) {
                C30858b bVar3 = (C30858b) aVar;
                UrlModel urlModel2 = bVar3.f80801a;
                if (urlModel2 != null) {
                    if (bVar3.f80802b != null && m100214g()) {
                        urlModel2 = bVar3.f80802b;
                    }
                    m100207a(bVar.f80542a, urlModel2.getWidth(), urlModel2.getHeight());
                    bVar.f80542a.setOnClickListener(new C30767b(this, bVar3));
                    C31892bd.m103612a(bVar.f80542a, urlModel2, urlModel2.getWidth(), urlModel2.getHeight(), false);
                }
            }
        }
    }

    /* renamed from: a */
    private void m100210a(List<C30855a> list, List<C30855a> list2) {
        if (list.size() != list2.size()) {
            C1143a.m5066a(new DiffCallback(list2, list)).mo4548a((C1262a) this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80556a(C1293v vVar, View view) {
        if (this.f80538f != null) {
            this.f80538f.mo80566a(vVar.getAdapterPosition());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo80557a(C30858b bVar, View view) {
        if (this.f80538f != null && !C27326a.m89579a(view, 500)) {
            this.f80538f.mo80567a(bVar);
        }
    }

    /* renamed from: a */
    private static int m100205a(int i, int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return i;
        }
        return (i * i2) / i3;
    }

    /* renamed from: a */
    private void m100207a(RemoteImageView remoteImageView, int i, int i2) {
        LayoutParams layoutParams = remoteImageView.getLayoutParams();
        layoutParams.width = m100205a(layoutParams.height, i, i2);
        remoteImageView.setLayoutParams(layoutParams);
    }
}
