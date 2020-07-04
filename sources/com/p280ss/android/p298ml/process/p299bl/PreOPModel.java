package com.p280ss.android.p298ml.process.p299bl;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.p298ml.process.C6833c;
import java.util.List;

/* renamed from: com.ss.android.ml.process.bl.PreOPModel */
public class PreOPModel implements C6833c {
    @C6593c(mo15949a = "args")
    public List<String> args;
    @C6593c(mo15949a = "feature")
    public String feature;
    @C6593c(mo15949a = "lables")
    public List<String> labels;
    @C6593c(mo15949a = "op")

    /* renamed from: op */
    public String f53959op;
    @C6593c(mo15949a = "opts")
    public List<Float> opts;

    public List<String> getArgs() {
        return this.args;
    }

    public String getFeature() {
        return this.feature;
    }

    public List<String> getLabels() {
        return this.labels;
    }

    public List<Float> getOPTs() {
        return this.opts;
    }

    public String getOperator() {
        return this.f53959op;
    }
}
