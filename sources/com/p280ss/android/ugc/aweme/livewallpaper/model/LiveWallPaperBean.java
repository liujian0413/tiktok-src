package com.p280ss.android.ugc.aweme.livewallpaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.C7276d;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean */
public class LiveWallPaperBean implements Parcelable {
    public static final Creator<LiveWallPaperBean> CREATOR = new Creator<LiveWallPaperBean>() {
        /* renamed from: a */
        private static LiveWallPaperBean[] m105639a(int i) {
            return new LiveWallPaperBean[i];
        }

        /* renamed from: a */
        private static LiveWallPaperBean m105638a(Parcel parcel) {
            return new LiveWallPaperBean(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m105638a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m105639a(i);
        }
    };
    private int height;

    /* renamed from: id */
    private String f85018id;
    private String source;
    private String thumbnailPath;
    private String videoPath;
    private int width;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean$a */
    public static final class C32606a {

        /* renamed from: a */
        public String f85019a;

        /* renamed from: b */
        public String f85020b;

        /* renamed from: c */
        public String f85021c;

        /* renamed from: d */
        public int f85022d;

        /* renamed from: e */
        public int f85023e;

        /* renamed from: f */
        public String f85024f;

        private C32606a() {
        }

        /* renamed from: a */
        public final LiveWallPaperBean mo83951a() {
            return new LiveWallPaperBean(this);
        }

        /* renamed from: a */
        public final C32606a mo83949a(int i) {
            this.f85022d = i;
            return this;
        }

        /* renamed from: b */
        public final C32606a mo83952b(int i) {
            this.f85023e = i;
            return this;
        }

        /* renamed from: c */
        public final C32606a mo83954c(String str) {
            this.f85021c = str;
            return this;
        }

        /* renamed from: d */
        public final C32606a mo83955d(String str) {
            this.f85024f = str;
            return this;
        }

        /* renamed from: a */
        public final C32606a mo83950a(String str) {
            this.f85019a = str;
            return this;
        }

        /* renamed from: b */
        public final C32606a mo83953b(String str) {
            this.f85020b = str;
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f85018id;
    }

    public String getSource() {
        return this.source;
    }

    public String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public int getWidth() {
        return this.width;
    }

    public static C32606a newBuilder() {
        return new C32606a();
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.f85018id) || !C7276d.m22812b(this.thumbnailPath) || !C7276d.m22812b(this.videoPath)) {
            return false;
        }
        return true;
    }

    public static LiveWallPaperBean buildEmptyBean() {
        return new C32606a().mo83950a("").mo83949a(0).mo83952b(0).mo83953b("").mo83954c("").mo83951a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveWallPaperBean{id='");
        sb.append(this.f85018id);
        sb.append('\'');
        sb.append(", thumbnailPath='");
        sb.append(this.thumbnailPath);
        sb.append('\'');
        sb.append(", videoPath='");
        sb.append(this.videoPath);
        sb.append('\'');
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", source=");
        sb.append(this.source);
        sb.append('}');
        return sb.toString();
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.f85018id = str;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setThumbnailPath(String str) {
        this.thumbnailPath = str;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    private LiveWallPaperBean(C32606a aVar) {
        this.f85018id = aVar.f85019a;
        this.thumbnailPath = aVar.f85020b;
        this.videoPath = aVar.f85021c;
        this.width = aVar.f85022d;
        this.height = aVar.f85023e;
        this.source = aVar.f85024f;
    }

    private LiveWallPaperBean(Parcel parcel) {
        this.f85018id = parcel.readString();
        this.thumbnailPath = parcel.readString();
        this.videoPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.source = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f85018id);
        parcel.writeString(this.thumbnailPath);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.source);
    }
}
