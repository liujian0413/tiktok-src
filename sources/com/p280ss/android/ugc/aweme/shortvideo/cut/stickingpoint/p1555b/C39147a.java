package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1555b;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.StickPointMusicAlg;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39194h;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.C39141a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.adapter.C39142b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1555b.C39157b.C39159b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39166d;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a */
public final class C39147a {

    /* renamed from: a */
    public static final C39147a f101501a = new C39147a();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a */
    public static final class C39148a implements C39159b {

        /* renamed from: a */
        final /* synthetic */ C39166d f101502a;

        /* renamed from: b */
        final /* synthetic */ AVMusic f101503b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$a */
        public static final class C39149a extends C39142b {

            /* renamed from: a */
            final /* synthetic */ C39148a f101504a;

            C39149a(C39148a aVar) {
                this.f101504a = aVar;
            }

            /* renamed from: b */
            public final void mo97307b(AVMusic aVMusic, boolean z) {
                C39166d dVar = this.f101504a.f101502a;
                if (dVar != null) {
                    dVar.mo97307b(aVMusic, z);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$b */
        public static final class C39150b extends C39142b {

            /* renamed from: a */
            final /* synthetic */ C39148a f101505a;

            C39150b(C39148a aVar) {
                this.f101505a = aVar;
            }

            /* renamed from: b */
            public final void mo97307b(AVMusic aVMusic, boolean z) {
                C39166d dVar = this.f101505a.f101502a;
                if (dVar != null) {
                    dVar.mo97307b(aVMusic, z);
                }
            }
        }

        C39148a(C39166d dVar, AVMusic aVMusic) {
            this.f101502a = dVar;
            this.f101503b = aVMusic;
        }

        /* renamed from: a */
        public final void mo97437a(StickPointMusicAlg stickPointMusicAlg, boolean z) {
            Boolean bool;
            if (z) {
                if (stickPointMusicAlg != null) {
                    bool = Boolean.valueOf(stickPointMusicAlg.existOnSetAlgFile());
                } else {
                    bool = null;
                }
                if (bool == null) {
                    C7573i.m23580a();
                }
                if (bool.booleanValue()) {
                    C39166d dVar = this.f101502a;
                    if (dVar != null) {
                        dVar.mo97307b(this.f101503b, true);
                    }
                } else {
                    C39147a.m124996a(this.f101503b, new C39149a(this));
                }
            } else {
                C39147a.m124996a(this.f101503b, new C39150b(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$b */
    public static final class C39151b extends C39141a {

        /* renamed from: a */
        final /* synthetic */ String f101506a;

        /* renamed from: b */
        final /* synthetic */ C39166d f101507b;

        /* renamed from: c */
        final /* synthetic */ AVMusic f101508c;

        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (!C7276d.m22812b(this.f101506a)) {
                C39166d dVar = this.f101507b;
                if (dVar != null) {
                    dVar.mo97306a(this.f101508c, false);
                }
                C39194h.m125150a(false, this.f101508c, (Exception) null);
                return;
            }
            C39166d dVar2 = this.f101507b;
            if (dVar2 != null) {
                dVar2.mo97306a(this.f101508c, true);
            }
            C39194h.m125150a(true, this.f101508c, (Exception) null);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            C39166d dVar = this.f101507b;
            if (dVar != null) {
                dVar.mo97306a(this.f101508c, false);
            }
            C39194h.m125150a(false, this.f101508c, (Exception) baseException);
        }

        C39151b(String str, C39166d dVar, AVMusic aVMusic) {
            this.f101506a = str;
            this.f101507b = dVar;
            this.f101508c = aVMusic;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$c */
    public static final class C39152c extends C39142b {

        /* renamed from: a */
        final /* synthetic */ C39166d f101509a;

        /* renamed from: b */
        final /* synthetic */ Context f101510b;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$c$a */
        public static final class C39153a extends C39142b {

            /* renamed from: a */
            final /* synthetic */ C39152c f101511a;

            C39153a(C39152c cVar) {
                this.f101511a = cVar;
            }

            /* renamed from: b */
            public final void mo97307b(AVMusic aVMusic, boolean z) {
                C39166d dVar = this.f101511a.f101509a;
                if (dVar != null) {
                    dVar.mo97307b(aVMusic, z);
                }
            }
        }

        C39152c(C39166d dVar, Context context) {
            this.f101509a = dVar;
            this.f101510b = context;
        }

        /* renamed from: a */
        public final void mo97306a(AVMusic aVMusic, boolean z) {
            if (z) {
                C39166d dVar = this.f101509a;
                if (dVar != null) {
                    dVar.mo97306a(aVMusic, true);
                }
                C39147a.m124997b(this.f101510b, aVMusic, new C39153a(this));
                return;
            }
            C39166d dVar2 = this.f101509a;
            if (dVar2 != null) {
                dVar2.mo97306a(aVMusic, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$d */
    public static final class C39154d implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ IFetchResourcesListener f101512a;

        C39154d(IFetchResourcesListener iFetchResourcesListener) {
            this.f101512a = iFetchResourcesListener;
        }

        public final void onFailed(Exception exc) {
            C7573i.m23587b(exc, "e");
            C39182e.m125095a(false);
            IFetchResourcesListener iFetchResourcesListener = this.f101512a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        public final void onSuccess(String[] strArr) {
            C7573i.m23587b(strArr, "requirements");
            C39182e.m125095a(true);
            IFetchResourcesListener iFetchResourcesListener = this.f101512a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$e */
    static final class C39155e<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f101513a;

        /* renamed from: b */
        final /* synthetic */ String f101514b;

        C39155e(String str, String str2) {
            this.f101513a = str;
            this.f101514b = str2;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m125005a());
        }

        /* renamed from: a */
        private boolean m125005a() {
            String str = this.f101513a;
            if (str == null) {
                C7573i.m23580a();
            }
            String str2 = this.f101514b;
            if (str2 == null) {
                C7573i.m23580a();
            }
            if (VEUtils.getMusicDefaultAlgorithm(str, str2) == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$f */
    static final class C39156f<TTaskResult, TContinuationResult> implements C1591g<Boolean, Object> {

        /* renamed from: a */
        final /* synthetic */ C39142b f101515a;

        /* renamed from: b */
        final /* synthetic */ AVMusic f101516b;

        C39156f(C39142b bVar, AVMusic aVMusic) {
            this.f101515a = bVar;
            this.f101516b = aVMusic;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Boolean> hVar) {
            if (hVar == null || !((Boolean) hVar.mo6890e()).booleanValue()) {
                C39142b bVar = this.f101515a;
                if (bVar != null) {
                    bVar.mo97307b(this.f101516b, false);
                }
            } else {
                C39142b bVar2 = this.f101515a;
                if (bVar2 != null) {
                    bVar2.mo97307b(this.f101516b, true);
                }
            }
            return null;
        }
    }

    private C39147a() {
    }

    /* renamed from: a */
    public static void m124995a(IFetchResourcesListener iFetchResourcesListener) {
        if (C39182e.m125104g()) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).fetchResourcesNeededByRequirements(new String[]{"VideoMontage"}, new C39154d(iFetchResourcesListener));
        } else if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onFailed(null);
        }
    }

    /* renamed from: a */
    public static void m124996a(AVMusic aVMusic, C39142b bVar) {
        String c = C39182e.m125100c(aVMusic);
        String b = C39182e.m125097b(aVMusic);
        if (!C7276d.m22812b(c)) {
            bVar.mo97307b(aVMusic, false);
        } else if (TextUtils.isEmpty(b)) {
            bVar.mo97307b(aVMusic, false);
        } else {
            C1592h.m7853a((Callable<TResult>) new C39155e<TResult>(c, b)).mo6876a((C1591g<TResult, TContinuationResult>) new C39156f<TResult,TContinuationResult>(bVar, aVMusic), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo97436a(Context context, AVMusic aVMusic, C39166d dVar) {
        m124998c(context, aVMusic, new C39152c(dVar, context));
    }

    /* renamed from: b */
    public static void m124997b(Context context, AVMusic aVMusic, C39166d dVar) {
        if (context == null || aVMusic == null || aVMusic.getStickPointMusicAlg() == null) {
            dVar.mo97307b(aVMusic, false);
        } else {
            new C39157b().mo97439a(new C39148a(dVar, aVMusic)).mo97441a(context, aVMusic.getStickPointMusicAlg());
        }
    }

    /* renamed from: c */
    private final void m124998c(Context context, AVMusic aVMusic, C39166d dVar) {
        if (context == null || aVMusic == null || TextUtils.isEmpty(aVMusic.getPath())) {
            dVar.mo97306a(aVMusic, false);
            return;
        }
        String c = C39182e.m125100c(aVMusic);
        if (C7276d.m22812b(c)) {
            dVar.mo97306a(aVMusic, true);
        } else {
            m124994a(context, aVMusic.getPath(), c, new C39151b(c, dVar, aVMusic));
        }
    }

    /* renamed from: a */
    public static void m124994a(Context context, String str, String str2, C39141a aVar) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            aVar.onFailed(new DownloadInfo((Cursor) null), new BaseException());
        } else if (C7276d.m22812b(str2)) {
            aVar.onSuccessed(new DownloadInfo((Cursor) null));
        } else {
            File file = new File(str2);
            DownloadTask ignoreDataVerify = Downloader.with(context).url(str).ignoreDataVerify(true);
            StringBuilder sb = new StringBuilder();
            sb.append(file.getParent());
            sb.append(File.separator);
            ignoreDataVerify.savePath(sb.toString()).name(file.getName()).mainThreadListener(aVar).download();
        }
    }
}
