package org.apache.http.impl.cookie;

import java.util.ArrayList;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.message.BasicHeaderElement;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

public class NetscapeDraftHeaderParser {
    public static final NetscapeDraftHeaderParser DEFAULT = new NetscapeDraftHeaderParser();
    private static final char[] DELIMITERS = {';'};
    private final BasicHeaderValueParser nvpParser = BasicHeaderValueParser.DEFAULT;

    public HeaderElement parseHeader(CharArrayBuffer charArrayBuffer, ParserCursor parserCursor) throws ParseException {
        if (charArrayBuffer == null) {
            throw new IllegalArgumentException("Char array buffer may not be null");
        } else if (parserCursor != null) {
            NameValuePair parseNameValuePair = this.nvpParser.parseNameValuePair(charArrayBuffer, parserCursor, DELIMITERS);
            ArrayList arrayList = new ArrayList();
            while (!parserCursor.atEnd()) {
                arrayList.add(this.nvpParser.parseNameValuePair(charArrayBuffer, parserCursor, DELIMITERS));
            }
            return new BasicHeaderElement(parseNameValuePair.getName(), parseNameValuePair.getValue(), (NameValuePair[]) arrayList.toArray(new NameValuePair[arrayList.size()]));
        } else {
            throw new IllegalArgumentException("Parser cursor may not be null");
        }
    }
}
