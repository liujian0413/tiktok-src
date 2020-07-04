package com.p280ss.android.message.push.connection;

import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.ss.android.message.push.connection.ConnectionState */
public enum ConnectionState {
    SOCKET_CONNECTING(1),
    SOCKET_CONNECTED(2),
    HANDSSHAKEING(4),
    HANDSSHAKEED(8),
    REGISTERING(16),
    REGISTERED(32),
    SOCKET_DISCONNECTING(64),
    SOCKET_DISCONNECTED(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH),
    ALL(256);
    
    final int mStateValue;

    public final int getStateValue() {
        return this.mStateValue;
    }

    private ConnectionState(int i) {
        this.mStateValue = i;
    }
}
