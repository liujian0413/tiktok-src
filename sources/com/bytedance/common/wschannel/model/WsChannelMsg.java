package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WsChannelMsg implements Parcelable {
    public static final Creator<WsChannelMsg> CREATOR = new Creator<WsChannelMsg>() {
        /* renamed from: a */
        private static WsChannelMsg[] m28996a(int i) {
            return new WsChannelMsg[i];
        }

        /* renamed from: a */
        private static WsChannelMsg m28995a(Parcel parcel) {
            return new WsChannelMsg(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m28995a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m28996a(i);
        }
    };

    /* renamed from: a */
    public static WsChannelMsg f26766a = new WsChannelMsg();

    /* renamed from: b */
    public long f26767b;

    /* renamed from: c */
    public long f26768c;

    /* renamed from: d */
    public int f26769d;

    /* renamed from: e */
    public int f26770e;

    /* renamed from: f */
    public List<MsgHeader> f26771f;

    /* renamed from: g */
    public String f26772g;

    /* renamed from: h */
    public String f26773h;

    /* renamed from: i */
    public byte[] f26774i;

    /* renamed from: j */
    public ComponentName f26775j;

    /* renamed from: k */
    public int f26776k;

    public static class MsgHeader implements Parcelable {
        public static final Creator<MsgHeader> CREATOR = new Creator<MsgHeader>() {
            /* renamed from: a */
            private static MsgHeader[] m28998a(int i) {
                return new MsgHeader[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m28997a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m28998a(i);
            }

            /* renamed from: a */
            private static MsgHeader m28997a(Parcel parcel) {
                MsgHeader msgHeader = new MsgHeader();
                msgHeader.f26777a = parcel.readString();
                msgHeader.f26778b = parcel.readString();
                return msgHeader;
            }
        };

        /* renamed from: a */
        public String f26777a;

        /* renamed from: b */
        public String f26778b;

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MsgHeader{key='");
            sb.append(this.f26777a);
            sb.append('\'');
            sb.append(", value='");
            sb.append(this.f26778b);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f26777a);
            parcel.writeString(this.f26778b);
        }
    }

    /* renamed from: com.bytedance.common.wschannel.model.WsChannelMsg$a */
    public static final class C9826a {

        /* renamed from: a */
        private final int f26779a;

        /* renamed from: b */
        private Map<String, String> f26780b = new HashMap();

        /* renamed from: c */
        private long f26781c;

        /* renamed from: d */
        private int f26782d;

        /* renamed from: e */
        private int f26783e;

        /* renamed from: f */
        private byte[] f26784f;

        /* renamed from: g */
        private String f26785g = "";

        /* renamed from: h */
        private String f26786h = "";

        /* renamed from: i */
        private long f26787i;

        /* renamed from: j */
        private ComponentName f26788j;

        /* renamed from: a */
        public final WsChannelMsg mo24372a() {
            if (this.f26779a <= 0) {
                throw new IllegalArgumentException("illegal channelId");
            } else if (this.f26782d <= 0) {
                throw new IllegalArgumentException("illegal service");
            } else if (this.f26783e <= 0) {
                throw new IllegalArgumentException("illegal method");
            } else if (this.f26784f != null) {
                ArrayList arrayList = new ArrayList();
                for (Entry entry : this.f26780b.entrySet()) {
                    MsgHeader msgHeader = new MsgHeader();
                    msgHeader.f26777a = (String) entry.getKey();
                    msgHeader.f26778b = (String) entry.getValue();
                    arrayList.add(msgHeader);
                }
                WsChannelMsg wsChannelMsg = new WsChannelMsg(this.f26779a, this.f26787i, this.f26781c, this.f26782d, this.f26783e, arrayList, this.f26786h, this.f26785g, this.f26784f, this.f26788j);
                return wsChannelMsg;
            } else {
                throw new IllegalArgumentException("illegal payload");
            }
        }

        /* renamed from: a */
        public final C9826a mo24368a(long j) {
            this.f26781c = j;
            return this;
        }

        /* renamed from: b */
        public final C9826a mo24373b(int i) {
            this.f26782d = i;
            return this;
        }

        /* renamed from: c */
        public final C9826a mo24376c(int i) {
            this.f26783e = i;
            return this;
        }

        /* renamed from: a */
        public static C9826a m28999a(int i) {
            return new C9826a(i);
        }

        /* renamed from: b */
        public final C9826a mo24374b(long j) {
            this.f26787i = j;
            return this;
        }

        /* renamed from: a */
        public final C9826a mo24369a(String str) {
            this.f26785g = str;
            return this;
        }

        /* renamed from: b */
        public final C9826a mo24375b(String str) {
            this.f26786h = str;
            return this;
        }

        private C9826a(int i) {
            this.f26779a = i;
        }

        /* renamed from: a */
        public final C9826a mo24371a(byte[] bArr) {
            this.f26784f = bArr;
            return this;
        }

        /* renamed from: a */
        public final C9826a mo24370a(String str, String str2) {
            this.f26780b.put(str, str2);
            return this;
        }
    }

    public WsChannelMsg() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final byte[] mo24357a() {
        if (this.f26774i == null) {
            this.f26774i = new byte[1];
        }
        return this.f26774i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WsChannelMsg{, channelId = ");
        sb.append(this.f26776k);
        sb.append(", logId=");
        sb.append(this.f26768c);
        sb.append(", service=");
        sb.append(this.f26769d);
        sb.append(", method=");
        sb.append(this.f26770e);
        sb.append(", msgHeaders=");
        sb.append(this.f26771f);
        sb.append(", payloadEncoding='");
        sb.append(this.f26772g);
        sb.append('\'');
        sb.append(", payloadType='");
        sb.append(this.f26773h);
        sb.append('\'');
        sb.append(", payload=");
        sb.append(Arrays.toString(this.f26774i));
        sb.append(", replayToComponentName=");
        sb.append(this.f26775j);
        sb.append('}');
        return sb.toString();
    }

    protected WsChannelMsg(Parcel parcel) {
        this.f26767b = parcel.readLong();
        this.f26768c = parcel.readLong();
        this.f26769d = parcel.readInt();
        this.f26770e = parcel.readInt();
        this.f26771f = parcel.createTypedArrayList(MsgHeader.CREATOR);
        this.f26772g = parcel.readString();
        this.f26773h = parcel.readString();
        this.f26774i = parcel.createByteArray();
        this.f26775j = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.f26776k = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f26767b);
        parcel.writeLong(this.f26768c);
        parcel.writeInt(this.f26769d);
        parcel.writeInt(this.f26770e);
        parcel.writeTypedList(this.f26771f);
        parcel.writeString(this.f26772g);
        parcel.writeString(this.f26773h);
        parcel.writeByteArray(this.f26774i);
        parcel.writeParcelable(this.f26775j, i);
        parcel.writeInt(this.f26776k);
    }

    public WsChannelMsg(int i, long j, long j2, int i2, int i3, List<MsgHeader> list, String str, String str2, byte[] bArr, ComponentName componentName) {
        this.f26776k = i;
        this.f26767b = j;
        this.f26768c = j2;
        this.f26769d = i2;
        this.f26770e = i3;
        this.f26771f = list;
        this.f26772g = str;
        this.f26773h = str2;
        this.f26774i = bArr;
        this.f26775j = componentName;
    }
}
