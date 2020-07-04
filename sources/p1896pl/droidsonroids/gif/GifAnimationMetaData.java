package p1896pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.C1642a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: pl.droidsonroids.gif.GifAnimationMetaData */
public class GifAnimationMetaData implements Parcelable, Serializable {
    public static final Creator<GifAnimationMetaData> CREATOR = new Creator<GifAnimationMetaData>() {
        /* renamed from: a */
        private static GifAnimationMetaData[] m150063a(int i) {
            return new GifAnimationMetaData[i];
        }

        /* renamed from: a */
        private static GifAnimationMetaData m150062a(Parcel parcel) {
            return new GifAnimationMetaData(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m150062a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m150063a(i);
        }
    };
    private static final long serialVersionUID = 5692363926580237325L;
    private final int mDuration;
    private final int mHeight;
    private final int mImageCount;
    private final int mLoopCount;
    private final long mMetadataBytesCount;
    private final long mPixelsBytesCount;
    private final int mWidth;

    public int describeContents() {
        return 0;
    }

    public long getAllocationByteCount() {
        return this.mPixelsBytesCount;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getLoopCount() {
        return this.mLoopCount;
    }

    public long getMetadataAllocationByteCount() {
        return this.mMetadataBytesCount;
    }

    public int getNumberOfFrames() {
        return this.mImageCount;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public GifAnimationMetaData(byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr));
    }

    public GifAnimationMetaData(ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer));
    }

    private GifAnimationMetaData(GifInfoHandle gifInfoHandle) {
        this.mLoopCount = gifInfoHandle.mo123199e();
        this.mDuration = gifInfoHandle.mo123202g();
        this.mWidth = gifInfoHandle.mo123209n();
        this.mHeight = gifInfoHandle.mo123210o();
        this.mImageCount = gifInfoHandle.mo123211p();
        this.mMetadataBytesCount = gifInfoHandle.mo123207l();
        this.mPixelsBytesCount = gifInfoHandle.mo123206k();
        gifInfoHandle.mo123194a();
    }

    public boolean isAnimated() {
        if (this.mImageCount <= 1 || this.mDuration <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        if (this.mLoopCount == 0) {
            str = "Infinity";
        } else {
            str = Integer.toString(this.mLoopCount);
        }
        String a = C1642a.m8035a(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", new Object[]{Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight), Integer.valueOf(this.mImageCount), str, Integer.valueOf(this.mDuration)});
        if (!isAnimated()) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Animated ");
        sb.append(a);
        return sb.toString();
    }

    public GifAnimationMetaData(AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor));
    }

    private GifAnimationMetaData(Parcel parcel) {
        this.mLoopCount = parcel.readInt();
        this.mDuration = parcel.readInt();
        this.mHeight = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mImageCount = parcel.readInt();
        this.mMetadataBytesCount = parcel.readLong();
        this.mPixelsBytesCount = parcel.readLong();
    }

    public GifAnimationMetaData(File file) throws IOException {
        this(file.getPath());
    }

    public GifAnimationMetaData(FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor));
    }

    public GifAnimationMetaData(InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream));
    }

    public GifAnimationMetaData(String str) throws IOException {
        this(new GifInfoHandle(str));
    }

    public GifAnimationMetaData(ContentResolver contentResolver, Uri uri) throws IOException {
        this(GifInfoHandle.m150066a(contentResolver, uri));
    }

    public GifAnimationMetaData(AssetManager assetManager, String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public GifAnimationMetaData(Resources resources, int i) throws NotFoundException, IOException {
        this(resources.openRawResourceFd(i));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mLoopCount);
        parcel.writeInt(this.mDuration);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mImageCount);
        parcel.writeLong(this.mMetadataBytesCount);
        parcel.writeLong(this.mPixelsBytesCount);
    }

    public long getDrawableAllocationByteCount(C48425a aVar, int i) {
        long j;
        if (i <= 0 || i > 65535) {
            StringBuilder sb = new StringBuilder("Sample size ");
            sb.append(i);
            sb.append(" out of range <1, ￿");
            sb.append(">");
            throw new IllegalStateException(sb.toString());
        }
        int i2 = i * i;
        if (aVar == null || aVar.f123524e.isRecycled()) {
            j = (long) (((this.mWidth * this.mHeight) * 4) / i2);
        } else if (VERSION.SDK_INT >= 19) {
            j = (long) aVar.f123524e.getAllocationByteCount();
        } else {
            j = (long) aVar.mo123224e();
        }
        return (this.mPixelsBytesCount / ((long) i2)) + j;
    }
}
