package androidx.work;

import java.util.Set;
import java.util.UUID;

public final class WorkInfo {

    /* renamed from: a */
    public UUID f5626a;

    /* renamed from: b */
    public State f5627b;

    /* renamed from: c */
    public C1458e f5628c;

    /* renamed from: d */
    public Set<String> f5629d;

    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public final boolean isFinished() {
            if (this == SUCCEEDED || this == FAILED || this == CANCELLED) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.f5626a != null) {
            i = this.f5626a.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        if (this.f5627b != null) {
            i2 = this.f5627b.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.f5628c != null) {
            i3 = this.f5628c.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        if (this.f5629d != null) {
            i4 = this.f5629d.hashCode();
        }
        return i7 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfo{mId='");
        sb.append(this.f5626a);
        sb.append('\'');
        sb.append(", mState=");
        sb.append(this.f5627b);
        sb.append(", mOutputData=");
        sb.append(this.f5628c);
        sb.append(", mTags=");
        sb.append(this.f5629d);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f5626a == null ? workInfo.f5626a != null : !this.f5626a.equals(workInfo.f5626a)) {
            return false;
        }
        if (this.f5627b != workInfo.f5627b) {
            return false;
        }
        if (this.f5628c == null ? workInfo.f5628c != null : !this.f5628c.equals(workInfo.f5628c)) {
            return false;
        }
        if (this.f5629d != null) {
            return this.f5629d.equals(workInfo.f5629d);
        }
        if (workInfo.f5629d == null) {
            return true;
        }
        return false;
    }
}
