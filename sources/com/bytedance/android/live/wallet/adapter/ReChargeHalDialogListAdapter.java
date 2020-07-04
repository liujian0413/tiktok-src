package com.bytedance.android.live.wallet.adapter;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.utils.C9042aj;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class ReChargeHalDialogListAdapter extends C1262a<C1293v> {

    /* renamed from: d */
    public static final C3620a f10819d = new C3620a(null);

    /* renamed from: a */
    public final List<ChargeDeal> f10820a;

    /* renamed from: b */
    public final C3621b f10821b;

    /* renamed from: c */
    public final long f10822c;

    public static final class RechargeViewHolder extends C1293v {

        /* renamed from: a */
        public final TextView f10823a;

        /* renamed from: b */
        public final TextView f10824b;

        /* renamed from: c */
        public final TextView f10825c;

        /* renamed from: d */
        public final TextView f10826d;

        /* renamed from: e */
        public final long f10827e;

        /* renamed from: f */
        public final C3621b f10828f;

        /* renamed from: g */
        public final int f10829g;

        public RechargeViewHolder(View view, long j, C3621b bVar) {
            C7573i.m23587b(view, "rootView");
            C7573i.m23587b(bVar, "mOnClickDeal");
            this(view, j, bVar, 0);
        }

        private RechargeViewHolder(View view, long j, C3621b bVar, int i) {
            C7573i.m23587b(view, "rootView");
            C7573i.m23587b(bVar, "mOnClickDeal");
            super(view);
            this.f10827e = j;
            this.f10828f = bVar;
            this.f10829g = 0;
            this.f10823a = (TextView) view.findViewById(R.id.a8j);
            this.f10824b = (TextView) view.findViewById(R.id.cjb);
            this.f10825c = (TextView) view.findViewById(R.id.a7e);
            this.f10826d = (TextView) view.findViewById(R.id.e2t);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.ReChargeHalDialogListAdapter$a */
    public static final class C3620a {
        private C3620a() {
        }

        public /* synthetic */ C3620a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.ReChargeHalDialogListAdapter$b */
    public interface C3621b {
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.ReChargeHalDialogListAdapter$c */
    static final class C3622c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReChargeHalDialogListAdapter f10830a;

        /* renamed from: b */
        final /* synthetic */ ChargeDeal f10831b;

        C3622c(ReChargeHalDialogListAdapter reChargeHalDialogListAdapter, ChargeDeal chargeDeal) {
            this.f10830a = reChargeHalDialogListAdapter;
            this.f10831b = chargeDeal;
        }

        public final void onClick(View view) {
        }
    }

    public final int getItemCount() {
        return this.f10820a.size();
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.at9, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…og_item_b, parent, false)");
        return new RechargeViewHolder(inflate, this.f10822c, this.f10821b);
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        int i2;
        C7573i.m23587b(vVar, "rclHolder");
        ChargeDeal chargeDeal = (ChargeDeal) this.f10820a.get(i);
        RechargeViewHolder rechargeViewHolder = (RechargeViewHolder) vVar;
        TextView textView = rechargeViewHolder.f10826d;
        C7573i.m23582a((Object) textView, "holder.tvStrategy");
        if (this.f10822c == chargeDeal.f25515a) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        String a = C9078p.m27100a("%.2f", Float.valueOf(((float) chargeDeal.f25516b) / 100.0f));
        TextView textView2 = rechargeViewHolder.f10824b;
        C7573i.m23582a((Object) textView2, "holder.tvPrice");
        textView2.setText(C3358ac.m12517a((int) R.string.fau, a));
        TextView textView3 = rechargeViewHolder.f10823a;
        C7573i.m23582a((Object) textView3, "holder.tvDiamond");
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(chargeDeal.f25519e));
        sb.append("  ");
        textView3.setText(sb.toString());
        if (chargeDeal.f25520f <= 0) {
            TextView textView4 = rechargeViewHolder.f10825c;
            C7573i.m23582a((Object) textView4, "holder.tvGivingCount");
            textView4.setVisibility(4);
        } else {
            TextView textView5 = rechargeViewHolder.f10825c;
            C7573i.m23582a((Object) textView5, "holder.tvGivingCount");
            textView5.setText(C3358ac.m12517a((int) R.string.f_s, String.valueOf(chargeDeal.f25520f)));
            TextView textView6 = rechargeViewHolder.f10825c;
            C7573i.m23582a((Object) textView6, "holder.tvGivingCount");
            textView6.setVisibility(0);
        }
        rechargeViewHolder.itemView.setOnTouchListener(new C9042aj());
        rechargeViewHolder.itemView.setOnClickListener(new C3622c(this, chargeDeal));
    }

    public ReChargeHalDialogListAdapter(List<ChargeDeal> list, C3621b bVar, long j) {
        C7573i.m23587b(list, "list");
        C7573i.m23587b(bVar, "mOnClickDeal");
        this.f10820a = list;
        this.f10821b = bVar;
        this.f10822c = j;
    }
}
