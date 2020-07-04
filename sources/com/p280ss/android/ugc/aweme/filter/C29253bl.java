package com.p280ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.LiveData;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g.C39375a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.bl */
public final class C29253bl implements C39375a {

    /* renamed from: a */
    private final AppCompatActivity f77172a;

    /* renamed from: a */
    public final LiveData<Boolean> mo74884a() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f77172a).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        LiveData<Boolean> j = ((ShortVideoContextViewModel) a).mo96181j();
        C7573i.m23582a((Object) j, "ViewModelProviders.of(ac…            .isNativeInit");
        return j;
    }

    /* renamed from: b */
    public final ShortVideoContext mo74885b() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f77172a).mo147a(ShortVideoContextViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…extViewModel::class.java)");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f99791a;
        C7573i.m23582a((Object) shortVideoContext, "ViewModelProviders.of(ac…       .shortVideoContext");
        return shortVideoContext;
    }

    public C29253bl(AppCompatActivity appCompatActivity) {
        C7573i.m23587b(appCompatActivity, "activity");
        this.f77172a = appCompatActivity;
    }
}
