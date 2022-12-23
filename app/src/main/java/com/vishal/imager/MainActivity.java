package com.vishal.imager;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[]Path={"res/drawable/download.jpeg","res/drawable/download__1_.jpeg","res/drawable/download__2_.jpeg","res/drawable/download__3_.jpeg","res/drawable/download__4_","res/drawable/nationalgeographic_2572187_square.webp"};
    int index=0;

    public void DrawImage(int index)
    {
        int []location={R.drawable.download,R.drawable.download__1_,R.drawable.download__2_,R.drawable.download__3_,R.drawable.download__4_,R.drawable.nationalgeographic_2572187_square};

        ImageView imageView=findViewById(R.id.imageView);
        // imageView.setImageURI(Uri.parse(Path[index]));
        imageView.setImageResource(location[index]);
        Toast.makeText(this,Path[index],Toast.LENGTH_SHORT).show();
    }
    public  void btnNextOnClick(View v)
    {

        if(index<Path.length-1)
        {
            ++index;
            DrawImage(index);
        };

    };
public  void btnPreOnClick(View view)
{
    if(index>0)
    {
        --index;
        DrawImage(index);
    };
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}