package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.graphics.Outline;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimatedImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.adapter.AbsSearchViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.mob.C26804x.C26805a;
import com.p280ss.android.ugc.aweme.discover.model.SearchOperation;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixOperationViewHolder */
public final class SearchMixOperationViewHolder extends AbsSearchViewHolder {

    /* renamed from: g */
    public static final C26764a f70580g = new C26764a(null);

    /* renamed from: c */
    public AnimatedImageView f70581c;

    /* renamed from: d */
    public DmtTextView f70582d;

    /* renamed from: e */
    public ImageView f70583e;

    /* renamed from: f */
    public View f70584f;

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixOperationViewHolder$a */
    public static final class C26764a {
        private C26764a() {
        }

        public /* synthetic */ C26764a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchMixOperationViewHolder m87855a(ViewGroup viewGroup, boolean z) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2p, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new SearchMixOperationViewHolder(inflate, viewGroup);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixOperationViewHolder$b */
    static final class C26765b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchMixOperationViewHolder f70585a;

        /* renamed from: b */
        final /* synthetic */ SearchOperation f70586b;

        /* renamed from: c */
        final /* synthetic */ int f70587c;

        C26765b(SearchMixOperationViewHolder searchMixOperationViewHolder, SearchOperation searchOperation, int i) {
            this.f70585a = searchMixOperationViewHolder;
            this.f70586b = searchOperation;
            this.f70587c = i;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            String str3 = null;
            C22912d.f60645e.mo59887a(this.f70585a.mo67898b(), this.f70586b.getLink(), (String) null);
            if (this.f70587c == 2) {
                View view2 = this.f70585a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                C26501r a = C26805a.m88001a(view2);
                String str4 = "search_operation_card_click";
                C22984d a2 = C22984d.m75611a().mo59973a("card_id", this.f70586b.getCardId()).mo59973a("enter_from", "general_search");
                String str5 = "search_keyword";
                if (a != null) {
                    str2 = a.mo68129b();
                } else {
                    str2 = null;
                }
                C22984d a3 = a2.mo59973a(str5, str2);
                String str6 = "log_pb";
                if (a != null) {
                    str3 = a.mo68131d();
                }
                C6907h.m21524a(str4, (Map) a3.mo59973a(str6, str3).f60753a);
            } else {
                View view3 = this.f70585a.itemView;
                C7573i.m23582a((Object) view3, "itemView");
                C26501r a4 = C26805a.m88001a(view3);
                String str7 = "search_operation_card_click";
                C22984d a5 = C22984d.m75611a().mo59973a("enter_from", "general_search");
                String str8 = "search_keyword";
                if (a4 != null) {
                    str = a4.mo68129b();
                } else {
                    str = null;
                }
                C22984d a6 = a5.mo59973a(str8, str);
                String str9 = "log_pb";
                if (a4 != null) {
                    str3 = a4.mo68131d();
                }
                C6907h.m21524a(str7, (Map) a6.mo59973a(str9, str3).f60753a);
            }
            this.f70585a.mo68512a("search_result_click");
        }
    }

    /* renamed from: d */
    public final View mo67902d() {
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        return view;
    }

    /* renamed from: a */
    public final void mo68513a(boolean z) {
        this.f70581c.setAttached(true);
        this.f70581c.setUserVisibleHint(true);
    }

    /* renamed from: a */
    public final void mo68512a(String str) {
        C7573i.m23587b(str, "eventName");
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("token_type", "activity");
        CharSequence charSequence = str;
        if (TextUtils.equals("search_result_click", charSequence)) {
            linkedHashMap.put("aladin_button_type", "click_photo");
            mo67900b(linkedHashMap);
            return;
        }
        if (TextUtils.equals("search_result_show", charSequence)) {
            mo67897a(linkedHashMap);
        }
    }

    public SearchMixOperationViewHolder(View view, View view2) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(view2, "parent");
        super(view);
        this.f70584f = view2;
        this.f70581c = (AnimatedImageView) view.findViewById(R.id.c92);
        this.f70582d = (DmtTextView) view.findViewById(R.id.c91);
        this.f70583e = (ImageView) view.findViewById(R.id.bzu);
        if (VERSION.SDK_INT >= 21) {
            AnimatedImageView animatedImageView = this.f70581c;
            C7573i.m23582a((Object) animatedImageView, "operationPic");
            animatedImageView.setOutlineProvider(new ViewOutlineProvider() {
                public final void getOutline(View view, Outline outline) {
                    C7573i.m23587b(view, "view");
                    C7573i.m23587b(outline, "outline");
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + 8, 8.0f);
                }
            });
            AnimatedImageView animatedImageView2 = this.f70581c;
            C7573i.m23582a((Object) animatedImageView2, "operationPic");
            animatedImageView2.setClipToOutline(true);
        }
    }

    /* renamed from: a */
    public final void mo68511a(SearchOperation searchOperation, SearchResultParam searchResultParam, boolean z, int i) {
        String str;
        C7573i.m23587b(searchOperation, "operation");
        if (!searchOperation.getRecorded()) {
            C26501r a = C26805a.m88001a(this.f70584f);
            String str2 = "search_opeartion_card_show";
            C22984d a2 = C22984d.m75611a().mo59973a("card_id", searchOperation.getCardId()).mo59973a("enter_from", "general_search");
            String str3 = "search_keyword";
            String str4 = null;
            if (a != null) {
                str = a.mo68129b();
            } else {
                str = null;
            }
            C22984d a3 = a2.mo59973a(str3, str);
            String str5 = "log_pb";
            if (a != null) {
                str4 = a.mo68131d();
            }
            C6907h.m21524a(str2, (Map) a3.mo59973a(str5, str4).f60753a);
            searchOperation.setRecorded(true);
        }
        this.f70581c.mo60860a(searchOperation.getBanner());
        RemoteImageView remoteImageView = this.f70581c;
        UrlModel banner = searchOperation.getBanner();
        AnimatedImageView animatedImageView = this.f70581c;
        C7573i.m23582a((Object) animatedImageView, "operationPic");
        C23323e.m76509a(remoteImageView, banner, animatedImageView.getControllerListener());
        DmtTextView dmtTextView = this.f70582d;
        C7573i.m23582a((Object) dmtTextView, "operationName");
        dmtTextView.setText(searchOperation.getDesc());
        this.f70582d.setFontType(C10834d.f29337g);
        DmtTextView dmtTextView2 = this.f70582d;
        C7573i.m23582a((Object) dmtTextView2, "operationName");
        dmtTextView2.setMaxLines(2);
        DmtTextView dmtTextView3 = this.f70582d;
        C7573i.m23582a((Object) dmtTextView3, "operationName");
        if (TextUtils.isEmpty(dmtTextView3.getText())) {
            ImageView imageView = this.f70583e;
            C7573i.m23582a((Object) imageView, "arrowMore");
            imageView.setVisibility(4);
        }
        this.itemView.setOnClickListener(new C26765b(this, searchOperation, 2));
        if (searchOperation.getLink() != null) {
            Uri parse = Uri.parse(searchOperation.getLink());
            C7573i.m23582a((Object) parse, "parse");
            if ("fantasy".equals(parse.getHost())) {
                C6907h.m21524a("show_million_pound", (Map) C22984d.m75611a().mo59973a("enter_from", "click_search").mo59973a("is_million_pound", "1").f60753a);
            }
        }
    }
}
