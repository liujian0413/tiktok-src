package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.SearchStickerAdapter */
public final class SearchStickerAdapter extends StickerAdapter<StickerWrapper> {

    /* renamed from: a */
    public int f105575a = -1;

    /* renamed from: b */
    private HashMap<String, Integer> f105576b;

    /* renamed from: d */
    private List<? extends StickerWrapper> f105577d = new ArrayList();

    /* renamed from: e */
    private final HashSet<String> f105578e = new HashSet<>();

    /* renamed from: f */
    private final FragmentActivity f105579f;

    /* renamed from: g */
    private final ShortVideoContext f105580g;

    /* renamed from: h */
    private final EffectStickerManager f105581h;

    /* renamed from: a */
    public final int mo100732a(Effect effect) {
        if (effect == null) {
            return -1;
        }
        HashMap<String, Integer> hashMap = this.f105576b;
        if (hashMap != null) {
            Integer num = (Integer) hashMap.get(effect.getEffectId());
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo100644b(int i) {
        Effect effect;
        StickerWrapper stickerWrapper = (StickerWrapper) mo100733c(i);
        if (stickerWrapper != null) {
            effect = stickerWrapper.f104908a;
        } else {
            effect = null;
        }
        if (C40496bh.m129455d(effect)) {
            return 1003;
        }
        return 1001;
    }

    /* renamed from: a */
    public final void mo58045a(List<? extends StickerWrapper> list) {
        C7573i.m23587b(list, "data");
        this.f105577d = list;
        this.f105576b = C40376ag.m129119a(this.f105577d);
        this.f105575a = -1;
        super.mo58045a(this.f105577d);
        m129888e(list);
    }

    /* renamed from: e */
    private final void m129888e(List<? extends StickerWrapper> list) {
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            StickerWrapper stickerWrapper = (StickerWrapper) next;
            HashSet<String> hashSet = this.f105578e;
            Effect effect = stickerWrapper.f104908a;
            C7573i.m23582a((Object) effect, "stickerWrapper.effect");
            if (!hashSet.contains(effect.getEffectId())) {
                HashSet<String> hashSet2 = this.f105578e;
                Effect effect2 = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect2, "stickerWrapper.effect");
                hashSet2.add(effect2.getEffectId());
                Effect effect3 = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect3, "stickerWrapper.effect");
                Effect effect4 = stickerWrapper.f104908a;
                C7573i.m23582a((Object) effect4, "stickerWrapper.effect");
                C42962b.f111525a.mo104671a("prop_show", C22984d.m75611a().mo59973a("enter_from", "video_shoot_page").mo59970a("draft_id", this.f105580g.mo96148i().getDraftId()).mo59973a("creation_id", this.f105580g.mo96148i().getCreationId()).mo59973a("shoot_way", this.f105580g.mo96148i().getShootWay()).mo59973a("tab_name", "").mo59973a("prop_id", effect3.getEffectId()).mo59973a("prop_index", effect4.getGradeKey()).mo59970a("after_search", 1).mo59970a("impr_position", i2).f60753a);
            }
            i = i2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C1293v mo100645b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        if (i != 1003) {
            return new EffectStickerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v1, viewGroup, false), this.f105581h, this.f105577d);
        }
        return new EffectGameViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.v1, viewGroup, false), this.f105581h, this.f105577d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo100646b(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "holder");
        if (getItemViewType(i) != 1003) {
            ((EffectStickerViewHolder) vVar).mo100241a((StickerWrapper) mo100733c(i), this.f105577d, i, false);
        } else {
            ((EffectGameViewHolder) vVar).mo100185a((StickerWrapper) mo100733c(i), this.f105577d, i, false);
        }
    }

    public SearchStickerAdapter(FragmentActivity fragmentActivity, ShortVideoContext shortVideoContext, EffectStickerManager effectStickerManager) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        C7573i.m23587b(effectStickerManager, "effectStickerManager");
        this.f105579f = fragmentActivity;
        this.f105580g = shortVideoContext;
        this.f105581h = effectStickerManager;
        C0063u a = C0069x.m159a(this.f105579f).mo147a(CurParentStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…kerViewModel::class.java)");
        ((CurParentStickerViewModel) a).mo101270a().observe(this.f105579f, new C0053p<C0902i<Effect, Effect>>(this) {

            /* renamed from: a */
            final /* synthetic */ SearchStickerAdapter f105582a;

            {
                this.f105582a = r1;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onChanged(C0902i<Effect, Effect> iVar) {
                if (iVar != null) {
                    Effect effect = (Effect) iVar.f3154a;
                    Effect effect2 = (Effect) iVar.f3155b;
                    int a = this.f105582a.mo100732a(effect);
                    int a2 = this.f105582a.mo100732a(effect2);
                    if (a >= 0) {
                        this.f105582a.notifyItemChanged(a + 1, effect);
                    }
                    if (a2 >= 0) {
                        this.f105582a.f105575a = a2;
                        this.f105582a.notifyItemChanged(a2 + 1, effect2);
                        return;
                    }
                    this.f105582a.f105575a = -1;
                }
            }
        });
    }
}
