package com.p280ss.android.ugc.aweme.mediachoose;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.framework.services.IVideoLegalCheckerAndToastService;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33151b;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40132e;
import dmt.p1861av.video.C47440an;
import java.util.concurrent.TimeUnit;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.c */
public final class C33160c implements IVideoLegalCheckerAndToastService {

    /* renamed from: a */
    public final Context f86307a;

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$a */
    static final class C33161a extends Lambda implements C7563m<String, Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C1606i f86308a;

        C33161a(C1606i iVar) {
            this.f86308a = iVar;
            super(2);
        }

        /* renamed from: a */
        private void m107002a(String str, long j) {
            C7573i.m23587b(str, "checkerType");
            this.f86308a.mo6900a(Boolean.valueOf(true));
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m107002a((String) obj, ((Number) obj2).longValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$b */
    static final class C33162b extends Lambda implements C48007r<String, Long, Integer, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33160c f86309a;

        /* renamed from: b */
        final /* synthetic */ boolean f86310b;

        /* renamed from: c */
        final /* synthetic */ int f86311c;

        /* renamed from: d */
        final /* synthetic */ C7562b f86312d;

        /* renamed from: e */
        final /* synthetic */ C1606i f86313e;

        C33162b(C33160c cVar, boolean z, int i, C7562b bVar, C1606i iVar) {
            this.f86309a = cVar;
            this.f86310b = z;
            this.f86311c = i;
            this.f86312d = bVar;
            this.f86313e = iVar;
            super(4);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m107003a((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue(), (String) obj4);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m107003a(String str, long j, int i, String str2) {
            C7573i.m23587b(str, "checkerType");
            C7573i.m23587b(str2, "errorMsg");
            if (this.f86310b) {
                C40132e.m128287a(this.f86309a.f86307a, i, this.f86311c);
            }
            C7562b bVar = this.f86312d;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i));
            }
            this.f86313e.mo6900a(Boolean.valueOf(false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$c */
    static final class C33163c extends Lambda implements C7563m<String, Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7561a f86314a;

        C33163c(C7561a aVar) {
            this.f86314a = aVar;
            super(2);
        }

        /* renamed from: a */
        private void m107004a(String str, long j) {
            C7573i.m23587b(str, "checkerType");
            this.f86314a.invoke();
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m107004a((String) obj, ((Number) obj2).longValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.c$d */
    static final class C33164d extends Lambda implements C48007r<String, Long, Integer, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C33160c f86315a;

        /* renamed from: b */
        final /* synthetic */ boolean f86316b;

        /* renamed from: c */
        final /* synthetic */ int f86317c;

        /* renamed from: d */
        final /* synthetic */ C7562b f86318d;

        C33164d(C33160c cVar, boolean z, int i, C7562b bVar) {
            this.f86315a = cVar;
            this.f86316b = z;
            this.f86317c = i;
            this.f86318d = bVar;
            super(4);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m107005a((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue(), (String) obj4);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m107005a(String str, long j, int i, String str2) {
            C7573i.m23587b(str, "checkerType");
            C7573i.m23587b(str2, "errorMsg");
            if (this.f86316b) {
                C40132e.m128287a(this.f86315a.f86307a, i, this.f86317c);
            }
            C7562b bVar = this.f86318d;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(i));
            }
        }
    }

    public C33160c(Context context) {
        C7573i.m23587b(context, "context");
        this.f86307a = context;
    }

    /* renamed from: b */
    private static String m107001b(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return mediaMetadataRetriever.extractMetadata(12);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final MediaModel m106997a(String str) {
        int[] a = C47440an.m148109a(str);
        if (a == null) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f88156b = str;
        mediaModel.f88163i = a[0];
        mediaModel.f88164j = a[1];
        mediaModel.f88159e = (long) a[3];
        mediaModel.f88161g = m107001b(str);
        return mediaModel;
    }

    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z) {
        C7573i.m23587b(str, "videoPath");
        return isVideoLengthOrTypeSupportedAndShowErrToast(str, z, null);
    }

    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "videoPath");
        MediaModel a = m106997a(str);
        if (a != null) {
            return m106999a(this, a, z, 0, 0, bVar, 12, null);
        }
        return false;
    }

    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, C7561a<C7581n> aVar) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(aVar, "onSucess");
        MediaModel a = m106997a(str);
        if (a != null) {
            m106998a(a, z, i, aVar, null);
        }
    }

    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(str, "videoPath");
        MediaModel a = m106997a(str);
        if (a != null) {
            return m106999a(this, a, z, i, 0, bVar, 8, null);
        }
        return false;
    }

    /* renamed from: a */
    private final void m106998a(MediaModel mediaModel, boolean z, int i, C7561a<C7581n> aVar, C7562b<? super Integer, C7581n> bVar) {
        C33151b a = C33151b.m106967a();
        C7573i.m23582a((Object) a, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
        int i2 = a.f86289b;
        if (i <= 0) {
            C33151b a2 = C33151b.m106967a();
            C7573i.m23582a((Object) a2, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
            i = a2.f86290c;
        }
        new C33165d(this.f86307a).mo84891a(mediaModel, (long) i2, (long) i, new C33163c(aVar), new C33164d(this, z, i2, null));
    }

    /* renamed from: a */
    private final boolean m107000a(MediaModel mediaModel, boolean z, int i, long j, C7562b<? super Integer, C7581n> bVar) {
        int i2;
        C1606i iVar = new C1606i();
        C33151b a = C33151b.m106967a();
        C7573i.m23582a((Object) a, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
        int i3 = a.f86289b;
        if (i > 0) {
            i2 = i;
        } else {
            C33151b a2 = C33151b.m106967a();
            C7573i.m23582a((Object) a2, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
            i2 = a2.f86290c;
        }
        C33165d dVar = new C33165d(this.f86307a);
        long j2 = (long) i3;
        long j3 = (long) i2;
        C7563m aVar = new C33161a(iVar);
        C33162b bVar2 = new C33162b(this, z, i3, bVar, iVar);
        dVar.mo84891a(mediaModel, j2, j3, aVar, bVar2);
        try {
            iVar.f6010a.mo6878a(j, TimeUnit.MILLISECONDS);
            C1592h<TResult> hVar = iVar.f6010a;
            C7573i.m23582a((Object) hVar, "isLegalWaitTask.task");
            Boolean bool = (Boolean) hVar.mo6890e();
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ boolean m106999a(C33160c cVar, MediaModel mediaModel, boolean z, int i, long j, C7562b bVar, int i2, Object obj) {
        int i3;
        if ((i2 & 4) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            j = 1000;
        }
        return cVar.m107000a(mediaModel, z, i3, j, bVar);
    }
}
