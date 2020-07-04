package com.bytedance.android.live.broadcast.effect.beauty.smallitem;

import android.graphics.Color;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2347g;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.effect.C2636q.C2638b;
import com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallSubItemBeautyAdapter.C2611a;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class LiveSmallItemBeautyAdapter extends C1262a<LiveSmallItemViewHolder> {

    /* renamed from: a */
    public List<? extends C9355c> f8329a;

    /* renamed from: b */
    public int f8330b;

    /* renamed from: c */
    public C2593a f8331c;

    /* renamed from: d */
    public SparseArray<Boolean> f8332d;

    /* renamed from: e */
    public SparseArray<Integer> f8333e;

    /* renamed from: f */
    private final String f8334f;

    /* renamed from: g */
    private final C2594b f8335g;

    /* renamed from: h */
    private final int f8336h;

    /* renamed from: i */
    private final int f8337i;

    public final class LiveSmallItemViewHolder extends C1293v {

        /* renamed from: a */
        public LiveSmallSubItemBeautyAdapter f8338a;

        /* renamed from: b */
        final /* synthetic */ LiveSmallItemBeautyAdapter f8339b;

        public LiveSmallItemViewHolder(LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter, View view) {
            C7573i.m23587b(view, "view");
            this.f8339b = liveSmallItemBeautyAdapter;
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyAdapter$a */
    public interface C2593a {
        /* renamed from: a */
        void mo9219a(C9355c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyAdapter$b */
    public static final class C2594b implements C2638b {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyAdapter f8340a;

        C2594b(LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter) {
            this.f8340a = liveSmallItemBeautyAdapter;
        }

        /* renamed from: a */
        public final void mo9220a(C9355c cVar) {
            C7573i.m23587b(cVar, "sticker");
            this.f8340a.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyAdapter$c */
    public static final class C2595c implements C2611a {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyAdapter f8341a;

        /* renamed from: b */
        final /* synthetic */ int f8342b;

        /* renamed from: a */
        public final void mo9221a(C9355c cVar) {
            C7573i.m23587b(cVar, "sticker");
            C2593a aVar = this.f8341a.f8331c;
            if (aVar != null) {
                aVar.mo9219a(cVar);
            }
            this.f8341a.f8333e.put(this.f8342b, Integer.valueOf(((C9355c) this.f8341a.f8329a.get(this.f8342b)).f25571j.indexOf(cVar)));
        }

        C2595c(LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter, int i) {
            this.f8341a = liveSmallItemBeautyAdapter;
            this.f8342b = i;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyAdapter$d */
    static final class C2596d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyAdapter f8343a;

        /* renamed from: b */
        final /* synthetic */ int f8344b;

        /* renamed from: c */
        final /* synthetic */ LiveSmallItemViewHolder f8345c;

        C2596d(LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter, int i, LiveSmallItemViewHolder liveSmallItemViewHolder) {
            this.f8343a = liveSmallItemBeautyAdapter;
            this.f8344b = i;
            this.f8345c = liveSmallItemViewHolder;
        }

        public final void onClick(View view) {
            this.f8343a.f8332d.put(this.f8344b, Boolean.valueOf(false));
            View view2 = this.f8345c.itemView;
            C7573i.m23582a((Object) view2, "viewHolder.itemView");
            View findViewById = view2.findViewById(R.id.aha);
            C7573i.m23582a((Object) findViewById, "viewHolder.itemView.expanded_layout");
            findViewById.setVisibility(8);
            View view3 = this.f8345c.itemView;
            C7573i.m23582a((Object) view3, "viewHolder.itemView");
            View findViewById2 = view3.findViewById(R.id.ani);
            C7573i.m23582a((Object) findViewById2, "viewHolder.itemView.fold_layout");
            findViewById2.setVisibility(0);
            C2593a aVar = this.f8343a.f8331c;
            if (aVar != null) {
                aVar.mo9219a((C9355c) this.f8343a.f8329a.get(this.f8344b));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallItemBeautyAdapter$e */
    static final class C2597e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveSmallItemBeautyAdapter f8346a;

        /* renamed from: b */
        final /* synthetic */ LiveSmallItemViewHolder f8347b;

        /* renamed from: c */
        final /* synthetic */ boolean f8348c;

        C2597e(LiveSmallItemBeautyAdapter liveSmallItemBeautyAdapter, LiveSmallItemViewHolder liveSmallItemViewHolder, boolean z) {
            this.f8346a = liveSmallItemBeautyAdapter;
            this.f8347b = liveSmallItemViewHolder;
            this.f8348c = z;
        }

        public final void onClick(View view) {
            int adapterPosition = this.f8347b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f8346a.f8329a.size()) {
                C2588b b = C2515f.m10417f().mo9075b();
                C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
                if (b.mo9212a().mo8906a((C9355c) this.f8346a.f8329a.get(adapterPosition)) || this.f8348c) {
                    this.f8346a.f8330b = adapterPosition;
                    if (this.f8348c) {
                        this.f8346a.f8332d.put(adapterPosition, Boolean.valueOf(true));
                        C2593a aVar = this.f8346a.f8331c;
                        if (aVar != null) {
                            Object obj = ((C9355c) this.f8346a.f8329a.get(adapterPosition)).f25571j.get(0);
                            C7573i.m23582a(obj, "stickerList[index].subStickers[0]");
                            aVar.mo9219a((C9355c) obj);
                        }
                    } else {
                        C2593a aVar2 = this.f8346a.f8331c;
                        if (aVar2 != null) {
                            aVar2.mo9219a((C9355c) this.f8346a.f8329a.get(this.f8346a.f8330b));
                        }
                    }
                    this.f8346a.notifyDataSetChanged();
                }
            }
        }
    }

    public LiveSmallItemBeautyAdapter() {
        this(0, 0, 3, null);
    }

    public final int getItemCount() {
        return this.f8329a.size();
    }

    /* renamed from: a */
    public final void mo9217a(C2593a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f8331c = aVar;
    }

    /* renamed from: a */
    public final void mo9218a(List<? extends C9355c> list) {
        C7573i.m23587b(list, "list");
        this.f8329a = list;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LiveSmallItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "view");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f8336h, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(view…temLayoutId, view, false)");
        return new LiveSmallItemViewHolder(this, inflate);
    }

    public LiveSmallItemBeautyAdapter(int i, int i2) {
        this.f8336h = i;
        this.f8337i = i2;
        this.f8334f = "LiveSmallItemBeautyAdapter";
        this.f8329a = new ArrayList();
        this.f8332d = new SparseArray<>();
        this.f8333e = new SparseArray<>();
        this.f8335g = new C2594b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(LiveSmallItemViewHolder liveSmallItemViewHolder, int i) {
        C7573i.m23587b(liveSmallItemViewHolder, "viewHolder");
        if (this.f8330b == i) {
            View view = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view, "viewHolder.itemView");
            View findViewById = view.findViewById(R.id.ani);
            C7573i.m23582a((Object) findViewById, "viewHolder.itemView.fold_layout");
            View findViewById2 = findViewById.findViewById(R.id.nh);
            C7573i.m23582a((Object) findViewById2, "viewHolder.itemView.fold_layout.border");
            findViewById2.setVisibility(0);
            View view2 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view2, "viewHolder.itemView");
            View findViewById3 = view2.findViewById(R.id.ani);
            C7573i.m23582a((Object) findViewById3, "viewHolder.itemView.fold_layout");
            ((TextView) findViewById3.findViewById(R.id.dyg)).setTextColor(Color.parseColor("#ffc95c"));
        } else {
            View view3 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view3, "viewHolder.itemView");
            View findViewById4 = view3.findViewById(R.id.aha);
            C7573i.m23582a((Object) findViewById4, "viewHolder.itemView.expanded_layout");
            findViewById4.setVisibility(8);
            View view4 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view4, "viewHolder.itemView");
            View findViewById5 = view4.findViewById(R.id.ani);
            C7573i.m23582a((Object) findViewById5, "viewHolder.itemView.fold_layout");
            findViewById5.setVisibility(0);
            this.f8332d.put(i, Boolean.valueOf(false));
            View view5 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view5, "viewHolder.itemView");
            View findViewById6 = view5.findViewById(R.id.ani);
            C7573i.m23582a((Object) findViewById6, "viewHolder.itemView.fold_layout");
            View findViewById7 = findViewById6.findViewById(R.id.nh);
            C7573i.m23582a((Object) findViewById7, "viewHolder.itemView.fold_layout.border");
            findViewById7.setVisibility(4);
            View view6 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view6, "viewHolder.itemView");
            View findViewById8 = view6.findViewById(R.id.ani);
            C7573i.m23582a((Object) findViewById8, "viewHolder.itemView.fold_layout");
            ((TextView) findViewById8.findViewById(R.id.dyg)).setTextColor(Color.parseColor("#ffffffff"));
        }
        View view7 = liveSmallItemViewHolder.itemView;
        C7573i.m23582a((Object) view7, "viewHolder.itemView");
        View findViewById9 = view7.findViewById(R.id.ani);
        C7573i.m23582a((Object) findViewById9, "viewHolder.itemView.fold_layout");
        HSImageView hSImageView = (HSImageView) findViewById9.findViewById(R.id.b6k);
        C2347g gVar = ((C9355c) this.f8329a.get(i)).f25562a;
        C7573i.m23582a((Object) gVar, "stickerList[index].icon");
        String str = gVar.f7710a;
        C2347g gVar2 = ((C9355c) this.f8329a.get(i)).f25562a;
        C7573i.m23582a((Object) gVar2, "stickerList[index].icon");
        C5343e.m17043b(hSImageView, C2663f.m10850a(str, gVar2.f7711b));
        View view8 = liveSmallItemViewHolder.itemView;
        C7573i.m23582a((Object) view8, "viewHolder.itemView");
        View findViewById10 = view8.findViewById(R.id.ani);
        C7573i.m23582a((Object) findViewById10, "viewHolder.itemView.fold_layout");
        TextView textView = (TextView) findViewById10.findViewById(R.id.dyg);
        C7573i.m23582a((Object) textView, "viewHolder.itemView.fold_layout.tv_name");
        textView.setText(((C9355c) this.f8329a.get(i)).f25567f);
        Effect effect = ((C9355c) this.f8329a.get(i)).f25573l;
        boolean z = true;
        if (effect == null || effect.getEffectType() != 1 || C6307b.m19566a((Collection<T>) ((C9355c) this.f8329a.get(i)).f25571j)) {
            z = false;
        }
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        if (b.mo9212a().mo8906a((C9355c) this.f8329a.get(i)) || z) {
            View view9 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view9, "viewHolder.itemView");
            ImageView imageView = (ImageView) view9.findViewById(R.id.b_w);
            C7573i.m23582a((Object) imageView, "viewHolder.itemView.iv_loading");
            imageView.setVisibility(8);
        } else {
            View view10 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view10, "viewHolder.itemView");
            ImageView imageView2 = (ImageView) view10.findViewById(R.id.b_w);
            C7573i.m23582a((Object) imageView2, "viewHolder.itemView.iv_loading");
            imageView2.setVisibility(0);
            C2588b b2 = C2515f.m10417f().mo9075b();
            C7573i.m23582a((Object) b2, "LiveInternalService.inst().liveEffectService()");
            b2.mo9214b().mo9315a((C9355c) this.f8329a.get(i), true, null);
        }
        if (z) {
            Object obj = this.f8332d.get(i, Boolean.valueOf(false));
            C7573i.m23582a(obj, "itemStates.get(index, false)");
            if (((Boolean) obj).booleanValue()) {
                View view11 = liveSmallItemViewHolder.itemView;
                C7573i.m23582a((Object) view11, "viewHolder.itemView");
                View findViewById11 = view11.findViewById(R.id.aha);
                C7573i.m23582a((Object) findViewById11, "viewHolder.itemView.expanded_layout");
                findViewById11.setVisibility(0);
                View view12 = liveSmallItemViewHolder.itemView;
                C7573i.m23582a((Object) view12, "viewHolder.itemView");
                View findViewById12 = view12.findViewById(R.id.ani);
                C7573i.m23582a((Object) findViewById12, "viewHolder.itemView.fold_layout");
                findViewById12.setVisibility(8);
                liveSmallItemViewHolder.f8338a = new LiveSmallSubItemBeautyAdapter(this.f8337i);
                View view13 = liveSmallItemViewHolder.itemView;
                C7573i.m23582a((Object) view13, "viewHolder.itemView");
                RecyclerView recyclerView = (RecyclerView) view13.findViewById(R.id.dd1);
                C7573i.m23582a((Object) recyclerView, "viewHolder.itemView.sub_beauty_list");
                View view14 = liveSmallItemViewHolder.itemView;
                C7573i.m23582a((Object) view14, "viewHolder.itemView");
                recyclerView.setLayoutManager(new LinearLayoutManager(view14.getContext(), 0, false));
                View view15 = liveSmallItemViewHolder.itemView;
                C7573i.m23582a((Object) view15, "viewHolder.itemView");
                RecyclerView recyclerView2 = (RecyclerView) view15.findViewById(R.id.dd1);
                C7573i.m23582a((Object) recyclerView2, "viewHolder.itemView.sub_beauty_list");
                recyclerView2.setAdapter(liveSmallItemViewHolder.f8338a);
                Integer num = (Integer) this.f8333e.get(i, Integer.valueOf(-1));
                Integer a = C2515f.m10417f().mo9074a().mo8883a(((C9355c) this.f8329a.get(i)).f25573l);
                if (a != null && C7573i.m23576a(a.intValue(), 0) > 0) {
                    num = a;
                }
                if (C7573i.m23576a(num.intValue(), 0) >= 0) {
                    LiveSmallSubItemBeautyAdapter liveSmallSubItemBeautyAdapter = liveSmallItemViewHolder.f8338a;
                    if (liveSmallSubItemBeautyAdapter != null) {
                        C7573i.m23582a((Object) num, "subIndex");
                        liveSmallSubItemBeautyAdapter.f8380b = num.intValue();
                    }
                }
                LiveSmallSubItemBeautyAdapter liveSmallSubItemBeautyAdapter2 = liveSmallItemViewHolder.f8338a;
                if (liveSmallSubItemBeautyAdapter2 != null) {
                    List<C9355c> list = ((C9355c) this.f8329a.get(i)).f25571j;
                    C7573i.m23582a((Object) list, "stickerList[index].subStickers");
                    liveSmallSubItemBeautyAdapter2.mo9241a(list);
                }
                LiveSmallSubItemBeautyAdapter liveSmallSubItemBeautyAdapter3 = liveSmallItemViewHolder.f8338a;
                if (liveSmallSubItemBeautyAdapter3 != null) {
                    liveSmallSubItemBeautyAdapter3.mo9240a((C2611a) new C2595c(this, i));
                }
                View view16 = liveSmallItemViewHolder.itemView;
                C7573i.m23582a((Object) view16, "viewHolder.itemView");
                View findViewById13 = view16.findViewById(R.id.aha);
                C7573i.m23582a((Object) findViewById13, "viewHolder.itemView.expanded_layout");
                TextView textView2 = (TextView) findViewById13.findViewById(R.id.dd2);
                C7573i.m23582a((Object) textView2, "viewHolder.itemView.expa…d_layout.sub_beauty_title");
                textView2.setText(((C9355c) this.f8329a.get(i)).f25567f);
                View view17 = liveSmallItemViewHolder.itemView;
                C7573i.m23582a((Object) view17, "viewHolder.itemView");
                View findViewById14 = view17.findViewById(R.id.aha);
                C7573i.m23582a((Object) findViewById14, "viewHolder.itemView.expanded_layout");
                ((ImageView) findViewById14.findViewById(R.id.dd0)).setOnClickListener(new C2596d(this, i, liveSmallItemViewHolder));
                if (C7573i.m23576a(num.intValue(), 0) > 0) {
                    C2593a aVar = this.f8331c;
                    if (aVar != null) {
                        List<C9355c> list2 = ((C9355c) this.f8329a.get(i)).f25571j;
                        C7573i.m23582a((Object) num, "subIndex");
                        Object obj2 = list2.get(num.intValue());
                        C7573i.m23582a(obj2, "stickerList[index].subStickers[subIndex]");
                        aVar.mo9219a((C9355c) obj2);
                    }
                } else {
                    C2593a aVar2 = this.f8331c;
                    if (aVar2 != null) {
                        Object obj3 = ((C9355c) this.f8329a.get(i)).f25571j.get(0);
                        C7573i.m23582a(obj3, "stickerList[index].subStickers[0]");
                        aVar2.mo9219a((C9355c) obj3);
                    }
                }
                liveSmallItemViewHolder.itemView.setOnClickListener(new C2597e(this, liveSmallItemViewHolder, z));
            }
        }
        View view18 = liveSmallItemViewHolder.itemView;
        C7573i.m23582a((Object) view18, "viewHolder.itemView");
        View findViewById15 = view18.findViewById(R.id.aha);
        C7573i.m23582a((Object) findViewById15, "viewHolder.itemView.expanded_layout");
        findViewById15.setVisibility(8);
        View view19 = liveSmallItemViewHolder.itemView;
        C7573i.m23582a((Object) view19, "viewHolder.itemView");
        View findViewById16 = view19.findViewById(R.id.ani);
        C7573i.m23582a((Object) findViewById16, "viewHolder.itemView.fold_layout");
        findViewById16.setVisibility(0);
        liveSmallItemViewHolder.itemView.setOnClickListener(new C2597e(this, liveSmallItemViewHolder, z));
    }

    private /* synthetic */ LiveSmallItemBeautyAdapter(int i, int i2, int i3, C7571f fVar) {
        this(R.layout.arq, R.layout.arh);
    }
}
