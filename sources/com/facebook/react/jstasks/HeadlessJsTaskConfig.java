package com.facebook.react.jstasks;

import com.facebook.react.bridge.WritableMap;

public class HeadlessJsTaskConfig {
    private final boolean mAllowedInForeground;
    private final WritableMap mData;
    private final String mTaskKey;
    private final long mTimeout;

    /* access modifiers changed from: 0000 */
    public WritableMap getData() {
        return this.mData;
    }

    /* access modifiers changed from: 0000 */
    public String getTaskKey() {
        return this.mTaskKey;
    }

    /* access modifiers changed from: 0000 */
    public long getTimeout() {
        return this.mTimeout;
    }

    /* access modifiers changed from: 0000 */
    public boolean isAllowedInForeground() {
        return this.mAllowedInForeground;
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap) {
        this(str, writableMap, 0, false);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j) {
        this(str, writableMap, j, false);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j, boolean z) {
        this.mTaskKey = str;
        this.mData = writableMap;
        this.mTimeout = j;
        this.mAllowedInForeground = z;
    }
}
