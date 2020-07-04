package com.p280ss.android.ugc.aweme.filter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.StrArray */
public class StrArray implements Parcelable, Serializable {
    public static final Creator<StrArray> CREATOR = new Creator<StrArray>() {
        /* renamed from: a */
        private static StrArray[] m95795a(int i) {
            return new StrArray[i];
        }

        /* renamed from: a */
        private static StrArray m95794a(Parcel parcel) {
            return new StrArray(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m95794a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m95795a(i);
        }
    };
    private List<String> mItems;
    private List<Integer> numbers;

    public int describeContents() {
        return 0;
    }

    public StrArray() {
        this.mItems = new ArrayList();
        this.numbers = new ArrayList();
        this.numbers.add(Integer.valueOf(-1));
    }

    public void addIndex() {
        int size = this.mItems.size();
        if (size > 0) {
            this.numbers.add(Integer.valueOf(size - 1));
        }
    }

    public void removeLast() {
        if (!this.mItems.isEmpty()) {
            this.mItems.remove(this.mItems.size() - 1);
        }
    }

    public void removeLastArray() {
        int size = this.mItems.size();
        int size2 = this.numbers.size();
        if (size > 0 && size2 > 1) {
            int intValue = ((Integer) this.numbers.get(size2 - 2)).intValue();
            for (int i = size - 1; i > intValue; i--) {
                this.mItems.remove(i);
            }
            this.numbers.remove(size2 - 1);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.mItems.get(i));
            if (i != size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void add(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mItems.add(str);
        }
    }

    public static StrArray from(String str) {
        StrArray strArray = new StrArray();
        if (!TextUtils.isEmpty(str)) {
            for (String add : str.split(",")) {
                strArray.add(add);
            }
        }
        return strArray;
    }

    private StrArray(Parcel parcel) {
        this.numbers = new ArrayList();
        this.mItems = parcel.createStringArrayList();
        parcel.readList(this.numbers, Integer.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.mItems);
        parcel.writeList(this.numbers);
    }
}
