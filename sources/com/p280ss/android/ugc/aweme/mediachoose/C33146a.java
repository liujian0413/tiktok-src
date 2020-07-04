package com.p280ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.medialib.FFMpegManager;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C43137g;
import com.p280ss.android.ugc.aweme.utils.C43137g.C43138a;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.a */
public final class C33146a implements C33185q {

    /* renamed from: a */
    private boolean f86274a = true;

    /* renamed from: b */
    private String f86275b = "";

    /* renamed from: c */
    private final Context f86276c;

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a$a */
    static final class C33147a extends Lambda implements C48006q<String, Long, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C48007r f86277a;

        C33147a(C48007r rVar) {
            this.f86277a = rVar;
            super(3);
        }

        /* renamed from: a */
        public final void mo84894a(String str, long j, int i) {
            C7573i.m23587b(str, "checkerType");
            this.f86277a.invoke(str, Long.valueOf(j), Integer.valueOf(i), "");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo84894a((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a$b */
    static final class C33148b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f86278a;

        /* renamed from: b */
        final /* synthetic */ long f86279b;

        /* renamed from: c */
        final /* synthetic */ long f86280c;

        C33148b(MediaModel mediaModel, long j, long j2) {
            this.f86278a = mediaModel;
            this.f86279b = j;
            this.f86280c = j2;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m106964a());
        }

        /* renamed from: a */
        private int m106964a() {
            return FFMpegManager.m64569a().mo51825a(this.f86278a.f88156b, this.f86279b, this.f86280c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.a$c */
    static final class C33149c<TTaskResult, TContinuationResult> implements C1591g<Integer, Void> {

        /* renamed from: a */
        final /* synthetic */ C33146a f86281a;

        /* renamed from: b */
        final /* synthetic */ C41653c f86282b;

        /* renamed from: c */
        final /* synthetic */ MediaModel f86283c;

        /* renamed from: d */
        final /* synthetic */ C7563m f86284d;

        /* renamed from: e */
        final /* synthetic */ long f86285e;

        /* renamed from: f */
        final /* synthetic */ C33147a f86286f;

        C33149c(C33146a aVar, C41653c cVar, MediaModel mediaModel, C7563m mVar, long j, C33147a aVar2) {
            this.f86281a = aVar;
            this.f86282b = cVar;
            this.f86283c = mediaModel;
            this.f86284d = mVar;
            this.f86285e = j;
            this.f86286f = aVar2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Integer> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            Integer num = (Integer) hVar.mo6890e();
            if (this.f86282b != null) {
                C42951au.m136343b(this.f86282b);
            }
            if (C7573i.m23576a(num.intValue(), 0) >= 0) {
                if (C7573i.m23576a(num.intValue(), 0) > 0) {
                    this.f86283c.f88159e = (long) num.intValue();
                }
                this.f86284d.invoke(C33146a.m106958a(), Long.valueOf(System.currentTimeMillis() - this.f86285e));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(C33146a.m106958a());
                sb.append(" ImportError:");
                sb.append(num);
                C41530am.m132280a(sb.toString());
                C33147a aVar = this.f86286f;
                String a = C33146a.m106958a();
                long currentTimeMillis = System.currentTimeMillis() - this.f86285e;
                C7573i.m23582a((Object) num, "result");
                aVar.mo84894a(a, currentTimeMillis, num.intValue());
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m106958a() {
        return "Editor1VideoLegalChecker";
    }

    /* renamed from: b */
    private boolean m106959b() {
        return this.f86274a;
    }

    /* renamed from: a */
    public final void mo84892a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f86275b = str;
    }

    /* renamed from: a */
    public final void mo84893a(boolean z) {
        this.f86274a = z;
    }

    public C33146a(Context context) {
        C7573i.m23587b(context, "context");
        this.f86276c = context;
    }

    /* renamed from: a */
    public final void mo84891a(MediaModel mediaModel, long j, long j2, C7563m<? super String, ? super Long, C7581n> mVar, C48007r<? super String, ? super Long, ? super Integer, ? super String, C7581n> rVar) {
        C41653c cVar;
        MediaModel mediaModel2 = mediaModel;
        C48007r<? super String, ? super Long, ? super Integer, ? super String, C7581n> rVar2 = rVar;
        C7573i.m23587b(mediaModel2, "mediaModel");
        C7573i.m23587b(mVar, "onSuccess");
        C7573i.m23587b(rVar2, "onError");
        C33147a aVar = new C33147a(rVar2);
        C43137g a = C43138a.m136839a();
        String str = mediaModel2.f88156b;
        C7573i.m23582a((Object) str, "mediaModel.filePath");
        a.mo104766a(str, MediaType.VIDEO);
        long currentTimeMillis = System.currentTimeMillis();
        if (m106959b()) {
            cVar = C41653c.m132582a(this.f86276c, this.f86276c.getString(R.string.d5j));
        } else {
            cVar = null;
        }
        C41653c cVar2 = cVar;
        C33148b bVar = new C33148b(mediaModel, j, j2);
        C1592h a2 = C1592h.m7853a((Callable<TResult>) bVar);
        C33149c cVar3 = new C33149c(this, cVar2, mediaModel, mVar, currentTimeMillis, aVar);
        a2.mo6876a((C1591g<TResult, TContinuationResult>) cVar3, C1592h.f5958b);
    }
}
