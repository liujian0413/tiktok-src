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

/* renamed from: com.ss.ugc.aweme.proto.ACLCommonStructV2 */
public final class ACLCommonStructV2 extends Message<ACLCommonStructV2, Builder> {
    public static final ProtoAdapter<ACLCommonStructV2> ADAPTER = new ProtoAdapter_ACLCommonStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer code;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String extra;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer show_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String toast_msg;

    /* renamed from: com.ss.ugc.aweme.proto.ACLCommonStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ACLCommonStructV2, Builder> {
        public Integer code;
        public String extra;
        public Integer show_type;
        public String toast_msg;

        public final ACLCommonStructV2 build() {
            ACLCommonStructV2 aCLCommonStructV2 = new ACLCommonStructV2(this.code, this.show_type, this.toast_msg, this.extra, super.buildUnknownFields());
            return aCLCommonStructV2;
        }

        public final Builder code(Integer num) {
            this.code = num;
            return this;
        }

        public final Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public final Builder show_type(Integer num) {
            this.show_type = num;
            return this;
        }

        public final Builder toast_msg(String str) {
            this.toast_msg = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ACLCommonStructV2$ProtoAdapter_ACLCommonStructV2 */
    static final class ProtoAdapter_ACLCommonStructV2 extends ProtoAdapter<ACLCommonStructV2> {
        public ProtoAdapter_ACLCommonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ACLCommonStructV2.class);
        }

        public final int encodedSize(ACLCommonStructV2 aCLCommonStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, aCLCommonStructV2.code) + ProtoAdapter.INT32.encodedSizeWithTag(2, aCLCommonStructV2.show_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, aCLCommonStructV2.toast_msg) + ProtoAdapter.STRING.encodedSizeWithTag(4, aCLCommonStructV2.extra) + aCLCommonStructV2.unknownFields().size();
        }

        public final ACLCommonStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.code((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.show_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.toast_msg((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.extra((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ACLCommonStructV2 aCLCommonStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, aCLCommonStructV2.code);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, aCLCommonStructV2.show_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, aCLCommonStructV2.toast_msg);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, aCLCommonStructV2.extra);
            protoWriter.writeBytes(aCLCommonStructV2.unknownFields());
        }
    }

    public ACLCommonStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.code = this.code;
        builder.show_type = this.show_type;
        builder.toast_msg = this.toast_msg;
        builder.extra = this.extra;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.code != null) {
            i = this.code.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.show_type != null) {
            i2 = this.show_type.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.toast_msg != null) {
            i3 = this.toast_msg.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.extra != null) {
            i5 = this.extra.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.show_type != null) {
            sb.append(", show_type=");
            sb.append(this.show_type);
        }
        if (this.toast_msg != null) {
            sb.append(", toast_msg=");
            sb.append(this.toast_msg);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "ACLCommonStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ACLCommonStructV2)) {
            return false;
        }
        ACLCommonStructV2 aCLCommonStructV2 = (ACLCommonStructV2) obj;
        if (!unknownFields().equals(aCLCommonStructV2.unknownFields()) || !Internal.equals(this.code, aCLCommonStructV2.code) || !Internal.equals(this.show_type, aCLCommonStructV2.show_type) || !Internal.equals(this.toast_msg, aCLCommonStructV2.toast_msg) || !Internal.equals(this.extra, aCLCommonStructV2.extra)) {
            return false;
        }
        return true;
    }

    public ACLCommonStructV2(Integer num, Integer num2, String str, String str2) {
        this(num, num2, str, str2, ByteString.EMPTY);
    }

    public ACLCommonStructV2(Integer num, Integer num2, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = num;
        this.show_type = num2;
        this.toast_msg = str;
        this.extra = str2;
    }
}
