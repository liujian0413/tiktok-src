package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.util.C6292i;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p280ss.android.ugc.aweme.tools.C42130a;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.d */
public final class C39702d {

    /* renamed from: a */
    public static final C39702d f103208a = new C39702d();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f103209b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.d$a */
    static final class C39703a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f103210a;

        /* renamed from: b */
        final /* synthetic */ String f103211b;

        C39703a(String str, String str2) {
            this.f103210a = str;
            this.f103211b = str2;
        }

        /* renamed from: a */
        private void m127070a() {
            C7276d.m22815c(this.f103210a, this.f103211b);
        }

        public final /* synthetic */ Object call() {
            m127070a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.d$b */
    static final class C39704b<TTaskResult, TContinuationResult> implements C1591g<C7581n, Object> {

        /* renamed from: a */
        final /* synthetic */ MultiEditVideoStatusRecordData f103212a;

        /* renamed from: b */
        final /* synthetic */ boolean f103213b;

        /* renamed from: c */
        final /* synthetic */ String f103214c;

        /* renamed from: d */
        final /* synthetic */ String f103215d;

        /* renamed from: e */
        final /* synthetic */ C7561a f103216e;

        C39704b(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, boolean z, String str, String str2, C7561a aVar) {
            this.f103212a = multiEditVideoStatusRecordData;
            this.f103213b = z;
            this.f103214c = str;
            this.f103215d = str2;
            this.f103216e = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C7581n> hVar) {
            List<MultiEditVideoSegmentRecordData> list = this.f103212a.curMultiEditVideoRecordData.segmentDataList;
            C7573i.m23582a((Object) list, "multiEditVideoRecordData…ecordData.segmentDataList");
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                if (multiEditVideoSegmentRecordData != null) {
                    if (this.f103213b) {
                        if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.audioPath)) {
                            String str = multiEditVideoSegmentRecordData.audioPath;
                            C7573i.m23582a((Object) str, "it.audioPath");
                            multiEditVideoSegmentRecordData.draftAudioPath = C7634n.m23711a(str, this.f103214c, this.f103215d, false);
                        }
                        if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath)) {
                            String str2 = multiEditVideoSegmentRecordData.videoPath;
                            C7573i.m23582a((Object) str2, "it.videoPath");
                            multiEditVideoSegmentRecordData.draftVideoPath = C7634n.m23711a(str2, this.f103214c, this.f103215d, false);
                        }
                    } else {
                        if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftAudioPath)) {
                            String str3 = multiEditVideoSegmentRecordData.draftAudioPath;
                            C7573i.m23582a((Object) str3, "it.draftAudioPath");
                            multiEditVideoSegmentRecordData.audioPath = C7634n.m23711a(str3, this.f103214c, this.f103215d, false);
                        }
                        if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                            String str4 = multiEditVideoSegmentRecordData.draftVideoPath;
                            C7573i.m23582a((Object) str4, "it.draftVideoPath");
                            multiEditVideoSegmentRecordData.videoPath = C7634n.m23711a(str4, this.f103214c, this.f103215d, false);
                        }
                    }
                }
            }
            if (this.f103212a.restoreMultiEditVideoRecordData != null) {
                List<MultiEditVideoSegmentRecordData> list2 = this.f103212a.restoreMultiEditVideoRecordData.segmentDataList;
                C7573i.m23582a((Object) list2, "multiEditVideoRecordData…ecordData.segmentDataList");
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : list2) {
                    if (multiEditVideoSegmentRecordData2 != null) {
                        if (this.f103213b) {
                            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData2.audioPath)) {
                                String str5 = multiEditVideoSegmentRecordData2.audioPath;
                                C7573i.m23582a((Object) str5, "it.audioPath");
                                multiEditVideoSegmentRecordData2.draftAudioPath = C7634n.m23711a(str5, this.f103214c, this.f103215d, false);
                            }
                            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData2.videoPath)) {
                                String str6 = multiEditVideoSegmentRecordData2.videoPath;
                                C7573i.m23582a((Object) str6, "it.videoPath");
                                multiEditVideoSegmentRecordData2.draftVideoPath = C7634n.m23711a(str6, this.f103214c, this.f103215d, false);
                            }
                        } else {
                            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData2.draftAudioPath)) {
                                String str7 = multiEditVideoSegmentRecordData2.draftAudioPath;
                                C7573i.m23582a((Object) str7, "it.draftAudioPath");
                                multiEditVideoSegmentRecordData2.audioPath = C7634n.m23711a(str7, this.f103214c, this.f103215d, false);
                            }
                            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData2.draftVideoPath)) {
                                String str8 = multiEditVideoSegmentRecordData2.draftVideoPath;
                                C7573i.m23582a((Object) str8, "it.draftVideoPath");
                                multiEditVideoSegmentRecordData2.videoPath = C7634n.m23711a(str8, this.f103214c, this.f103215d, false);
                            }
                        }
                    }
                }
            }
            this.f103216e.invoke();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.d$c */
    static final class C39705c<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C39705c f103217a = new C39705c();

        C39705c() {
        }

        public final /* synthetic */ Object call() {
            return m127072a();
        }

        /* renamed from: a */
        private static Void m127072a() {
            if (C7276d.m22812b(C39702d.f103209b)) {
                new File(C39702d.f103209b).delete();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.a.d$d */
    static final class C39706d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f103218a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f103219b;

        C39706d(String str, Bitmap bitmap) {
            this.f103218a = str;
            this.f103219b = bitmap;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            BufferedOutputStream bufferedOutputStream;
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.f103218a)));
                try {
                    this.f103219b.compress(CompressFormat.PNG, 100, bufferedOutputStream);
                    bufferedOutputStream.flush();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream;
                    th = th;
                    bufferedOutputStream2 = bufferedOutputStream3;
                    C42341f.m134635a((OutputStream) bufferedOutputStream2);
                    throw th;
                }
            } catch (Exception unused2) {
                bufferedOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                C42341f.m134635a((OutputStream) bufferedOutputStream2);
                throw th;
            }
            C42341f.m134635a((OutputStream) bufferedOutputStream);
            return null;
        }
    }

    private C39702d() {
    }

    /* renamed from: a */
    public static boolean m127065a() {
        return C35563c.f93231M.mo93305a(Property.EnableMultiVideoEdit);
    }

    /* renamed from: c */
    public static void m127068c() {
        String str = C39810eq.f103469e;
        if (C7276d.m22812b(str)) {
            C7276d.m22822e(str);
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        Application application = C35563c.f93238a;
        C7573i.m23582a((Object) application, "AVEnv.application");
        File filesDir = application.getFilesDir();
        C7573i.m23582a((Object) filesDir, "AVEnv.application.filesDir");
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("multi_edit");
        sb.append(File.separator);
        f103209b = sb.toString();
    }

    /* renamed from: b */
    public static String m127067b() {
        if (!C7276d.m22812b(f103209b)) {
            new File(f103209b).mkdirs();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f103209b);
        sb.append(System.currentTimeMillis());
        sb.append("_cover_img.png");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m127062a(C27311c cVar) {
        if (cVar != null && cVar.mo70179U()) {
            C1592h.m7853a((Callable<TResult>) C39705c.f103217a);
        }
    }

    /* renamed from: a */
    public static void m127061a(Bitmap bitmap, String str) {
        C7573i.m23587b(str, "imgPath");
        if (bitmap != null && !bitmap.isRecycled()) {
            C1592h.m7853a((Callable<TResult>) new C39706d<TResult>(str, bitmap));
        }
    }

    /* renamed from: a */
    public static MultiEditVideoRecordData m127059a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null) {
            return new MultiEditVideoRecordData();
        }
        if (multiEditVideoRecordData2 == null) {
            MultiEditVideoRecordData cloneData = multiEditVideoRecordData.cloneData();
            C7573i.m23582a((Object) cloneData, "srcData.cloneData()");
            return cloneData;
        }
        multiEditVideoRecordData2.concatVideo = multiEditVideoRecordData.concatVideo;
        multiEditVideoRecordData2.concatAudio = multiEditVideoRecordData.concatAudio;
        multiEditVideoRecordData2.useMusic = multiEditVideoRecordData.useMusic;
        multiEditVideoRecordData2.startTime = multiEditVideoRecordData.startTime;
        multiEditVideoRecordData2.endTime = multiEditVideoRecordData.endTime;
        multiEditVideoRecordData2.leftSlideX = multiEditVideoRecordData.leftSlideX;
        multiEditVideoRecordData2.rightSlideX = multiEditVideoRecordData.rightSlideX;
        multiEditVideoRecordData2.curRecordingDir = multiEditVideoRecordData.curRecordingDir;
        multiEditVideoRecordData2.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData cloneData2 : multiEditVideoRecordData.segmentDataList) {
            multiEditVideoRecordData2.segmentDataList.add(cloneData2.cloneData());
        }
        multiEditVideoRecordData2.musicPath = multiEditVideoRecordData.musicPath;
        multiEditVideoRecordData2.originVolume = multiEditVideoRecordData.originVolume;
        multiEditVideoRecordData2.musicVolume = multiEditVideoRecordData.musicVolume;
        multiEditVideoRecordData2.hasRetake = multiEditVideoRecordData.hasRetake;
        multiEditVideoRecordData2.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
        multiEditVideoRecordData2.musicDuration = multiEditVideoRecordData.musicDuration;
        multiEditVideoRecordData2.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
        multiEditVideoRecordData2.coverPath = multiEditVideoRecordData.coverPath;
        return multiEditVideoRecordData2;
    }

    /* renamed from: b */
    public static MultiEditVideoRecordData m127066b(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null || multiEditVideoRecordData2 == null || C6292i.m19525a(multiEditVideoRecordData2.segmentDataList) || C6292i.m19525a(multiEditVideoRecordData.segmentDataList)) {
            return multiEditVideoRecordData;
        }
        multiEditVideoRecordData.copyData(multiEditVideoRecordData2);
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData2.segmentDataList) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : multiEditVideoRecordData.segmentDataList) {
                if (multiEditVideoSegmentRecordData != null && !TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath) && C7573i.m23585a((Object) multiEditVideoSegmentRecordData.videoPath, (Object) multiEditVideoSegmentRecordData2.videoPath)) {
                    multiEditVideoSegmentRecordData2.copyData(multiEditVideoSegmentRecordData);
                }
            }
        }
        return multiEditVideoRecordData;
    }

    /* renamed from: a */
    public static final void m127063a(String str, String str2, VideoPublishEditModel videoPublishEditModel, C7561a<C7581n> aVar) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        C7573i.m23587b(str, "srcDir");
        C7573i.m23587b(str2, "dstDir");
        C7573i.m23587b(aVar, "callBack");
        if (videoPublishEditModel != null) {
            multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        } else {
            multiEditVideoStatusRecordData = null;
        }
        if (multiEditVideoStatusRecordData != null) {
            m127064a(str, str2, false, videoPublishEditModel.multiEditVideoRecordData, aVar);
        }
    }

    /* renamed from: a */
    public final void mo99074a(String str, String str2, C27311c cVar, C7561a<C7581n> aVar) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        C7573i.m23587b(str, "srcDir");
        C7573i.m23587b(str2, "dstDir");
        C7573i.m23587b(aVar, "callBack");
        if (cVar != null) {
            multiEditVideoStatusRecordData = cVar.mo70225an();
        } else {
            multiEditVideoStatusRecordData = null;
        }
        if (multiEditVideoStatusRecordData != null) {
            m127064a(str, str2, true, cVar.mo70225an(), aVar);
        }
    }

    /* renamed from: a */
    private static void m127064a(String str, String str2, boolean z, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, C7561a<C7581n> aVar) {
        if (multiEditVideoStatusRecordData != null && !C6292i.m19525a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
            C1592h a = C1592h.m7855a((Callable<TResult>) new C39703a<TResult>(str, str2), (Executor) C42130a.m134090a());
            C39704b bVar = new C39704b(multiEditVideoStatusRecordData, z, str, str2, aVar);
            a.mo6875a((C1591g<TResult, TContinuationResult>) bVar);
        }
    }
}
