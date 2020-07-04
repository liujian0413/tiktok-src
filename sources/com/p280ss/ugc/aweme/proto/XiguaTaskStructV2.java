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

/* renamed from: com.ss.ugc.aweme.proto.XiguaTaskStructV2 */
public final class XiguaTaskStructV2 extends Message<XiguaTaskStructV2, Builder> {
    public static final ProtoAdapter<XiguaTaskStructV2> ADAPTER = new ProtoAdapter_XiguaTaskStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String desc;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String entrance_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String icon_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean is_xigua_task;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String jump_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public Integer switch_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String title;

    /* renamed from: com.ss.ugc.aweme.proto.XiguaTaskStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<XiguaTaskStructV2, Builder> {
        public String desc;
        public String entrance_url;
        public String icon_url;
        public Boolean is_xigua_task;
        public String jump_url;
        public Integer switch_type;
        public String title;

        public final XiguaTaskStructV2 build() {
            XiguaTaskStructV2 xiguaTaskStructV2 = new XiguaTaskStructV2(this.is_xigua_task, this.jump_url, this.title, this.desc, this.icon_url, this.switch_type, this.entrance_url, super.buildUnknownFields());
            return xiguaTaskStructV2;
        }

        public final Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public final Builder entrance_url(String str) {
            this.entrance_url = str;
            return this;
        }

        public final Builder icon_url(String str) {
            this.icon_url = str;
            return this;
        }

        public final Builder is_xigua_task(Boolean bool) {
            this.is_xigua_task = bool;
            return this;
        }

        public final Builder jump_url(String str) {
            this.jump_url = str;
            return this;
        }

        public final Builder switch_type(Integer num) {
            this.switch_type = num;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.XiguaTaskStructV2$ProtoAdapter_XiguaTaskStructV2 */
    static final class ProtoAdapter_XiguaTaskStructV2 extends ProtoAdapter<XiguaTaskStructV2> {
        public ProtoAdapter_XiguaTaskStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, XiguaTaskStructV2.class);
        }

        public final int encodedSize(XiguaTaskStructV2 xiguaTaskStructV2) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, xiguaTaskStructV2.is_xigua_task) + ProtoAdapter.STRING.encodedSizeWithTag(2, xiguaTaskStructV2.jump_url) + ProtoAdapter.STRING.encodedSizeWithTag(3, xiguaTaskStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(4, xiguaTaskStructV2.desc) + ProtoAdapter.STRING.encodedSizeWithTag(5, xiguaTaskStructV2.icon_url) + ProtoAdapter.INT32.encodedSizeWithTag(6, xiguaTaskStructV2.switch_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, xiguaTaskStructV2.entrance_url) + xiguaTaskStructV2.unknownFields().size();
        }

        public final XiguaTaskStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.is_xigua_task((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.jump_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.icon_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.switch_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.entrance_url((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, XiguaTaskStructV2 xiguaTaskStructV2) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, xiguaTaskStructV2.is_xigua_task);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, xiguaTaskStructV2.jump_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, xiguaTaskStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, xiguaTaskStructV2.desc);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, xiguaTaskStructV2.icon_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, xiguaTaskStructV2.switch_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, xiguaTaskStructV2.entrance_url);
            protoWriter.writeBytes(xiguaTaskStructV2.unknownFields());
        }
    }

    public XiguaTaskStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.is_xigua_task = this.is_xigua_task;
        builder.jump_url = this.jump_url;
        builder.title = this.title;
        builder.desc = this.desc;
        builder.icon_url = this.icon_url;
        builder.switch_type = this.switch_type;
        builder.entrance_url = this.entrance_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i8 = 0;
        if (this.is_xigua_task != null) {
            i = this.is_xigua_task.hashCode();
        } else {
            i = 0;
        }
        int i9 = (hashCode + i) * 37;
        if (this.jump_url != null) {
            i2 = this.jump_url.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 37;
        if (this.title != null) {
            i3 = this.title.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 37;
        if (this.desc != null) {
            i4 = this.desc.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 37;
        if (this.icon_url != null) {
            i5 = this.icon_url.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 37;
        if (this.switch_type != null) {
            i6 = this.switch_type.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 37;
        if (this.entrance_url != null) {
            i8 = this.entrance_url.hashCode();
        }
        int i15 = i14 + i8;
        this.hashCode = i15;
        return i15;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.is_xigua_task != null) {
            sb.append(", is_xigua_task=");
            sb.append(this.is_xigua_task);
        }
        if (this.jump_url != null) {
            sb.append(", jump_url=");
            sb.append(this.jump_url);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.icon_url != null) {
            sb.append(", icon_url=");
            sb.append(this.icon_url);
        }
        if (this.switch_type != null) {
            sb.append(", switch_type=");
            sb.append(this.switch_type);
        }
        if (this.entrance_url != null) {
            sb.append(", entrance_url=");
            sb.append(this.entrance_url);
        }
        StringBuilder replace = sb.replace(0, 2, "XiguaTaskStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof XiguaTaskStructV2)) {
            return false;
        }
        XiguaTaskStructV2 xiguaTaskStructV2 = (XiguaTaskStructV2) obj;
        if (!unknownFields().equals(xiguaTaskStructV2.unknownFields()) || !Internal.equals(this.is_xigua_task, xiguaTaskStructV2.is_xigua_task) || !Internal.equals(this.jump_url, xiguaTaskStructV2.jump_url) || !Internal.equals(this.title, xiguaTaskStructV2.title) || !Internal.equals(this.desc, xiguaTaskStructV2.desc) || !Internal.equals(this.icon_url, xiguaTaskStructV2.icon_url) || !Internal.equals(this.switch_type, xiguaTaskStructV2.switch_type) || !Internal.equals(this.entrance_url, xiguaTaskStructV2.entrance_url)) {
            return false;
        }
        return true;
    }

    public XiguaTaskStructV2(Boolean bool, String str, String str2, String str3, String str4, Integer num, String str5) {
        this(bool, str, str2, str3, str4, num, str5, ByteString.EMPTY);
    }

    public XiguaTaskStructV2(Boolean bool, String str, String str2, String str3, String str4, Integer num, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_xigua_task = bool;
        this.jump_url = str;
        this.title = str2;
        this.desc = str3;
        this.icon_url = str4;
        this.switch_type = num;
        this.entrance_url = str5;
    }
}
