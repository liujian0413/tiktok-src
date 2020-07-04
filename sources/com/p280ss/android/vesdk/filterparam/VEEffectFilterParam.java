package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEEffectFilterParam */
public class VEEffectFilterParam extends VEBaseFilterParam {
    public String[] composerTags;
    public float[] composerValues;
    public String effectPath;
    public boolean isSyncLoadResource;
    public boolean needReload;
    public int reqId;
    public int stickerId;
    public String stickerTag;
    public int timeout;

    public VEEffectFilterParam() {
        this.filterName = "filter effect";
        this.filterType = 8;
        this.effectPath = "";
        this.stickerTag = "";
    }
}
