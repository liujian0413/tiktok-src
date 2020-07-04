package com.p280ss.android.ugc.aweme.emoji.utils.zip;

import java.io.Serializable;
import java.util.zip.ZipException;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.UnsupportedZipFeatureException */
public class UnsupportedZipFeatureException extends ZipException {
    private static final long serialVersionUID = 20161221;
    private final transient C27667r entry;
    private final Feature reason;

    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.UnsupportedZipFeatureException$Feature */
    public static class Feature implements Serializable {
        public static final Feature DATA_DESCRIPTOR = new Feature("data descriptor");
        public static final Feature ENCRYPTION = new Feature("encryption");
        public static final Feature METHOD = new Feature("compression method");
        private final String name;

        public String toString() {
            return this.name;
        }

        private Feature(String str) {
            this.name = str;
        }
    }

    public C27667r getEntry() {
        return this.entry;
    }

    public Feature getFeature() {
        return this.reason;
    }

    public UnsupportedZipFeatureException(Feature feature, C27667r rVar) {
        StringBuilder sb = new StringBuilder("unsupported feature ");
        sb.append(feature);
        sb.append(" used in entry ");
        sb.append(rVar.getName());
        super(sb.toString());
        this.reason = feature;
        this.entry = rVar;
    }
}
