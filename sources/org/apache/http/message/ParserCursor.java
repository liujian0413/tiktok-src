package org.apache.http.message;

import org.apache.http.util.CharArrayBuffer;

public class ParserCursor {
    private final int lowerBound;
    private int pos;
    private final int upperBound;

    public int getPos() {
        return this.pos;
    }

    public int getUpperBound() {
        return this.upperBound;
    }

    public boolean atEnd() {
        if (this.pos >= this.upperBound) {
            return true;
        }
        return false;
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(16);
        charArrayBuffer.append('[');
        charArrayBuffer.append(Integer.toString(this.lowerBound));
        charArrayBuffer.append('>');
        charArrayBuffer.append(Integer.toString(this.pos));
        charArrayBuffer.append('>');
        charArrayBuffer.append(Integer.toString(this.upperBound));
        charArrayBuffer.append(']');
        return charArrayBuffer.toString();
    }

    public void updatePos(int i) {
        if (i < this.lowerBound) {
            throw new IndexOutOfBoundsException();
        } else if (i <= this.upperBound) {
            this.pos = i;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public ParserCursor(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("Lower bound cannot be negative");
        } else if (i <= i2) {
            this.lowerBound = i;
            this.upperBound = i2;
            this.pos = i;
        } else {
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
    }
}
