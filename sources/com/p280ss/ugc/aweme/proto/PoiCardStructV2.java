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

/* renamed from: com.ss.ugc.aweme.proto.PoiCardStructV2 */
public final class PoiCardStructV2 extends Message<PoiCardStructV2, Builder> {
    public static final ProtoAdapter<PoiCardStructV2> ADAPTER = new ProtoAdapter_PoiCardStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer is_show;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String url;

    /* renamed from: com.ss.ugc.aweme.proto.PoiCardStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<PoiCardStructV2, Builder> {
        public Integer is_show;
        public String url;

        public final PoiCardStructV2 build() {
            return new PoiCardStructV2(this.is_show, this.url, super.buildUnknownFields());
        }

        public final Builder is_show(Integer num) {
            this.is_show = num;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.PoiCardStructV2$ProtoAdapter_PoiCardStructV2 */
    static final class ProtoAdapter_PoiCardStructV2 extends ProtoAdapter<PoiCardStructV2> {
        public ProtoAdapter_PoiCardStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, PoiCardStructV2.class);
        }

        public final int encodedSize(PoiCardStructV2 poiCardStructV2) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, poiCardStructV2.is_show) + ProtoAdapter.STRING.encodedSizeWithTag(2, poiCardStructV2.url) + poiCardStructV2.unknownFields().size();
        }

        public final PoiCardStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.is_show((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.url((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, PoiCardStructV2 poiCardStructV2) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, poiCardStructV2.is_show);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, poiCardStructV2.url);
            protoWriter.writeBytes(poiCardStructV2.unknownFields());
        }
    }

    public PoiCardStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.is_show = this.is_show;
        builder.url = this.url;
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
        if (this.is_show != null) {
            i = this.is_show.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.url != null) {
            i3 = this.url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_show != null) {
            sb.append(", is_show=");
            sb.append(this.is_show);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "PoiCardStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PoiCardStructV2)) {
            return false;
        }
        PoiCardStructV2 poiCardStructV2 = (PoiCardStructV2) obj;
        if (!unknownFields().equals(poiCardStructV2.unknownFields()) || !Internal.equals(this.is_show, poiCardStructV2.is_show) || !Internal.equals(this.url, poiCardStructV2.url)) {
            return false;
        }
        return true;
    }

    public PoiCardStructV2(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public PoiCardStructV2(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_show = num;
        this.url = str;
    }
}
