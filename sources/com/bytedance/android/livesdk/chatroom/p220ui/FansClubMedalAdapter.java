package com.bytedance.android.livesdk.chatroom.p220ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2341d;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.FansClubMedalAdapter */
public class FansClubMedalAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public FansClubData f14527a;

    /* renamed from: b */
    public boolean f14528b = true;

    /* renamed from: c */
    public C5071a f14529c;

    /* renamed from: d */
    private List<C2341d> f14530d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.FansClubMedalAdapter$a */
    interface C5071a {
        /* renamed from: a */
        void mo13187a(C2341d dVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.FansClubMedalAdapter$b */
    class C5072b extends C1293v {

        /* renamed from: b */
        private HSImageView f14532b;

        /* renamed from: c */
        private TextView f14533c;

        /* renamed from: d */
        private TextView f14534d;

        /* renamed from: e */
        private TextView f14535e;

        /* renamed from: f */
        private View f14536f;

        /* renamed from: g */
        private TextView f14537g;

        /* renamed from: h */
        private C2341d f14538h;

        /* renamed from: i */
        private int f14539i;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo13188a(View view) {
            if (FansClubMedalAdapter.this.f14529c != null) {
                FansClubMedalAdapter.this.f14529c.mo13187a(null);
            }
            FansClubMedalAdapter.this.mo13186a(this.f14538h);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final /* synthetic */ void mo13190b(View view) {
            if (FansClubMedalAdapter.this.f14529c != null) {
                FansClubMedalAdapter.this.f14529c.mo13187a(this.f14538h);
            }
            FansClubMedalAdapter.this.mo13186a(this.f14538h);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo13189a(C2341d dVar) {
            this.f14538h = dVar;
            int i = 0;
            if (this.f14539i == 1) {
                FansClubMedalAdapter.m16352a(this.f14537g, 0);
                FansClubMedalAdapter.m16352a(this.f14532b, 8);
                FansClubMedalAdapter.m16352a(this.f14533c, 8);
                FansClubMedalAdapter.m16352a(this.f14534d, 8);
                FansClubMedalAdapter.m16352a(this.f14535e, 8);
            } else {
                FansClubMedalAdapter.m16352a(this.f14537g, 8);
                FansClubMedalAdapter.m16352a(this.f14532b, 0);
                FansClubMedalAdapter.m16352a(this.f14533c, 0);
                FansClubMedalAdapter.m16352a(this.f14534d, 0);
                FansClubMedalAdapter.m16352a(this.f14535e, 0);
                if (dVar.f7692e != null) {
                    C5343e.m17038a(this.f14532b, dVar.f7692e.f7652b);
                    this.f14533c.setText(dVar.f7692e.f7651a);
                }
                this.f14534d.setText(C3358ac.m12517a((int) R.string.ejt, String.valueOf(dVar.f7690c)));
                if (dVar.f7688a != null) {
                    this.f14535e.setText(dVar.f7688a.getNickName());
                }
                if (FansClubMedalAdapter.this.f14528b && FansClubMedalAdapter.this.f14527a != null && !TextUtils.isEmpty(FansClubMedalAdapter.this.f14527a.clubName) && FansClubMedalAdapter.this.f14527a.clubName.equals(dVar.f7692e.f7651a)) {
                    dVar.f7693f = true;
                    FansClubMedalAdapter.this.f14528b = false;
                }
            }
            if (dVar != null) {
                View view = this.f14536f;
                if (!dVar.f7693f) {
                    i = 4;
                }
                view.setVisibility(i);
            }
        }

        C5072b(View view, int i) {
            super(view);
            this.f14539i = i;
            this.f14532b = (HSImageView) view.findViewById(R.id.ai6);
            this.f14533c = (TextView) view.findViewById(R.id.title);
            this.f14534d = (TextView) view.findViewById(R.id.blh);
            this.f14536f = view.findViewById(R.id.d2k);
            this.f14535e = (TextView) view.findViewById(R.id.g5);
            this.f14532b.setOnClickListener(new C5327t(this));
            this.f14537g = (TextView) view.findViewById(R.id.ahy);
            this.f14537g.setOnClickListener(new C5328u(this));
        }
    }

    public int getItemCount() {
        if (this.f14530d == null) {
            return 0;
        }
        return this.f14530d.size();
    }

    public int getItemViewType(int i) {
        if (i == this.f14530d.size() - 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo13186a(C2341d dVar) {
        if (dVar != null) {
            dVar.f7693f = true;
        }
        for (C2341d dVar2 : this.f14530d) {
            if (dVar2 != null && !dVar2.equals(dVar)) {
                dVar2.f7693f = false;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public static void m16352a(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        ((C5072b) vVar).mo13189a((C2341d) this.f14530d.get(i));
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5072b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ars, viewGroup, false), i);
    }

    public FansClubMedalAdapter(List<C2341d> list, FansClubData fansClubData, C5071a aVar) {
        if (list != null) {
            C2341d dVar = new C2341d();
            if (fansClubData == null) {
                dVar.f7693f = true;
            }
            list.add(dVar);
        }
        this.f14530d = list;
        this.f14527a = fansClubData;
        this.f14529c = aVar;
    }
}
