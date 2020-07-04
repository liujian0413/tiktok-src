package com.bytedance.android.live.broadcast.effect.sticker.p138ui;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveGestureMagicPageAdapter */
public class LiveGestureMagicPageAdapter extends C1262a<C2678a> {

    /* renamed from: a */
    public C2679b f8519a;

    /* renamed from: b */
    private final C2653a f8520b;

    /* renamed from: c */
    private Map<String, C9355c> f8521c = new HashMap();

    /* renamed from: d */
    private List<EffectCategoryResponse> f8522d;

    /* renamed from: e */
    private SparseArray<LiveGestureMagicAdapter> f8523e = new SparseArray<>();

    /* renamed from: f */
    private boolean f8524f;

    /* renamed from: g */
    private boolean f8525g;

    /* renamed from: h */
    private Context f8526h;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveGestureMagicPageAdapter$a */
    class C2678a extends C1293v {

        /* renamed from: a */
        ImageView f8527a;

        /* renamed from: b */
        RecyclerView f8528b;

        C2678a(View view) {
            super(view);
            this.f8527a = (ImageView) view.findViewById(R.id.ay4);
            this.f8528b = (RecyclerView) view.findViewById(R.id.cqp);
            this.f8528b.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
            this.f8528b.mo5525a((C1272h) new LiveGestureListItemDecoration());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.LiveGestureMagicPageAdapter$b */
    public interface C2679b {
        /* renamed from: a */
        void mo9357a(Boolean bool, C9355c cVar);
    }

    public int getItemCount() {
        if (C6311g.m19573a(this.f8522d)) {
            return 0;
        }
        return this.f8522d.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo9355b() {
        this.f8525g = false;
        if (this.f8524f) {
            this.f8524f = false;
            this.f8521c.clear();
            for (int i = 0; i < this.f8523e.size(); i++) {
                LiveGestureMagicAdapter liveGestureMagicAdapter = (LiveGestureMagicAdapter) this.f8523e.get(i);
                if (liveGestureMagicAdapter != null) {
                    liveGestureMagicAdapter.mo9351b();
                }
            }
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9352a() {
        this.f8525g = true;
        if (!this.f8524f) {
            this.f8524f = true;
            for (int i = 0; i < this.f8522d.size(); i++) {
                if (this.f8523e.get(i) == null) {
                    EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) this.f8522d.get(i);
                    LiveGestureMagicAdapter liveGestureMagicAdapter = new LiveGestureMagicAdapter(this.f8520b);
                    this.f8523e.put(i, liveGestureMagicAdapter);
                    liveGestureMagicAdapter.mo9350a(effectCategoryResponse);
                    liveGestureMagicAdapter.f8504a = new C2714h(this, effectCategoryResponse, i);
                }
                ((LiveGestureMagicAdapter) this.f8523e.get(i)).mo9348a();
            }
            notifyDataSetChanged();
        }
    }

    public LiveGestureMagicPageAdapter(C2653a aVar) {
        this.f8520b = aVar;
    }

    /* renamed from: a */
    public final void mo9354a(List<EffectCategoryResponse> list) {
        if (!C6311g.m19573a(list)) {
            this.f8522d = list;
            if (this.f8525g) {
                mo9352a();
                this.f8525g = false;
            }
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C2678a aVar, int i) {
        onBindViewHolder(aVar, i, new ArrayList());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C2678a onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.f8526h = viewGroup.getContext();
        return new C2678a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.asg, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(C2678a aVar, int i, List<Object> list) {
        EffectCategoryResponse effectCategoryResponse = (EffectCategoryResponse) this.f8522d.get(i);
        ImageModel imageModel = new ImageModel();
        ArrayList arrayList = new ArrayList();
        if (this.f8521c.containsKey(effectCategoryResponse.f113500id)) {
            if (!C6319n.m19593a(effectCategoryResponse.icon_selected_url)) {
                arrayList.add(effectCategoryResponse.icon_selected_url);
            }
        } else if (!C6319n.m19593a(effectCategoryResponse.icon_normal_url)) {
            arrayList.add(effectCategoryResponse.icon_normal_url);
        }
        if (C6311g.m19573a(arrayList)) {
            aVar.f8527a.setImageResource(R.drawable.c5d);
        } else {
            imageModel.setUrls(arrayList);
            C5343e.m17030a(aVar.f8527a, imageModel);
        }
        if (this.f8523e.get(i) == null) {
            LiveGestureMagicAdapter liveGestureMagicAdapter = new LiveGestureMagicAdapter(this.f8520b);
            this.f8523e.put(i, liveGestureMagicAdapter);
            liveGestureMagicAdapter.mo9350a(effectCategoryResponse);
            liveGestureMagicAdapter.f8504a = new C2691g(this, effectCategoryResponse, i);
            aVar.f8528b.setAdapter(liveGestureMagicAdapter);
        }
        if (aVar.f8528b.getAdapter() == null) {
            aVar.f8528b.setAdapter((LiveGestureMagicAdapter) this.f8523e.get(i));
            return;
        }
        ((LiveGestureMagicAdapter) aVar.f8528b.getAdapter()).mo9350a(effectCategoryResponse);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9353a(EffectCategoryResponse effectCategoryResponse, int i, Boolean bool, C9355c cVar) {
        m10894a(cVar, bool.booleanValue(), effectCategoryResponse, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo9356b(EffectCategoryResponse effectCategoryResponse, int i, Boolean bool, C9355c cVar) {
        m10894a(cVar, bool.booleanValue(), effectCategoryResponse, i);
    }

    /* renamed from: a */
    private void m10894a(C9355c cVar, boolean z, EffectCategoryResponse effectCategoryResponse, int i) {
        if (cVar != null) {
            if (z) {
                this.f8521c.put(effectCategoryResponse.f113500id, cVar);
            } else {
                this.f8521c.remove(effectCategoryResponse.f113500id);
            }
            if (this.f8519a != null) {
                this.f8519a.mo9357a(Boolean.valueOf(z), cVar);
            }
            notifyItemChanged(i, Integer.valueOf(0));
        }
    }
}
