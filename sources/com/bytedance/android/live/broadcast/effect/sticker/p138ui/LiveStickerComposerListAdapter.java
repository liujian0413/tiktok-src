package com.bytedance.android.live.broadcast.effect.sticker.p138ui;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2425a;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveStickerComposerListAdapter */
public class LiveStickerComposerListAdapter extends C1262a<C2683b> implements C2425a {

    /* renamed from: a */
    public C2682a f8530a;

    /* renamed from: b */
    private final C2653a f8531b;

    /* renamed from: c */
    private C9355c f8532c;

    /* renamed from: d */
    private List<C9355c> f8533d = new ArrayList();

    /* renamed from: e */
    private C9355c f8534e;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveStickerComposerListAdapter$a */
    public interface C2682a {
        /* renamed from: a */
        void mo9362a(C9355c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveStickerComposerListAdapter$b */
    class C2683b extends C1293v {

        /* renamed from: a */
        ImageView f8539a;

        /* renamed from: b */
        View f8540b;

        /* renamed from: c */
        View f8541c;

        /* renamed from: d */
        View f8542d;

        /* renamed from: e */
        View f8543e;

        C2683b(View view) {
            super(view);
            this.f8539a = (ImageView) view.findViewById(R.id.ay4);
            this.f8540b = view.findViewById(R.id.d26);
            this.f8541c = view.findViewById(R.id.aao);
            this.f8542d = view.findViewById(R.id.btc);
            this.f8543e = view.findViewById(R.id.a_j);
        }
    }

    public int getItemCount() {
        return this.f8533d.size();
    }

    public LiveStickerComposerListAdapter(C2653a aVar) {
        this.f8531b = aVar;
    }

    /* renamed from: b */
    private int m10904b(C9355c cVar) {
        for (int i = 0; i < this.f8533d.size(); i++) {
            if (C9355c.m27822a(cVar, (C9355c) this.f8533d.get(i))) {
                this.f8533d.set(i, cVar);
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo9359a(C9355c cVar) {
        C9355c cVar2 = this.f8532c;
        this.f8532c = cVar;
        if (cVar2 != null && this.f8533d.contains(cVar2)) {
            int indexOf = this.f8533d.indexOf(cVar2);
            if (indexOf >= 0) {
                notifyItemChanged(indexOf);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo9361a(List<Effect> list) {
        this.f8533d.clear();
        for (Effect a : list) {
            C9355c a2 = C2663f.m10852a(a);
            a2.f25582u = this.f8531b.mo8906a(a2);
            this.f8533d.add(a2);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9360a(C9355c cVar, final C2683b bVar) {
        m10903a(cVar, (C43765o) new C43765o() {
            /* renamed from: a */
            public final void mo9278a() {
                bVar.f8543e.setVisibility(0);
            }

            /* renamed from: b */
            public final void mo9279b() {
                bVar.f8543e.setVisibility(8);
            }
        });
    }

    /* renamed from: b */
    public final void mo8908b(String str, C9355c cVar) {
        C9049ap.m27022a((int) R.string.f4i);
        int b = m10904b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C2683b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2683b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.asl, viewGroup, false));
    }

    /* renamed from: a */
    private void m10903a(C9355c cVar, C43765o oVar) {
        if (cVar == null || C6311g.m19573a(cVar.f25569h) || !cVar.f25569h.contains("new")) {
            oVar.mo9279b();
        } else {
            this.f8531b.mo9317a(cVar.f25577p, cVar.f25575n, oVar);
        }
    }

    /* renamed from: c */
    public final void mo8909c(String str, C9355c cVar) {
        if (C9355c.m27822a(this.f8534e, cVar) && this.f8530a != null) {
            C9355c cVar2 = this.f8532c;
            this.f8532c = cVar;
            if (cVar2 != null && this.f8533d.contains(cVar2)) {
                int indexOf = this.f8533d.indexOf(cVar2);
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                }
            }
            this.f8530a.mo9362a(this.f8532c);
        }
        int b = m10904b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(final C2683b bVar, int i) {
        int i2;
        C9355c cVar = (C9355c) this.f8533d.get(i);
        if (cVar != null) {
            int i3 = 0;
            if (!cVar.f25582u && this.f8531b != null && this.f8531b.mo8906a(cVar)) {
                cVar.f25583v = false;
                cVar.f25582u = true;
            }
            C5343e.m17030a(bVar.f8539a, cVar.f25562a.mo8251a());
            View view = bVar.f8542d;
            int i4 = 8;
            if (cVar.f25583v) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
            View view2 = bVar.f8541c;
            if (!cVar.f25582u) {
                i4 = 0;
            }
            view2.setVisibility(i4);
            boolean a = C9355c.m27822a(this.f8532c, cVar);
            View view3 = bVar.f8540b;
            if (!a) {
                i3 = 4;
            }
            view3.setVisibility(i3);
            m10903a(cVar, (C43765o) new C43765o() {
                /* renamed from: a */
                public final void mo9278a() {
                    bVar.f8543e.setVisibility(0);
                }

                /* renamed from: b */
                public final void mo9279b() {
                    bVar.f8543e.setVisibility(8);
                }
            });
            bVar.itemView.setOnClickListener(new C2724o(this, i, bVar, cVar));
        }
    }

    /* renamed from: a */
    public final void mo8907a(String str, C9355c cVar) {
        int b = m10904b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9358a(int i, C2683b bVar, C9355c cVar, View view) {
        C9355c cVar2 = (C9355c) this.f8533d.get(i);
        this.f8531b.mo9318a(cVar2.f25577p, cVar2.f25575n, (C43770t) new C2725p(this, cVar2, bVar));
        if (!this.f8531b.mo8906a(cVar2)) {
            this.f8534e = cVar2;
            this.f8531b.mo8905a(C2418b.f7951b, cVar2, (C2425a) this);
        } else {
            C9355c cVar3 = this.f8532c;
            this.f8532c = cVar2;
            if (cVar3 != null && this.f8533d.contains(cVar3)) {
                int indexOf = this.f8533d.indexOf(cVar3);
                if (indexOf >= 0) {
                    notifyItemChanged(indexOf);
                }
            }
            if (this.f8530a != null) {
                this.f8530a.mo9362a(this.f8532c);
            }
        }
        int b = m10904b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }
}
