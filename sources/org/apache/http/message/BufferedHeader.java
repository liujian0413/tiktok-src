package org.apache.http.message;

import org.apache.http.FormattedHeader;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;
import org.apache.http.util.CharArrayBuffer;

public class BufferedHeader implements Cloneable, FormattedHeader {
    private final CharArrayBuffer buffer;
    private final String name;
    private final int valuePos;

    public CharArrayBuffer getBuffer() {
        return this.buffer;
    }

    public String getName() {
        return this.name;
    }

    public int getValuePos() {
        return this.valuePos;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return this.buffer.toString();
    }

    public String getValue() {
        return this.buffer.substringTrimmed(this.valuePos, this.buffer.length());
    }

    public HeaderElement[] getElements() throws ParseException {
        ParserCursor parserCursor = new ParserCursor(0, this.buffer.length());
        parserCursor.updatePos(this.valuePos);
        return BasicHeaderValueParser.DEFAULT.parseElements(this.buffer, parserCursor);
    }

    public BufferedHeader(CharArrayBuffer charArrayBuffer) throws ParseException {
        if (charArrayBuffer != null) {
            int indexOf = charArrayBuffer.indexOf(58);
            if (indexOf != -1) {
                String substringTrimmed = charArrayBuffer.substringTrimmed(0, indexOf);
                if (substringTrimmed.length() != 0) {
                    this.buffer = charArrayBuffer;
                    this.name = substringTrimmed;
                    this.valuePos = indexOf + 1;
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer("Invalid header: ");
                stringBuffer.append(charArrayBuffer.toString());
                throw new ParseException(stringBuffer.toString());
            }
            StringBuffer stringBuffer2 = new StringBuffer("Invalid header: ");
            stringBuffer2.append(charArrayBuffer.toString());
            throw new ParseException(stringBuffer2.toString());
        }
        throw new IllegalArgumentException("Char array buffer may not be null");
    }
}
