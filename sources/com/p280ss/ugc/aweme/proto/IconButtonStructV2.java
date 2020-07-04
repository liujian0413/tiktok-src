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

/* renamed from: com.ss.ugc.aweme.proto.IconButtonStructV2 */
public final class IconButtonStructV2 extends Message<IconButtonStructV2, Builder> {
    public static final ProtoAdapter<IconButtonStructV2> ADAPTER = new ProtoAdapter_IconButtonStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String action;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 2)
    public UrlStructV2 icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String text;

    /* renamed from: com.ss.ugc.aweme.proto.IconButtonStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<IconButtonStructV2, Builder> {
        public String action;
        public UrlStructV2 icon;
        public String text;

        public final IconButtonStructV2 build() {
            return new IconButtonStructV2(this.text, this.icon, this.action, super.buildUnknownFields());
        }

        public final Builder action(String str) {
            this.action = str;
            return this;
        }

        public final Builder icon(UrlStructV2 urlStructV2) {
            this.icon = urlStructV2;
            return this;
        }

        public final Builder text(String str) {
            this.text = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.IconButtonStructV2$ProtoAdapter_IconButtonStructV2 */
    static final class ProtoAdapter_IconButtonStructV2 extends ProtoAdapter<IconButtonStructV2> {
        public ProtoAdapter_IconButtonStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, IconButtonStructV2.class);
        }

        public final int encodedSize(IconButtonStructV2 iconButtonStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, iconButtonStructV2.text) + UrlStructV2.ADAPTER.encodedSizeWithTag(2, iconButtonStructV2.icon) + ProtoAdapter.STRING.encodedSizeWithTag(3, iconButtonStructV2.action) + iconButtonStructV2.unknownFields().size();
        }

        public final IconButtonStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.icon((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            builder.action((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, IconButtonStructV2 iconButtonStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, iconButtonStructV2.text);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 2, iconButtonStructV2.icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, iconButtonStructV2.action);
            protoWriter.writeBytes(iconButtonStructV2.unknownFields());
        }
    }

    public IconButtonStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.icon = this.icon;
        builder.action = this.action;
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
        if (this.text != null) {
            i = this.text.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.icon != null) {
            i2 = this.icon.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.action != null) {
            i4 = this.action.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.action != null) {
            sb.append(", action=");
            sb.append(this.action);
        }
        StringBuilder replace = sb.replace(0, 2, "IconButtonStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IconButtonStructV2)) {
            return false;
        }
        IconButtonStructV2 iconButtonStructV2 = (IconButtonStructV2) obj;
        if (!unknownFields().equals(iconButtonStructV2.unknownFields()) || !Internal.equals(this.text, iconButtonStructV2.text) || !Internal.equals(this.icon, iconButtonStructV2.icon) || !Internal.equals(this.action, iconButtonStructV2.action)) {
            return false;
        }
        return true;
    }

    public IconButtonStructV2(String str, UrlStructV2 urlStructV2, String str2) {
        this(str, urlStructV2, str2, ByteString.EMPTY);
    }

    public IconButtonStructV2(String str, UrlStructV2 urlStructV2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.icon = urlStructV2;
        this.action = str2;
    }
}
