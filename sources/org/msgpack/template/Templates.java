package org.msgpack.template;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;
import org.msgpack.type.Value;

public final class Templates {
    public static final Template<BigDecimal> TBigDecimal = BigDecimalTemplate.getInstance();
    public static final Template<BigInteger> TBigInteger = BigIntegerTemplate.getInstance();
    public static final Template<Boolean> TBoolean = BooleanTemplate.getInstance();
    public static final Template<Byte> TByte = ByteTemplate.getInstance();
    public static final Template<byte[]> TByteArray = ByteArrayTemplate.getInstance();
    public static final Template<ByteBuffer> TByteBuffer = ByteBufferTemplate.getInstance();
    public static final Template<Character> TCharacter = CharacterTemplate.getInstance();
    public static final Template<Date> TDate = DateTemplate.getInstance();
    public static final Template<Double> TDouble = DoubleTemplate.getInstance();
    public static final Template<Float> TFloat = FloatTemplate.getInstance();
    public static final Template<Integer> TInteger = IntegerTemplate.getInstance();
    public static final Template<Long> TLong = LongTemplate.getInstance();
    public static final Template<Short> TShort = ShortTemplate.getInstance();
    public static final Template<String> TString = StringTemplate.getInstance();
    public static final Template<Value> TValue = ValueTemplate.getInstance();
}
