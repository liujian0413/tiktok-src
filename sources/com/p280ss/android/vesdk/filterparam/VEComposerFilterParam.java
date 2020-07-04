package com.p280ss.android.vesdk.filterparam;

/* renamed from: com.ss.android.vesdk.filterparam.VEComposerFilterParam */
public class VEComposerFilterParam extends VEBaseFilterParam {
    public int action;
    public String appendNodePaths;
    public int mode;
    public int orderType;
    public String reloadNodePaths;
    public String removeNodePaths;
    public String setNodePaths;
    public String tags;
    public String updateNodePaths;
    public String updateNodeTags;
    public String updateNodeValues;

    private VEComposerFilterParam() {
        this.filterName = "composer filter";
        this.filterType = 18;
        this.setNodePaths = "";
        this.reloadNodePaths = "";
        this.updateNodePaths = "";
        this.updateNodeTags = "";
        this.updateNodeValues = "";
        this.appendNodePaths = "";
        this.removeNodePaths = "";
        this.tags = "";
    }
}
