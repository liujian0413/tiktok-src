package dmt.p1861av.video;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Looper;
import android.support.p022v4.p027os.C0879b;
import android.support.p022v4.p027os.C0879b.C0880a;
import android.text.TextUtils;
import android.view.SurfaceView;
import bolts.C1592h;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.p254b.C6304f;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ttve.editorInfo.C20455a;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.photo.publish.C34788e;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C39359dv;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C39911fy;
import com.p280ss.android.ugc.aweme.shortvideo.C39912fz;
import com.p280ss.android.ugc.aweme.shortvideo.C39917ga;
import com.p280ss.android.ugc.aweme.shortvideo.C39936gb;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseException;
import com.p280ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p280ss.android.ugc.aweme.shortvideo.cut.C38789o.C38790a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39501aw;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39504az;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39512ba;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.ResultData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.C39604b;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40312g;
import com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.C45244a;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET;
import com.p280ss.android.vesdk.VEWatermarkParam;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dmt.av.video.m */
public final class C47468m implements C0043i {

    /* renamed from: a */
    C0044j f121876a = new C0044j(this);

    /* renamed from: b */
    List<String> f121877b = new ArrayList();

    /* renamed from: c */
    public int f121878c = -1;

    /* renamed from: d */
    public C45329l f121879d;

    /* renamed from: e */
    public C45329l f121880e;

    public final Lifecycle getLifecycle() {
        return this.f121876a;
    }

    public C47468m() {
        this.f121876a.mo117a(State.STARTED);
    }

    /* renamed from: a */
    private static boolean m148188a(int i) {
        if (C34788e.m112192d(i)) {
            if (C35563c.f93232N.f96866a > 0.0f) {
                return true;
            }
            return false;
        } else if (C35563c.f93232N.f96867b > 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m148191c(VideoPublishEditModel videoPublishEditModel) {
        if (!videoPublishEditModel.isFastImport || C35563c.f93230L.mo93342a(Property.VEFastImportIgnoreRecode)) {
            return false;
        }
        return true;
    }

    public C47468m(int i) {
        this.f121876a.mo117a(State.STARTED);
        this.f121878c = i;
    }

    /* renamed from: a */
    public static int[] m148189a(VideoPublishEditModel videoPublishEditModel) {
        int[] d = m148192d(videoPublishEditModel);
        if (d[0] > 0 && d[1] > 0) {
            return d;
        }
        return new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
    }

    /* renamed from: b */
    public static boolean m148190b(VideoPublishEditModel videoPublishEditModel) {
        if (C35563c.f93231M.mo93305a(AVAB.Property.NeedRecode) || m148191c(videoPublishEditModel) || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.hasStickers() || videoPublishEditModel.mTimeEffect != null || C6311g.m19574b(videoPublishEditModel.mEffectList) || videoPublishEditModel.mSelectedId != 0 || C47440an.m148111c(videoPublishEditModel.videoPath()) * 1000 > C35563c.f93230L.mo93343b(Property.BitrateOfRecodeThreshold) || m148188a(videoPublishEditModel.videoType)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int[] m148192d(VideoPublishEditModel videoPublishEditModel) {
        int[] iArr;
        if (C34788e.m112192d(videoPublishEditModel.videoType)) {
            iArr = C36964i.m118922a(C35563c.f93232N.f96869d);
        } else {
            iArr = C36964i.m118922a(C35563c.f93232N.f96868c);
        }
        if (iArr == null || iArr.length != 2 || iArr[0] <= 0 || iArr[1] <= 0) {
            if (!C39501aw.m126167a(videoPublishEditModel) || videoPublishEditModel.mOutVideoWidth <= 0 || videoPublishEditModel.mOutVideoHeight <= 0) {
                iArr = videoPublishEditModel.isFastImport ? new int[]{-1, -1} : new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
            } else {
                iArr = new int[]{videoPublishEditModel.mOutVideoWidth, videoPublishEditModel.mOutVideoHeight};
            }
        }
        StringBuilder sb = new StringBuilder("getCompileVideoSize,width:");
        sb.append(iArr[0]);
        sb.append("height:");
        sb.append(iArr[1]);
        C41530am.m132280a(sb.toString());
        return iArr;
    }

    /* renamed from: a */
    private static int m148184a(VideoPublishEditModel videoPublishEditModel, boolean z) {
        C39504az a = C39512ba.m126206a(videoPublishEditModel, z);
        if (a.mo98356d() == 0 || a.mo98355c() == 0) {
            return 0;
        }
        float e = ((float) a.mo98357e()) / ((float) a.mo98355c());
        float f = ((float) a.mo98358f()) / ((float) a.mo98356d());
        if (e != 1.0f && f != 1.0f && e == f) {
            return 1;
        }
        if (a.mo98357e() == a.mo98355c() || a.mo98358f() != a.mo98209b()) {
            return 0;
        }
        return 2;
    }

    /* renamed from: a */
    private static void m148187a(VideoPublishEditModel videoPublishEditModel, C45244a aVar) {
        if (videoPublishEditModel.compileProbeResult == null || videoPublishEditModel.compileProbeResult.getStatus().getState() != CompileProbeResult.State.SUCCESS) {
            aVar.mo108158a(C47464k.m148176a(videoPublishEditModel.uploadSpeedInfo));
            return;
        }
        ResultData data = videoPublishEditModel.compileProbeResult.getData();
        if (data != null) {
            StringBuilder sb = new StringBuilder("CompileProbe setCrf");
            sb.append(data.getCrf());
            C41530am.m132280a(sb.toString());
            aVar.mo108159a(C35563c.f93231M.mo93309e(AVAB.Property.VESynthesisSettings), data.getCrf(), C35563c.f93231M.mo93305a(AVAB.Property.EnableVECompileCrfReencode));
        }
    }

    /* renamed from: a */
    public static VEVideoEncodeSettings m148185a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, VEWatermarkParam vEWatermarkParam) {
        boolean z;
        float f;
        int[] d = m148192d(videoPublishEditModel);
        C45244a aVar = new C45244a(2);
        aVar.mo108173g(C47397a.m148009a(C36964i.m118939o())).mo108149a(d[0], d[1]);
        if (C39501aw.m126167a(videoPublishEditModel) && (d[0] > videoPublishEditModel.videoWidth() || d[1] > videoPublishEditModel.videoHeight())) {
            aVar.mo108172f(3).mo108147a(0.0f).mo108163b(0.0f);
        } else if (videoPublishEditModel.isFastImport || videoPublishEditModel.isDuet()) {
            aVar.mo108172f(1);
        }
        if (!C36964i.m118926b() || C36964i.m118927c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (C34788e.m112192d(videoPublishEditModel.videoType)) {
                f = C35563c.f93232N.f96866a;
            } else {
                f = C35563c.f93232N.f96867b;
            }
            if (f <= 0.0f) {
                f = C36964i.m118930f();
            }
            aVar.mo108166b(true).mo108153a(ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, C47397a.m148008a(f));
            aVar.mo108155a(C40312g.m128761a());
        } else {
            aVar.mo108166b(false).mo108153a(ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, C47397a.m148011b(C36964i.m118936l()));
        }
        ENCODE_PRESET c = C47397a.m148012c(C36964i.m118938n());
        if (c != null) {
            aVar.mo108154a(c);
        }
        aVar.mo108150a(C47397a.m148010a(C36964i.m118937m()));
        if (videoPublishEditModel.hasInfoStickers() || (!C6311g.m19573a(videoPublishEditModel.mEffectList) && videoPublishEditModel.videoFps() < 10)) {
            aVar.mo108148a(30);
        } else if (C35563c.f93230L.mo93342a(Property.EnableSyntheticFpsSet)) {
            int videoFps = videoPublishEditModel.videoFps();
            if (videoFps > 0) {
                aVar.mo108148a(videoFps);
            }
        }
        aVar.mo108161a(!synthetiseResult.needRecode, C35563c.f93230L.mo93342a(Property.VEFastImportIgnoreRecodeForRotation));
        if (videoPublishEditModel.isUseMultiEdit()) {
            aVar.mo108161a(false, C35563c.f93230L.mo93342a(Property.VEFastImportIgnoreRecodeForRotation));
        }
        m148187a(videoPublishEditModel, aVar);
        VEVideoEncodeSettings a = aVar.mo108162a();
        a.setWatermark(vEWatermarkParam);
        videoPublishEditModel.isSyntheticHardEncode = a.getVideoCompileEncodeSetting().useHWEncoder;
        return a;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static dmt.p1861av.video.C47419ae m148186a(com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r22, android.arch.lifecycle.C0043i r23, android.view.SurfaceView r24) {
        /*
            r0 = r22
            dmt.av.video.g r1 = new dmt.av.video.g
            r1.<init>()
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r2 = r0.mEffectList
            if (r2 == 0) goto L_0x0010
            java.util.ArrayList<com.ss.android.ugc.aweme.effect.EffectPointModel> r2 = r0.mEffectList
            dmt.p1861av.video.C47514t.m148293a(r2, r1)
        L_0x0010:
            r2 = -1
            r3 = 3
            dmt.av.video.VEPreviewParams r4 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e.m126247a(r0, r3, r2)
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r5 = r22.getAvetParameter()
            int r5 = r5.getShootMode()
            r6 = 6
            r7 = 0
            if (r5 != r6) goto L_0x0036
            com.ss.android.ugc.aweme.shortvideo.StoryBoomModel r5 = r0.storyBoomModel
            if (r5 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.shortvideo.StoryBoomModel r5 = r0.storyBoomModel
            r4.mAudioPaths = r7
            int r6 = r5.getFps()
            r4.mFps = r6
            java.lang.String[] r5 = r5.getVideoList()
            r4.mVideoPaths = r5
        L_0x0036:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r5 = r0.veAudioEffectParam
            if (r5 == 0) goto L_0x003e
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r5 = r0.veAudioEffectParam
            r4.veAudioEffectParam = r5
        L_0x003e:
            int r5 = r0.videoType
            r6 = 9
            r8 = 1
            r9 = 0
            if (r5 != r6) goto L_0x005a
            int[] r5 = new int[r8]
            r5[r9] = r9
            r4.mVTrimIn = r5
            int[] r5 = new int[r8]
            com.ss.android.ugc.aweme.property.AVSettings r6 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r10 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.StoryImagePlayTime
            int r6 = r6.mo93343b(r10)
            r5[r9] = r6
            r4.mVTrimOut = r5
        L_0x005a:
            android.arch.lifecycle.o r5 = new android.arch.lifecycle.o
            r5.<init>()
            com.ss.android.ugc.aweme.shortvideo.edit.b.b r6 = new com.ss.android.ugc.aweme.shortvideo.edit.b.b
            boolean r10 = r0.autoEnhanceOn
            int r11 = r0.autoEnhanceType
            r6.<init>(r10, r11, r9)
            r5.setValue(r6)
            android.arch.lifecycle.o r6 = new android.arch.lifecycle.o
            r6.<init>()
            r6.setValue(r4)
            android.arch.lifecycle.o r10 = new android.arch.lifecycle.o
            r10.<init>()
            int r11 = r22.isMusic()
            if (r11 != r8) goto L_0x00f4
            dmt.av.video.VEPreviewMusicParams r11 = new dmt.av.video.VEPreviewMusicParams
            r11.<init>()
            r11.f121613h = r3
            java.lang.String r12 = r0.mMusicPath
            r11.f121606a = r12
            int r12 = r0.mMusicStart
            r11.f121607b = r12
            java.lang.String r12 = r0.mMusicPath
            boolean r13 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136538a(r22)
            int r12 = com.p280ss.android.ugc.aweme.utils.C43021cp.m136536a(r12, r13)
            r11.f121608c = r12
            com.ss.android.ugc.aweme.property.AVAB r12 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r13 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableRemove15sCapMusic
            boolean r12 = r12.mo93305a(r13)
            if (r12 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.shortvideo.dw r12 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r12 = r12.mo97931b()
            if (r12 == 0) goto L_0x00e1
            com.ss.android.ugc.aweme.shortvideo.dw r12 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r12 = r12.mo97931b()
            int r12 = r12.getShootDuration()
            if (r12 <= 0) goto L_0x00e1
            int r12 = r11.f121608c
            com.ss.android.ugc.aweme.shortvideo.dw r13 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r13 = r13.mo97931b()
            int r13 = r13.getShootDuration()
            int r12 = r12 - r13
            int r12 = java.lang.Math.abs(r12)
            r13 = 1000(0x3e8, float:1.401E-42)
            if (r12 < r13) goto L_0x00e1
            com.ss.android.ugc.aweme.shortvideo.dw r12 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r12 = r12.mo97931b()
            int r12 = r12.getShootDuration()
            r11.f121609d = r12
            goto L_0x00e5
        L_0x00e1:
            int r12 = r11.f121608c
            r11.f121609d = r12
        L_0x00e5:
            float r12 = r0.musicVolume
            r11.f121610e = r12
            java.lang.String r12 = r0.musicId
            r11.f121611f = r12
            float r12 = r0.previewStartTime
            r11.f121612g = r12
            r10.setValue(r11)
        L_0x00f4:
            android.arch.lifecycle.o r11 = new android.arch.lifecycle.o
            r11.<init>()
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r12 = r0.infoStickerModel
            if (r12 == 0) goto L_0x0159
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r12 = r0.infoStickerModel
            java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r12 = r12.stickers
            boolean r12 = com.bytedance.common.utility.C6311g.m19574b(r12)
            if (r12 == 0) goto L_0x0159
            boolean r12 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39501aw.m126169b(r22)
            if (r12 == 0) goto L_0x0159
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r12 = r0.infoStickerModel
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r12 = r12.clone()
            java.util.List<com.ss.android.ugc.aweme.infosticker.StickerItemModel> r13 = r12.stickers
            java.util.Iterator r13 = r13.iterator()
        L_0x0119:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0155
            java.lang.Object r14 = r13.next()
            com.ss.android.ugc.aweme.infosticker.StickerItemModel r14 = (com.p280ss.android.ugc.aweme.infosticker.StickerItemModel) r14
            boolean r15 = r14.isImageStickerLayer
            if (r15 != 0) goto L_0x0119
            float r15 = r14.currentOffsetX
            float r2 = r14.currentOffsetY
            int r3 = r0.mVideoCanvasWidth
            int r7 = r0.mVideoCanvasHeight
            int r8 = r0.mOutVideoWidth
            int r9 = r0.mOutVideoHeight
            r16 = r15
            r17 = r2
            r18 = r3
            r19 = r7
            r20 = r8
            r21 = r9
            float[] r2 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39501aw.m126168a(r16, r17, r18, r19, r20, r21)
            r3 = 0
            r7 = r2[r3]
            r14.currentOffsetX = r7
            r3 = 1
            r2 = r2[r3]
            r14.currentOffsetY = r2
            r2 = -1
            r3 = 3
            r7 = 0
            r8 = 1
            r9 = 0
            goto L_0x0119
        L_0x0155:
            r11.setValue(r12)
            goto L_0x015e
        L_0x0159:
            com.ss.android.ugc.aweme.infosticker.InfoStickerModel r2 = r0.infoStickerModel
            r11.setValue(r2)
        L_0x015e:
            dmt.av.video.j r2 = new dmt.av.video.j
            r2.<init>()
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            dmt.av.video.j r7 = new dmt.av.video.j
            r7.<init>()
            android.arch.lifecycle.o r8 = new android.arch.lifecycle.o
            r8.<init>()
            dmt.av.video.ae r9 = new dmt.av.video.ae
            int r12 = r0.videoEditorType
            r9.<init>(r12)
            int r12 = dmt.p1861av.video.p1862a.C47398a.f121686o
            r9.mo119560a(r12)
            int r12 = r0.videoType
            boolean r12 = com.p280ss.android.ugc.aweme.photo.publish.C34788e.m112192d(r12)
            int r12 = m148184a(r0, r12)
            r9.mo119573b(r12)
            r12 = 0
            r9.mo119570a(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r9.mo119568a(r12)
            r9.mo119562a(r3)
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            r9.f121771m = r3
            r9.f121767i = r2
            r9.f121769k = r8
            r9.f121768j = r7
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            r9.mo119574b(r3)
            android.arch.lifecycle.o r3 = new android.arch.lifecycle.o
            r3.<init>()
            r9.f121770l = r3
            r9.f121766h = r1
            android.arch.lifecycle.o r1 = new android.arch.lifecycle.o
            r1.<init>()
            r9.f121765g = r1
            r9.f121773o = r11
            android.arch.lifecycle.o r1 = new android.arch.lifecycle.o
            r1.<init>()
            r9.f121764f = r1
            r9.f121763e = r10
            r9.f121775q = r5
            r9.f121762d = r6
            r1 = r23
            r3 = 0
            r9.mo119563a(r3, r1, r3)
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            if (r1 == 0) goto L_0x023c
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            java.lang.String r1 = r1.getKey()
            int r3 = r1.hashCode()
            switch(r3) {
                case 48: goto L_0x0204;
                case 49: goto L_0x01fa;
                case 50: goto L_0x01f0;
                case 51: goto L_0x01e6;
                default: goto L_0x01e5;
            }
        L_0x01e5:
            goto L_0x020e
        L_0x01e6:
            java.lang.String r3 = "3"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x020e
            r1 = 2
            goto L_0x020f
        L_0x01f0:
            java.lang.String r3 = "2"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x020e
            r1 = 1
            goto L_0x020f
        L_0x01fa:
            java.lang.String r3 = "1"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x020e
            r1 = 3
            goto L_0x020f
        L_0x0204:
            java.lang.String r3 = "0"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x020e
            r1 = 0
            goto L_0x020f
        L_0x020e:
            r1 = -1
        L_0x020f:
            switch(r1) {
                case 0: goto L_0x0235;
                case 1: goto L_0x0229;
                case 2: goto L_0x021d;
                case 3: goto L_0x0218;
                default: goto L_0x0212;
            }
        L_0x0212:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0218:
            dmt.av.video.y r1 = dmt.p1861av.video.C47520y.m148316b()
            goto L_0x0239
        L_0x021d:
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            int r1 = r1.getEndPoint()
            long r5 = (long) r1
            dmt.av.video.y r1 = dmt.p1861av.video.C47520y.m148317b(r5)
            goto L_0x0239
        L_0x0229:
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            int r1 = r1.getEndPoint()
            long r5 = (long) r1
            dmt.av.video.y r1 = dmt.p1861av.video.C47520y.m148315a(r5)
            goto L_0x0239
        L_0x0235:
            dmt.av.video.y r1 = dmt.p1861av.video.C47520y.m148314a()
        L_0x0239:
            r2.setValue(r1)
        L_0x023c:
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            if (r1 == 0) goto L_0x0250
            com.ss.android.ugc.aweme.effect.EffectPointModel r1 = r0.mTimeEffect
            java.lang.String r1 = r1.getKey()
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0250
            r1 = 1
            goto L_0x0251
        L_0x0250:
            r1 = 0
        L_0x0251:
            if (r1 == 0) goto L_0x02a8
            boolean r1 = r0.isFastImport
            if (r1 == 0) goto L_0x027a
            com.ss.android.ugc.aweme.shortvideo.a.b r1 = r9.f121778t
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r2 = r22.getPreviewInfo()
            java.lang.String[] r2 = r2.getReverseVideoArray()
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r3 = r22.getPreviewInfo()
            java.lang.String[] r3 = r3.getReverseAudioArray()
            r1.mo38793a(r2, r3)
            com.ss.android.ugc.aweme.shortvideo.a.b r1 = r9.f121778t
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r2 = r22.getPreviewInfo()
            java.lang.String[] r2 = r2.getTempVideoArray()
            r1.mo38802a(r2)
            goto L_0x0287
        L_0x027a:
            com.ss.android.ugc.aweme.shortvideo.a.b r1 = r9.f121778t
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r2 = r22.getPreviewInfo()
            java.lang.String[] r2 = r2.getReverseVideoArray()
            r1.mo38821b(r2)
        L_0x0287:
            com.ss.android.ugc.aweme.shortvideo.a.b r1 = r9.f121778t
            r2 = 1
            r1.mo38839e(r2)
            boolean r1 = r0.isFastImport
            if (r1 == 0) goto L_0x02a8
            com.ss.android.ugc.aweme.shortvideo.a.b r1 = r9.f121778t
            com.ss.android.ugc.aweme.shortvideo.a.b r2 = r9.f121778t
            com.ss.android.vesdk.runtime.b r2 = r2.mo38796a()
            int r2 = r2.f116803h
            com.ss.android.ugc.aweme.shortvideo.a.b r3 = r9.f121778t
            com.ss.android.vesdk.runtime.b r3 = r3.mo38796a()
            int r3 = r3.f116804i
            float r4 = r4.mVolume
            r1.mo38803a(r2, r3, r4)
        L_0x02a8:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r0.veAudioRecorderParam
            if (r1 == 0) goto L_0x02b1
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r1 = r0.veAudioRecorderParam
            r8.setValue(r1)
        L_0x02b1:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r0.veAudioEffectParam
            if (r1 == 0) goto L_0x02cf
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r0.veAudioEffectParam
            r2 = 0
            r1.setShowErrorToast(r2)
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r1 = r0.veAudioEffectParam
            r2 = 0
            r1.setPreprocessResult(r2)
            boolean r1 = r22.isReviewVideo()
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r2 = r0.veAudioEffectParam
            r3 = 1
            dmt.av.video.l r1 = dmt.p1861av.video.C47466l.m148179a(r3, r1, r2)
            r7.setValue(r1)
        L_0x02cf:
            int r1 = r0.mSelectedId
            if (r1 == 0) goto L_0x0314
            com.ss.android.ugc.aweme.property.AVAB r1 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r2 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableFilterIntensityJust
            boolean r1 = r1.mo93305a(r2)
            if (r1 == 0) goto L_0x02f9
            com.ss.android.ugc.aweme.shortvideo.a.b r1 = r9.f121778t
            com.ss.android.ugc.aweme.port.in.n r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93224F
            com.ss.android.ugc.aweme.filter.e.a r2 = r2.mo70097l()
            com.ss.android.ugc.aweme.filter.e.c r2 = r2.mo74949b()
            int r3 = r0.mSelectedId
            com.ss.android.ugc.aweme.filter.g r2 = r2.mo74962a(r3)
            java.lang.String r2 = r2.mo74978b()
            float r0 = r0.mSelectedFilterIntensity
            r1.mo38817b(r2, r0)
            goto L_0x0314
        L_0x02f9:
            com.ss.android.ugc.aweme.shortvideo.a.b r1 = r9.f121778t
            com.ss.android.ugc.aweme.port.in.n r2 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93224F
            com.ss.android.ugc.aweme.filter.e.a r2 = r2.mo70097l()
            com.ss.android.ugc.aweme.filter.e.c r2 = r2.mo74949b()
            int r0 = r0.mSelectedId
            com.ss.android.ugc.aweme.filter.g r0 = r2.mo74962a(r0)
            java.lang.String r0 = r0.mo74978b()
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.mo38779a(r0, r2)
        L_0x0314:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p1861av.video.C47468m.m148186a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.arch.lifecycle.i, android.view.SurfaceView):dmt.av.video.ae");
    }

    /* renamed from: a */
    public final C39359dv<SynthetiseResult> mo119591a(VideoPublishEditModel videoPublishEditModel, VEWatermarkParam vEWatermarkParam, C0879b bVar) {
        final VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        final VEWatermarkParam vEWatermarkParam2 = vEWatermarkParam;
        final C0879b bVar2 = bVar;
        C474691 r0 = new C39359dv<SynthetiseResult>("VECompiler") {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ C47419ae mo119592a(VideoPublishEditModel videoPublishEditModel) throws Exception {
                return C47468m.m148186a(videoPublishEditModel, (C0043i) C47468m.this, (SurfaceView) null);
            }

            {
                final C47419ae aeVar;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C1592h a = C1592h.m7855a((Callable<TResult>) new C47473n<TResult>(this, videoPublishEditModel2), (Executor) C23364n.f61448a);
                    try {
                        a.mo6892g();
                    } catch (InterruptedException unused) {
                    }
                    aeVar = (C47419ae) a.mo6890e();
                } else {
                    aeVar = C47468m.m148186a(videoPublishEditModel2, (C0043i) C47468m.this, (SurfaceView) null);
                }
                final SynthetiseResult synthetiseResult = new SynthetiseResult();
                synthetiseResult.draftHardEncode = videoPublishEditModel2.mHardEncode;
                synthetiseResult.outputFile = videoPublishEditModel2.getOutputFile();
                synthetiseResult.needRecode = C47468m.m148190b(videoPublishEditModel2);
                synthetiseResult.flags |= 1;
                synthetiseResult.isEnableFpsSet = C35563c.f93230L.mo93342a(Property.EnableSyntheticFpsSet);
                synthetiseResult.inputVideoFile = videoPublishEditModel2.videoPath();
                synthetiseResult.videoWidth = videoPublishEditModel2.videoWidth();
                synthetiseResult.videoHeight = videoPublishEditModel2.videoHeight();
                synthetiseResult.texts = videoPublishEditModel2.texts;
                synthetiseResult.isFastImport = videoPublishEditModel2.isFastImport;
                synthetiseResult.segmentCount = videoPublishEditModel2.segmentCounts();
                synthetiseResult.fastImportResolution = videoPublishEditModel2.fastImportResolution;
                synthetiseResult.hasSubtitle = videoPublishEditModel2.hasSubtitle();
                if (synthetiseResult.isFastImport) {
                    C38790a.m123897a(videoPublishEditModel2.getPreviewInfo().getVideoList(), aeVar.f121778t);
                }
                C39604b.m126715a((C15389d) aeVar.f121778t, videoPublishEditModel2.getMainBusinessContext());
                aeVar.f121778t.mo38829c(C47468m.this.f121878c);
                if (C47468m.this.f121879d == null) {
                    C47468m.this.f121879d = new C47474o(this, synthetiseResult, aeVar);
                }
                aeVar.f121778t.mo38801a(C47468m.this.f121879d);
                if (C47468m.this.f121880e == null) {
                    C47468m.this.f121880e = new C45329l() {

                        /* renamed from: a */
                        AtomicInteger f121885a = new AtomicInteger(0);

                        /* renamed from: a */
                        private boolean m148197a() {
                            if (vEWatermarkParam2 == null || this.f121885a.incrementAndGet() == 2) {
                                return true;
                            }
                            return false;
                        }

                        /* access modifiers changed from: 0000 */
                        /* renamed from: a */
                        public final /* synthetic */ Object mo119594a(int i, int i2, float f) throws Exception {
                            List<String> list = C47468m.this.f121877b;
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
                            if (vEWatermarkParam2 == null) {
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
                                sb.append(C474691.this.isDone());
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
                            if (!C474691.this.isDone()) {
                                if (i == 4103) {
                                    if (i2 == 0) {
                                        synthetiseResult.videoLength = f;
                                    }
                                    if (m148197a()) {
                                        synthetiseResult.fileFps = (double) C47440an.m148110b(videoPublishEditModel2.mOutputFile);
                                        try {
                                            new C47457f().mo119586a(videoPublishEditModel2);
                                            if (videoPublishEditModel2.isSaveLocalWithoutWaterMark()) {
                                                C7276d.m22822e(C39811er.f103476l);
                                                C7276d.m22820d(synthetiseResult.outputFile, videoPublishEditModel2.getLocalTempPath());
                                            }
                                        } catch (Throwable unused) {
                                        }
                                        if (C474691.this.mo47088b(synthetiseResult)) {
                                            C1592h.m7853a((Callable<TResult>) new C47475p<TResult>(aeVar));
                                        }
                                    }
                                } else if (i == 4105 && i2 == i3) {
                                    C474691.this.mo97923a((int) (f * 100.0f));
                                } else if (i == 4112) {
                                    synthetiseResult.synthetiseCPUEncode = i2 ^ 1;
                                } else if (i == 4113) {
                                    synthetiseResult.audioLength = f;
                                } else if (i == 4114) {
                                    C1592h.m7855a((Callable<TResult>) new C47476q<TResult>(this, i, i2, f), C1592h.f5958b);
                                } else if (i == 4116) {
                                    if (C35563c.f93231M.mo93305a(AVAB.Property.EnableUploadMetadata)) {
                                        if (videoPublishEditModel2.metadataMap == null) {
                                            videoPublishEditModel2.metadataMap = C20455a.m67874b();
                                        } else {
                                            videoPublishEditModel2.metadataMap.putAll(C20455a.m67874b());
                                        }
                                    }
                                    C6921a.m21555a("receive prepare done event in vecomplier");
                                    SubtitleModule.m131121a(aeVar.f121778t, C35563c.f93238a, videoPublishEditModel2, SubtitleModule.m131125ac());
                                }
                            }
                        }
                    };
                }
                aeVar.f121778t.mo38824b(C47468m.this.f121880e);
                bVar2.mo3277a(new C0880a() {
                    /* renamed from: a */
                    public final void mo3282a() {
                        SynthetiseResult clone = synthetiseResult.clone();
                        clone.ret = SynthetiseException.SYNTHETIC_CANCEL_CODE;
                        if (C474691.this.mo47087a((Throwable) new SynthetiseException("VECompiler canceled.", clone))) {
                            aeVar.f121778t.mo38876t();
                        }
                        if (synthetiseResult.outputFile != null) {
                            File file = new File(synthetiseResult.outputFile);
                            if (file.exists()) {
                                file.delete();
                            }
                            if (vEWatermarkParam2 != null) {
                                File file2 = new File(vEWatermarkParam2.extFile);
                                if (file2.exists()) {
                                    file2.delete();
                                }
                            }
                        }
                    }
                });
                try {
                    final VEVideoEncodeSettings a2 = C47468m.m148185a(videoPublishEditModel2, synthetiseResult, vEWatermarkParam2);
                    aeVar.f121778t.mo38784a("te_is_fast_import", String.valueOf(videoPublishEditModel2.isFastImport ? 1 : 0));
                    if (videoPublishEditModel2.isMultiVideoEdit() && !TextUtils.isEmpty(videoPublishEditModel2.multiEditVideoRecordData.videoMetaData)) {
                        aeVar.f121778t.mo38784a("description", videoPublishEditModel2.multiEditVideoRecordData.videoMetaData);
                    }
                    if (C35563c.f93231M.mo93305a(AVAB.Property.VideoSynthesisOpt)) {
                        C6304f.submitRunnable(new Runnable() {
                            public final void run() {
                                aeVar.f121778t.mo38804a(videoPublishEditModel2.getOutputFile(), (String) null, a2);
                            }
                        });
                    } else {
                        aeVar.f121778t.mo38804a(videoPublishEditModel2.getOutputFile(), (String) null, a2);
                    }
                } catch (Throwable th) {
                    mo47087a(th);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo119593a(SynthetiseResult synthetiseResult, C47419ae aeVar, int i, int i2, float f, String str) {
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
        C18246h.m60214a((C18253l<V>) r0, (C18245g<? super V>) new C39917ga<Object>(), C1592h.f5958b);
        C18246h.m60214a((C18253l<V>) r0, (C18245g<? super V>) new C39936gb<Object>(videoPublishEditModel.getOutputFile(), (long) videoPublishEditModel.getVideoLength()), C1592h.f5958b);
        C18246h.m60214a((C18253l<V>) r0, (C18245g<? super V>) new C39911fy<Object>(), C1592h.f5958b);
        C18246h.m60214a((C18253l<V>) r0, (C18245g<? super V>) new C39912fz<Object>(this.f121877b), C1592h.f5958b);
        return r0;
    }
}
