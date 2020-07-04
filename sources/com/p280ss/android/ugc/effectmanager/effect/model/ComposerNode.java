package com.p280ss.android.ugc.effectmanager.effect.model;

import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ComposerNode */
public class ComposerNode {
    public String UI_name;
    public List<ComposerNode> children;
    public float default_value;
    public Effect effect;
    public String file;
    public String icon;
    public float max_value;
    public float min_value;
    public ComposerNode parent;
    public int switch_mode;
    public String tag_name;
    public int type;

    public boolean isLeaf() {
        if (this.type == 4 || this.type == 1) {
            return false;
        }
        return true;
    }
}
