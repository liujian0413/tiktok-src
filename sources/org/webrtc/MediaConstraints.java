package org.webrtc;

import java.util.ArrayList;
import java.util.List;

public class MediaConstraints {
    public final List<KeyValuePair> mandatory = new ArrayList();
    public final List<KeyValuePair> optional = new ArrayList();

    public static class KeyValuePair {
        private final String key;
        private final String value;

        public String getKey() {
            return this.key;
        }

        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.key.hashCode() + this.value.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.key);
            sb.append(": ");
            sb.append(this.value);
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            KeyValuePair keyValuePair = (KeyValuePair) obj;
            if (!this.key.equals(keyValuePair.key) || !this.value.equals(keyValuePair.value)) {
                return false;
            }
            return true;
        }

        public KeyValuePair(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    /* access modifiers changed from: 0000 */
    public List<KeyValuePair> getMandatory() {
        return this.mandatory;
    }

    /* access modifiers changed from: 0000 */
    public List<KeyValuePair> getOptional() {
        return this.optional;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("mandatory: ");
        sb.append(stringifyKeyValuePairList(this.mandatory));
        sb.append(", optional: ");
        sb.append(stringifyKeyValuePairList(this.optional));
        return sb.toString();
    }

    private static String stringifyKeyValuePairList(List<KeyValuePair> list) {
        StringBuilder sb = new StringBuilder("[");
        for (KeyValuePair keyValuePair : list) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(keyValuePair.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
