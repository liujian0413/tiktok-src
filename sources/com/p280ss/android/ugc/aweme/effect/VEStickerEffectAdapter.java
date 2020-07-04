package com.p280ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.effect.base.AbsVEDownloadableEffectAdapter;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.effect.VEStickerEffectAdapter */
public class VEStickerEffectAdapter extends AbsVEDownloadableEffectAdapter<C27354b> {

    /* renamed from: a */
    public C27353a f72205a;

    /* renamed from: b */
    public int f72206b = -1;

    /* renamed from: com.ss.android.ugc.aweme.effect.VEStickerEffectAdapter$a */
    public interface C27353a {
        /* renamed from: a */
        void mo70405a(EffectModel effectModel, int i, int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.VEStickerEffectAdapter$b */
    class C27354b extends C1293v {

        /* renamed from: a */
        AVDmtImageTextView f72207a;

        /* renamed from: b */
        ImageView f72208b;

        /* renamed from: d */
        private ObjectAnimator f72210d;

        /* renamed from: e */
        private int f72211e = -1;

        /* renamed from: b */
        private void m89706b() {
            if (this.f72210d != null && this.f72210d.isRunning()) {
                this.f72210d.cancel();
            }
            this.f72208b.setRotation(0.0f);
            this.f72208b.setImageResource(R.drawable.ep);
        }

        /* renamed from: a */
        private void m89704a() {
            this.f72208b.setVisibility(0);
            this.f72208b.setImageResource(R.drawable.eq);
            this.f72210d = ObjectAnimator.ofFloat(this.f72208b, "rotation", new float[]{0.0f, 360.0f});
            this.f72210d.setDuration(800);
            this.f72210d.setRepeatMode(1);
            this.f72210d.setRepeatCount(-1);
            this.f72210d.start();
        }

        /* renamed from: a */
        private void m89705a(int i) {
            if (this.f72211e != i) {
                this.f72211e = i;
                switch (i) {
                    case 0:
                        m89706b();
                        this.f72208b.setVisibility(0);
                        return;
                    case 1:
                        this.f72208b.setVisibility(8);
                        return;
                    case 2:
                        m89704a();
                        return;
                    case 3:
                        m89706b();
                        this.f72208b.setVisibility(8);
                        return;
                    case 4:
                        this.f72208b.setVisibility(0);
                        m89706b();
                        break;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo70446a(View view) {
            int i;
            int adapterPosition = getAdapterPosition();
            if (adapterPosition != -1) {
                if (VEStickerEffectAdapter.this.f72206b == adapterPosition) {
                    VEStickerEffectAdapter.this.f72206b = -1;
                    i = 2;
                } else {
                    if (C38527bf.m123172a(((EffectModel) VEStickerEffectAdapter.this.f72283c.get(adapterPosition)).resDir)) {
                        VEStickerEffectAdapter.this.f72206b = adapterPosition;
                    } else {
                        VEStickerEffectAdapter.this.f72206b = -1;
                    }
                    i = 1;
                }
                if (VEStickerEffectAdapter.this.f72205a != null) {
                    VEStickerEffectAdapter.this.f72205a.mo70405a((EffectModel) VEStickerEffectAdapter.this.f72283c.get(getAdapterPosition()), i, adapterPosition);
                }
                VEStickerEffectAdapter.this.notifyDataSetChanged();
            }
        }

        C27354b(View view) {
            super(view);
            this.f72207a = (AVDmtImageTextView) view.findViewById(R.id.db2);
            this.f72208b = (ImageView) view.findViewById(R.id.b8u);
            this.f72207a.setOnClickListener(new C27392at(this));
        }

        /* renamed from: a */
        public final void mo70445a(int i, int i2) {
            boolean z;
            EffectModel effectModel = (EffectModel) VEStickerEffectAdapter.this.f72283c.get(i);
            if (effectModel != null) {
                this.f72207a.mo103499a(effectModel.iconUrl);
                this.f72207a.setText(effectModel.name);
                AVDmtImageTextView aVDmtImageTextView = this.f72207a;
                if (i == VEStickerEffectAdapter.this.f72206b) {
                    z = true;
                } else {
                    z = false;
                }
                aVDmtImageTextView.mo103501a(z);
                m89705a(i2);
            }
        }
    }

    public int getItemCount() {
        if (this.f72283c == null) {
            return 0;
        }
        return this.f72283c.size();
    }

    /* renamed from: a */
    public final void mo70444a(EffectPointModel effectPointModel) {
        if (effectPointModel == null) {
            if (this.f72206b != -1) {
                int i = this.f72206b;
                this.f72206b = -1;
                notifyItemChanged(i);
            }
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f72283c.size()) {
                break;
            } else if (((EffectModel) this.f72283c.get(i2)).key.equals(effectPointModel.getKey())) {
                this.f72206b = i2;
                break;
            } else {
                i2++;
            }
        }
        notifyItemChanged(this.f72206b);
    }

    public VEStickerEffectAdapter(RecyclerView recyclerView, C27359a aVar) {
        super(recyclerView, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C27354b bVar, int i) {
        bVar.mo70445a(i, mo70492a(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C27354b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C27354b(((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(R.layout.a3e, viewGroup, false));
    }
}
