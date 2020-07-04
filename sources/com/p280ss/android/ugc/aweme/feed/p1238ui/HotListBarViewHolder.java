package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.profile.model.HotListStruct;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.HotListBarViewHolder */
public final class HotListBarViewHolder extends C1293v {

    /* renamed from: a */
    public final Context f75748a;

    /* renamed from: b */
    public final String f75749b;

    /* renamed from: c */
    public final boolean f75750c;

    /* renamed from: d */
    private DmtTextView f75751d;

    /* renamed from: e */
    private DmtTextView f75752e;

    /* renamed from: f */
    private RemoteImageView f75753f;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.HotListBarViewHolder$a */
    static final class C28744a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HotListBarViewHolder f75754a;

        /* renamed from: b */
        final /* synthetic */ HotListStruct f75755b;

        /* renamed from: c */
        final /* synthetic */ Aweme f75756c;

        C28744a(HotListBarViewHolder hotListBarViewHolder, HotListStruct hotListStruct, Aweme aweme) {
            this.f75754a = hotListBarViewHolder;
            this.f75755b = hotListStruct;
            this.f75756c = aweme;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f75755b.getType() == 2) {
                this.f75754a.mo73889a(this.f75756c, this.f75755b, false);
            } else {
                C6907h.m21524a("enter_hot_search_board", (Map) C22984d.m75611a().mo59973a("enter_from", this.f75754a.f75749b).mo59973a("enter_method", "hot_search_board_guide").f60753a);
            }
            String schema = this.f75755b.getSchema();
            if (this.f75755b.getType() == 2) {
                StringBuilder sb = new StringBuilder("sslocal://hot/spot?keyword=");
                sb.append(this.f75755b.getTitile());
                sb.append("&from=");
                sb.append(this.f75754a.f75749b);
                sb.append("&isTrending=1&previous_page=");
                sb.append(this.f75754a.f75749b);
                sb.append("&enter_method=hot_search_video_guide");
                schema = sb.toString();
            }
            C22912d.f60645e.mo59887a(this.f75754a.f75748a, schema, (String) null);
        }
    }

    public HotListBarViewHolder(View view, String str) {
        this(view, str, false, 4, null);
    }

    /* renamed from: a */
    public final void mo73888a(Aweme aweme) {
        String str;
        C7573i.m23587b(aweme, "mAweme");
        HotListStruct hotListStruct = aweme.getHotListStruct();
        if (hotListStruct == null) {
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            view.setVisibility(8);
            return;
        }
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        view2.setVisibility(0);
        this.f75753f.setVisibility(0);
        DmtTextView dmtTextView = this.f75752e;
        if (dmtTextView != null) {
            dmtTextView.setVisibility(8);
        }
        RemoteImageView remoteImageView = this.f75753f;
        HotListStruct hotListStruct2 = aweme.getHotListStruct();
        if (hotListStruct2 != null) {
            str = hotListStruct2.getImageUrl();
        } else {
            str = null;
        }
        C23323e.m76514a(remoteImageView, str);
        if (hotListStruct.getType() == 2) {
            DmtTextView dmtTextView2 = this.f75751d;
            StringBuilder sb = new StringBuilder("实时上升热点：");
            sb.append(hotListStruct.getTitile());
            dmtTextView2.setText(sb.toString());
        } else {
            this.f75751d.setText(hotListStruct.getTitile());
        }
        this.itemView.setOnClickListener(new C28744a(this, hotListStruct, aweme));
        if (hotListStruct.getType() == 2) {
            mo73889a(aweme, hotListStruct, true);
            return;
        }
        C6907h.m21524a("hot_search_board_guide", (Map) C22984d.m75611a().mo59973a("enter_from", this.f75749b).mo59973a("action_type", "show").mo59973a("group_id", aweme.getAid()).mo59973a("author_id", C43122ff.m136788s(aweme.getAuthor())).f60753a);
    }

    private HotListBarViewHolder(View view, String str, boolean z) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(str, "mEventType");
        super(view);
        this.f75749b = str;
        this.f75750c = z;
        View findViewById = view.findViewById(R.id.dsf);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_content)");
        this.f75751d = (DmtTextView) findViewById;
        this.f75752e = (DmtTextView) view.findViewById(R.id.dvw);
        View findViewById2 = view.findViewById(R.id.ax9);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.icon)");
        this.f75753f = (RemoteImageView) findViewById2;
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f75748a = context;
    }

    /* renamed from: a */
    public final void mo73889a(Aweme aweme, HotListStruct hotListStruct, boolean z) {
        String str;
        String str2;
        C7573i.m23587b(aweme, "mAweme");
        C7573i.m23587b(hotListStruct, "hotSearchList");
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f75749b).mo59973a("group_id", aweme.getAid());
        String str3 = "action_type";
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        C22984d a2 = a.mo59973a(str3, str).mo59973a("search_keyword", hotListStruct.getTitile()).mo59973a("author_id", C43122ff.m136788s(aweme.getAuthor()));
        String str4 = "is_rising_topic";
        if (hotListStruct.getType() == 2) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C6907h.m21524a("hot_search_video_guide", (Map) a2.mo59973a(str4, str2).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme))).f60753a);
    }

    public /* synthetic */ HotListBarViewHolder(View view, String str, boolean z, int i, C7571f fVar) {
        this(view, str, false);
    }
}
