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

/* renamed from: com.ss.ugc.aweme.proto.EffectArtistStructV2 */
public final class EffectArtistStructV2 extends Message<EffectArtistStructV2, Builder> {
    public static final ProtoAdapter<EffectArtistStructV2> ADAPTER = new ProtoAdapter_EffectArtistStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer total;

    /* renamed from: com.ss.ugc.aweme.proto.EffectArtistStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<EffectArtistStructV2, Builder> {
        public Integer total;

        public final EffectArtistStructV2 build() {
            return new EffectArtistStructV2(this.total, super.buildUnknownFields());
        }

        public final Builder total(Integer num) {
            this.total = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.EffectArtistStructV2$ProtoAdapter_EffectArtistStructV2 */
    static final class ProtoAdapter_EffectArtistStructV2 extends ProtoAdapter<EffectArtistStructV2> {
        public ProtoAdapter_EffectArtistStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, EffectArtistStructV2.class);
        }

        public final int encodedSize(EffectArtistStructV2 effectArtistStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, effectArtistStructV2.total) + effectArtistStructV2.unknownFields().size();
        }

        public final EffectArtistStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.total((Integer) ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, EffectArtistStructV2 effectArtistStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, effectArtistStructV2.total);
            protoWriter.writeBytes(effectArtistStructV2.unknownFields());
        }
    }

    public EffectArtistStructV2() {
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.total != null) {
            i = this.total.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.total = this.total;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total != null) {
            sb.append(", total=");
            sb.append(this.total);
        }
        StringBuilder replace = sb.replace(0, 2, "EffectArtistStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public EffectArtistStructV2(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EffectArtistStructV2)) {
            return false;
        }
        EffectArtistStructV2 effectArtistStructV2 = (EffectArtistStructV2) obj;
        if (!unknownFields().equals(effectArtistStructV2.unknownFields()) || !Internal.equals(this.total, effectArtistStructV2.total)) {
            return false;
        }
        return true;
    }

    public EffectArtistStructV2(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total = num;
    }
}
