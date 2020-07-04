package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1334b;

import android.view.Surface;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.C31944c;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.C31944c.C31946b;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.b.a */
public final class C31452a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82355a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31452a.class), "playManager", "getPlayManager()Lcom/ss/android/ugc/aweme/im/sdk/videofileplay/TTVideoPlayerManager;"))};

    /* renamed from: b */
    private final C7541d f82356b = C7546e.m23569a(C31453a.f82358a);

    /* renamed from: c */
    private MediaModel f82357c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.b.a$a */
    static final class C31453a extends Lambda implements C7561a<C31944c> {

        /* renamed from: a */
        public static final C31453a f82358a = new C31453a();

        C31453a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m102295a();
        }

        /* renamed from: a */
        private static C31944c m102295a() {
            return new C31944c(C6399b.m19921a(), false, 2, null);
        }
    }

    /* renamed from: b */
    private final C31944c m102286b() {
        return (C31944c) this.f82356b.getValue();
    }

    /* renamed from: a */
    public final void mo82056a() {
        m102286b().mo82789d();
        this.f82357c = null;
    }

    /* renamed from: e */
    public final boolean mo82063e(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        if (this.f82357c == mediaModel) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo82057a(Surface surface) {
        C7573i.m23587b(surface, "surface");
        m102286b().mo82783a(surface);
    }

    /* renamed from: b */
    public final void mo82060b(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        if (this.f82357c == mediaModel) {
            m102286b().mo82785b();
        }
    }

    /* renamed from: c */
    public final void mo82061c(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        if (this.f82357c == mediaModel) {
            this.f82357c = null;
            m102286b().mo82787c();
        }
    }

    /* renamed from: d */
    public final boolean mo82062d(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        if (this.f82357c != mediaModel || !m102286b().mo82791e()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo82058a(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        if (this.f82357c != mediaModel) {
            C31944c b = m102286b();
            StringBuilder sb = new StringBuilder("file://");
            sb.append(mediaModel.getFilePath());
            b.mo82790d(sb.toString());
            this.f82357c = mediaModel;
        }
        m102286b().mo82782a();
    }

    /* renamed from: a */
    public final void mo82059a(C31946b bVar) {
        C7573i.m23587b(bVar, "listener");
        m102286b().mo82784a(bVar);
    }
}
