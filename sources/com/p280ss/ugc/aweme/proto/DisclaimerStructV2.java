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

/* renamed from: com.ss.ugc.aweme.proto.DisclaimerStructV2 */
public final class DisclaimerStructV2 extends Message<DisclaimerStructV2, Builder> {
    public static final ProtoAdapter<DisclaimerStructV2> ADAPTER = new ProtoAdapter_DisclaimerStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String content;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;

    /* renamed from: com.ss.ugc.aweme.proto.DisclaimerStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DisclaimerStructV2, Builder> {
        public String content;
        public String title;

        public final DisclaimerStructV2 build() {
            return new DisclaimerStructV2(this.title, this.content, super.buildUnknownFields());
        }

        public final Builder content(String str) {
            this.content = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.DisclaimerStructV2$ProtoAdapter_DisclaimerStructV2 */
    static final class ProtoAdapter_DisclaimerStructV2 extends ProtoAdapter<DisclaimerStructV2> {
        public ProtoAdapter_DisclaimerStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DisclaimerStructV2.class);
        }

        public final int encodedSize(DisclaimerStructV2 disclaimerStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, disclaimerStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, disclaimerStructV2.content) + disclaimerStructV2.unknownFields().size();
        }

        public final DisclaimerStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.content((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DisclaimerStructV2 disclaimerStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, disclaimerStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, disclaimerStructV2.content);
            protoWriter.writeBytes(disclaimerStructV2.unknownFields());
        }
    }

    public DisclaimerStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.content = this.content;
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
        if (this.title != null) {
            i = this.title.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.content != null) {
            i3 = this.content.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        StringBuilder replace = sb.replace(0, 2, "DisclaimerStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisclaimerStructV2)) {
            return false;
        }
        DisclaimerStructV2 disclaimerStructV2 = (DisclaimerStructV2) obj;
        if (!unknownFields().equals(disclaimerStructV2.unknownFields()) || !Internal.equals(this.title, disclaimerStructV2.title) || !Internal.equals(this.content, disclaimerStructV2.content)) {
            return false;
        }
        return true;
    }

    public DisclaimerStructV2(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public DisclaimerStructV2(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.content = str2;
    }
}
