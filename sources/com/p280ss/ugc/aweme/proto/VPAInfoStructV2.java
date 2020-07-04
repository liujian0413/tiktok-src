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

/* renamed from: com.ss.ugc.aweme.proto.VPAInfoStructV2 */
final class VPAInfoStructV2 extends Message<VPAInfoStructV2, Builder> {
    public static final ProtoAdapter<VPAInfoStructV2> ADAPTER = new ProtoAdapter_VPAInfoStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer show_info_bar_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean show_opt_out_button;

    /* renamed from: com.ss.ugc.aweme.proto.VPAInfoStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<VPAInfoStructV2, Builder> {
        public Integer show_info_bar_type;
        public Boolean show_opt_out_button;

        public final VPAInfoStructV2 build() {
            return new VPAInfoStructV2(this.show_opt_out_button, this.show_info_bar_type, super.buildUnknownFields());
        }

        public final Builder show_info_bar_type(Integer num) {
            this.show_info_bar_type = num;
            return this;
        }

        public final Builder show_opt_out_button(Boolean bool) {
            this.show_opt_out_button = bool;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.VPAInfoStructV2$ProtoAdapter_VPAInfoStructV2 */
    static final class ProtoAdapter_VPAInfoStructV2 extends ProtoAdapter<VPAInfoStructV2> {
        public ProtoAdapter_VPAInfoStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, VPAInfoStructV2.class);
        }

        public final int encodedSize(VPAInfoStructV2 vPAInfoStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, vPAInfoStructV2.show_opt_out_button) + ProtoAdapter.INT32.encodedSizeWithTag(2, vPAInfoStructV2.show_info_bar_type) + vPAInfoStructV2.unknownFields().size();
        }

        public final VPAInfoStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show_opt_out_button((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.show_info_bar_type((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, VPAInfoStructV2 vPAInfoStructV2) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, vPAInfoStructV2.show_opt_out_button);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, vPAInfoStructV2.show_info_bar_type);
            protoWriter.writeBytes(vPAInfoStructV2.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show_opt_out_button = this.show_opt_out_button;
        builder.show_info_bar_type = this.show_info_bar_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.show_opt_out_button != null) {
            i = this.show_opt_out_button.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.show_info_bar_type != null) {
            i3 = this.show_info_bar_type.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show_opt_out_button != null) {
            sb.append(", show_opt_out_button=");
            sb.append(this.show_opt_out_button);
        }
        if (this.show_info_bar_type != null) {
            sb.append(", show_info_bar_type=");
            sb.append(this.show_info_bar_type);
        }
        StringBuilder replace = sb.replace(0, 2, "VPAInfoStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VPAInfoStructV2)) {
            return false;
        }
        VPAInfoStructV2 vPAInfoStructV2 = (VPAInfoStructV2) obj;
        if (!unknownFields().equals(vPAInfoStructV2.unknownFields()) || !Internal.equals(this.show_opt_out_button, vPAInfoStructV2.show_opt_out_button) || !Internal.equals(this.show_info_bar_type, vPAInfoStructV2.show_info_bar_type)) {
            return false;
        }
        return true;
    }

    public VPAInfoStructV2(Boolean bool, Integer num) {
        this(bool, num, ByteString.EMPTY);
    }

    public VPAInfoStructV2(Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_opt_out_button = bool;
        this.show_info_bar_type = num;
    }
}
