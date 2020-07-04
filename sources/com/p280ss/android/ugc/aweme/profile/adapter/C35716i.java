package com.p280ss.android.ugc.aweme.profile.adapter;

import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.i */
final /* synthetic */ class C35716i extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f93667a = new C35716i();

    C35716i() {
    }

    public final String getName() {
        return "mediaMixOfFirstPage";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(MediaMixListState.class);
    }

    public final String getSignature() {
        return "getMediaMixOfFirstPage()Lcom/ss/android/ugc/aweme/profile/model/MediaMixList;";
    }

    public final Object get(Object obj) {
        return ((MediaMixListState) obj).getMediaMixOfFirstPage();
    }
}
