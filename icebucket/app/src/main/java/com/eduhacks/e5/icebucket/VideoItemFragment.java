package com.eduhacks.e5.icebucket;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.eduhacks.e5.icebucket.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

/**
 * Created by nhann on 30-Sep-17.
 */

public class VideoItemFragment extends Fragment {
    public static final String YOUTUBE_API_KEY = "AIzaSyDDvwDcm_ZKcuvJdyKYWBkuHCrex09ldW0";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.video_item_view, container, false);

        YouTubePlayerSupportFragment youTubeFragment = YouTubePlayerSupportFragment.newInstance();
        youTubeFragment.initialize(YOUTUBE_API_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.cueVideo("P3MBQciFeHo");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(getContext(), "init failed for YouTube", Toast.LENGTH_SHORT).show();
            }
        });

        getFragmentManager().beginTransaction().add(R.id.video_item_youtube_player, youTubeFragment).commit();
        return rootView;
    }
}
