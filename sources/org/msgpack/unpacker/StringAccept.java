package org.msgpack.unpacker;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.msgpack.MessageTypeException;

final class StringAccept extends Accept {
    private CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
    String value;

    /* access modifiers changed from: 0000 */
    public final void acceptEmptyRaw() {
        this.value = "";
    }

    public StringAccept() {
        super("raw value");
    }

    /* access modifiers changed from: 0000 */
    public final void acceptRaw(byte[] bArr) {
        try {
            this.value = this.decoder.decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException e) {
            throw new MessageTypeException((Throwable) e);
        }
    }

    public final void refer(ByteBuffer byteBuffer, boolean z) throws IOException {
        try {
            this.value = this.decoder.decode(byteBuffer).toString();
        } catch (CharacterCodingException e) {
            throw new MessageTypeException((Throwable) e);
        }
    }
}
