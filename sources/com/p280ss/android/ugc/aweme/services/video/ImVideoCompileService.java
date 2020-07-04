package com.p280ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.Environment;
import android.p013ss.com.vboost.C0170b.C0171a;
import android.p013ss.com.vboost.C0173d;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36963h;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileParam;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import com.p280ss.android.ugc.aweme.shortvideo.record.C40312g;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.C42018a;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.C42026b;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import com.p280ss.android.vesdk.VEUtils;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.C45244a;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import dmt.p1861av.video.C47440an;
import java.io.File;
import java.io.InputStream;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.LongRef;
import kotlin.reflect.C7595j;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService */
public final class ImVideoCompileService implements IImVideoCompileService {
    public static final Companion Companion = new Companion(null);
    public static final C7541d instance$delegate = C7546e.m23569a(ImVideoCompileService$Companion$instance$2.INSTANCE);
    private static final String sDir;
    public boolean isHardCodeFallback;

    /* renamed from: com.ss.android.ugc.aweme.services.video.ImVideoCompileService$Companion */
    public static final class Companion {
        static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(Companion.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/services/video/ImVideoCompileService;"))};

        private Companion() {
        }

        public static /* synthetic */ void instance$annotations() {
        }

        public final ImVideoCompileService getInstance() {
            return (ImVideoCompileService) ImVideoCompileService.instance$delegate.getValue();
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public static final ImVideoCompileService getInstance() {
        return Companion.getInstance();
    }

    private final int toVESDKVideoBitrateFromSyntheticVideoBitrate(float f) {
        return (int) (f * 4.0f * 1000.0f * 1000.0f);
    }

    private final int toVESDKVideoBitrateFromSyntheticVideoQuality(int i) {
        return i;
    }

    private final ENCODE_PROFILE getEncodeProfile() {
        ENCODE_PROFILE a = C40312g.m128761a();
        C7573i.m23582a((Object) a, "RecordUtil.getMappedHardwareProfile()");
        return a;
    }

    private final Pair<Integer, Integer> getDefaultOutputVideoSize() {
        return C7579l.m23633a(Integer.valueOf(720), Integer.valueOf(1280));
    }

    private final Pair<ENCODE_BITRATE_MODE, Integer> getSoftEncodeBitrateConfig() {
        return new Pair<>(ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, Integer.valueOf(toVESDKVideoBitrateFromSyntheticVideoQuality(C36964i.m118936l())));
    }

    private final boolean getUseHardwareEncode() {
        if (!C36964i.m118926b() || C36964i.m118927c() || this.isHardCodeFallback) {
            return false;
        }
        return true;
    }

    public final VEEditor createVEEditor() {
        VEEditor vEEditor = new VEEditor(getCompileWorkSpace());
        vEEditor.mo107899a(false);
        vEEditor.mo107944d(0);
        vEEditor.mo107946d(true);
        return vEEditor;
    }

    public final String getOutputVideoFilePath() {
        C7276d.m22803a(sDir, false);
        StringBuilder sb = new StringBuilder();
        sb.append(sDir);
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    private final String getCompileWorkSpace() {
        StringBuilder sb = new StringBuilder();
        sb.append(sDir);
        sb.append("compile/");
        File a = C7276d.m22803a(sb.toString(), false);
        C7573i.m23582a((Object) a, "FileHelper.createFile(path, false)");
        String absolutePath = a.getAbsolutePath();
        C7573i.m23582a((Object) absolutePath, "FileHelper.createFile(path, false).absolutePath");
        return absolutePath;
    }

    private final Pair<ENCODE_BITRATE_MODE, Integer> getHardEncodeBitrateConfig() {
        C36963h hVar = C35563c.f93232N;
        C7573i.m23582a((Object) hVar, "AVEnv.FESTIVAL_SETTINGS");
        float f = hVar.f96867b;
        if (f <= 0.0f) {
            f = C36964i.m118930f();
        }
        return new Pair<>(ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, Integer.valueOf(toVESDKVideoBitrateFromSyntheticVideoBitrate(f)));
    }

    static {
        StringBuilder sb;
        String str;
        if (C7163a.m22363a()) {
            sb = new StringBuilder();
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            C7573i.m23582a((Object) externalStorageDirectory, "Environment.getExternalStorageDirectory()");
            sb.append(externalStorageDirectory.getPath());
            str = "/aweme/im/video/";
        } else {
            sb = new StringBuilder();
            sb.append(C7276d.m22818d());
            str = "/im/video/";
        }
        sb.append(str);
        sDir = sb.toString();
    }

    private final <T> void safeOnComplete(C47870u<T> uVar) {
        if (uVar.isDisposed()) {
            uVar = null;
        }
        if (uVar != null) {
            uVar.mo19238a();
        }
    }

    private final boolean enableRemux(CompileParam compileParam) {
        if (C47440an.m148111c(compileParam.getRawVideoPath()) * 1000 > C35563c.f93230L.mo93343b(Property.BitrateOfRecodeThreshold)) {
            return true;
        }
        return false;
    }

    public final C7492s<Boolean> getVideoWidthHeight(CompileParam compileParam) {
        C7492s<Boolean> a = C7492s.m23282a((C7495v<T>) new ImVideoCompileService$getVideoWidthHeight$1<T>(this, compileParam));
        C7573i.m23582a((Object) a, "Observable.create<Boolea…)\n            }\n        }");
        return a;
    }

    public final String getVideoFileMD5(String str) {
        File file = new File(str);
        if (file.length() > 524288) {
            return C42026b.m133583a(C42018a.m133567a((InputStream) C42018a.m133562a(str)));
        }
        return C42026b.m133581a(file);
    }

    public final VEVideoEncodeSettings createEncodeSettings(CompileParam compileParam) {
        C45244a aVar = new C45244a(2);
        boolean useHardwareEncode = getUseHardwareEncode();
        aVar.mo108166b(useHardwareEncode);
        if (useHardwareEncode) {
            aVar.mo108155a(getEncodeProfile());
            Pair hardEncodeBitrateConfig = getHardEncodeBitrateConfig();
            aVar.mo108153a((ENCODE_BITRATE_MODE) hardEncodeBitrateConfig.getFirst(), ((Number) hardEncodeBitrateConfig.getSecond()).intValue());
        } else {
            Pair softEncodeBitrateConfig = getSoftEncodeBitrateConfig();
            aVar.mo108153a((ENCODE_BITRATE_MODE) softEncodeBitrateConfig.getFirst(), ((Number) softEncodeBitrateConfig.getSecond()).intValue());
        }
        Pair outputVideoSize = outputVideoSize(compileParam);
        aVar.mo108149a(((Number) outputVideoSize.getFirst()).intValue(), ((Number) outputVideoSize.getSecond()).intValue());
        aVar.mo108161a(enableRemux(compileParam), true);
        VEVideoEncodeSettings a = aVar.mo108162a();
        C7573i.m23582a((Object) a, "settingsBuilder.build()");
        return a;
    }

    public final Pair<Integer, Integer> outputVideoSize(CompileParam compileParam) {
        if (compileParam.getVideoWidth() < 0 || compileParam.getVideoHeight() < 0) {
            C6921a.m21555a("ImVideoCompileService outputVideoSize use default");
            return getDefaultOutputVideoSize();
        }
        int videoWidth = compileParam.getVideoWidth();
        int videoHeight = compileParam.getVideoHeight();
        if (compileParam.getVideoWidth() > 720) {
            videoHeight = (int) ((((float) compileParam.getVideoHeight()) * 720.0f) / ((float) compileParam.getVideoWidth()));
            videoWidth = 720;
        } else if (compileParam.getVideoHeight() > 1280) {
            videoWidth = (int) ((((float) compileParam.getVideoWidth()) * 1280.0f) / ((float) compileParam.getVideoHeight()));
            videoHeight = 1280;
        }
        return C7579l.m23633a(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
    }

    public final C7492s<CompileResult> compileImVideo(CompileParam compileParam) {
        C7573i.m23587b(compileParam, "compileParam");
        CompileResult compileResult = new CompileResult();
        LongRef longRef = new LongRef();
        longRef.element = System.currentTimeMillis();
        LongRef longRef2 = new LongRef();
        LongRef longRef3 = new LongRef();
        longRef3.element = 0;
        StringBuilder sb = new StringBuilder("ImVideoCompileService compileImVideo start: compileParam=");
        sb.append(compileParam);
        C6921a.m21555a(sb.toString());
        C7492s videoCover = getVideoCover(compileParam.getRawVideoPath(), 240, 240);
        ImVideoCompileService$compileImVideo$1 imVideoCompileService$compileImVideo$1 = new ImVideoCompileService$compileImVideo$1(this, compileResult, longRef2, longRef3, longRef, compileParam);
        C7492s a = videoCover.mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) imVideoCompileService$compileImVideo$1);
        ImVideoCompileService$compileImVideo$2 imVideoCompileService$compileImVideo$2 = new ImVideoCompileService$compileImVideo$2(this, longRef2, longRef3, longRef, compileParam, compileResult);
        C7492s a2 = a.mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) imVideoCompileService$compileImVideo$2);
        CompileResult compileResult2 = compileResult;
        LongRef longRef4 = longRef2;
        LongRef longRef5 = longRef3;
        LongRef longRef6 = longRef;
        ImVideoCompileService$compileImVideo$3 imVideoCompileService$compileImVideo$3 = new ImVideoCompileService$compileImVideo$3(this, compileResult2, longRef4, longRef5, longRef6);
        C7492s a3 = a2.mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) imVideoCompileService$compileImVideo$3);
        ImVideoCompileService$compileImVideo$4 imVideoCompileService$compileImVideo$4 = new ImVideoCompileService$compileImVideo$4(this, compileResult2, longRef4, longRef5, longRef6);
        C7492s<CompileResult> a4 = a3.mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) imVideoCompileService$compileImVideo$4);
        C7573i.m23582a((Object) a4, "getVideoCover(compilePar…sult) }\n                }");
        return a4;
    }

    public final <T> void safeOnSingleNext(C47870u<T> uVar, T t) {
        safeOnNext(uVar, t);
        safeOnComplete(uVar);
    }

    private final <T> void safeOnNext(C47870u<T> uVar, T t) {
        if (uVar.isDisposed()) {
            uVar = null;
        }
        if (uVar != null) {
            uVar.mo19239a((Object) t);
        }
    }

    public final <T> void safeOnError(C47870u<T> uVar, Throwable th) {
        if (uVar.isDisposed()) {
            uVar = null;
        }
        if (uVar != null) {
            uVar.mo19240a(th);
        }
    }

    public final C7492s<Boolean> compileVideo(CompileParam compileParam, CompileResult compileResult) {
        C7492s<Boolean> a = C7492s.m23282a((C7495v<T>) new ImVideoCompileService$compileVideo$1<T>(this, compileParam, compileResult));
        C7573i.m23582a((Object) a, "Observable.create<Boolea…)\n            }\n        }");
        return a;
    }

    public final int initVEEditor(VEEditor vEEditor, String str) {
        VEEditor.m142489b(false);
        return vEEditor.mo107906a(new String[]{str}, (String[]) null, (String[]) null, VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL);
    }

    public final boolean getVideoFileInfoWithRotation(String str, int[] iArr) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(iArr, "outInfo");
        C35574k.m114859a().mo70100o();
        if (VEUtils.getVideoFileInfo(C43142i.m136842a(str, MediaType.VIDEO), iArr) != 0) {
            return false;
        }
        if (iArr[2] % NormalGiftView.ALPHA_180 != 0) {
            int i = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = i;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[SYNTHETIC, Splitter:B:21:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[SYNTHETIC, Splitter:B:27:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void saveBitmapToLocal(android.graphics.Bitmap r4, java.lang.String r5) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L_0x000e
            r0.delete()
        L_0x000e:
            r5 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002e }
            r1.<init>(r0)     // Catch:{ Exception -> 0x002e }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r0 = 80
            r2 = r1
            java.io.OutputStream r2 = (java.io.OutputStream) r2     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r4.compress(r5, r0, r2)     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r1.flush()     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r1.close()     // Catch:{ Exception -> 0x0025 }
            goto L_0x003a
        L_0x0025:
            return
        L_0x0026:
            r4 = move-exception
            r5 = r1
            goto L_0x003b
        L_0x0029:
            r4 = move-exception
            r5 = r1
            goto L_0x002f
        L_0x002c:
            r4 = move-exception
            goto L_0x003b
        L_0x002e:
            r4 = move-exception
        L_0x002f:
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x002c }
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r4)     // Catch:{ all -> 0x002c }
            if (r5 == 0) goto L_0x003a
            r5.close()     // Catch:{ Exception -> 0x0039 }
        L_0x0039:
            return
        L_0x003a:
            return
        L_0x003b:
            if (r5 == 0) goto L_0x0040
            r5.close()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.services.video.ImVideoCompileService.saveBitmapToLocal(android.graphics.Bitmap, java.lang.String):void");
    }

    private final C7492s<String> getVideoCover(String str, int i, int i2) {
        C7492s<String> a = C7492s.m23282a((C7495v<T>) new ImVideoCompileService$getVideoCover$1<T>(this, str, i, i2));
        C7573i.m23582a((Object) a, "Observable.create<String…e\n            }\n        }");
        return a;
    }

    public final Bitmap scaleBitmap(Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (i <= 0 || i2 <= 0 || bitmap.getWidth() < i || bitmap.getHeight() < i2) {
            return bitmap;
        }
        if (bitmap.getWidth() < bitmap.getHeight()) {
            f2 = (float) i;
            f = (f2 / ((float) bitmap.getWidth())) * ((float) bitmap.getHeight());
        } else {
            f = (float) i2;
            f2 = (f / ((float) bitmap.getHeight())) * ((float) bitmap.getWidth());
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f2, (int) f, true);
        C7573i.m23582a((Object) createScaledBitmap, "Bitmap.createScaledBitma… newHeight.toInt(), true)");
        return createScaledBitmap;
    }

    public final Bitmap fetchThumbnailByVBoostOpt(long j, long j2, boolean z, Options options) {
        int i;
        if (!C35563c.f93231M.mo93305a(AVAB.Property.EnableVboostOpt)) {
            return null;
        }
        if (z) {
            i = 3;
        } else {
            i = 1;
        }
        C0171a a = C0173d.m477b().mo369a();
        if (a != null) {
            return a.mo367a((int) j, j2, i, 2, options);
        }
        return null;
    }

    static /* synthetic */ C7492s getVideoCover$default(ImVideoCompileService imVideoCompileService, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        return imVideoCompileService.getVideoCover(str, i, i2);
    }
}
