package com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Pair;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService;
import com.p280ss.android.vesdk.VEConstant.CODEC_ID;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.c */
public final class C31346c {

    /* renamed from: a */
    public static final C31346c f82131a = new C31346c();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.c$a */
    static final class C31347a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f82132a;

        C31347a(MediaModel mediaModel) {
            this.f82132a = mediaModel;
        }

        /* renamed from: a */
        private boolean m102065a() {
            return C31346c.m102061a(this.f82132a);
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m102065a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.c$b */
    static final class C31348b<TTaskResult, TContinuationResult> implements C1591g<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f82133a;

        C31348b(C7562b bVar) {
            this.f82133a = bVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m102066a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102066a(C1592h<Boolean> hVar) {
            C7562b bVar = this.f82133a;
            C7573i.m23582a((Object) hVar, "it");
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "it.result");
            bVar.invoke(e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.c$c */
    static final class C31349c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f82134a;

        C31349c(MediaModel mediaModel) {
            this.f82134a = mediaModel;
        }

        /* renamed from: a */
        private void m102067a() {
            C31346c.f82131a.mo81920c(this.f82134a);
        }

        public final /* synthetic */ Object call() {
            m102067a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.c$d */
    static final class C31350d<TTaskResult, TContinuationResult> implements C1591g<C7581n, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7561a f82135a;

        C31350d(C7561a aVar) {
            this.f82135a = aVar;
        }

        /* renamed from: a */
        private void m102068a(C1592h<C7581n> hVar) {
            this.f82135a.invoke();
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m102068a(hVar);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.c$e */
    static final class C31351e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f82136a;

        C31351e(MediaModel mediaModel) {
            this.f82136a = mediaModel;
        }

        /* renamed from: a */
        private boolean m102069a() {
            return C31346c.m102063b(this.f82136a);
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m102069a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.c$f */
    static final class C31352f<TTaskResult, TContinuationResult> implements C1591g<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f82137a;

        C31352f(C7562b bVar) {
            this.f82137a = bVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m102070a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102070a(C1592h<Boolean> hVar) {
            C7562b bVar = this.f82137a;
            C7573i.m23582a((Object) hVar, "it");
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "it.result");
            bVar.invoke(e);
        }
    }

    private C31346c() {
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m102058a(String str) {
        if (!new File(str).exists()) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    /* renamed from: b */
    public static boolean m102063b(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        if (!mediaModel.isVideo()) {
            return false;
        }
        int[] iArr = new int[10];
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService == null) {
            return true;
        }
        IImVideoCompileService imVideoCompileService = iAVService.getImVideoCompileService();
        String filePath = mediaModel.getFilePath();
        if (filePath == null) {
            C7573i.m23580a();
        }
        if (imVideoCompileService.getVideoFileInfoWithRotation(filePath, iArr)) {
            mediaModel.setWidth(iArr[0]);
            mediaModel.setHeight(iArr[1]);
            mediaModel.setResized(true);
            StringBuilder sb = new StringBuilder("MediaLegacyCheckHelper ensureVideoSizeInfoInternal success: ");
            sb.append(mediaModel.getWidth());
            sb.append(", ");
            sb.append(mediaModel.getHeight());
            C6921a.m21555a(sb.toString());
            return true;
        }
        C6921a.m21555a("MediaLegacyCheckHelper ensureVideoSizeInfoInternal failed");
        return false;
    }

    /* renamed from: c */
    public final void mo81920c(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "mediaModel");
        if (mediaModel.getFilePath() != null) {
            String filePath = mediaModel.getFilePath();
            if (filePath == null) {
                C7573i.m23580a();
            }
            Pair a = m102058a(filePath);
            if (a != null) {
                Object obj = a.first;
                C7573i.m23582a(obj, "it.first");
                mediaModel.setWidth(((Number) obj).intValue());
                Object obj2 = a.second;
                C7573i.m23582a(obj2, "it.second");
                mediaModel.setHeight(((Number) obj2).intValue());
                mediaModel.setResized(true);
            }
        }
    }

    /* renamed from: a */
    public static boolean m102061a(MediaModel mediaModel) {
        boolean z;
        if (!mediaModel.isVideo()) {
            MediaModel.accurateSize$default(mediaModel, true, null, 2, null);
            return true;
        }
        CharSequence filePath = mediaModel.getFilePath();
        if (filePath == null || filePath.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C6921a.m21555a("MediaLegacyCheckHelper checkInternal filePath invalid");
            return false;
        }
        int[] iArr = new int[10];
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService == null) {
            return true;
        }
        IImVideoCompileService imVideoCompileService = iAVService.getImVideoCompileService();
        String filePath2 = mediaModel.getFilePath();
        if (filePath2 == null) {
            C7573i.m23580a();
        }
        if (!imVideoCompileService.getVideoFileInfoWithRotation(filePath2, iArr)) {
            C6921a.m21555a("MediaLegacyCheckHelper checkInternal getVideoFileInfo failed");
            return true;
        }
        if (!(mediaModel.getWidth() == iArr[0] && mediaModel.getHeight() == iArr[1])) {
            mediaModel.setWidth(iArr[0]);
            mediaModel.setHeight(iArr[1]);
            mediaModel.setResized(true);
            StringBuilder sb = new StringBuilder("MediaLegacyCheckHelper checkInternal resize: [");
            sb.append(mediaModel.getWidth());
            sb.append(", ");
            sb.append(mediaModel.getHeight());
            C6921a.m21555a(sb.toString());
        }
        int i = iArr[8];
        int c = C7551d.m23566c(mediaModel.getWidth(), mediaModel.getHeight());
        int d = C7551d.m23567d(mediaModel.getWidth(), mediaModel.getHeight());
        if (d > 1100 && i != CODEC_ID.AV_CODEC_ID_H264.ordinal()) {
            C6921a.m21555a("MediaLegacyCheckHelper checkInternal 1080P not support H265");
            return false;
        } else if (d <= 2160 && c <= 4096) {
            return true;
        } else {
            C6921a.m21555a("MediaLegacyCheckHelper checkInternal not support 4K");
            return false;
        }
    }

    /* renamed from: b */
    public static void m102062b(MediaModel mediaModel, C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(mediaModel, "mediaModel");
        C7573i.m23587b(bVar, "callback");
        if (!mediaModel.isVideo()) {
            bVar.invoke(Boolean.valueOf(true));
        }
        C1592h.m7853a((Callable<TResult>) new C31351e<TResult>(mediaModel)).mo6876a((C1591g<TResult, TContinuationResult>) new C31352f<TResult,TContinuationResult>(bVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public static void m102059a(MediaModel mediaModel, C7561a<C7581n> aVar) {
        C7573i.m23587b(mediaModel, "mediaModel");
        C7573i.m23587b(aVar, "callback");
        if (!mediaModel.isImage()) {
            aVar.invoke();
        }
        C1592h.m7853a((Callable<TResult>) new C31349c<TResult>(mediaModel)).mo6876a((C1591g<TResult, TContinuationResult>) new C31350d<TResult,TContinuationResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public static void m102060a(MediaModel mediaModel, C7562b<? super Boolean, C7581n> bVar) {
        C7573i.m23587b(mediaModel, "mediaModel");
        C7573i.m23587b(bVar, "callback");
        C1592h.m7853a((Callable<TResult>) new C31347a<TResult>(mediaModel)).mo6876a((C1591g<TResult, TContinuationResult>) new C31348b<TResult,TContinuationResult>(bVar), C1592h.f5958b);
    }
}
