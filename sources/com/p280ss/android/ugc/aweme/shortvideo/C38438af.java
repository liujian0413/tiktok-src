package com.p280ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.support.p022v4.p027os.C0879b;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1000ak.C22487c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38568m;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41434a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41436b;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41456k;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41457l;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41457l.C41458a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41460n;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41494t;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41495u;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41499x;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41500y;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41501z;
import com.p280ss.android.ugc.aweme.shortvideo.upload.CancellationArraySignal;
import com.p280ss.android.ugc.aweme.shortvideo.upload.PublishResultState;
import com.p280ss.android.ugc.aweme.shortvideo.upload.UploadException;
import com.p280ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p280ss.android.ugc.aweme.shortvideo.upload.httpdns.C41453a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1620a.C41435a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1621b.C41444c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.utils.C43130fj;
import com.p280ss.android.ugc.aweme.utils.C43171v;
import com.p280ss.android.vesdk.VEWatermarkParam;
import com.p280ss.ttuploader.TTExternFileReader;
import com.p280ss.ttuploader.TTUploadResolver;
import com.p280ss.ttuploader.TTVideoInfo;
import com.p280ss.ttuploader.TTVideoUploader;
import com.p280ss.ttuploader.TTVideoUploaderListener;
import dmt.p1861av.video.C47468m;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.af */
public final class C38438af extends C39825f {

    /* renamed from: d */
    public volatile boolean f99922d;

    /* renamed from: e */
    public C41457l f99923e;

    /* renamed from: f */
    public C39359dv<SynthetiseResult> f99924f;

    /* renamed from: g */
    public C0879b f99925g;

    /* renamed from: h */
    public C39963gj f99926h;

    /* renamed from: i */
    public TTVideoUploader f99927i;

    /* renamed from: j */
    public boolean f99928j;

    /* renamed from: k */
    public int f99929k;

    /* renamed from: l */
    public C41444c f99930l;

    /* renamed from: m */
    public C41501z f99931m;

    /* renamed from: n */
    public boolean f99932n;

    /* renamed from: o */
    private C39821ey f99933o;

    /* renamed from: p */
    private C18253l<VideoCreation> f99934p;

    /* renamed from: q */
    private C39359dv<VideoCreation> f99935q;

    /* renamed from: r */
    private C41495u f99936r;

    /* renamed from: s */
    private final TTUploaderService f99937s;

    /* renamed from: t */
    private final C39815ev f99938t = new C39815ev();

    /* renamed from: u */
    private C41460n f99939u;

    /* renamed from: v */
    private CancellationArraySignal f99940v = new CancellationArraySignal();

    /* renamed from: w */
    private C39351do f99941w;

    /* renamed from: x */
    private String f99942x;

    /* renamed from: y */
    private boolean f99943y;

    /* renamed from: z */
    private boolean f99944z;

    /* renamed from: a */
    public final void mo96358a(boolean z) {
        C41494t a = C41494t.m132184a();
        StringBuilder sb = new StringBuilder("shutDown ");
        sb.append(z);
        a.mo102149a(sb.toString());
        if (z) {
            this.f99923e.mo96344a(true);
            this.f99941w.mo97919a(true);
            return;
        }
        if (!this.f99922d) {
            this.f99922d = true;
            if (!this.f99924f.isDone()) {
                this.f99925g.mo3280c();
            }
            this.f99923e.mo96344a(false);
            this.f99941w.mo97919a(false);
        }
    }

    /* renamed from: a */
    public final void mo88206a() {
        this.f99928j = true;
        if (this.f99936r != null) {
            this.f99936r.mo102151a();
        }
        if (this.f99929k > 0 && this.f99927i != null) {
            this.f99927i.allowMergeUpload();
        }
    }

    /* renamed from: b */
    public final long mo96359b() {
        if (this.f99926h == null) {
            return -1;
        }
        return this.f99926h.f103793a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo96361c() {
        if (!this.f99922d) {
            this.f99922d = true;
            this.f99923e.mo96346b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo96362d() {
        if (!this.f99922d) {
            this.f99922d = true;
            this.f99923e.mo96346b();
        }
    }

    /* renamed from: c */
    public final Bitmap mo88209c(Object obj) {
        return this.f99933o.mo88209c(obj);
    }

    /* renamed from: d */
    public final boolean mo88492d(Object obj) {
        return this.f99933o.mo88492d(obj);
    }

    /* renamed from: e */
    private static int m122906e(Object obj) {
        if (obj instanceof VideoPublishEditModel) {
            return ((VideoPublishEditModel) obj).getVideoLength();
        }
        return -1;
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo88204a(Object obj) {
        return mo96357a(obj, new C0879b(), false);
    }

    /* renamed from: b */
    public final long mo88207b(Object obj) {
        return new File(((VideoPublishEditModel) obj).mParallelUploadOutputFile).length();
    }

    /* renamed from: a */
    public final synchronized C18253l<VideoCreation> mo88202a(final Object obj, SynthetiseResult synthetiseResult) {
        if (this.f99934p == null) {
            C41530am.m132280a("PublishDurationMonitor AuthKey Start");
            this.f99934p = this.f99937s.mo96258a(null);
            C18246h.m60214a(this.f99934p, (C18245g<? super V>) new C18245g<VideoCreation>() {
                public final void onFailure(Throwable th) {
                    C41530am.m132280a("PublishDurationMonitor AuthKey End failed");
                    C38438af.this.mo96358a(false);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(VideoCreation videoCreation) {
                    C41530am.m132280a("PublishDurationMonitor AuthKey End success");
                    if (!C38438af.this.f99922d) {
                        C38438af.this.mo88205a(obj, videoCreation);
                    }
                }
            }, (Executor) C23364n.f61448a);
            C18246h.m60214a(this.f99934p, (C18245g<? super V>) new C41456k<Object>(this.f103511c, m122906e(obj)), (Executor) C23364n.f61448a);
            if (C35563c.f93231M.mo93305a(Property.ConcurrentUploadCancelOnAuthKey)) {
                this.f99940v.mo102055a(new C38446ag(this));
            }
        }
        return this.f99934p;
    }

    /* renamed from: a */
    public final synchronized C39359dv<VideoCreation> mo88205a(Object obj, VideoCreation videoCreation) {
        String str;
        if (this.f99935q == null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            this.f99926h = new C39963gj(videoPublishEditModel, this, 0, this.f99930l);
            this.f99926h.mo99398a(this.f99928j);
            String str2 = videoPublishEditModel.mParallelUploadOutputFile;
            float f = videoPublishEditModel.mVideoCoverStartTm;
            if (videoPublishEditModel.mOrigin == 0) {
                str = C36964i.m118933i();
            } else {
                str = C36964i.m118932h();
            }
            this.f99935q = m122905a(str2, f, str, videoCreation, videoPublishEditModel.creationId, videoPublishEditModel.uploadSpeedInfo, C38568m.m123258a(videoPublishEditModel));
            videoPublishEditModel.metadataMap = null;
            this.f99940v.mo102055a(new C38447ah(this));
        }
        return this.f99935q;
    }

    /* renamed from: a */
    public final C18253l<? extends C38455ap> mo96360b(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        return C18246h.m60209a(m122902a((VideoPublishEditModel) obj, videoCreation, synthetiseResult), ApiServerException.class, C40203p.m128511a(new C38448ai(this, obj, videoCreation, synthetiseResult)), C23364n.f61448a);
    }

    /* renamed from: a */
    private C18253l<? extends C38455ap> m122902a(VideoPublishEditModel videoPublishEditModel, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        int i;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (videoPublishEditModel.isReviewVideo()) {
            linkedHashMap.put("review_video_id", videoPublishEditModel.reviewVideoId);
        }
        linkedHashMap.put("video_id", videoCreation.materialId);
        linkedHashMap.put("new_sdk", "1");
        C43130fj.m136814a(videoCreation, linkedHashMap);
        int i2 = 0;
        if (videoPublishEditModel.mFromCut || videoPublishEditModel.mFromMultiCut) {
            i2 = videoPublishEditModel.videoCount;
            i = videoPublishEditModel.photoCount;
        } else {
            if (videoPublishEditModel.extractFramesModel != null && videoPublishEditModel.extractFramesModel.frames != null) {
                i2 = videoPublishEditModel.extractFramesModel.frames.size();
            } else if (!(videoPublishEditModel.mvCreateVideoData == null || videoPublishEditModel.mvCreateVideoData.selectMediaList == null)) {
                i = videoPublishEditModel.mvCreateVideoData.selectMediaList.size();
            }
            i = 0;
        }
        if (videoPublishEditModel.containBackgroundVideo || !TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            linkedHashMap.put("green_screen", "1");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        linkedHashMap.put("video_cnt", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        linkedHashMap.put("pic_cnt", sb2.toString());
        String str2 = "is_multi_content";
        if (i2 + i > 1) {
            str = "1";
        } else {
            str = "0";
        }
        linkedHashMap.put(str2, str);
        this.f99938t.mo99237a(videoPublishEditModel, linkedHashMap);
        this.f99938t.mo99236a((BaseShortVideoContext) videoPublishEditModel, synthetiseResult, linkedHashMap);
        C41530am.m132280a("PublishDurationMonitor CreateAweme start");
        C18253l<? extends C38455ap> a = C35563c.f93257t.mo83273a((String) null, linkedHashMap);
        if (C6399b.m19944t()) {
            a = C18246h.m60209a(a, IOException.class, new C38449aj(linkedHashMap), C18254m.m60217a());
        }
        C38453an anVar = new C38453an(this.f99939u, videoPublishEditModel.mParallelUploadOutputFile, videoPublishEditModel.isMvThemeVideoType(), this.f99944z, this.f103511c, videoPublishEditModel.getVideoLength());
        C18246h.m60214a(a, (C18245g<? super V>) anVar, C18254m.m60217a());
        return a;
    }

    /* renamed from: a */
    private C39359dv<SynthetiseResult> m122904a(final VideoPublishEditModel videoPublishEditModel, C0879b bVar, boolean z) {
        VEWatermarkParam vEWatermarkParam;
        this.f99944z = z;
        this.f99939u = new C41460n();
        this.f99939u.mo102126a();
        if (!z) {
            this.f99941w = new C39351do(videoPublishEditModel, this.f99942x, this.f99943y);
            this.f99941w.mo97918a();
        }
        if (videoPublishEditModel.isSaveLocalWithWaterMark()) {
            int[] a = C47468m.m148189a(videoPublishEditModel);
            int saveType = videoPublishEditModel.mSaveModel.getSaveType();
            boolean a2 = C39799ej.m127420a(saveType);
            vEWatermarkParam = ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).watermarkParamBuilderService().createWatermark(saveType, videoPublishEditModel.getLocalTempPath(), C35563c.f93260w.mo57092e(), a, true, videoPublishEditModel.getLocalTempPath(), a2);
            if (a2 && vEWatermarkParam != null) {
                int i = a[1] - a[0];
                if (i > 0) {
                    vEWatermarkParam.yOffset += i / 2;
                }
            }
        } else {
            vEWatermarkParam = null;
        }
        if (!z) {
            try {
                this.f99923e = new C38431ae(videoPublishEditModel.mParallelUploadOutputFile);
            } catch (Exception unused) {
                return new C39359dv<SynthetiseResult>() {
                    {
                        StringBuilder sb = new StringBuilder("unable to mkdir ");
                        sb.append(videoPublishEditModel.mParallelUploadOutputFile);
                        mo47087a((Throwable) new SynthetiseException(sb.toString(), new SynthetiseResult()));
                    }
                };
            }
        }
        C35563c.m114839f();
        this.f99925g = bVar;
        this.f99925g.mo3277a(this.f99940v);
        this.f99924f = new C41436b(this.f99923e, this.f99940v, 0).mo102086a(videoPublishEditModel, vEWatermarkParam, null);
        if (!z) {
            this.f99930l.mo102099c();
            C18246h.m60214a((C18253l<V>) this.f99924f, (C18245g<? super V>) new C18245g<SynthetiseResult>() {
                public final void onFailure(Throwable th) {
                    C38438af.this.mo96358a(false);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(SynthetiseResult synthetiseResult) {
                    C38438af.this.f99930l.mo102100d();
                    C38438af.this.f99930l.f107817d = C38438af.this.f99923e.mo96349d();
                    C38438af.this.f99930l.f107818e = C38438af.this.f99923e.mo96350e() - C38438af.this.f99923e.mo96349d();
                }
            }, (Executor) C23364n.f61448a);
            mo88202a((Object) videoPublishEditModel, (SynthetiseResult) null);
        } else {
            C18246h.m60214a((C18253l<V>) this.f99924f, (C18245g<? super V>) new C18245g<SynthetiseResult>() {
                /* renamed from: a */
                private static void m122922a(SynthetiseResult synthetiseResult) {
                    C41530am.m132280a("ConcurrentUpload not upload for review video fast publish");
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    m122922a((SynthetiseResult) obj);
                }

                public final void onFailure(Throwable th) {
                    C41530am.m132280a("ConcurrentUploadByFile, shutDown false, isFastPublish true");
                    if (!C38438af.this.f99922d) {
                        C38438af.this.f99922d = true;
                        if (!C38438af.this.f99924f.isDone()) {
                            C38438af.this.f99925g.mo3280c();
                        }
                    }
                }
            }, (Executor) C23364n.f61448a);
        }
        return this.f99924f;
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo96357a(Object obj, C0879b bVar, boolean z) {
        return m122904a((VideoPublishEditModel) obj, bVar, z);
    }

    C38438af(TTUploaderService tTUploaderService, String str, boolean z, int i, int i2) {
        super(i, i2);
        this.f99937s = tTUploaderService;
        this.f99933o = new C39821ey(tTUploaderService, i, i2);
        this.f99942x = str;
        this.f99943y = z;
        this.f99929k = C35563c.f93231M.mo93306b(Property.PreUploadEncryptionMode);
        this.f103509a = i;
        this.f103510b = i2;
        this.f99930l = new C41444c();
        this.f99932n = C35563c.f93231M.mo93305a(Property.EnableOnlyReportKeyUploadLog);
    }

    /* renamed from: a */
    private C39359dv<VideoCreation> m122905a(String str, float f, String str2, VideoCreation videoCreation, String str3, UploadSpeedInfo uploadSpeedInfo, String str4) {
        final C39966gm gmVar = ((C39961gh) videoCreation).f103779a;
        final String str5 = str;
        final String str6 = str4;
        final float f2 = f;
        final String str7 = str3;
        C384435 r0 = new C39359dv<VideoCreation>("ConcurrentUploader") {
            /* renamed from: e */
            private void m122924e() {
                if (C38438af.this.f99929k > 0) {
                    C38438af.this.f99927i.setPreUploadEncryptionMode(C38438af.this.f99929k);
                    if (C38438af.this.f99928j) {
                        C38438af.this.f99927i.allowMergeUpload();
                    }
                }
            }

            /* renamed from: a */
            public final void mo96363a(PublishResultState publishResultState) {
                C38438af.this.f99927i.close();
                C38438af.this.f99931m.mo102163a(publishResultState);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo96364b(PublishResultState publishResultState) {
                if (publishResultState == PublishResultState.CANCEL) {
                    C38438af.this.f99927i.allowMergeUpload();
                    C6907h.m21524a("user_cancel_publish", (Map) C22984d.m75611a().mo59973a("publish_id", C38438af.this.f103511c).mo59970a("video_type", 0).mo59970a("video_upload_type", 1).mo59973a("cancel_step", "call_uploader").f60753a);
                    C38438af.this.f99927i.cancelUpload();
                }
            }

            {
                boolean z;
                try {
                    final File file = new File(str5);
                    C38438af.this.f99927i = C22487c.m74374a();
                    C38438af.this.f99931m = new C41501z(C38438af.this.f103511c);
                    C38438af.this.f99927i.setListener(new TTVideoUploaderListener() {
                        public final String getStringFromExtern(int i) {
                            return str6;
                        }

                        public final int videoUploadCheckNetState(int i, int i2) {
                            return C41434a.m132073a(gmVar, "ConcurrentUpload");
                        }

                        /* renamed from: a */
                        private void m122927a(boolean z, TTVideoInfo tTVideoInfo) {
                            if (z) {
                                C38438af.this.f99926h.mo99399a(true, "", null, C38438af.this.f99928j);
                                return;
                            }
                            C39963gj gjVar = C38438af.this.f99926h;
                            StringBuilder sb = new StringBuilder("errorCode:");
                            sb.append(tTVideoInfo.mErrcode);
                            gjVar.mo99399a(false, sb.toString(), String.valueOf(tTVideoInfo.mErrcode), C38438af.this.f99928j);
                        }

                        public final void onLog(int i, int i2, String str) {
                            C41435a.m132074a(i, str);
                            if (C38438af.this.f99932n) {
                                if (i == 101) {
                                    C38438af.this.f99931m.mo102162a(i2, str);
                                }
                            } else if (i == 100) {
                                C38438af.this.f99931m.mo102162a(i2, str);
                            }
                        }

                        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                            if (i == 0) {
                                C384435.this.mo96363a(PublishResultState.SUCCESS);
                                C384435.this.mo47088b(C43130fj.m136813a(tTVideoInfo));
                                m122927a(true, tTVideoInfo);
                                C38438af.this.mo96358a(true);
                            } else if (i == 2) {
                                C384435.this.mo96363a(PublishResultState.FAILED);
                                C384435.this.mo47087a((Throwable) new UploadException(tTVideoInfo));
                                m122927a(false, tTVideoInfo);
                                C38438af.this.mo96358a(false);
                            } else if (i == 1) {
                                C384435.this.mo97923a((int) j);
                            } else {
                                if (i == 3) {
                                    C384435.this.mo96363a(PublishResultState.CANCEL);
                                    tTVideoInfo.mErrcode = -39993;
                                    m122927a(false, tTVideoInfo);
                                    C384435.this.mo47087a((Throwable) new UploadException(tTVideoInfo));
                                    C41530am.m132280a("TTUploader MsgIsUploadCancel");
                                }
                            }
                        }
                    });
                    C38438af.this.f99927i.setExternFileReader(new TTExternFileReader() {
                        public final void cancel() {
                        }

                        public final long getValue(int i) {
                            int i2;
                            if (i == 0 && C38438af.this.f99923e.mo96348c()) {
                                return file.length();
                            }
                            if (i != 1) {
                                return -1;
                            }
                            C38438af.this.f99930l.mo102101e();
                            try {
                                i2 = C38438af.this.f99923e.mo96338a();
                            } catch (Exception e) {
                                C384435.this.mo47087a((Throwable) e);
                                i2 = -1;
                            }
                            C38438af.this.f99930l.mo102102f();
                            return (long) i2;
                        }

                        public final long getCrc32ByOffset(long j, int i) {
                            return C38438af.this.f99923e.mo96341a(j, (long) i);
                        }

                        public final int readSlice(int i, byte[] bArr, int i2) {
                            int i3;
                            C38438af.this.f99930l.mo102101e();
                            try {
                                i3 = C38438af.this.f99923e.mo96339a(i, bArr, i2);
                            } catch (Exception unused) {
                                i3 = -1;
                            }
                            StringBuilder sb = new StringBuilder("ConcurrentUploadByFile consumeStatus:");
                            sb.append(i3);
                            C41530am.m132280a(sb.toString());
                            C38438af.this.f99930l.mo102102f();
                            return i3;
                        }

                        public final int readSliceByOffset(long j, byte[] bArr, int i, int i2) {
                            int i3;
                            C38438af.this.f99930l.mo102101e();
                            try {
                                i3 = C38438af.this.f99923e.mo96340a(j, bArr, i, i2);
                            } catch (Exception e) {
                                C384435.this.mo47087a((Throwable) e);
                                i3 = -1;
                            }
                            StringBuilder sb = new StringBuilder("ConcurrentUploadByFile consumeStatus:");
                            sb.append(i3);
                            C41530am.m132280a(sb.toString());
                            C38438af.this.f99930l.mo102102f();
                            return i3;
                        }
                    });
                    if (C38438af.this.f99929k > 0) {
                        C38438af.this.f99923e.mo96342a((C41458a) new C38450ak(this));
                    }
                    if (gmVar.f103831q == 1) {
                        C38438af.this.f99927i.setEnableExternNet(gmVar.f103834t);
                        String e = C35563c.f93231M.mo93309e(Property.TTNetExternNetInfo);
                        if (!TextUtils.isEmpty(e)) {
                            C38438af.this.f99927i.setExternNetInfo(e);
                        }
                        C38438af.this.f99927i.setNewHttpProxyLoader(C35563c.f93231M.mo93306b(Property.TTUploaderTTNetProxyType));
                        C38438af.this.f99927i.setTTExternLoader(new C39937gc());
                        C38438af.this.f99927i.setEnableQuic(gmVar.f103832r);
                    }
                    C41500y yVar = new C41500y();
                    yVar.mo102160b();
                    if (C6399b.m19944t()) {
                        C38438af.this.f99927i.setEnableUpHost(1);
                        C38438af.this.f99927i.setEnableServerHost(1);
                        C38438af.this.f99927i.setEnableExternDNS(gmVar.f103825k);
                        C38438af.this.f99927i.setAliveMaxFailTime(gmVar.f103826l);
                        C38438af.this.f99927i.setTcpOpenTimeOutMilliSec(gmVar.f103829o);
                        TTUploadResolver.setEnableTTNetDNS(gmVar.f103827m);
                        yVar.mo102159a(gmVar);
                    }
                    C38438af.this.f99927i.setServerParameter(yVar.mo102157a());
                    C39939gd.m127757a(C38438af.this.f99927i, gmVar.f103824j);
                    C41453a.m132107a();
                    C41499x.m132199a();
                    C38438af.this.f99927i.setEnableLogCallBack(gmVar.f103835u);
                    C38438af.this.f99927i.setEnablePostMethod(gmVar.f103828n);
                    C38438af.this.f99927i.setMaxFailTime(gmVar.f103822h);
                    C38438af.this.f99927i.setSliceSize(gmVar.f103820f);
                    C38438af.this.f99927i.setEvStateEnable(gmVar.f103838x);
                    C38438af.this.f99927i.setFileUploadDomain(gmVar.f103816b);
                    C38438af.this.f99927i.setVideoUploadDomain(gmVar.f103817c);
                    C38438af.this.f99927i.setSliceTimeout(gmVar.f103818d);
                    C38438af.this.f99927i.setSliceReTryCount(gmVar.f103819e);
                    TTVideoUploader tTVideoUploader = C38438af.this.f99927i;
                    if (gmVar.f103836v == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tTVideoUploader.setOpenResume(z);
                    m122924e();
                    C38438af.this.f99927i.setPoster(f2);
                    HashMap hashMap = new HashMap(1);
                    hashMap.put(Integer.valueOf(69), str7);
                    C38438af.this.f99927i.setTraceIDConfig(hashMap);
                    if (C6399b.m19947w()) {
                        C38438af.this.f99927i.setFileRetryCount(gmVar.f103821g);
                    } else {
                        C38438af.this.f99927i.setFileRetryCount(1);
                    }
                    C38438af.this.f99927i.setUserKey(gmVar.f103815a);
                    C38438af.this.f99927i.setAuthorization(gmVar.f103823i);
                    C38438af.this.f99927i.setSocketNum(1);
                    C38438af.this.f99927i.setEnableMutiTask(gmVar.f103833s);
                    C38438af.this.f99927i.setOpenBoe(C38451al.m122933a(C43171v.m136920a()));
                    C38438af.this.f99927i.setResponeTimeOut(C35563c.f93231M.mo93306b(Property.TTUploaderResponseTimeOut));
                    StringBuilder sb = new StringBuilder("PublishDurationMonitor Upload Start ");
                    sb.append(gmVar.toString());
                    C41530am.m132280a(sb.toString());
                    C38438af.this.f99927i.start();
                    C38438af.this.f99931m.mo102161a();
                } catch (Exception e2) {
                    mo96363a(PublishResultState.FAILED);
                    throw e2;
                } catch (Exception e3) {
                    mo47087a((Throwable) e3);
                }
            }
        };
        C41495u uVar = new C41495u(str, str2, uploadSpeedInfo, this.f99930l, this.f99928j, this.f103509a, this.f103510b, this.f103511c);
        this.f99936r = uVar;
        C18246h.m60214a((C18253l<V>) r0, (C18245g<? super V>) this.f99936r, (Executor) C23364n.f61448a);
        return r0;
    }
}
