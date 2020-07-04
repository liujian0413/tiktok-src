package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.C39966gm;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41434a;
import com.p280ss.ttuploader.TTVideoInfo;
import com.p280ss.ttuploader.TTVideoUploader;
import com.p280ss.ttuploader.TTVideoUploaderListener;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask */
public final class StickPointUploadTask implements Parcelable {
    public static final C39104a CREATOR = new C39104a(null);

    /* renamed from: a */
    public String f101415a;

    /* renamed from: b */
    public final String f101416b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask$a */
    public static final class C39104a implements Creator<StickPointUploadTask> {
        private C39104a() {
        }

        /* renamed from: a */
        private static StickPointUploadTask[] m124816a(int i) {
            return new StickPointUploadTask[i];
        }

        public /* synthetic */ C39104a(C7571f fVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m124815a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m124816a(i);
        }

        /* renamed from: a */
        private static StickPointUploadTask m124815a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new StickPointUploadTask(parcel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask$b */
    public static final class C39105b implements TTVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ StickPointUploadTask f101417a;

        /* renamed from: b */
        final /* synthetic */ C39966gm f101418b;

        /* renamed from: c */
        final /* synthetic */ TTVideoUploader f101419c;

        /* renamed from: d */
        final /* synthetic */ C1606i f101420d;

        public final String getStringFromExtern(int i) {
            return null;
        }

        public final void onLog(int i, int i2, String str) {
        }

        public final int videoUploadCheckNetState(int i, int i2) {
            return C41434a.m132073a(this.f101418b, "StickPointUpload");
        }

        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i != 0) {
                if (i == 2) {
                    this.f101419c.close();
                    C1606i iVar = this.f101420d;
                    StringBuilder sb = new StringBuilder("upload failed ");
                    sb.append(j);
                    sb.append('.');
                    iVar.mo6902b((Exception) new IllegalArgumentException(sb.toString()));
                }
                return;
            }
            StickPointUploadTask stickPointUploadTask = this.f101417a;
            if (tTVideoInfo == null) {
                C7573i.m23580a();
            }
            stickPointUploadTask.f101415a = tTVideoInfo.mTosKey;
            this.f101419c.close();
            this.f101420d.mo6903b(this.f101417a);
        }

        C39105b(StickPointUploadTask stickPointUploadTask, C39966gm gmVar, TTVideoUploader tTVideoUploader, C1606i iVar) {
            this.f101417a = stickPointUploadTask;
            this.f101418b = gmVar;
            this.f101419c = tTVideoUploader;
            this.f101420d = iVar;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f101416b, (java.lang.Object) ((com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask) r2).f101416b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask r2 = (com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask) r2
            java.lang.String r0 = r1.f101416b
            java.lang.String r2 = r2.f101416b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f101416b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickPointUploadTask(originalPath=");
        sb.append(this.f101416b);
        sb.append(")");
        return sb.toString();
    }

    public StickPointUploadTask(String str) {
        C7573i.m23587b(str, "originalPath");
        this.f101416b = str;
    }

    public StickPointUploadTask(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            C7573i.m23580a();
        }
        this(readString);
        this.f101415a = parcel.readString();
    }

    /* renamed from: a */
    public final C1592h<StickPointUploadTask> mo97359a(C39966gm gmVar) {
        C7573i.m23587b(gmVar, "config");
        if (!C38527bf.m123172a(this.f101416b)) {
            StringBuilder sb = new StringBuilder("file not exist, ");
            sb.append(this.f101416b);
            C1592h<StickPointUploadTask> a = C1592h.m7850a((Exception) new IllegalStateException(sb.toString()));
            C7573i.m23582a((Object) a, "Task.forError(IllegalSta…exist, ${originalPath}\"))");
            return a;
        }
        C1606i iVar = new C1606i();
        TTVideoUploader tTVideoUploader = new TTVideoUploader();
        try {
            tTVideoUploader.setListener(new C39105b(this, gmVar, tTVideoUploader, iVar));
            tTVideoUploader.setMaxFailTime(gmVar.f103822h);
            tTVideoUploader.setSliceSize(gmVar.f103820f);
            tTVideoUploader.setFileUploadDomain(gmVar.f103816b);
            tTVideoUploader.setVideoUploadDomain(gmVar.f103817c);
            tTVideoUploader.setSliceTimeout(gmVar.f103818d);
            tTVideoUploader.setPathName(this.f101416b);
            tTVideoUploader.setFileRetryCount(1);
            tTVideoUploader.setUserKey(gmVar.f103814E);
            tTVideoUploader.setAuthorization(gmVar.f103813D);
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
        parcel.writeString(this.f101416b);
        parcel.writeString(this.f101415a);
    }
}
