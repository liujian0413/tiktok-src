package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

public enum zzui {
    DOUBLE(0, C16575hb.SCALAR, zzux.DOUBLE),
    FLOAT(1, C16575hb.SCALAR, zzux.FLOAT),
    INT64(2, C16575hb.SCALAR, zzux.LONG),
    UINT64(3, C16575hb.SCALAR, zzux.LONG),
    INT32(4, C16575hb.SCALAR, zzux.INT),
    FIXED64(5, C16575hb.SCALAR, zzux.LONG),
    FIXED32(6, C16575hb.SCALAR, zzux.INT),
    BOOL(7, C16575hb.SCALAR, zzux.BOOLEAN),
    STRING(8, C16575hb.SCALAR, zzux.STRING),
    MESSAGE(9, C16575hb.SCALAR, zzux.MESSAGE),
    BYTES(10, C16575hb.SCALAR, zzux.BYTE_STRING),
    UINT32(11, C16575hb.SCALAR, zzux.INT),
    ENUM(12, C16575hb.SCALAR, zzux.ENUM),
    SFIXED32(13, C16575hb.SCALAR, zzux.INT),
    SFIXED64(14, C16575hb.SCALAR, zzux.LONG),
    SINT32(15, C16575hb.SCALAR, zzux.INT),
    SINT64(16, C16575hb.SCALAR, zzux.LONG),
    GROUP(17, C16575hb.SCALAR, zzux.MESSAGE),
    DOUBLE_LIST(18, C16575hb.VECTOR, zzux.DOUBLE),
    FLOAT_LIST(19, C16575hb.VECTOR, zzux.FLOAT),
    INT64_LIST(20, C16575hb.VECTOR, zzux.LONG),
    UINT64_LIST(21, C16575hb.VECTOR, zzux.LONG),
    INT32_LIST(22, C16575hb.VECTOR, zzux.INT),
    FIXED64_LIST(23, C16575hb.VECTOR, zzux.LONG),
    FIXED32_LIST(24, C16575hb.VECTOR, zzux.INT),
    BOOL_LIST(25, C16575hb.VECTOR, zzux.BOOLEAN),
    STRING_LIST(26, C16575hb.VECTOR, zzux.STRING),
    MESSAGE_LIST(27, C16575hb.VECTOR, zzux.MESSAGE),
    BYTES_LIST(28, C16575hb.VECTOR, zzux.BYTE_STRING),
    UINT32_LIST(29, C16575hb.VECTOR, zzux.INT),
    ENUM_LIST(30, C16575hb.VECTOR, zzux.ENUM),
    SFIXED32_LIST(31, C16575hb.VECTOR, zzux.INT),
    SFIXED64_LIST(32, C16575hb.VECTOR, zzux.LONG),
    SINT32_LIST(33, C16575hb.VECTOR, zzux.INT),
    SINT64_LIST(34, C16575hb.VECTOR, zzux.LONG),
    DOUBLE_LIST_PACKED(35, C16575hb.PACKED_VECTOR, zzux.DOUBLE),
    FLOAT_LIST_PACKED(36, C16575hb.PACKED_VECTOR, zzux.FLOAT),
    INT64_LIST_PACKED(37, C16575hb.PACKED_VECTOR, zzux.LONG),
    UINT64_LIST_PACKED(38, C16575hb.PACKED_VECTOR, zzux.LONG),
    INT32_LIST_PACKED(39, C16575hb.PACKED_VECTOR, zzux.INT),
    FIXED64_LIST_PACKED(40, C16575hb.PACKED_VECTOR, zzux.LONG),
    FIXED32_LIST_PACKED(41, C16575hb.PACKED_VECTOR, zzux.INT),
    BOOL_LIST_PACKED(42, C16575hb.PACKED_VECTOR, zzux.BOOLEAN),
    UINT32_LIST_PACKED(43, C16575hb.PACKED_VECTOR, zzux.INT),
    ENUM_LIST_PACKED(44, C16575hb.PACKED_VECTOR, zzux.ENUM),
    SFIXED32_LIST_PACKED(45, C16575hb.PACKED_VECTOR, zzux.INT),
    SFIXED64_LIST_PACKED(46, C16575hb.PACKED_VECTOR, zzux.LONG),
    SINT32_LIST_PACKED(47, C16575hb.PACKED_VECTOR, zzux.INT),
    SINT64_LIST_PACKED(48, C16575hb.PACKED_VECTOR, zzux.LONG),
    GROUP_LIST(49, C16575hb.VECTOR, zzux.MESSAGE),
    MAP(50, C16575hb.MAP, zzux.VOID);
    
    private static final zzui[] zzbxo = null;
    private static final Type[] zzbxp = null;

    /* renamed from: id */
    private final int f46700id;
    private final zzux zzbxk;
    private final C16575hb zzbxl;
    private final Class<?> zzbxm;
    private final boolean zzbxn;

    private zzui(int i, C16575hb hbVar, zzux zzux) {
        this.f46700id = i;
        this.zzbxl = hbVar;
        this.zzbxk = zzux;
        switch (hbVar) {
            case MAP:
                this.zzbxm = zzux.zzwy();
                break;
            case VECTOR:
                this.zzbxm = zzux.zzwy();
                break;
            default:
                this.zzbxm = null;
                break;
        }
        boolean z = false;
        if (hbVar == C16575hb.SCALAR) {
            switch (zzux) {
                case BYTE_STRING:
                case MESSAGE:
                case STRING:
                    break;
                default:
                    z = true;
                    break;
            }
        }
        this.zzbxn = z;
    }

    /* renamed from: id */
    public final int mo43285id() {
        return this.f46700id;
    }

    static {
        int i;
        zzbxp = new Type[0];
        zzui[] values = values();
        zzbxo = new zzui[values.length];
        for (zzui zzui : values) {
            zzbxo[zzui.f46700id] = zzui;
        }
    }
}
