package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.hotspot.C26688a.C26689a;
import com.p280ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity.C26686a;
import com.p280ss.android.ugc.aweme.discover.hotspot.data.HotSpotLabelAb;
import com.p280ss.android.ugc.aweme.discover.hotspot.data.HotSpotValueAb;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.HotSearchInfo;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.search.C37385g;
import com.p280ss.android.ugc.aweme.search.model.C37388a;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.UUID;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.HotSpotBarViewHolder */
public final class HotSpotBarViewHolder extends C1293v {

    /* renamed from: a */
    public final Context f75757a;

    /* renamed from: b */
    public Aweme f75758b;

    /* renamed from: c */
    public final String f75759c;

    /* renamed from: d */
    public final boolean f75760d;

    /* renamed from: e */
    private DmtTextView f75761e;

    /* renamed from: f */
    private DmtTextView f75762f;

    /* renamed from: g */
    private RemoteImageView f75763g;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.HotSpotBarViewHolder$a */
    static final class C28745a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ HotSpotBarViewHolder f75764a;

        /* renamed from: b */
        final /* synthetic */ HotSearchInfo f75765b;

        /* renamed from: c */
        final /* synthetic */ boolean f75766c;

        C28745a(HotSpotBarViewHolder hotSpotBarViewHolder, HotSearchInfo hotSearchInfo, boolean z) {
            this.f75764a = hotSpotBarViewHolder;
            this.f75765b = hotSearchInfo;
            this.f75766c = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            HotSpotBarViewHolder hotSpotBarViewHolder = this.f75764a;
            Aweme aweme = this.f75764a.f75758b;
            if (aweme == null) {
                C7573i.m23580a();
            }
            HotSearchInfo hotSearchInfo = this.f75765b;
            C7573i.m23582a((Object) hotSearchInfo, "hotSearchInfo");
            hotSpotBarViewHolder.mo73892a(aweme, hotSearchInfo, this.f75765b.getChallengeId(), this.f75766c, false);
            if (this.f75766c) {
                String uuid = UUID.randomUUID().toString();
                C7573i.m23582a((Object) uuid, "UUID.randomUUID().toString()");
                C7195s a = C7195s.m22438a();
                StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
                String challengeId = this.f75765b.getChallengeId();
                if (challengeId == null) {
                    C7573i.m23580a();
                }
                sb.append(challengeId);
                a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("enter_from", this.f75764a.f75759c).mo18694a("process_id", uuid).mo18695a());
                C6907h.m21524a("enter_tag_detail", (Map) new C22984d().mo59973a("enter_from", this.f75764a.f75759c).mo59973a("enter_method", "hot_search_video_guide").mo59973a("process_id", "mProcessId").mo59973a("tag_id", this.f75765b.getChallengeId()).f60753a);
                return;
            }
            SearchResultParam previousPage = new SearchResultParam().setKeyword(this.f75765b.getSentence()).setRealSearchWord(this.f75765b.getSearchWord()).setSearchFrom(2).setEnterFrom("hot_search_video_guide").setPreviousPage(this.f75764a.f75759c);
            Aweme aweme2 = this.f75764a.f75758b;
            if (aweme2 == null) {
                C7573i.m23580a();
            }
            SearchResultParam outAwemeId = previousPage.setOutAwemeId(aweme2.getAid());
            if (C26654b.m87575c()) {
                Context context = this.f75764a.f75757a;
                C7573i.m23582a((Object) outAwemeId, "param");
                C26686a.m87665a(context, outAwemeId);
            } else if (TextUtils.equals(this.f75764a.f75759c, "general_search")) {
                Context context2 = this.f75764a.f75757a;
                if (context2 != null) {
                    ((Activity) context2).finish();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            } else {
                C37385g gVar = C37385g.f97617a;
                Context context3 = this.f75764a.f75757a;
                C7573i.m23582a((Object) outAwemeId, "param");
                C37388a aVar = new C37388a(context3, outAwemeId, null, null, null, null, 60, null);
                gVar.launchSearchPage(aVar);
            }
        }
    }

    public HotSpotBarViewHolder(View view, String str) {
        this(view, str, false, 4, null);
    }

    /* renamed from: b */
    private final float m94641b(int i) {
        if (m94640a(i)) {
            return 4.5f;
        }
        return 8.0f;
    }

    /* renamed from: a */
    private static boolean m94640a(int i) {
        if (C6384b.m19835a().mo15287a(HotSpotLabelAb.class, true, "hot_info_label", C6384b.m19835a().mo15295d().hot_info_label, 0) != 1 || i == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo73891a(Aweme aweme) {
        if (!(!C7573i.m23585a((Object) this.f75758b, (Object) aweme)) && this.f75758b != null) {
            Aweme aweme2 = this.f75758b;
            if (aweme2 == null) {
                C7573i.m23580a();
            }
            HotSearchInfo hotSearchInfo = aweme2.getHotSearchInfo();
            boolean z = !TextUtils.isEmpty(hotSearchInfo.getChallengeId());
            Aweme aweme3 = this.f75758b;
            if (aweme3 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) hotSearchInfo, "hotSearchInfo");
            mo73892a(aweme3, hotSearchInfo, hotSearchInfo.getChallengeId(), z, true);
        }
    }

    /* renamed from: a */
    private final void m94639a(HotSearchInfo hotSearchInfo) {
        float f;
        float f2;
        LayoutParams layoutParams = this.f75763g.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int label = hotSearchInfo.getLabel();
            Context context = this.f75757a;
            if (m94640a(label)) {
                f = C26689a.m87668a(label, true, false);
            } else {
                f = 13.0f;
            }
            layoutParams2.width = (int) C9738o.m28708b(context, f);
            Context context2 = this.f75757a;
            if (m94640a(label)) {
                f2 = 16.0f;
            } else {
                f2 = 17.0f;
            }
            layoutParams2.height = (int) C9738o.m28708b(context2, f2);
            layoutParams2.topMargin = (int) C9738o.m28708b(this.f75757a, 0.5f);
            this.f75763g.setLayoutParams(layoutParams2);
            LayoutParams layoutParams3 = this.f75761e.getLayoutParams();
            if (layoutParams3 != null) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart((int) C9738o.m28708b(this.f75757a, m94641b(label)));
                layoutParams4.leftMargin = (int) C9738o.m28708b(this.f75757a, m94641b(label));
                this.f75761e.setLayoutParams(layoutParams4);
                if (m94640a(label)) {
                    C23323e.m76503a(this.f75763g, -1);
                } else {
                    C23323e.m76503a(this.f75763g, (int) R.drawable.amt);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    /* renamed from: b */
    public final void mo73893b(Aweme aweme) {
        String str;
        String str2;
        C7573i.m23587b(aweme, "aweme");
        this.f75758b = aweme;
        HotSearchInfo hotSearchInfo = aweme.getHotSearchInfo();
        this.itemView.setVisibility(0);
        boolean z = !TextUtils.isEmpty(hotSearchInfo.getChallengeId());
        if (this.f75760d) {
            mo73891a(aweme);
        }
        if (z) {
            str = "#";
        } else {
            str = "";
        }
        DmtTextView dmtTextView = this.f75761e;
        Resources resources = this.f75757a.getResources();
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String sentence = hotSearchInfo.getSentence();
        if (sentence == null) {
            C7573i.m23580a();
        }
        sb.append(sentence);
        objArr[0] = sb.toString();
        dmtTextView.setText(resources.getString(R.string.fpm, objArr));
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        if (a.mo18727U()) {
            StringBuilder sb2 = new StringBuilder(" | ");
            sb2.append(this.f75757a.getResources().getString(R.string.cqc, new Object[]{C30537o.m99738a(hotSearchInfo.getValue())}));
            str2 = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder(" | ");
            sb3.append(this.f75757a.getResources().getString(R.string.bf0));
            sb3.append(C30537o.m99738a(hotSearchInfo.getValue()));
            str2 = sb3.toString();
        }
        this.f75763g.setVisibility(0);
        C7573i.m23582a((Object) hotSearchInfo, "hotSearchInfo");
        m94639a(hotSearchInfo);
        DmtTextView dmtTextView2 = this.f75762f;
        if (dmtTextView2 != null) {
            dmtTextView2.setText(str2);
        }
        if (C6384b.m19835a().mo15287a(HotSpotValueAb.class, true, "hot_search_tip_view_style", C6384b.m19835a().mo15295d().hot_search_tip_view_style, 0) == 1) {
            DmtTextView dmtTextView3 = this.f75762f;
            if (dmtTextView3 != null) {
                dmtTextView3.setVisibility(8);
            }
        } else {
            DmtTextView dmtTextView4 = this.f75762f;
            if (dmtTextView4 != null) {
                dmtTextView4.setVisibility(0);
            }
        }
        this.itemView.setOnClickListener(new C28745a(this, hotSearchInfo, z));
    }

    public HotSpotBarViewHolder(View view, String str, boolean z) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(str, "mEventType");
        super(view);
        this.f75759c = str;
        this.f75760d = z;
        View findViewById = view.findViewById(R.id.dsf);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.tv_content)");
        this.f75761e = (DmtTextView) findViewById;
        this.f75762f = (DmtTextView) view.findViewById(R.id.dvw);
        View findViewById2 = view.findViewById(R.id.ax9);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.icon)");
        this.f75763g = (RemoteImageView) findViewById2;
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f75757a = context;
    }

    private /* synthetic */ HotSpotBarViewHolder(View view, String str, boolean z, int i, C7571f fVar) {
        this(view, str, false);
    }

    /* renamed from: a */
    public final void mo73892a(Aweme aweme, HotSearchInfo hotSearchInfo, String str, boolean z, boolean z2) {
        String str2;
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f75759c);
        String str3 = "action_type";
        if (z2) {
            str2 = "show";
        } else {
            str2 = "click";
        }
        C22984d a2 = a.mo59973a(str3, str2).mo59973a("group_id", aweme.getAid());
        if (z) {
            a2.mo59973a("tag_id", str);
        } else {
            a2.mo59973a("search_keyword", hotSearchInfo.getSentence());
            a2.mo59973a("search_keyword_id", hotSearchInfo.getId());
            a2.mo59973a("author_id", C43122ff.m136788s(aweme.getAuthor()));
            a2.mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(aweme)));
        }
        C6907h.m21524a("hot_search_video_guide", (Map) a2.f60753a);
    }
}
