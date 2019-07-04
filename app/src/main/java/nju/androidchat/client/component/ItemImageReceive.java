package nju.androidchat.client.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.StyleableRes;

import com.bumptech.glide.Glide;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

import nju.androidchat.client.R;

public class ItemImageReceive extends LinearLayout {


    @StyleableRes
    int index0 = 0;

    private ImageView imageView;
    private Context context;
    private UUID messageId;
    private OnRecallMessageRequested onRecallMessageRequested;
    private String URL;

    public ItemImageReceive(Context context, String URL, UUID messageId) {
        super(context);
        this.context = context;
        inflate(context, R.layout.item_image_receive, this);
        this.imageView = findViewById(R.id.chat_item_content_img);
        this.messageId = messageId;
        setImgURL(URL);
    }

    public String getURL() {
        return this.URL;
    }

    public void setImgURL(String URL) {
        this.URL = URL;
        setURLImage(URL);
    }

    public void setURLImage(String url) {
        Glide.with(context).load(url).into(this.imageView);
    }

}