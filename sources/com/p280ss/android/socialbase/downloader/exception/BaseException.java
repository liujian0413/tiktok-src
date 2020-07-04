package com.p280ss.android.socialbase.downloader.exception;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p280ss.android.socialbase.downloader.utils.C20359e;

/* renamed from: com.ss.android.socialbase.downloader.exception.BaseException */
public class BaseException extends Exception implements Parcelable {
    public static final Creator<BaseException> CREATOR = new Creator<BaseException>() {
        /* renamed from: a */
        private static BaseException[] m67067a(int i) {
            return new BaseException[i];
        }

        /* renamed from: a */
        private static BaseException m67066a(Parcel parcel) {
            return new BaseException(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m67066a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m67067a(i);
        }
    };
    private int errorCode;
    private String errorMsg;

    public BaseException() {
    }

    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    protected BaseException(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.errorCode = parcel.readInt();
        this.errorMsg = parcel.readString();
    }

    public BaseException(int i, Throwable th) {
        this(i, C20359e.m67597e(th));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.errorMsg);
    }

    public BaseException(int i, String str) {
        StringBuilder sb = new StringBuilder("[d-ex]:");
        sb.append(str);
        super(sb.toString());
        StringBuilder sb2 = new StringBuilder("[d-ex]:");
        sb2.append(str);
        this.errorMsg = sb2.toString();
        this.errorCode = i;
    }
}
