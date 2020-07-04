package org.msgpack.type;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

abstract class AbstractRawValue extends AbstractValue implements RawValue {
    private static final char[] HEX_TABLE = "0123456789ABCDEF".toCharArray();

    AbstractRawValue() {
    }

    public RawValue asRawValue() {
        return this;
    }

    public boolean isRawValue() {
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(getByteArray());
    }

    public String toString() {
        return toString(new StringBuilder()).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isRawValue()) {
            return false;
        }
        return Arrays.equals(getByteArray(), value.asRawValue().getByteArray());
    }

    public StringBuilder toString(StringBuilder sb) {
        String str;
        if (getClass() == StringRawValueImpl.class) {
            str = getString();
        } else {
            try {
                str = Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.IGNORE).onUnmappableCharacter(CodingErrorAction.IGNORE).decode(ByteBuffer.wrap(getByteArray())).toString();
            } catch (CharacterCodingException unused) {
                str = new String(getByteArray());
            }
        }
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ') {
                switch (charAt) {
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        escapeChar(sb, charAt);
                        break;
                }
            } else if (charAt <= 127) {
                if (charAt == '\"') {
                    sb.append("\\\"");
                } else if (charAt != '\\') {
                    sb.append(charAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (charAt < 55296 || charAt > 57343) {
                sb.append(charAt);
            } else {
                escapeChar(sb, charAt);
            }
        }
        sb.append("\"");
        return sb;
    }

    private void escapeChar(StringBuilder sb, int i) {
        sb.append("\\u");
        sb.append(HEX_TABLE[(i >> 12) & 15]);
        sb.append(HEX_TABLE[(i >> 8) & 15]);
        sb.append(HEX_TABLE[(i >> 4) & 15]);
        sb.append(HEX_TABLE[i & 15]);
    }
}
