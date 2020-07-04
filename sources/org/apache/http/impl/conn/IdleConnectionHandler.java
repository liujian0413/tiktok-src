package org.apache.http.impl.conn;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpConnection;

public class IdleConnectionHandler {
    private final Map<HttpConnection, TimeValues> connectionToTimes = new HashMap();
    private final Log log = LogFactory.getLog(getClass());

    static class TimeValues {
        public final long timeAdded;
        public final long timeExpires;

        TimeValues(long j, long j2, TimeUnit timeUnit) {
            this.timeAdded = j;
            if (j2 > 0) {
                this.timeExpires = j + timeUnit.toMillis(j2);
            } else {
                this.timeExpires = Long.MAX_VALUE;
            }
        }
    }

    public void removeAll() {
        this.connectionToTimes.clear();
    }

    public boolean remove(HttpConnection httpConnection) {
        TimeValues timeValues = (TimeValues) this.connectionToTimes.remove(httpConnection);
        if (timeValues == null) {
            this.log.warn("Removing a connection that never existed!");
            return true;
        } else if (System.currentTimeMillis() <= timeValues.timeExpires) {
            return true;
        } else {
            return false;
        }
    }

    public void add(HttpConnection httpConnection, long j, TimeUnit timeUnit) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.log.isDebugEnabled()) {
            Log log2 = this.log;
            StringBuilder sb = new StringBuilder("Adding connection at: ");
            sb.append(currentTimeMillis);
            log2.debug(sb.toString());
        }
        Map<HttpConnection, TimeValues> map = this.connectionToTimes;
        TimeValues timeValues = new TimeValues(currentTimeMillis, j, timeUnit);
        map.put(httpConnection, timeValues);
    }
}
