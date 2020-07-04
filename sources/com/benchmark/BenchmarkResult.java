package com.benchmark;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;

public class BenchmarkResult implements Parcelable {
    public static final Creator<BenchmarkResult> CREATOR = new Creator<BenchmarkResult>() {
        /* renamed from: a */
        private static BenchmarkResult[] m8933a(int i) {
            return new BenchmarkResult[i];
        }

        /* renamed from: a */
        private static BenchmarkResult m8932a(Parcel parcel) {
            return new BenchmarkResult(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8932a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m8933a(i);
        }
    };

    /* renamed from: a */
    public int f6994a;

    /* renamed from: b */
    public String f6995b;

    /* renamed from: c */
    public HashMap<String, String> f6996c;

    /* renamed from: d */
    public long[] f6997d;

    /* renamed from: e */
    public Benchmark f6998e;

    public int describeContents() {
        return 0;
    }

    protected BenchmarkResult(Parcel parcel) {
        this.f6994a = parcel.readInt();
        this.f6995b = parcel.readString();
        this.f6997d = parcel.createLongArray();
        this.f6996c = parcel.readHashMap(HashMap.class.getClassLoader());
        this.f6998e = (Benchmark) parcel.readParcelable(Benchmark.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6994a);
        parcel.writeString(this.f6995b);
        parcel.writeLongArray(this.f6997d);
        parcel.writeMap(this.f6996c);
        parcel.writeParcelable(this.f6998e, i);
    }

    public BenchmarkResult(Benchmark benchmark, int i, String str, Map<String, String> map) {
        this(benchmark, i, str, map, null);
    }

    public BenchmarkResult(Benchmark benchmark, int i, String str, long[] jArr) {
        this(benchmark, i, str, null, jArr);
    }

    public BenchmarkResult(Benchmark benchmark, int i, String str, Map<String, String> map, long[] jArr) {
        this.f6998e = benchmark;
        this.f6994a = i;
        this.f6995b = str;
        this.f6996c = new HashMap<>();
        if (map != null) {
            this.f6996c.putAll(map);
        }
        this.f6997d = jArr;
    }
}
