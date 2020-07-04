package com.p280ss.android.ugc.trill.language;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.i18n.language.C30477c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageAdapter */
public class ChooseLanguageAdapter extends C1262a<ViewHolder> {

    /* renamed from: a */
    public ArrayList<C30477c> f115672a;

    /* renamed from: b */
    public C45004a f115673b;

    /* renamed from: c */
    private Context f115674c;

    /* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageAdapter$ViewHolder */
    public static class ViewHolder extends C1293v {

        /* renamed from: a */
        DmtTextView f115677a;

        /* renamed from: b */
        ImageView f115678b;

        public ViewHolder(View view) {
            int i;
            super(view);
            this.f115677a = (DmtTextView) view.findViewById(R.id.dwk);
            this.f115678b = (ImageView) view.findViewById(R.id.bbp);
            DmtTextView dmtTextView = this.f115677a;
            Context context = view.getContext();
            if (C6394b.m19907b(view.getContext())) {
                i = R.color.aut;
            } else {
                i = R.color.aus;
            }
            dmtTextView.setTextColor(C0683b.m2912c(context, i));
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageAdapter$a */
    public interface C45004a {
        /* renamed from: a */
        void mo107513a(int i);
    }

    public int getItemCount() {
        if (this.f115672a != null) {
            return this.f115672a.size();
        }
        return 0;
    }

    public ChooseLanguageAdapter(Context context, C45004a aVar) {
        this.f115674c = context;
        this.f115673b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.f115674c).inflate(R.layout.x0, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        if (getItemCount() != 0) {
            C30477c cVar = (C30477c) this.f115672a.get(i);
            viewHolder.f115677a.setText(cVar.mo80152a());
            if (cVar.f80071a) {
                viewHolder.f115678b.setVisibility(0);
                viewHolder.f115678b.setImageResource(R.drawable.aax);
            } else {
                viewHolder.f115678b.setVisibility(8);
            }
            viewHolder.itemView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (ChooseLanguageAdapter.this.f115673b != null) {
                        ChooseLanguageAdapter.this.f115673b.mo107513a(i);
                    }
                }
            });
        }
    }
}
