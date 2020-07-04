package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23472a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.mixfeed.p1181a.C26745c;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolder;
import com.p280ss.android.ugc.aweme.discover.mob.C26804x.C26805a;
import com.p280ss.android.ugc.aweme.feed.adapter.XiGuaVideoViewHolder.C28124a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.report.C37196b;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowXiGuaVideoHolder */
public class FollowXiGuaVideoHolder extends SearchMixVideoViewHolder {

    /* renamed from: bi */
    public static final C34233a f89281bi = new C34233a(null);

    /* renamed from: bh */
    public TextView f89282bh;

    /* renamed from: g */
    public ImageView f89283g;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowXiGuaVideoHolder$a */
    public static final class C34233a {
        private C34233a() {
        }

        public /* synthetic */ C34233a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowXiGuaVideoHolder$b */
    static final class C34234b extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowXiGuaVideoHolder f89284a;

        C34234b(FollowXiGuaVideoHolder followXiGuaVideoHolder) {
            this.f89284a = followXiGuaVideoHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m110579a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m110579a(View view) {
            C7573i.m23587b(view, "it");
            C26501r a = C26805a.m88001a(view);
            Aweme aweme = this.f89284a.f77546j;
            C7573i.m23582a((Object) aweme, "mAweme");
            User author = aweme.getAuthor();
            C7573i.m23582a((Object) author, "mAweme.author");
            String a2 = C28124a.m92258a(author.getUid(), a.mo68129b());
            C7167b b = C7167b.m22380b();
            C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
            b.mo18647a().openMiniApp(this.f89284a.mo75261ab(), a2, new C33472a().mo85792c("022003").mo85791b(this.f89284a.f77510Z).mo85789a("head").mo85790a());
            Aweme aweme2 = this.f89284a.f77546j;
            C7573i.m23582a((Object) aweme2, "aweme");
            Aweme aweme3 = this.f89284a.f77546j;
            C7573i.m23582a((Object) aweme3, "aweme");
            C6907h.m21524a("mp_click", (Map) C22984d.m75611a().mo59973a("mp_id", C33447f.m108186a(a2)).mo59973a("group_id", aweme2.getAid()).mo59973a("position", "pgc").mo59973a("enter_from", "general_search").mo59970a("rank", this.f89284a.getPosition()).mo59973a("search_id", aweme3.getRequestId()).mo59973a("query", a.mo68129b()).f60753a);
            this.f89284a.mo86985a("search_result_click", "click_more_button");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.vh.FollowXiGuaVideoHolder$c */
    static final class C34235c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f89285a;

        /* renamed from: b */
        final /* synthetic */ FollowXiGuaVideoHolder f89286b;

        C34235c(ImageView imageView, FollowXiGuaVideoHolder followXiGuaVideoHolder) {
            this.f89285a = imageView;
            this.f89286b = followXiGuaVideoHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Resources resources = this.f89285a.getResources();
            String string = resources.getString(R.string.dfp);
            C7573i.m23582a((Object) string, "res.getString(R.string.report_video)");
            String string2 = resources.getString(R.string.w_);
            C7573i.m23582a((Object) string2, "res.getString(R.string.cancel)");
            CharSequence[] charSequenceArr = {string, string2};
            C7573i.m23582a((Object) view, "v");
            C25712a aVar = new C25712a(view.getContext());
            aVar.mo66614a(charSequenceArr, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C34235c f89287a;

                {
                    this.f89287a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (i == 0) {
                        View view = this.f89287a.f89286b.itemView;
                        C7573i.m23582a((Object) view, "itemView");
                        Context context = view.getContext();
                        C7573i.m23582a((Object) context, "itemView.context");
                        Activity a = C38157b.m121903a(context);
                        Aweme aweme = this.f89287a.f89286b.f77546j;
                        Aweme aweme2 = this.f89287a.f89286b.f77546j;
                        C7573i.m23582a((Object) aweme2, "aweme");
                        String aid = aweme2.getAid();
                        Aweme aweme3 = this.f89287a.f89286b.f77546j;
                        C7573i.m23582a((Object) aweme3, "aweme");
                        User author = aweme3.getAuthor();
                        C7573i.m23582a((Object) author, "aweme.author");
                        C37196b.m119560a(a, aweme, aid, author.getUid());
                        C10761a.m31410e(this.f89287a.f89286b.f89213be.getContext(), "举报了").mo25750a();
                    }
                }
            });
            aVar.mo66615b();
            this.f89286b.mo86985a("search_result_click", "report_video");
        }
    }

    /* renamed from: ak */
    public final void mo75313ak() {
        mo86985a("search_result_click", "click_video");
    }

    /* renamed from: ar */
    public final TextView mo86986ar() {
        TextView textView = this.f89282bh;
        if (textView == null) {
            C7573i.m23583a("mXiaGuaTag");
        }
        return textView;
    }

    /* renamed from: as */
    private void m110571as() {
        ImageView imageView = this.f89283g;
        if (imageView == null) {
            C7573i.m23583a("mReportEnter");
        }
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new C34235c(imageView, this));
        }
    }

    /* renamed from: a */
    public void mo68499a() {
        if (this.f77546j != null) {
            mo75293u();
            mo75296x();
            mo68525j();
            mo75227C();
            m110571as();
            aG_();
            TextView textView = this.f77577aC;
            if (textView == null) {
                C7573i.m23580a();
            }
            textView.setVisibility(8);
            ImageView imageView = this.f77576aB;
            if (imageView == null) {
                C7573i.m23580a();
            }
            imageView.setVisibility(8);
        }
    }

    public void aG_() {
        Context ab = mo75261ab();
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        String c = C43110ev.m136734c(ab, aweme.getCreateTime() * 1000);
        String string = mo75261ab().getString(R.string.dfi, new Object[]{c});
        TextView textView = this.f89282bh;
        if (textView == null) {
            C7573i.m23583a("mXiaGuaTag");
        }
        textView.setText(string);
    }

    /* renamed from: x */
    public final void mo75296x() {
        UrlModel urlModel;
        RemoteImageView remoteImageView = this.f77554r;
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        String str = null;
        if (aweme.getAuthor() == null) {
            urlModel = null;
        } else {
            Aweme aweme2 = this.f77546j;
            C7573i.m23582a((Object) aweme2, "mAweme");
            User author = aweme2.getAuthor();
            C7573i.m23582a((Object) author, "mAweme.author");
            urlModel = author.getAvatarThumb();
        }
        C23323e.m76506a(remoteImageView, urlModel, this.f77501Q, this.f77501Q);
        Aweme aweme3 = this.f77546j;
        C7573i.m23582a((Object) aweme3, "mAweme");
        if (aweme3.getAuthor() != null) {
            Aweme aweme4 = this.f77546j;
            C7573i.m23582a((Object) aweme4, "mAweme");
            if (aweme4.getAuthor() != null) {
                Aweme aweme5 = this.f77546j;
                C7573i.m23582a((Object) aweme5, "mAweme");
                User author2 = aweme5.getAuthor();
                C7573i.m23582a((Object) author2, "mAweme.author");
                str = author2.getRemarkName();
            }
            if (!TextUtils.isEmpty(str)) {
                TextView textView = this.f77559w;
                C7573i.m23582a((Object) textView, "mHeadUserNameView");
                Aweme aweme6 = this.f77546j;
                C7573i.m23582a((Object) aweme6, "mAweme");
                User author3 = aweme6.getAuthor();
                C7573i.m23582a((Object) author3, "mAweme.author");
                textView.setText(author3.getRemarkName());
            } else {
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                Context context = view.getContext();
                Aweme aweme7 = this.f77546j;
                C7573i.m23582a((Object) aweme7, "mAweme");
                User author4 = aweme7.getAuthor();
                C7573i.m23582a((Object) author4, "mAweme.author");
                String nickname = author4.getNickname();
                Aweme aweme8 = this.f77546j;
                C7573i.m23582a((Object) aweme8, "mAweme");
                SpannableString a = C23472a.m77059a(context, nickname, aweme8.getNicknamePosition());
                TextView textView2 = this.f77559w;
                C7573i.m23582a((Object) textView2, "mHeadUserNameView");
                textView2.setText(a);
            }
            C7562b bVar = new C34234b(this);
            this.f77559w.setOnClickListener(new C34282l(bVar));
            this.f77554r.setOnClickListener(new C34282l(bVar));
        }
    }

    /* renamed from: a */
    public void mo68500a(View view) {
        C7573i.m23587b(view, "root");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        C7573i.m23582a((Object) viewStub, "headStub");
        viewStub.setLayoutResource(R.layout.a6t);
        mo75253a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        C7573i.m23582a((Object) viewStub2, "descStub");
        viewStub2.setLayoutResource(R.layout.a6s);
        mo75253a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        C7573i.m23582a((Object) viewStub3, "contentStub");
        viewStub3.setLayoutResource(R.layout.a6c);
        mo75253a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcv);
        C7573i.m23582a((Object) viewStub4, "xiguaStub");
        viewStub4.setLayoutResource(R.layout.aca);
        mo75253a(viewStub4.inflate(), 12.0f);
    }

    /* renamed from: a */
    public final void mo75259a(FollowFeedLayout followFeedLayout) {
        C7573i.m23587b(followFeedLayout, "itemView");
        super.mo75259a(followFeedLayout);
        View findViewById = followFeedLayout.findViewById(R.id.ax3);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.ic_more)");
        this.f89283g = (ImageView) findViewById;
        View findViewById2 = followFeedLayout.findViewById(R.id.e86);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.update_time_and_source)");
        this.f89282bh = (TextView) findViewById2;
    }

    /* renamed from: a */
    public final void mo86985a(String str, String str2) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(str2, "aladinButtonType");
        TextView textView = this.f77559w;
        C7573i.m23582a((Object) textView, "mHeadUserNameView");
        C26501r a = C26805a.m88001a(textView);
        if (a != null) {
            SearchResultParam searchResultParam = a.f69898b;
            if (searchResultParam != null) {
                searchResultParam.setRankInList(getLayoutPosition());
            }
        }
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("token_type", "xigua_mp");
        linkedHashMap.put("is_aladdin", "0");
        CharSequence charSequence = str;
        if (TextUtils.equals("search_result_click", charSequence)) {
            linkedHashMap.put("aladin_button_type", str2);
            C26745c.m87804b(a, linkedHashMap);
            return;
        }
        if (TextUtils.equals("search_result_show", charSequence)) {
            C26745c.m87802a(a, linkedHashMap);
        }
    }
}
