package com.ixigua.downloader.pojo;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class BlockItem implements Serializable {
    private static final long serialVersionUID = -1958802510371603516L;
    private volatile long downloadedSize;
    private volatile long end;
    private volatile long start;

    private BlockItem() {
    }

    public long getDownloadedSize() {
        return this.downloadedSize;
    }

    public long getEnd() {
        return this.end;
    }

    public long getStart() {
        return this.start;
    }

    public String getString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("start", this.start);
            jSONObject.put("end", this.end);
            jSONObject.put("downloadedSize", this.downloadedSize);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public void setDownloadedSize(long j) {
        this.downloadedSize = j;
    }

    public void setEnd(long j) {
        this.end = j;
    }

    public void setStart(int i) {
        this.start = (long) i;
    }

    static BlockItem parse(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                BlockItem blockItem = new BlockItem();
                blockItem.start = jSONObject.optLong("start", 0);
                blockItem.end = jSONObject.optLong("end", 0);
                blockItem.downloadedSize = (long) jSONObject.optInt("downloadedSize", 0);
                return blockItem;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public BlockItem(long j, long j2, long j3) {
        this.start = j;
        this.end = j2;
        this.downloadedSize = j3;
    }
}
