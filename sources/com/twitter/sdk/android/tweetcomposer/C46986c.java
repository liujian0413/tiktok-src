package com.twitter.sdk.android.tweetcomposer;

import java.util.Collections;

/* renamed from: com.twitter.sdk.android.tweetcomposer.c */
final class C46986c implements C46985b {

    /* renamed from: a */
    private final C46992i f120556a;

    /* renamed from: a */
    public final void mo118156a() {
        this.f120556a.mo118162a(C46995k.f120563a.mo118038d("").mo118039e("").mo118040f("impression").mo118035a(), Collections.EMPTY_LIST);
    }

    C46986c(C46992i iVar) {
        if (iVar != null) {
            this.f120556a = iVar;
            return;
        }
        throw new NullPointerException("scribeClient must not be null");
    }

    /* renamed from: a */
    public final void mo118157a(String str) {
        this.f120556a.mo118162a(C46995k.f120563a.mo118038d("").mo118039e(str).mo118040f("click").mo118035a(), Collections.EMPTY_LIST);
    }
}
