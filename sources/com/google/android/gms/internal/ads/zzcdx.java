package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzcdx extends IOException {
    private aza zzgaa;

    public zzcdx(String str) {
        super(str);
    }

    public final zzcdx zzk(aza aza) {
        this.zzgaa = aza;
        return this;
    }

    static zzcdx zzatu() {
        return new zzcdx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzcdx zzatv() {
        return new zzcdx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzcdx zzatw() {
        return new zzcdx("CodedInputStream encountered a malformed varint.");
    }

    static zzcdx zzatx() {
        return new zzcdx("Protocol message contained an invalid tag (zero).");
    }

    static zzcdx zzaty() {
        return new zzcdx("Protocol message end-group tag did not match expected tag.");
    }

    static zzcdy zzatz() {
        return new zzcdy("Protocol message tag had invalid wire type.");
    }

    static zzcdx zzaua() {
        return new zzcdx("Failed to parse the message.");
    }

    static zzcdx zzaub() {
        return new zzcdx("Protocol message had invalid UTF-8.");
    }
}
