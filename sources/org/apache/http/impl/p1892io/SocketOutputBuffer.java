package org.apache.http.impl.p1892io;

import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* renamed from: org.apache.http.impl.io.SocketOutputBuffer */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        if (socket != null) {
            if (i < 0) {
                i = socket.getSendBufferSize();
            }
            if (i < 1024) {
                i = PreloadTask.BYTE_UNIT_NUMBER;
            }
            init(socket.getOutputStream(), i, httpParams);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }
}
