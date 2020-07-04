package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoSegments;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.d */
public final class C40414d {

    /* renamed from: a */
    public static final C40414d f105053a = new C40414d();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.d$a */
    static final class C40415a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ShortVideoSegments f105054a;

        /* renamed from: b */
        final /* synthetic */ BackgroundVideo f105055b;

        C40415a(ShortVideoSegments shortVideoSegments, BackgroundVideo backgroundVideo) {
            this.f105054a = shortVideoSegments;
            this.f105055b = backgroundVideo;
        }

        public final /* synthetic */ Object call() {
            m129230a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m129230a() {
            for (TimeSpeedModelExtension timeSpeedModelExtension : this.f105054a) {
                if (timeSpeedModelExtension != null) {
                    BackgroundVideo backgroundVideo = timeSpeedModelExtension.getBackgroundVideo();
                    if (backgroundVideo != null && (!C7573i.m23585a((Object) backgroundVideo, (Object) this.f105055b))) {
                        C40414d.m129224a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                    }
                }
            }
        }
    }

    private C40414d() {
    }

    /* renamed from: a */
    public static final void m129223a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "publishModel");
        C7276d.m22815c(C39811er.f103473i, m129228c(videoPublishEditModel));
        C7276d.m22822e(C39811er.f103473i);
    }

    /* renamed from: b */
    public static final void m129227b(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "publishModel");
        String c = m129228c(videoPublishEditModel);
        String str = C39811er.f103473i;
        C7276d.m22822e(str);
        C7276d.m22815c(c, str);
    }

    /* renamed from: c */
    public static final String m129228c(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (videoPublishEditModel != null) {
            str = videoPublishEditModel.uniqueVideoSessionDir(C39811er.f103474j);
        } else {
            str = null;
        }
        return C7573i.m23577a(str, (Object) File.separator);
    }

    /* renamed from: a */
    public static final void m129225a(List<TimeSpeedModelExtension> list) {
        if (list != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
                if (timeSpeedModelExtension != null) {
                    BackgroundVideo backgroundVideo = timeSpeedModelExtension.getBackgroundVideo();
                    if (backgroundVideo != null) {
                        m129224a(backgroundVideo.getVideoPath(), backgroundVideo.getAudioPath());
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m129229c(ShortVideoSegments shortVideoSegments, BackgroundVideo backgroundVideo) {
        C7573i.m23587b(shortVideoSegments, "segments");
        C1592h.m7853a((Callable<TResult>) new C40415a<TResult>(shortVideoSegments, backgroundVideo));
    }

    /* renamed from: a */
    public static final void m129224a(String str, String str2) {
        try {
            C7276d.m22816c(str);
            C7276d.m22816c(str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Delete BGV failed, videoPath: ");
            sb.append(str);
            sb.append(" audioPath: ");
            sb.append(str2);
            sb.append(" error: ");
            sb.append(e.getMessage());
            C6921a.m21555a(sb.toString());
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.aweme.shortvideo.ShortVideoSegments, code=com.ss.android.ugc.aweme.shortvideo.ShortVideoSegments<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>, for r3v0, types: [com.ss.android.ugc.aweme.shortvideo.ShortVideoSegments<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension>, com.ss.android.ugc.aweme.shortvideo.ShortVideoSegments, java.lang.Object] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m129226b(com.p280ss.android.ugc.aweme.shortvideo.ShortVideoSegments<com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension> r3, com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo r4) {
        /*
            java.lang.String r0 = "segments"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            if (r4 == 0) goto L_0x0039
            r0 = 1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x000e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r3.next()
            com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension r1 = (com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension) r1
            java.lang.String r2 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.sticker.model.BackgroundVideo r1 = r1.getBackgroundVideo()
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r4)
            if (r1 == 0) goto L_0x000e
            r0 = 0
            goto L_0x000e
        L_0x002b:
            if (r0 == 0) goto L_0x0038
            java.lang.String r3 = r4.getVideoPath()
            java.lang.String r4 = r4.getAudioPath()
            m129224a(r3, r4)
        L_0x0038:
            return
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40414d.m129226b(com.ss.android.ugc.aweme.shortvideo.ShortVideoSegments, com.ss.android.ugc.aweme.sticker.model.BackgroundVideo):void");
    }

    /* renamed from: a */
    public static final void m129222a(ShortVideoSegments shortVideoSegments, BackgroundVideo backgroundVideo) {
        C7573i.m23587b(shortVideoSegments, "segments");
        if (!shortVideoSegments.isEmpty()) {
            Object obj = shortVideoSegments.get(shortVideoSegments.size() - 1);
            C7573i.m23582a(obj, "segments[segments.size - 1]");
            BackgroundVideo backgroundVideo2 = ((TimeSpeedModelExtension) obj).getBackgroundVideo();
            if (backgroundVideo2 != null) {
                C7573i.m23582a((Object) backgroundVideo2, "segments[segments.size -…backgroundVideo ?: return");
                if (!C7573i.m23585a((Object) backgroundVideo2, (Object) backgroundVideo)) {
                    for (TimeSpeedModelExtension timeSpeedModelExtension : C7525m.m23505c((Iterable<? extends T>) shortVideoSegments, shortVideoSegments.size() - 1)) {
                        C7573i.m23582a((Object) timeSpeedModelExtension, "it");
                        if (C7573i.m23585a((Object) timeSpeedModelExtension.getBackgroundVideo(), (Object) backgroundVideo2)) {
                            return;
                        }
                    }
                    m129224a(backgroundVideo2.getVideoPath(), backgroundVideo2.getAudioPath());
                }
            }
        }
    }
}
