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

/* renamed from: com.ss.ugc.aweme.proto.AvatarDecorationStructV2 */
public final class AvatarDecorationStructV2 extends Message<AvatarDecorationStructV2, Builder> {
    public static final ProtoAdapter<AvatarDecorationStructV2> ADAPTER = new ProtoAdapter_AvatarDecorationStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)

    /* renamed from: id */
    public Long f118736id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String name;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 3)
    public UrlStructV2 source_url;

    /* renamed from: com.ss.ugc.aweme.proto.AvatarDecorationStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AvatarDecorationStructV2, Builder> {

        /* renamed from: id */
        public Long f118737id;
        public String name;
        public UrlStructV2 source_url;

        public final AvatarDecorationStructV2 build() {
            return new AvatarDecorationStructV2(this.f118737id, this.name, this.source_url, super.buildUnknownFields());
        }

        /* renamed from: id */
        public final Builder mo112558id(Long l) {
            this.f118737id = l;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder source_url(UrlStructV2 urlStructV2) {
            this.source_url = urlStructV2;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AvatarDecorationStructV2$ProtoAdapter_AvatarDecorationStructV2 */
    static final class ProtoAdapter_AvatarDecorationStructV2 extends ProtoAdapter<AvatarDecorationStructV2> {
        public ProtoAdapter_AvatarDecorationStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AvatarDecorationStructV2.class);
        }

        public final int encodedSize(AvatarDecorationStructV2 avatarDecorationStructV2) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, avatarDecorationStructV2.f118736id) + ProtoAdapter.STRING.encodedSizeWithTag(2, avatarDecorationStructV2.name) + UrlStructV2.ADAPTER.encodedSizeWithTag(3, avatarDecorationStructV2.source_url) + avatarDecorationStructV2.unknownFields().size();
        }

        public final AvatarDecorationStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mo112558id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.source_url((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AvatarDecorationStructV2 avatarDecorationStructV2) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, avatarDecorationStructV2.f118736id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, avatarDecorationStructV2.name);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 3, avatarDecorationStructV2.source_url);
            protoWriter.writeBytes(avatarDecorationStructV2.unknownFields());
        }
    }

    public AvatarDecorationStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f118737id = this.f118736id;
        builder.name = this.name;
        builder.source_url = this.source_url;
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
        if (this.f118736id != null) {
            i = this.f118736id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.name != null) {
            i2 = this.name.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.source_url != null) {
            i4 = this.source_url.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f118736id != null) {
            sb.append(", id=");
            sb.append(this.f118736id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.source_url != null) {
            sb.append(", source_url=");
            sb.append(this.source_url);
        }
        StringBuilder replace = sb.replace(0, 2, "AvatarDecorationStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvatarDecorationStructV2)) {
            return false;
        }
        AvatarDecorationStructV2 avatarDecorationStructV2 = (AvatarDecorationStructV2) obj;
        if (!unknownFields().equals(avatarDecorationStructV2.unknownFields()) || !Internal.equals(this.f118736id, avatarDecorationStructV2.f118736id) || !Internal.equals(this.name, avatarDecorationStructV2.name) || !Internal.equals(this.source_url, avatarDecorationStructV2.source_url)) {
            return false;
        }
        return true;
    }

    public AvatarDecorationStructV2(Long l, String str, UrlStructV2 urlStructV2) {
        this(l, str, urlStructV2, ByteString.EMPTY);
    }

    public AvatarDecorationStructV2(Long l, String str, UrlStructV2 urlStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f118736id = l;
        this.name = str;
        this.source_url = urlStructV2;
    }
}
