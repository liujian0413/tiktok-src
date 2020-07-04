package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VETransitionFilterParam */
public class VETransitionFilterParam extends VEBaseFilterParam {
    public static final int TransitionDuration_DEFAULT = 500;
    public int tranDuration;
    public int tranType;
    public String transName;

    /* renamed from: com.ss.android.vesdk.filterparam.VETransitionFilterParam$TransitionType */
    public enum TransitionType {
        TransitionType_DEFAULT,
        TransitionType_VARIABLE_TIME
    }

    public VETransitionFilterParam() {
        this.filterName = "tran filter";
        this.filterType = 14;
        this.transName = "";
        this.tranType = TransitionType.TransitionType_DEFAULT.ordinal();
        this.tranDuration = TransitionDuration_DEFAULT;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("transName=");
        sb.append(this.transName);
        sb.append(" tranType=");
        sb.append(this.tranType);
        sb.append(" tranDuration=");
        sb.append(this.tranDuration);
        return sb.toString();
    }
}
