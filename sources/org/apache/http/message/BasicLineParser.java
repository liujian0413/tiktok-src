package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HttpVersion;
import org.apache.http.ParseException;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.CharArrayBuffer;

public class BasicLineParser implements LineParser {
    public static final BasicLineParser DEFAULT = new BasicLineParser();
    protected final ProtocolVersion protocol;

    public BasicLineParser() {
        this(null);
    }

    public Header parseHeader(CharArrayBuffer charArrayBuffer) throws ParseException {
        return new BufferedHeader(charArrayBuffer);
    }

    public BasicLineParser(ProtocolVersion protocolVersion) {
        if (protocolVersion == null) {
            protocolVersion = HttpVersion.HTTP_1_1;
        }
        this.protocol = protocolVersion;
    }

    /* access modifiers changed from: protected */
    public ProtocolVersion createProtocolVersion(int i, int i2) {
        return this.protocol.forVersion(i, i2);
    }

    /* access modifiers changed from: protected */
    public void skipWhitespace(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        int pos = parserCursor.getPos();
        int upperBound = parserCursor.getUpperBound();
        while (pos < upperBound && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
            pos++;
        }
        parserCursor.updatePos(pos);
    }

    public boolean hasProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (parserCursor != null) {
            int pos = parserCursor.getPos();
            String protocol2 = this.protocol.getProtocol();
            int length = protocol2.length();
            if (charArrayBuffer.length() < length + 4) {
                return false;
            }
            if (pos < 0) {
                pos = (charArrayBuffer.length() - 4) - length;
            } else if (pos == 0) {
                while (pos < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(pos))) {
                    pos++;
                }
            }
            int i = pos + length;
            if (i + 4 > charArrayBuffer.length()) {
                return false;
            }
            boolean z = true;
            int i2 = 0;
            while (z && i2 < length) {
                if (charArrayBuffer.charAt(pos + i2) == protocol2.charAt(i2)) {
                    z = true;
                } else {
                    z = false;
                }
                i2++;
            }
            if (z) {
                if (charArrayBuffer.charAt(i) == '/') {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    public StatusLine parseStatusLine(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        String str;
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (parserCursor != null) {
            int pos = parserCursor.getPos();
            int upperBound = parserCursor.getUpperBound();
            try {
                ProtocolVersion parseProtocolVersion = parseProtocolVersion(charArrayBuffer, parserCursor);
                skipWhitespace(charArrayBuffer, parserCursor);
                int pos2 = parserCursor.getPos();
                int indexOf = charArrayBuffer.indexOf(32, pos2, upperBound);
                if (indexOf < 0) {
                    indexOf = upperBound;
                }
                int parseInt = Integer.parseInt(charArrayBuffer.substringTrimmed(pos2, indexOf));
                if (indexOf < upperBound) {
                    str = charArrayBuffer.substringTrimmed(indexOf, upperBound);
                } else {
                    str = "";
                }
                return createStatusLine(parseProtocolVersion, parseInt, str);
            } catch (NumberFormatException unused) {
                StringBuffer stringBuffer = new StringBuffer("Unable to parse status code from status line: ");
                stringBuffer.append(charArrayBuffer.substring(pos, upperBound));
                throw new ParseException(stringBuffer.toString());
            } catch (IndexOutOfBoundsException unused2) {
                StringBuffer stringBuffer2 = new StringBuffer("Invalid status line: ");
                stringBuffer2.append(charArrayBuffer.substring(pos, upperBound));
                throw new ParseException(stringBuffer2.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    public ProtocolVersion parseProtocolVersion(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (parserCursor != null) {
            String protocol2 = this.protocol.getProtocol();
            int length = protocol2.length();
            int pos = parserCursor.getPos();
            int upperBound = parserCursor.getUpperBound();
            skipWhitespace(charArrayBuffer, parserCursor);
            int pos2 = parserCursor.getPos();
            int i = pos2 + length;
            if (i + 4 <= upperBound) {
                boolean z = true;
                int i2 = 0;
                while (z && i2 < length) {
                    if (charArrayBuffer.charAt(pos2 + i2) == protocol2.charAt(i2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i2++;
                }
                if (z) {
                    if (charArrayBuffer.charAt(i) == '/') {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    int i3 = pos2 + length + 1;
                    int indexOf = charArrayBuffer.indexOf(46, i3, upperBound);
                    if (indexOf != -1) {
                        try {
                            int parseInt = Integer.parseInt(charArrayBuffer.substringTrimmed(i3, indexOf));
                            int i4 = indexOf + 1;
                            int indexOf2 = charArrayBuffer.indexOf(32, i4, upperBound);
                            if (indexOf2 == -1) {
                                indexOf2 = upperBound;
                            }
                            try {
                                int parseInt2 = Integer.parseInt(charArrayBuffer.substringTrimmed(i4, indexOf2));
                                parserCursor.updatePos(indexOf2);
                                return createProtocolVersion(parseInt, parseInt2);
                            } catch (NumberFormatException unused) {
                                StringBuffer stringBuffer = new StringBuffer("Invalid protocol minor version number: ");
                                stringBuffer.append(charArrayBuffer.substring(pos, upperBound));
                                throw new ParseException(stringBuffer.toString());
                            }
                        } catch (NumberFormatException unused2) {
                            StringBuffer stringBuffer2 = new StringBuffer("Invalid protocol major version number: ");
                            stringBuffer2.append(charArrayBuffer.substring(pos, upperBound));
                            throw new ParseException(stringBuffer2.toString());
                        }
                    } else {
                        StringBuffer stringBuffer3 = new StringBuffer("Invalid protocol version number: ");
                        stringBuffer3.append(charArrayBuffer.substring(pos, upperBound));
                        throw new ParseException(stringBuffer3.toString());
                    }
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer("Not a valid protocol version: ");
                    stringBuffer4.append(charArrayBuffer.substring(pos, upperBound));
                    throw new ParseException(stringBuffer4.toString());
                }
            } else {
                StringBuffer stringBuffer5 = new StringBuffer("Not a valid protocol version: ");
                stringBuffer5.append(charArrayBuffer.substring(pos, upperBound));
                throw new ParseException(stringBuffer5.toString());
            }
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }

    /* access modifiers changed from: protected */
    public StatusLine createStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        return new BasicStatusLine(protocolVersion, i, str);
    }
}
