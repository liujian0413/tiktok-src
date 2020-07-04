package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.MixStatusStructV2 */
public final class MixStatusStructV2 extends Message<MixStatusStructV2, Builder> {
    public static final ProtoAdapter<MixStatusStructV2> ADAPTER = new ProtoAdapter_MixStatusStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer is_collected;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = Label.REQUIRED, tag = 1)
    public Integer status;

    /* renamed from: com.ss.ugc.aweme.proto.MixStatusStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MixStatusStructV2, Builder> {
        public Integer is_collected;
        public Integer status;

        public final MixStatusStructV2 build() {
            if (this.status != null) {
                return new MixStatusStructV2(this.status, this.is_collected, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(this.status, "status");
        }

        public final Builder is_collected(Integer num) {
            this.is_collected = num;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.MixStatusStructV2$ProtoAdapter_MixStatusStructV2 */
    static final class ProtoAdapter_MixStatusStructV2 extends ProtoAdapter<MixStatusStructV2> {
        public ProtoAdapter_MixStatusStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MixStatusStructV2.class);
        }

        public final int encodedSize(MixStatusStructV2 mixStatusStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, mixStatusStructV2.status) + ProtoAdapter.INT32.encodedSizeWithTag(2, mixStatusStructV2.is_collected) + mixStatusStructV2.unknownFields().size();
        }

        public final MixStatusStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.is_collected((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MixStatusStructV2 mixStatusStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, mixStatusStructV2.status);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, mixStatusStructV2.is_collected);
            protoWriter.writeBytes(mixStatusStructV2.unknownFields());
        }
    }

    public MixStatusStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.status = this.status;
        builder.is_collected = this.is_collected;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.status.hashCode()) * 37;
        if (this.is_collected != null) {
            i = this.is_collected.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", status=");
        sb.append(this.status);
        if (this.is_collected != null) {
            sb.append(", is_collected=");
            sb.append(this.is_collected);
        }
        StringBuilder replace = sb.replace(0, 2, "MixStatusStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MixStatusStructV2)) {
            return false;
        }
        MixStatusStructV2 mixStatusStructV2 = (MixStatusStructV2) obj;
        if (!unknownFields().equals(mixStatusStructV2.unknownFields()) || !this.status.equals(mixStatusStructV2.status) || !Internal.equals(this.is_collected, mixStatusStructV2.is_collected)) {
            return false;
        }
        return true;
    }

    public MixStatusStructV2(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public MixStatusStructV2(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = num;
        this.is_collected = num2;
    }
}
