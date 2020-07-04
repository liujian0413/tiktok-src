package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.google.common.collect.C17794bt;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.filter.C29263bs;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40376ag;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.model.EmptyStickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40953a;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter */
public final class NewPanelStickerAdapter extends BaseAdapter<StickerWrapper> {

    /* renamed from: d */
    public static final C40835a f106194d = new C40835a(null);

    /* renamed from: a */
    public boolean f106195a = true;

    /* renamed from: b */
    public C40953a f106196b;

    /* renamed from: c */
    public int f106197c;

    /* renamed from: e */
    private List<? extends StickerWrapper> f106198e;

    /* renamed from: f */
    private HashMap<String, Integer> f106199f;

    /* renamed from: g */
    private C17794bt<String, String> f106200g;

    /* renamed from: h */
    private AVDmtPanelRecyleView f106201h;

    /* renamed from: i */
    private final C40837c f106202i;

    /* renamed from: j */
    private final EffectStickerManager f106203j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter$NewStickerEmptyViewHolder */
    public static final class NewStickerEmptyViewHolder extends C1293v {

        /* renamed from: a */
        private final AVDmtTextView f106204a;

        /* renamed from: a */
        public final void mo101105a(String str) {
            C7573i.m23587b(str, "description");
            this.f106204a.setText(str);
        }

        public NewStickerEmptyViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.dt5);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_desc)");
            this.f106204a = (AVDmtTextView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter$NewStickerLoadingViewHolder */
    public static final class NewStickerLoadingViewHolder extends C1293v {

        /* renamed from: a */
        private final DmtStatusView f106205a;

        /* renamed from: a */
        public final void mo101106a() {
            this.f106205a.mo25939d();
            this.f106205a.mo25942f();
        }

        public NewStickerLoadingViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.c41);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.new_sticker_loading)");
            this.f106205a = (DmtStatusView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter$a */
    public static final class C40835a {
        private C40835a() {
        }

        public /* synthetic */ C40835a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter$b */
    public interface C40836b {
        /* renamed from: a */
        void mo101107a(int i, boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter$c */
    public static final class C40837c implements C40836b {

        /* renamed from: a */
        final /* synthetic */ NewPanelStickerAdapter f106206a;

        C40837c(NewPanelStickerAdapter newPanelStickerAdapter) {
            this.f106206a = newPanelStickerAdapter;
        }

        /* renamed from: a */
        public final void mo101107a(int i, boolean z) {
            if (!z) {
                this.f106206a.f106197c = i;
            } else if (i == this.f106206a.f106197c) {
                this.f106206a.mo101104b(i);
            }
        }
    }

    /* renamed from: a */
    public final List<StickerWrapper> mo62312a() {
        return this.f106198e;
    }

    /* renamed from: a */
    private final void m130496a(AVDmtPanelRecyleView aVDmtPanelRecyleView) {
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.mo5528a((C1281m) new NewPanelStickerAdapter$mStickerRecyclerList$1(this));
        }
        this.f106201h = aVDmtPanelRecyleView;
    }

    /* renamed from: b */
    public final void mo101104b(int i) {
        C40881d.m130624a();
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106201h;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.mo5561d(i);
        }
    }

    /* renamed from: a */
    public final List<String> mo101103a(Effect effect) {
        String str;
        C17794bt<String, String> btVar = this.f106200g;
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        List<String> list = btVar.get(str);
        C7573i.m23582a((Object) list, "mStickerIdCategoryMap.get(effect?.effectId)");
        return list;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (!(recyclerView instanceof AVDmtPanelRecyleView)) {
            recyclerView = null;
        }
        m130496a((AVDmtPanelRecyleView) recyclerView);
    }

    public NewPanelStickerAdapter(EffectStickerManager effectStickerManager) {
        C7573i.m23587b(effectStickerManager, "mEffectStickerManager");
        this.f106203j = effectStickerManager;
        C29263bs c = C29263bs.m95998c();
        C7573i.m23582a((Object) c, "SpecializedMultimap.create()");
        this.f106200g = c;
        this.f106197c = Integer.MIN_VALUE;
        this.f106202i = new C40837c(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58029a(int r3) {
        /*
            r2 = this;
            java.util.List r0 = r2.mo62312a()
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d.m130627a(r0, r3)
            if (r0 == 0) goto L_0x000d
            r3 = 1007(0x3ef, float:1.411E-42)
            return r3
        L_0x000d:
            java.util.List r0 = r2.mo62312a()
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40881d.m130629b(r0, r3)
            if (r0 == 0) goto L_0x001a
            r3 = 1006(0x3ee, float:1.41E-42)
            return r3
        L_0x001a:
            java.util.List r0 = r2.mo62312a()
            r1 = 0
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.get(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r0
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper.m129072a(r0)
            if (r0 == 0) goto L_0x0032
            r3 = 1005(0x3ed, float:1.408E-42)
            return r3
        L_0x0032:
            java.util.List r0 = r2.mo62312a()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r0.get(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r0 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r0
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.f104908a
            goto L_0x0044
        L_0x0043:
            r0 = r1
        L_0x0044:
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh.m129455d(r0)
            if (r0 == 0) goto L_0x004d
            r3 = 1003(0x3eb, float:1.406E-42)
            return r3
        L_0x004d:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x006c
            java.util.List r0 = r2.mo62312a()
            if (r0 == 0) goto L_0x0063
            java.lang.Object r3 = r0.get(r3)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r3 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r3
            if (r3 == 0) goto L_0x0063
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r3.f104908a
        L_0x0063:
            boolean r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh.m129466k(r1)
            if (r3 == 0) goto L_0x006c
            r3 = 1004(0x3ec, float:1.407E-42)
            return r3
        L_0x006c:
            r3 = 1001(0x3e9, float:1.403E-42)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter.mo58029a(int):int");
    }

    /* renamed from: a */
    public final void mo58045a(List<? extends StickerWrapper> list) {
        if (list != null) {
            this.f106198e = list;
            this.f106199f = C40376ag.m129122b(list);
            C40376ag.m129120a(this.f106200g, list);
            super.mo58045a(list);
        }
    }

    /* renamed from: a */
    public final int mo101102a(String str, Effect effect) {
        Integer num;
        if (effect == null || str == null) {
            return -1;
        }
        HashMap<String, Integer> hashMap = this.f106199f;
        if (hashMap != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(effect.getEffectId());
            num = (Integer) hashMap.get(sb.toString());
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        Context context = null;
        switch (i) {
            case 1003:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                return new EffectGameViewHolder(LayoutInflater.from(context).inflate(R.layout.zv, viewGroup, false), this.f106203j, this.f106198e);
            case LiveRoomStruct.ROOM_LONGTIME_NO_NET /*1004*/:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate = LayoutInflater.from(context).inflate(R.layout.g4, viewGroup, false);
                C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…new_panel, parent, false)");
                EffectStickerManager effectStickerManager = this.f106203j;
                List<? extends StickerWrapper> list = this.f106198e;
                if (list == null) {
                    list = C7525m.m23461a();
                }
                EffectLockStickerViewHolder effectLockStickerViewHolder = new EffectLockStickerViewHolder(inflate, effectStickerManager, list);
                effectLockStickerViewHolder.f104764e = this.f106196b;
                return effectLockStickerViewHolder;
            case 1005:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.zz, viewGroup, false);
                C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…r_divider, parent, false)");
                return new NewStickerDividerViewHolder(inflate2);
            case 1006:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate3 = LayoutInflater.from(context).inflate(R.layout.gh, viewGroup, false);
                C7573i.m23582a((Object) inflate3, "LayoutInflater.from(pare…r_loading, parent, false)");
                return new NewStickerLoadingViewHolder(inflate3);
            case 1007:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate4 = LayoutInflater.from(context).inflate(R.layout.gg, viewGroup, false);
                C7573i.m23582a((Object) inflate4, "LayoutInflater.from(pare…ist_empty, parent, false)");
                return new NewStickerEmptyViewHolder(inflate4);
            default:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                EffectStickerViewHolder effectStickerViewHolder = new EffectStickerViewHolder(LayoutInflater.from(context).inflate(R.layout.zv, viewGroup, false), this.f106203j, this.f106198e);
                effectStickerViewHolder.f104815j = this.f106202i;
                return effectStickerViewHolder;
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        boolean z = this.f106195a;
        StickerWrapper stickerWrapper = null;
        switch (getItemViewType(i)) {
            case 1003:
                if (vVar != null) {
                    EffectGameViewHolder effectGameViewHolder = (EffectGameViewHolder) vVar;
                    List<? extends StickerWrapper> list = this.f106198e;
                    if (list != null) {
                        stickerWrapper = (StickerWrapper) list.get(i);
                    }
                    effectGameViewHolder.mo100185a(stickerWrapper, this.f106198e, i, z);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.EffectGameViewHolder");
            case LiveRoomStruct.ROOM_LONGTIME_NO_NET /*1004*/:
                if (vVar != null) {
                    EffectLockStickerViewHolder effectLockStickerViewHolder = (EffectLockStickerViewHolder) vVar;
                    List<? extends StickerWrapper> list2 = this.f106198e;
                    if (list2 != null) {
                        stickerWrapper = (StickerWrapper) list2.get(i);
                    }
                    List<? extends StickerWrapper> list3 = this.f106198e;
                    if (list3 == null) {
                        list3 = C7525m.m23461a();
                    }
                    effectLockStickerViewHolder.mo100191a(stickerWrapper, list3, i, z);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.EffectLockStickerViewHolder");
            case 1005:
                if (vVar == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewStickerDividerViewHolder");
                }
                return;
            case 1006:
                if (vVar != null) {
                    ((NewStickerLoadingViewHolder) vVar).mo101106a();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter.NewStickerLoadingViewHolder");
            case 1007:
                List<? extends StickerWrapper> list4 = this.f106198e;
                if (list4 != null) {
                    stickerWrapper = (StickerWrapper) list4.get(i);
                }
                if (stickerWrapper != null) {
                    String str = ((EmptyStickerWrapper) stickerWrapper).f106339g;
                    if (vVar != null) {
                        ((NewStickerEmptyViewHolder) vVar).mo101105a(str);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter.NewStickerEmptyViewHolder");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.model.EmptyStickerWrapper");
            default:
                if (vVar != null) {
                    EffectStickerViewHolder effectStickerViewHolder = (EffectStickerViewHolder) vVar;
                    effectStickerViewHolder.f104815j = this.f106202i;
                    List<? extends StickerWrapper> list5 = this.f106198e;
                    if (list5 != null) {
                        stickerWrapper = (StickerWrapper) list5.get(i);
                    }
                    effectStickerViewHolder.mo100241a(stickerWrapper, this.f106198e, i, z);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerViewHolder");
        }
    }

    public final void onBindViewHolder(C1293v vVar, int i, List<Object> list) {
        C7573i.m23587b(vVar, "holder");
        C7573i.m23587b(list, "payloads");
        if (!C6307b.m19566a((Collection<T>) list)) {
            Object obj = list.get(0);
            if (obj != null) {
                StickerWrapper stickerWrapper = (StickerWrapper) obj;
                if (getItemViewType(i) == 1001) {
                    EffectStickerViewHolder effectStickerViewHolder = (EffectStickerViewHolder) vVar;
                    effectStickerViewHolder.f104815j = this.f106202i;
                    if (this.f106203j.mo100230c(stickerWrapper.f104908a)) {
                        effectStickerViewHolder.mo100201a(true);
                        this.f106203j.mo100232d(stickerWrapper.f104908a);
                        return;
                    }
                    effectStickerViewHolder.mo100201a(false);
                } else if (getItemViewType(i) == 1003) {
                    EffectGameViewHolder effectGameViewHolder = (EffectGameViewHolder) vVar;
                    if (this.f106203j.mo100230c(stickerWrapper.f104908a)) {
                        effectGameViewHolder.mo100201a(true);
                        this.f106203j.mo100232d(stickerWrapper.f104908a);
                        return;
                    }
                    effectGameViewHolder.mo100201a(false);
                } else {
                    if (getItemViewType(i) == 1004) {
                        EffectLockStickerViewHolder effectLockStickerViewHolder = (EffectLockStickerViewHolder) vVar;
                        if (this.f106203j.mo100230c(stickerWrapper.f104908a)) {
                            effectLockStickerViewHolder.f104763d.animate().alpha(1.0f).setDuration(150).start();
                            this.f106203j.mo100232d(stickerWrapper.f104908a);
                        } else {
                            effectLockStickerViewHolder.f104763d.animate().alpha(0.0f).setDuration(150).start();
                        }
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper");
            }
        } else {
            super.onBindViewHolder(vVar, i, list);
        }
    }
}
