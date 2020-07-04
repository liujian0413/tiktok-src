package org.apache.http.message;

import java.util.NoSuchElementException;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HeaderIterator;
import org.apache.http.util.CharArrayBuffer;

public class BasicHeaderElementIterator implements HeaderElementIterator {
    private CharArrayBuffer buffer;
    private HeaderElement currentElement;
    private ParserCursor cursor;
    private final HeaderIterator headerIt;
    private final HeaderValueParser parser;

    public final Object next() throws NoSuchElementException {
        return nextElement();
    }

    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public boolean hasNext() {
        if (this.currentElement == null) {
            parseNextElement();
        }
        if (this.currentElement != null) {
            return true;
        }
        return false;
    }

    public HeaderElement nextElement() throws NoSuchElementException {
        if (this.currentElement == null) {
            parseNextElement();
        }
        if (this.currentElement != null) {
            HeaderElement headerElement = this.currentElement;
            this.currentElement = null;
            return headerElement;
        }
        throw new NoSuchElementException("No more header elements available");
    }

    private void bufferHeaderValue() {
        this.cursor = null;
        this.buffer = null;
        while (this.headerIt.hasNext()) {
            Header nextHeader = this.headerIt.nextHeader();
            if (nextHeader instanceof FormattedHeader) {
                FormattedHeader formattedHeader = (FormattedHeader) nextHeader;
                this.buffer = formattedHeader.getBuffer();
                this.cursor = new ParserCursor(0, this.buffer.length());
                this.cursor.updatePos(formattedHeader.getValuePos());
                return;
            }
            String value = nextHeader.getValue();
            if (value != null) {
                this.buffer = new CharArrayBuffer(value.length());
                this.buffer.append(value);
                this.cursor = new ParserCursor(0, this.buffer.length());
                return;
            }
        }
    }

    private void parseNextElement() {
        HeaderElement parseHeaderElement;
        loop0:
        while (true) {
            if (this.headerIt.hasNext() || this.cursor != null) {
                if (this.cursor == null || this.cursor.atEnd()) {
                    bufferHeaderValue();
                }
                if (this.cursor != null) {
                    while (!this.cursor.atEnd()) {
                        parseHeaderElement = this.parser.parseHeaderElement(this.buffer, this.cursor);
                        if (parseHeaderElement.getName().length() == 0) {
                            if (parseHeaderElement.getValue() != null) {
                                break loop0;
                            }
                        } else {
                            break loop0;
                        }
                    }
                    if (this.cursor.atEnd()) {
                        this.cursor = null;
                        this.buffer = null;
                    }
                }
            } else {
                return;
            }
        }
        this.currentElement = parseHeaderElement;
    }

    public BasicHeaderElementIterator(HeaderIterator headerIterator) {
        this(headerIterator, BasicHeaderValueParser.DEFAULT);
    }

    public BasicHeaderElementIterator(HeaderIterator headerIterator, HeaderValueParser headerValueParser) {
        if (headerIterator == null) {
            throw new IllegalArgumentException("Header iterator may not be null");
        } else if (headerValueParser != null) {
            this.headerIt = headerIterator;
            this.parser = headerValueParser;
        } else {
            throw new IllegalArgumentException("Parser may not be null");
        }
    }
}
