package com.p280ss.android.ugc.aweme.discover.p1189v4.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverPlayListStructV4;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p1878b.C47891a;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4TrendingViewHolder */
public final class DiscoverV4TrendingViewHolder extends DiscoverV4PlayListViewHolder {

    /* renamed from: o */
    public static final C27207a f71700o = new C27207a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.v4.viewholder.DiscoverV4TrendingViewHolder$a */
    public static final class C27207a {
        private C27207a() {
        }

        public /* synthetic */ C27207a(C7571f fVar) {
            this();
        }
    }

    public final void bA_() {
        super.bA_();
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dno);
        if (viewStub != null) {
            viewStub.inflate();
        }
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        DmtTextView dmtTextView = (DmtTextView) view2.findViewById(R.id.e3f);
        C7573i.m23582a((Object) dmtTextView, "itemView.tv_title");
        dmtTextView.setMaxLines(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29209a(DiscoverPlayListStructV4 discoverPlayListStructV4) {
        CharSequence charSequence;
        C7573i.m23587b(discoverPlayListStructV4, "item");
        super.mo29209a(discoverPlayListStructV4);
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        ((DmtTextView) view.findViewById(R.id.e3f)).setTextSize(1, 17.0f);
        List<Aweme> list = discoverPlayListStructV4.awemes;
        if (list != null) {
            Aweme aweme = (Aweme) C7525m.m23513g(list);
            if (aweme != null) {
                int i = 0;
                if (aweme.getCreateTime() > 0) {
                    View view2 = this.itemView;
                    C7573i.m23582a((Object) view2, "itemView");
                    String d = C43110ev.m136735d(view2.getContext(), aweme.getCreateTime() * 1000);
                    if (!TextUtils.isEmpty(d)) {
                        View view3 = this.itemView;
                        C7573i.m23582a((Object) view3, "itemView");
                        DmtTextView dmtTextView = (DmtTextView) view3.findViewById(R.id.dzt);
                        if (dmtTextView != null) {
                            StringBuilder sb = new StringBuilder("· ");
                            sb.append(d);
                            dmtTextView.setText(sb.toString());
                        }
                        View view4 = this.itemView;
                        C7573i.m23582a((Object) view4, "itemView");
                        C23487o.m77140a((View) (DmtTextView) view4.findViewById(R.id.dzt), 0);
                    } else {
                        View view5 = this.itemView;
                        C7573i.m23582a((Object) view5, "itemView");
                        C23487o.m77140a((View) (DmtTextView) view5.findViewById(R.id.dzt), 8);
                    }
                } else {
                    View view6 = this.itemView;
                    C7573i.m23582a((Object) view6, "itemView");
                    C23487o.m77140a((View) (DmtTextView) view6.findViewById(R.id.dzt), 8);
                }
                View view7 = this.itemView;
                C7573i.m23582a((Object) view7, "itemView");
                LinearLayout linearLayout = (LinearLayout) view7.findViewById(R.id.br3);
                View view8 = this.itemView;
                C7573i.m23582a((Object) view8, "itemView");
                LinearLayout linearLayout2 = (LinearLayout) view8.findViewById(R.id.br3);
                C7573i.m23582a((Object) linearLayout2, "itemView.ll_desc");
                int paddingLeft = linearLayout2.getPaddingLeft();
                View view9 = this.itemView;
                C7573i.m23582a((Object) view9, "itemView");
                LinearLayout linearLayout3 = (LinearLayout) view9.findViewById(R.id.br3);
                C7573i.m23582a((Object) linearLayout3, "itemView.ll_desc");
                int paddingTop = linearLayout3.getPaddingTop();
                View view10 = this.itemView;
                C7573i.m23582a((Object) view10, "itemView");
                LinearLayout linearLayout4 = (LinearLayout) view10.findViewById(R.id.br3);
                C7573i.m23582a((Object) linearLayout4, "itemView.ll_desc");
                int paddingRight = linearLayout4.getPaddingRight();
                View view11 = this.itemView;
                C7573i.m23582a((Object) view11, "itemView");
                linearLayout.setPadding(paddingLeft, paddingTop, paddingRight, C47891a.m148821a(C9738o.m28708b(view11.getContext(), 12.0f)));
                View view12 = this.itemView;
                C7573i.m23582a((Object) view12, "itemView");
                DmtTextView dmtTextView2 = (DmtTextView) view12.findViewById(R.id.dqn);
                String str = null;
                if (dmtTextView2 != null) {
                    User author = aweme.getAuthor();
                    if (author != null) {
                        charSequence = author.getNickname();
                    } else {
                        charSequence = null;
                    }
                    dmtTextView2.setText(charSequence);
                }
                View view13 = this.itemView;
                C7573i.m23582a((Object) view13, "itemView");
                ImageView imageView = (ImageView) view13.findViewById(R.id.b0_);
                if (imageView != null) {
                    if (!C43122ff.m136782m(aweme.getAuthor())) {
                        User author2 = aweme.getAuthor();
                        if (author2 != null) {
                            str = author2.getEnterpriseVerifyReason();
                        }
                        if (TextUtils.isEmpty(str)) {
                            i = 8;
                        }
                    }
                    imageView.setVisibility(i);
                }
            }
        }
    }

    public DiscoverV4TrendingViewHolder(ViewGroup viewGroup, int i, String str, String str2) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(str, "tabName");
        C7573i.m23587b(str2, "tabText");
        super(viewGroup, i, str, str2);
    }
}
