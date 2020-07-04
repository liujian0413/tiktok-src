package com.p280ss.android.ugc.effectmanager.link.model.host;

import com.p280ss.android.ugc.effectmanager.link.model.blackRoom.BlackRoomItem;
import java.net.URI;

/* renamed from: com.ss.android.ugc.effectmanager.link.model.host.Host */
public class Host extends BlackRoomItem {
    public String host;
    public int port = -1;
    public String schema;
    public long sortTime;
    public long weightTime;

    public long getSortTime() {
        return this.sortTime + this.weightTime;
    }

    public String getItemName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.schema);
        sb.append("://");
        sb.append(this.host);
        String sb2 = sb.toString();
        if (this.port == -1) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(":");
        sb3.append(this.port);
        return sb3.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Host{weightTime=");
        sb.append(this.weightTime);
        sb.append(", schema='");
        sb.append(this.schema);
        sb.append('\'');
        sb.append(", host='");
        sb.append(this.host);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Host(String str) {
        URI create = URI.create(str);
        this.host = create.getHost();
        this.schema = create.getScheme();
        this.port = create.getPort();
    }

    public boolean hostEquals(Host host2) {
        if (host2 != null && host2.host.equals(this.host) && host2.schema.equals(this.schema)) {
            return true;
        }
        return false;
    }

    public Host(URI uri) {
        this.host = uri.getHost();
        this.schema = uri.getScheme();
    }

    public Host(String str, String str2) {
        this.host = str;
        this.schema = str2;
    }

    public Host(String str, String str2, long j) {
        this.host = str;
        this.schema = str2;
        this.weightTime = j;
    }
}
