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

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountryAdapter */
public class MusCountryAdapter extends C1262a<C21835a> {

    /* renamed from: a */
    public C21836b f58456a;

    /* renamed from: b */
    private List<C21566a> f58457b;

    /* renamed from: c */
    private int f58458c = R.layout.u7;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountryAdapter$a */
    class C21835a extends C1293v {

        /* renamed from: a */
        public TextView f58461a;

        /* renamed from: b */
        public TextView f58462b;

        /* renamed from: c */
        public TextView f58463c;

        public C21835a(View view) {
            super(view);
            this.f58461a = (TextView) view.findViewById(R.id.dw7);
            this.f58462b = (TextView) view.findViewById(R.id.dyg);
            this.f58463c = (TextView) view.findViewById(R.id.drx);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountryAdapter$b */
    public interface C21836b {
        /* renamed from: a */
        void mo58226a(C21566a aVar);
    }

    public int getItemCount() {
        return this.f58457b.size();
    }

    public MusCountryAdapter(List<C21566a> list, int i) {
        this.f58457b = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C21835a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C21835a(LayoutInflater.from(viewGroup.getContext()).inflate(this.f58458c, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C21835a aVar, int i) {
        final C21566a aVar2 = (C21566a) this.f58457b.get(i);
        if (i == 0 || !TextUtils.equals(((C21566a) this.f58457b.get(i - 1)).f57899b, aVar2.f57899b)) {
            aVar.f58461a.setVisibility(0);
            aVar.f58461a.setText(aVar2.f57899b);
        } else {
            aVar.f58461a.setVisibility(8);
        }
        aVar.f58462b.setText(aVar2.f57898a);
        aVar.f58463c.setText(aVar2.f57901d);
        aVar.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (MusCountryAdapter.this.f58456a != null) {
                    MusCountryAdapter.this.f58456a.mo58226a(aVar2);
                }
            }
        });
    }
}
