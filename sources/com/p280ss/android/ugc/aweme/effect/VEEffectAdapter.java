package com.p280ss.android.ugc.aweme.effect;

import android.animation.ObjectAnimator;
import android.graphics.Bitmap.Config;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.effect.base.AbsVEDownloadableEffectAdapter;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.effect.VEEffectAdapter */
public class VEEffectAdapter extends AbsVEDownloadableEffectAdapter<ViewHolder> {

    /* renamed from: a */
    public C27350a f72165a;

    /* renamed from: com.ss.android.ugc.aweme.effect.VEEffectAdapter$ViewHolder */
    public class ViewHolder extends C1293v {

        /* renamed from: a */
        public AVDmtImageTextView f72166a = ((AVDmtImageTextView) this.itemView.findViewById(R.id.db2));

        /* renamed from: b */
        ImageView f72167b;

        /* renamed from: d */
        private ObjectAnimator f72169d;

        /* renamed from: e */
        private int f72170e = -1;

        /* renamed from: b */
        private void m89677b() {
            if (this.f72169d != null && this.f72169d.isRunning()) {
                this.f72169d.cancel();
            }
            this.f72167b.setRotation(0.0f);
            this.f72167b.setImageResource(R.drawable.ep);
        }

        /* renamed from: a */
        private void m89674a() {
            this.f72167b.setVisibility(0);
            this.f72167b.setImageResource(R.drawable.eq);
            this.f72169d = ObjectAnimator.ofFloat(this.f72167b, "rotation", new float[]{0.0f, 360.0f});
            this.f72169d.setDuration(800);
            this.f72169d.setRepeatMode(1);
            this.f72169d.setRepeatCount(-1);
            this.f72169d.start();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo70410a(boolean z) {
            this.f72166a.mo103506b(z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo70408a(View view) {
            int adapterPosition = getAdapterPosition();
            if (-1 != adapterPosition) {
                VEEffectAdapter.this.f72165a.mo70401a(5, adapterPosition, (EffectModel) VEEffectAdapter.this.f72283c.get(adapterPosition));
            }
        }

        /* renamed from: a */
        private void m89675a(int i) {
            if (this.f72170e != i) {
                this.f72170e = i;
                switch (i) {
                    case 0:
                        m89677b();
                        this.f72167b.setVisibility(0);
                        return;
                    case 1:
                        this.f72167b.setVisibility(8);
                        return;
                    case 2:
                        m89674a();
                        return;
                    case 3:
                        m89677b();
                        this.f72167b.setVisibility(8);
                        return;
                    case 4:
                        this.f72167b.setVisibility(0);
                        m89677b();
                        break;
                }
            }
        }

        /* renamed from: a */
        private void m89676a(EffectModel effectModel) {
            if (!TextUtils.isEmpty(effectModel.iconUrl) && !effectModel.iconUrl.equals(this.f72166a.getTag())) {
                if (C27431j.m89895a(effectModel)) {
                    this.f72166a.mo103496a(this.f72166a.getResources().getDrawable(C35574k.m114861b().getResources().getIdentifier(effectModel.iconUrl, "drawable", C35574k.m114861b().getPackageName())));
                } else {
                    this.f72166a.mo103500a(effectModel.iconUrl, Config.RGB_565);
                }
                this.f72166a.setTag(effectModel.iconUrl);
            }
        }

        public ViewHolder(View view) {
            super(view);
            this.f72167b = (ImageView) view.findViewById(R.id.b8u);
            this.f72166a.mo103503a(true, false);
            this.f72166a.setOnTouchListener(new C27444u(this));
            this.f72166a.setOnClickListener(new C27445v(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo70409a(EffectModel effectModel, int i) {
            if (effectModel != null) {
                this.f72166a.setText(effectModel.name);
                m89676a(effectModel);
                m89675a(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ boolean mo70411a(View view, MotionEvent motionEvent) {
            int adapterPosition = getAdapterPosition();
            if (-1 == adapterPosition) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 3) {
                switch (action) {
                    case 0:
                        if (VEEffectAdapter.this.f72165a != null) {
                            VEEffectAdapter.this.f72165a.mo70401a(0, adapterPosition, (EffectModel) VEEffectAdapter.this.f72283c.get(adapterPosition));
                            break;
                        }
                        break;
                    case 1:
                        break;
                }
            }
            if (VEEffectAdapter.this.f72165a != null) {
                VEEffectAdapter.this.f72165a.mo70401a(1, adapterPosition, (EffectModel) VEEffectAdapter.this.f72283c.get(adapterPosition));
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.VEEffectAdapter$a */
    public interface C27350a {
        /* renamed from: a */
        void mo70401a(int i, int i2, EffectModel effectModel);
    }

    public int getItemCount() {
        if (this.f72283c == null) {
            return 0;
        }
        return this.f72283c.size();
    }

    public int getItemViewType(int i) {
        if (C27431j.m89896a(((EffectModel) this.f72283c.get(i)).category)) {
            return 2;
        }
        return 1;
    }

    public VEEffectAdapter(RecyclerView recyclerView, C27359a aVar) {
        super(recyclerView, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mo70409a((EffectModel) this.f72283c.get(i), mo70492a(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uy, viewGroup, false));
        viewHolder.f72166a.mo103503a(true, false);
        if (i == 2) {
            viewHolder.f72166a.setOnTouchListener(null);
        } else {
            viewHolder.f72166a.setOnClickListener(null);
        }
        return viewHolder;
    }
}
