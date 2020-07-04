package com.p280ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VESize;
import com.p280ss.android.vesdk.VEUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo */
public final class EditPreviewInfo implements Parcelable, Serializable {
    public static final Creator<EditPreviewInfo> CREATOR = new C39686b();
    public static final C39685a Companion = new C39685a(null);
    private int calculateHeight;
    private int calculateWidth;
    private String draftDir;
    private final int previewHeight;
    private int previewVideoLength;
    private final int previewWidth;
    private String[] reverseAudioArray;
    private String[] reverseVideoArray;
    private final long sceneIn;
    private final long sceneOut;
    private String[] tempVideoArray;
    private final ROTATE_DEGREE[] totalRotate;
    private final int[] totalVideoHeight;
    private final int[] totalVideoWidth;
    private final List<EditVideoSegment> videoList;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo$a */
    public static final class C39685a {
        private C39685a() {
        }

        public /* synthetic */ C39685a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo$b */
    public static final class C39686b implements Creator<EditPreviewInfo> {
        C39686b() {
        }

        /* renamed from: a */
        private static EditPreviewInfo[] m127016a(int i) {
            return new EditPreviewInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m127015a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m127016a(i);
        }

        /* renamed from: a */
        private static EditPreviewInfo m127015a(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            return new EditPreviewInfo(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getPreviewHeight() {
        return this.previewHeight;
    }

    public final int getPreviewVideoLength() {
        return this.previewVideoLength;
    }

    public final int getPreviewWidth() {
        return this.previewWidth;
    }

    public final String[] getReverseAudioArray() {
        return this.reverseAudioArray;
    }

    public final String[] getReverseVideoArray() {
        return this.reverseVideoArray;
    }

    public final long getSceneIn() {
        return this.sceneIn;
    }

    public final long getSceneOut() {
        return this.sceneOut;
    }

    public final String[] getTempVideoArray() {
        return this.tempVideoArray;
    }

    public final List<EditVideoSegment> getVideoList() {
        return this.videoList;
    }

    public final String reverseVideo() {
        String[] strArr = this.reverseVideoArray;
        if (strArr != null) {
            return strArr[0];
        }
        return null;
    }

    public final int videoFps() {
        return ((EditVideoSegment) this.videoList.get(0)).getVideoFileInfo().getFps();
    }

    public final String getDraftDir() {
        boolean z;
        if (this.draftDir.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(C39811er.f103470f);
            sb.append("fast_import/");
            sb.append(System.currentTimeMillis());
            sb.append('/');
            this.draftDir = sb.toString();
        }
        return this.draftDir;
    }

    public final void setPreviewVideoLength(int i) {
        this.previewVideoLength = i;
    }

    public final void setReverseAudioArray(String[] strArr) {
        this.reverseAudioArray = strArr;
    }

    public final void setReverseVideoArray(String[] strArr) {
        this.reverseVideoArray = strArr;
    }

    public final void setTempVideoArray(String[] strArr) {
        this.tempVideoArray = strArr;
    }

    public final int videoHeight(boolean z) {
        if (!z) {
            return ((EditVideoSegment) this.videoList.get(0)).getVideoFileInfo().getHeight();
        }
        if (this.calculateHeight <= 0) {
            VESize calcTargetRes = VEUtils.calcTargetRes(this.totalVideoWidth, this.totalVideoHeight, this.totalRotate, this.previewWidth);
            this.calculateWidth = calcTargetRes.f116385a;
            this.calculateHeight = calcTargetRes.f116386b;
        }
        return this.calculateHeight;
    }

    public final int videoWidth(boolean z) {
        if (!z) {
            return ((EditVideoSegment) this.videoList.get(0)).getVideoFileInfo().getWidth();
        }
        if (this.calculateWidth <= 0) {
            VESize calcTargetRes = VEUtils.calcTargetRes(this.totalVideoWidth, this.totalVideoHeight, this.totalRotate, this.previewWidth);
            this.calculateWidth = calcTargetRes.f116385a;
            this.calculateHeight = calcTargetRes.f116386b;
        }
        return this.calculateWidth;
    }

    public EditPreviewInfo(Parcel parcel) {
        C7573i.m23587b(parcel, "source");
        ArrayList createTypedArrayList = parcel.createTypedArrayList(EditVideoSegment.CREATOR);
        C7573i.m23582a((Object) createTypedArrayList, "source.createTypedArrayL…EditVideoSegment.CREATOR)");
        this(createTypedArrayList, parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong());
        String readString = parcel.readString();
        C7573i.m23582a((Object) readString, "source.readString()");
        this.draftDir = readString;
        this.calculateWidth = parcel.readInt();
        this.calculateHeight = parcel.readInt();
        this.previewVideoLength = parcel.readInt();
        this.reverseVideoArray = parcel.createStringArray();
        this.reverseAudioArray = parcel.createStringArray();
        this.tempVideoArray = parcel.createStringArray();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "dest");
        parcel.writeTypedList(this.videoList);
        parcel.writeInt(this.previewWidth);
        parcel.writeInt(this.previewHeight);
        parcel.writeLong(this.sceneIn);
        parcel.writeLong(this.sceneOut);
        parcel.writeString(getDraftDir());
        parcel.writeInt(this.calculateWidth);
        parcel.writeInt(this.calculateHeight);
        parcel.writeInt(this.previewVideoLength);
        parcel.writeStringArray(this.reverseVideoArray);
        parcel.writeStringArray(this.reverseAudioArray);
        parcel.writeStringArray(this.tempVideoArray);
    }

    public final void updateReverseVideoContent(String[] strArr, String[] strArr2, String[] strArr3) {
        this.reverseVideoArray = strArr;
        this.reverseAudioArray = strArr2;
        this.tempVideoArray = strArr3;
    }

    public EditPreviewInfo(List<EditVideoSegment> list, int i, int i2, long j, long j2) {
        ROTATE_DEGREE rotate_degree;
        C7573i.m23587b(list, "videoList");
        this.videoList = list;
        this.previewWidth = i;
        this.previewHeight = i2;
        this.sceneIn = j;
        this.sceneOut = j2;
        Iterable<EditVideoSegment> iterable = this.videoList;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (EditVideoSegment videoFileInfo : iterable) {
            arrayList.add(Integer.valueOf(videoFileInfo.getVideoFileInfo().getWidth()));
        }
        this.totalVideoWidth = C7525m.m23507c((Collection<Integer>) (List) arrayList);
        Iterable<EditVideoSegment> iterable2 = this.videoList;
        Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable2, 10));
        for (EditVideoSegment videoFileInfo2 : iterable2) {
            arrayList2.add(Integer.valueOf(videoFileInfo2.getVideoFileInfo().getHeight()));
        }
        this.totalVideoHeight = C7525m.m23507c((Collection<Integer>) (List) arrayList2);
        Iterable<EditVideoSegment> iterable3 = this.videoList;
        Collection arrayList3 = new ArrayList(C7525m.m23469a(iterable3, 10));
        for (EditVideoSegment videoCutInfo : iterable3) {
            VideoCutInfo videoCutInfo2 = videoCutInfo.getVideoCutInfo();
            if (videoCutInfo2 != null) {
                int rotate = videoCutInfo2.getRotate();
                if (rotate == 90) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_90;
                } else if (rotate == 180) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_180;
                } else if (rotate != 270) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                } else {
                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                }
                if (rotate_degree != null) {
                    arrayList3.add(rotate_degree);
                }
            }
            rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
            arrayList3.add(rotate_degree);
        }
        Object[] array = ((List) arrayList3).toArray(new ROTATE_DEGREE[0]);
        if (array != null) {
            this.totalRotate = (ROTATE_DEGREE[]) array;
            this.draftDir = "";
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public /* synthetic */ EditPreviewInfo(List list, int i, int i2, long j, long j2, int i3, C7571f fVar) {
        int i4;
        long j3;
        int i5 = -1;
        if ((i3 & 2) != 0) {
            i4 = -1;
        } else {
            i4 = i;
        }
        if ((i3 & 4) == 0) {
            i5 = i2;
        }
        long j4 = -1;
        if ((i3 & 8) != 0) {
            j3 = -1;
        } else {
            j3 = j;
        }
        if ((i3 & 16) == 0) {
            j4 = j2;
        }
        this(list, i4, i5, j3, j4);
    }
}
