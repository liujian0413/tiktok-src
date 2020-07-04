package com.bytedance.android.live.wallet.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.browser.C3141a;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3393m;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.model.C3824j;
import com.bytedance.android.live.wallet.model.C3824j.C3825a;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class MyWalletAdapter extends C1262a<C3619a> {

    /* renamed from: a */
    public Context f10804a;

    /* renamed from: b */
    private C3824j f10805b;

    /* renamed from: c */
    private int f10806c = 1;

    /* renamed from: d */
    private List<C3825a> f10807d = new ArrayList();

    /* renamed from: com.bytedance.android.live.wallet.adapter.MyWalletAdapter$a */
    class C3619a extends C1293v {

        /* renamed from: a */
        HSImageView f10811a;

        /* renamed from: b */
        TextView f10812b;

        /* renamed from: c */
        TextView f10813c;

        /* renamed from: d */
        ImageView f10814d;

        /* renamed from: e */
        TextView f10815e;

        /* renamed from: f */
        TextView f10816f;

        /* renamed from: g */
        TextView f10817g;

        public C3619a(View view, int i) {
            super(view);
            if (i == 1) {
                this.f10814d = (ImageView) view.findViewById(R.id.bdl);
                this.f10811a = (HSImageView) view.findViewById(R.id.baw);
                this.f10812b = (TextView) view.findViewById(R.id.dz_);
                this.f10813c = (TextView) view.findViewById(R.id.dww);
                return;
            }
            if (i == 0) {
                this.f10815e = (TextView) view.findViewById(R.id.e3p);
                this.f10816f = (TextView) view.findViewById(R.id.e40);
                this.f10817g = (TextView) view.findViewById(R.id.e41);
            }
        }
    }

    public int getItemCount() {
        return this.f10807d.size() + 1 + 1;
    }

    public MyWalletAdapter(Context context) {
        this.f10804a = context;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo11062a(C3824j jVar) {
        if (jVar != null) {
            this.f10805b = jVar;
            List<C3825a> list = this.f10805b.f11394f;
            if (list == null) {
                list = new ArrayList<>();
            }
            this.f10807d = list;
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C3619a onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            view = from.inflate(R.layout.azu, viewGroup, false);
        } else if (i == 2) {
            view = from.inflate(R.layout.azt, viewGroup, false);
            view.findViewById(R.id.a0z).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(MyWalletAdapter.this.f10804a, C3979c.m13952b("https://webcast-helo.sgsnssdk.com/falcon/webcast_helo/page/record/withdraw/index.html"));
                }
            });
        } else {
            view = from.inflate(R.layout.azr, viewGroup, false);
        }
        return new C3619a(view, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C3619a aVar, int i) {
        int itemViewType = getItemViewType(i);
        int i2 = i - 1;
        if (itemViewType == 0) {
            if (this.f10805b != null) {
                aVar.f10815e.setText(String.valueOf(this.f10805b.f11389a));
                aVar.f10816f.setText(String.valueOf(this.f10805b.f11391c));
                DecimalFormat decimalFormat = new DecimalFormat("###,##0.00");
                double d = (double) this.f10805b.f11392d;
                Double.isNaN(d);
                String format = decimalFormat.format(BigDecimal.valueOf(d / 100.0d));
                aVar.f10817g.setText(C3358ac.m12517a((int) R.string.ecl, format));
            }
        } else if (itemViewType == 1) {
            final C3825a aVar2 = (C3825a) this.f10807d.get(i2);
            C3393m.m12624a(aVar.f10811a, aVar2.f11397c);
            aVar.f10812b.setText(aVar2.f11395a);
            String str = "";
            if (aVar2.f11399e == 3) {
                str = C3358ac.m12515a((int) R.string.eor);
            } else if (aVar2.f11399e == 0) {
                str = C3358ac.m12515a((int) R.string.eos);
            }
            aVar.f10813c.setText(str);
            aVar.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    if (aVar2.f11402h == 1) {
                        ((C3141a) C3596c.m13172a(C3141a.class)).webViewManager().mo11535a(MyWalletAdapter.this.f10804a, C3979c.m13952b(aVar2.f11398d));
                    } else {
                        C9049ap.m27028a(aVar2.f11403i);
                    }
                }
            });
        } else if (itemViewType == 2) {
            ((ImageView) aVar.itemView.findViewById(R.id.bdm)).setColorFilter(C3358ac.m12521b((int) R.color.af2));
        }
    }
}
