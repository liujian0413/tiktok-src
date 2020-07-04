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

/* renamed from: com.ss.ugc.aweme.proto.AnchorWikipediaStructV2 */
public final class AnchorWikipediaStructV2 extends Message<AnchorWikipediaStructV2, Builder> {
    public static final ProtoAdapter<AnchorWikipediaStructV2> ADAPTER = new ProtoAdapter_AnchorWikipediaStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String keyword;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String lang;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String url;

    /* renamed from: com.ss.ugc.aweme.proto.AnchorWikipediaStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AnchorWikipediaStructV2, Builder> {
        public String keyword;
        public String lang;
        public String url;

        public final AnchorWikipediaStructV2 build() {
            return new AnchorWikipediaStructV2(this.keyword, this.lang, this.url, super.buildUnknownFields());
        }

        public final Builder keyword(String str) {
            this.keyword = str;
            return this;
        }

        public final Builder lang(String str) {
            this.lang = str;
            return this;
        }

        public final Builder url(String str) {
            this.url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AnchorWikipediaStructV2$ProtoAdapter_AnchorWikipediaStructV2 */
    static final class ProtoAdapter_AnchorWikipediaStructV2 extends ProtoAdapter<AnchorWikipediaStructV2> {
        public ProtoAdapter_AnchorWikipediaStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AnchorWikipediaStructV2.class);
        }

        public final int encodedSize(AnchorWikipediaStructV2 anchorWikipediaStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, anchorWikipediaStructV2.keyword) + ProtoAdapter.STRING.encodedSizeWithTag(2, anchorWikipediaStructV2.lang) + ProtoAdapter.STRING.encodedSizeWithTag(3, anchorWikipediaStructV2.url) + anchorWikipediaStructV2.unknownFields().size();
        }

        public final AnchorWikipediaStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.keyword((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.lang((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
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

        public final void encode(ProtoWriter protoWriter, AnchorWikipediaStructV2 anchorWikipediaStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, anchorWikipediaStructV2.keyword);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, anchorWikipediaStructV2.lang);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, anchorWikipediaStructV2.url);
            protoWriter.writeBytes(anchorWikipediaStructV2.unknownFields());
        }
    }

    public AnchorWikipediaStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.keyword = this.keyword;
        builder.lang = this.lang;
        builder.url = this.url;
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
        if (this.keyword != null) {
            i = this.keyword.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.lang != null) {
            i2 = this.lang.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.url != null) {
            i4 = this.url.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.lang != null) {
            sb.append(", lang=");
            sb.append(this.lang);
        }
        if (this.url != null) {
            sb.append(", url=");
            sb.append(this.url);
        }
        StringBuilder replace = sb.replace(0, 2, "AnchorWikipediaStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnchorWikipediaStructV2)) {
            return false;
        }
        AnchorWikipediaStructV2 anchorWikipediaStructV2 = (AnchorWikipediaStructV2) obj;
        if (!unknownFields().equals(anchorWikipediaStructV2.unknownFields()) || !Internal.equals(this.keyword, anchorWikipediaStructV2.keyword) || !Internal.equals(this.lang, anchorWikipediaStructV2.lang) || !Internal.equals(this.url, anchorWikipediaStructV2.url)) {
            return false;
        }
        return true;
    }

    public AnchorWikipediaStructV2(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public AnchorWikipediaStructV2(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keyword = str;
        this.lang = str2;
        this.url = str3;
    }
}
