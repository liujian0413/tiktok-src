package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.viewpager.AbsPagerAdapter;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a.C25176a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25196d;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25210f;
import com.p280ss.android.ugc.aweme.discover.helper.C26666n;
import com.p280ss.android.ugc.aweme.discover.model.CategoryListAdInfo;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.InfiniteLoopPagerAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.ViewPagerIndicatorLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.C7579l;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.CategoryAdView */
public final class CategoryAdView extends FrameLayout implements OnClickListener {

    /* renamed from: a */
    private SSViewPager f71778a;

    /* renamed from: b */
    private TextView f71779b;

    /* renamed from: c */
    private TextView f71780c;

    /* renamed from: d */
    private ViewPagerIndicatorLayout f71781d;

    /* renamed from: e */
    private C27255a f71782e;

    /* renamed from: f */
    private C26666n f71783f;

    /* renamed from: g */
    private CategoryListAdInfo f71784g;

    /* renamed from: h */
    private int f71785h;

    /* renamed from: i */
    private int f71786i;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.CategoryAdView$a */
    static final class C27255a extends AbsPagerAdapter {

        /* renamed from: d */
        public List<? extends UrlModel> f71787d;

        /* renamed from: e */
        private final Context f71788e;

        /* renamed from: f */
        private final OnClickListener f71789f;

        public final int getCount() {
            List<? extends UrlModel> list = this.f71787d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public C27255a(Context context, LayoutInflater layoutInflater, OnClickListener onClickListener) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(layoutInflater, "layoutInflater");
            C7573i.m23587b(onClickListener, "onClickListener");
            super(context, layoutInflater);
            this.f71788e = context;
            this.f71789f = onClickListener;
        }

        /* renamed from: a */
        public final View mo26999a(int i, View view, ViewGroup viewGroup) {
            if (!(view instanceof RemoteImageView)) {
                view = null;
            }
            RemoteImageView remoteImageView = (RemoteImageView) view;
            if (remoteImageView == null) {
                remoteImageView = new RemoteImageView(this.f71788e);
            }
            remoteImageView.setOnClickListener(this.f71789f);
            remoteImageView.setScaleType(ScaleType.FIT_CENTER);
            C13438a aVar = (C13438a) remoteImageView.getHierarchy();
            C7573i.m23582a((Object) aVar, "iv.hierarchy");
            aVar.mo32897a(RoundingParams.m39399b(4.0f));
            List<? extends UrlModel> list = this.f71787d;
            if (list != null) {
                UrlModel urlModel = (UrlModel) list.get(i);
                if (urlModel != null) {
                    C23323e.m76524b(remoteImageView, urlModel);
                }
            }
            return remoteImageView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.CategoryAdView$b */
    static final class C27256b implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ CategoryListAdInfo f71790a;

        C27256b(CategoryListAdInfo categoryListAdInfo) {
            this.f71790a = categoryListAdInfo;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65260a(this.f71790a).mo65278b();
        }
    }

    public final CategoryListAdInfo getAd() {
        return this.f71784g;
    }

    public final int getCategoryOrAdStartPos() {
        return this.f71786i;
    }

    public final int getPos() {
        return this.f71785h;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.edp);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.viewpager)");
        this.f71778a = (SSViewPager) findViewById;
        View findViewById2 = findViewById(R.id.di);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.ad_tag)");
        this.f71779b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.title);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.title)");
        this.f71780c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.a_k);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.dot_indicator)");
        this.f71781d = (ViewPagerIndicatorLayout) findViewById4;
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        LayoutInflater from = LayoutInflater.from(getContext());
        C7573i.m23582a((Object) from, "LayoutInflater.from(context)");
        OnClickListener onClickListener = this;
        this.f71782e = new C27255a(context, from, onClickListener);
        SSViewPager sSViewPager = this.f71778a;
        if (sSViewPager == null) {
            C7573i.m23583a("viewPager");
        }
        this.f71783f = new C26666n(sSViewPager);
        C26666n nVar = this.f71783f;
        if (nVar == null) {
            C7573i.m23583a("viewPagerHelper");
        }
        nVar.mo68376b();
        ViewPagerIndicatorLayout viewPagerIndicatorLayout = this.f71781d;
        if (viewPagerIndicatorLayout == null) {
            C7573i.m23583a("indicator");
        }
        SSViewPager sSViewPager2 = this.f71778a;
        if (sSViewPager2 == null) {
            C7573i.m23583a("viewPager");
        }
        viewPagerIndicatorLayout.setUpViewPager((ViewPager) sSViewPager2);
        setOnClickListener(onClickListener);
        SSViewPager sSViewPager3 = this.f71778a;
        if (sSViewPager3 == null) {
            C7573i.m23583a("viewPager");
        }
        sSViewPager3.setOnClickListener(onClickListener);
    }

    public final void setCategoryOrAdStartPos(int i) {
        this.f71786i = i;
    }

    public final void setPos(int i) {
        this.f71785h = i;
    }

    public CategoryAdView(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    public final void setAd(CategoryListAdInfo categoryListAdInfo) {
        this.f71784g = categoryListAdInfo;
        if (categoryListAdInfo == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        m89273a(categoryListAdInfo);
    }

    /* renamed from: a */
    private final void m89273a(CategoryListAdInfo categoryListAdInfo) {
        String str;
        TextView textView = this.f71780c;
        if (textView == null) {
            C7573i.m23583a("title");
        }
        textView.setText(categoryListAdInfo.getTitle());
        C27255a aVar = this.f71782e;
        if (aVar == null) {
            C7573i.m23583a("viewPagerAdapter");
        }
        aVar.f71787d = categoryListAdInfo.getImageList();
        C27255a aVar2 = this.f71782e;
        if (aVar2 == null) {
            C7573i.m23583a("viewPagerAdapter");
        }
        if (aVar2.getCount() > 1) {
            SSViewPager sSViewPager = this.f71778a;
            if (sSViewPager == null) {
                C7573i.m23583a("viewPager");
            }
            C27255a aVar3 = this.f71782e;
            if (aVar3 == null) {
                C7573i.m23583a("viewPagerAdapter");
            }
            sSViewPager.setAdapter(new InfiniteLoopPagerAdapter(aVar3));
            ViewPagerIndicatorLayout viewPagerIndicatorLayout = this.f71781d;
            if (viewPagerIndicatorLayout == null) {
                C7573i.m23583a("indicator");
            }
            viewPagerIndicatorLayout.setVisibility(0);
        } else {
            SSViewPager sSViewPager2 = this.f71778a;
            if (sSViewPager2 == null) {
                C7573i.m23583a("viewPager");
            }
            C27255a aVar4 = this.f71782e;
            if (aVar4 == null) {
                C7573i.m23583a("viewPagerAdapter");
            }
            sSViewPager2.setAdapter(aVar4);
            ViewPagerIndicatorLayout viewPagerIndicatorLayout2 = this.f71781d;
            if (viewPagerIndicatorLayout2 == null) {
                C7573i.m23583a("indicator");
            }
            viewPagerIndicatorLayout2.setVisibility(8);
        }
        C27255a aVar5 = this.f71782e;
        if (aVar5 == null) {
            C7573i.m23583a("viewPagerAdapter");
        }
        aVar5.notifyDataSetChanged();
        C26666n nVar = this.f71783f;
        if (nVar == null) {
            C7573i.m23583a("viewPagerHelper");
        }
        C27255a aVar6 = this.f71782e;
        if (aVar6 == null) {
            C7573i.m23583a("viewPagerAdapter");
        }
        nVar.f70304a = aVar6.getCount();
        AwemeTextLabelModel label = categoryListAdInfo.getLabel();
        if (label != null) {
            str = label.getLabelName();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            TextView textView2 = this.f71779b;
            if (textView2 == null) {
                C7573i.m23583a("adTag");
            }
            textView2.setText(R.string.ee);
            return;
        }
        TextView textView3 = this.f71779b;
        if (textView3 == null) {
            C7573i.m23583a("adTag");
        }
        AwemeTextLabelModel label2 = categoryListAdInfo.getLabel();
        C7573i.m23582a((Object) label2, "ad.label");
        textView3.setText(label2.getLabelName());
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CategoryListAdInfo categoryListAdInfo = this.f71784g;
        if (categoryListAdInfo != null) {
            C25176a f = new C25176a().mo65772c(categoryListAdInfo.getOpenUrl()).mo65768a(true).mo65777g(categoryListAdInfo.getMpUrl()).mo65766a(new C33472a().mo85794e(C25210f.m82902a(categoryListAdInfo.getOpenUrl(), categoryListAdInfo.getMpUrl())).mo85790a()).mo65775e(categoryListAdInfo.getWebUrl()).mo65776f(categoryListAdInfo.getWebTitle());
            Long creativeId = categoryListAdInfo.getCreativeId();
            C7573i.m23582a((Object) creativeId, "ad.creativeId");
            C25175a aVar = f.mo65764a(creativeId.longValue()).mo65770b(categoryListAdInfo.getLogExtra()).mo65778h("list_ad").f66436a;
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            C25196d.m82879a(context, aVar).mo65822a();
            C24958f.m81905a().mo65266a("list_ad").mo65276b("click").mo65264a(categoryListAdInfo.getCreativeId()).mo65286h(categoryListAdInfo.getLogExtra()).mo65265a((Object) C7507ae.m23385a(C7579l.m23633a("topic_order", Integer.valueOf((this.f71785h + 1) - this.f71786i)))).mo65270a(getContext());
            UrlModel clickTrackUrlList = categoryListAdInfo.getClickTrackUrlList();
            if (clickTrackUrlList != null) {
                List urlList = clickTrackUrlList.getUrlList();
                if (urlList != null) {
                    C24962g.m81954a((C24939aj) new C27256b(categoryListAdInfo), (Collection<String>) urlList, true);
                }
            }
        }
    }

    public CategoryAdView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public CategoryAdView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
