package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.PlatformSyncStatusStructV2 */
public final class PlatformSyncStatusStructV2 extends Message<PlatformSyncStatusStructV2, Builder> {
    public static final ProtoAdapter<PlatformSyncStatusStructV2> ADAPTER = new ProtoAdapter_PlatformSyncStatusStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean full_synced;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String nickname;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String platform_name;

    /* renamed from: com.ss.ugc.aweme.proto.PlatformSyncStatusStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PlatformSyncStatusStructV2, Builder> {
        public Boolean full_synced;
        public String nickname;
        public String platform_name;

        public final PlatformSyncStatusStructV2 build() {
            return new PlatformSyncStatusStructV2(this.platform_name, this.nickname, this.full_synced, super.buildUnknownFields());
        }

        public final Builder full_synced(Boolean bool) {
            this.full_synced = bool;
            return this;
        }

        public final Builder nickname(String str) {
            this.nickname = str;
            return this;
        }

        public final Builder platform_name(String str) {
            this.platform_name = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PlatformSyncStatusStructV2$ProtoAdapter_PlatformSyncStatusStructV2 */
    static final class ProtoAdapter_PlatformSyncStatusStructV2 extends ProtoAdapter<PlatformSyncStatusStructV2> {
        public ProtoAdapter_PlatformSyncStatusStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PlatformSyncStatusStructV2.class);
        }

        public final int encodedSize(PlatformSyncStatusStructV2 platformSyncStatusStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, platformSyncStatusStructV2.platform_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, platformSyncStatusStructV2.nickname) + ProtoAdapter.BOOL.encodedSizeWithTag(3, platformSyncStatusStructV2.full_synced) + platformSyncStatusStructV2.unknownFields().size();
        }

        public final PlatformSyncStatusStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.platform_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.nickname((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.full_synced((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, PlatformSyncStatusStructV2 platformSyncStatusStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, platformSyncStatusStructV2.platform_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, platformSyncStatusStructV2.nickname);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, platformSyncStatusStructV2.full_synced);
            protoWriter.writeBytes(platformSyncStatusStructV2.unknownFields());
        }
    }

    public PlatformSyncStatusStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.platform_name = this.platform_name;
        builder.nickname = this.nickname;
        builder.full_synced = this.full_synced;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.platform_name != null) {
            i = this.platform_name.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.nickname != null) {
            i2 = this.nickname.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.full_synced != null) {
            i4 = this.full_synced.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.platform_name != null) {
            sb.append(", platform_name=");
            sb.append(this.platform_name);
        }
        if (this.nickname != null) {
            sb.append(", nickname=");
            sb.append(this.nickname);
        }
        if (this.full_synced != null) {
            sb.append(", full_synced=");
            sb.append(this.full_synced);
        }
        StringBuilder replace = sb.replace(0, 2, "PlatformSyncStatusStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlatformSyncStatusStructV2)) {
            return false;
        }
        PlatformSyncStatusStructV2 platformSyncStatusStructV2 = (PlatformSyncStatusStructV2) obj;
        if (!unknownFields().equals(platformSyncStatusStructV2.unknownFields()) || !Internal.equals(this.platform_name, platformSyncStatusStructV2.platform_name) || !Internal.equals(this.nickname, platformSyncStatusStructV2.nickname) || !Internal.equals(this.full_synced, platformSyncStatusStructV2.full_synced)) {
            return false;
        }
        return true;
    }

    public PlatformSyncStatusStructV2(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public PlatformSyncStatusStructV2(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.platform_name = str;
        this.nickname = str2;
        this.full_synced = bool;
    }
}
