package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

public enum zzcdi {
    DOUBLE(0, axq.SCALAR, zzcdz.DOUBLE),
    FLOAT(1, axq.SCALAR, zzcdz.FLOAT),
    INT64(2, axq.SCALAR, zzcdz.LONG),
    UINT64(3, axq.SCALAR, zzcdz.LONG),
    INT32(4, axq.SCALAR, zzcdz.INT),
    FIXED64(5, axq.SCALAR, zzcdz.LONG),
    FIXED32(6, axq.SCALAR, zzcdz.INT),
    BOOL(7, axq.SCALAR, zzcdz.BOOLEAN),
    STRING(8, axq.SCALAR, zzcdz.STRING),
    MESSAGE(9, axq.SCALAR, zzcdz.MESSAGE),
    BYTES(10, axq.SCALAR, zzcdz.BYTE_STRING),
    UINT32(11, axq.SCALAR, zzcdz.INT),
    ENUM(12, axq.SCALAR, zzcdz.ENUM),
    SFIXED32(13, axq.SCALAR, zzcdz.INT),
    SFIXED64(14, axq.SCALAR, zzcdz.LONG),
    SINT32(15, axq.SCALAR, zzcdz.INT),
    SINT64(16, axq.SCALAR, zzcdz.LONG),
    GROUP(17, axq.SCALAR, zzcdz.MESSAGE),
    DOUBLE_LIST(18, axq.VECTOR, zzcdz.DOUBLE),
    FLOAT_LIST(19, axq.VECTOR, zzcdz.FLOAT),
    INT64_LIST(20, axq.VECTOR, zzcdz.LONG),
    UINT64_LIST(21, axq.VECTOR, zzcdz.LONG),
    INT32_LIST(22, axq.VECTOR, zzcdz.INT),
    FIXED64_LIST(23, axq.VECTOR, zzcdz.LONG),
    FIXED32_LIST(24, axq.VECTOR, zzcdz.INT),
    BOOL_LIST(25, axq.VECTOR, zzcdz.BOOLEAN),
    STRING_LIST(26, axq.VECTOR, zzcdz.STRING),
    MESSAGE_LIST(27, axq.VECTOR, zzcdz.MESSAGE),
    BYTES_LIST(28, axq.VECTOR, zzcdz.BYTE_STRING),
    UINT32_LIST(29, axq.VECTOR, zzcdz.INT),
    ENUM_LIST(30, axq.VECTOR, zzcdz.ENUM),
    SFIXED32_LIST(31, axq.VECTOR, zzcdz.INT),
    SFIXED64_LIST(32, axq.VECTOR, zzcdz.LONG),
    SINT32_LIST(33, axq.VECTOR, zzcdz.INT),
    SINT64_LIST(34, axq.VECTOR, zzcdz.LONG),
    DOUBLE_LIST_PACKED(35, axq.PACKED_VECTOR, zzcdz.DOUBLE),
    FLOAT_LIST_PACKED(36, axq.PACKED_VECTOR, zzcdz.FLOAT),
    INT64_LIST_PACKED(37, axq.PACKED_VECTOR, zzcdz.LONG),
    UINT64_LIST_PACKED(38, axq.PACKED_VECTOR, zzcdz.LONG),
    INT32_LIST_PACKED(39, axq.PACKED_VECTOR, zzcdz.INT),
    FIXED64_LIST_PACKED(40, axq.PACKED_VECTOR, zzcdz.LONG),
    FIXED32_LIST_PACKED(41, axq.PACKED_VECTOR, zzcdz.INT),
    BOOL_LIST_PACKED(42, axq.PACKED_VECTOR, zzcdz.BOOLEAN),
    UINT32_LIST_PACKED(43, axq.PACKED_VECTOR, zzcdz.INT),
    ENUM_LIST_PACKED(44, axq.PACKED_VECTOR, zzcdz.ENUM),
    SFIXED32_LIST_PACKED(45, axq.PACKED_VECTOR, zzcdz.INT),
    SFIXED64_LIST_PACKED(46, axq.PACKED_VECTOR, zzcdz.LONG),
    SINT32_LIST_PACKED(47, axq.PACKED_VECTOR, zzcdz.INT),
    SINT64_LIST_PACKED(48, axq.PACKED_VECTOR, zzcdz.LONG),
    GROUP_LIST(49, axq.VECTOR, zzcdz.MESSAGE),
    MAP(50, axq.MAP, zzcdz.VOID);
    
    private static final zzcdi[] zzfyl = null;
    private static final Type[] zzfym = null;

    /* renamed from: id */
    private final int f45709id;
    private final zzcdz zzfyh;
    private final axq zzfyi;
    private final Class<?> zzfyj;
    private final boolean zzfyk;

    private zzcdi(int i, axq axq, zzcdz zzcdz) {
        this.f45709id = i;
        this.zzfyi = axq;
        this.zzfyh = zzcdz;
        switch (axq) {
            case MAP:
                this.zzfyj = zzcdz.zzauc();
                break;
            case VECTOR:
                this.zzfyj = zzcdz.zzauc();
                break;
            default:
                this.zzfyj = null;
                break;
        }
        boolean z = false;
        if (axq == axq.SCALAR) {
            switch (zzcdz) {
                case BYTE_STRING:
                case MESSAGE:
                case STRING:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.zzfyk = z;
    }

    /* renamed from: id */
    public final int mo42332id() {
        return this.f45709id;
    }

    static {
        int i;
        zzfym = new Type[0];
        zzcdi[] values = values();
        zzfyl = new zzcdi[values.length];
        for (zzcdi zzcdi : values) {
            zzfyl[zzcdi.f45709id] = zzcdi;
        }
    }
}
