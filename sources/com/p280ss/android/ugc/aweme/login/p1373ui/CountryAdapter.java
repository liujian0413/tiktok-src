package com.p280ss.android.ugc.aweme.login.p1373ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.login.ui.CountryAdapter */
public class CountryAdapter extends C1262a<C32691a> {

    /* renamed from: a */
    private List<C21566a> f85183a;

    /* renamed from: b */
    private int f85184b;

    /* renamed from: com.ss.android.ugc.aweme.login.ui.CountryAdapter$a */
    class C32691a extends C1293v {

        /* renamed from: a */
        public TextView f85187a;

        /* renamed from: b */
        public TextView f85188b;

        /* renamed from: c */
        public TextView f85189c;

        C32691a(View view) {
            super(view);
            this.f85187a = (TextView) view.findViewById(R.id.dw7);
            this.f85188b = (TextView) view.findViewById(R.id.dyg);
            this.f85189c = (TextView) view.findViewById(R.id.drx);
        }
    }

    public int getItemCount() {
        return this.f85183a.size();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C32691a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C32691a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f85184b, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C32691a aVar, int i) {
        final C21566a aVar2 = (C21566a) this.f85183a.get(i);
        if (i == 0 || !TextUtils.equals(((C21566a) this.f85183a.get(i - 1)).f57899b, aVar2.f57899b)) {
            aVar.f85187a.setVisibility(0);
            aVar.f85187a.setText(aVar2.f57899b);
        } else {
            aVar.f85187a.setVisibility(8);
        }
        aVar.f85188b.setText(aVar2.f57898a);
        aVar.f85189c.setText(aVar2.f57901d);
        aVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
            }
        });
    }
}
