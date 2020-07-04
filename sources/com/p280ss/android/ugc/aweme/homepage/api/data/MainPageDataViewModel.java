package com.p280ss.android.ugc.aweme.homepage.api.data;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.view.View;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel */
public final class MainPageDataViewModel extends C0063u {

    /* renamed from: c */
    public static final C30243a f79574c = new C30243a(null);

    /* renamed from: a */
    public View f79575a;

    /* renamed from: b */
    public String f79576b = "homepage_hot";

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel$a */
    public static final class C30243a {

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel$a$a */
        public static final class C30244a implements C0067b {
            C30244a() {
            }

            /* renamed from: a */
            public final <T extends C0063u> T mo149a(Class<T> cls) {
                C7573i.m23587b(cls, "modelClass");
                return (C0063u) new MainPageDataViewModel();
            }
        }

        private C30243a() {
        }

        public /* synthetic */ C30243a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static MainPageDataViewModel m98913a(Fragment fragment) {
            C7573i.m23587b(fragment, "fragment");
            C0063u a = C0069x.m158a(fragment, (C0067b) new C30244a()).mo147a(MainPageDataViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…ataViewModel::class.java)");
            return (MainPageDataViewModel) a;
        }
    }

    /* renamed from: a */
    public static final MainPageDataViewModel m98911a(Fragment fragment) {
        return C30243a.m98913a(fragment);
    }

    /* renamed from: a */
    public final void mo79696a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f79576b = str;
    }
}
