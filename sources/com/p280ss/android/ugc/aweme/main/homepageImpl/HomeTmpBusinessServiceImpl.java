package com.p280ss.android.ugc.aweme.main.homepageImpl;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24723e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C30241a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ViewPagerFlingEndEvent;
import com.p280ss.android.ugc.aweme.homepage.api.tmp.HomeTmpBusinessService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.homepageImpl.HomeTmpBusinessServiceImpl */
public final class HomeTmpBusinessServiceImpl implements HomeTmpBusinessService {

    /* renamed from: com.ss.android.ugc.aweme.main.homepageImpl.HomeTmpBusinessServiceImpl$a */
    static final class C33051a<T> implements C0053p<ViewPagerFlingEndEvent> {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f86021a;

        /* renamed from: b */
        final /* synthetic */ C24723e f86022b;

        C33051a(FragmentActivity fragmentActivity, C24723e eVar) {
            this.f86021a = fragmentActivity;
            this.f86022b = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(ViewPagerFlingEndEvent viewPagerFlingEndEvent) {
            if (C30246a.m98970a(this.f86021a).mo79723b("page_feed")) {
                this.f86022b.mo64717l();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.homepageImpl.HomeTmpBusinessServiceImpl$b */
    static final class C33052b<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ HomePageDataViewModel f86023a;

        /* renamed from: b */
        final /* synthetic */ ScrollSwitchStateManager f86024b;

        /* renamed from: c */
        final /* synthetic */ C24723e f86025c;

        C33052b(HomePageDataViewModel homePageDataViewModel, ScrollSwitchStateManager scrollSwitchStateManager, C24723e eVar) {
            this.f86023a = homePageDataViewModel;
            this.f86024b = scrollSwitchStateManager;
            this.f86025c = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (!this.f86023a.f79571j) {
                ScrollSwitchStateManager scrollSwitchStateManager = this.f86024b;
                if (num == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) num, "position!!");
                String a = scrollSwitchStateManager.mo79700a(num.intValue());
                Aweme aweme = this.f86023a.f79570i;
                CharSequence charSequence = a;
                if (!TextUtils.equals(charSequence, "page_profile") || aweme == null) {
                    if (TextUtils.equals(charSequence, "page_feed") && aweme != null) {
                        this.f86025c.mo64719n();
                    }
                    return;
                }
                this.f86025c.mo64718m();
            }
        }
    }

    public final void onCreateAfterInitView(FragmentActivity fragmentActivity, C24723e eVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(eVar, "adViewController");
        ScrollSwitchStateManager a = C30246a.m98970a(fragmentActivity);
        HomePageDataViewModel a2 = C30241a.m98909a(fragmentActivity);
        C0043i iVar = fragmentActivity;
        a.mo79737g(iVar, new C33051a(fragmentActivity, eVar));
        a.mo79731d(iVar, new C33052b(a2, a, eVar));
    }
}
