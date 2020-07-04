package com.bytedance.android.live.broadcast.effect.sticker.p138ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.broadcast.effect.sticker.p137a.C2653a;
import com.bytedance.android.live.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.android.livesdk.chatroom.p220ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.q */
class C2726q extends AbsPagerAdapter {

    /* renamed from: e */
    private static final String f8660e = "q";

    /* renamed from: a */
    public C2728b f8661a;

    /* renamed from: f */
    private final C2653a f8662f;

    /* renamed from: g */
    private List<EffectCategoryResponse> f8663g;

    /* renamed from: h */
    private SparseArray<LiveStickerComposerListAdapter> f8664h = new SparseArray<>();

    /* renamed from: i */
    private C9355c f8665i;

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.q$a */
    static class C2727a {

        /* renamed from: a */
        RecyclerView f8666a;

        /* renamed from: b */
        LiveStickerComposerListAdapter f8667b;

        C2727a() {
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.q$b */
    public interface C2728b {
        /* renamed from: a */
        void mo9421a(C9355c cVar, C9355c cVar2);
    }

    public int getCount() {
        if (C6311g.m19573a(this.f8663g)) {
            return 0;
        }
        return this.f8663g.size();
    }

    /* renamed from: a */
    public final void mo9425a(List<EffectCategoryResponse> list) {
        if (!C6311g.m19573a(list)) {
            this.f8663g = list;
            notifyDataSetChanged();
        }
    }

    public CharSequence getPageTitle(int i) {
        return ((EffectCategoryResponse) this.f8663g.get(i)).name;
    }

    /* renamed from: a */
    public final void mo9424a(int i, C9355c cVar) {
        mo9426b(0, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo9426b(int i, C9355c cVar) {
        C8946b.f24421at.mo22118a(Integer.valueOf(i));
        if (this.f8661a != null) {
            this.f8661a.mo9421a(this.f8665i, cVar);
        }
        this.f8665i = cVar;
        for (int i2 = 0; i2 < this.f8663g.size(); i2++) {
            LiveStickerComposerListAdapter liveStickerComposerListAdapter = (LiveStickerComposerListAdapter) this.f8664h.get(i2);
            if (liveStickerComposerListAdapter != null) {
                liveStickerComposerListAdapter.mo9359a(this.f8665i);
            }
        }
    }

    C2726q(Context context, C9355c cVar, C2653a aVar) {
        super(context, LayoutInflater.from(context));
        this.f8662f = aVar;
        this.f8665i = cVar;
    }

    /* renamed from: a */
    public final View mo9423a(int i, View view, ViewGroup viewGroup) {
        View view2;
        C2727a aVar;
        if (view == null) {
            aVar = new C2727a();
            view2 = this.f10761c.inflate(R.layout.avd, viewGroup, false);
            aVar.f8666a = (RecyclerView) view2;
            aVar.f8666a.setLayoutManager(new SSGridLayoutManager(this.f10762d, 5, 1, false));
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C2727a) view.getTag();
        }
        if (this.f8664h.indexOfKey(i) < 0) {
            LiveStickerComposerListAdapter liveStickerComposerListAdapter = new LiveStickerComposerListAdapter(this.f8662f);
            liveStickerComposerListAdapter.mo9359a(this.f8665i);
            liveStickerComposerListAdapter.f8530a = new C2729r(this, i);
            this.f8664h.put(i, liveStickerComposerListAdapter);
        }
        aVar.f8667b = (LiveStickerComposerListAdapter) this.f8664h.get(i);
        aVar.f8666a.setAdapter(aVar.f8667b);
        aVar.f8667b.mo9361a(((EffectCategoryResponse) this.f8663g.get(i)).totalEffects);
        return view2;
    }
}
