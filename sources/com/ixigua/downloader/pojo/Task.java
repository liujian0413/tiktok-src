package com.ixigua.downloader.pojo;

import android.text.TextUtils;
import java.io.Serializable;

public class Task implements Serializable, Comparable<Task> {
    private static final long serialVersionUID = -8164149980876153200L;
    public final int autoRetryTimes;
    public final boolean isOnlyWifi;
    public final boolean isSupportMultiThread;
    public final boolean isSupportProgressUpdate;
    public final String path;
    public final int priority;
    public final long progressUpdateInterval;
    public final String url;

    /* renamed from: com.ixigua.downloader.pojo.Task$a */
    public static final class C18490a {

        /* renamed from: a */
        public String f50105a;

        /* renamed from: b */
        public String f50106b;

        /* renamed from: c */
        public boolean f50107c;

        /* renamed from: d */
        public boolean f50108d;

        /* renamed from: e */
        public int f50109e = 5;

        /* renamed from: f */
        public boolean f50110f;

        /* renamed from: g */
        public long f50111g = 2000;

        /* renamed from: h */
        public int f50112h = 3;

        /* renamed from: a */
        public final Task mo48013a() {
            if (TextUtils.isEmpty(this.f50105a)) {
                throw new IllegalArgumentException("path is empty");
            } else if (!TextUtils.isEmpty(this.f50106b)) {
                return new Task(this);
            } else {
                throw new IllegalArgumentException("url is empty");
            }
        }

        /* renamed from: a */
        public final C18490a mo48010a(int i) {
            this.f50109e = i;
            return this;
        }

        /* renamed from: b */
        public final C18490a mo48015b(boolean z) {
            this.f50110f = z;
            return this;
        }

        /* renamed from: c */
        public final C18490a mo48016c(boolean z) {
            this.f50108d = z;
            return this;
        }

        /* renamed from: a */
        public final C18490a mo48012a(boolean z) {
            this.f50107c = z;
            return this;
        }

        /* renamed from: a */
        public final C18490a mo48011a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f50105a = str;
                return this;
            }
            throw new IllegalArgumentException("path is empty");
        }

        /* renamed from: b */
        public final C18490a mo48014b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f50106b = str;
                return this;
            }
            throw new IllegalArgumentException("url is empty");
        }
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String getMetaPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.path);
        sb.append(".meta");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Task{path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append(", url='");
        sb.append(this.url);
        sb.append('\'');
        sb.append(", isOnlyWifi=");
        sb.append(this.isOnlyWifi);
        sb.append(", isSupportMultiThread=");
        sb.append(this.isSupportMultiThread);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append('}');
        return sb.toString();
    }

    public int compareTo(Task task) {
        return task.priority - this.priority;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.path.equals(((Task) obj).path);
    }

    private Task(C18490a aVar) {
        this.path = aVar.f50105a;
        this.url = aVar.f50106b;
        this.isOnlyWifi = aVar.f50107c;
        this.isSupportMultiThread = aVar.f50108d;
        this.priority = aVar.f50109e;
        this.isSupportProgressUpdate = aVar.f50110f;
        this.progressUpdateInterval = aVar.f50111g;
        this.autoRetryTimes = aVar.f50112h;
    }
}
