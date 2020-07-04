package dmt.p1861av.video;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.C41639c;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;

/* renamed from: dmt.av.video.f */
public final class C47457f {
    /* renamed from: a */
    public final void mo119586a(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String str;
        int i;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (C35563c.f93230L.mo93342a(Property.UploadOriginalAudioTrack) && videoPublishEditModel.shouldUploadOriginalSound()) {
            new File(C39811er.f103475k).mkdirs();
            if (videoPublishEditModel2.veAudioRecorderParam == null || !videoPublishEditModel2.veAudioRecorderParam.hasRecord() || !C35563c.f93231M.mo93305a(AVAB.Property.EnableRecordConversion)) {
                z = false;
            } else {
                z = true;
            }
            if (TextUtils.isEmpty(videoPublishEditModel.audioPath())) {
                str = videoPublishEditModel.videoPath();
            } else {
                str = videoPublishEditModel.audioPath();
            }
            int i2 = -999;
            if (videoPublishEditModel2.isFastImport) {
                int size = videoPublishEditModel.getPreviewInfo().getVideoList().size();
                String[] strArr = new String[size];
                long[] jArr = new long[size];
                long[] jArr2 = new long[size];
                float[] fArr = new float[size];
                long[] jArr3 = new long[2];
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr;
                m148172a(videoPublishEditModel.getPreviewInfo(), strArr, jArr, jArr2, fArr, jArr3);
                if (z) {
                    new File(C39811er.f103479o).mkdirs();
                    StringBuilder sb = new StringBuilder();
                    sb.append(C39811er.f103479o);
                    sb.append(System.currentTimeMillis());
                    sb.append("_a");
                    String sb2 = sb.toString();
                    if (videoPublishEditModel2.voiceVolume == 0.0f) {
                        i = VEUtils.transCodeAudio(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
                    } else {
                        int detachAudioFromVideos = VEUtils.detachAudioFromVideos(sb2, strArr, jArr5, jArr4, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(sb2);
                        arrayList.add(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl());
                        int mixAudio = VEUtils.mixAudio(arrayList, videoPublishEditModel2.mEncodedAudioOutputFile, null);
                        C7276d.m22816c(sb2);
                        i = detachAudioFromVideos;
                        i2 = mixAudio;
                    }
                } else {
                    i = VEUtils.detachAudioFromVideos(videoPublishEditModel2.mEncodedAudioOutputFile, strArr, jArr5, jArr4, jArr3[0], jArr3[1], fArr, 1, 88200, 44100);
                }
            } else if (!z) {
                i = VEUtils.transCodeAudio(str, videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
            } else if (videoPublishEditModel.getWavFile() == null || videoPublishEditModel2.voiceVolume == 0.0f) {
                i = VEUtils.transCodeAudio(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl(), videoPublishEditModel2.mEncodedAudioOutputFile, 1, 88200);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str);
                arrayList2.add(videoPublishEditModel2.veAudioRecorderParam.getAudioUrl());
                i2 = VEUtils.mixAudio(arrayList2, videoPublishEditModel2.mEncodedAudioOutputFile, null);
                i = -999;
            }
            int a = C41639c.m132544a(videoPublishEditModel2.mEncodedAudioOutputFile);
            StringBuilder sb3 = new StringBuilder("mixResult");
            sb3.append(i2);
            sb3.append("encodeResult = ");
            sb3.append(i);
            sb3.append(" checkResult = ");
            sb3.append(a);
            sb3.append(" path = ");
            sb3.append(videoPublishEditModel2.mEncodedAudioOutputFile);
            C6893q.m21452b("aweme_movie_publish_log", "encode_audio_file", new C38510bb().mo96479a("status", Integer.valueOf(a + VideoCacheTTnetProxyTimeoutExperiment.DEFAULT)).mo96481a("errorDesc", sb3.toString()).mo96482b());
        }
    }

    /* renamed from: a */
    private static void m148172a(EditPreviewInfo editPreviewInfo, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        for (int i = 0; i < editPreviewInfo.getVideoList().size(); i++) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) editPreviewInfo.getVideoList().get(i);
            strArr[i] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                jArr[i] = videoCutInfo.getStart();
                jArr2[i] = videoCutInfo.getEnd();
                fArr[i] = videoCutInfo.getSpeed();
            } else {
                jArr[i] = -1;
                jArr2[i] = -1;
                fArr[i] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() > 0 || editPreviewInfo.getSceneOut() > 0) {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
            return;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
    }
}
