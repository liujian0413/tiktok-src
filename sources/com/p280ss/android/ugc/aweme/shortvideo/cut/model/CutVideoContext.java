package com.p280ss.android.ugc.aweme.shortvideo.cut.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C6311g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext */
public class CutVideoContext implements Parcelable, Serializable {
    public static final Creator<CutVideoContext> CREATOR = new Creator<CutVideoContext>() {
        /* renamed from: a */
        private static CutVideoContext[] m123846a(int i) {
            return new CutVideoContext[i];
        }

        /* renamed from: a */
        private static CutVideoContext m123845a(Parcel parcel) {
            return new CutVideoContext(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m123845a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m123846a(i);
        }
    };
    public float totalSpeed;
    private List<VideoSegment> videoSegmentList;

    public CutVideoContext() {
    }

    public int describeContents() {
        return 0;
    }

    public List<VideoSegment> getVideoSegmentList() {
        return this.videoSegmentList;
    }

    public void resetVideoSegmentList() {
        if (!C6311g.m19573a(this.videoSegmentList)) {
            for (int i = 0; i < this.videoSegmentList.size(); i++) {
                ((VideoSegment) this.videoSegmentList.get(i)).mo96900b();
            }
        }
    }

    public void setSpeed(float f) {
        this.totalSpeed = f;
    }

    public void setVideoSegmentList(List<VideoSegment> list) {
        this.videoSegmentList = list;
    }

    protected CutVideoContext(Parcel parcel) {
        this.totalSpeed = parcel.readFloat();
        this.videoSegmentList = new ArrayList();
        parcel.readList(this.videoSegmentList, VideoSegment.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble((double) this.totalSpeed);
        parcel.writeList(this.videoSegmentList);
    }
}
