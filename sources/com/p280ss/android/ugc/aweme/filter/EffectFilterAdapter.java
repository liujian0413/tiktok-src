package com.p280ss.android.ugc.aweme.filter;

import android.animation.ObjectAnimator;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.EffectFilterAdapter */
public class EffectFilterAdapter extends BaseAdapter<C29296g> {

    /* renamed from: a */
    public int f76906a;

    /* renamed from: b */
    public boolean f76907b;

    /* renamed from: c */
    public C29249bi f76908c;

    /* renamed from: d */
    public boolean f76909d;

    /* renamed from: e */
    public C29240bc f76910e;

    /* renamed from: f */
    private final int f76911f = -3;

    /* renamed from: g */
    private final int f76912g = -4;

    /* renamed from: h */
    private final int f76913h = 2;

    /* renamed from: i */
    private boolean f76914i;

    /* renamed from: j */
    private C29200ae f76915j;

    /* renamed from: k */
    private RecyclerView f76916k;

    /* renamed from: com.ss.android.ugc.aweme.filter.EffectFilterAdapter$FilterViewHolder */
    public class FilterViewHolder extends C1293v {

        /* renamed from: a */
        ImageView f76918a;

        /* renamed from: b */
        public AVDmtImageTextView f76919b;

        /* renamed from: d */
        private int f76921d = -1;

        /* renamed from: e */
        private ObjectAnimator f76922e;

        /* renamed from: b */
        private void m95624b() {
            if (this.f76922e != null && this.f76922e.isRunning()) {
                this.f76922e.cancel();
            }
            this.f76918a.setRotation(0.0f);
            this.f76918a.setImageResource(R.drawable.ep);
        }

        /* renamed from: a */
        private void m95622a() {
            this.f76918a.setVisibility(0);
            this.f76918a.setImageResource(R.drawable.eq);
            this.f76922e = ObjectAnimator.ofFloat(this.f76918a, "rotation", new float[]{0.0f, 360.0f});
            this.f76922e.setDuration(800);
            this.f76922e.setRepeatMode(1);
            this.f76922e.setRepeatCount(-1);
            this.f76922e.start();
        }

        /* renamed from: a */
        private void m95623a(int i) {
            if (this.f76921d != i) {
                this.f76921d = i;
                switch (i) {
                    case 0:
                        m95624b();
                        this.f76918a.setVisibility(0);
                        return;
                    case 1:
                        m95624b();
                        this.f76918a.setVisibility(8);
                        return;
                    case 2:
                        m95622a();
                        break;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo74662a(C29296g gVar) {
            boolean z;
            this.f76919b.mo103499a(gVar.f77271f.toString());
            this.f76919b.setText(gVar.f77267b);
            AVDmtImageTextView aVDmtImageTextView = this.f76919b;
            if (EffectFilterAdapter.this.f76909d || EffectFilterAdapter.this.f76906a != gVar.f77266a) {
                z = false;
            } else {
                z = true;
            }
            aVDmtImageTextView.mo103501a(z);
            m95623a(C29341z.m96252a(gVar));
        }

        FilterViewHolder(View view) {
            super(view);
            this.f76919b = (AVDmtImageTextView) view.findViewById(R.id.b3o);
            this.f76918a = (ImageView) view.findViewById(R.id.b8u);
            view.setOnClickListener(new OnClickListener(EffectFilterAdapter.this) {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    int adapterPosition = FilterViewHolder.this.getAdapterPosition();
                    if (adapterPosition != -1) {
                        C29296g gVar = (C29296g) EffectFilterAdapter.this.mo62312a().get(adapterPosition);
                        if (gVar instanceof C29324o) {
                            ((C29324o) gVar).f77320o = "click";
                        }
                        boolean z = true;
                        if (C29341z.m96252a(gVar) != 1) {
                            z = false;
                        }
                        if (!z) {
                            FilterManager.m95700a().mo74712a(gVar);
                        }
                        if (EffectFilterAdapter.this.f76908c != null) {
                            EffectFilterAdapter.this.f76908c.mo74817a((C29296g) EffectFilterAdapter.this.mo62312a().get(adapterPosition), z);
                        }
                        FilterViewHolder.this.f76919b.mo103510d(false);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.EffectFilterAdapter$a */
    class C29146a extends C1293v {
        C29146a(View view) {
            super(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.EffectFilterAdapter$b */
    class C29147b extends C1293v {
        C29147b(View view) {
            super(view);
        }
    }

    /* renamed from: c */
    public final int mo60557c() {
        if (this.f76914i || this.f76907b) {
            return 1;
        }
        return super.mo60557c();
    }

    /* renamed from: f */
    public final void mo74660f() {
        C29296g j = mo74661j();
        if (j != null) {
            mo74656b(j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final C29296g mo74661j() {
        if (C6311g.m19573a(mo62312a())) {
            return null;
        }
        for (C29296g gVar : mo62312a()) {
            if (C29341z.m96266c(gVar)) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo58045a(List<C29296g> list) {
        this.f67539l = list;
    }

    /* renamed from: b */
    public final void mo74655b(int i) {
        mo74656b(mo74657c(i));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f76916k = recyclerView;
    }

    public EffectFilterAdapter(C29240bc bcVar) {
        this.f76910e = bcVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo74659e(int i) {
        if (this.f76916k != null) {
            this.f76916k.mo5541b(i);
        }
    }

    /* renamed from: f */
    private void m95605f(int i) {
        if (this.f76916k != null) {
            if (this.f76916k.getWidth() == 0) {
                this.f76916k.post(new C29278d(this, i));
            } else {
                this.f76916k.mo5541b(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo66500c(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f67540m = getItemCount();
    }

    /* renamed from: c */
    public final C29296g mo74657c(int i) {
        for (int i2 = 0; i2 <= i; i2++) {
            if (TextUtils.equals(((C29296g) mo62312a().get(i2)).f77267b, "LINE")) {
                i++;
            }
        }
        return (C29296g) mo62312a().get(i);
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (this.f76914i && i == 0) {
            return -3;
        }
        if (this.f76907b && i == 0) {
            return -4;
        }
        if (((C29296g) mo62312a().get(i)).f77267b.equals("LINE")) {
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    public final boolean mo74656b(C29296g gVar) {
        int itemCount = getItemCount();
        int i = gVar.f77266a;
        if (this.f76906a == i) {
            return true;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= itemCount) {
                break;
            } else if (((C29296g) mo62312a().get(i2)).f77266a == this.f76906a) {
                notifyItemChanged(i2, mo62312a().get(i2));
                break;
            } else {
                i2++;
            }
        }
        for (int i3 = 0; i3 < itemCount; i3++) {
            if (((C29296g) mo62312a().get(i3)).f77266a == i) {
                notifyItemChanged(i3, mo62312a().get(i3));
                m95604a((C29296g) mo62312a().get(i3), i3);
                m95605f(i3);
                this.f76906a = i;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo74658c(C29296g gVar) {
        if (gVar != null) {
            for (int i = 0; i < getItemCount(); i++) {
                if (gVar.f77266a == ((C29296g) mo62312a().get(i)).f77266a) {
                    m95605f(i);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo74653a(C29296g gVar) {
        List a = mo62312a();
        if (C6307b.m19566a((Collection<T>) a)) {
            return -1;
        }
        for (int i = 0; i < a.size(); i++) {
            if (gVar.f77266a == ((C29296g) a.get(i)).f77266a) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74654a(boolean z) {
        this.f76909d = z;
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            if (((C29296g) mo62312a().get(i)).f77266a == this.f76906a) {
                notifyItemChanged(i, mo62312a().get(i));
                notifyItemRangeChanged(i, 1);
                return;
            }
        }
    }

    /* renamed from: a */
    private void m95604a(C29296g gVar, int i) {
        Effect a = C35574k.m114859a().mo70097l().mo74951d().mo74819a(gVar);
        if (this.f76910e != null && a != null) {
            this.f76910e.mo74868a(a.getId(), a.getTagsUpdatedAt(), new C43770t() {
                /* renamed from: a */
                public final void mo9402a() {
                }
            });
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new C29147b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g7, viewGroup, false));
        }
        switch (i) {
            case -4:
                return new C29146a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g6, viewGroup, false));
            case ImageFrame.NV21 /*-3*/:
                this.f76915j = new C29200ae(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g8, viewGroup, false));
                return this.f76915j;
            default:
                return new FilterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.g5, viewGroup, false));
        }
    }

    /* renamed from: a */
    public void mo58033a(C1293v vVar, int i) {
        switch (mo58029a(i)) {
            case -4:
                return;
            case ImageFrame.NV21 /*-3*/:
                ((C29200ae) vVar).mo74797a();
                return;
            case 1:
                ((FilterViewHolder) vVar).mo74662a((C29296g) mo62312a().get(i));
                break;
            case 2:
                return;
        }
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        boolean z;
        if (list.isEmpty()) {
            onBindViewHolder(vVar, i);
            return;
        }
        if (getItemViewType(i) == 1) {
            FilterViewHolder filterViewHolder = (FilterViewHolder) vVar;
            C29296g gVar = (C29296g) mo62312a().get(i);
            AVDmtImageTextView aVDmtImageTextView = filterViewHolder.f76919b;
            if (this.f76909d || this.f76906a != gVar.f77266a) {
                z = false;
            } else {
                z = true;
            }
            aVDmtImageTextView.mo103501a(z);
            if (this.f76906a == gVar.f77266a) {
                filterViewHolder.f76919b.mo103501a(true);
            }
            filterViewHolder.f76919b.mo103510d(false);
        }
    }
}
