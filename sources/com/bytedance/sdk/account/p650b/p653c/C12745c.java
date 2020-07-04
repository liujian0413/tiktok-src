package com.bytedance.sdk.account.p650b.p653c;

import android.os.Bundle;

/* renamed from: com.bytedance.sdk.account.b.c.c */
public final class C12745c {

    /* renamed from: com.bytedance.sdk.account.b.c.c$a */
    public static class C12746a extends C12743a {

        /* renamed from: a */
        public String f33736a;

        /* renamed from: b */
        public String f33737b;

        /* renamed from: c */
        public String f33738c;

        /* renamed from: d */
        public String f33739d = "opensdk";

        /* renamed from: e */
        public int f33740e = -1;

        /* renamed from: f */
        public String f33741f;

        /* renamed from: g */
        public String f33742g;

        /* renamed from: h */
        public String f33743h;

        public final int getType() {
            return 1;
        }

        public C12746a() {
        }

        public C12746a(Bundle bundle) {
            fromBundle(bundle);
        }

        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_state", this.f33736a);
            bundle.putString("_bytedance_params_client_key", this.f33738c);
            bundle.putString("_bytedance_params_redirect_uri", this.f33737b);
            bundle.putString("_bytedance_params_scope", this.f33741f);
            bundle.putString("_bytedance_params_optional_scope0", this.f33742g);
            bundle.putString("_bytedance_params_optional_scope1", this.f33743h);
            bundle.putInt("wap_requested_orientation", this.f33740e);
            bundle.putString("wap_to_native_from_tag", this.f33739d);
        }

        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f33736a = bundle.getString("_bytedance_params_state");
            this.f33738c = bundle.getString("_bytedance_params_client_key");
            this.f33737b = bundle.getString("_bytedance_params_redirect_uri");
            this.f33741f = bundle.getString("_bytedance_params_scope");
            this.f33742g = bundle.getString("_bytedance_params_optional_scope0");
            this.f33743h = bundle.getString("_bytedance_params_optional_scope1");
            this.f33740e = bundle.getInt("wap_requested_orientation", -1);
            this.f33739d = bundle.getString("wap_to_native_from_tag", "opensdk");
        }
    }

    /* renamed from: com.bytedance.sdk.account.b.c.c$b */
    public static class C12747b extends C12744b {

        /* renamed from: a */
        public String f33744a;

        /* renamed from: b */
        public String f33745b;

        /* renamed from: c */
        public String f33746c;

        public C12747b() {
        }

        public final int getType() {
            return 2;
        }

        public C12747b(Bundle bundle) {
            fromBundle(bundle);
        }

        public final void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.f33744a = bundle.getString("_bytedance_params_authcode");
            this.f33745b = bundle.getString("_bytedance_params_state");
            this.f33746c = bundle.getString("_bytedance_params_granted_permission");
        }

        public final void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_bytedance_params_authcode", this.f33744a);
            bundle.putString("_bytedance_params_state", this.f33745b);
            bundle.putString("_bytedance_params_granted_permission", this.f33746c);
        }
    }
}
