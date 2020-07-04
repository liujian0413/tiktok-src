package com.p280ss.android.ugc.aweme.emoji.emojichoose;

import android.graphics.drawable.Drawable;
import android.support.p022v4.app.C0578a;
import android.support.p022v4.app.C0578a.C0580a;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.base.BaseViewHolder;
import com.p280ss.android.ugc.aweme.emoji.base.C27522f;
import com.p280ss.android.ugc.aweme.emoji.base.C27523g;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.TabIndicatorAdapter */
public class TabIndicatorAdapter extends C1262a<TabHolder> {

    /* renamed from: a */
    public C27523g f72666a;

    /* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.TabIndicatorAdapter$TabHolder */
    public class TabHolder extends BaseViewHolder<C27522f> {

        /* renamed from: a */
        public RemoteImageView f72667a;

        /* renamed from: a */
        public final void mo70723a() {
            this.f72667a = (RemoteImageView) this.itemView.findViewById(R.id.dfn);
        }

        TabHolder(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo70812a(C27522f fVar, final int i) {
            boolean z;
            if (fVar.mo70721i() == 2) {
                C23323e.m76514a(this.f72667a, fVar.mo70730b());
            } else if (fVar.mo70715a() > 0) {
                this.f72667a.setImageResource(fVar.mo70715a());
            } else {
                Drawable c = fVar.mo70731c();
                if (c != null) {
                    this.f72667a.setImageDrawable(c);
                }
            }
            if (!TextUtils.isEmpty(fVar.mo70717d())) {
                C0578a.m2438a((View) this.f72667a, (C0580a) new C27602p(fVar));
            }
            RemoteImageView remoteImageView = this.f72667a;
            if (i == TabIndicatorAdapter.this.f72666a.mo70743f().f72743c) {
                z = true;
            } else {
                z = false;
            }
            remoteImageView.setSelected(z);
            this.f72667a.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    if (!TabHolder.this.f72667a.isSelected()) {
                        TabIndicatorAdapter.this.f72666a.mo70742a(i);
                    }
                }
            });
        }

        /* renamed from: a */
        static final /* synthetic */ void m90374a(C27522f fVar, View view, C0945c cVar) {
            if (!TextUtils.isEmpty(fVar.mo70717d())) {
                view.setContentDescription(fVar.mo70717d());
            }
            cVar.mo3656b((CharSequence) DmtTextView.class.getName());
        }
    }

    public int getItemCount() {
        return this.f72666a.mo70743f().mo70856f();
    }

    public TabIndicatorAdapter(C27523g gVar) {
        this.f72666a = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(TabHolder tabHolder, int i) {
        tabHolder.mo70812a(this.f72666a.mo70743f().mo70857f(i), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public TabHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TabHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m1, viewGroup, false));
    }
}
