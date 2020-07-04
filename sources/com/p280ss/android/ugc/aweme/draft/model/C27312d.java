package com.p280ss.android.ugc.aweme.draft.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.ugc.aweme.effect.EffectListModel;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.filter.C29296g;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext.C34822a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.status.StatusCreateVideoData;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.draft.model.d */
public final class C27312d {

    /* renamed from: com.ss.android.ugc.aweme.draft.model.d$a */
    static final class C27313a implements C34822a {

        /* renamed from: a */
        final /* synthetic */ OnVideoCoverCallback f72058a;

        C27313a(OnVideoCoverCallback onVideoCoverCallback) {
            this.f72058a = onVideoCoverCallback;
        }

        /* renamed from: a */
        public final void mo70305a(final Bitmap bitmap, int i, int i2) {
            C1592h.m7855a((Callable<TResult>) new Callable<C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27313a f72059a;

                {
                    this.f72059a = r1;
                }

                public final /* synthetic */ Object call() {
                    m89570a();
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m89570a() {
                    Bitmap bitmap = bitmap;
                    if (bitmap != null) {
                        if (!(!bitmap.isRecycled())) {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            this.f72059a.f72058a.onGetVideoCoverSuccess(bitmap);
                            return;
                        }
                    }
                    this.f72059a.f72058a.onGetVideoCoverFailed(-1);
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.draft.model.d$b */
    public static final class C27315b implements OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ OnVideoCoverCallback f72061a;

        /* renamed from: com.ss.android.ugc.aweme.draft.model.d$b$a */
        static final class C27316a<V> implements Callable<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C27315b f72062a;

            /* renamed from: b */
            final /* synthetic */ int f72063b;

            C27316a(C27315b bVar, int i) {
                this.f72062a = bVar;
                this.f72063b = i;
            }

            public final /* synthetic */ Object call() {
                m89571a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m89571a() {
                this.f72062a.f72061a.onGetVideoCoverFailed(this.f72063b);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.draft.model.d$b$b */
        static final class C27317b<V> implements Callable<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C27315b f72064a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f72065b;

            C27317b(C27315b bVar, Bitmap bitmap) {
                this.f72064a = bVar;
                this.f72065b = bitmap;
            }

            public final /* synthetic */ Object call() {
                m89572a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m89572a() {
                this.f72064a.f72061a.onGetVideoCoverSuccess(this.f72065b);
            }
        }

        C27315b(OnVideoCoverCallback onVideoCoverCallback) {
            this.f72061a = onVideoCoverCallback;
        }

        public final void onGetVideoCoverFailed(int i) {
            C1592h.m7855a((Callable<TResult>) new C27316a<TResult>(this, i), C1592h.f5958b);
        }

        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C7573i.m23587b(bitmap, "bitmap");
            C1592h.m7855a((Callable<TResult>) new C27317b<TResult>(this, bitmap), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    private static int m89560a(String str) {
        C7573i.m23587b(str, "$this$videoValidity");
        File file = new File(str);
        if (!file.exists()) {
            return -1;
        }
        if (file.length() <= 0) {
            return -9;
        }
        return 0;
    }

    /* renamed from: b */
    public static final String m89562b(C27311c cVar) {
        C7573i.m23587b(cVar, "$this$allVideoPath");
        if (cVar.f72034c != null) {
            PhotoMovieContext photoMovieContext = cVar.f72034c;
            if (photoMovieContext == null) {
                C7573i.m23580a();
            }
            String str = photoMovieContext.mFinalVideoTmpPath;
            C7573i.m23582a((Object) str, "photoMovieContext!!.mFinalVideoTmpPath");
            return str;
        } else if (cVar.mo70214ac() == null) {
            return "";
        } else {
            EditPreviewInfo ac = cVar.mo70214ac();
            C7573i.m23582a((Object) ac, "previewInfo");
            return C39692a.m127022a(ac);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r4 == null) goto L_0x0072;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m89559a(com.p280ss.android.ugc.aweme.draft.model.C27311c r6) {
        /*
            java.lang.String r0 = "$this$videoValidity"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r0 = r6.f72034c
            if (r0 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.photomovie.PhotoMovieContext r6 = r6.f72034c
            if (r6 != 0) goto L_0x0010
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0010:
            java.lang.String r6 = r6.mFinalVideoTmpPath
            java.lang.String r0 = "photoMovieContext!!.mFinalVideoTmpPath"
            kotlin.jvm.internal.C7573i.m23582a(r6, r0)
            int r6 = m89560a(r6)
            return r6
        L_0x001c:
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r6.mo70214ac()
            r1 = 0
            if (r0 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r6.mo70214ac()
            java.util.List r0 = r0.getVideoList()
            int r0 = r0.size()
            r2 = 0
        L_0x0030:
            if (r2 >= r0) goto L_0x0080
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r3 = r6.mo70214ac()
            java.util.List r3 = r3.getVideoList()
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r3 = (com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r3
            java.io.File r4 = new java.io.File
            java.lang.String r5 = r3.getVideoPath()
            r4.<init>(r5)
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x0072
            java.util.List r4 = r6.mo70222ak()
            if (r4 == 0) goto L_0x0072
            int r5 = r4.size()
            if (r5 <= r2) goto L_0x005d
            r5 = 1
            goto L_0x005e
        L_0x005d:
            r5 = 0
        L_0x005e:
            if (r5 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r4.get(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r4 = (com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r4
            if (r4 == 0) goto L_0x0072
            java.lang.String r4 = r4.getVideoPath()
            if (r4 != 0) goto L_0x0076
        L_0x0072:
            java.lang.String r4 = r3.getVideoPath()
        L_0x0076:
            int r3 = m89560a(r4)
            if (r3 == 0) goto L_0x007d
            return r3
        L_0x007d:
            int r2 = r2 + 1
            goto L_0x0030
        L_0x0080:
            return r1
        L_0x0081:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.draft.model.C27312d.m89559a(com.ss.android.ugc.aweme.draft.model.c):int");
    }

    /* renamed from: c */
    public static final Set<String> m89564c(C27311c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C7573i.m23587b(cVar, "$this$cleanerWhiteSet");
        HashSet hashSet = new HashSet();
        String calculateDraftDir = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().calculateDraftDir(cVar);
        if (calculateDraftDir != null) {
            Boolean.valueOf(hashSet.add(calculateDraftDir));
        }
        String str = cVar.f72031S.f71951O;
        if (str != null) {
            Boolean.valueOf(hashSet.add(str));
        }
        if (cVar.f72042k != 0) {
            Object service = ServiceManager.get().getService(IAVService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
            C29296g a = ((IAVService) service).getFilterService().mo74857a(cVar.f72042k);
            C7573i.m23582a((Object) a, "ServiceManager.get().get…       .getFilter(filter)");
            String b = a.mo74978b();
            if (b != null) {
                Boolean.valueOf(hashSet.add(b));
            }
        }
        String ai = cVar.mo70220ai();
        if (ai != null) {
            Boolean.valueOf(hashSet.add(ai));
        }
        C27320g ag = cVar.mo70218ag();
        if (ag != null) {
            String str2 = ag.f72080d;
            if (str2 != null) {
                Boolean.valueOf(hashSet.add(str2));
            }
        }
        String str3 = cVar.f72038g;
        boolean z12 = false;
        if (str3 != null) {
            if (str3.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                str3 = null;
            }
            if (str3 != null) {
                Boolean.valueOf(hashSet.add(str3));
            }
        }
        EffectListModel effectListModel = cVar.f72014B;
        if (effectListModel != null) {
            ArrayList effectPointModels = effectListModel.getEffectPointModels();
            if (effectPointModels != null) {
                List<EffectPointModel> e = C7525m.m23510e(effectPointModels);
                if (e != null) {
                    for (EffectPointModel resDir : e) {
                        String resDir2 = resDir.getResDir();
                        if (resDir2 != null) {
                            Boolean.valueOf(hashSet.add(resDir2));
                        }
                    }
                }
            }
        }
        String l = cVar.mo70275l();
        if (l != null) {
            Boolean.valueOf(hashSet.add(l));
        }
        MvCreateVideoData Q = cVar.mo70175Q();
        if (Q != null) {
            ArrayList<String> arrayList = Q.selectMediaList;
            if (arrayList != null) {
                List<String> e2 = C7525m.m23510e(arrayList);
                if (e2 != null) {
                    for (String add : e2) {
                        hashSet.add(add);
                    }
                }
            }
        }
        MvCreateVideoData Q2 = cVar.mo70175Q();
        if (Q2 != null) {
            String str4 = Q2.videoCoverImgPath;
            if (str4 != null) {
                Boolean.valueOf(hashSet.add(str4));
            }
        }
        StatusCreateVideoData R = cVar.mo70176R();
        if (R != null) {
            String videoCoverImgPath = R.getVideoCoverImgPath();
            if (videoCoverImgPath != null) {
                Boolean.valueOf(hashSet.add(videoCoverImgPath));
            }
        }
        StatusCreateVideoData R2 = cVar.mo70176R();
        if (R2 != null) {
            CharSequence effectPath = R2.getEffectPath();
            if (effectPath == null || effectPath.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                R2 = null;
            }
            if (R2 != null) {
                Boolean.valueOf(hashSet.add(new File(R2.getEffectPath()).getAbsolutePath()));
            }
        }
        StatusCreateVideoData R3 = cVar.mo70176R();
        if (R3 != null) {
            String bgPath = R3.getBgPath();
            if (bgPath != null) {
                Boolean.valueOf(hashSet.add(bgPath));
            }
        }
        StatusCreateVideoData R4 = cVar.mo70176R();
        if (R4 != null) {
            String musicPath = R4.getMusicPath();
            if (musicPath != null) {
                Boolean.valueOf(hashSet.add(musicPath));
            }
        }
        PhotoMovieContext photoMovieContext = cVar.f72034c;
        if (photoMovieContext != null) {
            CharSequence charSequence = photoMovieContext.mFinalVideoTmpPath;
            if (charSequence == null || charSequence.length() == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!(!z9)) {
                photoMovieContext = null;
            }
            if (photoMovieContext != null) {
                Boolean.valueOf(hashSet.add(photoMovieContext.mFinalVideoTmpPath));
            }
        }
        PhotoMovieContext photoMovieContext2 = cVar.f72034c;
        if (photoMovieContext2 != null) {
            String str5 = photoMovieContext2.mMusicPath;
            if (str5 != null) {
                Boolean.valueOf(hashSet.add(str5));
            }
        }
        PhotoMovieContext photoMovieContext3 = cVar.f72034c;
        if (!(photoMovieContext3 == null || photoMovieContext3.mFilterPath == null)) {
            PhotoMovieContext photoMovieContext4 = cVar.f72034c;
            if (photoMovieContext4 != null) {
                int i = photoMovieContext4.mFilterId;
                Object service2 = ServiceManager.get().getService(IAVService.class);
                C7573i.m23582a(service2, "ServiceManager.get().get…e(IAVService::class.java)");
                hashSet.add(((IAVService) service2).getFilterService().mo74863d(i));
            }
        }
        EditPreviewInfo ac = cVar.mo70214ac();
        if (ac != null) {
            String draftDir = ac.getDraftDir();
            if (draftDir.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                draftDir = null;
            }
            if (draftDir != null) {
                Boolean.valueOf(hashSet.add(draftDir));
            }
            for (EditVideoSegment editVideoSegment : ac.getVideoList()) {
                String videoPath = editVideoSegment.getVideoPath();
                if (videoPath.length() > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    videoPath = null;
                }
                if (videoPath != null) {
                    hashSet.add(videoPath);
                    String a2 = C6306c.m19561a(videoPath);
                    CharSequence charSequence2 = a2;
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        a2 = null;
                    }
                    if (a2 != null) {
                        Boolean.valueOf(hashSet.add(a2));
                    }
                }
                String audioPath = editVideoSegment.getAudioPath();
                CharSequence charSequence3 = audioPath;
                if (charSequence3 == null || charSequence3.length() == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!(!z7)) {
                    audioPath = null;
                }
                if (audioPath != null) {
                    Boolean.valueOf(hashSet.add(audioPath));
                }
            }
            String[] reverseVideoArray = ac.getReverseVideoArray();
            if (reverseVideoArray != null) {
                for (String str6 : reverseVideoArray) {
                    if (str6.length() > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        str6 = null;
                    }
                    if (str6 != null) {
                        Boolean.valueOf(hashSet.add(str6));
                    }
                }
            }
            String[] reverseAudioArray = ac.getReverseAudioArray();
            if (reverseAudioArray != null) {
                for (String str7 : reverseAudioArray) {
                    if (str7.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        str7 = null;
                    }
                    if (str7 != null) {
                        Boolean.valueOf(hashSet.add(str7));
                    }
                }
            }
            String[] tempVideoArray = ac.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String str8 : tempVideoArray) {
                    if (str8.length() > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        Boolean.valueOf(hashSet.add(str8));
                    }
                }
            }
        }
        InfoStickerModel K = cVar.mo70169K();
        if (K != null) {
            List<StickerItemModel> list = K.stickers;
            if (list != null) {
                for (StickerItemModel stickerItemModel : list) {
                    if (stickerItemModel != null) {
                        String str9 = stickerItemModel.path;
                        if (str9 != null) {
                            if (str9.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                str9 = null;
                            }
                            if (str9 != null) {
                                Boolean.valueOf(hashSet.add(str9));
                            }
                        }
                    }
                }
            }
        }
        MvCreateVideoData Q3 = cVar.mo70175Q();
        if (Q3 != null) {
            CharSequence charSequence4 = Q3.mvResUnzipPath;
            if (charSequence4 == null || charSequence4.length() == 0) {
                z12 = true;
            }
            if (!(!z12)) {
                Q3 = null;
            }
            if (Q3 != null) {
                Boolean.valueOf(hashSet.add(new File(Q3.mvResUnzipPath).getAbsolutePath()));
            }
        }
        MvCreateVideoData Q4 = cVar.mo70175Q();
        if (Q4 != null) {
            String str10 = Q4.contactVideoPath;
            if (str10 != null) {
                Boolean.valueOf(hashSet.add(str10));
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    private static final void m89563b(C27311c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        PhotoMovieContext photoMovieContext = cVar.f72034c;
        if (photoMovieContext != null) {
            photoMovieContext.getPhotoMovieCover(new C27313a(onVideoCoverCallback));
        } else {
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
        }
    }

    /* renamed from: c */
    private static final void m89565c(C27311c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        String V = cVar.mo70180V();
        if (V != null) {
            if (!C7276d.m22812b(V)) {
                V = null;
            }
            if (V != null) {
                Bitmap decodeFile = BitmapFactory.decodeFile(cVar.mo70180V());
                if (decodeFile != null) {
                    if (!(!decodeFile.isRecycled())) {
                        decodeFile = null;
                    }
                    if (decodeFile != null) {
                        onVideoCoverCallback.onGetVideoCoverSuccess(decodeFile);
                    }
                }
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
                return;
            }
        }
        onVideoCoverCallback.onGetVideoCoverFailed(-1);
    }

    /* renamed from: d */
    private static final void m89566d(C27311c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        String W = cVar.mo70181W();
        if (W != null) {
            if (!C7276d.m22812b(W)) {
                W = null;
            }
            if (W != null) {
                Bitmap decodeFile = BitmapFactory.decodeFile(cVar.mo70181W());
                if (decodeFile != null) {
                    if (!(!decodeFile.isRecycled())) {
                        decodeFile = null;
                    }
                    if (decodeFile != null) {
                        onVideoCoverCallback.onGetVideoCoverSuccess(decodeFile);
                    }
                }
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
                return;
            }
        }
        onVideoCoverCallback.onGetVideoCoverFailed(-1);
    }

    /* renamed from: e */
    private static final void m89567e(C27311c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        String X = cVar.mo70182X();
        if (X != null) {
            if (!C7276d.m22812b(X)) {
                X = null;
            }
            if (X != null) {
                Bitmap decodeFile = BitmapFactory.decodeFile(cVar.mo70182X());
                if (decodeFile != null) {
                    if (!(!decodeFile.isRecycled())) {
                        decodeFile = null;
                    }
                    if (decodeFile != null) {
                        onVideoCoverCallback.onGetVideoCoverSuccess(decodeFile);
                    }
                }
                onVideoCoverCallback.onGetVideoCoverFailed(-1);
                return;
            }
        }
        onVideoCoverCallback.onGetVideoCoverFailed(-1);
    }

    /* renamed from: a */
    public static final void m89561a(C27311c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        C7573i.m23587b(cVar, "$this$loadThumbCover");
        C7573i.m23587b(onVideoCoverCallback, "callback");
        CharSequence l = cVar.mo70275l();
        if (l == null || l.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && new File(cVar.mo70275l()).exists()) {
            Bitmap decodeFile = BitmapFactory.decodeFile(cVar.mo70275l());
            if (decodeFile != null) {
                if (!(!decodeFile.isRecycled())) {
                    decodeFile = null;
                }
                if (decodeFile != null) {
                    onVideoCoverCallback.onGetVideoCoverSuccess(decodeFile);
                    return;
                }
            }
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
        } else if (cVar.f72026N == 2) {
            m89563b(cVar, onVideoCoverCallback);
        } else if (cVar.mo70177S()) {
            m89565c(cVar, onVideoCoverCallback);
        } else if (cVar.mo70178T()) {
            m89566d(cVar, onVideoCoverCallback);
        } else if (cVar.mo70179U()) {
            m89567e(cVar, onVideoCoverCallback);
        } else {
            m89568f(cVar, onVideoCoverCallback);
        }
    }

    /* renamed from: f */
    private static final void m89568f(C27311c cVar, OnVideoCoverCallback onVideoCoverCallback) {
        List arrayList = new ArrayList();
        EffectListModel effectListModel = cVar.f72014B;
        if (effectListModel != null) {
            ArrayList effectPointModels = effectListModel.getEffectPointModels();
            C7573i.m23582a((Object) effectPointModels, "it.effectPointModels");
            arrayList.addAll(effectPointModels);
        }
        boolean equals = TextUtils.equals(String.valueOf(cVar.f72044m), "1");
        IEffectService effectService = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService();
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        C29296g a = ((IAVService) service).getFilterService().mo74857a(cVar.f72042k);
        C7573i.m23582a((Object) a, "ServiceManager.get().get…Service.getFilter(filter)");
        effectService.getVideoCoverByCallback(arrayList, a.mo74978b(), cVar.mo70228aq(), (int) (cVar.f72027O * 1000.0f), equals, cVar.mo70214ac(), new C27315b(onVideoCoverCallback));
    }
}
