package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1334b;

import android.app.Activity;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.MediaPreviewActivity.C31434a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model.MediaPreviewSettings;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1333a.C31449a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.b.b */
public final class C31454b {

    /* renamed from: a */
    public static final C31454b f82359a = new C31454b();

    /* renamed from: b */
    private static C31449a f82360b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.b.b$a */
    static final class C31455a extends Lambda implements C7562b<MediaModel, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7561a f82361a;

        C31455a(C7561a aVar) {
            this.f82361a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102299a((MediaModel) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102299a(MediaModel mediaModel) {
            C7573i.m23587b(mediaModel, "it");
            this.f82361a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.b.b$b */
    static final class C31456b extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31449a f82362a;

        /* renamed from: b */
        final /* synthetic */ Activity f82363b;

        /* renamed from: c */
        final /* synthetic */ MediaPreviewSettings f82364c;

        /* renamed from: d */
        final /* synthetic */ int f82365d;

        C31456b(C31449a aVar, Activity activity, MediaPreviewSettings mediaPreviewSettings, int i) {
            this.f82362a = aVar;
            this.f82363b = activity;
            this.f82364c = mediaPreviewSettings;
            this.f82365d = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m102300a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102300a() {
            C31454b.m102298a(this.f82362a);
            C31434a.m102250a(this.f82363b, this.f82364c, this.f82365d);
        }
    }

    private C31454b() {
    }

    /* renamed from: a */
    public static C31449a m102296a() {
        C31449a aVar = f82360b;
        f82360b = null;
        return aVar;
    }

    /* renamed from: a */
    public static void m102298a(C31449a aVar) {
        f82360b = aVar;
    }

    /* renamed from: a */
    public static void m102297a(Activity activity, MediaPreviewSettings mediaPreviewSettings, C31449a aVar, int i) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(mediaPreviewSettings, "settings");
        C7573i.m23587b(aVar, "provider");
        C7561a bVar = new C31456b(aVar, activity, mediaPreviewSettings, AdError.CACHE_ERROR_CODE);
        MediaModel a = aVar.mo82050a();
        if (a != null) {
            a.accurateSize(false, new C31455a(bVar));
        } else {
            bVar.invoke();
        }
    }
}
