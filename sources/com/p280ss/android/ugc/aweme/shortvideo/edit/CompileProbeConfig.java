package com.p280ss.android.ugc.aweme.shortvideo.edit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeConfig */
public final class CompileProbeConfig {
    private final long endPointMs;
    private final long startPointMs;

    public static /* synthetic */ CompileProbeConfig copy$default(CompileProbeConfig compileProbeConfig, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = compileProbeConfig.startPointMs;
        }
        if ((i & 2) != 0) {
            j2 = compileProbeConfig.endPointMs;
        }
        return compileProbeConfig.copy(j, j2);
    }

    public final long component1() {
        return this.startPointMs;
    }

    public final long component2() {
        return this.endPointMs;
    }

    public final CompileProbeConfig copy(long j, long j2) {
        return new CompileProbeConfig(j, j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CompileProbeConfig) {
                CompileProbeConfig compileProbeConfig = (CompileProbeConfig) obj;
                if (this.startPointMs == compileProbeConfig.startPointMs) {
                    if (this.endPointMs == compileProbeConfig.endPointMs) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getEndPointMs() {
        return this.endPointMs;
    }

    public final long getStartPointMs() {
        return this.startPointMs;
    }

    public final int hashCode() {
        long j = this.startPointMs;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.endPointMs;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompileProbeConfig(startPointMs=");
        sb.append(this.startPointMs);
        sb.append(", endPointMs=");
        sb.append(this.endPointMs);
        sb.append(")");
        return sb.toString();
    }

    public CompileProbeConfig(long j, long j2) {
        this.startPointMs = j;
        this.endPointMs = j2;
    }
}
