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

/* renamed from: com.ss.ugc.aweme.proto.MicroAppCardStructV2 */
public final class MicroAppCardStructV2 extends Message<MicroAppCardStructV2, Builder> {
    public static final ProtoAdapter<MicroAppCardStructV2> ADAPTER = new ProtoAdapter_MicroAppCardStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String image_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String text;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer wait_time;

    /* renamed from: com.ss.ugc.aweme.proto.MicroAppCardStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<MicroAppCardStructV2, Builder> {
        public String image_url;
        public String text;
        public Integer wait_time;

        public final MicroAppCardStructV2 build() {
            return new MicroAppCardStructV2(this.image_url, this.text, this.wait_time, super.buildUnknownFields());
        }

        public final Builder image_url(String str) {
            this.image_url = str;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }

        public final Builder wait_time(Integer num) {
            this.wait_time = num;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.MicroAppCardStructV2$ProtoAdapter_MicroAppCardStructV2 */
    static final class ProtoAdapter_MicroAppCardStructV2 extends ProtoAdapter<MicroAppCardStructV2> {
        public ProtoAdapter_MicroAppCardStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, MicroAppCardStructV2.class);
        }

        public final int encodedSize(MicroAppCardStructV2 microAppCardStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, microAppCardStructV2.image_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, microAppCardStructV2.text) + ProtoAdapter.INT32.encodedSizeWithTag(3, microAppCardStructV2.wait_time) + microAppCardStructV2.unknownFields().size();
        }

        public final MicroAppCardStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.image_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.wait_time((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, MicroAppCardStructV2 microAppCardStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, microAppCardStructV2.image_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, microAppCardStructV2.text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, microAppCardStructV2.wait_time);
            protoWriter.writeBytes(microAppCardStructV2.unknownFields());
        }
    }

    public MicroAppCardStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.image_url = this.image_url;
        builder.text = this.text;
        builder.wait_time = this.wait_time;
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
        if (this.image_url != null) {
            i = this.image_url.hashCode();
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
        if (this.wait_time != null) {
            i4 = this.wait_time.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.wait_time != null) {
            sb.append(", wait_time=");
            sb.append(this.wait_time);
        }
        StringBuilder replace = sb.replace(0, 2, "MicroAppCardStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MicroAppCardStructV2)) {
            return false;
        }
        MicroAppCardStructV2 microAppCardStructV2 = (MicroAppCardStructV2) obj;
        if (!unknownFields().equals(microAppCardStructV2.unknownFields()) || !Internal.equals(this.image_url, microAppCardStructV2.image_url) || !Internal.equals(this.text, microAppCardStructV2.text) || !Internal.equals(this.wait_time, microAppCardStructV2.wait_time)) {
            return false;
        }
        return true;
    }

    public MicroAppCardStructV2(String str, String str2, Integer num) {
        this(str, str2, num, ByteString.EMPTY);
    }

    public MicroAppCardStructV2(String str, String str2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_url = str;
        this.text = str2;
        this.wait_time = num;
    }
}
