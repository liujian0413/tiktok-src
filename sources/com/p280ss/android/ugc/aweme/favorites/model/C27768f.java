package com.p280ss.android.ugc.aweme.favorites.model;

import com.p280ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.f */
final /* synthetic */ class C27768f implements Callable {

    /* renamed from: a */
    private final int f73211a;

    /* renamed from: b */
    private final int f73212b;

    C27768f(int i, int i2) {
        this.f73211a = i;
        this.f73212b = i2;
    }

    public final Object call() {
        return UserFavoritesApi.m90941b(this.f73211a, this.f73212b);
    }
}
