package com.p280ss.android.ugc.gamora.recorder.countdown;

import com.bytedance.jedi.arch.C11670t;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.recorder.countdown.RecordCountDownViewState */
public final class RecordCountDownViewState implements C11670t {
    private final Boolean countDownAnimation;
    private final int countDownMode;

    public RecordCountDownViewState() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ RecordCountDownViewState copy$default(RecordCountDownViewState recordCountDownViewState, Boolean bool, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = recordCountDownViewState.countDownAnimation;
        }
        if ((i2 & 2) != 0) {
            i = recordCountDownViewState.countDownMode;
        }
        return recordCountDownViewState.copy(bool, i);
    }

    public final Boolean component1() {
        return this.countDownAnimation;
    }

    public final int component2() {
        return this.countDownMode;
    }

    public final RecordCountDownViewState copy(Boolean bool, int i) {
        return new RecordCountDownViewState(bool, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecordCountDownViewState) {
                RecordCountDownViewState recordCountDownViewState = (RecordCountDownViewState) obj;
                if (C7573i.m23585a((Object) this.countDownAnimation, (Object) recordCountDownViewState.countDownAnimation)) {
                    if (this.countDownMode == recordCountDownViewState.countDownMode) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean getCountDownAnimation() {
        return this.countDownAnimation;
    }

    public final int getCountDownMode() {
        return this.countDownMode;
    }

    public final int hashCode() {
        Boolean bool = this.countDownAnimation;
        return ((bool != null ? bool.hashCode() : 0) * 31) + this.countDownMode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordCountDownViewState(countDownAnimation=");
        sb.append(this.countDownAnimation);
        sb.append(", countDownMode=");
        sb.append(this.countDownMode);
        sb.append(")");
        return sb.toString();
    }

    public RecordCountDownViewState(Boolean bool, int i) {
        this.countDownAnimation = bool;
        this.countDownMode = i;
    }

    public /* synthetic */ RecordCountDownViewState(Boolean bool, int i, int i2, C7571f fVar) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        this(bool, i);
    }
}
