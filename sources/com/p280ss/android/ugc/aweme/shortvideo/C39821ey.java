package com.p280ss.android.ugc.aweme.shortvideo;

import android.graphics.Bitmap;
import android.support.p022v4.p027os.C0879b;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.p1000ak.C22487c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38568m;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41434a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41499x;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41500y;
import com.p280ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p280ss.android.ugc.aweme.shortvideo.upload.httpdns.C41453a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1620a.C41435a;
import com.p280ss.android.ugc.aweme.utils.C43130fj;
import com.p280ss.android.ugc.aweme.utils.C43171v;
import com.p280ss.ttuploader.TTUploadResolver;
import com.p280ss.ttuploader.TTVideoInfo;
import com.p280ss.ttuploader.TTVideoUploader;
import com.p280ss.ttuploader.TTVideoUploaderListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ey */
public final class C39821ey extends C39825f {

    /* renamed from: d */
    public TTVideoUploader f103494d;

    /* renamed from: e */
    public boolean f103495e;

    /* renamed from: f */
    public int f103496f;

    /* renamed from: g */
    private final C39815ev f103497g = new C39815ev();

    /* renamed from: h */
    private final TTUploaderService f103498h;

    /* renamed from: a */
    public final void mo88206a() {
        this.f103495e = true;
        if (this.f103496f > 0 && this.f103494d != null) {
            this.f103494d.allowMergeUpload();
        }
    }

    /* renamed from: b */
    public final long mo88207b(Object obj) {
        return C39815ev.m127484c(obj);
    }

    /* renamed from: c */
    public final Bitmap mo88209c(Object obj) {
        return this.f103497g.mo99238b(obj);
    }

    /* renamed from: d */
    public final boolean mo88492d(Object obj) {
        return C39815ev.m127485d(obj);
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo88204a(Object obj) {
        return this.f103497g.mo99234a(obj);
    }

    /* renamed from: a */
    public final C18253l<VideoCreation> mo88202a(Object obj, SynthetiseResult synthetiseResult) {
        if (synthetiseResult == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (!C6399b.m19944t()) {
            this.f103497g.mo99237a(videoPublishEditModel, linkedHashMap);
            this.f103497g.mo99236a((BaseShortVideoContext) videoPublishEditModel, synthetiseResult, linkedHashMap);
        }
        C18253l<VideoCreation> a = this.f103498h.mo96258a(linkedHashMap);
        C18246h.m60214a(a, (C18245g<? super V>) new C38516be<Object>(), (Executor) C23364n.f61448a);
        C18246h.m60214a(a, (C18245g<? super V>) new C38515bd<Object>(), (Executor) C23364n.f61448a);
        return a;
    }

    /* renamed from: a */
    public final C39359dv<VideoCreation> mo88205a(Object obj, VideoCreation videoCreation) {
        String h;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        String a = C38568m.m123258a(videoPublishEditModel);
        videoPublishEditModel.metadataMap = null;
        String outputFile = videoPublishEditModel.getOutputFile();
        float f = videoPublishEditModel.mVideoCoverStartTm;
        if (videoPublishEditModel.mOrigin == 0) {
            h = C36964i.m118933i();
        } else {
            h = C36964i.m118932h();
        }
        String str = h;
        return m127495a(outputFile, f, str, videoCreation, videoPublishEditModel.uploadSpeedInfo, a);
    }

    public C39821ey(TTUploaderService tTUploaderService, int i, int i2) {
        super(i, i2);
        this.f103498h = tTUploaderService;
        this.f103496f = C35563c.f93231M.mo93306b(Property.PreUploadEncryptionMode);
        this.f103509a = i;
        this.f103510b = i2;
    }

    /* renamed from: a */
    public final C18253l<? extends C38455ap> mo99241b(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        return C18246h.m60209a(m127493a((VideoPublishEditModel) obj, videoCreation, synthetiseResult), ApiServerException.class, C40203p.m128511a(new C39824ez(this, obj, videoCreation, synthetiseResult)), C23364n.f61448a);
    }

    /* renamed from: a */
    private C18253l<? extends C38455ap> m127493a(VideoPublishEditModel videoPublishEditModel, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
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
        if (videoPublishEditModel.containBackgroundVideo || !TextUtils.isEmpty(videoPublishEditModel.pic2VideoSource)) {
            linkedHashMap.put("green_screen", "1");
        }
        this.f103497g.mo99237a(videoPublishEditModel, linkedHashMap);
        this.f103497g.mo99236a((BaseShortVideoContext) videoPublishEditModel, synthetiseResult, linkedHashMap);
        C18253l<? extends C38455ap> a = C35563c.f93257t.mo83273a((String) null, linkedHashMap);
        if (C6399b.m19944t()) {
            a = C18246h.m60209a(a, IOException.class, new C39859fa(linkedHashMap), C18254m.m60217a());
        }
        C18246h.m60214a(a, (C18245g<? super V>) new C38454ao<Object>(), C18254m.m60217a());
        return a;
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo96357a(Object obj, C0879b bVar, boolean z) {
        return this.f103497g.mo99235a(obj, bVar, z);
    }

    /* renamed from: a */
    public final C39359dv<VideoCreation> mo99240a(String str, float f, String str2, VideoCreation videoCreation) {
        return m127495a(str, f, str2, videoCreation, new UploadSpeedInfo(), null);
    }

    /* renamed from: a */
    private C39359dv<VideoCreation> m127495a(String str, float f, String str2, VideoCreation videoCreation, UploadSpeedInfo uploadSpeedInfo, String str3) {
        final C39966gm gmVar = ((C39961gh) videoCreation).f103779a;
        final String str4 = str3;
        final float f2 = f;
        final String str5 = str;
        C398221 r0 = new C39359dv<VideoCreation>("ShortVideoUploader") {
            /* renamed from: e */
            private void m127507e() {
                if (C39821ey.this.f103496f > 0) {
                    C39821ey.this.f103494d.setPreUploadEncryptionMode(C39821ey.this.f103496f);
                    if (C39821ey.this.f103495e) {
                        C39821ey.this.f103494d.allowMergeUpload();
                    }
                }
            }

            {
                boolean z;
                try {
                    C39821ey.this.f103494d = C22487c.m74374a();
                    C39821ey.this.f103494d.setListener(new TTVideoUploaderListener() {
                        public final String getStringFromExtern(int i) {
                            return str4;
                        }

                        public final int videoUploadCheckNetState(int i, int i2) {
                            return C41434a.m132073a(gmVar, "SerialUpload");
                        }

                        public final void onLog(int i, int i2, String str) {
                            C41435a.m132074a(i, str);
                        }

                        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                            if (i == 0) {
                                C39821ey.this.f103494d.close();
                                C398221.this.mo47088b(C43130fj.m136813a(tTVideoInfo));
                            } else if (i == 2) {
                                C39821ey.this.f103494d.close();
                                if (tTVideoInfo == null || tTVideoInfo.mErrcode != 30411) {
                                    C398221.this.mo47087a((Throwable) new IllegalArgumentException("upload failed."));
                                } else {
                                    C398221.this.mo47087a((Throwable) new ApiServerException((int) tTVideoInfo.mErrcode).setErrorMsg(C35563c.f93238a.getResources().getString(R.string.fki)));
                                }
                            } else {
                                if (i == 1) {
                                    C398221.this.mo97923a((int) j);
                                }
                            }
                        }
                    });
                    if (gmVar.f103831q == 1) {
                        C39821ey.this.f103494d.setEnableExternNet(gmVar.f103834t);
                        C39821ey.this.f103494d.setNewHttpProxyLoader(C35563c.f93231M.mo93306b(Property.TTUploaderTTNetProxyType));
                        C39821ey.this.f103494d.setTTExternLoader(new C39937gc());
                        C39821ey.this.f103494d.setEnableQuic(gmVar.f103832r);
                    }
                    C41500y yVar = new C41500y();
                    yVar.mo102160b();
                    if (C6399b.m19944t()) {
                        C39821ey.this.f103494d.setEnableUpHost(1);
                        C39821ey.this.f103494d.setEnableServerHost(1);
                        C39821ey.this.f103494d.setEnableExternDNS(gmVar.f103825k);
                        C39821ey.this.f103494d.setAliveMaxFailTime(gmVar.f103826l);
                        C39821ey.this.f103494d.setTcpOpenTimeOutMilliSec(gmVar.f103829o);
                        TTUploadResolver.setEnableTTNetDNS(gmVar.f103827m);
                        yVar.mo102159a(gmVar);
                    }
                    C39821ey.this.f103494d.setServerParameter(yVar.mo102157a());
                    C39939gd.m127757a(C39821ey.this.f103494d, gmVar.f103824j);
                    C41453a.m132107a();
                    C41499x.m132199a();
                    C39821ey.this.f103494d.setEnableLogCallBack(gmVar.f103835u);
                    C39821ey.this.f103494d.setEvStateEnable(gmVar.f103838x);
                    C39821ey.this.f103494d.setEnablePostMethod(gmVar.f103828n);
                    C39821ey.this.f103494d.setMaxFailTime(gmVar.f103822h);
                    C39821ey.this.f103494d.setSliceSize(gmVar.f103820f);
                    C39821ey.this.f103494d.setFileUploadDomain(gmVar.f103816b);
                    C39821ey.this.f103494d.setVideoUploadDomain(gmVar.f103817c);
                    C39821ey.this.f103494d.setSliceTimeout(gmVar.f103818d);
                    C39821ey.this.f103494d.setSliceReTryCount(gmVar.f103819e);
                    C39821ey.this.f103494d.setPoster(f2);
                    C39821ey.this.f103494d.setPathName(str5);
                    TTVideoUploader tTVideoUploader = C39821ey.this.f103494d;
                    int i = 0;
                    if (gmVar.f103836v == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tTVideoUploader.setOpenResume(z);
                    if (C6399b.m19947w()) {
                        C39821ey.this.f103494d.setFileRetryCount(gmVar.f103821g);
                    } else {
                        C39821ey.this.f103494d.setFileRetryCount(1);
                    }
                    m127507e();
                    C39821ey.this.f103494d.setUserKey(gmVar.f103815a);
                    C39821ey.this.f103494d.setAuthorization(gmVar.f103823i);
                    C39821ey.this.f103494d.setSocketNum(1);
                    C39821ey.this.f103494d.setEnableMutiTask(gmVar.f103833s);
                    int b = C35563c.f93230L.mo93343b(AVSettings.Property.MaxFansCount);
                    if (b > 0) {
                        C22200c e = C35563c.f93260w.mo57092e();
                        if (e != null) {
                            i = e.mo58566i();
                        }
                        TreeMap treeMap = new TreeMap();
                        String str = "priority";
                        double d = (double) i;
                        Double.isNaN(d);
                        double d2 = d * 1.0d;
                        double d3 = (double) b;
                        Double.isNaN(d3);
                        treeMap.put(str, Long.valueOf(Math.min(Math.round((d2 / d3) * 100.0d), 100)));
                        C39821ey.this.f103494d.setCustomConfig(treeMap);
                    }
                    C39821ey.this.f103494d.setOpenBoe(C39860fb.m127583a(C43171v.m136920a()));
                    C39821ey.this.f103494d.setResponeTimeOut(C35563c.f93231M.mo93306b(Property.TTUploaderResponseTimeOut));
                    C39821ey.this.f103494d.start();
                } catch (Exception e2) {
                    C39821ey.this.f103494d.close();
                    throw e2;
                } catch (Exception e3) {
                    mo47087a((Throwable) e3);
                }
            }
        };
        C39964gk gkVar = new C39964gk(str, str2, uploadSpeedInfo, this.f103509a, this.f103510b);
        C18246h.m60214a((C18253l<V>) r0, (C18245g<? super V>) gkVar, (Executor) C23364n.f61448a);
        C18246h.m60214a((C18253l<V>) r0, (C18245g<? super V>) new C39965gl<Object>(str), (Executor) C23364n.f61448a);
        return r0;
    }
}
