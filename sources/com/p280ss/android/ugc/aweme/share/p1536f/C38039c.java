package com.p280ss.android.ugc.aweme.share.p1536f;

import android.net.Uri;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.ShortenUrlApi;
import com.p280ss.android.ugc.aweme.share.model.ShortenModel;
import com.p280ss.android.ugc.aweme.utils.C43101el;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7490k;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.share.f.c */
public final class C38039c {

    /* renamed from: a */
    public static final C38039c f99025a = new C38039c();

    /* renamed from: com.ss.android.ugc.aweme.share.f.c$a */
    static final class C38040a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C38040a f99026a = new C38040a();

        C38040a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m121408a((ShortenModel) obj);
        }

        /* renamed from: a */
        private static String m121408a(ShortenModel shortenModel) {
            C7573i.m23587b(shortenModel, "it");
            return shortenModel.getData();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.f.c$b */
    static final class C38041b<T, R> implements C7327h<Throwable, String> {

        /* renamed from: a */
        final /* synthetic */ String f99027a;

        C38041b(String str) {
            this.f99027a = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String apply(Throwable th) {
            C7573i.m23587b(th, "it");
            return this.f99027a;
        }
    }

    private C38039c() {
    }

    /* renamed from: b */
    private static void m121406b(String str) {
        C37984ap.m121302b().markLocalCommand(C6399b.m19921a(), str);
    }

    /* renamed from: a */
    public final C7490k<String> mo95676a(String str) {
        C7573i.m23587b(str, "origin");
        m121406b(str);
        if (C43101el.m136718a(str)) {
            Uri parse = Uri.parse(str);
            C7573i.m23582a((Object) parse, "uri");
            if (parse.isOpaque() || parse.getQueryParameterNames().isEmpty()) {
                C7490k<String> a = C7490k.m23239a(str);
                C7573i.m23582a((Object) a, "Maybe.just(origin)");
                return a;
            }
        }
        C7490k<String> b = ShortenUrlApi.m121241a(str, "musical_ly").mo19266a((C7327h<? super T, ? extends R>) C38040a.f99026a).mo19263a(3, TimeUnit.SECONDS).mo19275b((C7327h<? super Throwable, ? extends T>) new C38041b<Object,Object>(str)).mo19262a(2).mo19276b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "ShortenUrlApi.fetchShort…scribeOn(Schedulers.io())");
        return b;
    }
}
