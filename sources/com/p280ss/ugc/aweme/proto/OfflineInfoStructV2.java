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

/* renamed from: com.ss.ugc.aweme.proto.OfflineInfoStructV2 */
public final class OfflineInfoStructV2 extends Message<OfflineInfoStructV2, Builder> {
    public static final ProtoAdapter<OfflineInfoStructV2> ADAPTER = new ProtoAdapter_OfflineInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String action;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer offline_info_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String text;

    /* renamed from: com.ss.ugc.aweme.proto.OfflineInfoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<OfflineInfoStructV2, Builder> {
        public String action;
        public Integer offline_info_type;
        public String text;

        public final OfflineInfoStructV2 build() {
            return new OfflineInfoStructV2(this.offline_info_type, this.text, this.action, super.buildUnknownFields());
        }

        public final Builder action(String str) {
            this.action = str;
            return this;
        }

        public final Builder offline_info_type(Integer num) {
            this.offline_info_type = num;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.OfflineInfoStructV2$ProtoAdapter_OfflineInfoStructV2 */
    static final class ProtoAdapter_OfflineInfoStructV2 extends ProtoAdapter<OfflineInfoStructV2> {
        public ProtoAdapter_OfflineInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, OfflineInfoStructV2.class);
        }

        public final int encodedSize(OfflineInfoStructV2 offlineInfoStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, offlineInfoStructV2.offline_info_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, offlineInfoStructV2.text) + ProtoAdapter.STRING.encodedSizeWithTag(3, offlineInfoStructV2.action) + offlineInfoStructV2.unknownFields().size();
        }

        public final OfflineInfoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.offline_info_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.action((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, OfflineInfoStructV2 offlineInfoStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, offlineInfoStructV2.offline_info_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, offlineInfoStructV2.text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, offlineInfoStructV2.action);
            protoWriter.writeBytes(offlineInfoStructV2.unknownFields());
        }
    }

    public OfflineInfoStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.offline_info_type = this.offline_info_type;
        builder.text = this.text;
        builder.action = this.action;
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
        if (this.offline_info_type != null) {
            i = this.offline_info_type.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.text != null) {
            i2 = this.text.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.action != null) {
            i4 = this.action.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.offline_info_type != null) {
            sb.append(", offline_info_type=");
            sb.append(this.offline_info_type);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        StringBuilder replace = sb.replace(0, 2, "OfflineInfoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineInfoStructV2)) {
            return false;
        }
        OfflineInfoStructV2 offlineInfoStructV2 = (OfflineInfoStructV2) obj;
        if (!unknownFields().equals(offlineInfoStructV2.unknownFields()) || !Internal.equals(this.offline_info_type, offlineInfoStructV2.offline_info_type) || !Internal.equals(this.text, offlineInfoStructV2.text) || !Internal.equals(this.action, offlineInfoStructV2.action)) {
            return false;
        }
        return true;
    }

    public OfflineInfoStructV2(Integer num, String str, String str2) {
        this(num, str, str2, ByteString.EMPTY);
    }

    public OfflineInfoStructV2(Integer num, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offline_info_type = num;
        this.text = str;
        this.action = str2;
    }
}
