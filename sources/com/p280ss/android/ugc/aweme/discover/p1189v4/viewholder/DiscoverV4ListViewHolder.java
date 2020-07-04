package com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.rtl.AutoRTLImageView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.discover.activity.DiscoverDetailActivity;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.ttm.player.MediaPlayer;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4ListViewHolder */
public final class DiscoverV4ListViewHolder extends JediSimpleViewHolder<DiscoverCategoryStructV4> implements OnClickListener {

    /* renamed from: f */
    public static final C27195a f71667f = new C27195a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4ListViewHolder$a */
    public static final class C27195a {
        private C27195a() {
        }

        public /* synthetic */ C27195a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: i */
    public final void mo29223i() {
        super.mo29223i();
    }

    /* renamed from: g */
    public final void mo29221g() {
        super.mo29221g();
        this.itemView.setOnClickListener(this);
    }

    /* renamed from: h */
    public final void mo29222h() {
        super.mo29222h();
        C26781b.m87965a(((DiscoverCategoryStructV4) mo29309o()).tabName, this.f31526i - 1, ((DiscoverCategoryStructV4) mo29309o()).logPb);
    }

    public DiscoverV4ListViewHolder(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.uk, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…r_v4_list, parent, false)");
        super(inflate);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C26781b.m87981b(((DiscoverCategoryStructV4) mo29309o()).tabName, this.f31526i - 1, ((DiscoverCategoryStructV4) mo29309o()).logPb);
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        DiscoverDetailActivity.m86687a(view2.getContext(), 0, "", "", this.f31526i - 1, ((DiscoverCategoryStructV4) mo29309o()).tabName, ((DiscoverCategoryStructV4) mo29309o()).tabText);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(DiscoverCategoryStructV4 discoverCategoryStructV4) {
        C7573i.m23587b(discoverCategoryStructV4, "item");
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        Context context = view2.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        view.setBackground(context.getResources().getDrawable(R.drawable.i3));
        View view3 = this.itemView;
        C7573i.m23582a((Object) view3, "itemView");
        ((AutoRTLImageView) view3.findViewById(R.id.bbl)).setImageResource(R.drawable.a68);
        if (this.f31526i == 1) {
            View view4 = this.itemView;
            C7573i.m23582a((Object) view4, "itemView");
            View findViewById = view4.findViewById(R.id.dm1);
            C7573i.m23582a((Object) findViewById, "itemView.top_decoration");
            findViewById.setVisibility(0);
            View view5 = this.itemView;
            C7573i.m23582a((Object) view5, "itemView");
            View findViewById2 = view5.findViewById(R.id.a6m);
            C7573i.m23582a((Object) findViewById2, "itemView.decoration");
            findViewById2.setVisibility(8);
        } else if (this.f31526i > 1) {
            View view6 = this.itemView;
            C7573i.m23582a((Object) view6, "itemView");
            View findViewById3 = view6.findViewById(R.id.dm1);
            C7573i.m23582a((Object) findViewById3, "itemView.top_decoration");
            findViewById3.setVisibility(8);
            View view7 = this.itemView;
            C7573i.m23582a((Object) view7, "itemView");
            View findViewById4 = view7.findViewById(R.id.a6m);
            C7573i.m23582a((Object) findViewById4, "itemView.decoration");
            findViewById4.setVisibility(0);
        }
        View view8 = this.itemView;
        C7573i.m23582a((Object) view8, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view8.findViewById(R.id.e3f);
        C7573i.m23582a((Object) dmtTextView, "itemView.tv_title");
        dmtTextView.setText(discoverCategoryStructV4.tabText);
        C12139r a = C12133n.m35299a(C23400r.m76741a(discoverCategoryStructV4.coverUrl)).mo29853b(C43012cg.m136513a(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL)).mo29845a("DiscoverV4");
        View view9 = this.itemView;
        C7573i.m23582a((Object) view9, "itemView");
        a.mo29844a((C12128i) (SmartImageView) view9.findViewById(R.id.b6x)).mo29848a();
        View view10 = this.itemView;
        C7573i.m23582a((Object) view10, "itemView");
        if (C43127fh.m136806a(view10.getContext())) {
            View view11 = this.itemView;
            C7573i.m23582a((Object) view11, "itemView");
            AutoRTLImageView autoRTLImageView = (AutoRTLImageView) view11.findViewById(R.id.bbl);
            C7573i.m23582a((Object) autoRTLImageView, "itemView.iv_right");
            autoRTLImageView.setRotation(180.0f);
        }
    }
}
