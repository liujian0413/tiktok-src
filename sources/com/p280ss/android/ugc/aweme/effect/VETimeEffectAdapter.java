package com.p280ss.android.ugc.aweme.effect;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effect.VETimeEffectAdapter */
public class VETimeEffectAdapter extends C1262a<C27356b> {

    /* renamed from: a */
    ArrayList<EffectModel> f72212a = C27431j.m89898b();

    /* renamed from: b */
    public C27355a f72213b;

    /* renamed from: c */
    int f72214c;

    /* renamed from: d */
    boolean f72215d;

    /* renamed from: com.ss.android.ugc.aweme.effect.VETimeEffectAdapter$a */
    public interface C27355a {
        /* renamed from: a */
        void mo70407a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.VETimeEffectAdapter$b */
    class C27356b extends C1293v {

        /* renamed from: a */
        public AVDmtImageTextView f72216a;

        /* renamed from: a */
        public final void mo70451a(int i) {
            EffectModel effectModel = (EffectModel) VETimeEffectAdapter.this.f72212a.get(i);
            boolean z = true;
            if (i == 0) {
                this.f72216a.mo103497a(this.f72216a.getResources().getDrawable(effectModel.imagePath), true, (int) C9738o.m28708b(this.f72216a.getContext(), 12.0f));
                this.f72216a.mo103507c();
            } else {
                this.f72216a.mo103496a(this.f72216a.getResources().getDrawable(effectModel.imagePath));
            }
            this.f72216a.setText(effectModel.name);
            AVDmtImageTextView aVDmtImageTextView = this.f72216a;
            if (i != VETimeEffectAdapter.this.f72214c) {
                z = false;
            }
            aVDmtImageTextView.mo103501a(z);
        }

        C27356b(View view) {
            super(view);
            this.f72216a = (AVDmtImageTextView) view.findViewById(R.id.db2);
            this.f72216a.mo103509d();
            this.f72216a.mo103505b();
            this.f72216a.setOnClickListener(new OnClickListener(VETimeEffectAdapter.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = C27356b.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        if (VETimeEffectAdapter.this.f72213b != null) {
                            VETimeEffectAdapter.this.f72213b.mo70407a(adapterPosition);
                        }
                        VETimeEffectAdapter.this.f72214c = adapterPosition;
                        VETimeEffectAdapter.this.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    public int getItemCount() {
        return this.f72212a.size();
    }

    /* renamed from: a */
    public final void mo70447a() {
        if (this.f72214c != 0) {
            this.f72214c = 0;
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo70450b() {
        if (this.f72214c == 1) {
            this.f72214c = 0;
            notifyItemRangeChanged(0, 2);
        }
    }

    /* renamed from: a */
    public final void mo70448a(int i) {
        notifyItemChanged(this.f72214c);
        this.f72214c = i;
        notifyItemChanged(this.f72214c);
    }

    /* renamed from: a */
    public final void mo70449a(boolean z) {
        this.f72215d = z;
        if (this.f72214c == 1) {
            notifyItemChanged(1);
        }
    }

    /* renamed from: a */
    private static void m89710a(C27356b bVar, int i) {
        bVar.mo70451a(i);
    }

    public /* synthetic */ void onBindViewHolder(C1293v vVar, int i) {
        m89710a((C27356b) vVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C27356b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C27356b(((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.uy, viewGroup, false));
    }
}
