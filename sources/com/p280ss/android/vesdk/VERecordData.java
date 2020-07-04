package com.p280ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p280ss.android.ttve.nativePort.TEVideoUtils;
import com.p280ss.android.vesdk.runtime.C45362d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.vesdk.VERecordData */
public class VERecordData implements Parcelable {
    public static final Creator<VERecordData> CREATOR = new Creator<VERecordData>() {
        /* renamed from: a */
        private static VERecordData[] m142684a(int i) {
            return new VERecordData[i];
        }

        /* renamed from: a */
        private static VERecordData m142683a(Parcel parcel) {
            return new VERecordData(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m142683a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m142684a(i);
        }
    };

    /* renamed from: a */
    static final String f116370a = VERecordData.class.getSimpleName();

    /* renamed from: b */
    public List<VERecordSegmentData> f116371b;

    /* renamed from: c */
    public boolean f116372c;

    /* renamed from: d */
    public String f116373d;

    /* renamed from: e */
    public String f116374e;

    /* renamed from: com.ss.android.vesdk.VERecordData$VERecordSegmentData */
    public static final class VERecordSegmentData implements Parcelable {
        public static final Creator<VERecordSegmentData> CREATOR = new Creator<VERecordSegmentData>() {
            /* renamed from: a */
            private static VERecordSegmentData[] m142686a(int i) {
                return new VERecordSegmentData[i];
            }

            /* renamed from: a */
            private static VERecordSegmentData m142685a(Parcel parcel) {
                return new VERecordSegmentData(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m142685a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m142686a(i);
            }
        };

        /* renamed from: a */
        public String f116375a;

        /* renamed from: b */
        public String f116376b;

        /* renamed from: c */
        public long f116377c;

        /* renamed from: d */
        public long f116378d;

        /* renamed from: e */
        public float f116379e;

        /* renamed from: f */
        public long f116380f;

        /* renamed from: g */
        public long f116381g;

        /* renamed from: h */
        public boolean f116382h;

        /* renamed from: i */
        public long f116383i;

        /* renamed from: j */
        public long f116384j;

        public final int describeContents() {
            return 0;
        }

        protected VERecordSegmentData(Parcel parcel) {
            boolean z;
            this.f116375a = parcel.readString();
            this.f116376b = parcel.readString();
            this.f116377c = parcel.readLong();
            this.f116378d = parcel.readLong();
            this.f116379e = parcel.readFloat();
            this.f116380f = parcel.readLong();
            this.f116381g = parcel.readLong();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f116382h = z;
            this.f116383i = parcel.readLong();
            this.f116384j = parcel.readLong();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f116375a);
            parcel.writeString(this.f116376b);
            parcel.writeLong(this.f116377c);
            parcel.writeLong(this.f116378d);
            parcel.writeFloat(this.f116379e);
            parcel.writeLong(this.f116380f);
            parcel.writeLong(this.f116381g);
            parcel.writeByte(this.f116382h ? (byte) 1 : 0);
            parcel.writeLong(this.f116383i);
            parcel.writeLong(this.f116384j);
        }

        public VERecordSegmentData(String str, long j, String str2, long j2, float f, long j3, long j4, boolean z) {
            this.f116375a = str;
            this.f116376b = str2;
            this.f116377c = j;
            this.f116378d = j2;
            this.f116379e = f;
            this.f116380f = j3;
            this.f116383i = j3;
            this.f116381g = j4;
            this.f116384j = j4;
            this.f116382h = true;
        }
    }

    private VERecordData() {
    }

    public int describeContents() {
        return 0;
    }

    protected VERecordData(Parcel parcel) {
        boolean z;
        this.f116371b = parcel.createTypedArrayList(VERecordSegmentData.CREATOR);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f116372c = z;
        this.f116373d = parcel.readString();
        this.f116374e = parcel.readString();
    }

    public VERecordData(List<VERecordSegmentData> list, boolean z) {
        this.f116371b = list;
        this.f116372c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f116371b);
        parcel.writeByte(this.f116372c ? (byte) 1 : 0);
        parcel.writeString(this.f116373d);
        parcel.writeString(this.f116374e);
    }

    /* renamed from: a */
    public final VERecordSegmentData mo108049a(int i, VERecordData vERecordData) {
        C45372t.m143403a(f116370a, "replaceSegmentData...");
        if (i < 0 || i >= this.f116371b.size() || vERecordData.f116371b == null || vERecordData.f116371b.size() == 0) {
            C45372t.m143409d(f116370a, "参数错误");
            return null;
        }
        VERecordSegmentData vERecordSegmentData = (VERecordSegmentData) this.f116371b.remove(i);
        long j = vERecordSegmentData.f116377c;
        Iterator it = vERecordData.f116371b.iterator();
        long j2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            VERecordSegmentData vERecordSegmentData2 = (VERecordSegmentData) it.next();
            if ((vERecordSegmentData2.f116377c + j2) - j >= 0) {
                long j3 = j - j2;
                vERecordSegmentData2.f116378d = j3;
                vERecordSegmentData2.f116377c = j3;
                vERecordSegmentData2.f116384j = j3;
                vERecordSegmentData2.f116381g = j3;
                this.f116371b.add(i, vERecordSegmentData2);
                break;
            }
            int i2 = i + 1;
            this.f116371b.add(i, vERecordSegmentData2);
            j2 += vERecordSegmentData2.f116377c;
            i = i2;
        }
        return vERecordSegmentData;
    }

    /* renamed from: a */
    public final int mo108048a(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        String str = f116370a;
        StringBuilder sb = new StringBuilder("setTimeRange, start: ");
        sb.append(j3);
        sb.append(" end: ");
        sb.append(j4);
        C45372t.m143403a(str, sb.toString());
        if (j4 <= j3) {
            return -100;
        }
        long j5 = 0;
        for (VERecordSegmentData vERecordSegmentData : this.f116371b) {
            long j6 = vERecordSegmentData.f116381g - vERecordSegmentData.f116380f;
            if (j5 < j3 || j5 + j6 > j4) {
                if (j5 + j6 <= j3 || j5 >= j4) {
                    vERecordSegmentData.f116383i = 0;
                    vERecordSegmentData.f116384j = 0;
                    vERecordSegmentData.f116382h = false;
                    j5 += j6;
                    j3 = j;
                } else {
                    long j7 = (j3 - j5) + vERecordSegmentData.f116380f;
                    long j8 = (j4 - j5) + vERecordSegmentData.f116380f;
                    if (j7 <= vERecordSegmentData.f116380f) {
                        j7 = vERecordSegmentData.f116380f;
                    }
                    vERecordSegmentData.f116383i = j7;
                    if (j8 > vERecordSegmentData.f116381g) {
                        j8 = vERecordSegmentData.f116381g;
                    }
                    vERecordSegmentData.f116384j = j8;
                }
            }
            j5 += j6;
            j3 = j;
        }
        return 0;
    }

    /* renamed from: a */
    public static VERecordData m142680a(C45362d dVar, boolean z) {
        String sb;
        long j;
        String a = dVar.mo56149a();
        if (TextUtils.isEmpty(a)) {
            C45372t.m143409d(f116370a, "分段视频路径为空");
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(File.separatorChar);
        if (!a.endsWith(sb2.toString())) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a);
            sb3.append(File.separatorChar);
            a = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a);
        sb4.append("data.txt");
        String sb5 = sb4.toString();
        File file = new File(sb5);
        if (!file.exists()) {
            String str = f116370a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb5);
            sb6.append(" is not exist");
            C45372t.m143409d(str, sb6.toString());
            return null;
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                C45372t.m143409d(f116370a, "not found count");
                return null;
            }
            int intValue = Integer.valueOf(readLine).intValue();
            String readLine2 = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine2)) {
                C45372t.m143409d(f116370a, "not found audioLength");
                return null;
            }
            String[] split = readLine2.split("\t");
            String readLine3 = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine3)) {
                C45372t.m143409d(f116370a, "not found speed");
                return null;
            }
            String[] split2 = readLine3.split("\t");
            String readLine4 = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine4)) {
                C45372t.m143409d(f116370a, "not found music start time");
                return null;
            }
            String[] split3 = readLine4.split("\t");
            bufferedReader.close();
            inputStreamReader.close();
            if (intValue != 0 && intValue == split.length && intValue == split2.length) {
                VERecordData vERecordData = new VERecordData();
                vERecordData.f116371b = new LinkedList();
                if (split3.length != intValue || !z) {
                    vERecordData.f116372c = false;
                } else {
                    vERecordData.f116372c = true;
                }
                for (int i = 1; i <= intValue; i++) {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(a);
                    sb7.append(i);
                    sb7.append("_frag_v");
                    String sb8 = sb7.toString();
                    if (vERecordData.f116372c) {
                        sb = "";
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(a);
                        sb9.append(i);
                        sb9.append("_frag_a");
                        sb = sb9.toString();
                    }
                    String str2 = sb;
                    if (!vERecordData.f116372c || split3.length <= i) {
                        j = Long.valueOf(split[i - 1]).longValue();
                    } else {
                        j = (Long.valueOf(split3[i]).longValue() - Long.valueOf(split3[i - 1]).longValue()) * 1000;
                    }
                    if (j <= 0) {
                        int[] iArr = new int[10];
                        TEVideoUtils.getVideoFileInfo(sb8, iArr);
                        j = (long) (iArr[3] * 1000);
                        String str3 = f116370a;
                        StringBuilder sb10 = new StringBuilder("audioLength is 0, use file length: ");
                        sb10.append(j);
                        C45372t.m143407c(str3, sb10.toString());
                    }
                    long j2 = j;
                    VERecordSegmentData vERecordSegmentData = new VERecordSegmentData(sb8, j2, str2, j2, Float.valueOf(split2[i - 1]).floatValue(), 0, j2, true);
                    vERecordData.f116371b.add(vERecordSegmentData);
                }
                return vERecordData;
            }
            C45372t.m143409d(f116370a, "读取文件内容出错, 分段信息不匹配");
            return null;
        } catch (Exception unused) {
            C45372t.m143409d(f116370a, "读取文件内容出错");
            return null;
        }
    }
}
