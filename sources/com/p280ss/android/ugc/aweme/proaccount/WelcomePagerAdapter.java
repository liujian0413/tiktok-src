package com.p280ss.android.ugc.aweme.proaccount;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.base.p308ui.FragmentPagerRebuildAdapter;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct;
import com.p280ss.android.ugc.aweme.proaccount.ProWelcomePageFragment.C35638a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.proaccount.WelcomePagerAdapter */
public final class WelcomePagerAdapter<T> extends FragmentPagerRebuildAdapter<ProWelcomePageFragment> {

    /* renamed from: b */
    private final List<WelcomePageTextStruct> f93369b;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo60937a(Fragment fragment, int i) {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public ProWelcomePageFragment mo60939c(int i) {
        if (this.f93369b == null || this.f93369b.isEmpty()) {
            return C35638a.m115130a(i, true);
        }
        WelcomePageTextStruct welcomePageTextStruct = (WelcomePageTextStruct) this.f93369b.get(i);
        try {
            String imageUrl = welcomePageTextStruct.getImageUrl();
            C7573i.m23582a((Object) imageUrl, "pageInfo.imageUrl");
            String title = welcomePageTextStruct.getTitle();
            C7573i.m23582a((Object) title, "pageInfo.title");
            String description = welcomePageTextStruct.getDescription();
            C7573i.m23582a((Object) description, "pageInfo.description");
            Integer pageNum = welcomePageTextStruct.getPageNum();
            C7573i.m23582a((Object) pageNum, "pageInfo.pageNum");
            return C35638a.m115131a(imageUrl, title, description, pageNum.intValue(), false);
        } catch (NullValueException unused) {
            return C35638a.m115130a(i, true);
        }
    }

    public WelcomePagerAdapter(C0608j jVar, int i, List<WelcomePageTextStruct> list) {
        C7573i.m23587b(jVar, "fm");
        super(jVar, i);
        this.f93369b = list;
    }
}
