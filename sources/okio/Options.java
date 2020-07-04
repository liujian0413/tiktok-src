package okio;

import java.util.AbstractList;
import java.util.RandomAccess;

public final class Options extends AbstractList<ByteString> implements RandomAccess {
    final ByteString[] byteStrings;

    public final int size() {
        return this.byteStrings.length;
    }

    private Options(ByteString[] byteStringArr) {
        this.byteStrings = byteStringArr;
    }

    /* renamed from: of */
    public static Options m23797of(ByteString... byteStringArr) {
        return new Options((ByteString[]) byteStringArr.clone());
    }

    public final ByteString get(int i) {
        return this.byteStrings[i];
    }
}
