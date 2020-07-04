package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.s */
final class C36569s extends BaseAdapter<Integer> {

    /* renamed from: a */
    public boolean f95966a;

    /* renamed from: b */
    public int f95967b;

    /* renamed from: c */
    public C36572b f95968c;

    /* renamed from: d */
    public Map<Integer, Boolean> f95969d = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.s$a */
    class C36571a extends C1293v {

        /* renamed from: b */
        private ImageView f95971b;

        /* renamed from: c */
        private ImageView f95972c;

        /* renamed from: a */
        public final void mo92784a(int i) {
            ImageView imageView;
            if (!C6307b.m19566a((Collection<T>) C36569s.this.f67539l) && i < C36569s.this.f67539l.size()) {
                this.f95971b.setImageResource(((Integer) C36569s.this.f67539l.get(i)).intValue());
            }
            int i2 = 4;
            if (!C36569s.this.f95966a) {
                imageView = this.f95972c;
                if (C36569s.this.f95967b == i) {
                    i2 = 0;
                }
            } else if (C36569s.this.f95967b != i) {
                imageView = this.f95972c;
            } else {
                Boolean bool = (Boolean) C36569s.this.f95969d.get(Integer.valueOf(i));
                ImageView imageView2 = this.f95972c;
                if (bool != null && bool.booleanValue()) {
                    i2 = 0;
                }
                imageView2.setVisibility(i2);
                this.itemView.setOnClickListener(new C36573t(this, i));
            }
            imageView.setVisibility(i2);
            this.itemView.setOnClickListener(new C36573t(this, i));
        }

        private C36571a(View view) {
            super(view);
            this.f95971b = (ImageView) view.findViewById(R.id.b3e);
            this.f95972c = (ImageView) view.findViewById(R.id.a6n);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo92785a(int i, View view) {
            boolean z;
            C36569s.this.mo92782b(i);
            if (C36569s.this.f95968c != null) {
                C36569s.this.f95968c.mo92345a(i);
            }
            if (C36569s.this.f95966a) {
                Boolean bool = (Boolean) C36569s.this.f95969d.get(Integer.valueOf(i));
                Map<Integer, Boolean> map = C36569s.this.f95969d;
                Integer valueOf = Integer.valueOf(i);
                if (bool == null || !bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                map.put(valueOf, Boolean.valueOf(z));
                C36569s.this.mo92781a(bool, i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.s$b */
    public interface C36572b {
        /* renamed from: a */
        void mo92345a(int i);
    }

    /* renamed from: f */
    public final void mo92783f() {
        this.f95969d.clear();
    }

    C36569s() {
    }

    /* renamed from: b */
    public final void mo92782b(int i) {
        this.f95967b = i;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((C36571a) vVar).mo92784a(i);
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new C36571a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tf, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo92781a(Boolean bool, int i) {
        if (bool == null || !bool.booleanValue()) {
            for (Entry entry : this.f95969d.entrySet()) {
                if (((Integer) entry.getKey()).intValue() != i) {
                    entry.setValue(Boolean.valueOf(false));
                }
            }
        }
    }
}
