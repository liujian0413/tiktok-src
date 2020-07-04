package com.p280ss.android.ugc.aweme.shortvideo.edit.p1564d;

import android.app.Activity;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IAVService.IFetchResourcesListener;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39558aj;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39561am;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39562an;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEListener.C45217m;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a */
public final class C39517a {

    /* renamed from: a */
    public int f102571a;

    /* renamed from: b */
    public String f102572b;

    /* renamed from: c */
    public C39558aj f102573c;

    /* renamed from: d */
    public VEVideoPublishEditViewModel f102574d;

    /* renamed from: e */
    public C39518a f102575e;

    /* renamed from: f */
    public boolean f102576f;

    /* renamed from: g */
    public int f102577g;

    /* renamed from: h */
    public final C45329l f102578h;

    /* renamed from: i */
    public C15389d f102579i;

    /* renamed from: j */
    private String f102580j;

    /* renamed from: k */
    private C39562an f102581k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$a */
    public interface C39518a {
        /* renamed from: a */
        void mo98372a();

        /* renamed from: a */
        void mo98373a(String str, C39558aj ajVar);

        /* renamed from: a */
        void mo98374a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$b */
    static final class C39519b implements C45329l {

        /* renamed from: a */
        final /* synthetic */ C39517a f102582a;

        C39519b(C39517a aVar) {
            this.f102582a = aVar;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i != 4098) {
                if (i == 4132) {
                    this.f102582a.f102576f = false;
                    this.f102582a.mo98370d();
                }
            } else if (this.f102582a.f102576f) {
                C1592h.m7855a((Callable<TResult>) new Callable<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C39519b f102583a;

                    {
                        this.f102583a = r1;
                    }

                    public final /* synthetic */ Object call() {
                        m126237a();
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m126237a() {
                        this.f102583a.f102582a.f102576f = false;
                        C0052o q = this.f102583a.f102582a.f102574d.mo119525q();
                        C7573i.m23582a((Object) q, "publishEditViewModel.infoStickerPinStatusLiveData");
                        q.setValue(Boolean.valueOf(false));
                        this.f102583a.f102582a.mo98371e();
                    }
                }, C1592h.f5958b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$c */
    static final class C39521c implements C45217m {

        /* renamed from: a */
        final /* synthetic */ C39517a f102584a;

        C39521c(C39517a aVar) {
            this.f102584a = aVar;
        }

        /* renamed from: a */
        public final void mo98376a(int i) {
            this.f102584a.f102579i.mo38879v();
            C39518a aVar = this.f102584a.f102575e;
            if (aVar != null) {
                aVar.mo98374a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$d */
    static final class C39522d implements C45217m {

        /* renamed from: a */
        final /* synthetic */ C39517a f102585a;

        C39522d(C39517a aVar) {
            this.f102585a = aVar;
        }

        /* renamed from: a */
        public final void mo98376a(int i) {
            this.f102585a.f102579i.mo38879v();
            ByteBuffer[] byteBufferArr = new ByteBuffer[1];
            this.f102585a.f102579i.mo38771a(this.f102585a.f102571a, byteBufferArr);
            C39561am.m126377a(this.f102585a.f102572b, byteBufferArr[0]);
            C39518a aVar = this.f102585a.f102575e;
            if (aVar != null) {
                aVar.mo98373a(this.f102585a.f102572b, this.f102585a.f102573c);
            }
            this.f102585a.f102579i.mo38831c(this.f102585a.f102578h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$e */
    public static final class C39523e implements IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C39517a f102586a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$e$a */
        static final class C39524a<V> implements Callable<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C39523e f102587a;

            C39524a(C39523e eVar) {
                this.f102587a = eVar;
            }

            public final /* synthetic */ Object call() {
                m126240a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m126240a() {
                this.f102587a.f102586a.f102576f = true;
                C0052o q = this.f102587a.f102586a.f102574d.mo119525q();
                C7573i.m23582a((Object) q, "publishEditViewModel.infoStickerPinStatusLiveData");
                q.setValue(Boolean.valueOf(true));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.d.a$e$b */
        static final class C39525b<TTaskResult, TContinuationResult> implements C1591g<C7581n, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C39523e f102588a;

            C39525b(C39523e eVar) {
                this.f102588a = eVar;
            }

            public final /* synthetic */ Object then(C1592h hVar) {
                m126241a(hVar);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m126241a(C1592h<C7581n> hVar) {
                int i;
                this.f102588a.f102586a.mo98367b();
                this.f102588a.f102586a.f102577g = this.f102588a.f102586a.f102579i.mo38862m();
                C15389d dVar = this.f102588a.f102586a.f102579i;
                int i2 = this.f102588a.f102586a.f102571a;
                C39558aj ajVar = this.f102588a.f102586a.f102573c;
                int i3 = 0;
                if (ajVar != null) {
                    i3 = ajVar.mo98472a(0);
                }
                C39558aj ajVar2 = this.f102588a.f102586a.f102573c;
                if (ajVar2 != null) {
                    i = ajVar2.mo98494c();
                } else {
                    i = this.f102588a.f102586a.f102579i.mo38860l();
                }
                dVar.mo38813b(i2, i3, i);
                this.f102588a.f102586a.f102579i.mo38866o(this.f102588a.f102586a.f102571a);
            }
        }

        C39523e(C39517a aVar) {
            this.f102586a = aVar;
        }

        public final void onFailed(Exception exc) {
            C7573i.m23587b(exc, "e");
            C39518a aVar = this.f102586a.f102575e;
            if (aVar != null) {
                aVar.mo98374a(true);
            }
        }

        public final void onSuccess(String[] strArr) {
            C7573i.m23587b(strArr, "requirements");
            C1592h.m7855a((Callable<TResult>) new C39524a<TResult>(this), C1592h.f5958b).mo6876a((C1591g<TResult, TContinuationResult>) new C39525b<TResult,TContinuationResult>(this), (Executor) C1592h.f5957a);
        }
    }

    /* renamed from: a */
    public final void mo98364a() {
        m126225a((IFetchResourcesListener) new C39523e(this));
    }

    /* renamed from: e */
    public final void mo98371e() {
        this.f102579i.mo38764a(0, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, (C45217m) new C39522d(this));
    }

    /* renamed from: c */
    public final void mo98369c() {
        if (this.f102581k != null) {
            C39562an anVar = this.f102581k;
            if (anVar != null && anVar.isShowing()) {
                C39562an anVar2 = this.f102581k;
                if (anVar2 != null) {
                    anVar2.dismiss();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo98370d() {
        this.f102579i.mo38869p(this.f102571a);
        this.f102579i.mo38764a(this.f102577g, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, (C45217m) new C39521c(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0013  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98367b() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj r0 = r2.f102573c
            r1 = 0
            if (r0 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r0 = r0.f102708c
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r0.pinAlgorithmFile
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            boolean r0 = com.p280ss.android.ugc.aweme.shortvideo.C38527bf.m123172a(r0)
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj r0 = r2.f102573c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r0 = r0.f102708c
            if (r0 == 0) goto L_0x001d
            java.lang.String r1 = r0.pinAlgorithmFile
        L_0x001d:
            com.p280ss.android.ugc.aweme.video.C7276d.m22816c(r1)
        L_0x0020:
            java.lang.String r0 = com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39561am.m126375a()
            r2.f102572b = r0
            java.lang.String r0 = r2.f102572b
            r1 = 1
            com.p280ss.android.ugc.aweme.video.C7276d.m22803a(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.aj r0 = r2.f102573c
            if (r0 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r0 = r0.f102708c
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = r2.f102572b
            r0.setPinAlgorithmFile(r1)
            return
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.p1564d.C39517a.mo98367b():void");
    }

    /* renamed from: a */
    private static void m126225a(IFetchResourcesListener iFetchResourcesListener) {
        C7573i.m23587b(iFetchResourcesListener, "listener");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).fetchResourcesNeededByRequirements(new String[]{"objectTracking"}, iFetchResourcesListener);
    }

    /* renamed from: a */
    public final void mo98365a(Context context) {
        if (context != null) {
            if (this.f102581k == null) {
                this.f102581k = new C39562an(context);
            }
            C39562an anVar = this.f102581k;
            if (anVar == null || !anVar.isShowing()) {
                C39562an anVar2 = this.f102581k;
                if (anVar2 != null) {
                    anVar2.show();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo98366a(C39558aj ajVar) {
        C7573i.m23587b(ajVar, "item");
        this.f102579i.mo38869p(ajVar.f102708c.f83875id);
    }

    /* renamed from: b */
    public final void mo98368b(C39558aj ajVar) {
        C7573i.m23587b(ajVar, "item");
        this.f102580j = ajVar.f102708c.path;
        this.f102571a = ajVar.f102708c.f83875id;
        this.f102573c = ajVar;
        this.f102579i.mo38832c(false);
        this.f102579i.mo38824b(this.f102578h);
        C39518a aVar = this.f102575e;
        if (aVar != null) {
            aVar.mo98372a();
        }
    }

    public C39517a(C15389d dVar, Context context) {
        C7573i.m23587b(dVar, "veEditor");
        C7573i.m23587b(context, "context");
        this.f102579i = dVar;
        Activity a = C37299a.m119788a(context);
        if (a != null) {
            C0063u a2 = C0069x.m159a((FragmentActivity) a).mo147a(VEVideoPublishEditViewModel.class);
            C7573i.m23582a((Object) a2, "ViewModelProviders.of(co…ditViewModel::class.java)");
            this.f102574d = (VEVideoPublishEditViewModel) a2;
            this.f102578h = new C39519b(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
