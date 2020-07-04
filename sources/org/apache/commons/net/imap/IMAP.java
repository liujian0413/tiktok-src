package org.apache.commons.net.imap;

import org.apache.commons.net.SocketClient;

public class IMAP extends SocketClient {
    public static final IMAPChunkListener TRUE_CHUNK_LISTENER = new IMAPChunkListener() {
    };

    public interface IMAPChunkListener {
    }

    public enum IMAPState {
        DISCONNECTED_STATE,
        NOT_AUTH_STATE,
        AUTH_STATE,
        LOGOUT_STATE
    }
}
