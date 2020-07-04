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

/* renamed from: com.ss.ugc.aweme.proto.AwemeControlStructV2 */
public final class AwemeControlStructV2 extends Message<AwemeControlStructV2, Builder> {
    public static final ProtoAdapter<AwemeControlStructV2> ADAPTER = new ProtoAdapter_AwemeControlStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public Boolean can_comment;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean can_forward;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean can_share;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean can_show_comment;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeControlStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeControlStructV2, Builder> {
        public Boolean can_comment;
        public Boolean can_forward;
        public Boolean can_share;
        public Boolean can_show_comment;

        public final AwemeControlStructV2 build() {
            AwemeControlStructV2 awemeControlStructV2 = new AwemeControlStructV2(this.can_forward, this.can_share, this.can_comment, this.can_show_comment, super.buildUnknownFields());
            return awemeControlStructV2;
        }

        public final Builder can_comment(Boolean bool) {
            this.can_comment = bool;
            return this;
        }

        public final Builder can_forward(Boolean bool) {
            this.can_forward = bool;
            return this;
        }

        public final Builder can_share(Boolean bool) {
            this.can_share = bool;
            return this;
        }

        public final Builder can_show_comment(Boolean bool) {
            this.can_show_comment = bool;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeControlStructV2$ProtoAdapter_AwemeControlStructV2 */
    static final class ProtoAdapter_AwemeControlStructV2 extends ProtoAdapter<AwemeControlStructV2> {
        public ProtoAdapter_AwemeControlStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeControlStructV2.class);
        }

        public final int encodedSize(AwemeControlStructV2 awemeControlStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, awemeControlStructV2.can_forward) + ProtoAdapter.BOOL.encodedSizeWithTag(2, awemeControlStructV2.can_share) + ProtoAdapter.BOOL.encodedSizeWithTag(3, awemeControlStructV2.can_comment) + ProtoAdapter.BOOL.encodedSizeWithTag(4, awemeControlStructV2.can_show_comment) + awemeControlStructV2.unknownFields().size();
        }

        public final AwemeControlStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.can_forward((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.can_share((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.can_comment((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 4:
                            builder.can_show_comment((Boolean) ProtoAdapter.BOOL.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeControlStructV2 awemeControlStructV2) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, awemeControlStructV2.can_forward);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, awemeControlStructV2.can_share);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, awemeControlStructV2.can_comment);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, awemeControlStructV2.can_show_comment);
            protoWriter.writeBytes(awemeControlStructV2.unknownFields());
        }
    }

    public AwemeControlStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.can_forward = this.can_forward;
        builder.can_share = this.can_share;
        builder.can_comment = this.can_comment;
        builder.can_show_comment = this.can_show_comment;
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
        if (this.can_forward != null) {
            i = this.can_forward.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.can_share != null) {
            i2 = this.can_share.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.can_comment != null) {
            i3 = this.can_comment.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.can_show_comment != null) {
            i5 = this.can_show_comment.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.can_forward != null) {
            sb.append(", can_forward=");
            sb.append(this.can_forward);
        }
        if (this.can_share != null) {
            sb.append(", can_share=");
            sb.append(this.can_share);
        }
        if (this.can_comment != null) {
            sb.append(", can_comment=");
            sb.append(this.can_comment);
        }
        if (this.can_show_comment != null) {
            sb.append(", can_show_comment=");
            sb.append(this.can_show_comment);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeControlStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeControlStructV2)) {
            return false;
        }
        AwemeControlStructV2 awemeControlStructV2 = (AwemeControlStructV2) obj;
        if (!unknownFields().equals(awemeControlStructV2.unknownFields()) || !Internal.equals(this.can_forward, awemeControlStructV2.can_forward) || !Internal.equals(this.can_share, awemeControlStructV2.can_share) || !Internal.equals(this.can_comment, awemeControlStructV2.can_comment) || !Internal.equals(this.can_show_comment, awemeControlStructV2.can_show_comment)) {
            return false;
        }
        return true;
    }

    public AwemeControlStructV2(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this(bool, bool2, bool3, bool4, ByteString.EMPTY);
    }

    public AwemeControlStructV2(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.can_forward = bool;
        this.can_share = bool2;
        this.can_comment = bool3;
        this.can_show_comment = bool4;
    }
}
