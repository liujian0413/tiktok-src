package com.bytedance.android.live.broadcast.effect.sticker.p138ui.gestureV2;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.api.p126b.C2424d.C2425a;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2655b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicListAdapter */
public final class LiveGestureMagicListAdapter extends C1262a<GestureMagicViewHolder> implements C2425a {

    /* renamed from: g */
    public static final C2704a f8590g = new C2704a(null);

    /* renamed from: a */
    public final C2653a f8591a;

    /* renamed from: b */
    public C2705b f8592b;

    /* renamed from: c */
    public C9355c f8593c;

    /* renamed from: d */
    public final List<C9355c> f8594d;

    /* renamed from: e */
    public C9355c f8595e;

    /* renamed from: f */
    public boolean f8596f = true;

    /* renamed from: h */
    private EffectCategoryResponse f8597h;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicListAdapter$GestureMagicViewHolder */
    public final class GestureMagicViewHolder extends C1293v {

        /* renamed from: a */
        public final ImageView f8598a;

        /* renamed from: b */
        public final View f8599b;

        /* renamed from: c */
        public final View f8600c;

        /* renamed from: d */
        public final ProgressBar f8601d;

        /* renamed from: e */
        public final View f8602e;

        /* renamed from: f */
        final /* synthetic */ LiveGestureMagicListAdapter f8603f;

        public GestureMagicViewHolder(LiveGestureMagicListAdapter liveGestureMagicListAdapter, View view) {
            C7573i.m23587b(view, "itemView");
            this.f8603f = liveGestureMagicListAdapter;
            super(view);
            View findViewById = view.findViewById(R.id.ay4);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.image)");
            this.f8598a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.k5);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.background)");
            this.f8599b = findViewById2;
            View findViewById3 = view.findViewById(R.id.aao);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.download_icon)");
            this.f8600c = findViewById3;
            View findViewById4 = view.findViewById(R.id.btc);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.loading)");
            this.f8601d = (ProgressBar) findViewById4;
            View findViewById5 = view.findViewById(R.id.cr1);
            C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.red_point)");
            this.f8602e = findViewById5;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicListAdapter$a */
    public static final class C2704a {
        private C2704a() {
        }

        public /* synthetic */ C2704a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicListAdapter$b */
    public interface C2705b {
        /* renamed from: a */
        void mo9393a(boolean z, C9355c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicListAdapter$c */
    public static final class C2706c implements C43765o {

        /* renamed from: a */
        final /* synthetic */ GestureMagicViewHolder f8604a;

        /* renamed from: a */
        public final void mo9278a() {
            this.f8604a.f8602e.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo9279b() {
            this.f8604a.f8602e.setVisibility(8);
        }

        C2706c(GestureMagicViewHolder gestureMagicViewHolder) {
            this.f8604a = gestureMagicViewHolder;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicListAdapter$d */
    static final class C2707d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicListAdapter f8605a;

        /* renamed from: b */
        final /* synthetic */ GestureMagicViewHolder f8606b;

        /* renamed from: c */
        final /* synthetic */ C9355c f8607c;

        C2707d(LiveGestureMagicListAdapter liveGestureMagicListAdapter, GestureMagicViewHolder gestureMagicViewHolder, C9355c cVar) {
            this.f8605a = liveGestureMagicListAdapter;
            this.f8606b = gestureMagicViewHolder;
            this.f8607c = cVar;
        }

        public final void onClick(View view) {
            if (this.f8605a.f8596f) {
                final C9355c cVar = (C9355c) this.f8605a.f8594d.get(this.f8606b.getAdapterPosition());
                this.f8605a.f8591a.mo9318a(cVar.f25577p, this.f8607c.f25575n, (C43770t) new C43770t(this) {

                    /* renamed from: a */
                    final /* synthetic */ C2707d f8608a;

                    {
                        this.f8608a = r1;
                    }

                    /* renamed from: a */
                    public final void mo9402a() {
                        this.f8608a.f8605a.mo9397a(cVar, (C43765o) new C43765o(this) {

                            /* renamed from: a */
                            final /* synthetic */ C27081 f8610a;

                            /* renamed from: a */
                            public final void mo9278a() {
                                this.f8610a.f8608a.f8606b.f8602e.setVisibility(0);
                            }

                            /* renamed from: b */
                            public final void mo9279b() {
                                this.f8610a.f8608a.f8606b.f8602e.setVisibility(8);
                            }

                            {
                                this.f8610a = r1;
                            }
                        });
                    }
                });
                if (C9355c.m27822a(cVar, this.f8605a.f8593c)) {
                    C2705b bVar = this.f8605a.f8592b;
                    if (bVar != null) {
                        bVar.mo9393a(false, this.f8605a.f8593c);
                    }
                    this.f8605a.f8593c = null;
                } else if (!this.f8605a.f8591a.mo8906a(cVar)) {
                    this.f8605a.f8595e = cVar;
                    this.f8605a.f8591a.mo8905a(C2418b.f7950a, cVar, (C2425a) this.f8605a);
                } else {
                    if (!C9355c.m27822a(this.f8605a.f8593c, cVar)) {
                        C2705b bVar2 = this.f8605a.f8592b;
                        if (bVar2 != null) {
                            bVar2.mo9393a(false, this.f8605a.f8593c);
                        }
                    }
                    C9355c cVar2 = this.f8605a.f8593c;
                    this.f8605a.f8593c = cVar;
                    if (cVar2 != null && LiveGestureMagicListAdapter.m10956a(cVar2, this.f8605a.f8594d)) {
                        int a = LiveGestureMagicListAdapter.m10953a(this.f8605a.f8594d, cVar2);
                        if (a >= 0) {
                            this.f8605a.notifyItemChanged(a);
                        }
                    }
                    C2705b bVar3 = this.f8605a.f8592b;
                    if (bVar3 != null) {
                        bVar3.mo9393a(true, this.f8605a.f8593c);
                    }
                }
                this.f8605a.mo9400b(cVar);
                this.f8605a.notifyItemChanged(this.f8606b.getAdapterPosition());
            }
        }
    }

    /* renamed from: a */
    public final void mo8907a(String str, C9355c cVar) {
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(cVar, "sticker");
        if (mo9400b(cVar) >= 0) {
            notifyDataSetChanged();
        }
    }

    public final int getItemCount() {
        if (C6311g.m19573a(this.f8594d)) {
            return 0;
        }
        return this.f8594d.size();
    }

    public LiveGestureMagicListAdapter() {
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        C2655b a = b.mo9212a();
        C7573i.m23582a((Object) a, "LiveInternalService.inst…e().liveComposerPresenter");
        this.f8591a = a;
        this.f8594d = new ArrayList();
    }

    /* renamed from: a */
    public final void mo9395a(C2705b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f8592b = bVar;
    }

    /* renamed from: a */
    public final void mo9399a(boolean z) {
        if (this.f8596f != z) {
            this.f8596f = z;
        }
    }

    /* renamed from: b */
    public final int mo9400b(C9355c cVar) {
        int size = this.f8594d.size();
        for (int i = 0; i < size; i++) {
            if (C9355c.m27822a(cVar, (C9355c) this.f8594d.get(i))) {
                this.f8594d.set(i, cVar);
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo9396a(C9355c cVar) {
        C7573i.m23587b(cVar, "sticker");
        if (!C9355c.m27822a(this.f8593c, cVar)) {
            if (this.f8593c != null) {
                List<C9355c> list = this.f8594d;
                C9355c cVar2 = this.f8593c;
                if (cVar2 == null) {
                    C7573i.m23580a();
                }
                notifyItemChanged(m10953a(list, cVar2));
            }
            int a = m10953a(this.f8594d, cVar);
            this.f8593c = (C9355c) this.f8594d.get(a);
            notifyItemChanged(a);
        }
    }

    /* renamed from: a */
    public final void mo9398a(EffectCategoryResponse effectCategoryResponse) {
        if (effectCategoryResponse != null && !C6311g.m19573a(effectCategoryResponse.totalEffects)) {
            this.f8597h = effectCategoryResponse;
            this.f8594d.clear();
            for (Effect a : effectCategoryResponse.totalEffects) {
                C9355c a2 = C2663f.m10852a(a);
                C7573i.m23582a((Object) a2, "sticker");
                a2.f25582u = this.f8591a.mo8906a(a2);
                this.f8594d.add(a2);
            }
            if (this.f8593c != null) {
                C9355c cVar = this.f8593c;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                if (!m10956a(cVar, this.f8594d)) {
                    this.f8593c = null;
                }
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public static int m10953a(List<C9355c> list, C9355c cVar) {
        int i = 0;
        for (C9355c a : list) {
            if (C9355c.m27822a(a, cVar)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo8908b(String str, C9355c cVar) {
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(cVar, "sticker");
        C9049ap.m27022a((int) R.string.eqf);
        int b = mo9400b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public GestureMagicViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ase, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…ure_magic, parent, false)");
        return new GestureMagicViewHolder(this, inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(GestureMagicViewHolder gestureMagicViewHolder, int i) {
        int i2;
        C7573i.m23587b(gestureMagicViewHolder, "holder");
        C9355c cVar = (C9355c) this.f8594d.get(i);
        C5343e.m17030a(gestureMagicViewHolder.f8598a, cVar.f25562a.mo8251a());
        int i3 = 8;
        gestureMagicViewHolder.f8599b.setVisibility(8);
        if (C9355c.m27822a(this.f8593c, cVar)) {
            gestureMagicViewHolder.f8599b.setVisibility(0);
        }
        ProgressBar progressBar = gestureMagicViewHolder.f8601d;
        if (cVar.f25583v) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        progressBar.setVisibility(i2);
        View view = gestureMagicViewHolder.f8600c;
        if (!cVar.f25582u) {
            i3 = 0;
        }
        view.setVisibility(i3);
        mo9397a(cVar, (C43765o) new C2706c(gestureMagicViewHolder));
        gestureMagicViewHolder.itemView.setOnClickListener(new C2707d(this, gestureMagicViewHolder, cVar));
    }

    /* renamed from: c */
    public final void mo8909c(String str, C9355c cVar) {
        Object obj;
        C7573i.m23587b(str, "panel");
        C7573i.m23587b(cVar, "sticker");
        if (this.f8596f) {
            long j = cVar.f25566e;
            C9355c cVar2 = this.f8595e;
            if (cVar2 != null) {
                obj = Long.valueOf(cVar2.f25566e);
            } else {
                obj = Integer.valueOf(-1);
            }
            if ((obj instanceof Long) && j == ((Long) obj).longValue()) {
                C2705b bVar = this.f8592b;
                if (bVar != null) {
                    bVar.mo9393a(false, this.f8593c);
                }
                C9355c cVar3 = this.f8593c;
                this.f8593c = cVar;
                if (cVar3 != null && m10956a(cVar3, this.f8594d)) {
                    int a = m10953a(this.f8594d, cVar3);
                    if (a >= 0) {
                        notifyItemChanged(a);
                    }
                }
                C2705b bVar2 = this.f8592b;
                if (bVar2 != null) {
                    bVar2.mo9393a(true, this.f8593c);
                }
            }
        }
        int b = mo9400b(cVar);
        if (b >= 0) {
            notifyItemChanged(b);
        }
    }

    /* renamed from: a */
    public static boolean m10956a(C9355c cVar, List<? extends C9355c> list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C9355c) obj).mo22813a(cVar)) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo9397a(C9355c cVar, C43765o oVar) {
        if (cVar == null || C6311g.m19573a(cVar.f25569h) || !cVar.f25569h.contains("new")) {
            oVar.mo9279b();
        } else {
            this.f8591a.mo9317a(cVar.f25577p, cVar.f25575n, oVar);
        }
    }
}
