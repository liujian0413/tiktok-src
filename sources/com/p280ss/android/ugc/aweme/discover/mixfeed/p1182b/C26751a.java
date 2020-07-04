package com.p280ss.android.ugc.aweme.discover.mixfeed.p1182b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24450b.C24451a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.adapter.XiGuaVideoViewHolder.C28124a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParamProvider.C28651a;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.a */
public final class C26751a {

    /* renamed from: a */
    public TextView f70514a;

    /* renamed from: b */
    public View f70515b;

    /* renamed from: c */
    public Context f70516c;

    /* renamed from: d */
    public View f70517d;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b.a$a */
    static final class C26752a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26751a f70518a;

        /* renamed from: b */
        final /* synthetic */ Aweme f70519b;

        /* renamed from: c */
        final /* synthetic */ int f70520c;

        C26752a(C26751a aVar, Aweme aweme, int i) {
            this.f70518a = aVar;
            this.f70519b = aweme;
            this.f70520c = i;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C7573i.m23582a((Object) view, "it");
            Context context = view.getContext();
            C7573i.m23582a((Object) context, "it.context");
            String searchKeyword = C28651a.m94274a(context).getSearchKeyword();
            String aid = this.f70519b.getAid();
            User author = this.f70519b.getAuthor();
            if (author != null) {
                str = author.getUid();
            } else {
                str = null;
            }
            String a = C28124a.m92259a(aid, searchKeyword, str);
            C7167b b = C7167b.m22380b();
            C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
            b.mo18647a().openMiniApp(this.f70518a.f70516c, a, new C33471b());
            C6907h.m21524a("mp_click", (Map) C22984d.m75611a().mo59973a("mp_id", C33447f.m108186a(a)).mo59973a("group_id", this.f70519b.getAid()).mo59973a("position", "list_item").mo59973a("enter_from", "general_search").mo59970a("rank", this.f70520c).mo59973a("search_id", this.f70519b.getRequestId()).mo59973a("query", searchKeyword).f60753a);
        }
    }

    /* renamed from: a */
    private void m87809a() {
        LayoutInflater from = LayoutInflater.from(this.f70516c);
        View view = this.f70517d;
        if (view != null) {
            View inflate = from.inflate(R.layout.aa1, (ViewGroup) view, true);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(mCon…ainer as ViewGroup, true)");
            this.f70515b = inflate;
            View view2 = this.f70515b;
            if (view2 == null) {
                C7573i.m23583a("mView");
            }
            View findViewById = view2.findViewById(R.id.d8t);
            C7573i.m23582a((Object) findViewById, "mView.findViewById(R.id.source)");
            this.f70514a = (TextView) findViewById;
            TextView textView = this.f70514a;
            if (textView == null) {
                C7573i.m23583a("mResource");
            }
            textView.setVisibility(0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public C26751a(View view) {
        C7573i.m23587b(view, "container");
        this.f70517d = view;
        Context context = this.f70517d.getContext();
        C7573i.m23582a((Object) context, "container.context");
        this.f70516c = context;
        m87809a();
    }

    /* renamed from: a */
    public final void mo68492a(Aweme aweme, int i) {
        if (aweme != null && aweme.isAwemeFromXiGua()) {
            TextView textView = this.f70514a;
            if (textView == null) {
                C7573i.m23583a("mResource");
            }
            textView.setText(C24451a.m80377a(this.f70516c, R.string.fp6, new Object[0]));
            View view = this.f70515b;
            if (view == null) {
                C7573i.m23583a("mView");
            }
            view.setOnClickListener(new C26752a(this, aweme, i));
        }
    }
}
