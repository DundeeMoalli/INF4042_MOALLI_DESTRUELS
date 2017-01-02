package com.example.dunde.lapplicationdelamortquitue;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity {


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_video);
                VideoView videoView =(VideoView)findViewById(R.id.videoView);
                MediaController mediaController= new MediaController(this);
                mediaController.setAnchorView(videoView);
                Uri uri=Uri.parse("rtsp://r2---sn-4g5edn7s.googlevideo.com/Cj0LENy73wIaNAmmBTCVeGHVRRMYDSANFC12VWVYMOCoAUIASARg9KbJoffHlYNYigELMXVWaDFFRWFJMVEM/731F3261A51947D17AB6B2DB3237C4877A597684.DF2DFF7AB137AFE763343627721C4DCBF991F24B/yt6/1/video.3gp");
                videoView.setMediaController(mediaController);
                videoView.setVideoURI(uri);
                videoView.requestFocus();
                videoView.start();
            }
        }


