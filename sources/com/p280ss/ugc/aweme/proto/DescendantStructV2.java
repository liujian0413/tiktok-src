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
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.DescendantStructV2 */
public final class DescendantStructV2 extends Message<DescendantStructV2, Builder> {
    public static final ProtoAdapter<DescendantStructV2> ADAPTER = new ProtoAdapter_DescendantStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String notify_msg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 1)
    public List<String> platforms;

    /* renamed from: com.ss.ugc.aweme.proto.DescendantStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DescendantStructV2, Builder> {
        public String notify_msg;
        public List<String> platforms = Internal.newMutableList();

        public final DescendantStructV2 build() {
            return new DescendantStructV2(this.platforms, this.notify_msg, super.buildUnknownFields());
        }

        public final Builder notify_msg(String str) {
            this.notify_msg = str;
            return this;
        }

        public final Builder platforms(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.platforms = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.DescendantStructV2$ProtoAdapter_DescendantStructV2 */
    static final class ProtoAdapter_DescendantStructV2 extends ProtoAdapter<DescendantStructV2> {
        public ProtoAdapter_DescendantStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, DescendantStructV2.class);
        }

        public final int encodedSize(DescendantStructV2 descendantStructV2) {
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, descendantStructV2.platforms) + ProtoAdapter.STRING.encodedSizeWithTag(2, descendantStructV2.notify_msg) + descendantStructV2.unknownFields().size();
        }

        public final DescendantStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.platforms.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.notify_msg((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, DescendantStructV2 descendantStructV2) throws IOException {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, descendantStructV2.platforms);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, descendantStructV2.notify_msg);
            protoWriter.writeBytes(descendantStructV2.unknownFields());
        }
    }

    public DescendantStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.platforms = Internal.copyOf("platforms", this.platforms);
        builder.notify_msg = this.notify_msg;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.platforms.hashCode()) * 37;
        if (this.notify_msg != null) {
            i = this.notify_msg.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.platforms.isEmpty()) {
            sb.append(", platforms=");
            sb.append(this.platforms);
        }
        if (this.notify_msg != null) {
            sb.append(", notify_msg=");
            sb.append(this.notify_msg);
        }
        StringBuilder replace = sb.replace(0, 2, "DescendantStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DescendantStructV2)) {
            return false;
        }
        DescendantStructV2 descendantStructV2 = (DescendantStructV2) obj;
        if (!unknownFields().equals(descendantStructV2.unknownFields()) || !this.platforms.equals(descendantStructV2.platforms) || !Internal.equals(this.notify_msg, descendantStructV2.notify_msg)) {
            return false;
        }
        return true;
    }

    public DescendantStructV2(List<String> list, String str) {
        this(list, str, ByteString.EMPTY);
    }

    public DescendantStructV2(List<String> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.platforms = Internal.immutableCopyOf("platforms", list);
        this.notify_msg = str;
    }
}
