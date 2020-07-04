package com.bytedance.vast.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

public class AdVerification implements Serializable, Cloneable {
    @C6593c(mo15949a = "javaScriptResource")
    public String javascriptResource;
    @C6593c(mo15949a = "vendorKey")
    public String vender;
    @C6593c(mo15949a = "verificationParameters")
    public String verificationParameters;

    public boolean valid() {
        if (this.javascriptResource == null || this.javascriptResource.isEmpty()) {
            return false;
        }
        return true;
    }
}
