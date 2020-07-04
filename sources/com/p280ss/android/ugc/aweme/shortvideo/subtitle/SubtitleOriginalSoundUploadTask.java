package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.shortvideo.C39966gm;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41434a;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.C41639c;
import com.p280ss.ttuploader.TTVideoInfo;
import com.p280ss.ttuploader.TTVideoUploader;
import com.p280ss.ttuploader.TTVideoUploaderListener;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask */
public final class SubtitleOriginalSoundUploadTask implements Parcelable {
    public static final C41099a CREATOR = new C41099a(null);

    /* renamed from: a */
    public String f106942a;

    /* renamed from: b */
    public final String f106943b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask$a */
    public static final class C41099a implements Creator<SubtitleOriginalSoundUploadTask> {
        private C41099a() {
        }

        /* renamed from: a */
        private static SubtitleOriginalSoundUploadTask[] m131271a(int i) {
            return new SubtitleOriginalSoundUploadTask[i];
        }

        public /* synthetic */ C41099a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m131270a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m131271a(i);
        }

        /* renamed from: a */
        private static SubtitleOriginalSoundUploadTask m131270a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new SubtitleOriginalSoundUploadTask(parcel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask$b */
    public static final class C41100b implements TTVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleOriginalSoundUploadTask f106944a;

        /* renamed from: b */
        final /* synthetic */ C39966gm f106945b;

        /* renamed from: c */
        final /* synthetic */ TTVideoUploader f106946c;

        /* renamed from: d */
        final /* synthetic */ C1606i f106947d;

        public final String getStringFromExtern(int i) {
            return null;
        }

        public final void onLog(int i, int i2, String str) {
        }

        public final int videoUploadCheckNetState(int i, int i2) {
            return C41434a.m132073a(this.f106945b, "SubtitleOriginalSoundUpload");
        }

        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i != 0) {
                if (i == 2) {
                    this.f106946c.close();
                    C1606i iVar = this.f106947d;
                    StringBuilder sb = new StringBuilder("upload failed ");
                    sb.append(j);
                    sb.append('.');
                    iVar.mo6902b((Exception) new IllegalArgumentException(sb.toString()));
                }
                return;
            }
            SubtitleOriginalSoundUploadTask subtitleOriginalSoundUploadTask = this.f106944a;
            if (tTVideoInfo == null) {
                C7573i.m23580a();
            }
            subtitleOriginalSoundUploadTask.f106942a = tTVideoInfo.mTosKey;
            this.f106946c.close();
            this.f106947d.mo6903b(this.f106944a);
        }

        C41100b(SubtitleOriginalSoundUploadTask subtitleOriginalSoundUploadTask, C39966gm gmVar, TTVideoUploader tTVideoUploader, C1606i iVar) {
            this.f106944a = subtitleOriginalSoundUploadTask;
            this.f106945b = gmVar;
            this.f106946c = tTVideoUploader;
            this.f106947d = iVar;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f106943b, (java.lang.Object) ((com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask) r2).f106943b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask r2 = (com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask) r2
            java.lang.String r0 = r1.f106943b
            java.lang.String r2 = r2.f106943b
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.subtitle.SubtitleOriginalSoundUploadTask.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f106943b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitleOriginalSoundUploadTask(originalSoundPath=");
        sb.append(this.f106943b);
        sb.append(")");
        return sb.toString();
    }

    public SubtitleOriginalSoundUploadTask(String str) {
        C7573i.m23587b(str, "originalSoundPath");
        this.f106943b = str;
    }

    public SubtitleOriginalSoundUploadTask(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            C7573i.m23580a();
        }
        this(readString);
        this.f106942a = parcel.readString();
    }

    /* renamed from: a */
    public final C1592h<SubtitleOriginalSoundUploadTask> mo101531a(C39966gm gmVar) {
        C7573i.m23587b(gmVar, "config");
        int a = C41639c.m132544a(this.f106943b);
        if (a != 0) {
            StringBuilder sb = new StringBuilder("file error, ");
            sb.append(this.f106943b);
            sb.append(" checkResult = ");
            sb.append(a);
            C1592h<SubtitleOriginalSoundUploadTask> a2 = C1592h.m7850a((Exception) new IllegalStateException(sb.toString()));
            C7573i.m23582a((Object) a2, "Task.forError(IllegalSta…kResult = $checkResult\"))");
            return a2;
        }
        C1606i iVar = new C1606i();
        TTVideoUploader tTVideoUploader = new TTVideoUploader();
        try {
            tTVideoUploader.setListener(new C41100b(this, gmVar, tTVideoUploader, iVar));
            tTVideoUploader.setMaxFailTime(gmVar.f103822h);
            tTVideoUploader.setSliceSize(gmVar.f103820f);
            tTVideoUploader.setFileUploadDomain(gmVar.f103816b);
            tTVideoUploader.setVideoUploadDomain(gmVar.f103817c);
            tTVideoUploader.setSliceTimeout(gmVar.f103818d);
            tTVideoUploader.setPathName(this.f106943b);
            tTVideoUploader.setFileRetryCount(1);
            tTVideoUploader.setUserKey(gmVar.f103810A);
            tTVideoUploader.setAuthorization(gmVar.f103811B);
            tTVideoUploader.setSocketNum(1);
            tTVideoUploader.start();
        } catch (Exception unused) {
            tTVideoUploader.close();
        }
        C1592h<TResult> hVar = iVar.f6010a;
        C7573i.m23582a((Object) hVar, "taskCompletionSource.task");
        return hVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        parcel.writeString(this.f106943b);
        parcel.writeString(this.f106942a);
    }
}
