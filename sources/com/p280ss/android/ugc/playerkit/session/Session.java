package com.p280ss.android.ugc.playerkit.session;

import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.ugc.playerkit.session.Session */
public class Session {
    public static final Session DEFAULT = new Session(true);
    private static final Queue<Session> pool = new LinkedBlockingQueue(10);
    public int bitrate = -1;
    public int blockCnt = -1;
    public int blockTime = -1;
    public int cacheSize = -1;
    public double calcBitrate;
    public float duration;
    public boolean h265;
    public boolean isCurrentPlayer;
    private boolean isStub;
    public String key;
    public float playBitrate = -1.0f;
    public int playTime = -1;
    public Type playerType;
    public String sourceId;
    public float speed = -1.0f;
    public C44926b state;
    public String uri;
    public String url;
    public VideoUrlModel urlModel;

    public boolean isStub() {
        return this.isStub;
    }

    static Session instance() {
        Session session = (Session) pool.poll();
        if (session == null) {
            return new Session();
        }
        return session;
    }

    public void recycle() {
        clear();
        pool.offer(this);
    }

    private Session() {
    }

    private void clear() {
        this.sourceId = null;
        this.uri = null;
        this.url = null;
        this.h265 = false;
        this.duration = 0.0f;
        this.speed = -1.0f;
        this.blockCnt = -1;
        this.blockTime = -1;
        this.bitrate = -1;
        this.playBitrate = -1.0f;
        this.playTime = -1;
        this.cacheSize = -1;
        this.playerType = null;
        this.isCurrentPlayer = false;
        this.urlModel = null;
        this.state = null;
        this.calcBitrate = 0.0d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Session{sourceId='");
        sb.append(this.sourceId);
        sb.append('\'');
        sb.append(", uri='");
        sb.append(this.uri);
        sb.append('\'');
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", h265=");
        sb.append(this.h265);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", blockCnt=");
        sb.append(this.blockCnt);
        sb.append(", blockTime=");
        sb.append(this.blockTime);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", calcBitrate=");
        sb.append(this.calcBitrate);
        sb.append(", playBitrate=");
        sb.append(this.playBitrate);
        sb.append(", playTime=");
        sb.append(this.playTime);
        sb.append(", cacheSize=");
        sb.append(this.cacheSize);
        sb.append('}');
        return sb.toString();
    }

    public Session(boolean z) {
        this.isStub = z;
    }
}
