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

/* renamed from: com.ss.ugc.aweme.proto.AwemeACLStructV2 */
public final class AwemeACLStructV2 extends Message<AwemeACLStructV2, Builder> {
    public static final ProtoAdapter<AwemeACLStructV2> ADAPTER = new ProtoAdapter_AwemeACLStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", tag = 1)
    public ACLCommonStructV2 download_general;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", tag = 2)
    public ACLCommonStructV2 download_mask_panel;
    @WireField(adapter = "com.ss.ugc.aweme.proto.ACLCommonStructV2#ADAPTER", tag = 3)
    public ACLCommonStructV2 download_share_panel;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeACLStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeACLStructV2, Builder> {
        public ACLCommonStructV2 download_general;
        public ACLCommonStructV2 download_mask_panel;
        public ACLCommonStructV2 download_share_panel;

        public final AwemeACLStructV2 build() {
            return new AwemeACLStructV2(this.download_general, this.download_mask_panel, this.download_share_panel, super.buildUnknownFields());
        }

        public final Builder download_general(ACLCommonStructV2 aCLCommonStructV2) {
            this.download_general = aCLCommonStructV2;
            return this;
        }

        public final Builder download_mask_panel(ACLCommonStructV2 aCLCommonStructV2) {
            this.download_mask_panel = aCLCommonStructV2;
            return this;
        }

        public final Builder download_share_panel(ACLCommonStructV2 aCLCommonStructV2) {
            this.download_share_panel = aCLCommonStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeACLStructV2$ProtoAdapter_AwemeACLStructV2 */
    static final class ProtoAdapter_AwemeACLStructV2 extends ProtoAdapter<AwemeACLStructV2> {
        public ProtoAdapter_AwemeACLStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeACLStructV2.class);
        }

        public final int encodedSize(AwemeACLStructV2 awemeACLStructV2) {
            return ACLCommonStructV2.ADAPTER.encodedSizeWithTag(1, awemeACLStructV2.download_general) + ACLCommonStructV2.ADAPTER.encodedSizeWithTag(2, awemeACLStructV2.download_mask_panel) + ACLCommonStructV2.ADAPTER.encodedSizeWithTag(3, awemeACLStructV2.download_share_panel) + awemeACLStructV2.unknownFields().size();
        }

        public final AwemeACLStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.download_general((ACLCommonStructV2) ACLCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            builder.download_mask_panel((ACLCommonStructV2) ACLCommonStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.download_share_panel((ACLCommonStructV2) ACLCommonStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeACLStructV2 awemeACLStructV2) throws IOException {
            ACLCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 1, awemeACLStructV2.download_general);
            ACLCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 2, awemeACLStructV2.download_mask_panel);
            ACLCommonStructV2.ADAPTER.encodeWithTag(protoWriter, 3, awemeACLStructV2.download_share_panel);
            protoWriter.writeBytes(awemeACLStructV2.unknownFields());
        }
    }

    public AwemeACLStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.download_general = this.download_general;
        builder.download_mask_panel = this.download_mask_panel;
        builder.download_share_panel = this.download_share_panel;
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
        if (this.download_general != null) {
            i = this.download_general.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.download_mask_panel != null) {
            i2 = this.download_mask_panel.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.download_share_panel != null) {
            i4 = this.download_share_panel.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.download_general != null) {
            sb.append(", download_general=");
            sb.append(this.download_general);
        }
        if (this.download_mask_panel != null) {
            sb.append(", download_mask_panel=");
            sb.append(this.download_mask_panel);
        }
        if (this.download_share_panel != null) {
            sb.append(", download_share_panel=");
            sb.append(this.download_share_panel);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeACLStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeACLStructV2)) {
            return false;
        }
        AwemeACLStructV2 awemeACLStructV2 = (AwemeACLStructV2) obj;
        if (!unknownFields().equals(awemeACLStructV2.unknownFields()) || !Internal.equals(this.download_general, awemeACLStructV2.download_general) || !Internal.equals(this.download_mask_panel, awemeACLStructV2.download_mask_panel) || !Internal.equals(this.download_share_panel, awemeACLStructV2.download_share_panel)) {
            return false;
        }
        return true;
    }

    public AwemeACLStructV2(ACLCommonStructV2 aCLCommonStructV2, ACLCommonStructV2 aCLCommonStructV22, ACLCommonStructV2 aCLCommonStructV23) {
        this(aCLCommonStructV2, aCLCommonStructV22, aCLCommonStructV23, ByteString.EMPTY);
    }

    public AwemeACLStructV2(ACLCommonStructV2 aCLCommonStructV2, ACLCommonStructV2 aCLCommonStructV22, ACLCommonStructV2 aCLCommonStructV23, ByteString byteString) {
        super(ADAPTER, byteString);
        this.download_general = aCLCommonStructV2;
        this.download_mask_panel = aCLCommonStructV22;
        this.download_share_panel = aCLCommonStructV23;
    }
}
