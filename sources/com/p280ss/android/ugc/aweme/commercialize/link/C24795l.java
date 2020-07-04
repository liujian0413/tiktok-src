package com.p280ss.android.ugc.aweme.commercialize.link;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f.C24961b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.C25372a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1137c.p1138a.C25332a.C25333a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.l */
public final class C24795l implements C24794k {

    /* renamed from: a */
    public final TextView f65291a;

    /* renamed from: b */
    public final RecyclerView f65292b;

    /* renamed from: c */
    public ChallengeViewAdapter f65293c;

    /* renamed from: d */
    public SearchAdData f65294d;

    /* renamed from: e */
    public final View f65295e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.l$a */
    static final class C24796a implements C25372a {

        /* renamed from: a */
        final /* synthetic */ C24795l f65296a;

        C24796a(C24795l lVar) {
            this.f65296a = lVar;
        }

        /* renamed from: a */
        public final void mo61517a(boolean z) {
            String str;
            Long l;
            C24961b a = C24958f.m81905a().mo65266a("result_ad");
            if (z) {
                str = "deeplink_success";
            } else {
                str = "deeplink_failed";
            }
            C24961b b = a.mo65276b(str);
            SearchAdData searchAdData = this.f65296a.f65294d;
            String str2 = null;
            if (searchAdData != null) {
                l = Long.valueOf(searchAdData.f65873id);
            } else {
                l = null;
            }
            C24961b a2 = b.mo65264a(l);
            SearchAdData searchAdData2 = this.f65296a.f65294d;
            if (searchAdData2 != null) {
                str2 = searchAdData2.logExtra;
            }
            a2.mo65286h(str2).mo65270a(this.f65296a.f65295e.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.l$b */
    static final class C24797b implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ C24795l f65297a;

        C24797b(C24795l lVar) {
            this.f65297a = lVar;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65257a(this.f65297a.f65294d).mo65270a(this.f65297a.f65295e.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.l$c */
    static final class C24798c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24795l f65298a;

        C24798c(C24795l lVar) {
            this.f65298a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65298a.mo64826a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.l$d */
    static final class C24799d implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ C24795l f65299a;

        /* renamed from: b */
        final /* synthetic */ SearchAdData f65300b;

        C24799d(C24795l lVar, SearchAdData searchAdData) {
            this.f65299a = lVar;
            this.f65300b = searchAdData;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65257a(this.f65300b).mo65270a(this.f65299a.f65295e.getContext());
        }
    }

    /* renamed from: a */
    public final void mo64826a() {
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        long j;
        String str5;
        Long l;
        String str6;
        String str7;
        Long l2;
        String str8;
        Context context = this.f65295e.getContext();
        SearchAdData searchAdData = this.f65294d;
        UrlModel urlModel = null;
        if (searchAdData != null) {
            str = searchAdData.openUrl;
        } else {
            str = null;
        }
        if (C25371n.m83463a(context, str, false)) {
            SearchAdData searchAdData2 = this.f65294d;
            if (searchAdData2 != null) {
                str7 = searchAdData2.openUrl;
            } else {
                str7 = null;
            }
            if (!C25371n.m83466a(str7)) {
                C24961b b = C24958f.m81905a().mo65266a("result_ad").mo65276b("open_url_app");
                SearchAdData searchAdData3 = this.f65294d;
                if (searchAdData3 != null) {
                    l2 = Long.valueOf(searchAdData3.f65873id);
                } else {
                    l2 = null;
                }
                C24961b a = b.mo65264a(l2);
                SearchAdData searchAdData4 = this.f65294d;
                if (searchAdData4 != null) {
                    str8 = searchAdData4.logExtra;
                } else {
                    str8 = null;
                }
                a.mo65286h(str8).mo65270a(this.f65295e.getContext());
                C25371n.m83440a((C25372a) new C24796a(this));
            }
        } else {
            Context context2 = this.f65295e.getContext();
            SearchAdData searchAdData5 = this.f65294d;
            if (searchAdData5 != null) {
                str3 = searchAdData5.webUrl;
            } else {
                str3 = null;
            }
            SearchAdData searchAdData6 = this.f65294d;
            if (searchAdData6 != null) {
                str4 = searchAdData6.webTitle;
            } else {
                str4 = null;
            }
            SearchAdData searchAdData7 = this.f65294d;
            if (searchAdData7 != null) {
                j = searchAdData7.f65873id;
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            SearchAdData searchAdData8 = this.f65294d;
            if (searchAdData8 != null) {
                str5 = searchAdData8.logExtra;
            } else {
                str5 = null;
            }
            C25333a aVar = new C25333a(valueOf, str5, null, null, 0, 28, null);
            C25371n.m83462a(context2, str3, str4, false, null, true, aVar);
            C24961b b2 = C24958f.m81905a().mo65266a("result_ad").mo65276b("open_url_h5");
            SearchAdData searchAdData9 = this.f65294d;
            if (searchAdData9 != null) {
                l = Long.valueOf(searchAdData9.f65873id);
            } else {
                l = null;
            }
            C24961b a2 = b2.mo65264a(l);
            SearchAdData searchAdData10 = this.f65294d;
            if (searchAdData10 != null) {
                str6 = searchAdData10.logExtra;
            } else {
                str6 = null;
            }
            a2.mo65286h(str6).mo65270a(this.f65295e.getContext());
        }
        Context context3 = this.f65295e.getContext();
        SearchAdData searchAdData11 = this.f65294d;
        if (searchAdData11 != null) {
            obj = Long.valueOf(searchAdData11.f65873id);
        } else {
            obj = null;
        }
        String valueOf2 = String.valueOf(obj);
        String str9 = "link";
        SearchAdData searchAdData12 = this.f65294d;
        if (searchAdData12 != null) {
            str2 = searchAdData12.logExtra;
        } else {
            str2 = null;
        }
        C24976t.m82162b(context3, valueOf2, str9, str2);
        C24939aj bVar = new C24797b(this);
        SearchAdData searchAdData13 = this.f65294d;
        if (searchAdData13 != null) {
            urlModel = searchAdData13.clickTrackUrlList;
        }
        C24962g.m81952a(bVar, urlModel, true);
    }

    /* renamed from: a */
    public final void mo64824a(int i) {
        Object obj;
        Context context = this.f65295e.getContext();
        SearchAdData searchAdData = this.f65294d;
        String str = null;
        if (searchAdData != null) {
            obj = Long.valueOf(searchAdData.f65873id);
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("topic");
        sb.append(i + 1);
        String sb2 = sb.toString();
        SearchAdData searchAdData2 = this.f65294d;
        if (searchAdData2 != null) {
            str = searchAdData2.logExtra;
        }
        C24976t.m82189c(context, valueOf, sb2, str);
    }

    /* renamed from: b */
    public final void mo64825b(int i) {
        Object obj;
        Context context = this.f65295e.getContext();
        SearchAdData searchAdData = this.f65294d;
        String str = null;
        if (searchAdData != null) {
            obj = Long.valueOf(searchAdData.f65873id);
        } else {
            obj = null;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder("topic");
        sb.append(i + 1);
        String sb2 = sb.toString();
        SearchAdData searchAdData2 = this.f65294d;
        if (searchAdData2 != null) {
            str = searchAdData2.logExtra;
        }
        C24976t.m82200d(context, valueOf, sb2, str);
    }

    public C24795l(View view) {
        C7573i.m23587b(view, "contentView");
        this.f65295e = view;
        DmtTextView dmtTextView = (DmtTextView) this.f65295e.findViewById(R.id.ax);
        C7573i.m23582a((Object) dmtTextView, "contentView.adLink");
        this.f65291a = dmtTextView;
        RecyclerView recyclerView = (RecyclerView) this.f65295e.findViewById(R.id.u7);
        C7573i.m23582a((Object) recyclerView, "contentView.challengeView");
        this.f65292b = recyclerView;
        this.f65292b.setLayoutManager(new LinearLayoutManager(this.f65295e.getContext(), 0, false));
    }

    /* renamed from: a */
    public final void mo64827a(SearchAdData searchAdData) {
        C7573i.m23587b(searchAdData, "adData");
        this.f65294d = searchAdData;
        if (TextUtils.isEmpty(searchAdData.title)) {
            this.f65291a.setVisibility(8);
        } else {
            this.f65291a.setText(searchAdData.title);
            this.f65291a.setOnClickListener(new C24798c(this));
            this.f65291a.setVisibility(0);
            C24976t.m82068a(this.f65295e.getContext(), String.valueOf(searchAdData.f65873id), "link", searchAdData.logExtra);
            C24962g.m81952a((C24939aj) new C24799d(this, searchAdData), searchAdData.trackUrlList, true);
        }
        if (C6307b.m19566a((Collection<T>) searchAdData.challengeList)) {
            this.f65292b.setVisibility(8);
            return;
        }
        if (this.f65293c == null) {
            List<Challenge> list = searchAdData.challengeList;
            C7573i.m23582a((Object) list, "adData.challengeList");
            this.f65293c = new ChallengeViewAdapter(list, this);
            this.f65292b.setAdapter(this.f65293c);
        } else {
            ChallengeViewAdapter challengeViewAdapter = this.f65293c;
            if (challengeViewAdapter != null) {
                List<Challenge> list2 = searchAdData.challengeList;
                C7573i.m23582a((Object) list2, "adData.challengeList");
                challengeViewAdapter.mo64769a(list2);
            }
        }
        this.f65292b.setVisibility(0);
    }
}
