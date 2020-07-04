package com.p280ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse */
public class RateSettingsResponse extends BaseResponse {
    @C6593c(mo15949a = "adaptive_gear_group")
    private C43199b adaptiveGearGroup;
    @C6593c(mo15949a = "auto_bitrate_params")
    private C43198a autoBitrateSet;
    @C6593c(mo15949a = "bandwidth_map")
    private List<BandwidthSet> bandwidthSet;
    @C6593c(mo15949a = "default_gear_group")
    private String defaultGearGroup;
    @C6593c(mo15949a = "definition_gear_group")
    private C43199b definitionGearGroup;
    @C6593c(mo15949a = "flow_gear_group")
    private C43199b flowGearGroup;
    @C6593c(mo15949a = "gear_set")
    private List<GearSet> gearSet;

    public C43199b getAdaptiveGearGroup() {
        return this.adaptiveGearGroup;
    }

    public C43198a getAutoBitrateSet() {
        return this.autoBitrateSet;
    }

    public List<BandwidthSet> getBandwidthSet() {
        return this.bandwidthSet;
    }

    public String getDefaultGearGroup() {
        return this.defaultGearGroup;
    }

    public C43199b getDefinitionGearGroup() {
        return this.definitionGearGroup;
    }

    public C43199b getFlowGearGroup() {
        return this.flowGearGroup;
    }

    public List<GearSet> getGearSet() {
        return this.gearSet;
    }

    public boolean isValid() {
        if (this.adaptiveGearGroup == null || (this.gearSet == null && this.bandwidthSet == null && this.autoBitrateSet == null)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RateSettingsResponse{flowGearGroup=");
        sb.append(this.flowGearGroup);
        sb.append(", adaptiveGearGroup=");
        sb.append(this.adaptiveGearGroup);
        sb.append(", defaultGearGroup='");
        sb.append(this.defaultGearGroup);
        sb.append('\'');
        sb.append(", definitionGearGroup=");
        sb.append(this.definitionGearGroup);
        sb.append(", gearSet=");
        sb.append(this.gearSet);
        sb.append(", bandwidthSet=");
        sb.append(this.bandwidthSet);
        sb.append(", autoBitrateSet=");
        sb.append(this.autoBitrateSet);
        sb.append('}');
        return sb.toString();
    }

    public void setAdaptiveGearGroup(C43199b bVar) {
        this.adaptiveGearGroup = bVar;
    }

    public void setAutoBitrateSet(C43198a aVar) {
        this.autoBitrateSet = aVar;
    }

    public void setBandwidthSet(List<BandwidthSet> list) {
        this.bandwidthSet = list;
    }

    public void setDefaultGearGroup(String str) {
        this.defaultGearGroup = str;
    }

    public void setDefinitionGearGroup(C43199b bVar) {
        this.definitionGearGroup = bVar;
    }

    public void setFlowGearGroup(C43199b bVar) {
        this.flowGearGroup = bVar;
    }

    public void setGearSet(List<GearSet> list) {
        this.gearSet = list;
    }
}
