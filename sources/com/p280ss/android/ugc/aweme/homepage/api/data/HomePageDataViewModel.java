package com.p280ss.android.ugc.aweme.homepage.api.data;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel */
public final class HomePageDataViewModel extends C0063u {

    /* renamed from: l */
    public static final C30241a f79561l = new C30241a(null);

    /* renamed from: a */
    public boolean f79562a;

    /* renamed from: b */
    public final C30245a f79563b = new C30245a();

    /* renamed from: c */
    public final Lock f79564c = new ReentrantLock();

    /* renamed from: d */
    public boolean f79565d;

    /* renamed from: e */
    public String f79566e;

    /* renamed from: f */
    public Aweme f79567f;

    /* renamed from: g */
    public C0052o<String> f79568g = new C0052o<>();

    /* renamed from: h */
    public String f79569h;

    /* renamed from: i */
    public Aweme f79570i;

    /* renamed from: j */
    public boolean f79571j;

    /* renamed from: k */
    public int f79572k = 1;

    /* renamed from: m */
    private C0052o<String> f79573m = new C0052o<>();

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$a */
    public static final class C30241a {

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel$a$a */
        public static final class C30242a implements C0067b {
            C30242a() {
            }

            /* renamed from: a */
            public final <T extends C0063u> T mo149a(Class<T> cls) {
                C7573i.m23587b(cls, "modelClass");
                return (C0063u) new HomePageDataViewModel();
            }
        }

        private C30241a() {
        }

        public /* synthetic */ C30241a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static HomePageDataViewModel m98909a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m160a(fragmentActivity, (C0067b) new C30242a()).mo147a(HomePageDataViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ataViewModel::class.java)");
            return (HomePageDataViewModel) a;
        }
    }

    /* renamed from: a */
    public static final HomePageDataViewModel m98904a(FragmentActivity fragmentActivity) {
        return C30241a.m98909a(fragmentActivity);
    }

    /* renamed from: a */
    public final String mo79692a() {
        return (String) this.f79573m.getValue();
    }

    /* renamed from: a */
    public final void mo79694a(Aweme aweme) {
        this.f79567f = aweme;
        if (aweme != null) {
            Aweme aweme2 = this.f79567f;
            if (aweme2 != null) {
                aweme2.setIsPreloadScroll(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo79695a(String str) {
        this.f79573m.setValue(str);
    }

    /* renamed from: a */
    public final void mo79693a(C0043i iVar, C0053p<String> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79573m.observe(iVar, pVar);
    }
}
