package com.bytedance.android.p109c.p112b.p113a;

import com.bytedance.android.p109c.p112b.C2288c;
import com.bytedance.android.p109c.p112b.p113a.p114a.C2276a;
import com.bytedance.android.p109c.p112b.p113a.p114a.C2277b;
import com.bytedance.android.p109c.p112b.p113a.p114a.C2278c;
import com.bytedance.android.p109c.p112b.p113a.p114a.C2279d;
import com.bytedance.android.p109c.p112b.p113a.p114a.C2280e;
import com.bytedance.android.p109c.p112b.p113a.p114a.C2281f;
import com.bytedance.android.p109c.p112b.p113a.p114a.C2282g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.c.b.a.b */
public final class C2283b {

    /* renamed from: a */
    public String f7557a;

    /* renamed from: b */
    public int f7558b;

    /* renamed from: c */
    public boolean f7559c;

    /* renamed from: d */
    public int f7560d;

    /* renamed from: e */
    public long f7561e;

    /* renamed from: f */
    public float f7562f;

    /* renamed from: g */
    public double f7563g;

    /* renamed from: h */
    public String f7564h;

    /* renamed from: i */
    public byte[] f7565i;

    /* renamed from: j */
    public List<String> f7566j = new ArrayList();

    /* renamed from: k */
    private transient int f7567k;

    /* renamed from: com.bytedance.android.c.b.a.b$a */
    public static final class C2284a {
        /* renamed from: a */
        public static String m9824a(C2288c cVar) throws IOException {
            int b;
            C2285c cVar2 = new C2285c(cVar);
            cVar2.mo8078a();
            do {
                b = cVar2.mo8080b();
                if (b == -1) {
                    throw new IllegalArgumentException("No key found in proto");
                }
            } while (b != 1);
            return cVar2.mo8082d();
        }

        /* renamed from: a */
        public static int m9822a(C2283b bVar) {
            if (bVar.f7558b == 0) {
                return C2282g.m9815a(1, bVar.f7557a);
            }
            int a = C2280e.m9811a(2, bVar.f7558b) + C2282g.m9815a(1, bVar.f7557a);
            switch (bVar.f7558b) {
                case 2:
                    return a + C2280e.m9811a(2, bVar.f7558b);
                case 3:
                    return a + C2276a.m9803a(3);
                case 4:
                    return a + C2280e.m9811a(4, bVar.f7560d);
                case 5:
                    return a + C2281f.m9813a(5, bVar.f7561e);
                case 6:
                    return a + C2279d.m9809a(6);
                case 7:
                    return a + C2278c.m9807a(7);
                case 8:
                    return a + C2282g.m9815a(8, bVar.f7564h);
                case 9:
                    return a + C2277b.m9805a(9, bVar.f7565i);
                case 10:
                    return a + C2282g.m9816a(10, bVar.f7566j);
                default:
                    throw new IllegalArgumentException("Unknown type!");
            }
        }

        /* renamed from: a */
        public static void m9825a(C2275a aVar, C2283b bVar) {
            C2282g.m9817a(aVar, 1, bVar.f7557a);
            if (bVar.f7558b != 0) {
                C2280e.m9812a(aVar, 2, bVar.f7558b);
                switch (bVar.f7558b) {
                    case 3:
                        C2276a.m9804a(aVar, 3, bVar.f7559c);
                        return;
                    case 4:
                        C2280e.m9812a(aVar, 4, bVar.f7560d);
                        return;
                    case 5:
                        C2281f.m9814a(aVar, 5, bVar.f7561e);
                        return;
                    case 6:
                        C2279d.m9810a(aVar, 6, bVar.f7562f);
                        return;
                    case 7:
                        C2278c.m9808a(aVar, 7, bVar.f7563g);
                        return;
                    case 8:
                        C2282g.m9817a(aVar, 8, bVar.f7564h);
                        return;
                    case 9:
                        C2277b.m9806a(aVar, 9, bVar.f7565i);
                        return;
                    case 10:
                        C2282g.m9818a(aVar, 10, bVar.f7566j);
                        return;
                    default:
                        throw new IllegalArgumentException("Unknown type!");
                }
            }
        }

        /* renamed from: a */
        public static C2283b m9823a(C2285c cVar, C2283b bVar) throws IOException {
            cVar.mo8078a();
            bVar.f7566j.clear();
            while (true) {
                int b = cVar.mo8080b();
                if (b != -1) {
                    switch (b) {
                        case 1:
                            bVar.f7557a = cVar.mo8082d();
                            break;
                        case 2:
                            bVar.f7558b = cVar.mo8083e();
                            if (bVar.f7558b != 0) {
                                break;
                            } else {
                                return bVar;
                            }
                        case 3:
                            boolean z = true;
                            if (cVar.mo8083e() != 1) {
                                z = false;
                            }
                            bVar.f7559c = z;
                            return bVar;
                        case 4:
                            bVar.f7560d = cVar.mo8083e();
                            return bVar;
                        case 5:
                            bVar.f7561e = cVar.mo8084f();
                            return bVar;
                        case 6:
                            bVar.f7562f = Float.intBitsToFloat(cVar.mo8085g());
                            return bVar;
                        case 7:
                            bVar.f7563g = Double.longBitsToDouble(cVar.mo8086h());
                            return bVar;
                        case 8:
                            bVar.f7564h = cVar.mo8082d();
                            return bVar;
                        case 9:
                            bVar.f7565i = cVar.mo8081c();
                            return bVar;
                        case 10:
                            bVar.f7566j.add(cVar.mo8082d());
                            break;
                        default:
                            StringBuilder sb = new StringBuilder("Unexpected tag: ");
                            sb.append(b);
                            throw new IllegalStateException(sb.toString());
                    }
                } else if (bVar.f7558b == 10) {
                    return bVar;
                } else {
                    StringBuilder sb2 = new StringBuilder("Wrong type! Expected: StringList, Found: ");
                    sb2.append(C2283b.m9819a(Integer.valueOf(bVar.f7558b)));
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8074a() {
        this.f7559c = false;
        this.f7560d = 0;
        this.f7561e = 0;
        this.f7562f = 0.0f;
        this.f7563g = 0.0d;
        this.f7564h = null;
        this.f7565i = null;
        this.f7566j.clear();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.f7567k;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = ((this.f7557a.hashCode() * 37) + this.f7558b) * 37;
        if (this.f7559c) {
            i = 1231;
        } else {
            i = 1237;
        }
        int floatToIntBits = ((((((hashCode + i) * 37) + this.f7560d) * 37) + ((int) (this.f7561e ^ (this.f7561e >>> 32)))) * 37) + Float.floatToIntBits(this.f7562f);
        long doubleToLongBits = Double.doubleToLongBits(this.f7563g);
        int i4 = ((floatToIntBits * 37) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 37;
        int i5 = 0;
        if (this.f7564h != null) {
            i2 = this.f7564h.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i4 + i2) * 37;
        if (this.f7565i != null) {
            i5 = Arrays.hashCode(this.f7565i);
        }
        int hashCode2 = ((i6 + i5) * 37) + this.f7566j.hashCode();
        this.f7567k = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("key=");
        sb.append(this.f7557a);
        sb.append(", type=");
        sb.append(this.f7558b);
        sb.append(", booleanValue=");
        sb.append(this.f7559c);
        sb.append(", intValue=");
        sb.append(this.f7560d);
        sb.append(", longValue=");
        sb.append(this.f7561e);
        sb.append(", floatValue=");
        sb.append(this.f7562f);
        sb.append(", doubleValue=");
        sb.append(this.f7563g);
        sb.append(", stringValue=");
        sb.append(this.f7564h);
        sb.append(", bytesValue=");
        sb.append(this.f7565i);
        sb.append(", stringListValue=");
        sb.append(this.f7566j);
        StringBuilder replace = sb.replace(0, 2, "DataProto{");
        replace.append('}');
        return replace.toString();
    }

    /* renamed from: a */
    public static String m9819a(Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 2:
                return "TYPE";
            case 3:
                return "Boolean";
            case 4:
                return "Integer";
            case 5:
                return "Long";
            case 6:
                return "Float";
            case 7:
                return "Double";
            case 8:
                return "String";
            case 9:
                return "Bytes";
            case 10:
                return "StringList";
            default:
                return "UNKNOWN";
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2283b)) {
            return false;
        }
        C2283b bVar = (C2283b) obj;
        if (!m9820a(this.f7557a, bVar.f7557a) || !m9820a(Integer.valueOf(this.f7558b), Integer.valueOf(bVar.f7558b)) || !m9820a(Boolean.valueOf(this.f7559c), Boolean.valueOf(bVar.f7559c)) || !m9820a(Integer.valueOf(this.f7560d), Integer.valueOf(bVar.f7560d)) || !m9820a(Long.valueOf(this.f7561e), Long.valueOf(bVar.f7561e)) || !m9820a(Float.valueOf(this.f7562f), Float.valueOf(bVar.f7562f)) || !m9820a(Double.valueOf(this.f7563g), Double.valueOf(bVar.f7563g)) || !m9820a(this.f7564h, bVar.f7564h) || !Arrays.equals(this.f7565i, bVar.f7565i) || !this.f7566j.equals(bVar.f7566j)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m9820a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
