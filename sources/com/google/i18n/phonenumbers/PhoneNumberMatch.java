package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import java.util.Arrays;

public final class PhoneNumberMatch {
    private final PhoneNumber number;
    private final String rawString;
    private final int start;

    public final PhoneNumber number() {
        return this.number;
    }

    public final String rawString() {
        return this.rawString;
    }

    public final int start() {
        return this.start;
    }

    public final int end() {
        return this.start + this.rawString.length();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.start), this.rawString, this.number});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneNumberMatch [");
        sb.append(start());
        sb.append(",");
        sb.append(end());
        sb.append(") ");
        sb.append(this.rawString);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumberMatch)) {
            return false;
        }
        PhoneNumberMatch phoneNumberMatch = (PhoneNumberMatch) obj;
        if (!this.rawString.equals(phoneNumberMatch.rawString) || this.start != phoneNumberMatch.start || !this.number.equals(phoneNumberMatch.number)) {
            return false;
        }
        return true;
    }

    PhoneNumberMatch(int i, String str, PhoneNumber phoneNumber) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        } else if (str == null || phoneNumber == null) {
            throw new NullPointerException();
        } else {
            this.start = i;
            this.rawString = str;
            this.number = phoneNumber;
        }
    }
}
