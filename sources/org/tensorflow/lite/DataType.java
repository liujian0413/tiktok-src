package org.tensorflow.lite;

public enum DataType {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5);
    
    private static final DataType[] values = null;
    public final int value;

    public final int byteSize() {
        switch (this) {
            case FLOAT32:
                return 4;
            case INT32:
                return 4;
            case UINT8:
                return 1;
            case INT64:
                return 8;
            case STRING:
                return -1;
            default:
                StringBuilder sb = new StringBuilder("DataType error: DataType ");
                sb.append(this);
                sb.append(" is not supported yet");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    static {
        values = values();
    }

    /* access modifiers changed from: 0000 */
    public final String toStringName() {
        switch (this) {
            case FLOAT32:
                return "float";
            case INT32:
                return "int";
            case UINT8:
                return "byte";
            case INT64:
                return "long";
            case STRING:
                return "string";
            default:
                StringBuilder sb = new StringBuilder("DataType error: DataType ");
                sb.append(this);
                sb.append(" is not supported yet");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    static DataType fromC(int i) {
        DataType[] dataTypeArr;
        for (DataType dataType : values) {
            if (dataType.value == i) {
                return dataType;
            }
        }
        StringBuilder sb = new StringBuilder("DataType error: DataType ");
        sb.append(i);
        sb.append(" is not recognized in Java (version ");
        sb.append(TensorFlowLite.runtimeVersion());
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }

    private DataType(int i) {
        this.value = i;
    }
}
