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

/* renamed from: com.ss.ugc.aweme.proto.AwemeFloatingCardStructV2 */
public final class AwemeFloatingCardStructV2 extends Message<AwemeFloatingCardStructV2, Builder> {
    public static final ProtoAdapter<AwemeFloatingCardStructV2> ADAPTER = new ProtoAdapter_AwemeFloatingCardStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", tag = 7)
    public UrlStructV2 button_bg;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String button_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String description;
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = Label.REPEATED, tag = 3)
    public List<UrlStructV2> icons;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String schema;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String schema_desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String title;

    /* renamed from: com.ss.ugc.aweme.proto.AwemeFloatingCardStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<AwemeFloatingCardStructV2, Builder> {
        public UrlStructV2 button_bg;
        public String button_desc;
        public String description;
        public List<UrlStructV2> icons = Internal.newMutableList();
        public String schema;
        public String schema_desc;
        public String title;

        public final AwemeFloatingCardStructV2 build() {
            AwemeFloatingCardStructV2 awemeFloatingCardStructV2 = new AwemeFloatingCardStructV2(this.schema, this.schema_desc, this.icons, this.title, this.description, this.button_desc, this.button_bg, super.buildUnknownFields());
            return awemeFloatingCardStructV2;
        }

        public final Builder button_bg(UrlStructV2 urlStructV2) {
            this.button_bg = urlStructV2;
            return this;
        }

        public final Builder button_desc(String str) {
            this.button_desc = str;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder schema(String str) {
            this.schema = str;
            return this;
        }

        public final Builder schema_desc(String str) {
            this.schema_desc = str;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }

        public final Builder icons(List<UrlStructV2> list) {
            Internal.checkElementsNotNull(list);
            this.icons = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.AwemeFloatingCardStructV2$ProtoAdapter_AwemeFloatingCardStructV2 */
    static final class ProtoAdapter_AwemeFloatingCardStructV2 extends ProtoAdapter<AwemeFloatingCardStructV2> {
        public ProtoAdapter_AwemeFloatingCardStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, AwemeFloatingCardStructV2.class);
        }

        public final int encodedSize(AwemeFloatingCardStructV2 awemeFloatingCardStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, awemeFloatingCardStructV2.schema) + ProtoAdapter.STRING.encodedSizeWithTag(2, awemeFloatingCardStructV2.schema_desc) + UrlStructV2.ADAPTER.asRepeated().encodedSizeWithTag(3, awemeFloatingCardStructV2.icons) + ProtoAdapter.STRING.encodedSizeWithTag(4, awemeFloatingCardStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(5, awemeFloatingCardStructV2.description) + ProtoAdapter.STRING.encodedSizeWithTag(6, awemeFloatingCardStructV2.button_desc) + UrlStructV2.ADAPTER.encodedSizeWithTag(7, awemeFloatingCardStructV2.button_bg) + awemeFloatingCardStructV2.unknownFields().size();
        }

        public final AwemeFloatingCardStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.schema((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.schema_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.icons.add(UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.description((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.button_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.button_bg((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, AwemeFloatingCardStructV2 awemeFloatingCardStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, awemeFloatingCardStructV2.schema);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, awemeFloatingCardStructV2.schema_desc);
            UrlStructV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, awemeFloatingCardStructV2.icons);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, awemeFloatingCardStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, awemeFloatingCardStructV2.description);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, awemeFloatingCardStructV2.button_desc);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 7, awemeFloatingCardStructV2.button_bg);
            protoWriter.writeBytes(awemeFloatingCardStructV2.unknownFields());
        }
    }

    public AwemeFloatingCardStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.schema = this.schema;
        builder.schema_desc = this.schema_desc;
        builder.icons = Internal.copyOf("icons", this.icons);
        builder.title = this.title;
        builder.description = this.description;
        builder.button_desc = this.button_desc;
        builder.button_bg = this.button_bg;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.schema != null) {
            i = this.schema.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.schema_desc != null) {
            i2 = this.schema_desc.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode2 = (((i8 + i2) * 37) + this.icons.hashCode()) * 37;
        if (this.title != null) {
            i3 = this.title.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (hashCode2 + i3) * 37;
        if (this.description != null) {
            i4 = this.description.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.button_desc != null) {
            i5 = this.button_desc.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 37;
        if (this.button_bg != null) {
            i7 = this.button_bg.hashCode();
        }
        int i12 = i11 + i7;
        this.hashCode = i12;
        return i12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.schema_desc != null) {
            sb.append(", schema_desc=");
            sb.append(this.schema_desc);
        }
        if (!this.icons.isEmpty()) {
            sb.append(", icons=");
            sb.append(this.icons);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.button_desc != null) {
            sb.append(", button_desc=");
            sb.append(this.button_desc);
        }
        if (this.button_bg != null) {
            sb.append(", button_bg=");
            sb.append(this.button_bg);
        }
        StringBuilder replace = sb.replace(0, 2, "AwemeFloatingCardStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AwemeFloatingCardStructV2)) {
            return false;
        }
        AwemeFloatingCardStructV2 awemeFloatingCardStructV2 = (AwemeFloatingCardStructV2) obj;
        if (!unknownFields().equals(awemeFloatingCardStructV2.unknownFields()) || !Internal.equals(this.schema, awemeFloatingCardStructV2.schema) || !Internal.equals(this.schema_desc, awemeFloatingCardStructV2.schema_desc) || !this.icons.equals(awemeFloatingCardStructV2.icons) || !Internal.equals(this.title, awemeFloatingCardStructV2.title) || !Internal.equals(this.description, awemeFloatingCardStructV2.description) || !Internal.equals(this.button_desc, awemeFloatingCardStructV2.button_desc) || !Internal.equals(this.button_bg, awemeFloatingCardStructV2.button_bg)) {
            return false;
        }
        return true;
    }

    public AwemeFloatingCardStructV2(String str, String str2, List<UrlStructV2> list, String str3, String str4, String str5, UrlStructV2 urlStructV2) {
        this(str, str2, list, str3, str4, str5, urlStructV2, ByteString.EMPTY);
    }

    public AwemeFloatingCardStructV2(String str, String str2, List<UrlStructV2> list, String str3, String str4, String str5, UrlStructV2 urlStructV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.schema = str;
        this.schema_desc = str2;
        this.icons = Internal.immutableCopyOf("icons", list);
        this.title = str3;
        this.description = str4;
        this.button_desc = str5;
        this.button_bg = urlStructV2;
    }
}
