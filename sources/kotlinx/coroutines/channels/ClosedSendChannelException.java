package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;

public final class ClosedSendChannelException extends CancellationException {
    public ClosedSendChannelException(String str) {
        super(str);
    }
}
