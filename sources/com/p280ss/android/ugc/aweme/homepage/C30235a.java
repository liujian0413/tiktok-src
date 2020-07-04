package com.p280ss.android.ugc.aweme.homepage;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.audio.AudioUtils;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C30241a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.homepage.api.tmp.HomeTmpBusinessService;
import com.p280ss.android.ugc.aweme.homepage.p1289a.C30238a;
import com.p280ss.android.ugc.aweme.homepage.p1289a.C30239b;
import com.p280ss.android.ugc.aweme.homepage.p1289a.C30240c;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.C30262a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.C30295j;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.p1292a.C30273b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment.C36120b;
import com.p280ss.android.ugc.aweme.video.C43310q;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.a */
public final class C30235a {

    /* renamed from: a */
    public HomePageDataViewModel f79553a;

    /* renamed from: b */
    public DataCenter f79554b;

    /* renamed from: c */
    public ScrollSwitchStateManager f79555c;

    /* renamed from: d */
    public C24723e f79556d = new C24723e();

    /* renamed from: e */
    private final C30254b f79557e = new C30254b();

    /* renamed from: f */
    private C30258e f79558f = new C30258e();

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$a */
    static final class C30236a<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ AmeSSActivity f79559a;

        C30236a(AmeSSActivity ameSSActivity) {
            this.f79559a = ameSSActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            C30273b.m99019a(this.f79559a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.a$b */
    static final class C30237b<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ C30235a f79560a;

        C30237b(C30235a aVar) {
            this.f79560a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            String str;
            Aweme aweme;
            String str2;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f79560a.f79555c;
            if (scrollSwitchStateManager == null) {
                C7573i.m23580a();
            }
            if (num == null) {
                C7573i.m23580a();
            }
            if (C7573i.m23585a((Object) "page_profile", (Object) scrollSwitchStateManager.mo79700a(num.intValue()))) {
                HomePageDataViewModel homePageDataViewModel = this.f79560a.f79553a;
                Aweme aweme2 = null;
                if (homePageDataViewModel != null) {
                    str = homePageDataViewModel.f79566e;
                } else {
                    str = null;
                }
                HomePageDataViewModel homePageDataViewModel2 = this.f79560a.f79553a;
                if (homePageDataViewModel2 != null) {
                    aweme = homePageDataViewModel2.f79567f;
                } else {
                    aweme = null;
                }
                if (aweme == null) {
                    str2 = "";
                } else {
                    HomePageDataViewModel homePageDataViewModel3 = this.f79560a.f79553a;
                    if (homePageDataViewModel3 != null) {
                        aweme2 = homePageDataViewModel3.f79567f;
                    }
                    if (aweme2 == null) {
                        C7573i.m23580a();
                    }
                    str2 = aweme2.getAid();
                }
                C36120b.m116332a(str, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo79687a(AmeSSActivity ameSSActivity) {
        C7573i.m23587b(ameSSActivity, "activity");
        this.f79558f.mo79769b();
        AudioUtils.m75906h(ameSSActivity);
        C30254b.m98983a(ameSSActivity);
    }

    /* renamed from: b */
    public final void mo79689b(AmeSSActivity ameSSActivity, Bundle bundle) {
        C7573i.m23587b(ameSSActivity, "activity");
        C30254b.m98985b(ameSSActivity, bundle);
        if (bundle != null) {
            HomePageDataViewModel homePageDataViewModel = this.f79553a;
            if (homePageDataViewModel != null) {
                homePageDataViewModel.f79562a = bundle.getBoolean("should_show_slide_setting");
            }
        }
    }

    /* renamed from: c */
    public final void mo79690c(AmeSSActivity ameSSActivity, Bundle bundle) {
        C7573i.m23587b(ameSSActivity, "activity");
        C30254b.m98986c(ameSSActivity, bundle);
        this.f79558f.mo79768a();
        C30262a.m99004b(ameSSActivity);
        C30262a.m99002a(ameSSActivity);
    }

    /* renamed from: a */
    public final void mo79688a(AmeSSActivity ameSSActivity, Bundle bundle) {
        C7573i.m23587b(ameSSActivity, "activity");
        C30239b.m98902a();
        C30254b.m98984a(ameSSActivity, bundle);
        FragmentActivity fragmentActivity = ameSSActivity;
        this.f79553a = C30241a.m98909a(fragmentActivity);
        this.f79554b = DataCenter.m75849a(C0069x.m159a(fragmentActivity), (C0043i) ameSSActivity);
        this.f79555c = C30246a.m98970a(fragmentActivity);
        C30295j.m99051a(fragmentActivity);
        C30240c.m98903a(fragmentActivity);
        C30257d.m98990a(fragmentActivity);
        C30238a.m98901a(ameSSActivity);
        AudioUtils.m75905g(ameSSActivity);
        C43310q.m137424b();
    }

    /* renamed from: d */
    public final void mo79691d(AmeSSActivity ameSSActivity, Bundle bundle) {
        Boolean bool;
        C7573i.m23587b(ameSSActivity, "activity");
        HomePageDataViewModel homePageDataViewModel = this.f79553a;
        if (homePageDataViewModel != null) {
            homePageDataViewModel.mo79695a("homepage_hot");
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.f79555c;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.mo79713a("page_feed", false);
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = this.f79555c;
        if (scrollSwitchStateManager2 != null) {
            scrollSwitchStateManager2.mo79703a((C0043i) ameSSActivity, (C0053p<Integer>) new C30236a<Integer>(ameSSActivity));
        }
        ScrollSwitchStateManager scrollSwitchStateManager3 = this.f79555c;
        if (scrollSwitchStateManager3 != null) {
            scrollSwitchStateManager3.mo79731d(ameSSActivity, new C30237b(this));
        }
        ((HomeTmpBusinessService) ServiceManager.get().getService(HomeTmpBusinessService.class)).onCreateAfterInitView(ameSSActivity, this.f79556d);
        HomePageDataViewModel homePageDataViewModel2 = this.f79553a;
        if (homePageDataViewModel2 != null) {
            bool = Boolean.valueOf(homePageDataViewModel2.f79562a);
        } else {
            bool = null;
        }
        if (bool == null) {
            C7573i.m23580a();
        }
        if (bool.booleanValue() && !C6399b.m19946v()) {
            ScrollSwitchStateManager scrollSwitchStateManager4 = this.f79555c;
            if (scrollSwitchStateManager4 != null) {
                scrollSwitchStateManager4.mo79740h("page_setting");
            }
        }
    }
}
