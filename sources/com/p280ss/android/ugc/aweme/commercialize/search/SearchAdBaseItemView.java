package com.p280ss.android.ugc.aweme.commercialize.search;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle;
import android.view.View;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.p280ss.android.ugc.aweme.commercialize.model.C25007p;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdBaseItemView */
public class SearchAdBaseItemView extends LinearLayout implements C0042h {

    /* renamed from: a */
    private C0043i f66070a;

    /* renamed from: b */
    private C25007p f66071b;

    /* renamed from: c */
    private HashMap f66072c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdBaseItemView$a */
    static final class C25037a implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ SearchAdBaseItemView f66073a;

        /* renamed from: b */
        final /* synthetic */ AwemeRawAd f66074b;

        C25037a(SearchAdBaseItemView searchAdBaseItemView, AwemeRawAd awemeRawAd) {
            this.f66073a = searchAdBaseItemView;
            this.f66074b = awemeRawAd;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("click").mo65263a(this.f66074b).mo65270a(this.f66073a.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.search.SearchAdBaseItemView$b */
    static final class C25038b implements C24939aj {

        /* renamed from: a */
        final /* synthetic */ SearchAdBaseItemView f66075a;

        /* renamed from: b */
        final /* synthetic */ AwemeRawAd f66076b;

        C25038b(SearchAdBaseItemView searchAdBaseItemView, AwemeRawAd awemeRawAd) {
            this.f66075a = searchAdBaseItemView;
            this.f66076b = awemeRawAd;
        }

        /* renamed from: a */
        public final void mo63403a(String str, String str2, long j) {
            C24958f.m81906a(str, str2, j).mo65276b("track_url").mo65266a("track_ad").mo65285g("show").mo65263a(this.f66076b).mo65270a(this.f66075a.getContext());
        }
    }

    /* renamed from: a */
    public View mo65518a(int i) {
        if (this.f66072c == null) {
            this.f66072c = new HashMap();
        }
        View view = (View) this.f66072c.get(Integer.valueOf(R.id.cl1));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cl1);
        this.f66072c.put(Integer.valueOf(R.id.cl1), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public final C25007p getAdModuleInfo() {
        return this.f66071b;
    }

    public final C0043i getLifecycleOwner() {
        return this.f66070a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0043i iVar = this.f66070a;
        if (iVar != null) {
            Lifecycle lifecycle = iVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo55a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0043i iVar = this.f66070a;
        if (iVar != null) {
            Lifecycle lifecycle = iVar.getLifecycle();
            if (lifecycle != null) {
                lifecycle.mo56b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setAdModuleInfo(C25007p pVar) {
        this.f66071b = pVar;
    }

    public final void setLifecycleOwner(C0043i iVar) {
        this.f66070a = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65519a(AwemeRawAd awemeRawAd) {
        C7573i.m23587b(awemeRawAd, "rawAd");
        C24962g.m81952a((C24939aj) new C25037a(this, awemeRawAd), awemeRawAd.getClickTrackUrlList(), true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65520b(AwemeRawAd awemeRawAd) {
        C7573i.m23587b(awemeRawAd, "rawAd");
        C24962g.m81952a((C24939aj) new C25038b(this, awemeRawAd), awemeRawAd.getTrackUrlList(), true);
    }
}
