package com.bytedance.android.live.broadcast.effect.beauty.smallitem;

import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.C2347g;
import com.bytedance.android.live.broadcast.api.C2418b;
import com.bytedance.android.live.broadcast.effect.C2588b;
import com.bytedance.android.live.broadcast.effect.C2636q;
import com.bytedance.android.live.broadcast.effect.C2636q.C2638b;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class LiveSmallSubItemBeautyAdapter extends C1262a<LiveSmallItemViewHolder> {

    /* renamed from: a */
    public List<? extends C9355c> f8379a;

    /* renamed from: b */
    public int f8380b;

    /* renamed from: c */
    public C2611a f8381c;

    /* renamed from: d */
    private final String f8382d;

    /* renamed from: e */
    private final C2612b f8383e;

    /* renamed from: f */
    private final int f8384f;

    public final class LiveSmallItemViewHolder extends C1293v {

        /* renamed from: a */
        final /* synthetic */ LiveSmallSubItemBeautyAdapter f8385a;

        public LiveSmallItemViewHolder(LiveSmallSubItemBeautyAdapter liveSmallSubItemBeautyAdapter, View view) {
            C7573i.m23587b(view, "view");
            this.f8385a = liveSmallSubItemBeautyAdapter;
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallSubItemBeautyAdapter$a */
    public interface C2611a {
        /* renamed from: a */
        void mo9221a(C9355c cVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallSubItemBeautyAdapter$b */
    public static final class C2612b implements C2638b {

        /* renamed from: a */
        final /* synthetic */ LiveSmallSubItemBeautyAdapter f8386a;

        C2612b(LiveSmallSubItemBeautyAdapter liveSmallSubItemBeautyAdapter) {
            this.f8386a = liveSmallSubItemBeautyAdapter;
        }

        /* renamed from: a */
        public final void mo9220a(C9355c cVar) {
            C7573i.m23587b(cVar, "sticker");
            this.f8386a.notifyDataSetChanged();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.effect.beauty.smallitem.LiveSmallSubItemBeautyAdapter$c */
    static final class C2613c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveSmallSubItemBeautyAdapter f8387a;

        /* renamed from: b */
        final /* synthetic */ LiveSmallItemViewHolder f8388b;

        C2613c(LiveSmallSubItemBeautyAdapter liveSmallSubItemBeautyAdapter, LiveSmallItemViewHolder liveSmallItemViewHolder) {
            this.f8387a = liveSmallSubItemBeautyAdapter;
            this.f8388b = liveSmallItemViewHolder;
        }

        public final void onClick(View view) {
            int adapterPosition = this.f8388b.getAdapterPosition();
            if (adapterPosition >= 0 && adapterPosition < this.f8387a.f8379a.size()) {
                C2588b b = C2515f.m10417f().mo9075b();
                C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
                if (b.mo9212a().mo8906a((C9355c) this.f8387a.f8379a.get(adapterPosition))) {
                    this.f8387a.f8380b = adapterPosition;
                    C2611a aVar = this.f8387a.f8381c;
                    if (aVar != null) {
                        aVar.mo9221a((C9355c) this.f8387a.f8379a.get(this.f8387a.f8380b));
                    }
                    this.f8387a.notifyDataSetChanged();
                }
            }
        }
    }

    public LiveSmallSubItemBeautyAdapter() {
        this(0, 1, null);
    }

    public final int getItemCount() {
        return this.f8379a.size();
    }

    /* renamed from: a */
    public final void mo9240a(C2611a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f8381c = aVar;
    }

    /* renamed from: a */
    public final void mo9241a(List<? extends C9355c> list) {
        C7573i.m23587b(list, "list");
        this.f8379a = list;
        notifyDataSetChanged();
    }

    public LiveSmallSubItemBeautyAdapter(int i) {
        this.f8384f = i;
        this.f8382d = "LiveSmallSubItemBeautyAdapter";
        this.f8379a = new ArrayList();
        this.f8383e = new C2612b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LiveSmallItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "view");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f8384f, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(view…temLayoutId, view, false)");
        return new LiveSmallItemViewHolder(this, inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(LiveSmallItemViewHolder liveSmallItemViewHolder, int i) {
        C7573i.m23587b(liveSmallItemViewHolder, "viewHolder");
        boolean z = false;
        if (this.f8380b == i) {
            View view = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view, "viewHolder.itemView");
            View findViewById = view.findViewById(R.id.nh);
            C7573i.m23582a((Object) findViewById, "viewHolder.itemView.border");
            findViewById.setVisibility(0);
            View view2 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view2, "viewHolder.itemView");
            ((TextView) view2.findViewById(R.id.dyg)).setTextColor(Color.parseColor("#ffc95c"));
        } else {
            View view3 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view3, "viewHolder.itemView");
            View findViewById2 = view3.findViewById(R.id.nh);
            C7573i.m23582a((Object) findViewById2, "viewHolder.itemView.border");
            findViewById2.setVisibility(4);
            View view4 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view4, "viewHolder.itemView");
            ((TextView) view4.findViewById(R.id.dyg)).setTextColor(Color.parseColor("#ffffffff"));
        }
        View view5 = liveSmallItemViewHolder.itemView;
        C7573i.m23582a((Object) view5, "viewHolder.itemView");
        HSImageView hSImageView = (HSImageView) view5.findViewById(R.id.b6k);
        C2347g gVar = ((C9355c) this.f8379a.get(i)).f25562a;
        C7573i.m23582a((Object) gVar, "stickerList[index].icon");
        String str = gVar.f7710a;
        C2347g gVar2 = ((C9355c) this.f8379a.get(i)).f25562a;
        C7573i.m23582a((Object) gVar2, "stickerList[index].icon");
        C5343e.m17043b(hSImageView, C2663f.m10850a(str, gVar2.f7711b));
        View view6 = liveSmallItemViewHolder.itemView;
        C7573i.m23582a((Object) view6, "viewHolder.itemView");
        TextView textView = (TextView) view6.findViewById(R.id.dyg);
        C7573i.m23582a((Object) textView, "viewHolder.itemView.tv_name");
        textView.setText(((C9355c) this.f8379a.get(i)).f25567f);
        C2588b b = C2515f.m10417f().mo9075b();
        C7573i.m23582a((Object) b, "LiveInternalService.inst().liveEffectService()");
        if (b.mo9212a().mo8906a((C9355c) this.f8379a.get(i))) {
            View view7 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view7, "viewHolder.itemView");
            ImageView imageView = (ImageView) view7.findViewById(R.id.b_w);
            C7573i.m23582a((Object) imageView, "viewHolder.itemView.iv_loading");
            imageView.setVisibility(8);
            if (this.f8380b == i) {
                C2588b b2 = C2515f.m10417f().mo9075b();
                C7573i.m23582a((Object) b2, "LiveInternalService.inst().liveEffectService()");
                b2.mo9214b().mo9314a((C9355c) this.f8379a.get(this.f8380b));
            } else {
                C2515f.m10417f().mo9074a().mo8898b(C2418b.f7953d, (C9355c) this.f8379a.get(i));
            }
        } else {
            View view8 = liveSmallItemViewHolder.itemView;
            C7573i.m23582a((Object) view8, "viewHolder.itemView");
            ImageView imageView2 = (ImageView) view8.findViewById(R.id.b_w);
            C7573i.m23582a((Object) imageView2, "viewHolder.itemView.iv_loading");
            imageView2.setVisibility(0);
            C2588b b3 = C2515f.m10417f().mo9075b();
            C7573i.m23582a((Object) b3, "LiveInternalService.inst().liveEffectService()");
            C2636q b4 = b3.mo9214b();
            C9355c cVar = (C9355c) this.f8379a.get(i);
            if (this.f8380b == i) {
                z = true;
            }
            b4.mo9315a(cVar, z, this.f8383e);
        }
        liveSmallItemViewHolder.itemView.setOnClickListener(new C2613c(this, liveSmallItemViewHolder));
    }

    private /* synthetic */ LiveSmallSubItemBeautyAdapter(int i, int i2, C7571f fVar) {
        this(R.layout.arh);
    }
}
