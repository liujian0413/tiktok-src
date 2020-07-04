package org.msgpack.template.builder.beans;

import java.util.HashMap;
import java.util.Map;

public class FeatureDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public String displayName;
    public boolean expert;
    public boolean hidden;
    public String name;
    public boolean preferred;
    public String shortDescription;
    private Map<String, Object> values = new HashMap();

    public String getDisplayName() {
        if (this.displayName == null) {
            return this.name;
        }
        return this.displayName;
    }

    /* access modifiers changed from: 0000 */
    public void merge(FeatureDescriptor featureDescriptor) {
        this.expert |= featureDescriptor.expert;
        this.hidden |= featureDescriptor.hidden;
        this.preferred |= featureDescriptor.preferred;
        if (this.shortDescription == null) {
            this.shortDescription = featureDescriptor.shortDescription;
        }
        if (this.name == null) {
            this.name = featureDescriptor.name;
        }
        if (this.displayName == null) {
            this.displayName = featureDescriptor.displayName;
        }
    }
}
