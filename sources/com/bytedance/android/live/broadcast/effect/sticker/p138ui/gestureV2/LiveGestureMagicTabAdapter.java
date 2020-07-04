package com.bytedance.android.live.broadcast.effect.sticker.p138ui.gestureV2;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicTabAdapter */
public final class LiveGestureMagicTabAdapter extends C1262a<GestureMagicTabViewHolder> {

    /* renamed from: d */
    public static final C2710a f8611d = new C2710a(null);

    /* renamed from: a */
    public int f8612a;

    /* renamed from: b */
    public C2711b f8613b;

    /* renamed from: c */
    public boolean f8614c = true;

    /* renamed from: e */
    private List<? extends EffectCategoryResponse> f8615e;

    /* renamed from: f */
    private final HashMap<String, Boolean> f8616f = new HashMap<>();

    /* renamed from: g */
    private final Context f8617g;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicTabAdapter$GestureMagicTabViewHolder */
    public final class GestureMagicTabViewHolder extends C1293v {

        /* renamed from: a */
        public final ImageView f8618a;

        /* renamed from: b */
        public final View f8619b;

        /* renamed from: c */
        public final View f8620c;

        /* renamed from: d */
        public final View f8621d;

        /* renamed from: e */
        public final View f8622e;

        /* renamed from: f */
        final /* synthetic */ LiveGestureMagicTabAdapter f8623f;

        public GestureMagicTabViewHolder(LiveGestureMagicTabAdapter liveGestureMagicTabAdapter, View view) {
            C7573i.m23587b(view, "itemView");
            this.f8623f = liveGestureMagicTabAdapter;
            super(view);
            View findViewById = view.findViewById(R.id.ax9);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.icon)");
            this.f8618a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.k5);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.background)");
            this.f8619b = findViewById2;
            View findViewById3 = view.findViewById(R.id.d2h);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.select_view)");
            this.f8620c = findViewById3;
            View findViewById4 = view.findViewById(R.id.bm2);
            C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.line)");
            this.f8621d = findViewById4;
            View findViewById5 = view.findViewById(R.id.cr1);
            C7573i.m23582a((Object) findViewById5, "itemView.findViewById(R.id.red_point)");
            this.f8622e = findViewById5;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicTabAdapter$a */
    public static final class C2710a {
        private C2710a() {
        }

        public /* synthetic */ C2710a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicTabAdapter$b */
    public interface C2711b {
        /* renamed from: a */
        void mo9392a(int i);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicTabAdapter$c */
    static final class C2712c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicTabAdapter f8624a;

        /* renamed from: b */
        final /* synthetic */ GestureMagicTabViewHolder f8625b;

        C2712c(LiveGestureMagicTabAdapter liveGestureMagicTabAdapter, GestureMagicTabViewHolder gestureMagicTabViewHolder) {
            this.f8624a = liveGestureMagicTabAdapter;
            this.f8625b = gestureMagicTabViewHolder;
        }

        public final void onClick(View view) {
            if (this.f8624a.f8614c && this.f8624a.f8612a != this.f8625b.getAdapterPosition()) {
                this.f8624a.notifyItemChanged(this.f8624a.f8612a);
                this.f8624a.f8612a = this.f8625b.getAdapterPosition();
                this.f8624a.notifyItemChanged(this.f8624a.f8612a);
                C2711b bVar = this.f8624a.f8613b;
                if (bVar != null) {
                    bVar.mo9392a(this.f8624a.f8612a);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.gestureV2.LiveGestureMagicTabAdapter$d */
    public static final class C2713d implements C43765o {

        /* renamed from: a */
        final /* synthetic */ LiveGestureMagicTabAdapter f8626a;

        /* renamed from: b */
        final /* synthetic */ GestureMagicTabViewHolder f8627b;

        /* renamed from: c */
        final /* synthetic */ EffectCategoryResponse f8628c;

        /* renamed from: d */
        final /* synthetic */ int f8629d;

        /* renamed from: a */
        public final void mo9278a() {
            this.f8627b.f8622e.setVisibility(0);
        }

        /* renamed from: b */
        public final void mo9279b() {
            this.f8626a.mo9403a(this.f8627b, this.f8628c, this.f8629d + 1);
        }

        C2713d(LiveGestureMagicTabAdapter liveGestureMagicTabAdapter, GestureMagicTabViewHolder gestureMagicTabViewHolder, EffectCategoryResponse effectCategoryResponse, int i) {
            this.f8626a = liveGestureMagicTabAdapter;
            this.f8627b = gestureMagicTabViewHolder;
            this.f8628c = effectCategoryResponse;
            this.f8629d = i;
        }
    }

    public final int getItemCount() {
        List<? extends EffectCategoryResponse> list = this.f8615e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo9404a(C2711b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f8613b = bVar;
    }

    public LiveGestureMagicTabAdapter(Context context) {
        this.f8617g = context;
    }

    /* renamed from: a */
    public final void mo9405a(List<? extends EffectCategoryResponse> list) {
        this.f8615e = list;
        notifyDataSetChanged();
        C2711b bVar = this.f8613b;
        if (bVar != null) {
            bVar.mo9392a(this.f8612a);
        }
    }

    /* renamed from: a */
    public final void mo9406a(boolean z) {
        if (this.f8614c != z) {
            this.f8614c = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public GestureMagicTabViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f8617g).inflate(R.layout.asi, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new GestureMagicTabViewHolder(this, inflate);
    }

    /* renamed from: a */
    private static void m10974a(Effect effect, C43765o oVar) {
        if (C6311g.m19573a(effect.getTags()) || !effect.getTags().contains("new")) {
            oVar.mo9279b();
            return;
        }
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        b.mo9212a().mo9317a(effect.getId(), effect.getTagsUpdatedAt(), oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(GestureMagicTabViewHolder gestureMagicTabViewHolder, int i) {
        C7573i.m23587b(gestureMagicTabViewHolder, "holder");
        if (this.f8612a == i) {
            gestureMagicTabViewHolder.f8619b.setVisibility(0);
        } else {
            gestureMagicTabViewHolder.f8619b.setVisibility(4);
        }
        if (i == this.f8612a || i + 1 == this.f8612a) {
            gestureMagicTabViewHolder.f8621d.setVisibility(8);
        } else {
            gestureMagicTabViewHolder.f8621d.setVisibility(0);
        }
        List<? extends EffectCategoryResponse> list = this.f8615e;
        if (list != null) {
            EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list.get(i);
            if (effectCategoryResponse != null) {
                ImageModel imageModel = new ImageModel();
                ArrayList arrayList = new ArrayList();
                if (this.f8612a == i) {
                    if (!C6319n.m19593a(effectCategoryResponse.icon_selected_url)) {
                        arrayList.add(effectCategoryResponse.icon_selected_url);
                    }
                } else if (!C6319n.m19593a(effectCategoryResponse.icon_normal_url)) {
                    arrayList.add(effectCategoryResponse.icon_normal_url);
                }
                List list2 = arrayList;
                if (C6311g.m19573a(list2)) {
                    gestureMagicTabViewHolder.f8618a.setImageResource(R.drawable.c5d);
                } else {
                    imageModel.setUrls(list2);
                    C5343e.m17030a(gestureMagicTabViewHolder.f8618a, imageModel);
                }
                if (!this.f8616f.containsKey(effectCategoryResponse.f113500id) || !C7573i.m23585a((Object) (Boolean) this.f8616f.get(effectCategoryResponse.f113500id), (Object) Boolean.valueOf(true))) {
                    gestureMagicTabViewHolder.f8620c.setVisibility(8);
                } else {
                    gestureMagicTabViewHolder.f8620c.setVisibility(0);
                }
                if (this.f8612a != i) {
                    gestureMagicTabViewHolder.f8620c.setAlpha(0.4f);
                } else {
                    gestureMagicTabViewHolder.f8620c.setAlpha(1.0f);
                }
                gestureMagicTabViewHolder.f8622e.setVisibility(8);
                mo9403a(gestureMagicTabViewHolder, effectCategoryResponse, 0);
                gestureMagicTabViewHolder.itemView.setOnClickListener(new C2712c(this, gestureMagicTabViewHolder));
            }
        }
    }

    /* renamed from: a */
    public final void mo9407a(boolean z, int i) {
        int i2;
        List<? extends EffectCategoryResponse> list = this.f8615e;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = -1;
        }
        if (i2 >= i) {
            List<? extends EffectCategoryResponse> list2 = this.f8615e;
            if (list2 != null) {
                EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) list2.get(i);
                if (effectCategoryResponse != null) {
                    String str = effectCategoryResponse.f113500id;
                    if (str != null) {
                        this.f8616f.put(str, Boolean.valueOf(z));
                        notifyItemChanged(i);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9403a(GestureMagicTabViewHolder gestureMagicTabViewHolder, EffectCategoryResponse effectCategoryResponse, int i) {
        if (i >= effectCategoryResponse.totalEffects.size() || i == 30) {
            gestureMagicTabViewHolder.f8622e.setVisibility(8);
            return;
        }
        Object obj = effectCategoryResponse.totalEffects.get(i);
        C7573i.m23582a(obj, "response.totalEffects[i]");
        m10974a((Effect) obj, (C43765o) new C2713d(this, gestureMagicTabViewHolder, effectCategoryResponse, i));
    }
}
