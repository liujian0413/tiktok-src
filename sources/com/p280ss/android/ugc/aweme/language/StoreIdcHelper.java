package com.p280ss.android.ugc.aweme.language;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.language.StoreIdcHelper */
public class StoreIdcHelper implements Serializable {
    private static HashMap<String, String> mIdcs;

    /* renamed from: com.ss.android.ugc.aweme.language.StoreIdcHelper$a */
    enum C32320a {
        INSTANCE;
        

        /* renamed from: b */
        private StoreIdcHelper f84421b;

        /* renamed from: a */
        public final StoreIdcHelper mo83530a() {
            return this.f84421b;
        }
    }

    private StoreIdcHelper() {
    }

    public static StoreIdcHelper get() {
        return C32320a.INSTANCE.mo83530a();
    }

    public String getStoreIdc() {
        String g = C32326h.m104885g();
        if (!TextUtils.isEmpty(g)) {
            return (String) mIdcs.get(g);
        }
        return null;
    }

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        mIdcs = hashMap;
        hashMap.put("AG", "maliva");
        mIdcs.put("AI", "maliva");
        mIdcs.put("BB", "maliva");
        mIdcs.put("BM", "maliva");
        mIdcs.put("BS", "maliva");
        mIdcs.put("BZ", "maliva");
        mIdcs.put("CA", "maliva");
        mIdcs.put("CC", "maliva");
        mIdcs.put("CR", "maliva");
        mIdcs.put("CU", "maliva");
        mIdcs.put("GD", "maliva");
        mIdcs.put("GT", "maliva");
        mIdcs.put("HN", "maliva");
        mIdcs.put("HT", "maliva");
        mIdcs.put("JM", "maliva");
        mIdcs.put("MX", "maliva");
        mIdcs.put("NI", "maliva");
        mIdcs.put("PA", "maliva");
        mIdcs.put("US", "maliva");
        mIdcs.put("VE", "maliva");
        mIdcs.put("AU", "maliva");
        mIdcs.put("CK", "maliva");
        mIdcs.put("CX", "maliva");
        mIdcs.put("FJ", "maliva");
        mIdcs.put("GU", "maliva");
        mIdcs.put("NZ", "maliva");
        mIdcs.put("PG", "maliva");
        mIdcs.put("TO", "maliva");
        mIdcs.put("AO", "maliva");
        mIdcs.put("BF", "maliva");
        mIdcs.put("BI", "maliva");
        mIdcs.put("BJ", "maliva");
        mIdcs.put("BW", "maliva");
        mIdcs.put("CF", "maliva");
        mIdcs.put("CG", "maliva");
        mIdcs.put("CM", "maliva");
        mIdcs.put("CV", "maliva");
        mIdcs.put("DZ", "maliva");
        mIdcs.put("EG", "maliva");
        mIdcs.put("ET", "maliva");
        mIdcs.put("GA", "maliva");
        mIdcs.put("GH", "maliva");
        mIdcs.put("GM", "maliva");
        mIdcs.put("GN", "maliva");
        mIdcs.put("GQ", "maliva");
        mIdcs.put("KE", "maliva");
        mIdcs.put("LY", "maliva");
        mIdcs.put("MA", "maliva");
        mIdcs.put("MG", "maliva");
        mIdcs.put("MR", "maliva");
        mIdcs.put("MU", "maliva");
        mIdcs.put("MW", "maliva");
        mIdcs.put("MZ", "maliva");
        mIdcs.put("NA", "maliva");
        mIdcs.put("NG", "maliva");
        mIdcs.put("RW", "maliva");
        mIdcs.put("SD", "maliva");
        mIdcs.put("SN", "maliva");
        mIdcs.put("SO", "maliva");
        mIdcs.put("TN", "maliva");
        mIdcs.put("TZ", "maliva");
        mIdcs.put("UG", "maliva");
        mIdcs.put("ZA", "maliva");
        mIdcs.put("ZM", "maliva");
        mIdcs.put("ZR", "maliva");
        mIdcs.put("ZW", "maliva");
        mIdcs.put("AQ", "maliva");
        mIdcs.put("BV", "maliva");
        mIdcs.put("AR", "maliva");
        mIdcs.put("AW", "maliva");
        mIdcs.put("BO", "maliva");
        mIdcs.put("BR", "maliva");
        mIdcs.put("CL", "maliva");
        mIdcs.put("CO", "maliva");
        mIdcs.put("EC", "maliva");
        mIdcs.put("GY", "maliva");
        mIdcs.put("PE", "maliva");
        mIdcs.put("PY", "maliva");
        mIdcs.put("UY", "maliva");
        mIdcs.put("AD", "maliva");
        mIdcs.put("AM", "maliva");
        mIdcs.put("AT", "maliva");
        mIdcs.put("BA", "maliva");
        mIdcs.put("BE", "maliva");
        mIdcs.put("BG", "maliva");
        mIdcs.put("BY", "maliva");
        mIdcs.put("CH", "maliva");
        mIdcs.put("CZ", "maliva");
        mIdcs.put("DE", "maliva");
        mIdcs.put("DK", "maliva");
        mIdcs.put("EE", "maliva");
        mIdcs.put("ES", "maliva");
        mIdcs.put("FI", "maliva");
        mIdcs.put("FR", "maliva");
        mIdcs.put("GB", "maliva");
        mIdcs.put("GR", "maliva");
        mIdcs.put("HR", "maliva");
        mIdcs.put("HU", "maliva");
        mIdcs.put("IE", "maliva");
        mIdcs.put("IS", "maliva");
        mIdcs.put("IT", "maliva");
        mIdcs.put("LT", "maliva");
        mIdcs.put("LV", "maliva");
        mIdcs.put("MC", "maliva");
        mIdcs.put("MD", "maliva");
        mIdcs.put("MT", "maliva");
        mIdcs.put("NL", "maliva");
        mIdcs.put("NO", "maliva");
        mIdcs.put("PL", "maliva");
        mIdcs.put("PT", "maliva");
        mIdcs.put("RO", "maliva");
        mIdcs.put("RU", "maliva");
        mIdcs.put("SE", "maliva");
        mIdcs.put("SK", "maliva");
        mIdcs.put("SM", "maliva");
        mIdcs.put("UA", "maliva");
        mIdcs.put("UK", "maliva");
        mIdcs.put("YU", "maliva");
        mIdcs.put("AE", "maliva");
        mIdcs.put("AF", "maliva");
        mIdcs.put("AL", "maliva");
        mIdcs.put("AZ", "maliva");
        mIdcs.put("BH", "maliva");
        mIdcs.put("BN", "maliva");
        mIdcs.put("BT", "maliva");
        mIdcs.put("KZ", "maliva");
        mIdcs.put("CY", "maliva");
        mIdcs.put("IL", "maliva");
        mIdcs.put("IQ", "maliva");
        mIdcs.put("IR", "maliva");
        mIdcs.put("JO", "maliva");
        mIdcs.put("KP", "maliva");
        mIdcs.put("KW", "maliva");
        mIdcs.put("LB", "maliva");
        mIdcs.put("LU", "maliva");
        mIdcs.put("MN", "maliva");
        mIdcs.put("MV", "maliva");
        mIdcs.put("OM", "maliva");
        mIdcs.put("QA", "maliva");
        mIdcs.put("SA", "maliva");
        mIdcs.put("SG", "maliva");
        mIdcs.put("SY", "maliva");
        mIdcs.put("TJ", "maliva");
        mIdcs.put("TM", "maliva");
        mIdcs.put("VA", "maliva");
        mIdcs.put("YE", "maliva");
        mIdcs.put("CN", "alisg");
        mIdcs.put("HK", "alisg");
        mIdcs.put("ID", "alisg");
        mIdcs.put("IN", "alisg");
        mIdcs.put("JP", "alisg");
        mIdcs.put("KH", "alisg");
        mIdcs.put("KR", "alisg");
        mIdcs.put("LA", "alisg");
        mIdcs.put("MO", "alisg");
        mIdcs.put("MY", "alisg");
        mIdcs.put("NP", "alisg");
        mIdcs.put("PH", "alisg");
        mIdcs.put("PK", "alisg");
        mIdcs.put("TH", "alisg");
        mIdcs.put("TW", "alisg");
        mIdcs.put("VN", "alisg");
        mIdcs.put("LK", "alisg");
        mIdcs.put("MM", "alisg");
        mIdcs.put("BD", "alisg");
    }
}
