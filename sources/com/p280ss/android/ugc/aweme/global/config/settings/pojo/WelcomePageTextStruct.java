package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct */
public final class WelcomePageTextStruct extends Message<WelcomePageTextStruct, Builder> {
    public static final DefaultValueProtoAdapter<WelcomePageTextStruct> ADAPTER = new ProtoAdapter_WelcomePageTextStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String description;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String image_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer page_num;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String title;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<WelcomePageTextStruct, Builder> {
        public String description;
        public String image_url;
        public Integer page_num;
        public String title;

        public final WelcomePageTextStruct build() {
            WelcomePageTextStruct welcomePageTextStruct = new WelcomePageTextStruct(this.page_num, this.title, this.description, this.image_url, super.buildUnknownFields());
            return welcomePageTextStruct;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final Builder image_url(String str) {
            this.image_url = str;
            return this;
        }

        public final Builder page_num(Integer num) {
            this.page_num = num;
            return this;
        }

        public final Builder title(String str) {
            this.title = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.WelcomePageTextStruct$ProtoAdapter_WelcomePageTextStruct */
    static final class ProtoAdapter_WelcomePageTextStruct extends DefaultValueProtoAdapter<WelcomePageTextStruct> {
        public final WelcomePageTextStruct redact(WelcomePageTextStruct welcomePageTextStruct) {
            return welcomePageTextStruct;
        }

        public ProtoAdapter_WelcomePageTextStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, WelcomePageTextStruct.class);
        }

        public final WelcomePageTextStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (WelcomePageTextStruct) null);
        }

        public final int encodedSize(WelcomePageTextStruct welcomePageTextStruct) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, welcomePageTextStruct.page_num) + ProtoAdapter.STRING.encodedSizeWithTag(2, welcomePageTextStruct.title) + ProtoAdapter.STRING.encodedSizeWithTag(3, welcomePageTextStruct.description) + ProtoAdapter.STRING.encodedSizeWithTag(4, welcomePageTextStruct.image_url) + welcomePageTextStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, WelcomePageTextStruct welcomePageTextStruct) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, welcomePageTextStruct.page_num);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, welcomePageTextStruct.title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, welcomePageTextStruct.description);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, welcomePageTextStruct.image_url);
            protoWriter.writeBytes(welcomePageTextStruct.unknownFields());
        }

        public final WelcomePageTextStruct decode(ProtoReader protoReader, WelcomePageTextStruct welcomePageTextStruct) throws IOException {
            Builder builder;
            WelcomePageTextStruct welcomePageTextStruct2 = (WelcomePageTextStruct) C10938a.m32097a().mo26425a(WelcomePageTextStruct.class, welcomePageTextStruct);
            if (welcomePageTextStruct2 != null) {
                builder = welcomePageTextStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.page_num((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.description((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.image_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (welcomePageTextStruct2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getDescription() throws NullValueException {
        if (this.description != null) {
            return this.description;
        }
        throw new NullValueException();
    }

    public final String getImageUrl() throws NullValueException {
        if (this.image_url != null) {
            return this.image_url;
        }
        throw new NullValueException();
    }

    public final Integer getPageNum() throws NullValueException {
        if (this.page_num != null) {
            return this.page_num;
        }
        throw new NullValueException();
    }

    public final String getTitle() throws NullValueException {
        if (this.title != null) {
            return this.title;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.page_num = this.page_num;
        builder.title = this.title;
        builder.description = this.description;
        builder.image_url = this.image_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.page_num != null) {
            i = this.page_num.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.title != null) {
            i2 = this.title.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.description != null) {
            i3 = this.description.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.image_url != null) {
            i5 = this.image_url.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.page_num != null) {
            sb.append(", page_num=");
            sb.append(this.page_num);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (this.image_url != null) {
            sb.append(", image_url=");
            sb.append(this.image_url);
        }
        StringBuilder replace = sb.replace(0, 2, "WelcomePageTextStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WelcomePageTextStruct)) {
            return false;
        }
        WelcomePageTextStruct welcomePageTextStruct = (WelcomePageTextStruct) obj;
        if (!unknownFields().equals(welcomePageTextStruct.unknownFields()) || !Internal.equals(this.page_num, welcomePageTextStruct.page_num) || !Internal.equals(this.title, welcomePageTextStruct.title) || !Internal.equals(this.description, welcomePageTextStruct.description) || !Internal.equals(this.image_url, welcomePageTextStruct.image_url)) {
            return false;
        }
        return true;
    }

    public WelcomePageTextStruct(Integer num, String str, String str2, String str3) {
        this(num, str, str2, str3, ByteString.EMPTY);
    }

    public WelcomePageTextStruct(Integer num, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.page_num = num;
        this.title = str;
        this.description = str2;
        this.image_url = str3;
    }
}
