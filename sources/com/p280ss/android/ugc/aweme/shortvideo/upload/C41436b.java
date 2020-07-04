package com.p280ss.android.ugc.aweme.shortvideo.upload;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Looper;
import android.support.p022v4.p027os.C0879b;
import android.text.TextUtils;
import android.view.SurfaceView;
import bolts.C1592h;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ttve.editorInfo.C20455a;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.C38431ae;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C39359dv;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C39911fy;
import com.p280ss.android.ugc.aweme.shortvideo.C39912fz;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseException;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38789o.C38790a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEListener.C45218n;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.VEWatermarkParam;
import dmt.p1861av.video.C47419ae;
import dmt.p1861av.video.C47440an;
import dmt.p1861av.video.C47457f;
import dmt.p1861av.video.C47468m;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.b */
public final class C41436b implements C0043i {

    /* renamed from: a */
    public C41457l f107789a;

    /* renamed from: b */
    List<String> f107790b = new ArrayList();

    /* renamed from: c */
    public CancellationArraySignal f107791c;

    /* renamed from: d */
    public int f107792d = -1;

    /* renamed from: e */
    public C45329l f107793e;

    /* renamed from: f */
    public C45329l f107794f;

    /* renamed from: g */
    public VEVideoEncodeSettings f107795g;

    /* renamed from: h */
    private C0044j f107796h = new C0044j(this);

    public final Lifecycle getLifecycle() {
        return this.f107796h;
    }

    public C41436b(C41457l lVar, CancellationArraySignal cancellationArraySignal, int i) {
        this.f107796h.mo117a(State.STARTED);
        this.f107789a = lVar;
        this.f107791c = cancellationArraySignal;
        this.f107792d = 0;
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo102086a(final VideoPublishEditModel videoPublishEditModel, final VEWatermarkParam vEWatermarkParam, C0879b bVar) {
        C414371 r6 = new C39359dv<SynthetiseResult>("ConcurrentUploadCompiler") {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C47419ae mo102087a(VideoPublishEditModel videoPublishEditModel) throws Exception {
                return C47468m.m148186a(videoPublishEditModel, (C0043i) C41436b.this, (SurfaceView) null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo102089a(SynthetiseResult synthetiseResult, C47419ae aeVar, VEWatermarkParam vEWatermarkParam) {
                SynthetiseResult clone = synthetiseResult.clone();
                clone.ret = SynthetiseException.SYNTHETIC_CANCEL_CODE;
                String str = "VECompiler canceled";
                if ((C41436b.this.f107789a instanceof C38431ae) && ((C38431ae) C41436b.this.f107789a).f99894m == -1) {
                    StringBuilder sb = new StringBuilder("VECompiler stuck; ");
                    sb.append(C41436b.this.f107795g);
                    str = sb.toString();
                }
                if (mo47087a((Throwable) new SynthetiseException(str, clone))) {
                    if (C41436b.this.f107789a != null) {
                        C41436b.this.f107789a.mo96346b();
                    }
                    aeVar.f121778t.mo38876t();
                }
                if (synthetiseResult.outputFile != null) {
                    File file = new File(synthetiseResult.outputFile);
                    if (file.exists()) {
                        file.delete();
                    }
                    if (vEWatermarkParam != null) {
                        File file2 = new File(vEWatermarkParam.extFile);
                        if (file2.exists()) {
                            file2.delete();
                        }
                    }
                }
            }

            {
                final C47419ae aeVar;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C1592h a = C1592h.m7855a((Callable<TResult>) new C41447c<TResult>(this, videoPublishEditModel), (Executor) C23364n.f61448a);
                    try {
                        a.mo6892g();
                    } catch (InterruptedException unused) {
                    }
                    aeVar = (C47419ae) a.mo6890e();
                } else {
                    aeVar = C47468m.m148186a(videoPublishEditModel, (C0043i) C41436b.this, (SurfaceView) null);
                }
                final SynthetiseResult synthetiseResult = new SynthetiseResult();
                synthetiseResult.draftHardEncode = videoPublishEditModel.mHardEncode;
                synthetiseResult.outputFile = videoPublishEditModel.getOutputFile();
                synthetiseResult.needRecode = C47468m.m148190b(videoPublishEditModel);
                synthetiseResult.flags |= 1;
                synthetiseResult.isEnableFpsSet = C35563c.f93230L.mo93342a(Property.EnableSyntheticFpsSet);
                synthetiseResult.inputVideoFile = videoPublishEditModel.videoPath();
                synthetiseResult.isFastImport = videoPublishEditModel.isFastImport;
                synthetiseResult.segmentCount = videoPublishEditModel.segmentCounts();
                synthetiseResult.fastImportResolution = videoPublishEditModel.fastImportResolution;
                synthetiseResult.hasSubtitle = videoPublishEditModel.hasSubtitle();
                if (synthetiseResult.isFastImport) {
                    C38790a.m123897a(videoPublishEditModel.getPreviewInfo().getVideoList(), aeVar.f121778t);
                }
                C39604b.m126715a((C15389d) aeVar.f121778t, videoPublishEditModel.getMainBusinessContext());
                aeVar.f121778t.mo38829c(C41436b.this.f107792d);
                if (C41436b.this.f107793e == null) {
                    C41436b.this.f107793e = new C41448d(this, synthetiseResult, aeVar);
                }
                aeVar.f121778t.mo38801a(C41436b.this.f107793e);
                if (C41436b.this.f107794f == null) {
                    C41436b.this.f107794f = new C45329l() {

                        /* renamed from: a */
                        AtomicInteger f107800a = new AtomicInteger(0);

                        /* renamed from: a */
                        private boolean m132080a() {
                            if (vEWatermarkParam == null || this.f107800a.incrementAndGet() == 2) {
                                return true;
                            }
                            return false;
                        }

                        /* access modifiers changed from: 0000 */
                        /* renamed from: a */
                        public final /* synthetic */ Object mo102090a(int i, int i2, float f) throws Exception {
                            List<String> list = C41436b.this.f107790b;
                            StringBuilder sb = new StringBuilder("type:");
                            sb.append(i);
                            sb.append(" ext:");
                            sb.append(i2);
                            sb.append(" f:");
                            sb.append(f);
                            list.add(sb.toString());
                            return null;
                        }

                        public final void onCallback(int i, int i2, float f, String str) {
                            int i3;
                            if (vEWatermarkParam == null) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            if (i == 4103) {
                                StringBuilder sb = new StringBuilder("TE_INFO_COMPILE_DONE ext:");
                                sb.append(i2);
                                sb.append(" videoExt:");
                                sb.append(i3);
                                sb.append(" isDone():");
                                sb.append(C414371.this.isDone());
                                C41530am.m132285d(sb.toString());
                            } else if (i == 4118) {
                                StringBuilder sb2 = new StringBuilder("TE_INFO_HW_FAILED_TRY_SW_COMPILE ext:");
                                sb2.append(i2);
                                sb2.append(" videoExt:");
                                sb2.append(i3);
                                String sb3 = sb2.toString();
                                C41530am.m132283b(sb3);
                                C6893q.m21447a("aweme_synthesis_compile_log_vesdk", C38510bb.m123095a().mo96481a("log", sb3).mo96482b());
                            }
                            if (!C414371.this.isDone()) {
                                if (i == 4103) {
                                    if (i2 == 0) {
                                        synthetiseResult.videoLength = f;
                                    }
                                    if (m132080a()) {
                                        synthetiseResult.fileFps = (double) C47440an.m148110b(videoPublishEditModel.mOutputFile);
                                        try {
                                            new C47457f().mo119586a(videoPublishEditModel);
                                            if (videoPublishEditModel.isSaveLocalWithoutWaterMark()) {
                                                C7276d.m22822e(C39811er.f103476l);
                                                C7276d.m22820d(synthetiseResult.outputFile, videoPublishEditModel.getLocalTempPath());
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        if (C414371.this.mo47088b(synthetiseResult)) {
                                            C1592h.m7853a((Callable<TResult>) new C41450f<TResult>(aeVar));
                                        }
                                    }
                                } else if (i == 4105 && i2 == i3) {
                                    C414371.this.mo97923a((int) (f * 100.0f));
                                } else if (i == 4112) {
                                    synthetiseResult.synthetiseCPUEncode = i2 ^ 1;
                                } else if (i == 4113) {
                                    synthetiseResult.audioLength = f;
                                } else if (i == 4114) {
                                    C1592h.m7855a((Callable<TResult>) new C41451g<TResult>(this, i, i2, f), C1592h.f5958b);
                                } else if (i == 4116) {
                                    if (C35563c.f93231M.mo93305a(AVAB.Property.EnableUploadMetadata)) {
                                        if (videoPublishEditModel.metadataMap == null) {
                                            videoPublishEditModel.metadataMap = C20455a.m67874b();
                                        } else {
                                            videoPublishEditModel.metadataMap.putAll(C20455a.m67874b());
                                        }
                                    }
                                    C6921a.m21555a("receive prepare done event in vecomplier");
                                    SubtitleModule.m131121a(aeVar.f121778t, C35563c.f93238a, videoPublishEditModel, SubtitleModule.m131125ac());
                                } else if (i == 4130) {
                                    synthetiseResult.unableRemuxCode = i2;
                                }
                            }
                        }
                    };
                }
                aeVar.f121778t.mo38824b(C41436b.this.f107794f);
                C41436b.this.f107791c.mo102055a(new C41449e(this, synthetiseResult, aeVar, vEWatermarkParam));
                aeVar.f121778t.mo38799a((C45218n) new C45218n() {
                    /* renamed from: a */
                    private static boolean m132082a(Exception exc) {
                        long min = Math.min(C7276d.m22827h(), 2147483647L);
                        C6893q.m21444a("parallel_upload_write_data_error_left_space", (int) min, C38510bb.m123095a().mo96481a("error_info", exc.getCause().getMessage()).mo96482b());
                        if (!(exc.getCause() instanceof IOException)) {
                            return false;
                        }
                        if (TextUtils.equals(exc.getCause().getMessage(), "write failed: ENOSPC (No space left on device)") || min < 100) {
                            return true;
                        }
                        return false;
                    }

                    /* renamed from: a */
                    public final void mo102091a(byte[] bArr, int i, int i2, boolean z) {
                        if (C41436b.this.f107789a != null) {
                            try {
                                C41436b.this.f107789a.mo96345a(bArr, i, i2, z);
                            } catch (Exception e) {
                                SynthetiseResult clone = synthetiseResult.clone();
                                if (m132082a(e)) {
                                    clone.ret = SynthetiseException.NO_SPACE_LEFT;
                                } else {
                                    clone.ret = SynthetiseException.FAIL_CODE_PRODUCE_DATA;
                                }
                                if (C414371.this.mo47087a((Throwable) new SynthetiseException((Throwable) e, clone))) {
                                    aeVar.f121778t.mo38876t();
                                }
                            }
                        }
                    }
                });
                try {
                    C41436b.this.f107795g = C47468m.m148185a(videoPublishEditModel, synthetiseResult, vEWatermarkParam);
                    StringBuilder sb = new StringBuilder("PublishDurationMonitor SynthetiseStart ");
                    sb.append(C41436b.this.f107795g.toString());
                    C41530am.m132280a(sb.toString());
                    aeVar.f121778t.mo38784a("te_is_fast_import", String.valueOf(videoPublishEditModel.isFastImport ? 1 : 0));
                    if (videoPublishEditModel.isMultiVideoEdit() && !TextUtils.isEmpty(videoPublishEditModel.multiEditVideoRecordData.videoMetaData)) {
                        aeVar.f121778t.mo38784a("description", videoPublishEditModel.multiEditVideoRecordData.videoMetaData);
                    }
                    aeVar.f121778t.mo38804a(videoPublishEditModel.getOutputFile(), (String) null, C41436b.this.f107795g);
                } catch (Throwable th) {
                    mo47087a(th);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo102088a(SynthetiseResult synthetiseResult, C47419ae aeVar, int i, int i2, float f, String str) {
                SynthetiseResult clone = synthetiseResult.clone();
                clone.ret = i;
                StringBuilder sb = new StringBuilder("VECompiler failed. type = ");
                sb.append(i);
                sb.append(" ext = ");
                sb.append(i2);
                sb.append(" f = ");
                sb.append(f);
                sb.append(" msg = ");
                sb.append(str);
                if (mo47087a((Throwable) new SynthetiseException(sb.toString(), clone))) {
                    if (i2 == -214) {
                        C36964i.m118925b(true);
                    }
                    aeVar.f121778t.mo38876t();
                }
            }
        };
        C18246h.m60214a((C18253l<V>) r6, (C18245g<? super V>) new C41466s<Object>(videoPublishEditModel.mParallelUploadOutputFile, (long) videoPublishEditModel.getVideoLength(), videoPublishEditModel.isMvThemeVideoType()), C1592h.f5958b);
        C18246h.m60214a((C18253l<V>) r6, (C18245g<? super V>) new C39911fy<Object>(), C1592h.f5958b);
        C18246h.m60214a((C18253l<V>) r6, (C18245g<? super V>) new C39912fz<Object>(this.f107790b), C1592h.f5958b);
        return r6;
    }
}
