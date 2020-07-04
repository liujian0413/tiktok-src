package org.webrtc;

import java.util.Locale;

public class SessionDescription {
    public final String description;
    public final Type type;

    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER;

        public final String canonicalForm() {
            return name().toLowerCase(Locale.US);
        }

        public static Type fromCanonicalForm(String str) {
            return (Type) valueOf(Type.class, str.toUpperCase(Locale.US));
        }
    }

    /* access modifiers changed from: 0000 */
    public String getDescription() {
        return this.description;
    }

    /* access modifiers changed from: 0000 */
    public String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }

    public SessionDescription(Type type2, String str) {
        this.type = type2;
        this.description = str;
    }
}
