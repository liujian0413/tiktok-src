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

/* renamed from: com.ss.ugc.aweme.proto.CommerceStickerUnlockStructV2 */
public final class CommerceStickerUnlockStructV2 extends Message<CommerceStickerUnlockStructV2, Builder> {
    public static final ProtoAdapter<CommerceStickerUnlockStructV2> ADAPTER = new ProtoAdapter_CommerceStickerUnlockStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String web_url;

    /* renamed from: com.ss.ugc.aweme.proto.CommerceStickerUnlockStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<CommerceStickerUnlockStructV2, Builder> {
        public String desc;
        public String open_url;
        public String web_url;

        public final CommerceStickerUnlockStructV2 build() {
            return new CommerceStickerUnlockStructV2(this.desc, this.web_url, this.open_url, super.buildUnknownFields());
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder web_url(String str) {
            this.web_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.CommerceStickerUnlockStructV2$ProtoAdapter_CommerceStickerUnlockStructV2 */
    static final class ProtoAdapter_CommerceStickerUnlockStructV2 extends ProtoAdapter<CommerceStickerUnlockStructV2> {
        public ProtoAdapter_CommerceStickerUnlockStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, CommerceStickerUnlockStructV2.class);
        }

        public final int encodedSize(CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, commerceStickerUnlockStructV2.desc) + ProtoAdapter.STRING.encodedSizeWithTag(2, commerceStickerUnlockStructV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, commerceStickerUnlockStructV2.open_url) + commerceStickerUnlockStructV2.unknownFields().size();
        }

        public final CommerceStickerUnlockStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.open_url((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, commerceStickerUnlockStructV2.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, commerceStickerUnlockStructV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, commerceStickerUnlockStructV2.open_url);
            protoWriter.writeBytes(commerceStickerUnlockStructV2.unknownFields());
        }
    }

    public CommerceStickerUnlockStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.desc = this.desc;
        builder.web_url = this.web_url;
        builder.open_url = this.open_url;
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
        if (this.desc != null) {
            i = this.desc.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.web_url != null) {
            i2 = this.web_url.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.open_url != null) {
            i4 = this.open_url.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.web_url != null) {
            sb.append(", web_url=");
            sb.append(this.web_url);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        StringBuilder replace = sb.replace(0, 2, "CommerceStickerUnlockStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceStickerUnlockStructV2)) {
            return false;
        }
        CommerceStickerUnlockStructV2 commerceStickerUnlockStructV2 = (CommerceStickerUnlockStructV2) obj;
        if (!unknownFields().equals(commerceStickerUnlockStructV2.unknownFields()) || !Internal.equals(this.desc, commerceStickerUnlockStructV2.desc) || !Internal.equals(this.web_url, commerceStickerUnlockStructV2.web_url) || !Internal.equals(this.open_url, commerceStickerUnlockStructV2.open_url)) {
            return false;
        }
        return true;
    }

    public CommerceStickerUnlockStructV2(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public CommerceStickerUnlockStructV2(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.desc = str;
        this.web_url = str2;
        this.open_url = str3;
    }
}
