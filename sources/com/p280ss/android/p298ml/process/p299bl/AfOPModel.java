package com.p280ss.android.p298ml.process.p299bl;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.p298ml.process.C6831a;
import java.util.List;

/* renamed from: com.ss.android.ml.process.bl.AfOPModel */
public class AfOPModel implements C6831a {
    @C6593c(mo15949a = "args")
    public List<String> args;
    @C6593c(mo15949a = "labels")
    public List<String> labels;
    @C6593c(mo15949a = "op")

    /* renamed from: op */
    public String f19456op;
    @C6593c(mo15949a = "opts")
    public List<Float> opts;

    public List<String> getArgs() {
        return this.args;
    }

    public List<String> getLabels() {
        return this.labels;
    }

    public List<Float> getOPTs() {
        return this.opts;
    }

    public String getOperator() {
        return this.f19456op;
    }
}
