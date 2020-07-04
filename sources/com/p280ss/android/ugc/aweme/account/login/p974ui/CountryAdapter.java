package com.p280ss.android.ugc.aweme.account.login.p974ui;

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

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.CountryAdapter */
public class CountryAdapter extends C1262a<C21814a> {

    /* renamed from: a */
    public C21815b f58389a;

    /* renamed from: b */
    private List<C21566a> f58390b;

    /* renamed from: c */
    private int f58391c = R.layout.u7;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.CountryAdapter$a */
    class C21814a extends C1293v {

        /* renamed from: a */
        public TextView f58394a;

        /* renamed from: b */
        public TextView f58395b;

        /* renamed from: c */
        public TextView f58396c;

        public C21814a(View view) {
            super(view);
            this.f58394a = (TextView) view.findViewById(R.id.dw7);
            this.f58395b = (TextView) view.findViewById(R.id.dyg);
            this.f58396c = (TextView) view.findViewById(R.id.drx);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.CountryAdapter$b */
    public interface C21815b {
        /* renamed from: a */
        void mo58190a(C21566a aVar);
    }

    public int getItemCount() {
        return this.f58390b.size();
    }

    public CountryAdapter(List<C21566a> list, int i) {
        this.f58390b = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C21814a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C21814a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f58391c, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C21814a aVar, int i) {
        final C21566a aVar2 = (C21566a) this.f58390b.get(i);
        if (i == 0 || !TextUtils.equals(((C21566a) this.f58390b.get(i - 1)).f57899b, aVar2.f57899b)) {
            aVar.f58394a.setVisibility(0);
            aVar.f58394a.setText(aVar2.f57899b);
        } else {
            aVar.f58394a.setVisibility(8);
        }
        if (aVar2.f57899b.isEmpty()) {
            aVar.f58394a.setVisibility(8);
        }
        aVar.f58395b.setText(aVar2.f57898a);
        aVar.f58396c.setText(aVar2.f57901d);
        aVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (CountryAdapter.this.f58389a != null) {
                    CountryAdapter.this.f58389a.mo58190a(aVar2);
                }
            }
        });
    }
}
