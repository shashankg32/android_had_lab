package com.example.implicitintentsandimageswitcher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_implicit_intents_image_slid extends AppCompatActivity {

    private ImageSwitcher imageSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageSwitcher = findViewById(R.id.imageSwitcher);
        imageSwitcher.setFactory(() -> {
            ImageView imageView = new ImageView(getApplicationContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return imageView;
        });

        ImageSwitcher.ImageSwitcherView view = (ImageSwitcher.ImageSwitcherView) imageSwitcher.getNextView();
        ((ImageView) view.getChildAt(0)).setImageResource(R.drawable.image1);

        imageSwitcher.setInAnimation(this, R.anim.slide_in_right);
        imageSwitcher.setOutAnimation(this, R.anim.slide_out_left);
    }

    public void openBrowser(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    public void openEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:example@example.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        intent.putExtra(Intent.EXTRA_TEXT, "Body");
        startActivity(Intent.createChooser(intent, "Send Email"));
    }

    public void showNextImage(View view) {
        ImageSwitcher.ImageSwitcherView nextView = (ImageSwitcher.ImageSwitcherView) imageSwitcher.getNextView();
        ((ImageView) nextView.getChildAt(0)).setImageResource(R.drawable.image2);
        imageSwitcher.showNext();
    }

    public void showPreviousImage(View view) {
        ImageSwitcher.ImageSwitcherView previousView = (ImageSwitcher.ImageSwitcherView) imageSwitcher.getPreviousView();
        ((ImageView) previousView.getChildAt(0)).setImageResource(R.drawable.image1);
        imageSwitcher.showPrevious();
    }
}
