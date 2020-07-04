package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult */
public final class CompileProbeResult implements Parcelable, Serializable {
    public static final Creator CREATOR = new C39388a();
    private final ResultData data;
    private final ResultStatus status;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData */
    public static final class ResultData implements Parcelable, Serializable {
        public static final Creator CREATOR = new C39385a();
        private final int crf;
        private final int durationMs;
        private final float videoBitrate;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData$a */
        public static class C39385a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C7573i.m23587b(parcel, "in");
                return new ResultData(parcel.readInt(), parcel.readFloat(), parcel.readInt());
            }

            public final Object[] newArray(int i) {
                return new ResultData[i];
            }
        }

        public static /* synthetic */ ResultData copy$default(ResultData resultData, int i, float f, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = resultData.crf;
            }
            if ((i3 & 2) != 0) {
                f = resultData.videoBitrate;
            }
            if ((i3 & 4) != 0) {
                i2 = resultData.durationMs;
            }
            return resultData.copy(i, f, i2);
        }

        public final int component1() {
            return this.crf;
        }

        public final float component2() {
            return this.videoBitrate;
        }

        public final int component3() {
            return this.durationMs;
        }

        public final ResultData copy(int i, float f, int i2) {
            return new ResultData(i, f, i2);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ResultData) {
                    ResultData resultData = (ResultData) obj;
                    if ((this.crf == resultData.crf) && Float.compare(this.videoBitrate, resultData.videoBitrate) == 0) {
                        if (this.durationMs == resultData.durationMs) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int getCrf() {
            return this.crf;
        }

        public final int getDurationMs() {
            return this.durationMs;
        }

        public final float getVideoBitrate() {
            return this.videoBitrate;
        }

        public final int hashCode() {
            return (((this.crf * 31) + Float.floatToIntBits(this.videoBitrate)) * 31) + this.durationMs;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResultData(crf=");
            sb.append(this.crf);
            sb.append(", videoBitrate=");
            sb.append(this.videoBitrate);
            sb.append(", durationMs=");
            sb.append(this.durationMs);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C7573i.m23587b(parcel, "parcel");
            parcel.writeInt(this.crf);
            parcel.writeFloat(this.videoBitrate);
            parcel.writeInt(this.durationMs);
        }

        public ResultData(int i, float f, int i2) {
            this.crf = i;
            this.videoBitrate = f;
            this.durationMs = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus */
    public static final class ResultStatus implements Parcelable, Serializable {
        public static final Creator CREATOR = new C39386a();
        private final String msg;
        private final State state;
        private final int toolsCode;
        private final int veCode;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus$a */
        public static class C39386a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C7573i.m23587b(parcel, "in");
                return new ResultStatus((State) Enum.valueOf(State.class, parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new ResultStatus[i];
            }
        }

        public static /* synthetic */ ResultStatus copy$default(ResultStatus resultStatus, State state2, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                state2 = resultStatus.state;
            }
            if ((i3 & 2) != 0) {
                i = resultStatus.veCode;
            }
            if ((i3 & 4) != 0) {
                i2 = resultStatus.toolsCode;
            }
            if ((i3 & 8) != 0) {
                str = resultStatus.msg;
            }
            return resultStatus.copy(state2, i, i2, str);
        }

        public final State component1() {
            return this.state;
        }

        public final int component2() {
            return this.veCode;
        }

        public final int component3() {
            return this.toolsCode;
        }

        public final String component4() {
            return this.msg;
        }

        public final ResultStatus copy(State state2, int i, int i2, String str) {
            C7573i.m23587b(state2, "state");
            C7573i.m23587b(str, "msg");
            return new ResultStatus(state2, i, i2, str);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ResultStatus) {
                    ResultStatus resultStatus = (ResultStatus) obj;
                    if (C7573i.m23585a((Object) this.state, (Object) resultStatus.state)) {
                        if (this.veCode == resultStatus.veCode) {
                            if (!(this.toolsCode == resultStatus.toolsCode) || !C7573i.m23585a((Object) this.msg, (Object) resultStatus.msg)) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final String getMsg() {
            return this.msg;
        }

        public final State getState() {
            return this.state;
        }

        public final int getToolsCode() {
            return this.toolsCode;
        }

        public final int getVeCode() {
            return this.veCode;
        }

        public final int hashCode() {
            State state2 = this.state;
            int i = 0;
            int hashCode = (((((state2 != null ? state2.hashCode() : 0) * 31) + this.veCode) * 31) + this.toolsCode) * 31;
            String str = this.msg;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ResultStatus(state=");
            sb.append(this.state);
            sb.append(", veCode=");
            sb.append(this.veCode);
            sb.append(", toolsCode=");
            sb.append(this.toolsCode);
            sb.append(", msg=");
            sb.append(this.msg);
            sb.append(")");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C7573i.m23587b(parcel, "parcel");
            parcel.writeString(this.state.name());
            parcel.writeInt(this.veCode);
            parcel.writeInt(this.toolsCode);
            parcel.writeString(this.msg);
        }

        public ResultStatus(State state2, int i, int i2, String str) {
            C7573i.m23587b(state2, "state");
            C7573i.m23587b(str, "msg");
            this.state = state2;
            this.veCode = i;
            this.toolsCode = i2;
            this.msg = str;
        }

        public /* synthetic */ ResultStatus(State state2, int i, int i2, String str, int i3, C7571f fVar) {
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            if ((i3 & 8) != 0) {
                str = "";
            }
            this(state2, i, i2, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State */
    public enum State implements Parcelable, Serializable {
        SUCCESS,
        ERROR,
        CANCEL;
        
        public static final Creator CREATOR = null;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$State$a */
        public static class C39387a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C7573i.m23587b(parcel, "in");
                return (State) Enum.valueOf(State.class, parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new State[i];
            }
        }

        static {
            CREATOR = new C39387a();
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C7573i.m23587b(parcel, "parcel");
            parcel.writeString(name());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$a */
    public static class C39388a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C7573i.m23587b(parcel, "in");
            return new CompileProbeResult((ResultStatus) ResultStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? (ResultData) ResultData.CREATOR.createFromParcel(parcel) : null);
        }

        public final Object[] newArray(int i) {
            return new CompileProbeResult[i];
        }
    }

    public static /* synthetic */ CompileProbeResult copy$default(CompileProbeResult compileProbeResult, ResultStatus resultStatus, ResultData resultData, int i, Object obj) {
        if ((i & 1) != 0) {
            resultStatus = compileProbeResult.status;
        }
        if ((i & 2) != 0) {
            resultData = compileProbeResult.data;
        }
        return compileProbeResult.copy(resultStatus, resultData);
    }

    public final ResultStatus component1() {
        return this.status;
    }

    public final ResultData component2() {
        return this.data;
    }

    public final CompileProbeResult copy(ResultStatus resultStatus, ResultData resultData) {
        C7573i.m23587b(resultStatus, "status");
        return new CompileProbeResult(resultStatus, resultData);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.data, (java.lang.Object) r3.data) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r3 = (com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult) r3
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r0 = r2.status
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r1 = r3.status
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData r0 = r2.data
            com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData r3 = r3.data
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult.equals(java.lang.Object):boolean");
    }

    public final ResultData getData() {
        return this.data;
    }

    public final ResultStatus getStatus() {
        return this.status;
    }

    public final int hashCode() {
        ResultStatus resultStatus = this.status;
        int i = 0;
        int hashCode = (resultStatus != null ? resultStatus.hashCode() : 0) * 31;
        ResultData resultData = this.data;
        if (resultData != null) {
            i = resultData.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompileProbeResult(status=");
        sb.append(this.status);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C7573i.m23587b(parcel, "parcel");
        this.status.writeToParcel(parcel, 0);
        ResultData resultData = this.data;
        if (resultData != null) {
            parcel.writeInt(1);
            resultData.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public CompileProbeResult(ResultStatus resultStatus, ResultData resultData) {
        C7573i.m23587b(resultStatus, "status");
        this.status = resultStatus;
        this.data = resultData;
    }

    public /* synthetic */ CompileProbeResult(ResultStatus resultStatus, ResultData resultData, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            resultData = null;
        }
        this(resultStatus, resultData);
    }
}
