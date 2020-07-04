package com.p280ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder */
public class MusicCollectionViewHolder extends C1293v {

    /* renamed from: a */
    public MusicCollectionItem f87972a;

    /* renamed from: b */
    boolean f87973b;

    /* renamed from: c */
    private Context f87974c;
    RemoteImageView mCoverView;
    TextView mNameView;

    /* renamed from: a */
    public final void mo86126a(int i) {
        if (i <= 0) {
            this.itemView.setVisibility(8);
            return;
        }
        this.itemView.setVisibility(0);
        this.f87972a = null;
        this.f87973b = true;
        this.mNameView.setTextColor(this.itemView.getResources().getColor(R.color.ayh));
        this.mNameView.setText(this.itemView.getResources().getString(R.string.ca1));
        this.itemView.setBackgroundColor(this.itemView.getResources().getColor(R.color.aye));
        ((C13438a) this.mCoverView.getHierarchy()).mo32896a(C13423b.f35595c);
        C23323e.m76503a(this.mCoverView, (int) R.drawable.awr);
    }

    /* renamed from: a */
    public final void mo86127a(MusicCollectionItem musicCollectionItem) {
        this.f87973b = false;
        this.f87972a = musicCollectionItem;
        if (this.f87972a != null) {
            this.mNameView.setTextColor(this.itemView.getResources().getColor(R.color.sv));
            this.mNameView.setText(this.f87972a.mcName);
            this.itemView.setBackgroundColor(this.itemView.getResources().getColor(R.color.aye));
            C23323e.m76524b(this.mCoverView, this.f87972a.awemeCover);
            this.mCoverView.setRotation(0.0f);
        }
    }

    public MusicCollectionViewHolder(View view, final C33729a aVar) {
        super(view);
        this.f87974c = view.getContext();
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C27326a.m89578a(view) && aVar != null) {
                    if (MusicCollectionViewHolder.this.f87973b) {
                        aVar.mo86141a(MusicCollectionViewHolder.this);
                        return;
                    }
                    aVar.mo86142a(MusicCollectionViewHolder.this, MusicCollectionViewHolder.this.f87972a);
                }
            }
        });
    }
}
