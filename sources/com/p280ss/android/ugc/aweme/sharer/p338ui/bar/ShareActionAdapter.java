package com.p280ss.android.ugc.aweme.sharer.p338ui.bar;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38346b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionAdapter */
public final class ShareActionAdapter extends C1262a<ChannelHolder> {

    /* renamed from: c */
    public static final C38373a f99598c = new C38373a(null);

    /* renamed from: a */
    public List<? extends C38389f> f99599a = C7525m.m23461a();

    /* renamed from: b */
    public final C38378b f99600b;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionAdapter$ChannelHolder */
    public static final class ChannelHolder extends C1293v {

        /* renamed from: a */
        public final ImageView f99601a;

        /* renamed from: b */
        public final DmtTextView f99602b;

        /* renamed from: c */
        public final View f99603c;

        public ChannelHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.d4m);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.share_action_icon)");
            this.f99601a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.d4o);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.share_action_label)");
            this.f99602b = (DmtTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.d4n);
            C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.….share_action_icon_badge)");
            this.f99603c = findViewById3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionAdapter$a */
    public static final class C38373a {
        private C38373a() {
        }

        public /* synthetic */ C38373a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareActionAdapter$b */
    static final class C38374b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareActionAdapter f99604a;

        /* renamed from: b */
        final /* synthetic */ int f99605b;

        C38374b(ShareActionAdapter shareActionAdapter, int i) {
            this.f99604a = shareActionAdapter;
            this.f99605b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C38346b.m122507a(view, 1200)) {
                this.f99604a.f99600b.mo95944a((C38389f) this.f99604a.f99599a.get(this.f99605b));
            }
        }
    }

    public final int getItemCount() {
        return this.f99599a.size();
    }

    /* renamed from: a */
    public final void mo95949a(List<? extends C38389f> list) {
        C7573i.m23587b(list, "actions");
        this.f99599a = list;
        notifyDataSetChanged();
    }

    public ShareActionAdapter(C38378b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f99600b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onViewDetachedFromWindow(ChannelHolder channelHolder) {
        C7573i.m23587b(channelHolder, "holder");
        Animation animation = channelHolder.f99601a.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        super.onViewDetachedFromWindow(channelHolder);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onViewAttachedToWindow(ChannelHolder channelHolder) {
        C7573i.m23587b(channelHolder, "holder");
        super.onViewAttachedToWindow(channelHolder);
        int adapterPosition = channelHolder.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < getItemCount()) {
            ((C38389f) this.f99599a.get(adapterPosition)).mo95713a(channelHolder.f99601a);
        }
    }

    public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m122570a(viewGroup, i);
    }

    /* renamed from: a */
    private static ChannelHolder m122570a(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aa7, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        return new ChannelHolder(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ChannelHolder channelHolder, int i) {
        int i2;
        float f;
        C7573i.m23587b(channelHolder, "holder");
        Context context = channelHolder.f99601a.getContext();
        ImageView imageView = channelHolder.f99601a;
        C7573i.m23582a((Object) context, "context");
        imageView.setImageDrawable(context.getResources().getDrawable(((C38389f) this.f99599a.get(i)).mo95710a()));
        ((C38389f) this.f99599a.get(i)).mo95714a((TextView) channelHolder.f99602b);
        View view = channelHolder.f99603c;
        if (((C38389f) this.f99599a.get(i)).mo95717d()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        ImageView imageView2 = channelHolder.f99601a;
        float f2 = 0.34f;
        if (((C38389f) this.f99599a.get(i)).mo95718e()) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        imageView2.setAlpha(f);
        DmtTextView dmtTextView = channelHolder.f99602b;
        if (((C38389f) this.f99599a.get(i)).mo95718e()) {
            f2 = 1.0f;
        }
        dmtTextView.setAlpha(f2);
        channelHolder.itemView.setOnClickListener(new C38374b(this, i));
    }
}
