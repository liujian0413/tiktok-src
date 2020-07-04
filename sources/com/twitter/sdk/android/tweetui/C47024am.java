package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.C46908e;
import com.twitter.sdk.android.core.internal.scribe.C46908e.C46909a;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.core.models.C46959o;
import java.util.ArrayList;

/* renamed from: com.twitter.sdk.android.tweetui.am */
final class C47024am implements C47023al {

    /* renamed from: a */
    final C47029aq f120665a;

    /* renamed from: a */
    private static C46908e m147013a() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("tweet").mo118039e("actions").mo118040f("unfavorite").mo118035a();
    }

    /* renamed from: b */
    private static C46908e m147016b() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("tweet").mo118039e("actions").mo118040f("favorite").mo118035a();
    }

    /* renamed from: c */
    private static C46908e m147018c() {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("tweet").mo118039e("actions").mo118040f("share").mo118035a();
    }

    C47024am(C47029aq aqVar) {
        this.f120665a = aqVar;
    }

    /* renamed from: a */
    public final void mo118227a(C46959o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ScribeItem.fromTweet(oVar));
        this.f120665a.mo118234a(m147018c(), arrayList);
    }

    /* renamed from: b */
    public final void mo118230b(C46959o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ScribeItem.fromTweet(oVar));
        this.f120665a.mo118234a(m147016b(), arrayList);
    }

    /* renamed from: c */
    public final void mo118231c(C46959o oVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ScribeItem.fromTweet(oVar));
        this.f120665a.mo118234a(m147013a(), arrayList);
    }

    /* renamed from: a */
    private static C46908e m147014a(String str) {
        return new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("tweet").mo118038d(str).mo118039e("").mo118040f("click").mo118035a();
    }

    /* renamed from: b */
    private static C46908e m147017b(String str) {
        return new C46909a().mo118034a("android").mo118036b("tweet").mo118037c(str).mo118038d("").mo118039e("").mo118040f("impression").mo118035a();
    }

    /* renamed from: a */
    private static C46908e m147015a(String str, boolean z) {
        String str2;
        C46909a d = new C46909a().mo118034a("tfw").mo118036b("android").mo118037c("tweet").mo118038d(str);
        if (z) {
            str2 = "actions";
        } else {
            str2 = "";
        }
        return d.mo118039e(str2).mo118040f("impression").mo118035a();
    }

    /* renamed from: a */
    public final void mo118228a(C46959o oVar, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ScribeItem.fromTweet(oVar));
        this.f120665a.mo118234a(m147014a(str), arrayList);
    }

    /* renamed from: a */
    public final void mo118229a(C46959o oVar, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ScribeItem.fromTweet(oVar));
        this.f120665a.mo118234a(m147015a(str, z), arrayList);
        this.f120665a.mo118234a(m147017b(str), arrayList);
    }
}
