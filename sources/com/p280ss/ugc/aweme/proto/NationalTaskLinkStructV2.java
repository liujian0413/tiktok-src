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
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.NationalTaskLinkStructV2 */
public final class NationalTaskLinkStructV2 extends Message<NationalTaskLinkStructV2, Builder> {
    public static final ProtoAdapter<NationalTaskLinkStructV2> ADAPTER = new ProtoAdapter_NationalTaskLinkStructV2();
    @WireField(adapter = "com.ss.ugc.aweme.proto.UrlStructV2#ADAPTER", label = Label.REQUIRED, tag = 4)
    public UrlStructV2 avatar_icon;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REQUIRED, tag = 1)

    /* renamed from: id */
    public String f118746id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public String open_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REQUIRED, tag = 3)
    public String sub_title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REQUIRED, tag = 2)
    public String title;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String web_url;

    /* renamed from: com.ss.ugc.aweme.proto.NationalTaskLinkStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<NationalTaskLinkStructV2, Builder> {
        public UrlStructV2 avatar_icon;

        /* renamed from: id */
        public String f118747id;
        public String open_url;
        public String sub_title;
        public String title;
        public String web_url;

        public final NationalTaskLinkStructV2 build() {
            if (this.f118747id == null || this.title == null || this.sub_title == null || this.avatar_icon == null) {
                throw Internal.missingRequiredFields(this.f118747id, "id", this.title, "title", this.sub_title, "sub_title", this.avatar_icon, "avatar_icon");
            }
            NationalTaskLinkStructV2 nationalTaskLinkStructV2 = new NationalTaskLinkStructV2(this.f118747id, this.title, this.sub_title, this.avatar_icon, this.web_url, this.open_url, super.buildUnknownFields());
            return nationalTaskLinkStructV2;
        }

        public final Builder avatar_icon(UrlStructV2 urlStructV2) {
            this.avatar_icon = urlStructV2;
            return this;
        }

        /* renamed from: id */
        public final Builder mo113345id(String str) {
            this.f118747id = str;
            return this;
        }

        public final Builder open_url(String str) {
            this.open_url = str;
            return this;
        }

        public final Builder sub_title(String str) {
            this.sub_title = str;
            return this;
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

    /* renamed from: com.ss.ugc.aweme.proto.NationalTaskLinkStructV2$ProtoAdapter_NationalTaskLinkStructV2 */
    static final class ProtoAdapter_NationalTaskLinkStructV2 extends ProtoAdapter<NationalTaskLinkStructV2> {
        public ProtoAdapter_NationalTaskLinkStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, NationalTaskLinkStructV2.class);
        }

        public final int encodedSize(NationalTaskLinkStructV2 nationalTaskLinkStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, nationalTaskLinkStructV2.f118746id) + ProtoAdapter.STRING.encodedSizeWithTag(2, nationalTaskLinkStructV2.title) + ProtoAdapter.STRING.encodedSizeWithTag(3, nationalTaskLinkStructV2.sub_title) + UrlStructV2.ADAPTER.encodedSizeWithTag(4, nationalTaskLinkStructV2.avatar_icon) + ProtoAdapter.STRING.encodedSizeWithTag(5, nationalTaskLinkStructV2.web_url) + ProtoAdapter.STRING.encodedSizeWithTag(6, nationalTaskLinkStructV2.open_url) + nationalTaskLinkStructV2.unknownFields().size();
        }

        public final NationalTaskLinkStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.mo113345id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.sub_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.avatar_icon((UrlStructV2) UrlStructV2.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            builder.web_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
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

        public final void encode(ProtoWriter protoWriter, NationalTaskLinkStructV2 nationalTaskLinkStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, nationalTaskLinkStructV2.f118746id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, nationalTaskLinkStructV2.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, nationalTaskLinkStructV2.sub_title);
            UrlStructV2.ADAPTER.encodeWithTag(protoWriter, 4, nationalTaskLinkStructV2.avatar_icon);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, nationalTaskLinkStructV2.web_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, nationalTaskLinkStructV2.open_url);
            protoWriter.writeBytes(nationalTaskLinkStructV2.unknownFields());
        }
    }

    public NationalTaskLinkStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.f118747id = this.f118746id;
        builder.title = this.title;
        builder.sub_title = this.sub_title;
        builder.avatar_icon = this.avatar_icon;
        builder.web_url = this.web_url;
        builder.open_url = this.open_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((((((((unknownFields().hashCode() * 37) + this.f118746id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.sub_title.hashCode()) * 37) + this.avatar_icon.hashCode()) * 37;
        int i3 = 0;
        if (this.web_url != null) {
            i = this.web_url.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.open_url != null) {
            i3 = this.open_url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.f118746id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", sub_title=");
        sb.append(this.sub_title);
        sb.append(", avatar_icon=");
        sb.append(this.avatar_icon);
        if (this.web_url != null) {
            sb.append(", web_url=");
            sb.append(this.web_url);
        }
        if (this.open_url != null) {
            sb.append(", open_url=");
            sb.append(this.open_url);
        }
        StringBuilder replace = sb.replace(0, 2, "NationalTaskLinkStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NationalTaskLinkStructV2)) {
            return false;
        }
        NationalTaskLinkStructV2 nationalTaskLinkStructV2 = (NationalTaskLinkStructV2) obj;
        if (!unknownFields().equals(nationalTaskLinkStructV2.unknownFields()) || !this.f118746id.equals(nationalTaskLinkStructV2.f118746id) || !this.title.equals(nationalTaskLinkStructV2.title) || !this.sub_title.equals(nationalTaskLinkStructV2.sub_title) || !this.avatar_icon.equals(nationalTaskLinkStructV2.avatar_icon) || !Internal.equals(this.web_url, nationalTaskLinkStructV2.web_url) || !Internal.equals(this.open_url, nationalTaskLinkStructV2.open_url)) {
            return false;
        }
        return true;
    }

    public NationalTaskLinkStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, String str4, String str5) {
        this(str, str2, str3, urlStructV2, str4, str5, ByteString.EMPTY);
    }

    public NationalTaskLinkStructV2(String str, String str2, String str3, UrlStructV2 urlStructV2, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.f118746id = str;
        this.title = str2;
        this.sub_title = str3;
        this.avatar_icon = urlStructV2;
        this.web_url = str4;
        this.open_url = str5;
    }
}
