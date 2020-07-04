package com.p280ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.discover.abtest.AsyncInflateSearchExperiment;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchChallengeViewHolder.C26437a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.p1052b.C23149d;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengenNewViewHolder */
public final class SearchChallengenNewViewHolder extends SearchChallengeViewHolder {

    /* renamed from: n */
    public static final C26439a f69685n = new C26439a(null);

    /* renamed from: i */
    public TextView f69686i;

    /* renamed from: j */
    public TextView f69687j;

    /* renamed from: k */
    public RemoteImageView f69688k;

    /* renamed from: l */
    public View f69689l;

    /* renamed from: m */
    public ImageView f69690m;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.SearchChallengenNewViewHolder$a */
    public static final class C26439a {
        private C26439a() {
        }

        public /* synthetic */ C26439a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static SearchChallengenNewViewHolder m86987a(ViewGroup viewGroup, String str, C26437a aVar, String str2) {
            View view;
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(str, "mKeyword");
            C7573i.m23587b(str2, "refer");
            if (!(viewGroup.getContext() instanceof C23149d) || !C6399b.m19944t() || !C6384b.m19835a().mo15292a(AsyncInflateSearchExperiment.class, true, "is_async_search", C6384b.m19835a().mo15295d().is_async_search, true)) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a2a, viewGroup, false);
                C7573i.m23582a((Object) view, "LayoutInflater.from(pare…allenge_1, parent, false)");
            } else {
                Context context = viewGroup.getContext();
                if (context != null) {
                    view = ((C23149d) context).getInflater().mo60290a(R.layout.a2a);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
                }
            }
            C26438b.m86983a(view, str2);
            return new SearchChallengenNewViewHolder(view, str, aVar, str2);
        }
    }

    /* renamed from: b */
    public static final SearchChallengenNewViewHolder m86985b(ViewGroup viewGroup, String str, C26437a aVar, String str2) {
        return C26439a.m86987a(viewGroup, str, null, str2);
    }

    /* renamed from: a */
    public final void mo68029a(SearchChallenge searchChallenge, String str) {
        if (searchChallenge != null) {
            this.f69671f = str;
            if (searchChallenge.getChallenge() != null) {
                this.f69669d = searchChallenge.getChallenge();
            }
            TextView textView = this.f69686i;
            if (textView != null) {
                Challenge challenge = this.f69669d;
                C7573i.m23582a((Object) challenge, "mChallenge");
                textView.setText(challenge.getChallengeName());
            }
            TextView textView2 = this.f69687j;
            if (textView2 != null) {
                View view = this.itemView;
                C7573i.m23582a((Object) view, "itemView");
                Context context = view.getContext();
                Challenge challenge2 = this.f69669d;
                C7573i.m23582a((Object) challenge2, "mChallenge");
                Challenge challenge3 = this.f69669d;
                C7573i.m23582a((Object) challenge3, "mChallenge");
                textView2.setText(context.getString(R.string.yx, new Object[]{C30537o.m99738a(challenge2.getDisplayCount()), C30537o.m99738a((long) challenge3.getUserCount())}));
            }
            switch (this.f69669d.tag) {
                case 1:
                    ImageView imageView = this.f69690m;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    ImageView imageView2 = this.f69690m;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.wm);
                        break;
                    }
                    break;
                case 2:
                    ImageView imageView3 = this.f69690m;
                    if (imageView3 != null) {
                        imageView3.setVisibility(0);
                    }
                    ImageView imageView4 = this.f69690m;
                    if (imageView4 != null) {
                        imageView4.setImageResource(R.drawable.wn);
                        break;
                    }
                    break;
                default:
                    ImageView imageView5 = this.f69690m;
                    if (imageView5 != null) {
                        imageView5.setVisibility(8);
                        break;
                    }
                    break;
            }
            Challenge challenge4 = this.f69669d;
            C7573i.m23582a((Object) challenge4, "mChallenge");
            String challengeProfileUrl = challenge4.getChallengeProfileUrl();
            if (!TextUtils.isEmpty(challengeProfileUrl)) {
                C23323e.m76514a(this.f69688k, challengeProfileUrl);
                View view2 = this.f69689l;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            } else {
                RemoteImageView remoteImageView = this.f69688k;
                if (remoteImageView != null) {
                    remoteImageView.setImageResource(R.drawable.a15);
                }
                View view3 = this.f69689l;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
            C26438b.m86982a(this.itemView, searchChallenge.getAdData());
            mo68028a(searchChallenge);
        }
    }

    public SearchChallengenNewViewHolder(View view, String str, C26437a aVar, String str2) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        C7573i.m23587b(str2, "adLogRefer");
        super(view, str, aVar, str2);
        this.f69686i = (TextView) view.findViewById(R.id.drb);
        this.f69687j = (TextView) view.findViewById(R.id.dz5);
        this.f69688k = (RemoteImageView) view.findViewById(R.id.ic);
        this.f69689l = view.findViewById(R.id.au6);
        this.f69690m = (ImageView) view.findViewById(R.id.ax9);
    }
}
