package com.p280ss.android.ugc.aweme.sharer.p338ui.bar;

import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38346b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelAdapter */
public final class ShareChannelAdapter extends C1262a<ChannelHolder> {

    /* renamed from: a */
    public List<? extends C38343b> f99613a;

    /* renamed from: b */
    public final C38379c f99614b;

    /* renamed from: c */
    private final boolean f99615c;

    /* renamed from: d */
    private final boolean f99616d;

    /* renamed from: e */
    private final int f99617e;

    /* renamed from: f */
    private final boolean f99618f;

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelAdapter$ChannelHolder */
    public static final class ChannelHolder extends C1293v {

        /* renamed from: a */
        public final RemoteImageView f99619a;

        /* renamed from: b */
        public final DmtTextView f99620b;

        public ChannelHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
            View findViewById = view.findViewById(R.id.d4w);
            C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.share_channel_icon)");
            this.f99619a = (RemoteImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.d4x);
            C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.share_channel_label)");
            this.f99620b = (DmtTextView) findViewById2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelAdapter$a */
    static final class C38376a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ShareChannelAdapter f99621a;

        /* renamed from: b */
        final /* synthetic */ int f99622b;

        C38376a(ShareChannelAdapter shareChannelAdapter, int i) {
            this.f99621a = shareChannelAdapter;
            this.f99622b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C38346b.m122507a(view, 1200)) {
                this.f99621a.f99614b.mo63024a((C38343b) this.f99621a.f99613a.get(this.f99622b));
            }
        }
    }

    public final int getItemCount() {
        return this.f99613a.size();
    }

    /* renamed from: a */
    public final void mo95956a(List<? extends C38343b> list) {
        C7573i.m23587b(list, "channels");
        this.f99613a = list;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ChannelHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        C7573i.m23587b(viewGroup, "parent");
        if (this.f99618f) {
            i2 = R.layout.aab;
        } else if (!this.f99615c) {
            i2 = R.layout.aa_;
        } else {
            i2 = R.layout.aaa;
        }
        boolean z = false;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        C7573i.m23582a((Object) inflate, "itemView");
        ChannelHolder channelHolder = new ChannelHolder(inflate);
        if (this.f99616d) {
            channelHolder.f99620b.setVisibility(8);
        }
        DmtTextView dmtTextView = channelHolder.f99620b;
        Integer valueOf = Integer.valueOf(this.f99617e);
        if (valueOf.intValue() != 0) {
            z = true;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i3 = valueOf.intValue();
        } else {
            i3 = viewGroup.getResources().getColor(R.color.a82);
        }
        dmtTextView.setTextColor(i3);
        return channelHolder;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onBindViewHolder(ChannelHolder channelHolder, int i) {
        C7573i.m23587b(channelHolder, "holder");
        ((C38343b) this.f99613a.get(i)).mo95741a(channelHolder.f99619a, this.f99615c);
        channelHolder.f99620b.setText(((C38343b) this.f99613a.get(i)).mo95740c());
        channelHolder.itemView.setOnClickListener(new C38376a(this, i));
        if (((C38343b) this.f99613a.get(i)).mo95748g()) {
            View view = channelHolder.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            view.setAlpha(((C38343b) this.f99613a.get(i)).mo95747f());
            return;
        }
        View view2 = channelHolder.itemView;
        C7573i.m23582a((Object) view2, "holder.itemView");
        view2.setAlpha(1.0f);
    }

    public ShareChannelAdapter(C38379c cVar, boolean z, boolean z2, int i, boolean z3) {
        C7573i.m23587b(cVar, "listener");
        this.f99614b = cVar;
        this.f99615c = z;
        this.f99616d = z2;
        this.f99617e = i;
        this.f99618f = z3;
        this.f99613a = C7525m.m23461a();
    }

    public /* synthetic */ ShareChannelAdapter(C38379c cVar, boolean z, boolean z2, int i, boolean z3, int i2, C7571f fVar) {
        this(cVar, true, z2, 0, false);
    }
}
