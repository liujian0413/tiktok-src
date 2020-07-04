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

/* renamed from: com.ss.ugc.aweme.proto.AdCoverTitleV2 */
public final class AdCoverTitleV2 extends Message<AdCoverTitleV2, Builder> {
    public static final ProtoAdapter<AdCoverTitleV2> ADAPTER = new ProtoAdapter_AdCoverTitleV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String web_url;

    /* renamed from: com.ss.ugc.aweme.proto.AdCoverTitleV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AdCoverTitleV2, Builder> {
        public String title;
        public String web_url;

        public final AdCoverTitleV2 build() {
            return new AdCoverTitleV2(this.title, this.web_url, super.buildUnknownFields());
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AdCoverTitleV2$ProtoAdapter_AdCoverTitleV2 */
    static final class ProtoAdapter_AdCoverTitleV2 extends ProtoAdapter<AdCoverTitleV2> {
        public ProtoAdapter_AdCoverTitleV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AdCoverTitleV2.class);
        }

        public final int encodedSize(AdCoverTitleV2 adCoverTitleV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, adCoverTitleV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(2, adCoverTitleV2.web_url) + adCoverTitleV2.unknownFields().size();
        }

        public final AdCoverTitleV2 decode(ProtoReader protoReader) throws IOException {
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
                            builder.web_url((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AdCoverTitleV2 adCoverTitleV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, adCoverTitleV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, adCoverTitleV2.web_url);
            protoWriter.writeBytes(adCoverTitleV2.unknownFields());
        }
    }

    public AdCoverTitleV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.web_url = this.web_url;
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
        if (this.web_url != null) {
            i3 = this.web_url.hashCode();
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
        if (this.web_url != null) {
            sb.append(", web_url=");
            sb.append(this.web_url);
        }
        StringBuilder replace = sb.replace(0, 2, "AdCoverTitleV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdCoverTitleV2)) {
            return false;
        }
        AdCoverTitleV2 adCoverTitleV2 = (AdCoverTitleV2) obj;
        if (!unknownFields().equals(adCoverTitleV2.unknownFields()) || !Internal.equals(this.title, adCoverTitleV2.title) || !Internal.equals(this.web_url, adCoverTitleV2.web_url)) {
            return false;
        }
        return true;
    }

    public AdCoverTitleV2(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public AdCoverTitleV2(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.web_url = str2;
    }
}
