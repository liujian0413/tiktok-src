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

/* renamed from: com.ss.ugc.aweme.proto.SmartPhoneSettingsStructV2 */
public final class SmartPhoneSettingsStructV2 extends Message<SmartPhoneSettingsStructV2, Builder> {
    public static final ProtoAdapter<SmartPhoneSettingsStructV2> ADAPTER = new ProtoAdapter_SmartPhoneSettingsStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String encrypt_key;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String phone_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String phone_number;

    /* renamed from: com.ss.ugc.aweme.proto.SmartPhoneSettingsStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SmartPhoneSettingsStructV2, Builder> {
        public String encrypt_key;
        public String phone_id;
        public String phone_number;

        public final SmartPhoneSettingsStructV2 build() {
            return new SmartPhoneSettingsStructV2(this.phone_number, this.phone_id, this.encrypt_key, super.buildUnknownFields());
        }

        public final Builder encrypt_key(String str) {
            this.encrypt_key = str;
            return this;
        }

        public final Builder phone_id(String str) {
            this.phone_id = str;
            return this;
        }

        public final Builder phone_number(String str) {
            this.phone_number = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.SmartPhoneSettingsStructV2$ProtoAdapter_SmartPhoneSettingsStructV2 */
    static final class ProtoAdapter_SmartPhoneSettingsStructV2 extends ProtoAdapter<SmartPhoneSettingsStructV2> {
        public ProtoAdapter_SmartPhoneSettingsStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, SmartPhoneSettingsStructV2.class);
        }

        public final int encodedSize(SmartPhoneSettingsStructV2 smartPhoneSettingsStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, smartPhoneSettingsStructV2.phone_number) + ProtoAdapter.STRING.encodedSizeWithTag(2, smartPhoneSettingsStructV2.phone_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, smartPhoneSettingsStructV2.encrypt_key) + smartPhoneSettingsStructV2.unknownFields().size();
        }

        public final SmartPhoneSettingsStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.phone_number((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.phone_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.encrypt_key((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SmartPhoneSettingsStructV2 smartPhoneSettingsStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, smartPhoneSettingsStructV2.phone_number);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, smartPhoneSettingsStructV2.phone_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, smartPhoneSettingsStructV2.encrypt_key);
            protoWriter.writeBytes(smartPhoneSettingsStructV2.unknownFields());
        }
    }

    public SmartPhoneSettingsStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.phone_number = this.phone_number;
        builder.phone_id = this.phone_id;
        builder.encrypt_key = this.encrypt_key;
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
        if (this.phone_number != null) {
            i = this.phone_number.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.phone_id != null) {
            i2 = this.phone_id.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.encrypt_key != null) {
            i4 = this.encrypt_key.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.phone_number != null) {
            sb.append(", phone_number=");
            sb.append(this.phone_number);
        }
        if (this.phone_id != null) {
            sb.append(", phone_id=");
            sb.append(this.phone_id);
        }
        if (this.encrypt_key != null) {
            sb.append(", encrypt_key=");
            sb.append(this.encrypt_key);
        }
        StringBuilder replace = sb.replace(0, 2, "SmartPhoneSettingsStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SmartPhoneSettingsStructV2)) {
            return false;
        }
        SmartPhoneSettingsStructV2 smartPhoneSettingsStructV2 = (SmartPhoneSettingsStructV2) obj;
        if (!unknownFields().equals(smartPhoneSettingsStructV2.unknownFields()) || !Internal.equals(this.phone_number, smartPhoneSettingsStructV2.phone_number) || !Internal.equals(this.phone_id, smartPhoneSettingsStructV2.phone_id) || !Internal.equals(this.encrypt_key, smartPhoneSettingsStructV2.encrypt_key)) {
            return false;
        }
        return true;
    }

    public SmartPhoneSettingsStructV2(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public SmartPhoneSettingsStructV2(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.phone_number = str;
        this.phone_id = str2;
        this.encrypt_key = str3;
    }
}
