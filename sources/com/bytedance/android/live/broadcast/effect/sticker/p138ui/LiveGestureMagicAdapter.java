package com.bytedance.android.live.broadcast.effect.sticker.p138ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2425a;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.live.broadcast.effect.sticker.p138ui.LiveGestureMagicPageAdapter.C2679b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveGestureMagicAdapter */
public class LiveGestureMagicAdapter extends C1262a implements C2425a {

    /* renamed from: a */
    public C2679b f8504a;

    /* renamed from: b */
    private final C2653a f8505b;

    /* renamed from: c */
    private C9355c f8506c;

    /* renamed from: d */
    private List<C9355c> f8507d = new ArrayList();

    /* renamed from: e */
    private EffectCategoryResponse f8508e;

    /* renamed from: f */
    private C9355c f8509f;

    /* renamed from: g */
    private boolean f8510g;

    /* renamed from: h */
    private C9355c f8511h;

    /* renamed from: i */
    private boolean f8512i;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveGestureMagicAdapter$a */
    class C2676a extends C1293v {
        C2676a(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveGestureMagicAdapter$b */
    class C2677b extends C1293v {

        /* renamed from: a */
        public final ImageView f8514a;

        /* renamed from: b */
        public final View f8515b;

        /* renamed from: c */
        public final View f8516c;

        /* renamed from: d */
        public final ProgressBar f8517d;

        C2677b(View view) {
            super(view);
            this.f8514a = (ImageView) view.findViewById(R.id.ay4);
            this.f8515b = view.findViewById(R.id.k5);
            this.f8516c = view.findViewById(R.id.aao);
            this.f8517d = (ProgressBar) view.findViewById(R.id.btc);
        }
    }

    /* renamed from: b */
    public final void mo9351b() {
        this.f8512i = false;
        if (this.f8510g) {
            this.f8510g = false;
            if (this.f8504a != null) {
                this.f8504a.mo9357a(Boolean.valueOf(false), this.f8506c);
            }
            this.f8511h = this.f8506c;
            this.f8506c = null;
            notifyDataSetChanged();
        }
    }

    public int getItemCount() {
        if (C6311g.m19573a(this.f8507d)) {
            return 0;
        }
        if (this.f8507d.size() <= 3) {
            return this.f8507d.size() + 1;
        }
        return this.f8507d.size();
    }

    /* renamed from: a */
    public final void mo9348a() {
        this.f8512i = true;
        if (this.f8508e != null && !C6311g.m19573a(this.f8508e.totalEffects) && !this.f8510g) {
            this.f8510g = true;
            if (this.f8511h == null) {
                for (C9355c cVar : this.f8507d) {
                    Iterator it = C2515f.m10417f().mo9074a().mo8884a(C2418b.f7950a).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C9355c) it.next()).mo22813a(cVar)) {
                                this.f8506c = cVar;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (this.f8506c != null) {
                        break;
                    }
                }
                if (this.f8506c == null) {
                    this.f8506c = C2663f.m10852a((Effect) this.f8508e.totalEffects.get(0));
                }
            } else {
                this.f8506c = this.f8511h;
            }
            if (!this.f8505b.mo8906a(this.f8506c)) {
                this.f8509f = this.f8506c;
                this.f8505b.mo8905a(C2418b.f7950a, this.f8506c, (C2425a) this);
            } else if (this.f8504a != null) {
                this.f8504a.mo9357a(Boolean.valueOf(true), this.f8506c);
            }
            if (this.f8504a != null) {
                this.f8504a.mo9357a(Boolean.valueOf(true), this.f8506c);
            }
            notifyDataSetChanged();
        }
    }

    public LiveGestureMagicAdapter(C2653a aVar) {
        this.f8505b = aVar;
    }

    public int getItemViewType(int i) {
        if (i >= this.f8507d.size()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    private int m10883a(C9355c cVar) {
        for (int i = 0; i < this.f8507d.size(); i++) {
            if (C9355c.m27822a(cVar, (C9355c) this.f8507d.get(i))) {
                this.f8507d.set(i, cVar);
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo9350a(EffectCategoryResponse effectCategoryResponse) {
        if (effectCategoryResponse != null && !C6311g.m19573a(effectCategoryResponse.totalEffects)) {
            this.f8508e = effectCategoryResponse;
            this.f8507d.clear();
            for (Effect a : effectCategoryResponse.totalEffects) {
                C9355c a2 = C2663f.m10852a(a);
                a2.f25582u = this.f8505b.mo8906a(a2);
                this.f8507d.add(a2);
            }
            if (this.f8512i) {
                mo9348a();
                this.f8512i = false;
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo8907a(String str, C9355c cVar) {
        if (m10883a(cVar) >= 0) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo8908b(String str, C9355c cVar) {
        C9049ap.m27022a((int) R.string.eqf);
        int a = m10883a(cVar);
        if (a >= 0) {
            notifyItemChanged(a);
        }
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            return new C2676a(from.inflate(R.layout.ash, viewGroup, false));
        }
        return new C2677b(from.inflate(R.layout.asf, viewGroup, false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9349a(int i, View view) {
        if (this.f8510g) {
            C9355c cVar = (C9355c) this.f8507d.get(i);
            if (this.f8506c == null || !this.f8506c.mo22813a(cVar)) {
                if (!this.f8505b.mo8906a(cVar)) {
                    this.f8509f = cVar;
                    this.f8505b.mo8905a(C2418b.f7950a, cVar, (C2425a) this);
                } else {
                    if (!(this.f8506c == null || this.f8506c.f25566e == cVar.f25566e || this.f8504a == null)) {
                        this.f8504a.mo9357a(Boolean.valueOf(false), this.f8506c);
                    }
                    C9355c cVar2 = this.f8506c;
                    this.f8506c = cVar;
                    if (cVar2 != null && this.f8507d.contains(cVar2)) {
                        int indexOf = this.f8507d.indexOf(cVar2);
                        if (indexOf >= 0) {
                            notifyItemChanged(indexOf);
                        }
                    }
                    if (this.f8504a != null) {
                        this.f8504a.mo9357a(Boolean.valueOf(true), this.f8506c);
                    }
                }
                m10883a(cVar);
                notifyItemChanged(i);
            }
        }
    }

    /* renamed from: c */
    public final void mo8909c(String str, C9355c cVar) {
        if (this.f8510g && cVar.f25566e == this.f8509f.f25566e && this.f8504a != null) {
            this.f8504a.mo9357a(Boolean.valueOf(false), this.f8506c);
            C9355c cVar2 = this.f8506c;
            this.f8506c = cVar;
            if (cVar2 != null && this.f8507d.contains(cVar2)) {
                int indexOf = this.f8507d.indexOf(cVar2);
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                }
            }
            this.f8504a.mo9357a(Boolean.valueOf(true), this.f8506c);
        }
        int a = m10883a(cVar);
        if (a >= 0) {
            notifyItemChanged(a);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        int i2;
        if (getItemViewType(i) == 1) {
            C2677b bVar = (C2677b) vVar;
            C9355c cVar = (C9355c) this.f8507d.get(i);
            C5343e.m17030a(bVar.f8514a, cVar.f25562a.mo8251a());
            int i3 = 8;
            bVar.f8515b.setVisibility(8);
            if (this.f8506c != null && this.f8506c.f25566e == cVar.f25566e) {
                bVar.f8515b.setVisibility(0);
            }
            ProgressBar progressBar = bVar.f8517d;
            if (cVar.f25583v) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
            View view = bVar.f8516c;
            if (!cVar.f25582u) {
                i3 = 0;
            }
            view.setVisibility(i3);
            bVar.itemView.setOnClickListener(new C2685b(this, i));
        }
    }
}
