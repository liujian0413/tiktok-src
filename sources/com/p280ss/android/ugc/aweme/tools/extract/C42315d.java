package com.p280ss.android.ugc.aweme.tools.extract;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.TimeSpeedModelExtension;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g.C42321a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEUtils;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.d */
public final class C42315d extends C42312a {

    /* renamed from: e */
    public final VideoPublishEditModel f110082e;

    /* renamed from: f */
    private int f110083f;

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.d$a */
    static final class C42316a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C42315d f110084a;

        C42316a(C42315d dVar) {
            this.f110084a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            boolean z;
            ArrayList a = ShortVideoContext.m122682a(this.f110084a.f110082e.mVideoSegmentsDesc);
            C42322h hVar = this.f110084a.f110077c;
            C7573i.m23582a((Object) hVar, "photoPathGenerator");
            String str = hVar.f110088a;
            C7573i.m23582a((Object) str, "frameDir");
            String str2 = File.separator;
            C7573i.m23582a((Object) str2, "File.separator");
            if (!C7634n.m23723c(str, str2, false)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                str = sb.toString();
            }
            C42315d dVar = this.f110084a;
            C7573i.m23582a((Object) a, "videoSegments");
            Iterable iterable = a;
            Collection arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) next;
                C7573i.m23582a((Object) timeSpeedModelExtension, "it");
                if (timeSpeedModelExtension.getBackgroundVideo() == null) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            int i = 0;
            for (Entry entry : dVar.mo103800a((List) arrayList).entrySet()) {
                String str3 = (String) entry.getKey();
                int[] a2 = this.f110084a.mo103801a((int) ((Number) entry.getValue()).longValue());
                int i2 = C42319f.f110087a[0];
                StringBuilder sb2 = new StringBuilder();
                int i3 = i + 1;
                sb2.append(i);
                sb2.append("_extract_frame");
                VEUtils.saveVideoFrames(str3, a2, i2, -1, false, str, sb2.toString(), 1);
                i = i3;
            }
            String str4 = this.f110084a.f110082e.extractFramesModel.extractFramesDir;
            C7573i.m23582a((Object) str4, "shootExtractDir");
            String str5 = File.separator;
            C7573i.m23582a((Object) str5, "File.separator");
            if (!C7634n.m23723c(str4, str5, false)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str4);
                sb3.append(File.separator);
                str4 = sb3.toString();
            }
            File[] listFiles = new File(str).listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (File file : listFiles) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str4);
                        C7573i.m23582a((Object) file, "frameImage");
                        sb4.append(file.getName());
                        String sb5 = sb4.toString();
                        C7276d.m22820d(file.getAbsolutePath(), sb5);
                        this.f110084a.f110082e.extractFramesModel.addFrameAtLastSegment(sb5);
                    }
                }
            }
            C7276d.m22822e(str);
            C7276d.m22816c(str);
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.d$b */
    static final class C42317b<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ C42315d f110085a;

        /* renamed from: b */
        final /* synthetic */ C42321a f110086b;

        C42317b(C42315d dVar, C42321a aVar) {
            this.f110085a = dVar;
            this.f110086b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h hVar) {
            C42321a aVar = this.f110086b;
            C7573i.m23582a((Object) hVar, "it");
            aVar.mo96560a(hVar.mo6882b());
            this.f110085a.mo103794a(true);
            this.f110085a.mo103790a();
            return null;
        }
    }

    /* renamed from: f */
    public final String mo103802f() {
        return "extract_bgv";
    }

    public C42315d(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "videoPublishEditModel");
        this.f110082e = videoPublishEditModel;
    }

    /* renamed from: a */
    public final int[] mo103801a(int i) {
        this.f110083f = i / VETransitionFilterParam.TransitionDuration_DEFAULT;
        int[] iArr = new int[this.f110083f];
        int i2 = this.f110083f;
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3 * VETransitionFilterParam.TransitionDuration_DEFAULT;
        }
        return iArr;
    }

    /* renamed from: a */
    public final void mo103792a(C42321a aVar) {
        C7573i.m23587b(aVar, "listener");
        super.mo103792a(aVar);
        if (m134573b()) {
            C1592h.m7853a((Callable<TResult>) new C42316a<TResult>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C42317b<TResult,TContinuationResult>(this, aVar));
        }
    }

    /* renamed from: c */
    private final String m134584c(String str) {
        CharSequence charSequence = str;
        String str2 = File.separator;
        C7573i.m23582a((Object) str2, "File.separator");
        int b = C7634n.m23760b(charSequence, str2, 0, false, 6, (Object) null) + 1;
        if (str != null) {
            String substring = str.substring(b);
            C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            String uniqueVideoSessionDir = this.f110082e.uniqueVideoSessionDir(C39811er.f103474j);
            StringBuilder sb = new StringBuilder();
            sb.append(uniqueVideoSessionDir);
            sb.append(File.separator);
            sb.append(substring);
            String sb2 = sb.toString();
            if (C7276d.m22812b(sb2)) {
                return sb2;
            }
            return str;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final Map<String, Long> mo103800a(List<? extends TimeSpeedModelExtension> list) {
        long j;
        Map<String, Long> linkedHashMap = new LinkedHashMap<>();
        for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
            BackgroundVideo backgroundVideo = timeSpeedModelExtension.getBackgroundVideo();
            if (backgroundVideo != null) {
                String videoPath = backgroundVideo.getVideoPath();
                if (videoPath != null) {
                    String c = m134584c(videoPath);
                    if (C7276d.m22812b(c)) {
                        if (c == null) {
                            C7573i.m23580a();
                        }
                        Long l = (Long) linkedHashMap.get(c);
                        if (timeSpeedModelExtension.getSpeed() > 0.0d) {
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            linkedHashMap.put(c, Long.valueOf(j + ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()))));
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
