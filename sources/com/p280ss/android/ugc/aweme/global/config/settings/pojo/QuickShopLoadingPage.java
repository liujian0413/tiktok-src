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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.QuickShopLoadingPage */
public final class QuickShopLoadingPage extends Message<QuickShopLoadingPage, Builder> {
    public static final DefaultValueProtoAdapter<QuickShopLoadingPage> ADAPTER = new ProtoAdapter_QuickShopLoadingPage();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String background_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String text_pic_url;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.QuickShopLoadingPage$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<QuickShopLoadingPage, Builder> {
        public String background_url;
        public String text_pic_url;

        public final QuickShopLoadingPage build() {
            return new QuickShopLoadingPage(this.background_url, this.text_pic_url, super.buildUnknownFields());
        }

        public final Builder background_url(String str) {
            this.background_url = str;
            return this;
        }

        public final Builder text_pic_url(String str) {
            this.text_pic_url = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.QuickShopLoadingPage$ProtoAdapter_QuickShopLoadingPage */
    static final class ProtoAdapter_QuickShopLoadingPage extends DefaultValueProtoAdapter<QuickShopLoadingPage> {
        public final QuickShopLoadingPage redact(QuickShopLoadingPage quickShopLoadingPage) {
            return quickShopLoadingPage;
        }

        public ProtoAdapter_QuickShopLoadingPage() {
            super(FieldEncoding.LENGTH_DELIMITED, QuickShopLoadingPage.class);
        }

        public final QuickShopLoadingPage decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (QuickShopLoadingPage) null);
        }

        public final int encodedSize(QuickShopLoadingPage quickShopLoadingPage) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, quickShopLoadingPage.background_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, quickShopLoadingPage.text_pic_url) + quickShopLoadingPage.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, QuickShopLoadingPage quickShopLoadingPage) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, quickShopLoadingPage.background_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, quickShopLoadingPage.text_pic_url);
            protoWriter.writeBytes(quickShopLoadingPage.unknownFields());
        }

        public final QuickShopLoadingPage decode(ProtoReader protoReader, QuickShopLoadingPage quickShopLoadingPage) throws IOException {
            Builder builder;
            QuickShopLoadingPage quickShopLoadingPage2 = (QuickShopLoadingPage) C10938a.m32097a().mo26425a(QuickShopLoadingPage.class, quickShopLoadingPage);
            if (quickShopLoadingPage2 != null) {
                builder = quickShopLoadingPage2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.background_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.text_pic_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (quickShopLoadingPage2 != null) {
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

    public final String getBackgroundUrl() throws NullValueException {
        if (this.background_url != null) {
            return this.background_url;
        }
        throw new NullValueException();
    }

    public final String getTextPicUrl() throws NullValueException {
        if (this.text_pic_url != null) {
            return this.text_pic_url;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.background_url = this.background_url;
        builder.text_pic_url = this.text_pic_url;
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
        if (this.background_url != null) {
            i = this.background_url.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.text_pic_url != null) {
            i3 = this.text_pic_url.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.background_url != null) {
            sb.append(", background_url=");
            sb.append(this.background_url);
        }
        if (this.text_pic_url != null) {
            sb.append(", text_pic_url=");
            sb.append(this.text_pic_url);
        }
        StringBuilder replace = sb.replace(0, 2, "QuickShopLoadingPage{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QuickShopLoadingPage)) {
            return false;
        }
        QuickShopLoadingPage quickShopLoadingPage = (QuickShopLoadingPage) obj;
        if (!unknownFields().equals(quickShopLoadingPage.unknownFields()) || !Internal.equals(this.background_url, quickShopLoadingPage.background_url) || !Internal.equals(this.text_pic_url, quickShopLoadingPage.text_pic_url)) {
            return false;
        }
        return true;
    }

    public QuickShopLoadingPage(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public QuickShopLoadingPage(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.background_url = str;
        this.text_pic_url = str2;
    }
}
