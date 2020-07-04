package com.p280ss.android.vesdk;

import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ttve.model.C20467g;
import com.p280ss.android.ttve.model.VEMusicWaveBean;
import com.p280ss.android.ttve.monitor.C20477e;
import com.p280ss.android.ttve.nativePort.TEAudioUtilsCallback;
import com.p280ss.android.ttve.nativePort.TEEffectUtils;
import com.p280ss.android.ttve.nativePort.TEEffectUtils.ImageListener;
import com.p280ss.android.ttve.nativePort.TEImageFactory;
import com.p280ss.android.ttve.nativePort.TEImageFactory.ImageInfo;
import com.p280ss.android.ttve.nativePort.TEVideoUtils;
import com.p280ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener;
import com.p280ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.vesdk.VEListener.C45221q;
import com.p280ss.android.vesdk.VERecordData.VERecordSegmentData;
import com.p280ss.android.vesdk.p1776d.C45306a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.vesdk.VEUtils */
public class VEUtils {

    /* renamed from: com.ss.android.vesdk.VEUtils$a */
    public interface C45234a {
        /* renamed from: a */
        void mo80178a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEUtils$b */
    public static final class C45235b {

        /* renamed from: a */
        public String f116389a;

        /* renamed from: b */
        public String f116390b;

        /* renamed from: c */
        public String f116391c;

        /* renamed from: d */
        public String f116392d;

        /* renamed from: e */
        public int f116393e = -1;

        /* renamed from: f */
        public float f116394f = 0.4f;

        /* renamed from: g */
        public int f116395g = 8;

        /* renamed from: h */
        public int f116396h = NormalGiftView.ALPHA_180;

        /* renamed from: i */
        public int f116397i;

        /* renamed from: j */
        public int f116398j;

        /* renamed from: k */
        public int f116399k;

        /* renamed from: l */
        public int f116400l;

        /* renamed from: m */
        public int f116401m;
    }

    public static String getVideoEncodeTypeByID(int i) {
        return i != 5 ? i != 13 ? i != 28 ? i != 174 ? "unknown" : "h265" : "h264" : "mpeg4" : "h263";
    }

    public static boolean isSupportGLES3() {
        return TEVideoUtils.isSupportGLES3();
    }

    public static String findBestRemuxSuffix(String str) throws VEException {
        return TEVideoUtils.findBestRemuxSuffix(str);
    }

    public static int isCanImport(String str) {
        C20477e.m67936a("iesve_veutils_if_video_support_import", 1, (C45306a) null);
        return TEVideoUtils.isCanImport(str);
    }

    public static long getVideoReverseSize(String str) {
        int[] iArr = new int[10];
        if (getVideoFileInfo(str, iArr) < 0) {
            return -1;
        }
        return (((long) (iArr[3] / 1000)) * DouPlusShareGuideExperiment.MIN_VALID_DURATION) / 1024;
    }

    private static String ms2TimeFormat(int i) {
        long j = (long) i;
        return C1642a.m8035a(Locale.ENGLISH, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j))), Long.valueOf(j - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j)))});
    }

    public static int concatVideo(String[] strArr, String str) {
        return TEVideoUtils.concat(strArr, str);
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return TEVideoUtils.getAudioFileInfoForAllTracks(str, iArr);
    }

    public static int execFFmpegCommand(String str, final C45234a aVar) {
        return TEVideoUtils.executeFFmpegCommand(str, new ExecuteCommandListener() {
            public final void onProgressChanged(int i) {
                if (aVar != null) {
                    aVar.mo80178a(i);
                }
            }
        });
    }

    public static int getQREncodedData(String str, final C45221q qVar) {
        return TEEffectUtils.getQREncodedData(str, null, new ImageListener() {
            public final void onData(int[] iArr, int i, int i2, int i3) {
            }
        });
    }

    public static int getVideoFileInfo(String str, int[] iArr) {
        C20477e.m67936a("iesve_veutils_get_video_info", 1, (C45306a) null);
        return TEVideoUtils.getVideoFileInfo(str, iArr);
    }

    public static VEMVAlgorithmConfig getMVAlgorithmConfigs(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return null;
        }
        return (VEMVAlgorithmConfig) TEVideoUtils.getMVAlgorithmConfigs(str, list);
    }

    public static int reverseAudio(String str, String str2) {
        StringBuilder sb = new StringBuilder("ffmpeg -i ");
        sb.append(str);
        sb.append(" -af areverse ");
        sb.append(str2);
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int extractVideo(String str, String str2) {
        StringBuilder sb = new StringBuilder("extractVideo... inFile:");
        sb.append(str);
        sb.append(", outFile:");
        sb.append(str2);
        C45372t.m143403a("VEUtils", sb.toString());
        int isCanImport = isCanImport(str);
        if (isCanImport == 0) {
            return TEVideoUtils.extractVideo(str, str2);
        }
        C45372t.m143407c("VEUtils", "input file is not supported!");
        return isCanImport;
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        if (str == null || str2 == null) {
            C45372t.m143409d("VEUtils", "getMusicDefaultAlgorithm failed path is wrong");
            return -100;
        }
        StringBuilder sb = new StringBuilder("getMusicDefaultAlgorithm musicPath: ");
        sb.append(str);
        sb.append(" algorithmPath: ");
        sb.append(str2);
        C45372t.m143403a("VEUtils", sb.toString());
        return TEVideoUtils.getMusicDefaultAlgorithm(str, str2);
    }

    public static int convertVideo2Webp(C45235b bVar, C45234a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (bVar.f116400l > 0 || bVar.f116401m > 0) {
            sb.append(" -accurate_seek");
            sb.append(" -ss ");
            sb.append(ms2TimeFormat(bVar.f116400l));
            sb.append(" -t ");
            sb.append(ms2TimeFormat(bVar.f116401m));
        }
        sb.append(" -y -i ");
        sb.append(bVar.f116389a);
        sb.append(" -vf scale=");
        sb.append(bVar.f116396h);
        sb.append(":");
        sb.append(bVar.f116397i);
        sb.append(" -r ");
        sb.append(bVar.f116395g);
        sb.append(" -loop 0 ");
        sb.append(bVar.f116390b);
        return execFFmpegCommand(sb.toString(), aVar);
    }

    public static int extractVideoByCommand(String str, String str2) {
        StringBuilder sb = new StringBuilder("extractVideoByCommand... inFile:");
        sb.append(str);
        sb.append(", outFile:");
        sb.append(str2);
        C45372t.m143403a("VEUtils", sb.toString());
        int isCanImport = isCanImport(str);
        if (isCanImport != 0) {
            C45372t.m143407c("VEUtils", "input file is not supported!");
            return isCanImport;
        }
        StringBuilder sb2 = new StringBuilder("ffmpeg -i ");
        sb2.append(str);
        sb2.append(" -vcodec copy -an ");
        sb2.append(str2);
        return execFFmpegCommand(sb2.toString(), null);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        C20477e.m67936a("iesve_veutils_get_audio_info", 1, (C45306a) null);
        int audioFileInfo = TEVideoUtils.getAudioFileInfo(str, iArr);
        if (str.endsWith(".aac")) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
            if (extractMetadata != null && extractMetadata.startsWith("audio/aac")) {
                C45372t.m143407c("VEUtils", "getAudioFileInfo use Android sys to get aac duration because ffmpeg is not accurate");
                iArr[3] = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            }
            mediaMetadataRetriever.release();
        }
        return audioFileInfo;
    }

    public static String getFileBestStreamAudio(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int fileAudio = TEVideoUtils.getFileAudio(str, str2, arrayList, true);
        if (fileAudio != 0) {
            StringBuilder sb = new StringBuilder("getFileBestStreamAudio error ");
            sb.append(fileAudio);
            C45372t.m143409d("VEUtils", sb.toString());
            return null;
        } else if (arrayList.size() > 0) {
            if (arrayList.size() > 1) {
                C45372t.m143407c("VEUtils", "getFileBestStreamAudio, find more than one stream");
            }
            return (String) arrayList.get(0);
        } else {
            C45372t.m143409d("VEUtils", "getFileBestStreamAudio error, outFiles.size == 0 ");
            return null;
        }
    }

    public static int convertVideo2Gif(C45235b bVar, C45234a aVar) {
        int i;
        String str;
        int execFFmpegCommand = execFFmpegCommand(C1642a.m8035a(Locale.US, "ffmpeg -y -i %s -vf fps=%d,scale=%d:-1:flags=lanczos,palettegen %s", new Object[]{bVar.f116389a, Integer.valueOf(bVar.f116395g), Integer.valueOf(bVar.f116396h), bVar.f116391c}), null);
        if (execFFmpegCommand != 0) {
            return execFFmpegCommand;
        }
        int[] iArr = new int[10];
        int videoFileInfo = getVideoFileInfo(bVar.f116389a, iArr);
        if (videoFileInfo != 0) {
            return videoFileInfo;
        }
        int i2 = iArr[0];
        if (bVar.f116393e < 0) {
            ImageInfo imageInfo = TEImageFactory.getImageInfo(null, bVar.f116392d);
            int i3 = 278;
            float f = ((float) i2) / 540.0f;
            if (imageInfo != null && imageInfo.getWidth() > 0) {
                i3 = imageInfo.getWidth();
            }
            i = (int) (((float) i3) * f);
        } else {
            i = bVar.f116393e;
        }
        if (TextUtils.isEmpty(bVar.f116392d)) {
            str = C1642a.m8035a(Locale.US, "ffmpeg -y -i %s -i %s -filter_complex setpts=%f*PTS,fps=%d,scale=%d:-1:flags=lanczos[x];[x][1:v]paletteuse %s", new Object[]{bVar.f116389a, bVar.f116391c, Float.valueOf(bVar.f116394f), Integer.valueOf(bVar.f116395g), Integer.valueOf(bVar.f116396h), bVar.f116390b});
        } else {
            str = C1642a.m8035a(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [1:v]scale=%d:-1[o1];[0:v]setpts=%f*PTS,fps=%d[o0];[o0][o1]overlay=x=%d:y=H-h-%d,scale=%d:-1:flags=lanczos[x];[x][2:v]paletteuse %s", new Object[]{bVar.f116389a, bVar.f116392d, bVar.f116391c, Integer.valueOf(i), Float.valueOf(bVar.f116394f), Integer.valueOf(bVar.f116395g), Integer.valueOf(bVar.f116398j), Integer.valueOf(bVar.f116399k), Integer.valueOf(bVar.f116396h), bVar.f116390b});
        }
        int execFFmpegCommand2 = execFFmpegCommand(str, aVar);
        new File(bVar.f116391c).delete();
        return execFFmpegCommand2;
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList) {
        return TEVideoUtils.getFileAudio(str, str2, arrayList, false);
    }

    public static int isCanTransCode(String str, int i, int i2) {
        return TEVideoUtils.isCanTransCode(str, i, i2);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2) {
        return getMusicWaveData(str, i, i2, 10, 0, 0);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i, int i2) {
        if (fArr.length == 0) {
            return null;
        }
        return TEVideoUtils.getResampleMusicWaveData(fArr, i, i2);
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, C45377v vVar) {
        TEAudioUtilsCallback tEAudioUtilsCallback = new TEAudioUtilsCallback();
        tEAudioUtilsCallback.setListener(vVar);
        return TEVideoUtils.mixAudio(arrayList, str, tEAudioUtilsCallback);
    }

    public static int getVideoFrames(String str, int[] iArr, C45332o oVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(oVar);
        C20477e.m67936a("iesve_veutils_extract_video_frames", 1, (C45306a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, 0, 0, false, tEVideoUtilsCallback);
    }

    public static int mux(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return -100;
        }
        C20477e.m67936a("iesve_veutils_combine_audio_and_video_start", 1, (C45306a) null);
        int mux = TEVideoUtils.mux(str, str2, str3);
        C45306a aVar = new C45306a();
        String str5 = "iesve_veutils_combine_audio_and_video_finish_result";
        if (mux == 0) {
            str4 = "succ";
        } else {
            str4 = "fail";
        }
        aVar.mo108381a(str5, str4);
        aVar.mo108381a("iesve_veutils_combine_audio_and_video_finish_reason", "");
        C20477e.m67936a("iesve_veutils_combine_audio_and_video_finish", 1, aVar);
        return mux;
    }

    private static int concatRecordData(VERecordData vERecordData, String str, String str2) {
        int size = vERecordData.f116371b.size();
        if (size <= 0) {
            C45372t.m143409d("VEUtils", "frag count is 0");
            return -100;
        }
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((VERecordSegmentData) vERecordData.f116371b.get(i)).f116375a;
            jArr2[i] = ((VERecordSegmentData) vERecordData.f116371b.get(i)).f116377c;
            strArr2[i] = ((VERecordSegmentData) vERecordData.f116371b.get(i)).f116376b;
            jArr[i] = ((VERecordSegmentData) vERecordData.f116371b.get(i)).f116378d;
            fArr[i] = ((VERecordSegmentData) vERecordData.f116371b.get(i)).f116379e;
        }
        vERecordData.f116373d = str;
        vERecordData.f116374e = str2;
        return TEVideoUtils.concatRecordFrag(strArr, jArr2, strArr2, jArr, vERecordData.f116372c, 0, null, null, vERecordData.f116373d, vERecordData.f116374e);
    }

    public static int trimToDraft(String str, int[] iArr, String str2, int[] iArr2) {
        return TEVideoUtils.trimVideoFile(str, iArr, str2, iArr2);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2) {
        return TEVideoUtils.transCodeAudioFile(str, 0, -1, str2, i, i2, -1);
    }

    public static int cutVideo(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        sb.append(" -i ");
        sb.append(str);
        sb.append(" -ss ");
        sb.append(str3);
        sb.append(" -t ");
        sb.append(str4);
        sb.append(" -acodec copy -vcodec copy ");
        sb.append(str2);
        return execFFmpegCommand(sb.toString(), null);
    }

    public static VESize calcTargetRes(int[] iArr, int[] iArr2, ROTATE_DEGREE[] rotate_degreeArr, int i) {
        int i2;
        int i3;
        VESize vESize = new VESize(-1, -1);
        if (iArr2 == null || iArr == null || rotate_degreeArr == null) {
            return vESize;
        }
        int length = iArr.length;
        if (length <= 0) {
            return vESize;
        }
        float f = 0.0f;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[i6];
            if (rotate_degreeArr[i6] == ROTATE_DEGREE.ROTATE_90 || rotate_degreeArr[i6] == ROTATE_DEGREE.ROTATE_270) {
                i8 = iArr2[i6];
                i7 = iArr[i6];
            }
            f = Math.max(f, ((float) i7) / ((float) i8));
            i4 = Math.max(i4, i8);
            i5 = Math.max(i5, i7);
        }
        if (length != 1) {
            f = Math.min(f, 1.7777778f);
        }
        if (f >= 1.0f) {
            i3 = Math.min(i4, i);
            i2 = (int) (((float) i3) * f);
        } else {
            i2 = Math.min(i5, i);
            i3 = (int) (((float) i2) / f);
        }
        int i9 = ((i2 + 16) - 1) & -16;
        vESize.f116385a = ((i3 + 16) - 1) & -16;
        vESize.f116386b = i9;
        return vESize;
    }

    public static int curVideo(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        if (arrayList.size() != arrayList2.size() || arrayList.size() != arrayList3.size() || arrayList2.size() != arrayList3.size()) {
            return -100;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        sb.append(" -i ");
        sb.append(str);
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append(" -ss ");
            sb.append((String) arrayList2.get(i));
            sb.append(" -t ");
            sb.append((String) arrayList3.get(i));
            sb.append(" -acodec copy -vcodec copy ");
            sb.append((String) arrayList.get(i));
        }
        return execFFmpegCommand(sb.toString(), null);
    }

    public static C45380x createRTAudioWaveformMgr(int i, int i2, int i3, float f, int i4) {
        C45380x xVar = new C45380x(i, i2, i3, f, i4);
        return xVar;
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4) {
        return getMusicWaveData(str, i, i2, 10, i3, i4);
    }

    public static int transCodeAudio(String str, String str2, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        sb.append(" -i ");
        sb.append(str);
        if (i != -1) {
            sb.append(" -ac ");
            sb.append(i);
        }
        if (i2 != -1) {
            sb.append(" -ab ");
            sb.append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ar ");
            sb.append(i3);
        }
        StringBuilder sb2 = new StringBuilder(" ");
        sb2.append(str2);
        sb.append(sb2.toString());
        C45372t.m143403a("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i, int i2, int i3) {
        VERecordData vERecordData2 = vERecordData;
        if (vERecordData2 == null || vERecordData2.f116371b.size() <= 0) {
            C45372t.m143409d("VEUtils", "getAudioFromRecordData 参数错误");
            return -100;
        }
        int size = vERecordData2.f116371b.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        long[] jArr4 = new long[size];
        float[] fArr = new float[size];
        int i4 = 0;
        long j = 0;
        for (VERecordSegmentData vERecordSegmentData : vERecordData2.f116371b) {
            if (vERecordSegmentData.f116382h) {
                strArr[i4] = vERecordSegmentData.f116376b;
                jArr[i4] = (long) ((int) (vERecordSegmentData.f116383i / 1000));
                jArr2[i4] = (long) ((int) (vERecordSegmentData.f116384j / 1000));
                fArr[i4] = vERecordSegmentData.f116379e;
                jArr3[i4] = (long) ((int) (((float) jArr[i4]) * fArr[i4]));
                jArr4[i4] = (long) ((int) (((float) jArr2[i4]) * fArr[i4]));
                j += jArr4[i4] - jArr3[i4];
                i4++;
            }
        }
        if (i4 == 0) {
            C45372t.m143409d("VEUtils", "getAudioFromRecordData 没有有效片段");
            return -100;
        }
        return detachAudioFromVideos(str, (String[]) Arrays.copyOf(strArr, i4), Arrays.copyOf(jArr3, i4), Arrays.copyOf(jArr4, i4), 0, j, Arrays.copyOf(fArr, i4), i, i2, i3);
    }

    public static int transCodeAudio(String str, int i, int i2, String str2, int i3, int i4) {
        return TEVideoUtils.transCodeAudioFile(str, i, i2, str2, i3, i4, -1);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, C45332o oVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(oVar);
        C20477e.m67936a("iesve_veutils_extract_video_frames", 1, (C45306a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i, int i2, boolean z, C45332o oVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(oVar);
        C20477e.m67936a("iesve_veutils_extract_video_frames", 1, (C45306a) null);
        return TEVideoUtils.getVideoFrames2(str, iArr, i, i2, z, tEVideoUtilsCallback);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i, int i2, int i3, int i4, int i5) {
        if (i == 0) {
            i = C20467g.f55300f;
        }
        VEMusicWaveBean audioWaveData = TEVideoUtils.getAudioWaveData(str, i, i2, i3, i4, i5);
        if (audioWaveData == null || audioWaveData.getWaveBean().length == 0) {
            return null;
        }
        return audioWaveData;
    }

    public static int getVideoThumb(VERecordData vERecordData, int i, int i2, int i3, boolean z, C45332o oVar) {
        String str;
        int i4;
        String str2 = "";
        Iterator it = vERecordData.f116371b.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                str = str2;
                i4 = 0;
                break;
            }
            VERecordSegmentData vERecordSegmentData = (VERecordSegmentData) it.next();
            if (vERecordSegmentData.f116382h) {
                int i6 = (int) ((vERecordSegmentData.f116384j - vERecordSegmentData.f116383i) / 1000);
                if (i >= i5 && i <= i5 + i6) {
                    i4 = ((int) (vERecordSegmentData.f116383i / 1000)) + (i - i5);
                    str = vERecordSegmentData.f116375a;
                    break;
                }
                i5 += i6;
            }
        }
        if (TextUtils.isEmpty(str) || i4 == -1) {
            C45372t.m143409d("VEUtils", "timestamp 不在有效时间范围内");
            return -100;
        }
        return getVideoFrames(str, new int[]{i4}, i2, i3, z, oVar);
    }

    public static int getVideoThumb(String str, int i, C45332o oVar, boolean z, int i2, int i3, long j, int i4) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        C45332o oVar2 = oVar;
        tEVideoUtilsCallback.setListener(oVar);
        C20477e.m67936a("iesve_veutils_extract_video_thumb", 1, (C45306a) null);
        return TEVideoUtils.getVideoThumb(str, i, tEVideoUtilsCallback, z, i2, i3, j, i4);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3) {
        StringBuilder sb = new StringBuilder();
        String str4 = str2;
        sb.append(str2);
        String str5 = str3;
        sb.append(str3);
        return TEVideoUtils.saveVideoFrames(str, iArr, i, i2, z, sb.toString(), i3, 70);
    }

    public static int getVideoFrames(String str, int[] iArr, int i, int i2, boolean z, boolean z2, int i3, boolean z3, C45332o oVar) {
        return TEVideoUtils.getVideoFramesMore(str, iArr, i, i2, z, z2, i3, z3, oVar);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i, int i2, boolean z, String str2, String str3, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        String str4 = str2;
        sb.append(str2);
        String str5 = str3;
        sb.append(str3);
        return TEVideoUtils.saveVideoFrames(str, iArr, i, i2, z, sb.toString(), i3, i4);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j, long j2, float[] fArr, int i, int i2, int i3) {
        return TEVideoUtils.detachAudioFromVideos(str, strArr, jArr, jArr2, j, j2, fArr, i, i2, i3);
    }
}
