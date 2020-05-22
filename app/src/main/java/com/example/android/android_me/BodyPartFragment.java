package com.example.android.android_me;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {
    public BodyPartFragment() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_body_part, container, false);
        ImageView bodyPartImageView = view.findViewById(R.id.image_view_body_part);
        bodyPartImageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return view;
    }
}
