package com.bytedance.android.live.wallet.adapter;

import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3693c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.model.C3822h;
import com.bytedance.android.livesdk.utils.C9042aj;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.CurrencyPrice;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.HsSkuDetail;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class ReChargeListAdapter extends C1262a<C1293v> {

    /* renamed from: f */
    public static final C3623a f10832f = new C3623a(null);

    /* renamed from: h */
    private static final double f10833h = f10833h;

    /* renamed from: a */
    public final boolean f10834a = C7573i.m23585a((Object) this.f10836c.f11375a, (Object) "Huoli");

    /* renamed from: b */
    public final List<ChargeDeal> f10835b;

    /* renamed from: c */
    public final C3822h f10836c;

    /* renamed from: d */
    public final String f10837d;

    /* renamed from: e */
    public final C3624b f10838e;

    /* renamed from: g */
    private final Drawable f10839g;

    public static final class RechargeAccountViewHolder extends C1293v {
        public RechargeAccountViewHolder(View view) {
            C7573i.m23587b(view, "rootView");
            super(view);
        }
    }

    public static final class RechargeViewHolder extends C1293v {

        /* renamed from: a */
        public final TextView f10840a;

        /* renamed from: b */
        public final TextView f10841b;

        /* renamed from: c */
        public final TextView f10842c;

        public RechargeViewHolder(View view) {
            C7573i.m23587b(view, "rootView");
            super(view);
            this.f10840a = (TextView) view.findViewById(R.id.a8j);
            this.f10841b = (TextView) view.findViewById(R.id.cjb);
            this.f10842c = (TextView) view.findViewById(R.id.a7e);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.ReChargeListAdapter$a */
    public static final class C3623a {
        private C3623a() {
        }

        public /* synthetic */ C3623a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.ReChargeListAdapter$b */
    public interface C3624b {
        /* renamed from: a */
        void mo11066a(PayChannel payChannel, ChargeDeal chargeDeal, int i);
    }

    /* renamed from: com.bytedance.android.live.wallet.adapter.ReChargeListAdapter$c */
    static final class C3625c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReChargeListAdapter f10843a;

        /* renamed from: b */
        final /* synthetic */ ChargeDeal f10844b;

        C3625c(ReChargeListAdapter reChargeListAdapter, ChargeDeal chargeDeal) {
            this.f10843a = reChargeListAdapter;
            this.f10844b = chargeDeal;
        }

        public final void onClick(View view) {
            PayChannel payChannel;
            this.f10843a.notifyDataSetChanged();
            String str = this.f10843a.f10836c.f11375a;
            if (C7573i.m23585a((Object) str, (Object) PayChannel.GOOGLE.getValue())) {
                payChannel = PayChannel.GOOGLE;
            } else if (C7573i.m23585a((Object) str, (Object) PayChannel.ONECARD.getValue())) {
                payChannel = PayChannel.ONECARD;
            } else if (C7573i.m23585a((Object) str, (Object) PayChannel.MASTERCARD.getValue())) {
                payChannel = PayChannel.MASTERCARD;
            } else if (C7573i.m23585a((Object) str, (Object) PayChannel.VISA.getValue())) {
                payChannel = PayChannel.VISA;
            } else if (C7573i.m23585a((Object) str, (Object) PayChannel.BOKU.getValue())) {
                payChannel = PayChannel.BOKU;
            } else if (C7573i.m23585a((Object) str, (Object) PayChannel.HUOLI.getValue())) {
                payChannel = PayChannel.HUOLI;
            } else {
                payChannel = PayChannel.UNKNOWN;
            }
            this.f10843a.f10838e.mo11066a(payChannel, this.f10844b, this.f10843a.f10836c.f11382h);
        }
    }

    public final int getItemCount() {
        return this.f10835b.size() + (this.f10834a ? 1 : 0);
    }

    public final int getItemViewType(int i) {
        if (!this.f10834a || i != 0) {
            return 0;
        }
        return 1;
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i == 1) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.at8, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…ance_vigo, parent, false)");
            return new RechargeAccountViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.arj, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…e_diamond, parent, false)");
        return new RechargeViewHolder(inflate2);
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        String str;
        CharSequence charSequence;
        Object obj;
        String str2;
        C7573i.m23587b(vVar, "holder");
        int i2 = 0;
        if (getItemViewType(i) == 1) {
            C3693c walletCenter = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter();
            C7573i.m23582a((Object) walletCenter, "ServiceManager.getServic…lass.java).walletCenter()");
            double c = (double) walletCenter.mo11157c();
            double d = f10833h;
            Double.isNaN(c);
            String a = C1642a.m8034a("%s：%s%s", Arrays.copyOf(new Object[]{C3358ac.m12515a((int) R.string.ebr), C3358ac.m12515a((int) R.string.eie), C9078p.m27100a("%.2f", Double.valueOf(c / d))}, 3));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            View view = vVar.itemView;
            if (view != null) {
                ((TextView) view).setText(a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        if (this.f10834a) {
            i--;
        }
        ChargeDeal chargeDeal = (ChargeDeal) this.f10835b.get(i);
        if (chargeDeal == null) {
            chargeDeal = new ChargeDeal();
        }
        if (vVar instanceof RechargeViewHolder) {
            if (chargeDeal.f25525k == null) {
                List<CurrencyPrice> list = chargeDeal.f25522h;
                C7573i.m23582a((Object) list, "dealItem.currencyPrice");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    CurrencyPrice currencyPrice = (CurrencyPrice) obj;
                    C7573i.m23582a((Object) currencyPrice, "it");
                    String str3 = currencyPrice.f25526a;
                    if (this.f10834a) {
                        str2 = "USD";
                    } else {
                        str2 = this.f10837d;
                    }
                    if (C7573i.m23585a((Object) str3, (Object) str2)) {
                        break;
                    }
                }
                CurrencyPrice currencyPrice2 = (CurrencyPrice) obj;
                if (currencyPrice2 != null) {
                    TextView textView = ((RechargeViewHolder) vVar).f10841b;
                    C7573i.m23582a((Object) textView, "holder.tvPrice");
                    textView.setText(currencyPrice2.f25528c);
                }
            } else {
                TextView textView2 = ((RechargeViewHolder) vVar).f10841b;
                C7573i.m23582a((Object) textView2, "holder.tvPrice");
                HsSkuDetail hsSkuDetail = chargeDeal.f25525k;
                if (hsSkuDetail != null) {
                    charSequence = hsSkuDetail.f25531c;
                } else {
                    charSequence = null;
                }
                textView2.setText(charSequence);
            }
            RechargeViewHolder rechargeViewHolder = (RechargeViewHolder) vVar;
            TextView textView3 = rechargeViewHolder.f10840a;
            C7573i.m23582a((Object) textView3, "holder.tvDiamond");
            textView3.setText(String.valueOf(chargeDeal.f25519e));
            rechargeViewHolder.f10840a.setCompoundDrawables(this.f10839g, null, null, null);
            TextView textView4 = rechargeViewHolder.f10842c;
            C7573i.m23582a((Object) textView4, "holder.tvGivingCount");
            if (TextUtils.isEmpty(chargeDeal.f25518d)) {
                i2 = 4;
            }
            textView4.setVisibility(i2);
            TextView textView5 = rechargeViewHolder.f10842c;
            C7573i.m23582a((Object) textView5, "holder.tvGivingCount");
            if (TextUtils.isEmpty(chargeDeal.f25518d)) {
                str = "";
            } else {
                str = chargeDeal.f25518d;
            }
            textView5.setText(str);
            vVar.itemView.setOnTouchListener(new C9042aj());
            vVar.itemView.setOnClickListener(new C3625c(this, chargeDeal));
        }
    }

    public ReChargeListAdapter(C3822h hVar, String str, C3624b bVar) {
        Object obj;
        C7573i.m23587b(hVar, "chargeItem");
        C7573i.m23587b(str, "currencyCode");
        C7573i.m23587b(bVar, "mOnClickDeal");
        this.f10836c = hVar;
        this.f10837d = str;
        this.f10838e = bVar;
        List<ChargeDeal> list = null;
        if (!C7573i.m23585a((Object) this.f10836c.f11375a, (Object) "Pay by mobile")) {
            list = this.f10836c.f11384j;
        } else {
            List<ChargeDeal> list2 = this.f10836c.f11384j;
            if (list2 != null) {
                Iterable iterable = list2;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    ChargeDeal chargeDeal = (ChargeDeal) next;
                    if (chargeDeal != null) {
                        obj = chargeDeal.f25521g;
                    } else {
                        obj = null;
                    }
                    if (C7573i.m23585a(obj, (Object) this.f10837d)) {
                        arrayList.add(next);
                    }
                }
                list = (List) arrayList;
            }
        }
        if (list == null) {
            list = C7525m.m23461a();
        }
        this.f10835b = list;
        Drawable c = C3358ac.m12524c(R.drawable.c41);
        C7573i.m23582a((Object) c, "ResUtil.getDrawable(R.drawable.ttlive_ic_coin)");
        this.f10839g = c;
        int a = C3358ac.m12510a(16.0f);
        this.f10839g.setBounds(0, 0, a, a);
    }
}
